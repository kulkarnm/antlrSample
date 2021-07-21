package com.affaince.benefit.scheme;
import java.lang.reflect.ParameterizedType;

public abstract class Expression {
    private ArithmeticOperator operator;
    private Expression leftHandSide;
    private Expression rightHandSide;
    private Expression preExpression; //just for ternary
    private Object value;

    public Expression(ArithmeticOperator operator, Expression leftHandSide, Expression rightHandSide) {
        this.operator = operator;
        this.leftHandSide = leftHandSide;
        this.rightHandSide = rightHandSide;
    }
    public Expression(Object value){
        this.value=value;
    }
    public ArithmeticOperator getOperator() {
        return operator;
    }

    public Expression getPreExpression() {
        return preExpression;
    }

    public void setPreExpression(Expression preExpression) {
        this.preExpression = preExpression;
    }

    public Expression getLeftHandSide() {
        return leftHandSide;
    }

    public Expression getRightHandSide() {
        return rightHandSide;
    }

    public Object getValue() {
        return value;
    }

    public abstract Object apply();

    public Class parameterizedType() {
        return (Class) ((ParameterizedType)
                this.getClass().getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
    }
}
