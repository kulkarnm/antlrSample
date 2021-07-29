package com.affaince.benefit.processor;

import com.affaince.benefit.BenefitBaseListener;
import com.affaince.benefit.BenefitParser;
import com.affaince.benefit.scheme.*;

import java.util.List;

public class BenefitSchemeListener extends BenefitBaseListener {
    private Scheme scheme;
    private ExpressionBuilder expressionBuilder;
    @Override public void enterScheme(BenefitParser.SchemeContext ctx) {
        this.scheme = new Scheme();
        expressionBuilder = new ExpressionBuilder(this.scheme);
    }

    @Override public void enterGivenUnit(BenefitParser.GivenUnitContext ctx) {
        GivenUnit givenUnit = new GivenUnit();
        this.scheme.setGivenUnit(givenUnit);
    }

    @Override public void exitVariableDeclarationStatement(BenefitParser.VariableDeclarationStatementContext ctx) {
        scheme.getGivenUnit().addExpression(expressionBuilder.processVariableDeclaration(ctx));
        System.out.println(" exit variable declaration statement");

    }

    @Override
    public void exitComputeBlock(BenefitParser.ComputeBlockContext ctx) {
       List<BenefitParser.BlockStatementContext> blockStatementContexts =ctx.block().blockStatement();
       for(BenefitParser.BlockStatementContext blockStatementContext:blockStatementContexts){
           scheme.getComputeUnit().addExpression(expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression()));
       }
    }

    @Override public void enterComputeUnit(BenefitParser.ComputeUnitContext ctx) {
        ComputeUnit computeUnit = new ComputeUnit();
        this.scheme.setComputeUnit(computeUnit);
    }


    @Override public void enterEligibilityUnit(BenefitParser.EligibilityUnitContext ctx) {
        EligibilityUnit eligibilityUnit= new EligibilityUnit();
        this.scheme.setEligibilityUnit(eligibilityUnit);
    }
    @Override public void exitEligibilityUnit(BenefitParser.EligibilityUnitContext ctx) {
        List<BenefitParser.BlockStatementContext> blockStatementContexts =ctx.block().blockStatement();
        for(BenefitParser.BlockStatementContext blockStatementContext:blockStatementContexts){
            scheme.getEligibilityUnit().addExpression(expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression()));
        }
    }
    @Override public void enterPayUnit(BenefitParser.PayUnitContext ctx) {
        PayUnit payUnit=new PayUnit();
        this.scheme.setPayUnit(payUnit);
    }

    @Override public void exitPayUnit(BenefitParser.PayUnitContext ctx) {
       PaymentExpressionBuilder paymentExpressionBuilder = new PaymentExpressionBuilder();
       this.scheme.getPayUnit().setPaymentExpression(paymentExpressionBuilder.buildPaymentExpression(ctx,this.scheme));
    }
    @Override public void exitExpression(BenefitParser.ExpressionContext ctx) {
    }

    public Scheme getScheme() {
        return scheme;
    }
}
