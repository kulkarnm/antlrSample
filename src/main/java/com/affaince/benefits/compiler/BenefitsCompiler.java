package com.affaince.benefits.compiler;

import com.affaince.benefits.grammar.BenefitLexer;
import com.affaince.benefits.grammar.BenefitParser;
import com.affaince.benefits.scheme.BenefitOutputContext;
import com.affaince.benefits.scheme.BenefitsProcessingContext;
import com.affaince.benefits.processors.reg.BenefitSchemeListener;
import com.affaince.benefits.scheme.BenefitSchemeContext;
import com.affaince.benefits.scheme.Scheme;
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
        tokens.fill();

        BenefitParser parser = new BenefitParser(tokens);
        ParseTree tree = parser.scheme();
        ParseTreeWalker walker = new ParseTreeWalker();

        //********************** list all inputs
        //first sub-tree is the 'given' tree
        ParseTree givenTree = tree.getChild(0);
        //second sub-tree of 'given' tree is list of variables.
        ParseTree variableNameTree = givenTree.getChild(1);
        //find how many input variables are there in given unit
        int childCount = givenTree.getChild(1).getChildCount();
        for (int i = 0; i < childCount; i++) {
            System.out.println("INPUT VARIABLE NAME : " + variableNameTree.getChild(i).getChild(0).getText());
        }
        //***********************

        Scheme scheme = new Scheme();
        BenefitSchemeListener listener = new BenefitSchemeListener(scheme);
        walker.walk(listener, tree);
        scheme = listener.getScheme();  //plain parsed scheme without any inputs.. due for registration
        return scheme;
    }
    public Scheme compile(String schemeString, BenefitsProcessingContext benefitsProcessingContext){
        Scheme scheme;
        scheme = parseSchemeString(schemeString);
        scheme.setBenefitProcessingContext(benefitsProcessingContext);
        return scheme;

/*
        ExpressionLoaderProcessor expressionLoaderProcessor = new ExpressionLoaderProcessor();
        scheme = expressionLoaderProcessor.supplyVariableValues(scheme, metricsContext);
        return scheme;
*/

    }


    public void execute(Scheme scheme){
        Scheme scheme1 = scheme.executeScheme();
        print(scheme1.getBenefitSchemeContext());
    }



    public static void print(BenefitSchemeContext benefitSchemeContext) {
        System.out.println("***********LETS GO THROUGH INPUT,COMPUTED AND OUTPUT VALUES**********");
        System.out.println("***********************INPUT VALUES**********************************");
        Map<String, Object> inputVariables = benefitSchemeContext.getIntermediateVariables();
        for (Map.Entry<String, Object> inputEntry : inputVariables.entrySet()) {
            System.out.print(" Input field: " + inputEntry.getKey());
            System.out.println(" input value: " + inputEntry.getValue());
        }
        System.out.println("***********************END - INPUT VALUES**********************************");
        System.out.println("***********************OUTPUT VALUES**********************************");
        BenefitOutputContext outputContext = benefitSchemeContext.getBenefitOutputContext();
        System.out.println("Is account eligible for the benefit? :" + outputContext.getEligibleForScheme());
        System.out.println("total benefit value : " + outputContext.getBenefitValue());
        System.out.println("is vesting BEFORE stated delivery number?: " + outputContext.isBefore());
        System.out.println("benefit points vesting distribution list");
        List<BenefitOutputContext.BenefitVestingDistribution> benefitVestingDistributionList = outputContext.getBenefitVestingDistributionList();
        for (BenefitOutputContext.BenefitVestingDistribution distribution : benefitVestingDistributionList) {
            System.out.print(" BEFORE/AFTER " + distribution.getDeliveryNumber() + " delivery,");
            System.out.println(" Vest " + distribution.getBenefitValueToBeVested() + " points");
        }
    }
}
