package com.affaince.benefit;

import com.affaince.benefit.dummy.DummyEvent;
import com.affaince.benefit.dummy.DummyEventProcessor;
import com.affaince.benefit.processor.BenefitSchemeListener;
import com.affaince.benefit.processor.SchemeExecutor;
import com.affaince.benefit.scheme.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestMain {
    public static void main(String[] args){
        // RESULT1= SUBSCRIPTION_VALUE / UNIT_SUBSCRIPTION_VALUE ;
 /*       double subscriptionValue = 10000;
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
        System.out.println(exp3.apply());*/
         execute();

    }

    public static void execute(){
        String str = "given \n" +
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
                "\t after 1 / 4, 1 / 2, 3 / 4  of TOTAL_DELIVERIES in default proportion ;";

        DummyEvent dummyEvent = new DummyEvent(25000,12,12);
        DummyEventProcessor dummyEventProcessor = new DummyEventProcessor();
        Scheme scheme = new Scheme();
        scheme = dummyEventProcessor.processDummyEvent(scheme,dummyEvent);


        BenefitLexer lexer = new BenefitLexer(CharStreams.fromString(str));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BenefitParser parser = new BenefitParser(tokens);
        ParseTree tree = parser.scheme();
        ParseTreeWalker walker = new ParseTreeWalker();

        BenefitSchemeListener listener = new BenefitSchemeListener(scheme);
        walker.walk(listener,tree);
        scheme = listener.getScheme();
        System.out.println("Scheme: " + scheme);

        SchemeExecutor schemeExecutor = new SchemeExecutor();
        BenefitSchemeContext benefitSchemeContext = schemeExecutor.executeScheme(scheme);
        System.out.println(benefitSchemeContext);

    }
}
