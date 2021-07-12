package com.affaince.benefit.scheme;


public class VariableExpression<L extends String,R> extends Expression<L,R,R>  {
    public VariableExpression(L variableName,R variable) {
        super(null,variableName,variable);
    }

    public R apply() {
        return getRightHandSide();
    }
}
