package com.affaince.benefit;

import com.affaince.benefit.scheme.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;


public class ExpressionBuilder {
    private final Scheme scheme;
    public ExpressionBuilder(Scheme scheme){
        this.scheme=scheme;
    }
    public Expression buildExpression(BenefitParser.ExpressionContext expressionContext) {
        return processExpression(expressionContext);
    }

    private Expression processExpression(BenefitParser.ExpressionContext expressionContext) {
        if (null != expressionContext.conditionalExpression()) {
            Expression lhs = processConditionalExpression(expressionContext.conditionalExpression());
            if (null != expressionContext.ASSIGN() && null != expressionContext.expression()) {
                Expression rhs = processExpression(expressionContext.expression());
                return new ArithmeticExpression(ArithmeticOperator.ASSIGN, lhs, rhs);
            } else {
                return lhs;
            }
        }
        return null;
    }

    private Expression processConditionalExpression(BenefitParser.ConditionalExpressionContext conditionalExpressionContext) {
        Expression rhs = null;
        if (null != conditionalExpressionContext.conditionalOrExpression()) {
            Expression preExpression = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
            if (null != conditionalExpressionContext.QUESTIONMARK() && null != conditionalExpressionContext.expression()) {
                Expression lhs = processExpression(conditionalExpressionContext.expression());
                if (null != conditionalExpressionContext.COLON() && null != conditionalExpressionContext.conditionalExpression()) {
                    rhs = processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                }
                Expression resultExpression = new ArithmeticExpression(null, lhs, rhs);
                resultExpression.setPreExpression(preExpression);
                return resultExpression;
            } else {
                return preExpression;
            }
        }
        return null;
    }

