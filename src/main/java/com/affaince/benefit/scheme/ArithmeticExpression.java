package com.affaince.benefit.scheme;


import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ArithmeticExpression extends Expression {
    public ArithmeticExpression(ArithmeticOperator operator, Expression leftHandSide, Expression rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

  /* protected Number obtainExpressionValue(Expression<L,R,Number> exp) {
        return exp.apply();
    }*/

    private Object executeBiFunction(BiFunction<Expression,Expression, ?> biFunction) {
        return biFunction.apply(getLeftHandSide(),getRightHandSide());
    }



    private Object executeFunction(Function<Expression,?> function) {
        return function.apply(getLeftHandSide());
    }

    public Object apply() {
        ArithmeticOperator arithmeticOperator = this.getOperator();
        switch (arithmeticOperator) {
            case ADDITION:
                BiFunction<Expression, Expression, ?> add = (a, b) -> (((Number)a.apply()).doubleValue() + ((Number)b.apply()).doubleValue());
                return executeBiFunction(add);
            case LOOPADDITION:
                Function<Expression,?> addInLoop = (a) -> ((List<Number>) a.apply()).stream().mapToDouble(i -> (i).doubleValue()).sum();
                return executeFunction(addInLoop);
            case SUBTRACTION:
                BiFunction<Expression, Expression, ?> sub = (a, b) -> ((Number)a.apply()).doubleValue() - ((Number)b.apply()).doubleValue();
                return executeBiFunction(sub);
            case DIVISION:
                BiFunction<Expression, Expression, ?> div = (a, b) -> ((Number)a.apply()).doubleValue() / ((Number)b.apply()).doubleValue();
                return executeBiFunction(div);
            case MULTIPLICATION:
                BiFunction<Expression, Expression, ?> mul = (a, b) -> ((Number)a.apply()).doubleValue() * ((Number)b.apply()).doubleValue();
                return executeBiFunction(mul);
            case MODULUS:
                BiFunction<Expression, Expression,?> mod = (a, b) -> ((Number)a.apply()).doubleValue() % ((Number)b.apply()).doubleValue();
                return executeBiFunction(mod);
          /*  case TERNARY:
                BiFunction<Expression, Expression, Expression> ternary=null;
                ArithmeticComparisonExpression<Expression<L,R,P>,Expression<L,R,P>,Q extends Boolean> conditionalExpression = (ArithmeticComparisonExpression<Expression<L,R,P>,Expression<L,R,P>,Q extends Boolean>)this.getPreExpression();
                
                ternary = (a, b) -> new UnaryExpression<>((Boolean)conditionalExpression.apply().apply() ? ((Number) a.apply()).doubleValue() : ((Number) b.apply()).doubleValue());
              *//*  if(this.getLeftHandSide().apply() instanceof Number) {
                    if(this.getRightHandSide().apply() instanceof  Number) {
                        ternary = (a, b) -> new UnaryExpression<>(conditionalExpression.apply().apply() ? ((Number) a.apply()).doubleValue() : ((Number) b.apply()).doubleValue());
                    }else if( this.getRightHandSide().apply() instanceof ArithmeticExpression){
                        ternary = (a, b) -> new UnaryExpression<>(conditionalExpression.apply().apply() ? ((Number) a.apply()).doubleValue() : ((ArithmeticExpression) b.apply()));
                    }
                }else if(this.getLeftHandSide().apply() instanceof ArithmeticExpression){
                    if(this.getRightHandSide().apply() instanceof  Number) {
                        ternary = (a, b) -> new UnaryExpression<>(conditionalExpression.apply().apply() ? ((ArithmeticExpression) a.apply()) : ((Number) b.apply()).doubleValue());
                    }else if( this.getRightHandSide().apply() instanceof ArithmeticExpression){
                        ternary = (a, b) -> new UnaryExpression<>(conditionalExpression.apply().apply() ? ((ArithmeticExpression) a.apply()) : ((ArithmeticExpression) b.apply()));
                    }
                }*//*
                return (P) executeBiFunction(ternary);*/

            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
