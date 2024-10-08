package com.affaince.benefits;

import com.affaince.benefits.compiler.BenefitsCompiler;
import com.affaince.benefits.scheme.BenefitOutputContext;
import com.affaince.benefits.scheme.BenefitsProcessingContext;
import com.affaince.benefits.scheme.Scheme;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("IN MAIN");
        String benefitSchemeStr = getScheme();
        BenefitsProcessingContext benefitsProcessingContext = getInputs();

        execute(benefitSchemeStr,benefitsProcessingContext);
    }

    public static void execute(String benefitSchemeStr,BenefitsProcessingContext benefitsProcessingContext ){
        //Build scheme object form the scheme string
        BenefitsCompiler compiler = new BenefitsCompiler();
        //all the units are supplied with input values
        System.out.println("*****************");
        System.out.println(benefitSchemeStr);
        System.out.println("*****************");
        Scheme scheme = compiler.compile(benefitSchemeStr,benefitsProcessingContext);
        compiler.execute(scheme);
        BenefitOutputContext benefitOutputContext = scheme.getBenefitSchemeContext().getBenefitOutputContext() ;

    }
    public static String getScheme() {

    //example 1

       String str = " given \n" +
                "\t VALUE_PER_POINT = 10	;\n" +
        "\t NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS as input ;\n" +
        "\t NUMBER_OF_RENEWALS as input ;\n" +
        "\t TOTAL_DELIVERIES as input ;\n" +
        "\t compute \n" +
        "\t         BENEFIT_COUNT = NUMBER_OF_RENEWALS / (NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS > 0 ? NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS : 1) ;\n" +
        "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT	;\n" +
        "\t eligibleWhen \n" +
        "\t NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS < 9	;\n" +
        "\t pay BENEFIT_VALUE \n" +
        "\t after 1 / 4 of TOTAL_DELIVERIES, 1 / 2 of TOTAL_DELIVERIES, 3 / 4  of TOTAL_DELIVERIES in default proportion ;\n" ;




      //example 2

/*
        String str = " given \n" +
        "\t VALUE_PER_POINT = 10 ;\n" +
        "\t PRODUCT_SUBSCRIPTION_COUNT_PER_SUBSCRIPTION[] as input ;\n" +
        "\t PRODUCT_ID as input ;\n" +
        "\t TOTAL_DELIVERIES as input ;\n" +
        "\t \n" +
        "\t compute\n" +
        "\t         BENEFIT_COUNT = sumOf each PRODUCT_SUBSCRIPTION_COUNT_PER_SUBSCRIPTION ;\n" +
        "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT ;\n" +
        "\t \n" +
        "\t eligibleWhen \n" +
        "\t PRODUCT_ID == \"Product1\" ;\n" +
        "\t \n" +
        "\t pay BENEFIT_VALUE \n" +
        "\t after 1/4 of TOTAL_DELIVERIES, 1/2 of TOTAL_DELIVERIES, 3/4  of TOTAL_DELIVERIES in default proportion ;" ;
*/



    //example 3

/*
        String str = "given \n" +
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
                "\t after 1 / 4 of TOTAL_DELIVERIES, 1 / 2 of TOTAL_DELIVERIES, 3 / 4  of TOTAL_DELIVERIES in 2:3:4 proportion ;";
*/


        //example 4


/*
        String str = "given \n" +
                "\t UNIT_SUBSCRIPTION_VALUE = 1000 ;\n" +
                "\t UNIT_PERIOD_MONTH = 2 ;\n" +
                "\t VALUE_PER_POINT = 1 ;\n" +
                "\t SUBSCRIPTION_VALUE as input ;\n" +
                "\t TOTAL_DELIVERIES as input ;\n" +
                "\t compute \n" +
                "\t RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;\n" +
                "\t RESULT2= TOTAL_DELIVERIES / UNIT_PERIOD_MONTH ;\n" +
                "\t BENEFIT_COUNT = RESULT1*RESULT2 ;\n" +
                "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT ;\n" +
                "\t eligibleWhen	\n" +
                "\t SUBSCRIPTION_VALUE > 20000 and\n" +
                "\t SUBSCRIPTION_VALUE < 30000 and\n" +
                "\t TOTAL_DELIVERIES >= 10 ;\n" +
                "\t pay BENEFIT_VALUE\n" +
                "\t after 1 / 4 of TOTAL_DELIVERIES, 1 / 2 of TOTAL_DELIVERIES, 3 / 4  of TOTAL_DELIVERIES in default proportion ;";
*/



        //example 5
/*
        String str = "given \n" +
                "\t VALUE_PER_POINT = 10 ;\n" +
                "\t SUBSCRIPTION_RENEWAL_COUNT as input ;\n" +
                "\t SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION [] as input ;\n" +
                "\t TOTAL_DELIVERIES as input ;\n" +
                "\t compute \n" +
                "\t BENEFIT_COUNT = SUBSCRIPTION_RENEWAL_COUNT ;\n" +
                "\t BENEFIT_VALUE = BENEFIT_COUNT * VALUE_PER_POINT ;\n" +
                "\t TOTAL_SUBSCRIPTION_PERIOD =sumOf each SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION ;\n" +
                "\t eligibleWhen  \n" +
                "\t SUBSCRIPTION_RENEWAL_COUNT > 3 and \n" +
                "\t each SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION >= 8 or  \n" +
                "\t TOTAL_SUBSCRIPTION_PERIOD > 20	;\n" +
                "\t pay BENEFIT_VALUE   \n" +
                "\t after 1 / 4 of TOTAL_DELIVERIES, 1 / 2 of TOTAL_DELIVERIES, 3 / 4  of TOTAL_DELIVERIES in default proportion ;";
*/

        return str;
    }

    public static BenefitsProcessingContext getInputs() {

        //example 1 - no of modifications

        BenefitsProcessingContext context = new BenefitsProcessingContext();
        context.addToIntermediateVariables("NUMBER_OF_MODIFICATIONS_ALL_SUBSCRIPTIONS", 8);
        context.addToIntermediateVariables("NUMBER_OF_RENEWALS", 4);
        context.addToIntermediateVariables("TOTAL_DELIVERIES", 12);



        //Create input collection

        //example 2


/*
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(7);
        list.add(8);
        BenefitsProcessingContext context = new BenefitsProcessingContext();
        context.addToIntermediateVariables("PRODUCT_SUBSCRIPTION_COUNT_PER_SUBSCRIPTION", list);
        context.addToIntermediateVariables("PRODUCT_ID", "Product1");
        context.addToIntermediateVariables("TOTAL_DELIVERIES",12);
*/



        //example 3

/*
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(8);
        BenefitsProcessingContext context = new BenefitsProcessingContext();
        context.addToIntermediateVariables("SUBSCRIPTION_RENEWAL_COUNT", 4);
        context.addToIntermediateVariables("SUBSCRIPTION_PERIOD", list);
        context.addToIntermediateVariables("TOTAL_DELIVERIES", 8);
*/


        //example 4

/*
        BenefitsProcessingContext context = new BenefitsProcessingContext();
        context.addToIntermediateVariables("SUBSCRIPTION_VALUE", 25000);
        context.addToIntermediateVariables("TOTAL_DELIVERIES", 10);
*/

        //example 5
/*
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        BenefitsProcessingContext context = new BenefitsProcessingContext();
        context.addToIntermediateVariables("SUBSCRIPTION_RENEWAL_COUNT", 4);
        context.addToIntermediateVariables("SUBSCRIPTION_PERIOD_PER_SUBSCRIPTION", list);
        context.addToIntermediateVariables("TOTAL_DELIVERIES", 8);
*/


        return context;


    }


/*
        //Build scheme object form the scheme string
        BenefitsCompiler compiler = new BenefitsCompiler();
        //all the units are supplied with input values
        Scheme scheme = compiler.compile(str3,context);
        compiler.execute(scheme);
        List<EligibilityExpressionOutput> outputs = scheme.getEligibilityUnit().getEligibilityExpressionWiseOutputs();
        for (EligibilityExpressionOutput output : outputs) {
            System.out.println("Eligibility Metric Name: " + output.getMetricName());
            System.out.println("Eligibility Metric Value : " + output.getValue());
            System.out.println("Eligibility Metric Type: " + output.getValueType());
            System.out.println("Eligibility Metric Operator:  " + output.getOperator());
        }
        List<ComputeExpressionOutput> computeExpressionOutputs = scheme.getComputeUnit().getComputeExpressionOutputs();
        for (ComputeExpressionOutput output : computeExpressionOutputs) {
            System.out.println("Compute Metric Name: " + output.getMetricName());
            System.out.println("Compute Metric Value : " + output.getValue());
            System.out.println("Compute Metric Type: " + output.getValueType());
        }
    }
*/
}
