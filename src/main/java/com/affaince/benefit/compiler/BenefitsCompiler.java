package com.affaince.benefit.compiler;

import com.affaince.benefit.BenefitLexer;
import com.affaince.benefit.BenefitParser;
import com.affaince.benefit.context.MetricsContext;
import com.affaince.benefit.processors.exec.ExpressionLoaderProcessor;
import com.affaince.benefit.processors.exec.SchemeExecutor;
import com.affaince.benefit.processors.reg.BenefitSchemeListener;
import com.affaince.benefit.scheme.BenefitSchemeContext;
import com.affaince.benefit.scheme.Scheme;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Map;

public class BenefitsCompiler {
    public Scheme parseSchemeString(String schemeDefinitionString) {
        BenefitLexer lexer = new BenefitLexer(CharStreams.fromString(schemeDefinitionString));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BenefitParser parser = new BenefitParser(tokens);
        ParseTree tree = parser.scheme();
        ParseTreeWalker walker = new ParseTreeWalker();

        Scheme scheme = new Scheme();
        BenefitSchemeListener listener = new BenefitSchemeListener(scheme);
        walker.walk(listener, tree);
        scheme = listener.getScheme();  //plain parsed scheme without any inputs.. due for registration
        return scheme;
    }
    public Scheme compile(Scheme scheme, MetricsContext metricsContext){
        // SchemeDeserializer deserializer = new SchemeDeserializer();
        //Scheme scheme = deserializer.deserialize(schemeString);
        ExpressionLoaderProcessor expressionLoaderProcessor = new ExpressionLoaderProcessor();
        scheme = expressionLoaderProcessor.supplyVariableValues(scheme, metricsContext);
        return scheme;
    }

    public BenefitSchemeContext execute(Scheme scheme){
        SchemeExecutor schemeExecutor = new SchemeExecutor();
        BenefitSchemeContext benefitSchemeContext = schemeExecutor.executeScheme(scheme);
       // print(benefitSchemeContext);
        return benefitSchemeContext;
    }

    public Scheme compile(String schemeString, MetricsContext metricsContext){
        // SchemeDeserializer deserializer = new SchemeDeserializer();
        //Scheme scheme = deserializer.deserialize(schemeString);
        Scheme scheme = parseSchemeString(schemeString);
        ExpressionLoaderProcessor expressionLoaderProcessor = new ExpressionLoaderProcessor();
        scheme = expressionLoaderProcessor.supplyVariableValues(scheme, metricsContext);
        return scheme;
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
