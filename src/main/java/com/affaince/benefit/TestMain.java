package com.affaince.benefit;

import com.affaince.benefit.compiler.BenefitsCompiler;
import com.affaince.benefit.context.MetricsContext;
import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.Scheme;
import com.affaince.benefit.scheme.expressions.*;
import com.affaince.vo.EligibilityExpressionOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {
        execute();
    }

    public static void execute() {

 /*       String str5 = " given \n" +
                "\t VALUE_PER_POINT = 10	;\n" +
        "\t NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS as input ;\n" +
        "\t NUMBER_OF_RENEWALS as input ;\n" +
        "\t TOTAL_DELIVERIES as input ;\n" +
        "\t compute \n" +
        "\t         BENEFIT_COUNT = NUMBER_OF_RENEWALS / (NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS > 0 ? NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS : 1) ;\n" +
        "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT	;\n" +
        "\t eligibleWhen \n" +
        "\t NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS < 3	;\n" +
        "\t pay BENEFIT_VALUE \n" +
        "\t after 1 / 4, 1 / 2, 3 / 4  of TOTAL_DELIVERIES in default proportion ;\n" ;*/

/*
        String str4 = " given \n" +
        "\t VALUE_PER_POINT = 10 ;\n" +
        "\t PRODUCT_SUBSCRIPTION_COUNT_PER_SUBSCRIPTION[] as input ;\n" +
        "\t PRODUCT_ID as input ;\n" +
        "\t \n" +
        "\t compute\n" +
        "\t         BENEFIT_COUNT = sumOf each PRODUCT_SUBSCRIPTION_COUNT_PER_SUBSCRIPTION ;\n" +
        "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT ;\n" +
        "\t \n" +
        "\t eligibleWhen \n" +
        "\t PRODUCT_ID == \"Product1\" ;\n" +
        "\t \n" +
        "\t pay BENEFIT_VALUE \n" +
        "\t after 1/4, 1/2, 3/4  of TOTAL_DELIVERIES in default proportion ;" ;
*/


        String str3 = "given \n" +
        "\t VALUE_PER_POINT = 100 ;\n" +
        "\t SUBSCRIPTION_RENEWAL_COUNT as input ;\n" +
        "\t SUBSCRIPTION_PERIOD[] as input ;\n" +
        "\t TOTAL_DELIVERIES as input ;\n" +
        "\t compute \n" +
        "\t         BENEFIT_COUNT = SUBSCRIPTION_RENEWAL_COUNT ;\n" +
        "\t BENEFIT_VALUE = SUBSCRIPTION_RENEWAL_COUNT * VALUE_PER_POINT ;\n" +
        "\t eligibleWhen    \n" +
        "\t SUBSCRIPTION_RENEWAL_COUNT > 3 and \n" +
        "\t each SUBSCRIPTION_PERIOD >= 8 ;\n" +
        "\t pay BENEFIT_VALUE \n" +
        "\t after 1 / 4, 1 / 2, 3 / 4  of TOTAL_DELIVERIES in 2:3:4 proportion ;";


/*        String str = "given \n" +
                "\t UNIT_SUBSCRIPTION_VALUE = 1000 ;\n" +
                "\t UNIT_PERIOD_MONTH = 2 ;\n" +
                "\t VALUE_PER_POINT = 1 ;\n" +
                "\t SUBSCRIPTION_VALUE as input ;\n" +
                "\t SUBSCRIPTION_PERIOD as input ;\n" +
                "\t compute \n" +
                "\t RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;\n" +
                "\t RESULT2= SUBSCRIPTION_PERIOD / UNIT_PERIOD_MONTH ;\n" +
                "\t BENEFIT_COUNT = RESULT1*RESULT2 ;\n" +
                "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT ;\n" +
                "\t eligibleWhen	\n" +
                "\t SUBSCRIPTION_VALUE > 20000 and\n" +
                "\t SUBSCRIPTION_VALUE < 30000 and\n" +
                "\t SUBSCRIPTION_PERIOD >= 10 ;\n" +
                "\t pay BENEFIT_VALUE\n" +
                "\t after 1 / 4, 1 / 2, 3 / 4  of TOTAL_DELIVERIES in default proportion ;";*/

/*
        String str = "given \n" +
                "\t VALUE_PER_POINT = 10 ;\n" +
                "\t SUBSCRIPTION_RENEWAL_COUNT as input ;\n" +
                "\t SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION [] as input ;\n" +
                "\t compute \n" +
                "\t BENEFIT_COUNT = SUBSCRIPTION_RENEWAL_COUNT ;\n" +
                "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT ;\n" +
                "\t TOTAL_SUBSCRIPTION_PERIOD =sumOf each SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION ;\n" +
                "\t eligibleWhen    \n" +
                "\t SUBSCRIPTION_RENEWAL_COUNT > 3 and \n" +
                "\t each SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION >= 8 and  \n" +
                "\t TOTAL_SUBSCRIPTION_PERIOD > 28	;\n" +
                "\t pay BENEFIT_VALUE   \n" +
                "\t after 1 / 4, 1 / 2, 3 / 4  of TOTAL_DELIVERIES in default proportion ;";
*/

        BenefitsCompiler compiler = new BenefitsCompiler();
        Scheme scheme = compiler.parseSchemeString(str3);

        Expression eligibilityExpression = scheme.getEligibilityUnit().getExpression();
        //preExpression will never occur in case of eligibility expression
        //Expression preExpression = eligibilityExpression.getPreExpression();
        List<EligibilityExpressionOutput> outputs = processEligibilityExpression(eligibilityExpression);
        for(EligibilityExpressionOutput output:outputs){
            System.out.println("Name: " + output.getMetricName());
            System.out.println("value : " + output.getValue());
            System.out.println("type: " + output.getValueType());
            System.out.println("operator:  " + output.getOperator());
        }



 /*       List<Integer> list= new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        MetricsContext context= new MetricsContext();
        context.addToSubscriberMetrics("SUBSCRIPTION_RENEWAL_COUNT",5);
        context.addToSubscriberMetrics("SUBSCRIPTION_PERIOD",list);
        context.addToSubscriberMetrics("TOTAL_DELIVERIES",12);
        BenefitSchemeContext benefitSchemeContext2 = new BenefitsCompiler().compile(scheme,context);*/
        //print(benefitSchemeContext2);


    }

    public static List<EligibilityExpressionOutput> processEligibilityExpression(Expression eligibilityExpression){
        Expression lhs = eligibilityExpression.getLeftHandSide();
        Expression rhs= eligibilityExpression.getRightHandSide();
        ArithmeticOperator operator = eligibilityExpression.getOperator();
        List<EligibilityExpressionOutput> outputs = new ArrayList<>();
        if(operator == ArithmeticOperator.AND) { // it means there are more than one expression, ignore RHS
            List<ArithmeticComparisonExpression> value =(List<ArithmeticComparisonExpression>) ((UnaryExpression)lhs).getValue();
            for(ArithmeticComparisonExpression comparisonExpression: value){
                Expression lhsOfComparison = comparisonExpression.getLeftHandSide();
                Expression rhsOfComparison = comparisonExpression.getRightHandSide();
                ArithmeticOperator operatorOfComparison = comparisonExpression.getOperator();
                //lhs is always going to be a string
                String metricName = lhsOfComparison.getLeftHandSide().apply().toString();
                Object rhsValue = rhsOfComparison.apply();
                UnaryType valueType = ((UnaryExpression)rhsOfComparison).getType();
                EligibilityExpressionOutput output = new EligibilityExpressionOutput(metricName,rhsValue,valueType,operatorOfComparison);
                outputs.add(output);
            }
        }
        return outputs;
    }
    public static void print(BenefitSchemeContext benefitSchemeContext) {
        System.out.println("***********LETS GO THROUGH INPUT,COMPUTED AND OUTPUT VALUES**********");
        System.out.println("***********************INPUT VALUES**********************************");
        Map<String, Object> inputVariables = benefitSchemeContext.getBenefitInputContext().getInputVariables();
        for (Map.Entry<String, Object> inputEntry : inputVariables.entrySet()) {
            System.out.print(" Input field: " + inputEntry.getKey());
            System.out.println(" input value: " + inputEntry.getValue());
        }
        System.out.println("***********************END - INPUT VALUES**********************************");
        System.out.println("***********************OUTPUT VALUES**********************************");
        BenefitSchemeContext.BenefitOutputContext outputContext = benefitSchemeContext.getBenefitOutputContext();
        System.out.println("Is account eligible for the benefit? :" + outputContext.getEligibleForScheme());
        System.out.println("total benefit value : " + outputContext.getBenefitValue());
        System.out.println("is vesting BEFORE stated delivery number?: " + outputContext.isBefore());
        System.out.println("benefit points vesting distribution list");
        List<BenefitSchemeContext.BenefitOutputContext.BenefitVestingDistribution> benefitVestingDistributionList = outputContext.getBenefitVestingDistributionList();
        for (BenefitSchemeContext.BenefitOutputContext.BenefitVestingDistribution distribution : benefitVestingDistributionList) {
            System.out.print(" BEFORE/AFTER " + distribution.getDeliveryNumber() + " delivery,");
            System.out.println(" Vest " + distribution.getBenefitValueToBeVested() + " points");
        }
    }
}
