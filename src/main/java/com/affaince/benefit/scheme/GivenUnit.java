package com.affaince.benefit.scheme;

import java.util.LinkedList;
import java.util.List;

public class GivenUnit {
    private LinkedList<Expression> expressionQueue;

    public GivenUnit() {
        this.expressionQueue = new LinkedList<>();
    }

    public void addExpression(Expression expression){
        String variableName = expression.getLeftHandSide().apply().toString();
        boolean isAlreadyExist = expressionQueue.stream().anyMatch(exp->exp.getLeftHandSide().apply().toString().equals(variableName)) ;
        if(! isAlreadyExist) {
            this.expressionQueue.add(expression);
        }
    }

    public LinkedList<Expression> getExpressionQueue() {
        return expressionQueue;
    }

    public Expression viewNextExpression(){
        return expressionQueue.peek();
    }
    public Expression getNextExpression(){
        return expressionQueue.poll();
    }

    public void execute(BenefitSchemeContext benefitSchemeContext){
        for(Expression expression: expressionQueue){
            benefitSchemeContext.addToInputVariables((String)expression.getLeftHandSide().apply(),expression.apply());
        }
    }

    public Expression searchVariableExpression(String variableName) {
        List<Expression> variableExpressionsQueue = this.getExpressionQueue();
        for(Expression expression: variableExpressionsQueue){
            String inputVariableName= (String)expression.getLeftHandSide().apply();
            if(inputVariableName.equals(variableName)){
                return expression;
            }
        }
        return null;
    }


}
