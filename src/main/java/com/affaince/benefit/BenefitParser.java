// Generated from com/affaince/benefit/Benefit.g4 by ANTLR 4.9.2

package com.affaince.benefit;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BenefitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, GIVEN=2, ASINPUT=3, COMPUTE=4, EACH=5, SUMOF=6, ELIGIBLEWHEN=7, 
		PAY=8, BEFORE=9, AFTER=10, IN=11, PROPORTION=12, DEFAULT=13, OF=14, ANDSTR=15, 
		ORSTR=16, StringLiteral=17, BooleanLiteral=18, NullLiteral=19, IDENTIFIER=20, 
		LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, LBRACK=25, RBRACK=26, COMMA=27, 
		SEMI=28, COLON=29, ASSIGN=30, GT=31, LT=32, BANG=33, EQUAL=34, LE=35, 
		GE=36, NOTEQUAL=37, INC=38, DEC=39, ADD=40, SUB=41, MUL=42, DIV=43, MOD=44, 
		ANY_SPACE=45, SINGLE_SPACE=46, AsInputOperator=47, ArithmaticOperatorModMultDiv=48, 
		ArithmaticOperatorAddSubtract=49, ArithmaticOperatorAssignment=50, ArithmaticOperatorLT=51, 
		ArithmaticOperatorLE=52, ArithmaticOperatorGT=53, ArithmaticOperatorGE=54, 
		ArithmaticOperatorEQUAL=55, ArithmaticOperatorNOTEQUAL=56, LParanOperator=57, 
		RParanOperator=58, LBrackOperator=59, RBrackOperator=60, SemiColonOperator=61, 
		ColonOperator=62, CommaOperator=63, GivenOperator=64, ComputeOperator=65, 
		EligibleWhenOperator=66, PayOperator=67, BeforeOperator=68, AfterOperator=69, 
		DefaultOperator=70, InOperator=71, ProprotionOperator=72, OfOperator=73, 
		EachOperator=74, AndOperator=75, OrOperator=76, SumOfOperator=77, WS=78;
	public static final int
		RULE_scheme = 0, RULE_inputOrAssignmentOnly = 1, RULE_givenStatement = 2, 
		RULE_computeStatement = 3, RULE_eligibilityStatement = 4, RULE_payStatement = 5, 
		RULE_inputExpression = 6, RULE_comparisonExpression = 7, RULE_combiningExpression = 8, 
		RULE_proportionExpression = 9, RULE_assignmentExpression = 10, RULE_loopExpression = 11, 
		RULE_aggregateSumExpression = 12, RULE_array = 13, RULE_expressionList = 14, 
		RULE_expression = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"scheme", "inputOrAssignmentOnly", "givenStatement", "computeStatement", 
			"eligibilityStatement", "payStatement", "inputExpression", "comparisonExpression", 
			"combiningExpression", "proportionExpression", "assignmentExpression", 
			"loopExpression", "aggregateSumExpression", "array", "expressionList", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'given'", "'as input'", "'compute'", "'each'", "'sumOf'", 
			"'eligibleWhen'", "'pay'", "'before'", "'after'", "'in'", "'proportion'", 
			"'default'", "'of'", "'and'", "'or'", null, null, "'null'", null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "','", "';'", "':'", "'='", "'>'", 
			"'<'", "'!'", "'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "GIVEN", "ASINPUT", "COMPUTE", "EACH", "SUMOF", "ELIGIBLEWHEN", 
			"PAY", "BEFORE", "AFTER", "IN", "PROPORTION", "DEFAULT", "OF", "ANDSTR", 
			"ORSTR", "StringLiteral", "BooleanLiteral", "NullLiteral", "IDENTIFIER", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", 
			"SEMI", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "ANY_SPACE", "SINGLE_SPACE", 
			"AsInputOperator", "ArithmaticOperatorModMultDiv", "ArithmaticOperatorAddSubtract", 
			"ArithmaticOperatorAssignment", "ArithmaticOperatorLT", "ArithmaticOperatorLE", 
			"ArithmaticOperatorGT", "ArithmaticOperatorGE", "ArithmaticOperatorEQUAL", 
			"ArithmaticOperatorNOTEQUAL", "LParanOperator", "RParanOperator", "LBrackOperator", 
			"RBrackOperator", "SemiColonOperator", "ColonOperator", "CommaOperator", 
			"GivenOperator", "ComputeOperator", "EligibleWhenOperator", "PayOperator", 
			"BeforeOperator", "AfterOperator", "DefaultOperator", "InOperator", "ProprotionOperator", 
			"OfOperator", "EachOperator", "AndOperator", "OrOperator", "SumOfOperator", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Benefit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BenefitParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SchemeContext extends ParserRuleContext {
		public GivenStatementContext givenStatement() {
			return getRuleContext(GivenStatementContext.class,0);
		}
		public ComputeStatementContext computeStatement() {
			return getRuleContext(ComputeStatementContext.class,0);
		}
		public EligibilityStatementContext eligibilityStatement() {
			return getRuleContext(EligibilityStatementContext.class,0);
		}
		public PayStatementContext payStatement() {
			return getRuleContext(PayStatementContext.class,0);
		}
		public SchemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scheme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterScheme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitScheme(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			givenStatement();
			setState(33);
			computeStatement();
			setState(34);
			eligibilityStatement();
			setState(35);
			payStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputOrAssignmentOnlyContext extends ParserRuleContext {
		public InputExpressionContext inputExpression() {
			return getRuleContext(InputExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InputOrAssignmentOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputOrAssignmentOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterInputOrAssignmentOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitInputOrAssignmentOnly(this);
		}
	}

	public final InputOrAssignmentOnlyContext inputOrAssignmentOnly() throws RecognitionException {
		InputOrAssignmentOnlyContext _localctx = new InputOrAssignmentOnlyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inputOrAssignmentOnly);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				inputExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GivenStatementContext extends ParserRuleContext {
		public TerminalNode GivenOperator() { return getToken(BenefitParser.GivenOperator, 0); }
		public List<InputOrAssignmentOnlyContext> inputOrAssignmentOnly() {
			return getRuleContexts(InputOrAssignmentOnlyContext.class);
		}
		public InputOrAssignmentOnlyContext inputOrAssignmentOnly(int i) {
			return getRuleContext(InputOrAssignmentOnlyContext.class,i);
		}
		public List<TerminalNode> SemiColonOperator() { return getTokens(BenefitParser.SemiColonOperator); }
		public TerminalNode SemiColonOperator(int i) {
			return getToken(BenefitParser.SemiColonOperator, i);
		}
		public GivenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterGivenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitGivenStatement(this);
		}
	}

	public final GivenStatementContext givenStatement() throws RecognitionException {
		GivenStatementContext _localctx = new GivenStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_givenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(GivenOperator);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				inputOrAssignmentOnly();
				setState(43);
				match(SemiColonOperator);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComputeStatementContext extends ParserRuleContext {
		public TerminalNode ComputeOperator() { return getToken(BenefitParser.ComputeOperator, 0); }
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> SemiColonOperator() { return getTokens(BenefitParser.SemiColonOperator); }
		public TerminalNode SemiColonOperator(int i) {
			return getToken(BenefitParser.SemiColonOperator, i);
		}
		public ComputeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterComputeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitComputeStatement(this);
		}
	}

	public final ComputeStatementContext computeStatement() throws RecognitionException {
		ComputeStatementContext _localctx = new ComputeStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_computeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ComputeOperator);
			setState(50);
			assignmentExpression();
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(SemiColonOperator);
				setState(52);
				assignmentExpression();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SemiColonOperator );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EligibilityStatementContext extends ParserRuleContext {
		public TerminalNode EligibleWhenOperator() { return getToken(BenefitParser.EligibleWhenOperator, 0); }
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public TerminalNode SemiColonOperator() { return getToken(BenefitParser.SemiColonOperator, 0); }
		public List<CombiningExpressionContext> combiningExpression() {
			return getRuleContexts(CombiningExpressionContext.class);
		}
		public CombiningExpressionContext combiningExpression(int i) {
			return getRuleContext(CombiningExpressionContext.class,i);
		}
		public EligibilityStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eligibilityStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterEligibilityStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitEligibilityStatement(this);
		}
	}

	public final EligibilityStatementContext eligibilityStatement() throws RecognitionException {
		EligibilityStatementContext _localctx = new EligibilityStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eligibilityStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(EligibleWhenOperator);
			setState(58);
			comparisonExpression();
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColonOperator:
				{
				setState(59);
				match(SemiColonOperator);
				}
				break;
			case IDENTIFIER:
				{
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					combiningExpression();
					setState(61);
					comparisonExpression();
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PayStatementContext extends ParserRuleContext {
		public TerminalNode PayOperator() { return getToken(BenefitParser.PayOperator, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
		public TerminalNode SemiColonOperator() { return getToken(BenefitParser.SemiColonOperator, 0); }
		public TerminalNode BeforeOperator() { return getToken(BenefitParser.BeforeOperator, 0); }
		public TerminalNode AfterOperator() { return getToken(BenefitParser.AfterOperator, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OfOperator() { return getToken(BenefitParser.OfOperator, 0); }
		public ProportionExpressionContext proportionExpression() {
			return getRuleContext(ProportionExpressionContext.class,0);
		}
		public List<TerminalNode> CommaOperator() { return getTokens(BenefitParser.CommaOperator); }
		public TerminalNode CommaOperator(int i) {
			return getToken(BenefitParser.CommaOperator, i);
		}
		public PayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterPayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitPayStatement(this);
		}
	}

	public final PayStatementContext payStatement() throws RecognitionException {
		PayStatementContext _localctx = new PayStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_payStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(PayOperator);
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==BeforeOperator || _la==AfterOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(71);
			expression(0);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CommaOperator) {
				{
				{
				setState(72);
				match(CommaOperator);
				setState(73);
				expression(0);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(OfOperator);
			}
			setState(81);
			match(IDENTIFIER);
			{
			setState(82);
			proportionExpression();
			}
			setState(83);
			match(SemiColonOperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputExpressionContext extends ParserRuleContext {
		public TerminalNode AsInputOperator() { return getToken(BenefitParser.AsInputOperator, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InputExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitInputExpression(this);
		}
	}

	public final InputExpressionContext inputExpression() throws RecognitionException {
		InputExpressionContext _localctx = new InputExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inputExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(85);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(86);
				array();
				}
				break;
			}
			setState(89);
			match(AsInputOperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(BenefitParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BenefitParser.IDENTIFIER, i);
		}
		public TerminalNode ArithmaticOperatorLT() { return getToken(BenefitParser.ArithmaticOperatorLT, 0); }
		public TerminalNode ArithmaticOperatorLE() { return getToken(BenefitParser.ArithmaticOperatorLE, 0); }
		public TerminalNode ArithmaticOperatorGE() { return getToken(BenefitParser.ArithmaticOperatorGE, 0); }
		public TerminalNode ArithmaticOperatorGT() { return getToken(BenefitParser.ArithmaticOperatorGT, 0); }
		public TerminalNode ArithmaticOperatorEQUAL() { return getToken(BenefitParser.ArithmaticOperatorEQUAL, 0); }
		public TerminalNode ArithmaticOperatorNOTEQUAL() { return getToken(BenefitParser.ArithmaticOperatorNOTEQUAL, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IDENTIFIER);
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ArithmaticOperatorLT) | (1L << ArithmaticOperatorLE) | (1L << ArithmaticOperatorGT) | (1L << ArithmaticOperatorGE) | (1L << ArithmaticOperatorEQUAL) | (1L << ArithmaticOperatorNOTEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(93);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CombiningExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public TerminalNode AndOperator() { return getToken(BenefitParser.AndOperator, 0); }
		public TerminalNode OrOperator() { return getToken(BenefitParser.OrOperator, 0); }
		public CombiningExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combiningExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterCombiningExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitCombiningExpression(this);
		}
	}

	public final CombiningExpressionContext combiningExpression() throws RecognitionException {
		CombiningExpressionContext _localctx = new CombiningExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_combiningExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			comparisonExpression();
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==AndOperator || _la==OrOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97);
			comparisonExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProportionExpressionContext extends ParserRuleContext {
		public TerminalNode InOperator() { return getToken(BenefitParser.InOperator, 0); }
		public TerminalNode DefaultOperator() { return getToken(BenefitParser.DefaultOperator, 0); }
		public TerminalNode ProprotionOperator() { return getToken(BenefitParser.ProprotionOperator, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BenefitParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BenefitParser.NUMBER, i);
		}
		public List<TerminalNode> ColonOperator() { return getTokens(BenefitParser.ColonOperator); }
		public TerminalNode ColonOperator(int i) {
			return getToken(BenefitParser.ColonOperator, i);
		}
		public ProportionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proportionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterProportionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitProportionExpression(this);
		}
	}

	public final ProportionExpressionContext proportionExpression() throws RecognitionException {
		ProportionExpressionContext _localctx = new ProportionExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_proportionExpression);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case InOperator:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(InOperator);
				setState(100);
				match(DefaultOperator);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(101);
				match(NUMBER);
				setState(102);
				match(ColonOperator);
				setState(103);
				match(NUMBER);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					match(ColonOperator);
					setState(105);
					match(NUMBER);
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ColonOperator );
				}
				setState(110);
				match(ProprotionOperator);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
		public TerminalNode ArithmaticOperatorAssignment() { return getToken(BenefitParser.ArithmaticOperatorAssignment, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(ArithmaticOperatorAssignment);
			setState(115);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopExpressionContext extends ParserRuleContext {
		public TerminalNode EachOperator() { return getToken(BenefitParser.EachOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitLoopExpression(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(EachOperator);
			setState(118);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateSumExpressionContext extends ParserRuleContext {
		public TerminalNode SumOfOperator() { return getToken(BenefitParser.SumOfOperator, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode EachOperator() { return getToken(BenefitParser.EachOperator, 0); }
		public AggregateSumExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateSumExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterAggregateSumExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitAggregateSumExpression(this);
		}
	}

	public final AggregateSumExpressionContext aggregateSumExpression() throws RecognitionException {
		AggregateSumExpressionContext _localctx = new AggregateSumExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregateSumExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SumOfOperator);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121);
				match(EachOperator);
				}
				break;
			}
			setState(124);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
		public TerminalNode LBrackOperator() { return getToken(BenefitParser.LBrackOperator, 0); }
		public TerminalNode RBrackOperator() { return getToken(BenefitParser.RBrackOperator, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(BenefitParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BenefitParser.NUMBER, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(BenefitParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(BenefitParser.StringLiteral, i);
		}
		public List<TerminalNode> CommaOperator() { return getTokens(BenefitParser.CommaOperator); }
		public TerminalNode CommaOperator(int i) {
			return getToken(BenefitParser.CommaOperator, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(126);
				match(IDENTIFIER);
				setState(127);
				match(LBrackOperator);
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(128);
					match(NUMBER);
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CommaOperator) {
						{
						{
						setState(129);
						match(CommaOperator);
						setState(130);
						match(NUMBER);
						}
						}
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case StringLiteral:
					{
					setState(136);
					match(StringLiteral);
					{
					setState(137);
					match(CommaOperator);
					setState(138);
					match(StringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141);
				match(RBrackOperator);
				}
				}
				break;
			case 2:
				{
				{
				setState(142);
				match(IDENTIFIER);
				setState(143);
				match(LBrackOperator);
				setState(144);
				match(RBrackOperator);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	 
		public ExpressionListContext() { }
		public void copyFrom(ExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleExpressionsInListContext extends ExpressionListContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CommaOperator() { return getTokens(BenefitParser.CommaOperator); }
		public TerminalNode CommaOperator(int i) {
			return getToken(BenefitParser.CommaOperator, i);
		}
		public MultipleExpressionsInListContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterMultipleExpressionsInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitMultipleExpressionsInList(this);
		}
	}
	public static class SingleExpresionInListContext extends ExpressionListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleExpresionInListContext(ExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterSingleExpresionInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitSingleExpresionInList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionList);
		try {
			int _alt;
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SingleExpresionInListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				expression(0);
				}
				break;
			case 2:
				_localctx = new MultipleExpressionsInListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				expression(0);
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						match(CommaOperator);
						setState(150);
						expression(0);
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BenefitParser.NUMBER, 0); }
		public TerminalNode StringLiteral() { return getToken(BenefitParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BenefitParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(BenefitParser.NullLiteral, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InputExpressionContext inputExpression() {
			return getRuleContext(InputExpressionContext.class,0);
		}
		public TerminalNode LParanOperator() { return getToken(BenefitParser.LParanOperator, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RParanOperator() { return getToken(BenefitParser.RParanOperator, 0); }
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public AggregateSumExpressionContext aggregateSumExpression() {
			return getRuleContext(AggregateSumExpressionContext.class,0);
		}
		public TerminalNode ArithmaticOperatorModMultDiv() { return getToken(BenefitParser.ArithmaticOperatorModMultDiv, 0); }
		public TerminalNode ArithmaticOperatorAddSubtract() { return getToken(BenefitParser.ArithmaticOperatorAddSubtract, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(159);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << NullLiteral))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(160);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(161);
				array();
				}
				break;
			case 4:
				{
				setState(162);
				assignmentExpression();
				}
				break;
			case 5:
				{
				setState(163);
				inputExpression();
				}
				break;
			case 6:
				{
				setState(164);
				match(LParanOperator);
				setState(165);
				expression(0);
				setState(166);
				match(RParanOperator);
				}
				break;
			case 7:
				{
				setState(168);
				loopExpression();
				}
				break;
			case 8:
				{
				setState(169);
				aggregateSumExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(173);
						match(ArithmaticOperatorModMultDiv);
						setState(174);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						match(ArithmaticOperatorAddSubtract);
						setState(177);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61\3\5"+
		"\3\5\3\5\3\5\6\58\n\5\r\5\16\59\3\6\3\6\3\6\3\6\3\6\3\6\6\6B\n\6\r\6\16"+
		"\6C\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\5\bZ\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13m\n\13\r\13\16\13n\3\13\5\13r\n"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16}\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0086\n\17\f\17\16\17\u0089\13\17\3\17\3\17\3"+
		"\17\5\17\u008e\n\17\3\17\3\17\3\17\3\17\5\17\u0094\n\17\3\20\3\20\3\20"+
		"\3\20\7\20\u009a\n\20\f\20\16\20\u009d\13\20\5\20\u009f\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ad\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\21"+
		"\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2FG\3\2\65:\3\2"+
		"MN\4\2\3\3\23\25\2\u00c1\2\"\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b\63\3\2\2"+
		"\2\n;\3\2\2\2\fG\3\2\2\2\16Y\3\2\2\2\20]\3\2\2\2\22a\3\2\2\2\24q\3\2\2"+
		"\2\26s\3\2\2\2\30w\3\2\2\2\32z\3\2\2\2\34\u0093\3\2\2\2\36\u009e\3\2\2"+
		"\2 \u00ac\3\2\2\2\"#\5\6\4\2#$\5\b\5\2$%\5\n\6\2%&\5\f\7\2&\3\3\2\2\2"+
		"\'*\5\16\b\2(*\5\26\f\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+/\7B\2\2,-\5\4"+
		"\3\2-.\7?\2\2.\60\3\2\2\2/,\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\7\3\2\2\2\63\64\7C\2\2\64\67\5\26\f\2\65\66\7?\2\2\668\5\26"+
		"\f\2\67\65\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;<\7D\2\2"+
		"<E\5\20\t\2=F\7?\2\2>?\5\22\n\2?@\5\20\t\2@B\3\2\2\2A>\3\2\2\2BC\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E=\3\2\2\2EA\3\2\2\2F\13\3\2\2\2GH\7E"+
		"\2\2HI\t\2\2\2IN\5 \21\2JK\7A\2\2KM\5 \21\2LJ\3\2\2\2MP\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7K\2\2RS\3\2\2\2ST\7\26\2\2TU\5\24"+
		"\13\2UV\7?\2\2V\r\3\2\2\2WZ\7\26\2\2XZ\5\34\17\2YW\3\2\2\2YX\3\2\2\2Z"+
		"[\3\2\2\2[\\\7\61\2\2\\\17\3\2\2\2]^\7\26\2\2^_\t\3\2\2_`\7\26\2\2`\21"+
		"\3\2\2\2ab\5\20\t\2bc\t\4\2\2cd\5\20\t\2d\23\3\2\2\2ef\7I\2\2fr\7H\2\2"+
		"gh\7\3\2\2hi\7@\2\2il\7\3\2\2jk\7@\2\2km\7\3\2\2lj\3\2\2\2mn\3\2\2\2n"+
		"l\3\2\2\2no\3\2\2\2op\3\2\2\2pr\7J\2\2qe\3\2\2\2qg\3\2\2\2r\25\3\2\2\2"+
		"st\7\26\2\2tu\7\64\2\2uv\5 \21\2v\27\3\2\2\2wx\7L\2\2xy\5 \21\2y\31\3"+
		"\2\2\2z|\7O\2\2{}\7L\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\5\36\20\2"+
		"\177\33\3\2\2\2\u0080\u0081\7\26\2\2\u0081\u008d\7=\2\2\u0082\u0087\7"+
		"\3\2\2\u0083\u0084\7A\2\2\u0084\u0086\7\3\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008e\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\23\2\2\u008b\u008c\7A\2\2\u008c"+
		"\u008e\7\23\2\2\u008d\u0082\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0094\7>\2\2\u0090\u0091\7\26\2\2\u0091\u0092\7=\2\2\u0092"+
		"\u0094\7>\2\2\u0093\u0080\3\2\2\2\u0093\u0090\3\2\2\2\u0094\35\3\2\2\2"+
		"\u0095\u009f\5 \21\2\u0096\u009b\5 \21\2\u0097\u0098\7A\2\2\u0098\u009a"+
		"\5 \21\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0095\3\2"+
		"\2\2\u009e\u0096\3\2\2\2\u009f\37\3\2\2\2\u00a0\u00a1\b\21\1\2\u00a1\u00ad"+
		"\t\5\2\2\u00a2\u00ad\7\26\2\2\u00a3\u00ad\5\34\17\2\u00a4\u00ad\5\26\f"+
		"\2\u00a5\u00ad\5\16\b\2\u00a6\u00a7\7;\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9"+
		"\7<\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ad\5\30\r\2\u00ab\u00ad\5\32\16\2"+
		"\u00ac\u00a0\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4"+
		"\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b6\3\2\2\2\u00ae\u00af\f\f\2\2\u00af\u00b0\7\62"+
		"\2\2\u00b0\u00b5\5 \21\r\u00b1\u00b2\f\13\2\2\u00b2\u00b3\7\63\2\2\u00b3"+
		"\u00b5\5 \21\f\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\24)\619CENYnq|\u0087\u008d\u0093\u009b\u009e\u00ac\u00b4\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}