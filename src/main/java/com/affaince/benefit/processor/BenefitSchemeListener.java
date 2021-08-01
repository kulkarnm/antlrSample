package com.affaince.benefit.processor;

import com.affaince.benefit.BenefitBaseListener;
import com.affaince.benefit.BenefitParser;
import com.affaince.benefit.scheme.*;

import java.util.List;

public class BenefitSchemeListener extends BenefitBaseListener {
    private Scheme scheme;
    private ExpressionBuilder expressionBuilder;
    public BenefitSchemeListener(Scheme scheme){
        this.scheme = scheme;
    }
    @Override public void enterScheme(BenefitParser.SchemeContext ctx) {
        expressionBuilder = new ExpressionBuilder(this.scheme);
    }

    @Override
    public void exitGivenUnit(BenefitParser.GivenUnitContext ctx) {
        List<BenefitParser.VariableDeclarationStatementContext> variableDeclarationStatementContexts = ctx.givenBody().variableDeclarationStatement();
        for(BenefitParser.VariableDeclarationStatementContext context: variableDeclarationStatementContexts){
            scheme.getGivenUnit().addExpression(expressionBuilder.processVariableDeclaration(context));
        }
        System.out.println(" exit variable declaration statement");
    }


    @Override
    public void exitComputeBlock(BenefitParser.ComputeBlockContext ctx) {
       List<BenefitParser.BlockStatementContext> blockStatementContexts =ctx.block().blockStatement();
       for(BenefitParser.BlockStatementContext blockStatementContext:blockStatementContexts){
           scheme.getComputeUnit().addExpression(expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression()));
       }
        System.out.println("exit ComputeBlock");
    }

    @Override public void exitEligibilityUnit(BenefitParser.EligibilityUnitContext ctx) {
        List<BenefitParser.BlockStatementContext> blockStatementContexts =ctx.block().blockStatement();
        for(BenefitParser.BlockStatementContext blockStatementContext:blockStatementContexts){
            scheme.getEligibilityUnit().addExpression(expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression()));
        }
        System.out.println("exit eligibility unit");
    }

    @Override public void exitPayUnit(BenefitParser.PayUnitContext ctx) {
       PaymentExpressionBuilder paymentExpressionBuilder = new PaymentExpressionBuilder();
       this.scheme.getPayUnit().setPaymentExpression(paymentExpressionBuilder.buildPaymentExpression(ctx,this.scheme));
        System.out.println("exit payment unit");
    }

    public Scheme getScheme() {
        return scheme;
    }
}