    Expression processConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext conditionalOrExpressionContext) {
        if (null != conditionalOrExpressionContext.conditionalAndExpression() && !conditionalOrExpressionContext.conditionalAndExpression().isEmpty()) {
            Expression lhsExpression = processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression(0));
            if (null != conditionalOrExpressionContext.ORSTR() &&
                    !conditionalOrExpressionContext.ORSTR().isEmpty() &&
                    null != conditionalOrExpressionContext.conditionalAndExpression() &&
                    !conditionalOrExpressionContext.conditionalAndExpression().isEmpty()) {
                for (int i = 1; i < conditionalOrExpressionContext.conditionalAndExpression().size(); i++) {
                    lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.OR, lhsExpression, processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression().get(i)));
                }
            }
            return lhsExpression;
        }
        return null;
    }

    Expression processConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext) {
        if (null != conditionalAndExpressionContext.relationalExpression() && !conditionalAndExpressionContext.relationalExpression().isEmpty()) {
            Expression lhsExpression = processRelationalExpression(conditionalAndExpressionContext.relationalExpression(0));
            if (null != conditionalAndExpressionContext.ANDSTR() &&
                    !conditionalAndExpressionContext.ANDSTR().isEmpty() &&
                    null != conditionalAndExpressionContext.relationalExpression() &&
                    !conditionalAndExpressionContext.relationalExpression().isEmpty()) {
                for (int i = 1; i < conditionalAndExpressionContext.relationalExpression().size(); i++) {
                    lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.AND, lhsExpression, processRelationalExpression(conditionalAndExpressionContext.relationalExpression().get(i)));
                }
            }
            return lhsExpression;
        }
        return null;
    }

    Expression processRelationalExpression(BenefitParser.RelationalExpressionContext relationalExpressionContext) {
        if (null != relationalExpressionContext.additiveExpression() && !relationalExpressionContext.additiveExpression().isEmpty()) {
            Expression lhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression(0));
            if (null != relationalExpressionContext.relationalOp() &&
                    !relationalExpressionContext.relationalOp().isEmpty() &&
                    null != relationalExpressionContext.additiveExpression() &&
                    !relationalExpressionContext.additiveExpression().isEmpty()) {

                for (int i = 1; i < relationalExpressionContext.additiveExpression().size(); i++) {
                    BenefitParser.RelationalOpContext relationalOp = relationalExpressionContext.relationalOp(i);
                    lhsExpression = new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOp), lhsExpression, processAdditiveExpression(relationalExpressionContext.additiveExpression().get(i)));
                }
            }
            return lhsExpression;
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
            }
            return lhsExpression;
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
        if (null != iterativeStatementContext.EACH()) {
            if (null != iterativeStatementContext.expression()) {
                //the only possibility here is the comparison of some variable/value with EACH element of the array
                //hardcoded obtaining of relational context should suffice.
                BenefitParser.RelationalExpressionContext relationalExpressionContext = iterativeStatementContext.expression().conditionalExpression().
                        conditionalOrExpression().conditionalAndExpression(0).relationalExpression(0);
                List<BenefitParser.AdditiveExpressionContext> additiveExpressionContexts = relationalExpressionContext.additiveExpression();

                //LHS : in case of EACH lhs is always a variable who is an array;
                BenefitParser.PrimaryContext lhsPrimaryContext = additiveExpressionContexts.get(0).multiplicativeExpression(0).unaryExpression(0).primary();
                String lhsCollectionVariableName = lhsPrimaryContext.IDENTIFIER().getText();
                Expression lhsVariableExpression = searchVariableExpressionInGivenUnit(lhsCollectionVariableName);

                //RELATIONALOP : in case of each only one relationalOp
                BenefitParser.RelationalOpContext relationalOpContext = relationalExpressionContext.relationalOp(0);

                //RHS: Single primary value or variable Name
                BenefitParser.PrimaryContext rhsPrimaryContext = additiveExpressionContexts.get(1).multiplicativeExpression(0).unaryExpression(0).primary();
                if (null != rhsPrimaryContext.IDENTIFIER()) {
                    String rhsVariableName = lhsPrimaryContext.IDENTIFIER().getText();
                    Expression rhsVariableExpression = searchVariableExpressionInGivenUnit(rhsVariableName);
                    return new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOpContext), lhsVariableExpression, rhsVariableExpression);
                } else if (null != rhsPrimaryContext.literal()) {
                    Integer value = Integer.parseInt(rhsPrimaryContext.literal().NUMBER().getText());
                    UnaryExpression rhsUnaryExpression = new UnaryExpression(value);
                    return new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOpContext), lhsVariableExpression, rhsUnaryExpression);
                }
            }
        }
        return null;
    }

    private Expression searchVariableExpressionInGivenUnit(String variableName) {
       List<Expression> variableExpressionsQueue = this.scheme.getGivenUnit().getExpressionQueue();
       for(Expression expression: variableExpressionsQueue){
           String inputVariableName= (String)expression.getLeftHandSide().apply();
           if(inputVariableName.equals(variableName)){
               return expression;
           }
       }
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
                        //Put InputValuePlaceHolder here as at the time of parsing the tree the variable value in absent
                        UnaryExpression value = new UnaryExpression(new InputValuePlaceHolder(variableName));
                        return new VariableExpression(new UnaryExpression(variableName),value);
                    }
                } else {
                    if (null != variableDeclarationStatementContext.ASSIGN()) {   //assignment statement
                        return buildNonArrayVariable(variableName, variableInitializerContext);
                    } else if (null != variableDeclarationStatementContext.ASINPUT()) {
                        //Put InputValuePlaceHolder here as at the time of parsing the tree the variable value in absent
                        UnaryExpression value = new UnaryExpression(new InputValuePlaceHolder(variableName));
                        return new VariableExpression(new UnaryExpression(variableName),value);
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
                for (int i=1; i< additiveExpressionContext.multiplicativeExpression().size();i++) {
                    Expression rhs = processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression().get(i));
                    lhs = new ArithmeticExpression(ArithmeticOperator.ADDITION,lhs,rhs);
                }
            } else if (null != additiveExpressionContext.SUB() &&
                    !additiveExpressionContext.SUB().isEmpty() &&
                    null != additiveExpressionContext.multiplicativeExpression() &&
                    !additiveExpressionContext.multiplicativeExpression().isEmpty()) {
                for (int i=1; i< additiveExpressionContext.multiplicativeExpression().size();i++) {
                    Expression rhs = processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression().get(i));
                    lhs = new ArithmeticExpression(ArithmeticOperator.SUBTRACTION,lhs,rhs);
                }
            }
            return lhs;
        }else if(null != additiveExpressionContext.iterativeAggregationExpression()){
            return processIterativeAggregationExpression(additiveExpressionContext.iterativeAggregationExpression());
        }
        return null;
    }

    private Expression processIterativeAggregationExpression(BenefitParser.IterativeAggregationExpressionContext iterativeAggregationExpressionContext){
        if(null != iterativeAggregationExpressionContext.SUMOF() && null != iterativeAggregationExpressionContext.EACH()){
            if(null != iterativeAggregationExpressionContext.variableDeclarationStatement()){
                String variableName = iterativeAggregationExpressionContext.variableDeclarationStatement().variableDeclaratorId().IDENTIFIER().getText();
                Expression lhsVariableExpression = searchVariableExpressionInGivenUnit(variableName);
                return  lhsVariableExpression;
            }else if(null != iterativeAggregationExpressionContext.expression()){
                BenefitParser.ExpressionContext expressionContext =iterativeAggregationExpressionContext.expression();
                TerminalNode LHS_IDENTIFIER = expressionContext.conditionalExpression().conditionalOrExpression().conditionalAndExpression(0).relationalExpression(0).additiveExpression(0).multiplicativeExpression(0).unaryExpression(0).primary().IDENTIFIER();
                if( null != LHS_IDENTIFIER){
                    String lhsVariableName = LHS_IDENTIFIER.getText();
                   TerminalNode RHS_IDENTIFIER = expressionContext.conditionalExpression().conditionalOrExpression().conditionalAndExpression(0).relationalExpression(0).additiveExpression(0).iterativeAggregationExpression().variableDeclarationStatement().variableDeclaratorId().IDENTIFIER();
                   if(null != RHS_IDENTIFIER){
                       String rhsVariableName = RHS_IDENTIFIER.getText();
                        Expression rhsVariableExpression = searchVariableExpressionInGivenUnit(rhsVariableName);
                      return new ArithmeticExpression(ArithmeticOperator.LOOPADDITION,rhsVariableExpression,null);
                   }
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
                for (int i=1;i<multiplicativeExpressionContext.unaryExpression().size();i++) {
                    Expression rhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression().get(i));
                    lhs = new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION,lhs,rhs);
                }
            } else if (null != multiplicativeExpressionContext.DIV() &&
                    !multiplicativeExpressionContext.DIV().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (int i=1;i<multiplicativeExpressionContext.unaryExpression().size();i++) {
                    Expression rhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression().get(i));
                    lhs = new ArithmeticExpression(ArithmeticOperator.DIVISION,lhs,rhs);
                }
            } else if (null != multiplicativeExpressionContext.MOD() &&
                    !multiplicativeExpressionContext.MOD().isEmpty() &&
                    null != multiplicativeExpressionContext.unaryExpression() &&
                    !multiplicativeExpressionContext.unaryExpression().isEmpty()) {
                for (int i=1;i<multiplicativeExpressionContext.unaryExpression().size();i++) {
                    Expression rhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression().get(i));
                    lhs = new ArithmeticExpression(ArithmeticOperator.MODULUS,lhs,rhs);
                }
            }
            return lhs;
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
