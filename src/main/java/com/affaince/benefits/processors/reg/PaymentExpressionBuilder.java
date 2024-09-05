package com.affaince.benefits.processors.reg;

import com.affaince.benefits.grammar.BenefitParser;
import com.affaince.benefits.scheme.*;
import com.affaince.benefits.scheme.expressions.*;
import com.affaince.benefits.scheme.vo.BenefitInstalmentsDistribution;
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
        TerminalNode pay =  payUnitContext.PAY() ;
        if( null != pay) {
            expressionBuilder = new ExpressionBuilder(scheme);
            PaymentExpression paymentExpression = new PaymentExpression();
            paymentExpression.setExpressionStartNode(pay.getText());
            List<BenefitParser.BlockStatementContext> blockStatementContexts = payUnitContext.benefitPayComputeBlock().computeBlock().block().blockStatement();
            for (BenefitParser.BlockStatementContext blockStatementContext : blockStatementContexts) {
                paymentExpression.addExpression(expressionBuilder.buildExpression(blockStatementContext.statement().statementExpression().expression()));
            }
            //set before or after.. in our case after is also converted to before
            paymentExpression.setPrecedence(buildPaymentPrecedence(payUnitContext));
            paymentExpression.setInstalmentDeliverySequencesExpressions(buildInstalmentDeliverySequencesExpressions(payUnitContext));
            paymentExpression.setBenefitsDistributions(buildResidualPaymentDistributionExpressions(payUnitContext, paymentExpression));

/*
            paymentExpression.setPayableVariable(buildPayableVariableExpression(payUnitContext));
            paymentExpression.setPrecedence(buildPaymentPrecedence(payUnitContext));
            paymentExpression.setMultiplierVariable(buildMultiplierVariable(payUnitContext));
            paymentExpression.setVestingPeriodicityExpressions(buildVestingPeriodicityExpressions(payUnitContext, paymentExpression));
            paymentExpression.setVestingDistributions(buildVestingDistributionExpressions(payUnitContext, paymentExpression));
*/
            return paymentExpression;
        }
        return null;
    }

    private PaymentPrecedence buildPaymentPrecedence(BenefitParser.PayUnitContext payUnitContext) {
        if (null != payUnitContext.payBefore()) {
            return PaymentPrecedence.BEFORE;
        } else {
            return PaymentPrecedence.AFTER;
        }
    }

    private List<Expression> buildInstalmentDeliverySequencesExpressions(BenefitParser.PayUnitContext payUnitContext) {
        BenefitParser.SeparatedInstalmentDeliverySequencesExpressionContext separatedInstalmentDeliverySequencesExpressionContext = payUnitContext.separatedInstalmentDeliverySequencesExpression();

        List<Expression> instalmentDeliverySequenceExpressions = new ArrayList<>();
        if (null != separatedInstalmentDeliverySequencesExpressionContext) {
            List<BenefitParser.VariableNameContext> variableNames = separatedInstalmentDeliverySequencesExpressionContext.variableName();
            List<BenefitParser.ExpressionContext> expressionContexts = separatedInstalmentDeliverySequencesExpressionContext.expression();
            //InstalmentDeliverySequenceExpression instalmentDeliverySequenceExpression = new InstalmentDeliverySequenceExpression();
            for (int i = 0; i < variableNames.size(); i++) {
                Expression multiplierVariable = searchVariableInScheme(variableNames.get(i).getText());
                //instalmentDeliverySequenceExpression.setMultiplierVariable(multiplierVariable);
                Expression expression = expressionBuilder.buildExpression(expressionContexts.get(i));
                instalmentDeliverySequenceExpressions.add(new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION, expression, multiplierVariable));
            }
        }
        return instalmentDeliverySequenceExpressions;
    }

    private Expression searchVariableInScheme(String variableName) {
        return scheme.searchVariableExpression(variableName);
    }


    private List<BenefitInstalmentsDistribution> buildResidualPaymentDistributionExpressions(BenefitParser.PayUnitContext payUnitContext, PaymentExpression paymentExpression) {
        BenefitParser.SeparatedInstalmentDeliverySequencesExpressionContext separatedInstalmentDeliverySequencesExpressionContext = payUnitContext.separatedInstalmentDeliverySequencesExpression();
        List<BenefitInstalmentsDistribution> deliveryWiseDistributionExpressions = new ArrayList<>();
        if (null != separatedInstalmentDeliverySequencesExpressionContext) {
            BenefitParser.ProportionExpressionContext proportionExpressionContext = separatedInstalmentDeliverySequencesExpressionContext.proportionExpression();
            int vestingCount = paymentExpression.getInstalmentDeliverySequencesExpressions().size();

            if (null != proportionExpressionContext.DEFAULT()) {
                for (int i = 0; i < vestingCount; i++) {
                    Expression instalmentDeliverySequenceExpression = paymentExpression.getInstalmentDeliverySequencesExpressions().get(i);
                    Expression expression = new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION,
                            new ArithmeticExpression(ArithmeticOperator.DIVISION, new UnaryExpression(1, UnaryType.NUMBER), new UnaryExpression(vestingCount, UnaryType.NUMBER)),
                            paymentExpression.searchOutputVariableInExpressionQueue("BENEFIT_VALUE"));
                    deliveryWiseDistributionExpressions.add(new BenefitInstalmentsDistribution(instalmentDeliverySequenceExpression, expression));
                }
            } else {
                List<TerminalNode> proportionNumbers = separatedInstalmentDeliverySequencesExpressionContext.proportionExpression().nonDefaultProportionExpression().NUMBER();
                int proportionSum = proportionNumbers.stream().map(token -> Integer.parseInt(token.getText())).reduce(Integer::sum).get();
                for (int i = 0; i < vestingCount; i++) {
                    Expression instalmentDeliverySequenceExpression = paymentExpression.getInstalmentDeliverySequencesExpressions().get(i);
                    Expression expression = new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION,
                            new ArithmeticExpression(ArithmeticOperator.DIVISION,
                                    new UnaryExpression(Integer.parseInt(proportionNumbers.get(i).getText()), UnaryType.NUMBER),
                                    new UnaryExpression(proportionSum, UnaryType.NUMBER)
                            ),
                            paymentExpression.searchOutputVariableInExpressionQueue("BENEFIT_VALUE"));
                    deliveryWiseDistributionExpressions.add(new BenefitInstalmentsDistribution(instalmentDeliverySequenceExpression, expression));
                }
            }
        }
        return deliveryWiseDistributionExpressions;
    }

}
