package com.affaince.benefit;

import com.affaince.benefit.scheme.Expression;
import com.affaince.benefit.scheme.VariableExpression;

import java.util.List;

public class ExpressionBuilder<L,R,P> {
    private List<VariableExpression<L,R>> inputs;
    public Expression<L,R,P> buildExpression(BenefitParser.ExpressionContext expressionContext, List<VariableExpression<L,R>> inputs){
        this.inputs = inputs;
        processExpression(expressionContext);
        return null;
    }
    private Expression<L,R,P> processExpression(BenefitParser.ExpressionContext expressionContext){
        //first check for expression type

        if(null != expressionContext.conditionalExpression()){
            Expression<L,R,P> lhs = processConditionalExpression(expressionContext.conditionalExpression());
            if(null != expressionContext.ASSIGN() && null != expressionContext.expression()){
                Expression<L,R,P> rhs = processExpression(expressionContext.expression());
            }
        }
        return null;
    }

    Expression <L,R,P> processConditionalExpression(BenefitParser.ConditionalExpressionContext conditionalExpressionContext) {
        if(null != conditionalExpressionContext.conditionalOrExpression()){
            Expression<L,R,P> lhs = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
            if(null != conditionalExpressionContext.QUESTIONMARK() && null !=conditionalExpressionContext.expression() ){
                Expression<L,R,P> rhs1 = processExpression(conditionalExpressionContext.expression());
                if(null != conditionalExpressionContext.COLON() && null!= conditionalExpressionContext.conditionalExpression()){
                    Expression<L,R,P> rhs2 = processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                }
            }
        }
        return null;
    }

    Expression <L,R,P> processConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext conditionalOrExpressionContext) {
        if(null != conditionalOrExpressionContext.conditionalAndExpression(0)){
            Expression<L,R,P> lhs = processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression(0));
            if(null != conditionalOrExpressionContext.ORSTR() &&
                    !conditionalOrExpressionContext.ORSTR().isEmpty() &&
                    null != conditionalOrExpressionContext.conditionalAndExpression() &&
                    !conditionalOrExpressionContext.conditionalAndExpression().isEmpty()){
                for(BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext: conditionalOrExpressionContext.conditionalAndExpression()) {
                    Expression<L, R, P> rhs = processConditionalAndExpression(conditionalAndExpressionContext);
                }
            }
        }
        return  null;
    }

    Expression<L,R,P> processConditionalAndExpression (BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext){
        if(null!= conditionalAndExpressionContext.relationalExpression(0)){
            Expression<L,R,P> lhs = processRelationalExpression(conditionalAndExpressionContext.relationalExpression(0));
            if(null != conditionalAndExpressionContext.ANDSTR() &&
                    !conditionalAndExpressionContext.ANDSTR().isEmpty() &&
                    null != conditionalAndExpressionContext.relationalExpression() &&
                    !conditionalAndExpressionContext.relationalExpression().isEmpty()){
                for(BenefitParser.RelationalExpressionContext relationalExpressionContext: conditionalAndExpressionContext.relationalExpression()) {
                    Expression<L, R, P> rhs = processRelationalExpression(relationalExpressionContext);
                }
            }
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
            Expression<L,R,P> rhs =processVariableInputInitiaization(variableName);
        }
        return null;
    }
    Expression<L,R,P> processVariableInputInitiaization(String variableName){
        for(VariableExpression<L,R> variable : inputs){
            //if((String)variable.getLeftHandSide())
        }
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

    Expression<L,R,P> processAdditiveExpression(BenefitParser.AdditiveExpressionContext additiveExpressionContext){
        return null;
    }
}
