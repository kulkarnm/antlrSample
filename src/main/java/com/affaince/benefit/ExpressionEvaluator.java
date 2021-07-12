package com.affaince.benefit;

import com.affaince.benefit.scheme.ArithmeticExpression;
import com.affaince.benefit.scheme.ArithmeticOperator;
import com.affaince.benefit.scheme.Expression;
import com.affaince.benefit.scheme.UnaryExpression;

import java.util.ArrayList;
import java.util.List;


public class ExpressionEvaluator<L,R,P> {
    public Expression<L,R,P> buildExpression(BenefitParser.ExpressionContext expressionContext){
        return processExpression(expressionContext);
    }
    private Expression<L,R,P> processExpression(BenefitParser.ExpressionContext expressionContext){
        //first check for expression type

        if(null != expressionContext.conditionalExpression()){
            Expression<L,R,P> lhs = processConditionalExpression(expressionContext.conditionalExpression());
            if(null != expressionContext.ASSIGN() && null != expressionContext.expression()){
                Expression<L,R,P> rhs = processExpression(expressionContext.expression());
                return  (Expression<L,R,P>) new ArithmeticExpression<>(ArithmeticOperator.ASSIGN,lhs,rhs);
            }
        }
        return null;
    }

    Expression <L,R,P> processConditionalExpression(BenefitParser.ConditionalExpressionContext conditionalExpressionContext) {
        if(null != conditionalExpressionContext.conditionalOrExpression()){
            Expression<L,R,P> lhs = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
            Boolean conditionValue = (Boolean) lhs.apply();
            if(null != conditionalExpressionContext.QUESTIONMARK() && null !=conditionalExpressionContext.expression() ){
                if(conditionValue) {
                    return processExpression(conditionalExpressionContext.expression());
                }else {
                    if (null != conditionalExpressionContext.COLON() && null != conditionalExpressionContext.conditionalExpression()) {
                        return processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                    }
                }
            }
        }
        return null;
    }

