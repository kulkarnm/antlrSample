package com.affaince.benefits.processors.reg;

import com.affaince.benefits.grammar.BenefitLexer;
import com.affaince.benefits.grammar.BenefitParser;
import com.affaince.benefits.scheme.Scheme;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class SchemeRegistrationProcessor {

    public Scheme registerScheme(String schemeDefinitionString){
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
}
