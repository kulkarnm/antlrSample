package com.affaince.benefit.scheme;

import java.util.function.BiFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.UnaryOperator;
import java.lang.Double;

public class ArithmeticExpression<L extends Expression,R extends Expression ,P extends Number> extends Expression<Expression,Expression,Number> {
    public ArithmeticExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
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
    private Number executeBiFunction(BiFunction<Number,Number,Number> biFunction){
        Number lValue = obtainExpressionValue(getLeftHandSide());
        Number rValue = obtainExpressionValue(getRightHandSide());
        return biFunction.apply(lValue, rValue);
    }
    public Number apply(){
        switch (this.getOperator()){
            case ADDITION:
                BiFunction<Number,Number,Number> add =  (a, b) -> a.doubleValue() + b.doubleValue() ;
                return executeBiFunction(add);
            case SUBTRACTION:
                BiFunction<Number,Number,Number> sub = (a, b) -> a.doubleValue() - b.doubleValue() ;
                return executeBiFunction(sub);
            case DIVISION:
                BiFunction<Number,Number,Number> div =  (a,b) -> a.doubleValue() / b.doubleValue() ;
                return executeBiFunction(div);
            case MULTIPLICATION:
                BiFunction<Number,Number,Number> mul =  (a,b) -> a.doubleValue() * b.doubleValue() ;
                return executeBiFunction(mul);
            case MODULUS:
                BiFunction<Number,Number,Number> mod = (a,b) -> a.doubleValue() % b.doubleValue() ;
                return executeBiFunction(mod);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
