package com.affaince.benefit.processors.reg;

import com.affaince.benefit.BenefitLexer;
import com.affaince.benefit.BenefitParser;
import com.affaince.benefit.processors.reg.BenefitSchemeListener;
import com.affaince.benefit.scheme.Scheme;
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
