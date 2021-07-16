package com.affaince.benefit;

import com.affaince.benefit.scheme.*;

import java.util.ArrayList;
import java.util.List;


public class ExpressionBuilder<L, R, P> {
    public Expression<L, R, P> buildExpression(BenefitParser.ExpressionContext expressionContext) {
        return processExpression(expressionContext);
    }

    private Expression<L, R, P> processExpression(BenefitParser.ExpressionContext expressionContext) {
        //first check for expression type

        if (null != expressionContext.conditionalExpression()) {
            Expression<L, R, P> lhs = processConditionalExpression(expressionContext.conditionalExpression());
            if (null != expressionContext.ASSIGN() && null != expressionContext.expression()) {
                Expression<L, R, P> rhs = processExpression(expressionContext.expression());
                return (Expression<L, R, P>) new ArithmeticExpression<>(ArithmeticOperator.ASSIGN, lhs, rhs);
            }
        }
        return null;
    }

    Expression<L, R, P> processConditionalExpression(BenefitParser.ConditionalExpressionContext conditionalExpressionContext) {
        Expression<L, R, P> lhs = null;
        Expression<L, R, P> rhs = null;
        if (null != conditionalExpressionContext.conditionalOrExpression()) {
            if (null != conditionalExpressionContext.QUESTIONMARK() && null != conditionalExpressionContext.expression()) {
                ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>> preExpression = (ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>) processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
                lhs = processExpression(conditionalExpressionContext.expression());
                if (null != conditionalExpressionContext.COLON() && null != conditionalExpressionContext.conditionalExpression()) {
                    rhs = processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                }
                Expression<L, R, P> resultExpression = (Expression<L, R, P>) new ArithmeticExpression<Expression, Expression, Expression>(null, lhs, rhs);
                resultExpression.setPreExpression((Expression<L, R, P>) preExpression);
                return resultExpression;
            } else {
                Expression<L, R, P> arithmeticExpression = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
                return arithmeticExpression;
            }
        }
        return null;
    }

