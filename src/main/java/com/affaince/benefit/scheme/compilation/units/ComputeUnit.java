package com.affaince.benefit.scheme.compilation.units;

import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.expressions.Expression;
import com.affaince.benefit.scheme.expressions.UnaryExpression;
import com.affaince.benefit.scheme.expressions.VariableExpression;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@JsonIdentityInfo(generator= ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class ComputeUnit {
    private List<Expression> expressionQueue;

    public ComputeUnit() {
        this.expressionQueue = new ArrayList<>();
    }

    public void addExpression(Expression expression) {
        this.expressionQueue.add(expression);
    }

    private Expression updateVariablesUsedInUnit(Expression sourceExpression, Expression updatedExpression){
        if(null != sourceExpression && sourceExpression instanceof VariableExpression){
            boolean isFound = sourceExpression.getLeftHandSide().apply().toString().equals(updatedExpression.getLeftHandSide().apply().toString());
            if(isFound){
                return updatedExpression;
            }
        }else if(null != sourceExpression && sourceExpression instanceof List<?>){
            List<?> rhs = (List<?>)sourceExpression;
            for(Object rhsObj : rhs){
                if( rhsObj instanceof Expression){
                    updateVariablesUsedInUnit((Expression)rhsObj,updatedExpression);
                }
            }
        }else {
            if(null != sourceExpression) {
                Expression lhs = sourceExpression.getLeftHandSide();
                Expression result = updateVariablesUsedInUnit(lhs, updatedExpression);
                if(null != result){
                    sourceExpression.setLeftHandSide(result);
                }
                Expression rhs = sourceExpression.getRightHandSide();
                result = updateVariablesUsedInUnit(rhs, updatedExpression);
                if(null != result){
                    sourceExpression.setRightHandSide(result);
                }
                Expression pre = sourceExpression.getPreExpression();
                result = updateVariablesUsedInUnit(pre,updatedExpression);
                if(null != result){
                    sourceExpression.setPreExpression(result);
                }
            }
        }
        return null;
    }
    public void updateExpression(Expression updatedExpression){
        for(Expression expression: expressionQueue) {
            expression = updateVariablesUsedInUnit(expression, updatedExpression);
        }
    }
    public List<Expression> getExpressionQueue() {
        return expressionQueue;
    }

    public void execute(BenefitSchemeContext benefitSchemeContext) {
        for (Expression expression : expressionQueue) {
            String variableName = (String) expression.getLeftHandSide().getLeftHandSide().apply();
            Object variableValue = expression.getRightHandSide().apply();
            UnaryExpression valueExpression = new UnaryExpression(variableValue,UnaryExpression.obtainUnaryType(variableValue.getClass()));
            expression.setRightHandSide(valueExpression);
            updateAllVariableReferences(variableName,valueExpression);
            //benefitSchemeContext.addToInputVariables(variableName, variableValue);
            benefitSchemeContext.addToComputeVariables(variableName,variableValue);
        }
    }

    public void updateAllVariableReferences(String variableName, Expression expression) {
        for (Expression variableExpression : this.getExpressionQueue()) {
            Expression foundExpression = searchVariableNameInExpression(variableName, variableExpression);
            if(null != foundExpression){
                foundExpression.setRightHandSide(expression);
            }
        }
    }

    public Expression searchVariableExpression(String variableName) {
        List<Expression> variableExpressionsQueue = this.getExpressionQueue();
        for (Expression expression : variableExpressionsQueue) {
            Expression foundExpression =searchVariableNameInExpression(variableName,expression);
            if(null!=foundExpression){
                return foundExpression;
            }
        }
        return null;
    }

    private Expression searchVariableNameInExpression(String variableName,Expression expression){
        if(null != expression) {
            if (expression instanceof VariableExpression) {
                if (((String) expression.getLeftHandSide().apply()).equals(variableName)) {
                    return expression;
                }
            } else {
                Expression foundExpression = searchVariableNameInExpression(variableName, expression.getLeftHandSide());
                if (null != foundExpression) {
                    return foundExpression;
                } else {
                    foundExpression = searchVariableNameInExpression(variableName, expression.getRightHandSide());
                    return foundExpression;
                }
            }
        }
        return null;
    }
}
