package com.affaince.benefit.scheme;

public class VariableExpression extends Expression  {
    public VariableExpression(Expression variableName,Expression variable) {
        super(null,variableName,variable);
    }

    public Object apply() {
            return getRightHandSide().apply();
    }
}
