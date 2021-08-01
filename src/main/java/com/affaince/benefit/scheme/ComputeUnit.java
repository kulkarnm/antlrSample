package com.affaince.benefit.scheme;

import java.util.LinkedList;
import java.util.List;

public class ComputeUnit {
    private LinkedList<Expression> expressionQueue;

    public ComputeUnit() {
        this.expressionQueue = new LinkedList<>();
    }

    public void addExpression(Expression expression) {
        this.expressionQueue.add(expression);
    }

    public Expression viewNextExpression() {
        return expressionQueue.peek();
    }

    public Expression getNextExpression() {
        return expressionQueue.poll();
    }

    public LinkedList<Expression> getExpressionQueue() {
        return expressionQueue;
    }

    public void execute(BenefitSchemeContext benefitSchemeContext) {
        for (Expression expression : expressionQueue) {
            String variableName = (String) expression.getLeftHandSide().getLeftHandSide().apply();
            Expression rightHandSideExpression = expression.getRightHandSide();
            //in case the expression contains variable which are just calculated in previous steps
            //then the corresponding variable expression should be updated with its calculated value

            Object variableValue = expression.getRightHandSide().apply();
            UnaryExpression valueExpression = new UnaryExpression(variableValue);
            expression.setRightHandSide(new UnaryExpression(variableValue));
            updateAllVariableReferences(variableName,valueExpression);
            benefitSchemeContext.addToInputVariables(variableName, variableValue);
        }
    }

    public void updateAllVariableReferences(String variableName, Expression expression) {
        for (Expression variableExpression : this.getExpressionQueue()) {
            Expression foundExpression = searchVariableExpressionByName(variableName, variableExpression);
            if(null != foundExpression){
                foundExpression.setRightHandSide(expression);
            }
        }
    }

    public Expression searchVariableExpressionByName(String variableName, Expression expression) {
        Expression foundVariable = null;
        if (null != expression) {
            if (expression instanceof VariableExpression) {
                if (((String) expression.getLeftHandSide().apply()).equals(variableName)) {
                    return expression;
                }
            }
            foundVariable = searchVariableExpressionByName(variableName, expression.getLeftHandSide());
            if (null == foundVariable) {
                foundVariable = searchVariableExpressionByName(variableName, expression.getRightHandSide());
            }
        }
        return foundVariable;
    }

    public Expression searchVariableExpression(String variableName) {
        List<Expression> variableExpressionsQueue = this.getExpressionQueue();
        for (Expression expression : variableExpressionsQueue) {
            String inputVariableName = (String) expression.getLeftHandSide().apply();
            if (null != inputVariableName && inputVariableName.equals(variableName)) {
                return expression;
            }
        }
        return null;
    }

}
