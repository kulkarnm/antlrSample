package com.affaince.benefit.scheme;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.lang.Double;

public class ArithmeticExpression<L extends Expression,R extends Expression ,P extends Number> extends Expression<L,R,P> {
    public ArithmeticExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

    protected Number obtainExpressionValueAsNumber(Expression exp){
        Number lhsValue=null;
        if(exp instanceof VariableExpression){
            lhsValue = (Number)((VariableExpression)exp).apply();
        }else{
            lhsValue = obtainExpressionValueAsNumber((ArithmeticExpression)exp);
        }
        return lhsValue;
    }
    private Number executeBiFunction(BiFunction<Number,Number,Number> biFunction){
        Number lValue = obtainExpressionValueAsNumber(getLeftHandSide());
        Number rValue = obtainExpressionValueAsNumber(getRightHandSide());
        return biFunction.apply(lValue, rValue);
    }

    protected List<Number> obtainExpressionValueAsListOfNumbers(Expression exp){
        List<Number> lhsValue=null;
        if(exp instanceof VariableExpression){
            lhsValue = (List<Number>)((VariableExpression)exp).apply();
        }else{
            lhsValue = obtainExpressionValueAsListOfNumbers((ArithmeticExpression)exp);
        }
        return lhsValue;
    }
    private Number executeFunction(Function<List<Number>,Double> function){
        List<Number> lValue = obtainExpressionValueAsListOfNumbers(getLeftHandSide());
        //Number rValue = obtainExpressionValue(getRightHandSide());
        return function.apply(lValue);
    }

    public P apply(){
        switch (this.getOperator()){
            case ADDITION:
                BiFunction<Number,Number,Number> add =  (a,b) -> a.doubleValue() + b.doubleValue() ;
                return (P) executeBiFunction(add);
            case LOOPADDITION:
                Function<List<Number>,Double> addInLoop =  (a)->a.stream().mapToDouble(i->i.doubleValue()).sum();
                return (P)executeFunction(addInLoop);
            case SUBTRACTION:
                BiFunction<Number,Number,Number> sub = (a, b) -> a.doubleValue() - b.doubleValue() ;
                return (P)executeBiFunction(sub);
            case DIVISION:
                BiFunction<Number,Number,Number> div =  (a,b) -> a.doubleValue() / b.doubleValue() ;
                return (P)executeBiFunction(div);
            case MULTIPLICATION:
                BiFunction<Number,Number,Number> mul =  (a,b) -> a.doubleValue() * b.doubleValue() ;
                return (P)executeBiFunction(mul);
            case MODULUS:
                BiFunction<Number,Number,Number> mod = (a,b) -> a.doubleValue() % b.doubleValue() ;
                return (P)executeBiFunction(mod);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
