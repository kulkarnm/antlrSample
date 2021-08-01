package com.affaince.benefit.scheme;

import java.util.LinkedList;
import java.util.List;

public class ComputeUnit {
    private LinkedList<Expression> expressionQueue;

    public ComputeUnit() {
        this.expressionQueue = new LinkedList<>();
    }

    public void addExpression(Expression expression){
        this.expressionQueue.add(expression);
    }

    public Expression viewNextExpression(){
        return expressionQueue.peek();
    }
    public Expression getNextExpression(){
        return expressionQueue.poll();
    }

    public LinkedList<Expression> getExpressionQueue() {
        return expressionQueue;
    }

    public void execute(BenefitSchemeContext benefitSchemeContext){
        for(Expression expression: expressionQueue){
            String variableName = (String)expression.getLeftHandSide().getLeftHandSide().apply();
            Object variableValue = expression.apply();
            benefitSchemeContext.addToInputVariables(variableName,variableValue);
        }
    }


    public Expression searchVariableExpression(String variableName) {
        List<Expression> variableExpressionsQueue = this.getExpressionQueue();
        for(Expression expression: variableExpressionsQueue){
            String inputVariableName= (String)expression.getLeftHandSide().apply();
            if(null != inputVariableName && inputVariableName.equals(variableName)){
                return expression;
            }
        }
        return null;
    }

}
