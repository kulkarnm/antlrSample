package com.affaince.benefit.scheme;


public class UnaryExpression extends Expression{
    private Object value;
    public UnaryExpression(Object value) {
        super(null,null,null);
        this.value=value;
    }

    @Override
    public Object apply() {
        return this.getValue();
    }
    public Object getValue() {
        return value;
    }
}
