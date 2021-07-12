package com.affaince.benefit.scheme;


import java.util.function.BiFunction;

public class StringComparisonExpression<L extends Expression,R extends Expression ,P extends Expression> extends Expression <L,R,P> {
    public StringComparisonExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

    protected Expression<L, R, P> obtainExpressionValue(Expression exp){
        Expression<L,R,P> lhsValue=null;
        if(exp instanceof VariableExpression){
            lhsValue = ((VariableExpression)exp).apply();
        }else if (exp instanceof UnaryExpression){
            lhsValue=exp;
        }else{
            lhsValue = obtainExpressionValue((ArithmeticExpression)exp);
        }
        return lhsValue;
    }
    private P executeBiFunction(BiFunction<Expression,Expression,Expression> biFunction){
        Expression<L,R,P> lValue = obtainExpressionValue(getLeftHandSide());
        Expression<L,R,P> rValue = obtainExpressionValue(getRightHandSide());
        return (P)biFunction.apply(lValue, rValue);
    }
    public P apply(){
        switch (this.getOperator()){
            case EQUALTO:
                BiFunction<Expression,Expression,Expression> equalTo = (a,b) -> new UnaryExpression(a.apply().toString().equals(b.apply().toString())) ;
                return (P)executeBiFunction(equalTo);
            case NOTEQUALTO:
                BiFunction<Expression,Expression,Expression> notEqualTo = (a,b) -> new UnaryExpression(!(a.apply().toString().equals(b.apply().toString()))) ;
                return (P)executeBiFunction(notEqualTo);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
