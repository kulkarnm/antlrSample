package com.affaince.benefit.scheme;


import java.util.function.BiFunction;

public class ArithmeticComparisonExpression<L extends Expression,R extends Expression ,P extends Boolean> extends Expression <Expression,Expression,Boolean> {
    public ArithmeticComparisonExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

    protected Number obtainExpressionValue(Expression exp){
        Number lhsValue=null;
        if(exp instanceof VariableExpression){
            lhsValue = (Number)((VariableExpression)exp).apply();
        }else{
            lhsValue = obtainExpressionValue((ArithmeticExpression)exp);
        }
        return lhsValue;
    }
    private Boolean executeBiFunction(BiFunction<Number,Number,Boolean> biFunction){
        Number lValue = obtainExpressionValue(getLeftHandSide());
        Number rValue = obtainExpressionValue(getRightHandSide());
        return biFunction.apply(lValue, rValue);
    }
    public Boolean apply(){
        switch (this.getOperator()){
            case EQUALTO:
                BiFunction<Number,Number,Boolean> equalTo = (a,b) -> a.doubleValue() == b.doubleValue() ;
                return executeBiFunction(equalTo);
            case GREATERTHAN:
                BiFunction<Number,Number,Boolean> greaterThan = (a,b) -> a.doubleValue() > b.doubleValue() ;
                return executeBiFunction(greaterThan);
            case GREATERTHANEQUALTO:
                BiFunction<Number,Number,Boolean> greaterThanEqualTo = (a,b) -> a.doubleValue() >= b.doubleValue() ;
                return executeBiFunction(greaterThanEqualTo);
            case LESSTHAN:
                BiFunction<Number,Number,Boolean> lessThan = (a,b) -> a.doubleValue() < b.doubleValue() ;
                return executeBiFunction(lessThan);
            case LESSTHANEQUALTO:
                BiFunction<Number,Number,Boolean> lessThanEqualTo = (a,b) -> a.doubleValue() <= b.doubleValue() ;
                return executeBiFunction(lessThanEqualTo);
            case NOTEQUALTO:
                BiFunction<Number,Number,Boolean> notEqualTo = (a,b) -> a.doubleValue() != b.doubleValue() ;
                return executeBiFunction(notEqualTo);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
