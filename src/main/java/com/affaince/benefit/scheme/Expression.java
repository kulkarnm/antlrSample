package com.affaince.benefit.scheme;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public abstract class Expression< L,R,P> {
    private ArithmeticOperator operator;
    private L leftHandSide;
    private R rightHandSide;

    public Expression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        this.operator = operator;
        this.leftHandSide = leftHandSide;
        this.rightHandSide = rightHandSide;
    }

    public ArithmeticOperator getOperator() {
        return operator;
    }

    public L getLeftHandSide() {
        return leftHandSide;
    }

    public R getRightHandSide() {
        return rightHandSide;
    }


    public abstract P apply();
}
