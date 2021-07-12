package com.affaince.benefit.scheme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args){
        // RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;
        double subscriptionValue = 10000;
        double unitSubscriptionValue = 1000;
        UnaryExpression<Double> u1 = new UnaryExpression<Double>(subscriptionValue);
        UnaryExpression<Double> u2 = new UnaryExpression<Double>(unitSubscriptionValue);
        ArithmeticExpression<VariableExpression,VariableExpression,Number> exp =
                new ArithmeticExpression<>(
                        ArithmeticOperator.DIVISION,
                        new VariableExpression<>("subscriptionValue", u1),
                        new VariableExpression<>("unitSubscriptionValue",u2));
        System.out.println(exp.apply());
        List<Number> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        double num = 10;
        UnaryExpression<List<Number>> u3 = new UnaryExpression<>(list);
        UnaryExpression<Double> u4 = new UnaryExpression<Double>(num);
        ArithmeticComparisonExpression<VariableExpression,VariableExpression,Boolean> exp2 =
                new ArithmeticComparisonExpression<>(
                        ArithmeticOperator.LOOPLESSTHAN,
                        new VariableExpression<>("list", u3),
                        new VariableExpression<>("num",u4));
        System.out.println(exp2.apply());

        ArithmeticExpression<VariableExpression,VariableExpression,Number> exp3 =
                new ArithmeticExpression<>(
                        ArithmeticOperator.LOOPADDITION,
                        new VariableExpression<>("list",u3),
                        new VariableExpression<>(null,null));
        System.out.println(exp3.apply());

    }
}
