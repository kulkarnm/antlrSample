package com.affaince.benefit.scheme;


public class UnaryExpression<L> extends Expression<L,L,L>  {
    public UnaryExpression(L variableValue) {
        super(null,variableValue,null);
    }

    public L apply() {
        return getLeftHandSide();
    }
}
