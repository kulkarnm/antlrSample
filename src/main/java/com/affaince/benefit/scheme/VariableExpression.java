package com.affaince.benefit.scheme;


import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class VariableExpression<L> extends Expression<L,L,L>  {
    public VariableExpression(L variable) {
        super(null,variable,null);
    }

    public L apply() {
        return getLeftHandSide();
    }
}
