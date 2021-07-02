package com.affaince.benefit.scheme;

import sun.tools.jstat.Operator;

public class ConstantValueExpression<L,R> extends Expression<L,R> {

    public ConstantValueExpression(Operator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }
}
