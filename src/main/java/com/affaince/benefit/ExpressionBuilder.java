package com.affaince.benefit;

import com.affaince.benefit.scheme.*;

import java.util.ArrayList;
import java.util.List;


public class ExpressionBuilder {
    public Expression buildExpression(BenefitParser.ExpressionContext expressionContext) {
        return processExpression(expressionContext);
    }

    private Expression processExpression(BenefitParser.ExpressionContext expressionContext) {
        if (null != expressionContext.conditionalExpression()) {
            Expression lhs = processConditionalExpression(expressionContext.conditionalExpression());
            if (null != expressionContext.ASSIGN() && null != expressionContext.expression()) {
                Expression rhs = processExpression(expressionContext.expression());
                return  new ArithmeticExpression(ArithmeticOperator.ASSIGN, lhs, rhs);
            }else{
                return lhs;
            }
        }
        return null;
    }

    private Expression processConditionalExpression(BenefitParser.ConditionalExpressionContext conditionalExpressionContext) {
        Expression lhs = null;
        Expression rhs = null;
        if (null != conditionalExpressionContext.conditionalOrExpression()) {
            if (null != conditionalExpressionContext.QUESTIONMARK() && null != conditionalExpressionContext.expression()) {
                ArithmeticComparisonExpression preExpression = (ArithmeticComparisonExpression)processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
                lhs = processExpression(conditionalExpressionContext.expression());
                if (null != conditionalExpressionContext.COLON() && null != conditionalExpressionContext.conditionalExpression()) {
                    rhs = processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                }
                Expression resultExpression = new ArithmeticExpression(null, lhs, rhs);
                resultExpression.setPreExpression(preExpression);
                return resultExpression;
            } else {
                Expression arithmeticExpression = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
                return arithmeticExpression;
            }
        }
        return null;
    }