    Expression<L, R, P> processConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext conditionalOrExpressionContext) {
        if (null != conditionalOrExpressionContext.conditionalAndExpression(0)) {
            if (null != conditionalOrExpressionContext.ORSTR() &&
                    !conditionalOrExpressionContext.ORSTR().isEmpty() &&
                    null != conditionalOrExpressionContext.conditionalAndExpression() &&
                    !conditionalOrExpressionContext.conditionalAndExpression().isEmpty()) {
                ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>> lhsExpression = (ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>) processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression(0));
                for (BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext : conditionalOrExpressionContext.conditionalAndExpression()) {
                    lhsExpression = new ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>(ArithmeticOperator.OR, lhsExpression, processConditionalAndExpression(conditionalAndExpressionContext));
                }
                return (Expression<L, R, P>) lhsExpression;
            } else {
                Expression<L, R, P> arithmeticExpression = processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression(0));
                return arithmeticExpression;
            }
        }
        return null;
    }

    Expression<L, R, P> processConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext) {
        if (null != conditionalAndExpressionContext.relationalExpression(0)) {
            if (null != conditionalAndExpressionContext.ANDSTR() &&
                    !conditionalAndExpressionContext.ANDSTR().isEmpty() &&
                    null != conditionalAndExpressionContext.relationalExpression() &&
                    !conditionalAndExpressionContext.relationalExpression().isEmpty()) {
                ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>> lhsExpression = (ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>) processRelationalExpression(conditionalAndExpressionContext.relationalExpression(0));
                for (BenefitParser.RelationalExpressionContext relationalExpressionContext : conditionalAndExpressionContext.relationalExpression()) {
                    lhsExpression = new ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>(ArithmeticOperator.AND, lhsExpression, processRelationalExpression(relationalExpressionContext));
                }
                return (Expression<L, R, P>) lhsExpression;
            } else {
                Expression<L, R, P> arithmeticExpression = processRelationalExpression(conditionalAndExpressionContext.relationalExpression(0));
                return arithmeticExpression;
            }
        }
        return null;
    }

    Expression<L, R, P> processRelationalExpression(BenefitParser.RelationalExpressionContext relationalExpressionContext) {
        if (null != relationalExpressionContext.additiveExpression(0)) {
            if (null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    !relationalExpressionContext.additiveExpression().isEmpty()) {
                Expression<L, R, P> lhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression(0));
                for (int i = 0; i < relationalExpressionContext.additiveExpression().size(); i++) {
                    BenefitParser.RelationalOpContext relationalOp = relationalExpressionContext.relationalOp(i);
                    lhsExpression = (Expression<L, R, P>) new ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>(resolveOperatorForRelationalContext(relationalOp), lhsExpression, processAdditiveExpression(relationalExpressionContext.additiveExpression().get(i)));
                }
                return lhsExpression;
            } else {
                Expression<L, R, P> arithmeticExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression(0));
                return arithmeticExpression;
            }
        } else if (null != relationalExpressionContext.iterativeStatement()) {

            if (null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    !relationalExpressionContext.additiveExpression().isEmpty()) {
                Expression<L, R, P> lhsExpression = processIterativeStatement(relationalExpressionContext.iterativeStatement());
                for (int i = 0; i < relationalExpressionContext.additiveExpression().size(); i++) {
                    BenefitParser.RelationalOpContext relationalOp = relationalExpressionContext.relationalOp(i);
                    lhsExpression = (Expression<L, R, P>) new ArithmeticComparisonExpression<Expression, Expression, UnaryExpression<Boolean>>(resolveOperatorForRelationalContext(relationalOp), lhsExpression, processAdditiveExpression(relationalExpressionContext.additiveExpression().get(i)));
                }
                return lhsExpression;
            } else {
                Expression<L, R, P> arithmeticExpression = processIterativeStatement(relationalExpressionContext.iterativeStatement());
                return arithmeticExpression;
            }
        }
        return null;
    }

    private ArithmeticOperator resolveOperatorForRelationalContext(BenefitParser.RelationalOpContext relationalOpContext) {
        if (null != relationalOpContext.EQUAL()) {
            return ArithmeticOperator.EQUALTO;
        } else if (null != relationalOpContext.LT()) {
            return ArithmeticOperator.LESSTHAN;
        } else if (null != relationalOpContext.LE()) {
            return ArithmeticOperator.LESSTHANEQUALTO;
        } else if (null != relationalOpContext.GT()) {
            return ArithmeticOperator.GREATERTHAN;
        } else if (null != relationalOpContext.GE()) {
            return ArithmeticOperator.GREATERTHANEQUALTO;
        } else if (null != relationalOpContext.NOTEQUAL()) {
            return ArithmeticOperator.NOTEQUALTO;
        }
        return null;
    }

    Expression<L, R, P> processIterativeStatement(BenefitParser.IterativeStatementContext iterativeStatementContext) {
        if (null != iterativeStatementContext.SUMOF()) {

            if (null != iterativeStatementContext.EACH() && null != iterativeStatementContext.variableDeclarationStatement()) {
                VariableExpression<String, Expression> variableExpression = (VariableExpression<String, Expression>)processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement());
                String variableName = variableExpression.getLeftHandSide();
                List<Expression<L, R, P>> arrayElements = (List<Expression<L, R, P>>)variableExpression.getRightHandSide();
                Expression<L, R, P> lhsElement = arrayElements.get(0);
                for(int i=1;i<arrayElements.size();i++){
                    lhsElement = (Expression<L, R, P>)new ArithmeticExpression<>(ArithmeticOperator.ADDITION, lhsElement,arrayElements.get(i));
                }
                return lhsElement;
            }
        } else if (null != iterativeStatementContext.EACH() && null != iterativeStatementContext.variableDeclarationStatement()) {
            Expression<L, R, P> lhs = processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement());
        }
        return null;
    }

    private Expression<L, R, P> buildArrayVariable(String variableName, BenefitParser.VariableInitializerContext variableInitializerContext) {
        List<Expression<L, R, P>> arrayElements = new ArrayList<>();
        List<BenefitParser.VariableInitializerContext> initializerContexts = variableInitializerContext.arrayInitializer().variableInitializer();
        for (BenefitParser.VariableInitializerContext initializerContext : initializerContexts) {
            Expression<L, R, P> expression = processExpression(initializerContext.expression());
            arrayElements.add(expression);
        }
        return (Expression<L, R, P>) new VariableExpression<String, UnaryExpression<List<Expression<L, R, P>>>>(variableName, new UnaryExpression<List<Expression<L, R, P>>>(arrayElements));
    }

    private Expression<L, R, P> buildNonArrayVariable(String variableName, BenefitParser.VariableInitializerContext variableInitializerContext) {
        BenefitParser.ExpressionContext initializerContext = variableInitializerContext.expression();
        Expression<L, R, P> unaryExpression = processExpression(initializerContext.expression());
        return (Expression<L, R, P>) new VariableExpression<String, Expression<L, R, P>>(variableName, unaryExpression);
    }

    public Expression<L, R, P> processVariableDeclaration(BenefitParser.VariableDeclarationStatementContext variableDeclarationStatementContext) {
        if (null != variableDeclarationStatementContext) {
            BenefitParser.VariableInitializerContext variableInitializerContext = variableDeclarationStatementContext.variableInitializer();
            if (null != variableDeclarationStatementContext.variableDeclaratorId()) {
                BenefitParser.VariableDeclaratorIdContext variableDeclaratorIdContext = variableDeclarationStatementContext.variableDeclaratorId();
                String variableName = variableDeclaratorIdContext.IDENTIFIER().getText();
                if (null != variableDeclaratorIdContext.LBRACK() && null != variableDeclaratorIdContext.RBRACK()) {      //it is an array
                    if (null != variableDeclarationStatementContext.ASSIGN()) {   //assignment statement
                        return buildArrayVariable(variableName, variableInitializerContext);
                    } else if (null != variableDeclarationStatementContext.ASINPUT()) {
                        //TODO
                        return null;
                    }
                } else {
                    if (null != variableDeclarationStatementContext.ASSIGN()) {   //assignment statement
                        return buildNonArrayVariable(variableName, variableInitializerContext);
                    } else if (null != variableDeclarationStatementContext.ASINPUT()) {
                        //TODO
                        return null;
                    }
                }
            }
        }
        return null;
    }


    Expression<L, R, P> processAdditiveExpression(BenefitParser.AdditiveExpressionContext additiveExpressionContext) {
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

    Expression<L, R, P> processMultiplicationExpression(BenefitParser.MultiplicativeExpressionContext
                                                                multiplicativeExpressionContext) {
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

    Expression<L, R, P> processUnaryExpression(BenefitParser.UnaryExpressionContext unaryExpressionContext) {
        BenefitParser.LiteralContext literalContext = unaryExpressionContext.primary().literal();
        if (null != literalContext) {
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
        } else if (null != unaryExpressionContext.primary().IDENTIFIER()) {
            return null;
        }
        return null;
    }
}
