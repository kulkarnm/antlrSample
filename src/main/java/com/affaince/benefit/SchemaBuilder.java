package com.affaince.benefit;

import com.affaince.benefit.scheme.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.StringReader;

public class SchemaBuilder {



    public void buildScheme(String benefitScheme,CommonInputContext commonInputContext){
        CharStream in = new UnbufferedCharStream(new StringReader(benefitScheme));
        BenefitLexer lexer = new BenefitLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BenefitParser parser = new BenefitParser(tokens);
        ParseTree tree = parser.scheme(); // parse; start at prog System.out.println(tree.toStringTree(parser)); // print tree as text
        System.out.println(tree.getText());
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new BenefitSchemeListener(),tree);
    }
}
