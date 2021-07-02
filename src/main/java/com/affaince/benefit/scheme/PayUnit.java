package com.affaince.benefit.scheme;

import java.util.LinkedList;

public class PayUnit {
    private LinkedList<Expression> expressionQueue;

    public PayUnit() {
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
}
