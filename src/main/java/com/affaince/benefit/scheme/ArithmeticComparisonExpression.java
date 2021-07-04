package com.affaince.benefit.scheme;


import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ArithmeticComparisonExpression<L extends Expression,R extends Expression ,P extends Boolean> extends Expression <Expression,Expression,Boolean> {
    public ArithmeticComparisonExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

    protected <T> T obtainExpressionValue(Expression exp){
        T lhsValue=null;
        if(exp instanceof VariableExpression){
            lhsValue = (T)((VariableExpression)exp).apply();
        }else{
            lhsValue = obtainExpressionValue((ArithmeticExpression)exp);
        }
        return lhsValue;
    }
    private <T> Boolean executeBiFunction(BiFunction<T,Number,Boolean> biFunction){
        T lValue = obtainExpressionValue(getLeftHandSide());
        Number rValue = obtainExpressionValue(getRightHandSide());
        return biFunction.apply(lValue, rValue);
    }
    public Boolean apply(){
        switch (this.getOperator()){
            case EQUALTO:
                BiFunction<Number,Number,Boolean> equalTo = (a,b) -> a.doubleValue() == b.doubleValue() ;
                return executeBiFunction(equalTo);
            case LOOPEQUALTO:
                BiFunction<List<Number>,Number,Boolean> equalityInLoop =  (a,b)->a.stream().allMatch(i-> i.doubleValue() == b.doubleValue());
                return executeBiFunction(equalityInLoop);
            case GREATERTHAN:
                BiFunction<Number,Number,Boolean> greaterThan = (a,b) -> a.doubleValue() > b.doubleValue() ;
                return executeBiFunction(greaterThan);
            case LOOPGREATERTHAN:
                BiFunction<List<Number>,Number,Boolean> greaterThanInLoop =  (a,b)->a.stream().allMatch(i-> i.doubleValue() > b.doubleValue());
                return executeBiFunction(greaterThanInLoop);
            case GREATERTHANEQUALTO:
                BiFunction<Number,Number,Boolean> greaterThanEqualTo = (a,b) -> a.doubleValue() >= b.doubleValue() ;
                return executeBiFunction(greaterThanEqualTo);
            case LOOPGREATERTHANEQUALTO:
                BiFunction<List<Number>,Number,Boolean> greaterThanEqualToInLoop =  (a,b)->a.stream().allMatch(i-> i.doubleValue() >= b.doubleValue());
                return executeBiFunction(greaterThanEqualToInLoop);
            case LESSTHAN:
                BiFunction<Number,Number,Boolean> lessThan = (a,b) -> a.doubleValue() < b.doubleValue() ;
                return executeBiFunction(lessThan);
            case LOOPLESSTHAN:
                BiFunction<List<Number>,Number,Boolean> lessThanInLoop =  (a,b)->a.stream().allMatch(i-> i.doubleValue() < b.doubleValue());
                return executeBiFunction(lessThanInLoop);
            case LESSTHANEQUALTO:
                BiFunction<Number,Number,Boolean> lessThanEqualTo = (a,b) -> a.doubleValue() <= b.doubleValue() ;
                return executeBiFunction(lessThanEqualTo);
            case LOOPLESSTHANEQUALTO:
                BiFunction<List<Number>,Number,Boolean> lessThanEqualToInLoop =  (a,b)->a.stream().allMatch(i-> i.doubleValue() <= b.doubleValue());
                return executeBiFunction(lessThanEqualToInLoop);
            case NOTEQUALTO:
                BiFunction<Number,Number,Boolean> notEqualTo = (a,b) -> a.doubleValue() != b.doubleValue() ;
                return executeBiFunction(notEqualTo);
            case LOOPNOTEQUALTO:
                BiFunction<List<Number>,Number,Boolean> notEqualToInLoop =  (a,b)->a.stream().allMatch(i-> i.doubleValue() != b.doubleValue());
                return executeBiFunction(notEqualToInLoop);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
