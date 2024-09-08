package com.affaince.benefits.processors.reg;

import com.affaince.benefits.grammar.BenefitParser;
import com.affaince.benefits.scheme.Scheme;
import com.affaince.benefits.scheme.expressions.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;


public class ExpressionBuilder {
    private final Scheme scheme;

    public ExpressionBuilder(Scheme scheme) {
        this.scheme = scheme;
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
            Expression lhs = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
            if (null != conditionalExpressionContext.QUESTIONMARK() && null != conditionalExpressionContext.expression()) {
                //Expression lhs = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
                Expression preExpression = lhs;
                lhs = processExpression(conditionalExpressionContext.expression());
                if (null != conditionalExpressionContext.COLON() && null != conditionalExpressionContext.conditionalExpression()) {
                    rhs = processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                }
                Expression resultExpression = new ArithmeticExpression(ArithmeticOperator.TERNARY, lhs, rhs);
                resultExpression.setPreExpression(preExpression);
                return resultExpression;
            } else {
                return lhs;
            }
        } /*else {
            if (null != conditionalExpressionContext.QUESTIONMARK() && null != conditionalExpressionContext.expression()) {
                Expression lhs = processConditionalOrExpression(conditionalExpressionContext.conditionalOrExpression());
                Expression preExpression = lhs;
                lhs = processExpression(conditionalExpressionContext.expression());
                if (null != conditionalExpressionContext.COLON() && null != conditionalExpressionContext.conditionalExpression()) {
                    rhs = processConditionalExpression(conditionalExpressionContext.conditionalExpression());
                }
                Expression resultExpression = new ArithmeticExpression(ArithmeticOperator.TERNARY, lhs, rhs);
                resultExpression.setPreExpression(preExpression);
                return resultExpression;
            }
            return null;
        }*/
        return null;
    }

    Expression processConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext conditionalOrExpressionContext) {
        if (null != conditionalOrExpressionContext.connectorOr() && !conditionalOrExpressionContext.connectorOr().isEmpty()) {
            List<Expression> booleanExpressions = new ArrayList<>();
            BenefitParser.ConditionalOrExpressionContext childConditionalOrExpressionContext = conditionalOrExpressionContext.conditionalOrExpression();
            booleanExpressions.add(processConditionalOrExpression(conditionalOrExpressionContext.conditionalOrExpression()));
            if (null != childConditionalOrExpressionContext.conditionalAndExpression() && !childConditionalOrExpressionContext.conditionalAndExpression().isEmpty()) {
                booleanExpressions.add(processConditionalAndExpression(childConditionalOrExpressionContext.conditionalAndExpression()));
                return new ArithmeticComparisonExpression(ArithmeticOperator.OR, new UnaryExpression(booleanExpressions, UnaryType.OBJECT), null);
            }
        } else {
            return processConditionalAndExpression(conditionalOrExpressionContext.conditionalAndExpression());
        }
        return null;
    }

    Expression processConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext conditionalAndExpressionContext) {
        if (null != conditionalAndExpressionContext.connectorAnd() && !conditionalAndExpressionContext.connectorAnd().isEmpty()) {
            List<Expression> booleanExpressions = new ArrayList<>();
            BenefitParser.ConditionalAndExpressionContext childConditionAndExpression = conditionalAndExpressionContext.conditionalAndExpression();
            booleanExpressions.add(processConditionalAndExpression(childConditionAndExpression));
            if (null != childConditionAndExpression.relationalExpression() && !childConditionAndExpression.relationalExpression().isEmpty()) {
                booleanExpressions.add(processRelationalExpression(childConditionAndExpression.relationalExpression()));
                return new ArithmeticComparisonExpression(ArithmeticOperator.AND, new UnaryExpression(booleanExpressions, UnaryType.OBJECT), null);
            }
        } else {
            return processRelationalExpression(conditionalAndExpressionContext.relationalExpression());
        }
        return null;
    }

    Expression processRelationalExpression(BenefitParser.RelationalExpressionContext relationalExpressionContext) {
        if (null != relationalExpressionContext.EQUAL() ||
                null != relationalExpressionContext.NOTEQUAL() ||
                null != relationalExpressionContext.LT() ||
                null != relationalExpressionContext.LE() ||
                null != relationalExpressionContext.GT() ||
                null != relationalExpressionContext.GE()) {
            BenefitParser.RelationalExpressionContext childRelationalContext = relationalExpressionContext.relationalExpression();

            // Expression lhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());
            if (null != childRelationalContext && !childRelationalContext.isEmpty()) {
                if (null != relationalExpressionContext.EQUAL()) {
                    //lhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression().get(0));
                    Expression lhsExpression = processRelationalExpression(childRelationalContext);
                    Expression rhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());

                    if (rhsExpression instanceof UnaryExpression) {
                        if (((UnaryExpression) rhsExpression).getType() == UnaryType.NUMBER) {
                            lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.EQUALTO, lhsExpression, rhsExpression);
                        } else {
                            lhsExpression = new StringComparisonExpression(ArithmeticOperator.EQUALTO, lhsExpression, rhsExpression);
                        }
                    }
                    return lhsExpression;
                } else if (null != relationalExpressionContext.NOTEQUAL()) {
                    //Expression rhsExpression = lhsExpression;
                    //lhsExpression = processRelationalExpression(relationalExpressionContext.relationalExpression());
                    Expression lhsExpression = processRelationalExpression(childRelationalContext);
                    Expression rhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());

                    if (rhsExpression instanceof UnaryExpression) {
                        if (((UnaryExpression) rhsExpression).getType() == UnaryType.NUMBER) {
                            lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.NOTEQUALTO, lhsExpression, rhsExpression);
                        } else {
                            lhsExpression = new StringComparisonExpression(ArithmeticOperator.NOTEQUALTO, lhsExpression, rhsExpression);
                        }
                    }
                    return lhsExpression;
                } else if (null != relationalExpressionContext.LT()) {
                    //Expression rhsExpression = lhsExpression;
                    //lhsExpression = processRelationalExpression(relationalExpressionContext.relationalExpression());
                    Expression lhsExpression = processRelationalExpression(childRelationalContext);
                    Expression rhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());

                    if (rhsExpression instanceof UnaryExpression) {
                        if (((UnaryExpression) rhsExpression).getType() == UnaryType.NUMBER) {
                            lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.LESSTHAN, lhsExpression, rhsExpression);
                        } else {
                            lhsExpression = new StringComparisonExpression(ArithmeticOperator.LESSTHAN, lhsExpression, rhsExpression);
                        }
                    }
                    return lhsExpression;
                } else if (null != relationalExpressionContext.LE()) {
                    //Expression rhsExpression = lhsExpression;
                    //lhsExpression = processRelationalExpression(relationalExpressionContext.relationalExpression());
                    Expression lhsExpression = processRelationalExpression(childRelationalContext);
                    Expression rhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());

                    if (rhsExpression instanceof UnaryExpression) {
                        if (((UnaryExpression) rhsExpression).getType() == UnaryType.NUMBER) {
                            lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.LESSTHANEQUALTO, lhsExpression, rhsExpression);
                        } else {
                            lhsExpression = new StringComparisonExpression(ArithmeticOperator.LESSTHANEQUALTO, lhsExpression, rhsExpression);
                        }
                    }
                    return lhsExpression;
                } else if (null != relationalExpressionContext.GT()) {
                    //Expression rhsExpression = lhsExpression;
                    //lhsExpression = processRelationalExpression(relationalExpressionContext.relationalExpression());
                    Expression lhsExpression = processRelationalExpression(childRelationalContext);
                    Expression rhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());

                    if (rhsExpression instanceof UnaryExpression) {
                        if (((UnaryExpression) rhsExpression).getType() == UnaryType.NUMBER) {
                            lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.GREATERTHAN, lhsExpression, rhsExpression);
                        } else {
                            lhsExpression = new StringComparisonExpression(ArithmeticOperator.GREATERTHAN, lhsExpression, rhsExpression);
                        }
                    }
                    return lhsExpression;
                } else if (null != relationalExpressionContext.GE()) {
                    //Expression rhsExpression = lhsExpression;
                    //lhsExpression = processRelationalExpression(relationalExpressionContext.relationalExpression());
                    Expression lhsExpression = processRelationalExpression(childRelationalContext);
                    Expression rhsExpression = processAdditiveExpression(relationalExpressionContext.additiveExpression());

                    if (rhsExpression instanceof UnaryExpression) {
                        if (((UnaryExpression) rhsExpression).getType() == UnaryType.NUMBER) {
                            lhsExpression = new ArithmeticComparisonExpression(ArithmeticOperator.GREATERTHANEQUALTO, lhsExpression, rhsExpression);
                        } else {
                            lhsExpression = new StringComparisonExpression(ArithmeticOperator.GREATERTHANEQUALTO, lhsExpression, rhsExpression);
                        }
                    }

                    return lhsExpression;
                }
            } else if (null != relationalExpressionContext.iterativeStatement()) {
                return processIterativeStatement(relationalExpressionContext);
            }

        } else {
            return processAdditiveExpression(relationalExpressionContext.additiveExpression());
        }
        return null;
    }

    private TerminalNode identifyRelationalOperator(BenefitParser.RelationalExpressionContext
                                                            relationalExpressionContext) {
        TerminalNode equal = relationalExpressionContext.EQUAL();
        TerminalNode notEqual = relationalExpressionContext.NOTEQUAL();
        TerminalNode lessThan = relationalExpressionContext.LT();
        TerminalNode lessThanEqual = relationalExpressionContext.LE();
        TerminalNode greaterThan = relationalExpressionContext.GT();
        TerminalNode greaterThanEqual = relationalExpressionContext.GE();
        if (null != equal) {
            return equal;
        }
        if (null != notEqual) {
            return notEqual;
        }
        if (null != lessThan) {
            return lessThan;
        }
        if (null != lessThanEqual) {
            return lessThanEqual;
        }
        if (null != greaterThan) {
            return greaterThan;
        }
        if (null != greaterThanEqual) {
            return greaterThanEqual;
        }
        return null;
    }

    private ArithmeticOperator resolveOperatorForRelationalContext(TerminalNode operator,
                                                                   BenefitParser.RelationalExpressionContext relationalExpressionContext,
                                                                   boolean isOperatorForLoopVariable) {
        if (operator == relationalExpressionContext.EQUAL()) {
            if (isOperatorForLoopVariable) {
                return ArithmeticOperator.LOOPEQUALTO;
            } else {
                return ArithmeticOperator.EQUALTO;
            }
        } else if (operator == relationalExpressionContext.LT()) {
            if (isOperatorForLoopVariable) {
                return ArithmeticOperator.LOOPLESSTHAN;
            } else {
                return ArithmeticOperator.LESSTHAN;
            }
        } else if (operator == relationalExpressionContext.LE()) {
            if (isOperatorForLoopVariable) {
                return ArithmeticOperator.LOOPLESSTHANEQUALTO;
            } else {
                return ArithmeticOperator.LESSTHANEQUALTO;
            }
        } else if (operator == relationalExpressionContext.GT()) {
            if (isOperatorForLoopVariable) {
                return ArithmeticOperator.LOOPGREATERTHAN;
            } else {
                return ArithmeticOperator.GREATERTHAN;
            }
        } else if (operator == relationalExpressionContext.GE()) {
            if (isOperatorForLoopVariable) {
                return ArithmeticOperator.LOOPGREATERTHANEQUALTO;
            } else {
                return ArithmeticOperator.GREATERTHANEQUALTO;
            }
        } else if (operator == relationalExpressionContext.NOTEQUAL()) {
            if (isOperatorForLoopVariable) {
                return ArithmeticOperator.LOOPNOTEQUALTO;
            } else {
                return ArithmeticOperator.NOTEQUALTO;
            }
        }
        return null;
    }

    private Expression processIterativeStatement(BenefitParser.RelationalExpressionContext relationalExpressionContext) {
        if (null != relationalExpressionContext.iterativeStatement()) {
            if (null != relationalExpressionContext.iterativeStatement().EACH()) {

                BenefitParser.RelationalExpressionContext lhsRelationalExpressionContext = relationalExpressionContext.iterativeStatement()
                        .expression()
                        .conditionalExpression().
                                conditionalOrExpression().
                                conditionalAndExpression().
                                relationalExpression();
                BenefitParser.MultiplicativeExpressionContext rhsMultiplicativeExpressionContext = relationalExpressionContext.
                        additiveExpression().
                        multiplicativeExpression();


                //LHS : in case of EACH lhs is always a variable who is an array;
                BenefitParser.PrimaryContext lhsPrimaryContext = lhsRelationalExpressionContext.additiveExpression().multiplicativeExpression().unaryExpression().primary();
                String lhsCollectionVariableName = lhsPrimaryContext.variableName().getText();
                Expression lhsVariableExpression = scheme.searchVariableExpression(lhsCollectionVariableName);

                //RELATIONAL OP : in case of each only one relationalOp
                TerminalNode operator = identifyRelationalOperator(relationalExpressionContext);
                BenefitParser.PrimaryContext rhsPrimaryContext = rhsMultiplicativeExpressionContext.unaryExpression().primary();
                if (null != rhsPrimaryContext.variableName()) {
                    String rhsVariableName = lhsPrimaryContext.variableName().getText();
                    Expression rhsVariableExpression = scheme.searchVariableExpression(rhsVariableName);
                    return new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(operator, relationalExpressionContext, true), lhsVariableExpression, rhsVariableExpression);
                } else if (null != rhsPrimaryContext.literal()) {
                    Integer value = Integer.parseInt(rhsPrimaryContext.literal().NUMBER().getText());
                    UnaryExpression rhsUnaryExpression = new UnaryExpression(value, UnaryType.NUMBER);
                    return new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(operator, relationalExpressionContext, true), lhsVariableExpression, rhsUnaryExpression);
                }
            }
        }
        return null;
    }
