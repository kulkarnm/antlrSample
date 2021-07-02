package com.affaince.benefit;

import com.affaince.benefit.scheme.Scheme;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.InputStream;

public class SchemeFactory {
    public Scheme createScheme(InputStream in) throws IOException {
        BenefitLexer l = new BenefitLexer(new ANTLRInputStream(in));
        BenefitParser p = new BenefitParser(new CommonTokenStream(l));
        p.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }

        });
        p.addParseListener(new BenefitSchemeListener());
        p.scheme();
    }
}
