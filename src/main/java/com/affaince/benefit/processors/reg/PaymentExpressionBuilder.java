package com.affaince.benefit.processors.reg;

import com.affaince.benefit.BenefitParser;
import com.affaince.benefit.scheme.*;
import com.affaince.benefit.scheme.expressions.*;
import com.affaince.benefit.scheme.vo.VestingDistribution;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PaymentExpressionBuilder {
    private ExpressionBuilder expressionBuilder;
    private Scheme scheme;

    public PaymentExpressionBuilder(Scheme scheme){
        this.scheme=scheme;
    }

    public PaymentExpression buildPaymentExpression(BenefitParser.PayUnitContext payUnitContext) {
        expressionBuilder = new ExpressionBuilder(scheme);
        PaymentExpression paymentExpression = new PaymentExpression();
        paymentExpression.setPayableVariable(buildPayableVariableExpression(payUnitContext));
        paymentExpression.setPrecedence(buildPaymentPrecedence(payUnitContext));
        paymentExpression.setMultiplierVariable(buildMultiplierVariable(payUnitContext));
        paymentExpression.setVestingPeriodicityExpressions(buildVestingPeriodicityExpressions(payUnitContext,paymentExpression));
        paymentExpression.setVestingDistributions(buildVestingDistributionExpressions(payUnitContext,paymentExpression));
        return paymentExpression;
    }

    private Expression buildPayableVariableExpression(BenefitParser.PayUnitContext payUnitContext) {
        return scheme.searchVariableExpression(payUnitContext.variableName().get(0).getText());
    }

    private PaymentPrecedence buildPaymentPrecedence(BenefitParser.PayUnitContext payUnitContext) {
        if (null != payUnitContext.payBefore()) {
            return PaymentPrecedence.BEFORE;
        } else {
            return PaymentPrecedence.AFTER;
        }
    }

    private List<Expression> buildVestingPeriodicityExpressions(BenefitParser.PayUnitContext payUnitContext,PaymentExpression paymentExpression) {
        BenefitParser.ExpressionListContext expressionListContext = payUnitContext.expressionList();
        Expression multiplierVariable = paymentExpression.getMultiplierVariable();
        List<Expression> vestingExpressions = new ArrayList<>();
        for (BenefitParser.ExpressionContext expressionContext : expressionListContext.expression()) {
            Expression expression = expressionBuilder.buildExpression(expressionContext);
            vestingExpressions.add(new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION, expression,multiplierVariable));
        }
        return vestingExpressions;
    }

    private Expression buildMultiplierVariable(BenefitParser.PayUnitContext payUnitContext) {
        return scheme.searchVariableExpression(payUnitContext.variableName().get(1).getText());
    }

    private List<VestingDistribution> buildVestingDistributionExpressions(BenefitParser.PayUnitContext payUnitContext, PaymentExpression paymentExpression) {
        BenefitParser.ProportionExpressionContext proportionExpressionContext = payUnitContext.proportionExpression();
        int vestingCount = paymentExpression.getVestingPeriodicityExpressions().size();
        List<VestingDistribution> deliveryWiseDistributionExpressions = new ArrayList<>();
        if (null != proportionExpressionContext.DEFAULT()) {
            for (int i =0; i < vestingCount; i++) {
                Expression vestingPeriodicityExpression = paymentExpression.getVestingPeriodicityExpressions().get(i);
                Expression expression = new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION,
                        new ArithmeticExpression(ArithmeticOperator.DIVISION, new UnaryExpression(1,UnaryType.NUMBER), new UnaryExpression(vestingCount,UnaryType.NUMBER)),
                        paymentExpression.getPayableVariable());
                deliveryWiseDistributionExpressions.add(new VestingDistribution(vestingPeriodicityExpression,expression));
            }
        } else {
            List<TerminalNode> proportionNumbers = payUnitContext.proportionExpression().nonDefaultProportionExpression().NUMBER();
            int proportionSum = proportionNumbers.stream().map(token ->Integer.parseInt(token.getText())).reduce(Integer::sum).get();
            for (int i = 0; i < vestingCount; i++) {
                Expression vestingPeriodicityExpression = paymentExpression.getVestingPeriodicityExpressions().get(i);
                Expression expression = new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION,
                        new ArithmeticExpression(ArithmeticOperator.DIVISION, new UnaryExpression(Integer.parseInt(proportionNumbers.get(i).getText()),UnaryType.NUMBER), new UnaryExpression(proportionSum,UnaryType.NUMBER)),
                        paymentExpression.getPayableVariable());
                deliveryWiseDistributionExpressions.add(new VestingDistribution(vestingPeriodicityExpression,expression));
            }
        }
        return deliveryWiseDistributionExpressions;
    }
}
