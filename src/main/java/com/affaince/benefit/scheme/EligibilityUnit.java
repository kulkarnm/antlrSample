package com.affaince.benefit.scheme;

import java.util.LinkedList;
import java.util.List;

public class EligibilityUnit {
    private LinkedList<Expression> expressionQueue;

    public EligibilityUnit() {
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
            if(!(Boolean)expression.apply()){
                benefitSchemeContext.setEligibleForScheme(false);
            }
        }
        benefitSchemeContext.setEligibleForScheme(true);
    }
}
