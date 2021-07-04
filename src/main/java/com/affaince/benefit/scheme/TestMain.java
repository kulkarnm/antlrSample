package com.affaince.benefit.scheme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args){
        // RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;
        double subscriptionValue = 10000;
        double unitSubscriptionValue = 1000;
        ArithmeticExpression<VariableExpression,VariableExpression,Number> exp =
                new ArithmeticExpression<>(
                        ArithmeticOperator.DIVISION,
                        new VariableExpression<>("subscriptionValue", subscriptionValue),
                        new VariableExpression<>("unitSubscriptionValue",unitSubscriptionValue));
        System.out.println(exp.apply());
        List<Number> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        double num = 10;

        ArithmeticComparisonExpression<VariableExpression,VariableExpression,Boolean> exp2 =
                new ArithmeticComparisonExpression<>(
                        ArithmeticOperator.LOOPLESSTHAN,
                        new VariableExpression<>("list", list),
                        new VariableExpression<>("num",num));
        System.out.println(exp2.apply());

        ArithmeticExpression<VariableExpression,VariableExpression,Number> exp3 =
                new ArithmeticExpression<>(
                        ArithmeticOperator.LOOPADDITION,
                        new VariableExpression<>("list",list),
                        new VariableExpression<>(null,null));
        System.out.println(exp3.apply());

    }
}
