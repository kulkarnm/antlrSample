package com.affaince.benefit.scheme;
import java.lang.reflect.ParameterizedType;

public abstract class Expression {
    private ArithmeticOperator operator;
    private Expression leftHandSide;
    private Expression rightHandSide;
    private Expression preExpression; //just for ternary


    public Expression(ArithmeticOperator operator, Expression leftHandSide, Expression rightHandSide) {
        this.operator = operator;
        this.leftHandSide = leftHandSide;
        this.rightHandSide = rightHandSide;
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

    public void setLeftHandSide(Expression leftHandSide) {
        this.leftHandSide = leftHandSide;
    }

    public void setRightHandSide(Expression rightHandSide) {
        this.rightHandSide = rightHandSide;
    }

    public abstract Object apply();

    public Class parameterizedType() {
        return (Class) ((ParameterizedType)
                this.getClass().getGenericInterfaces()[0])
                .getActualTypeArguments()[0];
    }

    @Override
    public String toString() {
        return "Expression{" +
                "operator=" + operator +
                ", leftHandSide=" + leftHandSide +
                ", rightHandSide=" + rightHandSide +
                ", preExpression=" + preExpression +
                '}';
    }
}