/*
    private Expression processIterativeStatement(BenefitParser.IterativeStatementContext iterativeStatementContext) {
        if (null != iterativeStatementContext.EACH()) {
            if (null != iterativeStatementContext.expression()) {
                //the only possibility here is the comparison of some variable/value with EACH element of the array
                //hardcoded obtaining of relational context should suffice.
                BenefitParser.RelationalExpressionContext lhsRelationalExpressionContext = iterativeStatementContext.expression().conditionalExpression().
                        conditionalOrExpression().conditionalAndExpression().relationalExpression().relationalExpression();
                List<BenefitParser.AdditiveExpressionContext> rhsAdditiveExpressionContexts = iterativeStatementContext.expression().conditionalExpression().
                        conditionalOrExpression().conditionalAndExpression().relationalExpression().additiveExpression();

                //LHS : in case of EACH lhs is always a variable who is an array;
                BenefitParser.PrimaryContext lhsPrimaryContext = lhsRelationalExpressionContext.additiveExpression(0).multiplicativeExpression().unaryExpression().primary();
                Expression lhsVariableExpression=null;
                if(null != lhsPrimaryContext.variableName()) {
                    String lhsCollectionVariableName = lhsPrimaryContext.variableName().getText();
                    lhsVariableExpression = scheme.searchVariableExpression(lhsCollectionVariableName);
                }else if(null != lhsPrimaryContext.literal()){

                }

                //RELATIONAL OP : in case of each only one relationalOp
                BenefitParser.RelationalOpContext relationalOpContext = iterativeStatementContext.expression().conditionalExpression().
                        conditionalOrExpression().conditionalAndExpression().relationalExpression().relationalOp(0);

                //RHS: Single primary value or variable Name
                BenefitParser.PrimaryContext rhsPrimaryContext = rhsAdditiveExpressionContexts.get(0).multiplicativeExpression().unaryExpression().primary();
                if (null != rhsPrimaryContext.variableName()) {
                    String rhsVariableName = lhsPrimaryContext.variableName().getText();
                    Expression rhsVariableExpression = scheme.searchVariableExpression(rhsVariableName);
                    return new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOpContext, true),
                            lhsVariableExpression,
                            rhsVariableExpression);
                } else if (null != rhsPrimaryContext.literal()) {
                    Integer value = Integer.parseInt(rhsPrimaryContext.literal().NUMBER().getText());
                    UnaryExpression rhsUnaryExpression = new UnaryExpression(value, UnaryType.NUMBER);
                    return new ArithmeticComparisonExpression(resolveOperatorForRelationalContext(relationalOpContext, true),
                            lhsVariableExpression,
                            rhsUnaryExpression);
                }
            }
        }
        return null;
    }
*/


    private Expression buildArrayVariable(String variableName, BenefitParser.VariableInitializerContext
            variableInitializerContext) {
        List<Expression> arrayElements = new ArrayList<>();
        List<BenefitParser.VariableInitializerContext> initializerContexts = variableInitializerContext.arrayInitializer().variableInitializer();
        for (BenefitParser.VariableInitializerContext initializerContext : initializerContexts) {
            Expression expression = processExpression(initializerContext.expression());
            arrayElements.add(expression);
        }
        return new VariableExpression(new VariableIdentifierExpression(variableName), new UnaryExpression(arrayElements, UnaryType.COLLECTION));
    }

    private Expression buildNonArrayVariable(String variableName, BenefitParser.VariableInitializerContext
            variableInitializerContext) {
        BenefitParser.ExpressionContext initializerContext = variableInitializerContext.expression();
        Expression unaryExpression = processExpression(initializerContext);
        return new VariableExpression(new VariableIdentifierExpression(variableName), unaryExpression);
    }

    public Expression processVariableDeclaration(BenefitParser.VariableDeclarationStatementContext
                                                         variableDeclarationStatementContext) {
        if (null != variableDeclarationStatementContext) {
            BenefitParser.VariableInitializerContext variableInitializerContext = variableDeclarationStatementContext.variableInitializer();
            if (null != variableDeclarationStatementContext.variableDeclaratorId()) {
                BenefitParser.VariableDeclaratorIdContext variableDeclaratorIdContext = variableDeclarationStatementContext.variableDeclaratorId();
                String variableName = variableDeclaratorIdContext.variableName().getText();
                if (null != variableDeclaratorIdContext.LBRACK() && null != variableDeclaratorIdContext.RBRACK()) {      //it is an array
                    if (null != variableDeclarationStatementContext.ASSIGN()) {   //assignment statement
                        return buildArrayVariable(variableName, variableInitializerContext);
                    } else if (null != variableDeclarationStatementContext.ASINPUT()) {
                        Expression expression = scheme.searchVariableExpression(variableName);
                        if (null != expression) {
                            return expression;
                        } else {
                            return new VariableExpression(new VariableIdentifierExpression(variableName), null);
                        }
                    }
                } else {
                    if (null != variableDeclarationStatementContext.ASSIGN()) {   //assignment statement
                        return buildNonArrayVariable(variableName, variableInitializerContext);
                    } else if (null != variableDeclarationStatementContext.ASINPUT()) {
                        //Put InputValuePlaceHolder here as at the time of parsing the tree the variable value in absent
                        //UnaryExpression value = new UnaryExpression(new InputValuePlaceHolder(variableName));
                        //return new VariableExpression(new UnaryExpression(variableName),value);
                        Expression expression = scheme.searchVariableExpression(variableName);
                        if (null != expression) {
                            return expression;
                        } else {
                            return new VariableExpression(new VariableIdentifierExpression(variableName), null);
                        }
                    }
                }
            }
        }
        return null;
    }


    Expression processAdditiveExpression(BenefitParser.AdditiveExpressionContext additiveExpressionContext) {
        if (null != additiveExpressionContext.ADD() || null != additiveExpressionContext.SUB()) {

            if (null != additiveExpressionContext.ADD() && null != additiveExpressionContext.additiveExpression()) {
                Expression lhs = processAdditiveExpression(additiveExpressionContext.additiveExpression());
                Expression rhs = processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression());
                return new ArithmeticExpression(ArithmeticOperator.ADDITION, lhs, rhs);
            } else if (null != additiveExpressionContext.SUB() && null != additiveExpressionContext.additiveExpression()) {
                Expression lhs = processAdditiveExpression(additiveExpressionContext.additiveExpression());
                Expression rhs = processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression());
                return new ArithmeticExpression(ArithmeticOperator.SUBTRACTION, lhs, rhs);
            }
        } else if (null != additiveExpressionContext.iterativeAggregationExpression()) {
            return processIterativeAggregationExpression(additiveExpressionContext.iterativeAggregationExpression());
        }else{
            return processMultiplicationExpression(additiveExpressionContext.multiplicativeExpression());
        }
        return null;
    }

    private Expression processIterativeAggregationExpression(BenefitParser.IterativeAggregationExpressionContext
                                                                     iterativeAggregationExpressionContext) {
        if (null != iterativeAggregationExpressionContext.SUMOF() && null != iterativeAggregationExpressionContext.EACH()) {
            if (null != iterativeAggregationExpressionContext.variableDeclarationStatement()) {
                String variableName = iterativeAggregationExpressionContext.variableDeclarationStatement().variableDeclaratorId().variableName().getText();
                return new ArithmeticExpression(ArithmeticOperator.LOOPADDITION, scheme.searchVariableExpression(variableName), null);
            } else if (null != iterativeAggregationExpressionContext.expression()) {
                BenefitParser.ExpressionContext expressionContext = iterativeAggregationExpressionContext.expression();
                BenefitParser.PrimaryContext lhsPrimaryContext = expressionContext.conditionalExpression().conditionalOrExpression().conditionalAndExpression().relationalExpression().additiveExpression().multiplicativeExpression().unaryExpression().primary();
                if (lhsPrimaryContext.variableName() != null) {
                    TerminalNode LHS_IDENTIFIER = lhsPrimaryContext.variableName().IDENTIFIER();
                    if (null != LHS_IDENTIFIER) {
                        //String lhsVariableName = LHS_IDENTIFIER.getText();
                        TerminalNode RHS_IDENTIFIER = expressionContext.conditionalExpression().conditionalOrExpression().conditionalAndExpression().relationalExpression().additiveExpression().iterativeAggregationExpression().variableDeclarationStatement().variableDeclaratorId().variableName().IDENTIFIER();
                        if (null != RHS_IDENTIFIER) {
                            String rhsVariableName = RHS_IDENTIFIER.getText();
                            Expression rhsVariableExpression = scheme.searchVariableExpression(rhsVariableName);
                            return new ArithmeticExpression(ArithmeticOperator.LOOPADDITION, rhsVariableExpression, null);
                        }
                    }
                } else if (lhsPrimaryContext.parExpression() != null) {
                    return processParExpression(lhsPrimaryContext.parExpression());
                }
            }
        }
        return null;
    }

    private Expression processParExpression(BenefitParser.ParExpressionContext parExpressionContext) {
        if (null != parExpressionContext.LPAREN() && null != parExpressionContext.RPAREN() && null != parExpressionContext.expression()) {
            return processExpression(parExpressionContext.expression());
        }
        return null;
    }

    private Expression processMultiplicationExpression(BenefitParser.MultiplicativeExpressionContext
                                                               multiplicativeExpressionContext) {
        if (null != multiplicativeExpressionContext.MUL() || null != multiplicativeExpressionContext.DIV() || null != multiplicativeExpressionContext.MOD()) {
            if (null != multiplicativeExpressionContext.MUL() && null != multiplicativeExpressionContext.multiplicativeExpression()) {
                Expression lhs = processMultiplicationExpression(multiplicativeExpressionContext.multiplicativeExpression());
                Expression rhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression());
                return new ArithmeticExpression(ArithmeticOperator.MULTIPLICATION, lhs, rhs);
            } else if (null != multiplicativeExpressionContext.DIV() && null != multiplicativeExpressionContext.multiplicativeExpression()) {
                Expression lhs = processMultiplicationExpression(multiplicativeExpressionContext.multiplicativeExpression());
                Expression rhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression());
                return new ArithmeticExpression(ArithmeticOperator.DIVISION, lhs, rhs);
            } else if (null != multiplicativeExpressionContext.MOD() && null != multiplicativeExpressionContext.multiplicativeExpression()) {
                Expression lhs = processMultiplicationExpression(multiplicativeExpressionContext.multiplicativeExpression());
                Expression rhs = processUnaryExpression(multiplicativeExpressionContext.unaryExpression());
                return new ArithmeticExpression(ArithmeticOperator.MODULUS, lhs, rhs);
            }
        }else{
            return processUnaryExpression(multiplicativeExpressionContext.unaryExpression());
        }
        return null;
    }

    private String escapeDoubleDoubleQuotesFromString(String literalStringValue) {
        // String s = getText();
        char[] literalCharArray = literalStringValue.toCharArray();
        if (literalCharArray[0] == '"') {
            literalStringValue = literalStringValue.substring(1, literalStringValue.length() - 1); // strip the leading and trailing quotes
            literalStringValue = literalStringValue.replace("\"\"", "\""); // replace all double quotes with single quotes
            System.out.println("^^^^changed value :  " + literalStringValue);
        }
        return literalStringValue;
    }

    Expression processUnaryExpression(BenefitParser.UnaryExpressionContext unaryExpressionContext) {
        BenefitParser.LiteralContext literalContext = unaryExpressionContext.primary().literal();
        if (null != literalContext) {
            if (null != literalContext.NUMBER()) {
                Number literalNumericValue = Double.parseDouble(literalContext.NUMBER().getText());
                return new UnaryExpression(literalNumericValue, UnaryType.NUMBER);
            } else if (null != literalContext.STRINGLITERAL()) {
                String literalStringValue = literalContext.STRINGLITERAL().getSymbol().getText();
                System.out.println("^^Unchanged : " + literalStringValue);
                return new UnaryExpression(escapeDoubleDoubleQuotesFromString(literalStringValue), UnaryType.STRING);
            } else if (null != literalContext.BOOLEANLITERAL()) {
                Boolean literalBooleanValue = Boolean.parseBoolean(literalContext.BOOLEANLITERAL().getText());
                return new UnaryExpression(literalBooleanValue, UnaryType.BOOLEAN);
            } else {
                String literalStringValue = literalContext.NULL().getText();
                return new UnaryExpression(literalStringValue, UnaryType.NULL);
            }
        } else if (null != unaryExpressionContext.primary().variableName()) {
            Expression variableExpression = scheme.searchVariableExpression(unaryExpressionContext.primary().variableName().getText());
            if (null == variableExpression) {
                variableExpression = new VariableExpression(new VariableIdentifierExpression(unaryExpressionContext.primary().variableName().getText()), new UnaryExpression(null, UnaryType.NULL));
                //scheme.getComputeUnit().addExpression(variableExpression);
            }
            return variableExpression;
        } else if (null != unaryExpressionContext.primary().parExpression()) {
            return processParExpression(unaryExpressionContext.primary().parExpression());
        }
        return null;
    }
}
