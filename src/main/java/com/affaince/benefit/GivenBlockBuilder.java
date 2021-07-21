package com.affaince.benefit;

import com.affaince.benefit.scheme.Expression;
import com.affaince.benefit.scheme.GivenUnit;


public class GivenBlockBuilder<L, R, P> {
    ExpressionBuilder expressionBuilder = new ExpressionBuilder();
    public GivenUnit buildGivenBlock(BenefitParser.GivenUnitContext ctx) {
        GivenUnit givenUnit = new GivenUnit();
        if (ctx.GIVEN().getText() == "given") {
            ctx.givenBody().block().blockStatement().stream().forEach(stmt -> {
                givenUnit.addExpression(expressionBuilder.processVariableDeclaration(stmt.variableDeclarationStatement()));
            });
            return givenUnit;
        } else {
            throw new RuntimeException("No GIVEN");
        }
    }


}
