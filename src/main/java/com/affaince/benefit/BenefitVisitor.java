// Generated from Benefit.g4 by ANTLR 4.9.2

package com.affaince.benefit;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BenefitParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BenefitVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BenefitParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(BenefitParser.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#givenUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivenUnit(BenefitParser.GivenUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#givenBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGivenBody(BenefitParser.GivenBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#computeUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeUnit(BenefitParser.ComputeUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#computeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeBlock(BenefitParser.ComputeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#eligibilityUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEligibilityUnit(BenefitParser.EligibilityUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#payUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayUnit(BenefitParser.PayUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#payBefore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayBefore(BenefitParser.PayBeforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#payAfter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayAfter(BenefitParser.PayAfterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#payMultiplier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPayMultiplier(BenefitParser.PayMultiplierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(BenefitParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(BenefitParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(BenefitParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(BenefitParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(BenefitParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(BenefitParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(BenefitParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(BenefitParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(BenefitParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(BenefitParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(BenefitParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(BenefitParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(BenefitParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(BenefitParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#connectorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectorAnd(BenefitParser.ConnectorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#connectorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectorOr(BenefitParser.ConnectorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(BenefitParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#nonDefaultProportionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDefaultProportionExpression(BenefitParser.NonDefaultProportionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#proportionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProportionExpression(BenefitParser.ProportionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(BenefitParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BenefitParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BenefitParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#iterativeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeStatement(BenefitParser.IterativeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#iterativeAggregationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeAggregationExpression(BenefitParser.IterativeAggregationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BenefitParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(BenefitParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BenefitParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BenefitParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(BenefitParser.BlockStatementContext ctx);
}