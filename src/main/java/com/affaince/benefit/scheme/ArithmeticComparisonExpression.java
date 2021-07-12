package com.affaince.benefit.scheme;


import java.util.List;
import java.util.function.BiFunction;

public class ArithmeticComparisonExpression<L extends Expression,R extends Expression ,P extends Expression> extends Expression <L,R,P> {
    public ArithmeticComparisonExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
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
                BiFunction<Expression,Expression,Expression> equalTo = (a,b) -> new UnaryExpression<>(((Number)a.apply()).doubleValue() == ((Number)b.apply()).doubleValue()) ;
                return (P)executeBiFunction(equalTo);
            case LOOPEQUALTO:
                BiFunction<Expression,Expression,Expression> equalityInLoop =  (a,b)->new UnaryExpression<>(((List<Number>)a.apply()).stream().allMatch(i-> i.doubleValue() == ((Number)b.apply()).doubleValue()));
                return (P)executeBiFunction(equalityInLoop);
            case GREATERTHAN:
                BiFunction<Expression,Expression,Expression> greaterThan = (a,b) -> new UnaryExpression<>(((Number)a.apply()).doubleValue() > ((Number)b.apply()).doubleValue() );
                return (P)executeBiFunction(greaterThan);
            case LOOPGREATERTHAN:
                BiFunction<Expression,Expression,Expression> greaterThanInLoop =  (a,b)->new UnaryExpression<>(((List<Number>)a.apply()).stream().allMatch(i-> i.doubleValue() > ((Number)b.apply()).doubleValue()));
                return (P)executeBiFunction(greaterThanInLoop);
            case GREATERTHANEQUALTO:
                BiFunction<Expression,Expression,Expression> greaterThanEqualTo = (a,b) -> new UnaryExpression<>(((Number)a.apply()).doubleValue() >= ((Number)b.apply()).doubleValue() );
                return (P)executeBiFunction(greaterThanEqualTo);
            case LOOPGREATERTHANEQUALTO:
                BiFunction<Expression,Expression,Expression> greaterThanEqualToInLoop =  (a,b)->new UnaryExpression<>(((List<Number>)a).stream().allMatch(i-> i.doubleValue() >= ((Number)b.apply()).doubleValue()));
                return (P)executeBiFunction(greaterThanEqualToInLoop);
            case LESSTHAN:
                BiFunction<Expression,Expression,Expression> lessThan = (a,b) -> new UnaryExpression<>(((Number)a.apply()).doubleValue() < ((Number)b.apply()).doubleValue() );
                return (P)executeBiFunction(lessThan);
            case LOOPLESSTHAN:
                BiFunction<Expression,Expression,Expression> lessThanInLoop =  (a,b)->new UnaryExpression<>(((List<Number>)a.apply()).stream().allMatch(i-> i.doubleValue() < ((Number)b.apply()).doubleValue()));
                return (P)executeBiFunction(lessThanInLoop);
            case LESSTHANEQUALTO:
                BiFunction<Expression,Expression,Expression> lessThanEqualTo = (a,b) -> new UnaryExpression<>(((Number)a.apply()).doubleValue() <= ((Number)b.apply()).doubleValue() );
                return (P)executeBiFunction(lessThanEqualTo);
            case LOOPLESSTHANEQUALTO:
                BiFunction<Expression,Expression,Expression> lessThanEqualToInLoop =  (a,b)->new UnaryExpression<>(((List<Number>)a.apply()).stream().allMatch(i-> i.doubleValue() <= ((Number)b.apply()).doubleValue()));
                return (P)executeBiFunction(lessThanEqualToInLoop);
            case NOTEQUALTO:
                BiFunction<Expression,Expression,Expression> notEqualTo = (a,b) -> new UnaryExpression<>(((Number)a.apply()).doubleValue() != ((Number)b.apply()).doubleValue() );
                return (P)executeBiFunction(notEqualTo);
            case LOOPNOTEQUALTO:
                BiFunction<Expression,Expression,Expression> notEqualToInLoop =  (a,b)->new UnaryExpression<>(((List<Number>)a.apply()).stream().allMatch(i-> i.doubleValue() != ((Number)b.apply()).doubleValue()));
                return (P)executeBiFunction(notEqualToInLoop);
            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
