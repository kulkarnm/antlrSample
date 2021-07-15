package com.affaince.benefit.scheme;
import java.lang.reflect.ParameterizedType;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public abstract class Expression< L,R,P> {
    private ArithmeticOperator operator;
    private L leftHandSide;
    private R rightHandSide;
    private Expression<L,R,P> preExpression; //just for ternary

    public Expression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        this.operator = operator;
        this.leftHandSide = leftHandSide;
        this.rightHandSide = rightHandSide;
    }

    public ArithmeticOperator getOperator() {
        return operator;
    }

    public Expression<L, R, P> getPreExpression() {
        return preExpression;
    }

    public void setPreExpression(Expression<L, R, P> preExpression) {
        this.preExpression = preExpression;
    }

    public L getLeftHandSide() {
        return leftHandSide;
    }

    public R getRightHandSide() {
        return rightHandSide;
    }


    public abstract P apply();

    public Class parameterizedType() {
        return (Class) ((ParameterizedType)
                this.getClass().getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
    }
}
