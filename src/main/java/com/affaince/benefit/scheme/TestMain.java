package com.affaince.benefit.scheme;

public class TestMain {
    public static void main(String[] args){
        // RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;
        double subscriptionValue = 10000;
        double unitSubscriptionValue = 1000;
        ArithmeticExpression<VariableExpression,VariableExpression> exp =
                new ArithmeticExpression<>(
                        ArithmeticOperator.DIVISION,
                        new VariableExpression<>(subscriptionValue),
                        new VariableExpression<>(unitSubscriptionValue));
        exp.apply().

    }
}