    Expression <L,R,P> processConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext conditionalOrExpressionContext) {
        if(null != conditionalOrExpressionContext.conditionalAndExpression(0)){
            Expression<L,R,P> lhs = processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression(0));
            Boolean lhsConditionValue = (Boolean)lhs.apply();
            if(lhsConditionValue){
                return lhs;
            }
            if(null != conditionalOrExpressionContext.ORSTR() &&
                    !conditionalOrExpressionContext.ORSTR().isEmpty() &&
                    null != conditionalOrExpressionContext.conditionalAndExpression() &&
                    !conditionalOrExpressionContext.conditionalAndExpression().isEmpty()){
                for(BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext: conditionalOrExpressionContext.conditionalAndExpression()) {
                    Expression<L, R, P> rhs = processConditionalAndExpression(conditionalAndExpressionContext);
                    Boolean rhsConditionValue = (Boolean)rhs.apply();
                    if(rhsConditionValue){
                        return rhs;
                    }
                }
            }
        }
        return  null;
    }

    Expression<L,R,P> processConditionalAndExpression (BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext){
        List<Boolean> conditionValuesList = new ArrayList<>();
        if(null!= conditionalAndExpressionContext.relationalExpression(0)) {
            Expression<L, R, P> lhs = processRelationalExpression(conditionalAndExpressionContext.relationalExpression(0));
            Boolean lhsConditionValue = (Boolean) lhs.apply();
            if (!lhsConditionValue) {
                return (Expression<L, R, P>) new UnaryExpression<Boolean>(false);
            } else {
                if (null != conditionalAndExpressionContext.ANDSTR() &&
                        !conditionalAndExpressionContext.ANDSTR().isEmpty() &&
                        null != conditionalAndExpressionContext.relationalExpression() &&
                        !conditionalAndExpressionContext.relationalExpression().isEmpty()) {
                    for (BenefitParser.RelationalExpressionContext relationalExpressionContext : conditionalAndExpressionContext.relationalExpression()) {
                        Expression<L, R, P> rhs = processRelationalExpression(relationalExpressionContext);
                        Boolean rhsConditionValue =(Boolean) rhs.apply();
                        if(!rhsConditionValue){
                            return (Expression<L, R, P>) new UnaryExpression<Boolean>(false);
                        }
                    }
                }
            }
            return (Expression<L, R, P>) new UnaryExpression<Boolean>(true);
        }
        return null;
    }

    Expression<L,R,P> processRelationalExpression(BenefitParser.RelationalExpressionContext relationalExpressionContext){
        if( null != relationalExpressionContext.additiveExpression(0)){
            Expression<L,R,P> lhs = processAdditiveExpression(relationalExpressionContext.additiveExpression(0));
            if(null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    ! relationalExpressionContext.additiveExpression().isEmpty()){
                for(BenefitParser.AdditiveExpressionContext additiveExpressionContext : relationalExpressionContext.additiveExpression() ){
                    Expression<L,R,P> rhs = processAdditiveExpression(additiveExpressionContext);
                }
            }
        }else if(null != relationalExpressionContext.iterativeStatement()){
            Expression<L,R,P> lhs = processIterativeStatement(relationalExpressionContext.iterativeStatement()) ;
            if(null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    ! relationalExpressionContext.additiveExpression().isEmpty()){
                for(BenefitParser.AdditiveExpressionContext additiveExpressionContext : relationalExpressionContext.additiveExpression() ){
                    Expression<L,R,P> rhs = processAdditiveExpression(additiveExpressionContext);
                }
            }
        }
        return null;
    }

    Expression<L,R,P> processIterativeStatement(BenefitParser.IterativeStatementContext iterativeStatementContext){
        if(null != iterativeStatementContext.SUMOF()){
            if(null != iterativeStatementContext.EACH() && null != iterativeStatementContext.variableDeclarationStatement()){
                Expression<L,R,P> lhs = processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement() );
            }
        }else if(null != iterativeStatementContext.EACH() && null != iterativeStatementContext.variableDeclarationStatement()){
            Expression<L,R,P> lhs = processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement() );
        }
        return null;
    }

    Expression<L,R,P> processVariableDeclaration(BenefitParser.VariableDeclarationStatementContext variableDeclarationStatementContext){
        String variableName = variableDeclarationStatementContext.variableDeclaratorId().getText();
        if(null != variableDeclarationStatementContext.ASSIGN() && null != variableDeclarationStatementContext.variableInitializer()){
            Expression<L,R,P> rhs = processVariableInitialization(variableDeclarationStatementContext.variableInitializer());
        }else if(null != variableDeclarationStatementContext.ASINPUT()){
            Expression<L,R,P> rhs = processVariableInputInitialization(variableName);
        }
        return null;
    }
    Expression<L,R,P> processVariableInputInitialization(String variableName){
/*
        for(VariableExpression<String,R> variable : inputs){
            //if((String)variable.getLeftHandSide())
        }
*/
        return null;
    }
    Expression<L,R,P> processVariableInitialization(BenefitParser.VariableInitializerContext variableInitializerContext){
        if(null != variableInitializerContext.arrayInitializer()){
            Expression<L,R,P> lhs = processArrayInitialization(variableInitializerContext.arrayInitializer());
        }else if( null != variableInitializerContext.expression()){
            Expression<L,R,P> lhs =processExpression(variableInitializerContext.expression());
        }
        return null;
    }
    Expression<L,R,P> processArrayInitialization(BenefitParser.ArrayInitializerContext arrayInitializerContext){
        return null;
    }

    Expression<L,R,P> processAdditiveExpression(BenefitParser.AdditiveExpressionContext additiveExpressionContext) {
        if (null != additiveExpressionContext.multiplicativeExpression(0)) {
            Expression<L, R, P> lhs = processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression(0));
            if (null != additiveExpressionContext.ADD() &&
                    !additiveExpressionContext.ADD().isEmpty() &&
                    null != additiveExpressionContext.multiplicativeExpression() &&
                    !additiveExpressionContext.multiplicativeExpression().isEmpty()) {
                for (BenefitParser.MultiplicativeExpressionContext multiplicativeExpressionContext : additiveExpressionContext.multiplicativeExpression()) {
                    Expression<L, R, P> rhs = processMultiplicationExpression(multiplicativeExpressionContext);
                }
            } else if (null != additiveExpressionContext.SUB() &&
                    !additiveExpressionContext.SUB().isEmpty() &&
                    null != additiveExpressionContext.multiplicativeExpression() &&
                    !additiveExpressionContext.multiplicativeExpression().isEmpty()) {
                for (BenefitParser.MultiplicativeExpressionContext multiplicativeExpressionContext : additiveExpressionContext.multiplicativeExpression()) {
                    Expression<L, R, P> rhs = processMultiplicationExpression(multiplicativeExpressionContext);
                }
            }

        }
        return null;
    }

    Expression<L,R,P> processMultiplicationExpression(BenefitParser.MultiplicativeExpressionContext multiplicativeExpressionContext) {
        if (null != multiplicativeExpressionContext.unaryExpression(0)) {
            Expression<L, R, P> lhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression(0));
            if (null != multiplicativeExpressionContext.MUL() &&
                    !multiplicativeExpressionContext.MUL().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (BenefitParser.UnaryExpressionContext unaryExpressionContext : multiplicativeExpressionContext.unaryExpression()) {
                    Expression<L, R, P> rhs = processUnaryExpression(unaryExpressionContext);
                }
            } else if (null != multiplicativeExpressionContext.DIV() &&
                    !multiplicativeExpressionContext.DIV().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (BenefitParser.UnaryExpressionContext unaryExpressionContext : multiplicativeExpressionContext.unaryExpression()) {
                    Expression<L, R, P> rhs = processUnaryExpression(unaryExpressionContext);
                }
            } else if (null != multiplicativeExpressionContext.MOD() &&
                    !multiplicativeExpressionContext.MOD().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (BenefitParser.UnaryExpressionContext unaryExpressionContext : multiplicativeExpressionContext.unaryExpression()) {
                    Expression<L, R, P> rhs = processUnaryExpression(unaryExpressionContext);
                }
            }
        }
        return null;
    }

    Expression<L, R, P> processUnaryExpression (BenefitParser.UnaryExpressionContext unaryExpressionContext){
        BenefitParser.LiteralContext literalContext = unaryExpressionContext.primary().literal();
        if(null != literalContext) {
            if (null != literalContext.NUMBER()) {
                Number literalNumericValue = Double.parseDouble(literalContext.NUMBER().getText());
                UnaryExpression<Number> numericUnaryExpression = new UnaryExpression<Number>(literalNumericValue);
                return (Expression<L, R, P>) numericUnaryExpression;
            } else if (null != literalContext.StringLiteral()) {
                String literalStringValue = literalContext.StringLiteral().getText();
                UnaryExpression<String> stringUnaryExpression = new UnaryExpression<>(literalStringValue);
                return (Expression<L, R, P>) stringUnaryExpression;
            } else if (null != literalContext.BooleanLiteral()) {
                Boolean literalBooleanValue = Boolean.parseBoolean(literalContext.BooleanLiteral().getText());
                UnaryExpression<Boolean> booleanUnaryExpression = new UnaryExpression<>(literalBooleanValue);
                return (Expression<L, R, P>) booleanUnaryExpression;
            } else {
                String literalStringValue = literalContext.NullLiteral().getText();
                UnaryExpression<String> stringUnaryExpression = new UnaryExpression<>(literalStringValue);
                return (Expression<L, R, P>) stringUnaryExpression;
            }
        }else if(null != unaryExpressionContext.primary().IDENTIFIER()){
            return null;
        }
        return null;
    }
}
