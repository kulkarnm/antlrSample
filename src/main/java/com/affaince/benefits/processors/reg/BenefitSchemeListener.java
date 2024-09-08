package com.affaince.benefits.processors.reg;

import com.affaince.benefits.grammar.BenefitBaseListener;
import com.affaince.benefits.grammar.BenefitParser;
import com.affaince.benefits.scheme.*;
import com.affaince.benefits.scheme.expressions.Expression;

import java.util.List;


public class BenefitSchemeListener extends BenefitBaseListener {
    private Scheme scheme;
    private ExpressionBuilder expressionBuilder;
    private PaymentExpressionBuilder paymentExpressionBuilder;
    public BenefitSchemeListener(Scheme scheme){
        this.scheme = scheme;
    }
    @Override public void enterScheme(BenefitParser.SchemeContext ctx) {
        expressionBuilder = new ExpressionBuilder(this.scheme);
        paymentExpressionBuilder= new PaymentExpressionBuilder(scheme);
    }

    @Override
    public void exitGivenUnit(BenefitParser.GivenUnitContext ctx) {
        List<BenefitParser.VariableDeclarationStatementContext> variableDeclarationStatementContexts = ctx.givenBody().variableDeclarationStatement();
        if(null != variableDeclarationStatementContexts && !variableDeclarationStatementContexts.isEmpty()) {
            for (BenefitParser.VariableDeclarationStatementContext context : variableDeclarationStatementContexts) {
                scheme.getGivenUnit().addExpression(expressionBuilder.processVariableDeclaration(context));
            }
        }
        System.out.println(" exit variable declaration statement");
    }


    @Override
    public void exitComputeUnit(BenefitParser.ComputeUnitContext ctx) {
        List<BenefitParser.BlockStatementContext> blockStatementContexts =ctx.computeBlock().block().blockStatement();
        if(null != blockStatementContexts && !blockStatementContexts.isEmpty()) {
            for (BenefitParser.BlockStatementContext blockStatementContext : blockStatementContexts) {
                Expression computeUnitExpression = expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression());
                scheme.getComputeUnit().addExpression(computeUnitExpression);
            }
        }
    }

    @Override public void exitEligibilityUnit(BenefitParser.EligibilityUnitContext ctx) {
        List<BenefitParser.BlockStatementContext> blockStatementContexts =ctx.block().blockStatement();
        if(null != blockStatementContexts && !blockStatementContexts.isEmpty()) {
            for (BenefitParser.BlockStatementContext blockStatementContext : blockStatementContexts) {
                Expression eligibilityUnitExpression = expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression());
                scheme.getEligibilityUnit().setExpression(eligibilityUnitExpression);
            }
        }
    }

    @Override public void exitPayUnit(BenefitParser.PayUnitContext ctx) {
       this.scheme.getPayUnit().setPaymentExpression(paymentExpressionBuilder.buildPaymentExpression(ctx));
    }

    public Scheme getScheme() {
        return scheme;
    }
}
