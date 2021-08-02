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
            Object variableValue = expression.getRightHandSide().apply();
            UnaryExpression valueExpression = new UnaryExpression(variableValue);
            expression.setRightHandSide(valueExpression);
            updateAllVariableReferences(variableName,valueExpression);
            benefitSchemeContext.addToInputVariables(variableName, variableValue);
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
