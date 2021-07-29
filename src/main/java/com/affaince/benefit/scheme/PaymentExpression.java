package com.affaince.benefit.scheme;

import java.util.ArrayList;
import java.util.List;

public class PaymentExpression {
    private Expression payableVariable;
    private PaymentPrecedence precedence;
    List<Expression> vestingPeriodicityExpressions;
    private Expression multiplierVariable;
    List<Expression> vestingDistributionExpressions;

    public PaymentExpression(){
        vestingPeriodicityExpressions = new ArrayList<>();
        vestingDistributionExpressions = new ArrayList<>();
    }

    public Expression getPayableVariable() {
        return payableVariable;
    }

    public PaymentPrecedence getPrecedence() {
        return precedence;
    }

    public List<Expression> getVestingPeriodicityExpressions() {
        return vestingPeriodicityExpressions;
    }

    public List<Expression> getVestingDistributionExpressions() {
        return vestingDistributionExpressions;
    }

    public void setPayableVariable(Expression payableVariable) {
        this.payableVariable = payableVariable;
    }

    public void setPrecedence(PaymentPrecedence precedence) {
        this.precedence = precedence;
    }

    public void addToVestingExpression(Expression expression){
        this.vestingPeriodicityExpressions.add(expression);
    }
    public void addToProportionExpression(Expression expression){
        this.vestingDistributionExpressions.add(expression);
    }

    public void setVestingPeriodicityExpressions(List<Expression> vestingPeriodicityExpressions) {
        this.vestingPeriodicityExpressions = vestingPeriodicityExpressions;
    }

    public void setVestingDistributionExpressions(List<Expression> vestingDistributionExpressions) {
        this.vestingDistributionExpressions = vestingDistributionExpressions;
    }

    public Expression getMultiplierVariable() {
        return multiplierVariable;
    }

    public void setMultiplierVariable(Expression multiplierVariable) {
        this.multiplierVariable = multiplierVariable;
    }
}
