package com.affaince.benefit;

import com.affaince.benefit.dummy.DummyEvent;
import com.affaince.benefit.dummy.DummyEventProcessor;
import com.affaince.benefit.processor.BenefitSchemeListener;
import com.affaince.benefit.processor.SchemeExecutor;
import com.affaince.benefit.scheme.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args){
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
        print(benefitSchemeContext);
    }

    public static void print(BenefitSchemeContext benefitSchemeContext){
        System.out.println("***********LETS GO THROUGH INPUT,COMPUTED AND OUTPUT VALUES**********");
        System.out.println("***********************INPUT VALUES**********************************");
        Map<String,Object>inputVariables  = benefitSchemeContext.getBenefitInputContext().getInputVariables();
        for(Map.Entry<String,Object>inputEntry: inputVariables.entrySet()){
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
        List<BenefitSchemeContext.BenefitOutputContext.BenefitVestingDistribution> benefitVestingDistributionList =   outputContext.getBenefitVestingDistributionList();
        for(BenefitSchemeContext.BenefitOutputContext.BenefitVestingDistribution distribution: benefitVestingDistributionList){
            System.out.print(" BEFORE/AFTER " + distribution.getDeliveryNumber() + " delivery,");
            System.out.println(" Vest " + distribution.getBenefitValueToBeVested() + " points");
        }
    }
}
