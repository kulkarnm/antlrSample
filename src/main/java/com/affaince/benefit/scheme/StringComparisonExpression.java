package com.affaince.benefit.scheme;


import java.util.function.BiFunction;

public class StringComparisonExpression extends Expression {
    public StringComparisonExpression(ArithmeticOperator operator, Expression leftHandSide, Expression rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }


    private Object executeBiFunction(BiFunction<Expression,Expression,?> biFunction){
        return biFunction.apply(getLeftHandSide(), getRightHandSide());
    }
    public Object apply(){
        switch (this.getOperator()){
            case EQUALTO:
                BiFunction<Expression,Expression,?> equalTo = (a,b) -> a.apply().toString().equals(b.apply().toString()) ;
                return executeBiFunction(equalTo);
            case NOTEQUALTO:
                BiFunction<Expression,Expression,?> notEqualTo = (a,b) ->!a.apply().toString().equals(b.apply().toString()) ;
                return executeBiFunction(notEqualTo);
            case AND:
                BiFunction<Expression,Expression,?> andTwoExpressions = (a,b)->((Boolean)a.apply()).booleanValue() && ((Boolean)b.apply()).booleanValue() ;
                return executeBiFunction(andTwoExpressions);
            case OR :
                BiFunction<Expression,Expression,?> orTwoExpressions = (a,b)->((Boolean)a.apply()).booleanValue() || ((Boolean)b.apply()).booleanValue() ;
                return executeBiFunction(orTwoExpressions);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
