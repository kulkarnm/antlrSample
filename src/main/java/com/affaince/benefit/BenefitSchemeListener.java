package com.affaince.benefit;

import com.affaince.benefit.scheme.*;

public class BenefitSchemeListener extends BenefitBaseListener{
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
        if(ctx.getParent() instanceof BenefitParser.GivenUnitContext){
          VariableExpression variableExpression = (VariableExpression)expressionBuilder.processVariableDeclaration(ctx);
          scheme.getGivenUnit().addExpression(variableExpression);
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
    @Override public void enterPayUnit(BenefitParser.PayUnitContext ctx) {
        PayUnit payUnit=new PayUnit();
        this.scheme.setPayUnit(payUnit);
    }


    @Override public void exitExpression(BenefitParser.ExpressionContext ctx) {
        Expression expression = expressionBuilder.buildExpression(ctx);
        if(ctx.getParent() instanceof BenefitParser.ComputeUnitContext){
            this.scheme.getComputeUnit().addExpression(expression);
        }else if(ctx.getParent() instanceof BenefitParser.EligibilityUnitContext){
            this.scheme.getEligibilityUnit().addExpression(expression);
        }else{
            this.scheme.getPayUnit().addExpression(expression);
        }
    }

    public Scheme getScheme() {
        return scheme;
    }
}
