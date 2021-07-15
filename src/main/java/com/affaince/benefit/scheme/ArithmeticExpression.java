package com.affaince.benefit.scheme;


import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArithmeticExpression<L extends Expression, R extends Expression, P extends Expression> extends Expression<L, R, P> {
    public ArithmeticExpression(ArithmeticOperator operator, L leftHandSide, R rightHandSide) {
        super(operator, leftHandSide, rightHandSide);
    }

    protected Expression<L, R, P> obtainExpressionValue(Expression exp) {
        Expression<L, R, P> lhsValue = null;
        if (exp instanceof VariableExpression) {
            lhsValue = ((VariableExpression) exp).apply();
        } else if (exp instanceof UnaryExpression) {
            lhsValue = exp;
        } else {
            lhsValue = obtainExpressionValue((ArithmeticExpression) exp);
        }
        return lhsValue;
    }

    private P executeBiFunction(BiFunction<Expression, Expression, Expression> biFunction) {
        Expression<L, R, P> lValue = obtainExpressionValue(getLeftHandSide());
        Expression<L, R, P> rValue = obtainExpressionValue(getRightHandSide());
        return (P) biFunction.apply(lValue, rValue);
    }

    /*
        protected List<Number> obtainExpressionValueAsListOfNumbers(Expression exp){
            List<Number> lhsValue=null;
            if(exp instanceof VariableExpression){
                lhsValue = (List<Number>)((VariableExpression)exp).apply();
            }else{
                lhsValue = obtainExpressionValueAsListOfNumbers((ArithmeticExpression)exp);
            }
            return lhsValue;
        }
    */
    private P executeFunction(Function<Expression, Expression> function) {
        Expression<L, R, P> lValue = obtainExpressionValue(getLeftHandSide());
        //Number rValue = obtainExpressionValue(getRightHandSide());
        return (P) function.apply(lValue);
    }

    public P apply() {
        switch (this.getOperator()) {
            case ADDITION:
                BiFunction<Expression, Expression, Expression> add = (a, b) -> new UnaryExpression(((Number) a.apply()).doubleValue() + ((Number) b.apply()).doubleValue());
                return executeBiFunction(add);
            case LOOPADDITION:
                Function<Expression, Expression> addInLoop = (a) -> new UnaryExpression<>(((List<Number>) a.apply()).stream().mapToDouble(i -> (i).doubleValue()).sum());
                return executeFunction(addInLoop);
            case SUBTRACTION:
                BiFunction<Expression, Expression, Expression> sub = (a, b) -> new UnaryExpression<>(((Number) a.apply()).doubleValue() - ((Number) b.apply()).doubleValue());
                return (P) executeBiFunction(sub);
            case DIVISION:
                BiFunction<Expression, Expression, Expression> div = (a, b) -> new UnaryExpression<>(((Number) a.apply()).doubleValue() / ((Number) b.apply()).doubleValue());
                return (P) executeBiFunction(div);
            case MULTIPLICATION:
                BiFunction<Expression, Expression, Expression> mul = (a, b) -> new UnaryExpression<>(((Number) a.apply()).doubleValue() * ((Number) b.apply()).doubleValue());
                return (P) executeBiFunction(mul);
            case MODULUS:
                BiFunction<Expression, Expression, Expression> mod = (a, b) -> new UnaryExpression<>(((Number) a.apply()).doubleValue() % ((Number) b.apply()).doubleValue());
                return (P) executeBiFunction(mod);
            case TERNARY:
                BiFunction<Expression, Expression, Expression> ternary=null;
                ArithmeticComparisonExpression<L,R,UnaryExpression<Boolean> > conditionalExpression = (ArithmeticComparisonExpression<L,R,UnaryExpression<Boolean>>)this.getPreExpression();
                if(this.getLeftHandSide().apply() instanceof Number) {
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
                }
                return (P) executeBiFunction(ternary);

            default:
                throw new IllegalStateException("Unexpected value: " + this.getOperator());
        }
    }

}
