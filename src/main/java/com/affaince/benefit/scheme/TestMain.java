package com.affaince.benefit.scheme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args){
        // RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;
        double subscriptionValue = 10000;
        double unitSubscriptionValue = 1000;
        UnaryExpression u1 = new UnaryExpression(subscriptionValue);
        UnaryExpression u2 = new UnaryExpression(unitSubscriptionValue);
        ArithmeticExpression exp =
                new ArithmeticExpression(
                        ArithmeticOperator.DIVISION,
                        new VariableExpression(new UnaryExpression("subscriptionValue"), u1),
                        new VariableExpression(new UnaryExpression("unitSubscriptionValue"),u2));
        System.out.println(exp.apply());
        List<Number> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        double num = 6;
        UnaryExpression u3 = new UnaryExpression(list);
        UnaryExpression u4 = new UnaryExpression(num);
        ArithmeticComparisonExpression exp2 =
                new ArithmeticComparisonExpression(
                        ArithmeticOperator.LOOPLESSTHAN,
                        new VariableExpression(new UnaryExpression("list"), u3),
                        new VariableExpression(new UnaryExpression("num"),u4));
        System.out.println(exp2.apply());

        ArithmeticExpression exp3 =
                new ArithmeticExpression(
                        ArithmeticOperator.LOOPADDITION,
                        new VariableExpression(new UnaryExpression("list"),u3),
                        new VariableExpression(null,null));
        System.out.println(exp3.apply());
    }
}
