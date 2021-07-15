package com.affaince.benefit;

import com.affaince.benefit.scheme.Expression;
import com.affaince.benefit.scheme.GivenUnit;


public class GivenBlockBuilder<L, R, P> {

    public GivenUnit buildGivenBlock(BenefitParser.GivenUnitContext ctx) {
        GivenUnit givenUnit = new GivenUnit();
        if (ctx.GIVEN().getText() == "given") {
            ctx.givenBody().block().blockStatement().stream().forEach(stmt -> {
                givenUnit.addExpression(processVariableDeclarations(stmt));
            });
            return givenUnit;
        } else {
            throw new RuntimeException("No GIVEN");
        }
    }

    private <L, R, P> Expression<L, R, P> processVariableDeclarations(BenefitParser.BlockStatementContext stmt) {
        BenefitParser.VariableDeclarationStatementContext variableDeclarationStatementContext = stmt.variableDeclarationStatement();
        if (null != variableDeclarationStatementContext) {
            if (null != variableDeclarationStatementContext.ASSIGN()) {   //assignment statement
                BenefitParser.VariableInitializerContext variableInitializerContext = variableDeclarationStatementContext.variableInitializer();
                if (null != variableInitializerContext.arrayInitializer()) { //variable is an array, so rhs will be array initialization block
                    BenefitParser.ArrayInitializerContext arrayInitializerContext = variableInitializerContext.arrayInitializer();
                    //TODO
                } else {       //if not array then it should be a simple constant assignment or an expression
                    BenefitParser.ExpressionContext expressionContext = variableInitializerContext.expression();

                }
            } else {          //input statement
            }
        } else {
            throw new RuntimeException("No VariableDeclaration");
        }
        return null;
    }
    
}
