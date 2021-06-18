// Generated from com/affaince/benefit/Benefit.g4 by ANTLR 4.9.2

package com.affaince.benefit;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BenefitParser}.
 */
public interface BenefitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BenefitParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(BenefitParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(BenefitParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#inputOrAssignmentOnly}.
	 * @param ctx the parse tree
	 */
	void enterInputOrAssignmentOnly(BenefitParser.InputOrAssignmentOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#inputOrAssignmentOnly}.
	 * @param ctx the parse tree
	 */
	void exitInputOrAssignmentOnly(BenefitParser.InputOrAssignmentOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#givenStatement}.
	 * @param ctx the parse tree
	 */
	void enterGivenStatement(BenefitParser.GivenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#givenStatement}.
	 * @param ctx the parse tree
	 */
	void exitGivenStatement(BenefitParser.GivenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void enterComputeStatement(BenefitParser.ComputeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#computeStatement}.
	 * @param ctx the parse tree
	 */
	void exitComputeStatement(BenefitParser.ComputeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#eligibilityStatement}.
	 * @param ctx the parse tree
	 */
	void enterEligibilityStatement(BenefitParser.EligibilityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#eligibilityStatement}.
	 * @param ctx the parse tree
	 */
	void exitEligibilityStatement(BenefitParser.EligibilityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#payStatement}.
	 * @param ctx the parse tree
	 */
	void enterPayStatement(BenefitParser.PayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#payStatement}.
	 * @param ctx the parse tree
	 */
	void exitPayStatement(BenefitParser.PayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#inputExpression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(BenefitParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#inputExpression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(BenefitParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(BenefitParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(BenefitParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#combiningExpression}.
	 * @param ctx the parse tree
	 */
	void enterCombiningExpression(BenefitParser.CombiningExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#combiningExpression}.
	 * @param ctx the parse tree
	 */
	void exitCombiningExpression(BenefitParser.CombiningExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#proportionExpression}.
	 * @param ctx the parse tree
	 */
	void enterProportionExpression(BenefitParser.ProportionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#proportionExpression}.
	 * @param ctx the parse tree
	 */
	void exitProportionExpression(BenefitParser.ProportionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(BenefitParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(BenefitParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(BenefitParser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(BenefitParser.LoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#aggregateSumExpression}.
	 * @param ctx the parse tree
	 */
	void enterAggregateSumExpression(BenefitParser.AggregateSumExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#aggregateSumExpression}.
	 * @param ctx the parse tree
	 */
	void exitAggregateSumExpression(BenefitParser.AggregateSumExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(BenefitParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(BenefitParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExpresionInList}
	 * labeled alternative in {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpresionInList(BenefitParser.SingleExpresionInListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExpresionInList}
	 * labeled alternative in {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpresionInList(BenefitParser.SingleExpresionInListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleExpressionsInList}
	 * labeled alternative in {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterMultipleExpressionsInList(BenefitParser.MultipleExpressionsInListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleExpressionsInList}
	 * labeled alternative in {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitMultipleExpressionsInList(BenefitParser.MultipleExpressionsInListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BenefitParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BenefitParser.ExpressionContext ctx);
}