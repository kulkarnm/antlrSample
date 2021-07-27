package com.affaince.benefit.scheme;

import java.util.ArrayList;
import java.util.List;

public class PaymentExpression {
    private Expression payableVariable;
    private PaymentPrecedence precedence;
    List<Expression> vestingExpressions;
    List<Expression> proportionExpressions;

    public PaymentExpression(){
        vestingExpressions = new ArrayList<>();
        proportionExpressions = new ArrayList<>();
    }

    public Expression getPayableVariable() {
        return payableVariable;
    }

    public PaymentPrecedence getPrecedence() {
        return precedence;
    }

    public List<Expression> getVestingExpressions() {
        return vestingExpressions;
    }

    public List<Expression> getProportionExpressions() {
        return proportionExpressions;
    }

    public void setPayableVariable(Expression payableVariable) {
        this.payableVariable = payableVariable;
    }

    public void setPrecedence(PaymentPrecedence precedence) {
        this.precedence = precedence;
    }

    public void addToVestingExpression(Expression expression){
        this.vestingExpressions.add(expression);
    }
    public void addToProportionExpression(Expression expression){
        this.proportionExpressions.add(expression);
    }

    public void setVestingExpressions(List<Expression> vestingExpressions) {
        this.vestingExpressions = vestingExpressions;
    }

    public void setProportionExpressions(List<Expression> proportionExpressions) {
        this.proportionExpressions = proportionExpressions;
    }
}
