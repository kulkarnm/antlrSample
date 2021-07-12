package com.affaince.benefit.scheme;


import java.util.function.BiFunction;

public class StringComparisonExpression<L extends Expression,R extends Expression ,P extends Boolean> extends Expression <L,R,P> {
    public StringComparisonExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

    protected String obtainExpressionValue(Expression exp){
        String lhsValue=null;
        if(exp instanceof VariableExpression){
            lhsValue = (String)((VariableExpression)exp).apply();
        }else{
            lhsValue = obtainExpressionValue((ArithmeticExpression)exp);
        }
        return lhsValue;
    }
    private Boolean executeBiFunction(BiFunction<String,String,Boolean> biFunction){
        String lValue = obtainExpressionValue(getLeftHandSide());
        String rValue = obtainExpressionValue(getRightHandSide());
        return biFunction.apply(lValue, rValue);
    }
    public P apply(){
        switch (this.getOperator()){
            case EQUALTO:
                BiFunction<String,String,Boolean> equalTo = (a,b) -> a.equals(b) ;
                return (P)executeBiFunction(equalTo);
            case NOTEQUALTO:
                BiFunction<String,String,Boolean> notEqualTo = (a,b) -> !(a.equals(b)) ;
                return (P)executeBiFunction(notEqualTo);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
