package com.affaince.benefit.scheme;

public class VariableExpression<String,R extends Expression> extends Expression<String,R,R>  {
    public VariableExpression(String variableName,R variable) {
        super(null,variableName,variable);
    }

    public R apply() {
            return getRightHandSide();
    }
}
