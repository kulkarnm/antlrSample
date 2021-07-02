// Generated from Benefit.g4 by ANTLR 4.9.2

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
	 * Enter a parse tree produced by {@link BenefitParser#givenUnit}.
	 * @param ctx the parse tree
	 */
	void enterGivenUnit(BenefitParser.GivenUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#givenUnit}.
	 * @param ctx the parse tree
	 */
	void exitGivenUnit(BenefitParser.GivenUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#givenBody}.
	 * @param ctx the parse tree
	 */
	void enterGivenBody(BenefitParser.GivenBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#givenBody}.
	 * @param ctx the parse tree
	 */
	void exitGivenBody(BenefitParser.GivenBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#computeUnit}.
	 * @param ctx the parse tree
	 */
	void enterComputeUnit(BenefitParser.ComputeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#computeUnit}.
	 * @param ctx the parse tree
	 */
	void exitComputeUnit(BenefitParser.ComputeUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#computeBlock}.
	 * @param ctx the parse tree
	 */
	void enterComputeBlock(BenefitParser.ComputeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#computeBlock}.
	 * @param ctx the parse tree
	 */
	void exitComputeBlock(BenefitParser.ComputeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#eligibilityUnit}.
	 * @param ctx the parse tree
	 */
	void enterEligibilityUnit(BenefitParser.EligibilityUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#eligibilityUnit}.
	 * @param ctx the parse tree
	 */
	void exitEligibilityUnit(BenefitParser.EligibilityUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#payUnit}.
	 * @param ctx the parse tree
	 */
	void enterPayUnit(BenefitParser.PayUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#payUnit}.
	 * @param ctx the parse tree
	 */
	void exitPayUnit(BenefitParser.PayUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(BenefitParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(BenefitParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(BenefitParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(BenefitParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(BenefitParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(BenefitParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(BenefitParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(BenefitParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(BenefitParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(BenefitParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(BenefitParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(BenefitParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(BenefitParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(BenefitParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(BenefitParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(BenefitParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(BenefitParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(BenefitParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(BenefitParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(BenefitParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(BenefitParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(BenefitParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(BenefitParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(BenefitParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#nonDefaultProportionExpression}.
	 * @param ctx the parse tree
	 */
	void enterNonDefaultProportionExpression(BenefitParser.NonDefaultProportionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#nonDefaultProportionExpression}.
	 * @param ctx the parse tree
	 */
	void exitNonDefaultProportionExpression(BenefitParser.NonDefaultProportionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(BenefitParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(BenefitParser.ExpressionListContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link BenefitParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BenefitParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BenefitParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#iterativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterativeStatement(BenefitParser.IterativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#iterativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterativeStatement(BenefitParser.IterativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BenefitParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BenefitParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(BenefitParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(BenefitParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BenefitParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BenefitParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BenefitParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(BenefitParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BenefitParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(BenefitParser.BlockStatementContext ctx);
}