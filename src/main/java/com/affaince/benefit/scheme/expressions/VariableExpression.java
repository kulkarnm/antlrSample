package com.affaince.benefit.scheme.expressions;

public class VariableExpression extends Expression  {
    public VariableExpression(){super();}
    public VariableExpression(Expression variableName,Expression variable) {
        super(ArithmeticOperator.ASSIGN,variableName,variable);
    }

    public Object apply() {
            return getRightHandSide().apply();
    }
}