    Expression processConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext conditionalOrExpressionContext) {
        if (null != conditionalOrExpressionContext.conditionalAndExpression(0)) {
            Expression lhsExpression = processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression(0));
            if (null != conditionalOrExpressionContext.ORSTR() &&
                    !conditionalOrExpressionContext.ORSTR().isEmpty() &&
                    null != conditionalOrExpressionContext.conditionalAndExpression() &&
                    !conditionalOrExpressionContext.conditionalAndExpression().isEmpty()) {
                for (int i=1;i< conditionalOrExpressionContext.conditionalAndExpression().size();i++) {
                    lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.OR, lhsExpression, processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression().get(i)));
                }
                return lhsExpression;
            } else {
                return lhsExpression;
            }
        }
        return null;
    }

    Expression processConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext) {
        if (null != conditionalAndExpressionContext.relationalExpression(0)) {
            Expression lhsExpression = processRelationalExpression(conditionalAndExpressionContext.relationalExpression(0));
            if (null != conditionalAndExpressionContext.ANDSTR() &&
                    !conditionalAndExpressionContext.ANDSTR().isEmpty() &&
                    null != conditionalAndExpressionContext.relationalExpression() &&
                    !conditionalAndExpressionContext.relationalExpression().isEmpty()) {
                for (int i=1;i < conditionalAndExpressionContext.relationalExpression().size();i++) {
                    lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.AND, lhsExpression, processRelationalExpression(conditionalAndExpressionContext.relationalExpression().get(i)));
                }
                return lhsExpression;
            } else {
                return lhsExpression;
            }
        }
        return null;
    }

    Expression processRelationalExpression(BenefitParser.RelationalExpressionContext relationalExpressionContext) {
        if (null != relationalExpressionContext.additiveExpression(0)) {
            Expression lhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression(0));
            if (null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    !relationalExpressionContext.additiveExpression().isEmpty()) {

                for (int i = 1; i < relationalExpressionContext.additiveExpression().size(); i++) {
                    BenefitParser.RelationalOpContext relationalOp = relationalExpressionContext.relationalOp(i);
                    lhsExpression = new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOp), lhsExpression, processAdditiveExpression(relationalExpressionContext.additiveExpression().get(i)));
                }
                return lhsExpression;
            } else {
                return lhsExpression;
            }
        } else if (null != relationalExpressionContext.iterativeStatement()) {
            Expression lhsExpression = processIterativeStatement(relationalExpressionContext.iterativeStatement());
            if (null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    !relationalExpressionContext.additiveExpression().isEmpty()) {

                for (int i = 0; i < relationalExpressionContext.additiveExpression().size(); i++) {
                    BenefitParser.RelationalOpContext relationalOp = relationalExpressionContext.relationalOp(i);
                    lhsExpression = new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOp), lhsExpression, processAdditiveExpression(relationalExpressionContext.additiveExpression().get(i)));
                }
                return lhsExpression;
            } else {
                return lhsExpression;
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

    private Expression processIterativeStatement(BenefitParser.IterativeStatementContext iterativeStatementContext) {

        /*       if (null != iterativeStatementContext.SUMOF()) {

            if (null != iterativeStatementContext.EACH() && null != iterativeStatementContext.variableDeclarationStatement()) {
                VariableExpression variableExpression = (VariableExpression)processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement());
                List<Expression> arrayElements = (List<Expression>)variableExpression.getRightHandSide();
                Expression lhsElement = arrayElements.get(0);
                for(int i=1;i<arrayElements.size();i++){
                    lhsElement = new ArithmeticExpression(ArithmeticOperator.ADDITION, lhsElement,arrayElements.get(i));
                }
                return lhsElement;
            }
        } else if (null != iterativeStatementContext.EACH() )
            if(null != iterativeStatementContext.variableDeclarationStatement()) {
                //it will never have only variable declaration statement
                //Expression lhs = processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement());
            }else if(null != iterativeStatementContext.statement()) {
                //the only possibility here is the comparison of soe variable/value with EACH element of the array
                BenefitParser.RelationalExpressionContext relationalExpressionContext = iterativeStatementContext.statement().statementExpression().expression().conditionalExpression().conditionalOrExpression().conditionalAndExpression(0).relationalExpression(0);
                VariableExpression variableExpression = (VariableExpression)processVariableDeclaration(iterativeStatementContext.variableDeclarationStatement());
                List<Expression> arrayElements = (List<Expression>)variableExpression.getRightHandSide();
                Expression lhsElement = arrayElements.get(0);
                for(int i=1;i<arrayElements.size();i++){
                    lhsElement = new ArithmeticExpression(ArithmeticOperator.ADDITION, lhsElement,arrayElements.get(i));
                }
            }
        } */
        return null;
    }

    private Expression buildArrayVariable(String variableName, BenefitParser.VariableInitializerContext variableInitializerContext) {
        List<Expression> arrayElements = new ArrayList<>();
        List<BenefitParser.VariableInitializerContext> initializerContexts = variableInitializerContext.arrayInitializer().variableInitializer();
        for (BenefitParser.VariableInitializerContext initializerContext : initializerContexts) {
            Expression expression = processExpression(initializerContext.expression());
            arrayElements.add(expression);
        }
        return new VariableExpression(new UnaryExpression(variableName), new UnaryExpression(arrayElements));
    }

    private Expression buildNonArrayVariable(String variableName, BenefitParser.VariableInitializerContext variableInitializerContext) {
        BenefitParser.ExpressionContext initializerContext = variableInitializerContext.expression();
        Expression unaryExpression = processExpression(initializerContext.expression());
        return new VariableExpression(new UnaryExpression(variableName), unaryExpression);
    }

    public Expression processVariableDeclaration(BenefitParser.VariableDeclarationStatementContext variableDeclarationStatementContext) {
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


    Expression processAdditiveExpression(BenefitParser.AdditiveExpressionContext additiveExpressionContext) {
        if (null != additiveExpressionContext.multiplicativeExpression(0)) {
            Expression lhs = processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression(0));
            if (null != additiveExpressionContext.ADD() &&
                    !additiveExpressionContext.ADD().isEmpty() &&
                    null != additiveExpressionContext.multiplicativeExpression() &&
                    !additiveExpressionContext.multiplicativeExpression().isEmpty()) {
                for (BenefitParser.MultiplicativeExpressionContext multiplicativeExpressionContext : additiveExpressionContext.multiplicativeExpression()) {
                    Expression rhs = processMultiplicationExpression(multiplicativeExpressionContext);
                }
            } else if (null != additiveExpressionContext.SUB() &&
                    !additiveExpressionContext.SUB().isEmpty() &&
                    null != additiveExpressionContext.multiplicativeExpression() &&
                    !additiveExpressionContext.multiplicativeExpression().isEmpty()) {
                for (BenefitParser.MultiplicativeExpressionContext multiplicativeExpressionContext : additiveExpressionContext.multiplicativeExpression()) {
                    Expression rhs = processMultiplicationExpression(multiplicativeExpressionContext);
                }
            }

        }
        return null;
    }

    Expression processMultiplicationExpression(BenefitParser.MultiplicativeExpressionContext
                                                                multiplicativeExpressionContext) {
        if (null != multiplicativeExpressionContext.unaryExpression(0)) {
            Expression lhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression(0));
            if (null != multiplicativeExpressionContext.MUL() &&
                    !multiplicativeExpressionContext.MUL().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (BenefitParser.UnaryExpressionContext unaryExpressionContext : multiplicativeExpressionContext.unaryExpression()) {
                    Expression rhs = processUnaryExpression(unaryExpressionContext);
                }
            } else if (null != multiplicativeExpressionContext.DIV() &&
                    !multiplicativeExpressionContext.DIV().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (BenefitParser.UnaryExpressionContext unaryExpressionContext : multiplicativeExpressionContext.unaryExpression()) {
                    Expression rhs = processUnaryExpression(unaryExpressionContext);
                }
            } else if (null != multiplicativeExpressionContext.MOD() &&
                    !multiplicativeExpressionContext.MOD().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (BenefitParser.UnaryExpressionContext unaryExpressionContext : multiplicativeExpressionContext.unaryExpression()) {
                    Expression rhs = processUnaryExpression(unaryExpressionContext);
                }
            }
        }
        return null;
    }

    Expression processUnaryExpression(BenefitParser.UnaryExpressionContext unaryExpressionContext) {
        BenefitParser.LiteralContext literalContext = unaryExpressionContext.primary().literal();
        if (null != literalContext) {
            if (null != literalContext.NUMBER()) {
                Number literalNumericValue = Double.parseDouble(literalContext.NUMBER().getText());
                UnaryExpression numericUnaryExpression = new UnaryExpression(literalNumericValue);
                return numericUnaryExpression;
            } else if (null != literalContext.StringLiteral()) {
                String literalStringValue = literalContext.StringLiteral().getText();
                UnaryExpression stringUnaryExpression = new UnaryExpression(literalStringValue);
                return stringUnaryExpression;
            } else if (null != literalContext.BooleanLiteral()) {
                Boolean literalBooleanValue = Boolean.parseBoolean(literalContext.BooleanLiteral().getText());
                UnaryExpression booleanUnaryExpression = new UnaryExpression(literalBooleanValue);
                return booleanUnaryExpression;
            } else {
                String literalStringValue = literalContext.NullLiteral().getText();
                UnaryExpression stringUnaryExpression = new UnaryExpression(literalStringValue);
                return stringUnaryExpression;
            }
        } else if (null != unaryExpressionContext.primary().IDENTIFIER()) {
            return null;
        }
        return null;
    }
}
