package com.affaince.benefit.scheme;

import java.util.LinkedList;

public class GivenUnit {
    private LinkedList<Expression> expressionQueue;

    public GivenUnit() {
        this.expressionQueue = new LinkedList<>();
    }

    public void addExpression(Expression expression){
        this.expressionQueue.add(expression);
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
}
