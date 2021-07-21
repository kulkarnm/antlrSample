package com.affaince.benefit.scheme;


public class UnaryExpression extends Expression{
    public UnaryExpression(Object value) {
        super(value);
    }

    @Override
    public Object apply() {
        return this.getValue();
    }
}
