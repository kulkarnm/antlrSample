// Generated from Benefit.g4 by ANTLR 4.13.0

package com.affaince.benefits.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BenefitParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GIVEN=1, ASINPUT=2, COMPUTE=3, EACH=4, SUMOF=5, ELIGIBLEWHEN=6, PAY=7, 
		BEFORE=8, AFTER=9, IN=10, PROPORTION=11, DEFAULT=12, OF=13, ANDSTR=14, 
		ORSTR=15, NULL=16, NUMBER=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, 
		LBRACK=22, RBRACK=23, COMMA=24, SEMI=25, COLON=26, ASSIGN=27, GT=28, LT=29, 
		BANG=30, EQUAL=31, LE=32, GE=33, NOTEQUAL=34, INC=35, DEC=36, ADD=37, 
		SUB=38, MUL=39, DIV=40, MOD=41, QUESTIONMARK=42, BOOLEANLITERAL=43, CHARACTERLITERAL=44, 
		STRINGLITERAL=45, IDENTIFIER=46, WS=47, COMMENT=48, LINE_COMMENT=49;
	public static final int
		RULE_scheme = 0, RULE_givenUnit = 1, RULE_givenBody = 2, RULE_computeUnit = 3, 
		RULE_computeBlock = 4, RULE_eligibilityUnit = 5, RULE_payUnit = 6, RULE_benefitPayComputeBlock = 7, 
		RULE_separatedInstalmentDeliverySequencesExpression = 8, RULE_payBefore = 9, 
		RULE_payAfter = 10, RULE_payMultiplier = 11, RULE_variableDeclarationStatement = 12, 
		RULE_variableDeclaratorId = 13, RULE_variableInitializer = 14, RULE_arrayInitializer = 15, 
		RULE_conditionalExpression = 16, RULE_conditionalOrExpression = 17, RULE_conditionalAndExpression = 18, 
		RULE_relationalOp = 19, RULE_relationalExpression = 20, RULE_additiveExpression = 21, 
		RULE_multiplicativeExpression = 22, RULE_unaryExpression = 23, RULE_primary = 24, 
		RULE_variableName = 25, RULE_connectorAnd = 26, RULE_connectorOr = 27, 
		RULE_parExpression = 28, RULE_nonDefaultProportionExpression = 29, RULE_proportionExpression = 30, 
		RULE_expressionList = 31, RULE_expression = 32, RULE_literal = 33, RULE_iterativeStatement = 34, 
		RULE_iterativeAggregationExpression = 35, RULE_statement = 36, RULE_statementExpression = 37, 
		RULE_block = 38, RULE_blockStatement = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"scheme", "givenUnit", "givenBody", "computeUnit", "computeBlock", "eligibilityUnit", 
			"payUnit", "benefitPayComputeBlock", "separatedInstalmentDeliverySequencesExpression", 
			"payBefore", "payAfter", "payMultiplier", "variableDeclarationStatement", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "conditionalExpression", 
			"conditionalOrExpression", "conditionalAndExpression", "relationalOp", 
			"relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primary", "variableName", "connectorAnd", "connectorOr", 
			"parExpression", "nonDefaultProportionExpression", "proportionExpression", 
			"expressionList", "expression", "literal", "iterativeStatement", "iterativeAggregationExpression", 
			"statement", "statementExpression", "block", "blockStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'given'", "' as input'", "'compute'", "'each'", "'sumOf'", "'eligibleWhen'", 
			"'pay'", "'before'", "'after'", "'in'", "'proportion'", "'default'", 
			"'of'", null, null, "'null'", null, "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "','", "';'", "':'", "'='", "'>'", "'<'", "'!'", "'=='", "'<='", 
			"'>='", "'!='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GIVEN", "ASINPUT", "COMPUTE", "EACH", "SUMOF", "ELIGIBLEWHEN", 
			"PAY", "BEFORE", "AFTER", "IN", "PROPORTION", "DEFAULT", "OF", "ANDSTR", 
			"ORSTR", "NULL", "NUMBER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "COMMA", "SEMI", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"QUESTIONMARK", "BOOLEANLITERAL", "CHARACTERLITERAL", "STRINGLITERAL", 
			"IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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

	@SuppressWarnings("CheckReturnValue")
	public static class SchemeContext extends ParserRuleContext {
		public GivenUnitContext givenUnit() {
			return getRuleContext(GivenUnitContext.class,0);
		}
		public ComputeUnitContext computeUnit() {
			return getRuleContext(ComputeUnitContext.class,0);
		}
		public EligibilityUnitContext eligibilityUnit() {
			return getRuleContext(EligibilityUnitContext.class,0);
		}
		public PayUnitContext payUnit() {
			return getRuleContext(PayUnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BenefitParser.EOF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitScheme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemeContext scheme() throws RecognitionException {
		SchemeContext _localctx = new SchemeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_scheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			givenUnit();
			setState(81);
			computeUnit();
			setState(82);
			eligibilityUnit();
			setState(83);
			payUnit();
			setState(84);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GivenUnitContext extends ParserRuleContext {
		public TerminalNode GIVEN() { return getToken(BenefitParser.GIVEN, 0); }
		public GivenBodyContext givenBody() {
			return getRuleContext(GivenBodyContext.class,0);
		}
		public GivenUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givenUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterGivenUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitGivenUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitGivenUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenUnitContext givenUnit() throws RecognitionException {
		GivenUnitContext _localctx = new GivenUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_givenUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(GIVEN);
			setState(87);
			givenBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GivenBodyContext extends ParserRuleContext {
		public List<VariableDeclarationStatementContext> variableDeclarationStatement() {
			return getRuleContexts(VariableDeclarationStatementContext.class);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement(int i) {
			return getRuleContext(VariableDeclarationStatementContext.class,i);
		}
		public GivenBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givenBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterGivenBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitGivenBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitGivenBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenBodyContext givenBody() throws RecognitionException {
		GivenBodyContext _localctx = new GivenBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_givenBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(89);
				variableDeclarationStatement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComputeUnitContext extends ParserRuleContext {
		public TerminalNode COMPUTE() { return getToken(BenefitParser.COMPUTE, 0); }
		public ComputeBlockContext computeBlock() {
			return getRuleContext(ComputeBlockContext.class,0);
		}
		public ComputeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterComputeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitComputeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitComputeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeUnitContext computeUnit() throws RecognitionException {
		ComputeUnitContext _localctx = new ComputeUnitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_computeUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(COMPUTE);
			setState(96);
			computeBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComputeBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ComputeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterComputeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitComputeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitComputeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeBlockContext computeBlock() throws RecognitionException {
		ComputeBlockContext _localctx = new ComputeBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_computeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EligibilityUnitContext extends ParserRuleContext {
		public TerminalNode ELIGIBLEWHEN() { return getToken(BenefitParser.ELIGIBLEWHEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EligibilityUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eligibilityUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterEligibilityUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitEligibilityUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitEligibilityUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EligibilityUnitContext eligibilityUnit() throws RecognitionException {
		EligibilityUnitContext _localctx = new EligibilityUnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eligibilityUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ELIGIBLEWHEN);
			setState(101);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PayUnitContext extends ParserRuleContext {
		public TerminalNode PAY() { return getToken(BenefitParser.PAY, 0); }
		public BenefitPayComputeBlockContext benefitPayComputeBlock() {
			return getRuleContext(BenefitPayComputeBlockContext.class,0);
		}
		public SeparatedInstalmentDeliverySequencesExpressionContext separatedInstalmentDeliverySequencesExpression() {
			return getRuleContext(SeparatedInstalmentDeliverySequencesExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BenefitParser.SEMI, 0); }
		public PayBeforeContext payBefore() {
			return getRuleContext(PayBeforeContext.class,0);
		}
		public PayAfterContext payAfter() {
			return getRuleContext(PayAfterContext.class,0);
		}
		public PayUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterPayUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitPayUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitPayUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayUnitContext payUnit() throws RecognitionException {
		PayUnitContext _localctx = new PayUnitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_payUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PAY);
			setState(104);
			benefitPayComputeBlock();
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE:
				{
				setState(105);
				payBefore();
				}
				break;
			case AFTER:
				{
				setState(106);
				payAfter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			separatedInstalmentDeliverySequencesExpression();
			setState(110);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BenefitPayComputeBlockContext extends ParserRuleContext {
		public ComputeBlockContext computeBlock() {
			return getRuleContext(ComputeBlockContext.class,0);
		}
		public BenefitPayComputeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_benefitPayComputeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterBenefitPayComputeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitBenefitPayComputeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitBenefitPayComputeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BenefitPayComputeBlockContext benefitPayComputeBlock() throws RecognitionException {
		BenefitPayComputeBlockContext _localctx = new BenefitPayComputeBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_benefitPayComputeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			computeBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeparatedInstalmentDeliverySequencesExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PayMultiplierContext> payMultiplier() {
			return getRuleContexts(PayMultiplierContext.class);
		}
		public PayMultiplierContext payMultiplier(int i) {
			return getRuleContext(PayMultiplierContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public ProportionExpressionContext proportionExpression() {
			return getRuleContext(ProportionExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BenefitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BenefitParser.COMMA, i);
		}
		public SeparatedInstalmentDeliverySequencesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separatedInstalmentDeliverySequencesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterSeparatedInstalmentDeliverySequencesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitSeparatedInstalmentDeliverySequencesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitSeparatedInstalmentDeliverySequencesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatedInstalmentDeliverySequencesExpressionContext separatedInstalmentDeliverySequencesExpression() throws RecognitionException {
		SeparatedInstalmentDeliverySequencesExpressionContext _localctx = new SeparatedInstalmentDeliverySequencesExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_separatedInstalmentDeliverySequencesExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			expression();
			setState(115);
			payMultiplier();
			setState(116);
			variableName();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				expression();
				setState(119);
				payMultiplier();
				setState(120);
				variableName();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			proportionExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PayBeforeContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(BenefitParser.BEFORE, 0); }
		public PayBeforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payBefore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterPayBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitPayBefore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitPayBefore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayBeforeContext payBefore() throws RecognitionException {
		PayBeforeContext _localctx = new PayBeforeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_payBefore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(BEFORE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PayAfterContext extends ParserRuleContext {
		public TerminalNode AFTER() { return getToken(BenefitParser.AFTER, 0); }
		public PayAfterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payAfter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterPayAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitPayAfter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitPayAfter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayAfterContext payAfter() throws RecognitionException {
		PayAfterContext _localctx = new PayAfterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_payAfter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(AFTER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PayMultiplierContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(BenefitParser.OF, 0); }
		public PayMultiplierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payMultiplier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterPayMultiplier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitPayMultiplier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitPayMultiplier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayMultiplierContext payMultiplier() throws RecognitionException {
		PayMultiplierContext _localctx = new PayMultiplierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_payMultiplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(OF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BenefitParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(BenefitParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode ASINPUT() { return getToken(BenefitParser.ASINPUT, 0); }
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarationStatement);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				variableDeclaratorId();
				setState(136);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				variableDeclaratorId();
				setState(139);
				match(ASSIGN);
				setState(140);
				variableInitializer();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(141);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				variableDeclaratorId();
				setState(145);
				match(ASINPUT);
				setState(146);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(BenefitParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(BenefitParser.RBRACK, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			variableName();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(151);
				match(LBRACK);
				setState(152);
				match(RBRACK);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableInitializer);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				arrayInitializer();
				}
				break;
			case EACH:
			case SUMOF:
			case NULL:
			case NUMBER:
			case LPAREN:
			case ADD:
			case SUB:
			case BOOLEANLITERAL:
			case CHARACTERLITERAL:
			case STRINGLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BenefitParser.LBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(BenefitParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BenefitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BenefitParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LBRACE);
			setState(160);
			variableInitializer();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				variableInitializer();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTIONMARK() { return getToken(BenefitParser.QUESTIONMARK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BenefitParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalExpression);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				conditionalOrExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				conditionalOrExpression(0);
				setState(172);
				match(QUESTIONMARK);
				setState(173);
				expression();
				setState(174);
				match(COLON);
				setState(175);
				conditionalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConnectorOrContext connectorOr() {
			return getRuleContext(ConnectorOrContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(182);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(183);
					connectorOr();
					setState(184);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConnectorAndContext connectorAnd() {
			return getRuleContext(ConnectorAndContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(192);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(194);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(195);
					connectorAnd();
					setState(196);
					relationalExpression(0);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(BenefitParser.GT, 0); }
		public TerminalNode GE() { return getToken(BenefitParser.GE, 0); }
		public TerminalNode LE() { return getToken(BenefitParser.LE, 0); }
		public TerminalNode LT() { return getToken(BenefitParser.LT, 0); }
		public TerminalNode EQUAL() { return getToken(BenefitParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(BenefitParser.NOTEQUAL, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33017561088L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public IterativeStatementContext iterativeStatement() {
			return getRuleContext(IterativeStatementContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(BenefitParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(BenefitParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(BenefitParser.LT, 0); }
		public TerminalNode LE() { return getToken(BenefitParser.LE, 0); }
		public TerminalNode GT() { return getToken(BenefitParser.GT, 0); }
		public TerminalNode GE() { return getToken(BenefitParser.GE, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(206);
				additiveExpression(0);
				}
				break;
			case 2:
				{
				setState(207);
				iterativeStatement();
				setState(208);
				match(EQUAL);
				setState(209);
				additiveExpression(0);
				}
				break;
			case 3:
				{
				setState(211);
				iterativeStatement();
				setState(212);
				match(NOTEQUAL);
				setState(213);
				additiveExpression(0);
				}
				break;
			case 4:
				{
				setState(215);
				iterativeStatement();
				setState(216);
				match(LT);
				setState(217);
				additiveExpression(0);
				}
				break;
			case 5:
				{
				setState(219);
				iterativeStatement();
				setState(220);
				match(LE);
				setState(221);
				additiveExpression(0);
				}
				break;
			case 6:
				{
				setState(223);
				iterativeStatement();
				setState(224);
				match(GT);
				setState(225);
				additiveExpression(0);
				}
				break;
			case 7:
				{
				setState(227);
				iterativeStatement();
				setState(228);
				match(GE);
				setState(229);
				additiveExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						match(EQUAL);
						setState(235);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						match(NOTEQUAL);
						setState(238);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						match(LT);
						setState(241);
						additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(242);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(243);
						match(LE);
						setState(244);
						additiveExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246);
						match(GT);
						setState(247);
						additiveExpression(0);
						}
						break;
					case 6:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(248);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(249);
						match(GE);
						setState(250);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public IterativeAggregationExpressionContext iterativeAggregationExpression() {
			return getRuleContext(IterativeAggregationExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(BenefitParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(BenefitParser.SUB, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case NUMBER:
			case LPAREN:
			case ADD:
			case SUB:
			case BOOLEANLITERAL:
			case CHARACTERLITERAL:
			case STRINGLITERAL:
			case IDENTIFIER:
				{
				setState(257);
				multiplicativeExpression(0);
				}
				break;
			case SUMOF:
				{
				setState(258);
				iterativeAggregationExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
						match(ADD);
						setState(263);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(264);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(265);
						match(SUB);
						setState(266);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(BenefitParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BenefitParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BenefitParser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(273);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						match(MUL);
						setState(277);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						match(DIV);
						setState(280);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(281);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(282);
						match(MOD);
						setState(283);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(BenefitParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BenefitParser.SUB, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryExpression);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(ADD);
				setState(290);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(SUB);
				setState(292);
				unaryExpression();
				}
				break;
			case NULL:
			case NUMBER:
			case LPAREN:
			case BOOLEANLITERAL:
			case CHARACTERLITERAL:
			case STRINGLITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				primary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primary);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				parExpression();
				}
				break;
			case NULL:
			case NUMBER:
			case BOOLEANLITERAL:
			case CHARACTERLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				variableName();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectorAndContext extends ParserRuleContext {
		public TerminalNode ANDSTR() { return getToken(BenefitParser.ANDSTR, 0); }
		public ConnectorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectorAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterConnectorAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitConnectorAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitConnectorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectorAndContext connectorAnd() throws RecognitionException {
		ConnectorAndContext _localctx = new ConnectorAndContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_connectorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(ANDSTR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectorOrContext extends ParserRuleContext {
		public TerminalNode ORSTR() { return getToken(BenefitParser.ORSTR, 0); }
		public ConnectorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectorOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterConnectorOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitConnectorOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitConnectorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectorOrContext connectorOr() throws RecognitionException {
		ConnectorOrContext _localctx = new ConnectorOrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_connectorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ORSTR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BenefitParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BenefitParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LPAREN);
			setState(308);
			expression();
			setState(309);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonDefaultProportionExpressionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(BenefitParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(BenefitParser.NUMBER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(BenefitParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BenefitParser.COLON, i);
		}
		public NonDefaultProportionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonDefaultProportionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterNonDefaultProportionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitNonDefaultProportionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitNonDefaultProportionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonDefaultProportionExpressionContext nonDefaultProportionExpression() throws RecognitionException {
		NonDefaultProportionExpressionContext _localctx = new NonDefaultProportionExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nonDefaultProportionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(NUMBER);
			setState(312);
			match(COLON);
			setState(313);
			match(NUMBER);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(314);
				match(COLON);
				setState(315);
				match(NUMBER);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProportionExpressionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(BenefitParser.IN, 0); }
		public TerminalNode PROPORTION() { return getToken(BenefitParser.PROPORTION, 0); }
		public TerminalNode DEFAULT() { return getToken(BenefitParser.DEFAULT, 0); }
		public NonDefaultProportionExpressionContext nonDefaultProportionExpression() {
			return getRuleContext(NonDefaultProportionExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitProportionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProportionExpressionContext proportionExpression() throws RecognitionException {
		ProportionExpressionContext _localctx = new ProportionExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_proportionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IN);
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(322);
				match(DEFAULT);
				}
				break;
			case NUMBER:
				{
				setState(323);
				nonDefaultProportionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			match(PROPORTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BenefitParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BenefitParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			expression();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				expression();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BenefitParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			conditionalExpression();
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(337);
				match(ASSIGN);
				setState(338);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BenefitParser.NUMBER, 0); }
		public TerminalNode CHARACTERLITERAL() { return getToken(BenefitParser.CHARACTERLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(BenefitParser.STRINGLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(BenefitParser.BOOLEANLITERAL, 0); }
		public TerminalNode NULL() { return getToken(BenefitParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651352064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterativeStatementContext extends ParserRuleContext {
		public TerminalNode EACH() { return getToken(BenefitParser.EACH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterativeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterIterativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitIterativeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitIterativeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeStatementContext iterativeStatement() throws RecognitionException {
		IterativeStatementContext _localctx = new IterativeStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_iterativeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(EACH);
			setState(344);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterativeAggregationExpressionContext extends ParserRuleContext {
		public TerminalNode SUMOF() { return getToken(BenefitParser.SUMOF, 0); }
		public TerminalNode EACH() { return getToken(BenefitParser.EACH, 0); }
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterativeAggregationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeAggregationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterIterativeAggregationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitIterativeAggregationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitIterativeAggregationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeAggregationExpressionContext iterativeAggregationExpression() throws RecognitionException {
		IterativeAggregationExpressionContext _localctx = new IterativeAggregationExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iterativeAggregationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(SUMOF);
			setState(347);
			match(EACH);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(348);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(349);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BenefitParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			statementExpression();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(353);
				match(SEMI);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 132353712652336L) != 0)) {
				{
				{
				setState(358);
				blockStatement();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockStatement);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				variableDeclarationStatement();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 18:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 20:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 21:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 22:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00011\u0171\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002[\b\u0002\n\u0002"+
		"\f\u0002^\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b{\b\b\n\b\f\b~\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008f\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0095\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u009a\b\r"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u009e\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00a4\b\u000f\n\u000f\f\u000f\u00a7"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b2\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00bb\b\u0011\n\u0011\f\u0011\u00be\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00c7\b\u0012\n\u0012\f\u0012\u00ca\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e8\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00fc"+
		"\b\u0014\n\u0014\f\u0014\u00ff\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0104\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u010c\b\u0015\n\u0015\f\u0015\u010f"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u011d\b\u0016\n\u0016\f\u0016\u0120\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0127\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u012c\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u013d\b\u001d\n\u001d\f\u001d\u0140"+
		"\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0145\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u014c\b\u001f\n\u001f\f\u001f\u014f\t\u001f\u0001 \u0001 \u0001 \u0003"+
		" \u0154\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#"+
		"\u0001#\u0003#\u015f\b#\u0001$\u0001$\u0003$\u0163\b$\u0001%\u0001%\u0001"+
		"&\u0005&\u0168\b&\n&\f&\u016b\t&\u0001\'\u0001\'\u0003\'\u016f\b\'\u0001"+
		"\'\u0000\u0005\"$(*,(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0002"+
		"\u0002\u0000\u001c\u001d\u001f\"\u0002\u0000\u0010\u0011+-\u0172\u0000"+
		"P\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004\\\u0001"+
		"\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000"+
		"\u0000\nd\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000ep\u0001"+
		"\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000"+
		"\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u0096\u0001\u0000"+
		"\u0000\u0000\u001c\u009d\u0001\u0000\u0000\u0000\u001e\u009f\u0001\u0000"+
		"\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00b3\u0001\u0000\u0000"+
		"\u0000$\u00bf\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000("+
		"\u00e7\u0001\u0000\u0000\u0000*\u0103\u0001\u0000\u0000\u0000,\u0110\u0001"+
		"\u0000\u0000\u0000.\u0126\u0001\u0000\u0000\u00000\u012b\u0001\u0000\u0000"+
		"\u00002\u012d\u0001\u0000\u0000\u00004\u012f\u0001\u0000\u0000\u00006"+
		"\u0131\u0001\u0000\u0000\u00008\u0133\u0001\u0000\u0000\u0000:\u0137\u0001"+
		"\u0000\u0000\u0000<\u0141\u0001\u0000\u0000\u0000>\u0148\u0001\u0000\u0000"+
		"\u0000@\u0150\u0001\u0000\u0000\u0000B\u0155\u0001\u0000\u0000\u0000D"+
		"\u0157\u0001\u0000\u0000\u0000F\u015a\u0001\u0000\u0000\u0000H\u0160\u0001"+
		"\u0000\u0000\u0000J\u0164\u0001\u0000\u0000\u0000L\u0169\u0001\u0000\u0000"+
		"\u0000N\u016e\u0001\u0000\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0003"+
		"\u0006\u0003\u0000RS\u0003\n\u0005\u0000ST\u0003\f\u0006\u0000TU\u0005"+
		"\u0000\u0000\u0001U\u0001\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000"+
		"\u0000WX\u0003\u0004\u0002\u0000X\u0003\u0001\u0000\u0000\u0000Y[\u0003"+
		"\u0018\f\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0005\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0003\u0000\u0000`a\u0003"+
		"\b\u0004\u0000a\u0007\u0001\u0000\u0000\u0000bc\u0003L&\u0000c\t\u0001"+
		"\u0000\u0000\u0000de\u0005\u0006\u0000\u0000ef\u0003L&\u0000f\u000b\u0001"+
		"\u0000\u0000\u0000gh\u0005\u0007\u0000\u0000hk\u0003\u000e\u0007\u0000"+
		"il\u0003\u0012\t\u0000jl\u0003\u0014\n\u0000ki\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0003\u0010\b\u0000"+
		"no\u0005\u0019\u0000\u0000o\r\u0001\u0000\u0000\u0000pq\u0003\b\u0004"+
		"\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0003@ \u0000st\u0003\u0016\u000b"+
		"\u0000t|\u00032\u0019\u0000uv\u0005\u0018\u0000\u0000vw\u0003@ \u0000"+
		"wx\u0003\u0016\u000b\u0000xy\u00032\u0019\u0000y{\u0001\u0000\u0000\u0000"+
		"zu\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0003<\u001e\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0013\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\r\u0000\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0003\u001a\r\u0000\u0088\u0089\u0005\u0019\u0000\u0000\u0089\u0095"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u001a\r\u0000\u008b\u008c\u0005"+
		"\u001b\u0000\u0000\u008c\u008e\u0003\u001c\u000e\u0000\u008d\u008f\u0005"+
		"\u0019\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0095\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		"\u001a\r\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0093\u0005\u0019"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0087\u0001\u0000"+
		"\u0000\u0000\u0094\u008a\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000"+
		"\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000\u0096\u0099\u00032\u0019"+
		"\u0000\u0097\u0098\u0005\u0016\u0000\u0000\u0098\u009a\u0005\u0017\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009e\u0003\u001e\u000f"+
		"\u0000\u009c\u009e\u0003@ \u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u001d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a5\u0003\u001c\u000e\u0000\u00a1"+
		"\u00a2\u0005\u0018\u0000\u0000\u00a2\u00a4\u0003\u001c\u000e\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0015\u0000\u0000\u00a9\u001f\u0001\u0000\u0000\u0000\u00aa"+
		"\u00b2\u0003\"\u0011\u0000\u00ab\u00ac\u0003\"\u0011\u0000\u00ac\u00ad"+
		"\u0005*\u0000\u0000\u00ad\u00ae\u0003@ \u0000\u00ae\u00af\u0005\u001a"+
		"\u0000\u0000\u00af\u00b0\u0003 \u0010\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00aa\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b2!\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\u0011\uffff\uffff"+
		"\u0000\u00b4\u00b5\u0003$\u0012\u0000\u00b5\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\n\u0001\u0000\u0000\u00b7\u00b8\u00036\u001b\u0000\u00b8"+
		"\u00b9\u0003$\u0012\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd#\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0006"+
		"\u0012\uffff\uffff\u0000\u00c0\u00c1\u0003(\u0014\u0000\u00c1\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\n\u0001\u0000\u0000\u00c3\u00c4\u00034"+
		"\u001a\u0000\u00c4\u00c5\u0003(\u0014\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9%\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc\'\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0006\u0014\uffff\uffff\u0000\u00ce\u00e8\u0003*\u0015\u0000\u00cf"+
		"\u00d0\u0003D\"\u0000\u00d0\u00d1\u0005\u001f\u0000\u0000\u00d1\u00d2"+
		"\u0003*\u0015\u0000\u00d2\u00e8\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003"+
		"D\"\u0000\u00d4\u00d5\u0005\"\u0000\u0000\u00d5\u00d6\u0003*\u0015\u0000"+
		"\u00d6\u00e8\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003D\"\u0000\u00d8"+
		"\u00d9\u0005\u001d\u0000\u0000\u00d9\u00da\u0003*\u0015\u0000\u00da\u00e8"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0003D\"\u0000\u00dc\u00dd\u0005"+
		" \u0000\u0000\u00dd\u00de\u0003*\u0015\u0000\u00de\u00e8\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0003D\"\u0000\u00e0\u00e1\u0005\u001c\u0000\u0000"+
		"\u00e1\u00e2\u0003*\u0015\u0000\u00e2\u00e8\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0003D\"\u0000\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u00e6\u0003"+
		"*\u0015\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00cd\u0001\u0000"+
		"\u0000\u0000\u00e7\u00cf\u0001\u0000\u0000\u0000\u00e7\u00d3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00d7\u0001\u0000\u0000\u0000\u00e7\u00db\u0001\u0000"+
		"\u0000\u0000\u00e7\u00df\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e8\u00fd\u0001\u0000\u0000\u0000\u00e9\u00ea\n\f\u0000"+
		"\u0000\u00ea\u00eb\u0005\u001f\u0000\u0000\u00eb\u00fc\u0003*\u0015\u0000"+
		"\u00ec\u00ed\n\u000b\u0000\u0000\u00ed\u00ee\u0005\"\u0000\u0000\u00ee"+
		"\u00fc\u0003*\u0015\u0000\u00ef\u00f0\n\n\u0000\u0000\u00f0\u00f1\u0005"+
		"\u001d\u0000\u0000\u00f1\u00fc\u0003*\u0015\u0000\u00f2\u00f3\n\t\u0000"+
		"\u0000\u00f3\u00f4\u0005 \u0000\u0000\u00f4\u00fc\u0003*\u0015\u0000\u00f5"+
		"\u00f6\n\b\u0000\u0000\u00f6\u00f7\u0005\u001c\u0000\u0000\u00f7\u00fc"+
		"\u0003*\u0015\u0000\u00f8\u00f9\n\u0007\u0000\u0000\u00f9\u00fa\u0005"+
		"!\u0000\u0000\u00fa\u00fc\u0003*\u0015\u0000\u00fb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00ec\u0001\u0000\u0000\u0000\u00fb\u00ef\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0006\u0015\uffff\uffff\u0000\u0101\u0104\u0003,\u0016\u0000"+
		"\u0102\u0104\u0003F#\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u010d\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\n\u0003\u0000\u0000\u0106\u0107\u0005%\u0000\u0000\u0107\u010c\u0003"+
		",\u0016\u0000\u0108\u0109\n\u0002\u0000\u0000\u0109\u010a\u0005&\u0000"+
		"\u0000\u010a\u010c\u0003,\u0016\u0000\u010b\u0105\u0001\u0000\u0000\u0000"+
		"\u010b\u0108\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e+\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0006\u0016\uffff\uffff\u0000\u0111\u0112\u0003.\u0017\u0000\u0112"+
		"\u011e\u0001\u0000\u0000\u0000\u0113\u0114\n\u0003\u0000\u0000\u0114\u0115"+
		"\u0005\'\u0000\u0000\u0115\u011d\u0003.\u0017\u0000\u0116\u0117\n\u0002"+
		"\u0000\u0000\u0117\u0118\u0005(\u0000\u0000\u0118\u011d\u0003.\u0017\u0000"+
		"\u0119\u011a\n\u0001\u0000\u0000\u011a\u011b\u0005)\u0000\u0000\u011b"+
		"\u011d\u0003.\u0017\u0000\u011c\u0113\u0001\u0000\u0000\u0000\u011c\u0116"+
		"\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011d\u0120"+
		"\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f-\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005%\u0000\u0000\u0122\u0127\u0003.\u0017"+
		"\u0000\u0123\u0124\u0005&\u0000\u0000\u0124\u0127\u0003.\u0017\u0000\u0125"+
		"\u0127\u00030\u0018\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127/\u0001"+
		"\u0000\u0000\u0000\u0128\u012c\u00038\u001c\u0000\u0129\u012c\u0003B!"+
		"\u0000\u012a\u012c\u00032\u0019\u0000\u012b\u0128\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000"+
		"\u012c1\u0001\u0000\u0000\u0000\u012d\u012e\u0005.\u0000\u0000\u012e3"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u000e\u0000\u0000\u01305\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005\u000f\u0000\u0000\u01327\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005\u0012\u0000\u0000\u0134\u0135\u0003@ \u0000"+
		"\u0135\u0136\u0005\u0013\u0000\u0000\u01369\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005\u0011\u0000\u0000\u0138\u0139\u0005\u001a\u0000\u0000\u0139"+
		"\u013e\u0005\u0011\u0000\u0000\u013a\u013b\u0005\u001a\u0000\u0000\u013b"+
		"\u013d\u0005\u0011\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f;\u0001\u0000\u0000\u0000\u0140\u013e"+
		"\u0001\u0000\u0000\u0000\u0141\u0144\u0005\n\u0000\u0000\u0142\u0145\u0005"+
		"\f\u0000\u0000\u0143\u0145\u0003:\u001d\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\u000b\u0000\u0000\u0147=\u0001\u0000\u0000"+
		"\u0000\u0148\u014d\u0003@ \u0000\u0149\u014a\u0005\u0018\u0000\u0000\u014a"+
		"\u014c\u0003@ \u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014f\u0001"+
		"\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e?\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u0150\u0153\u0003 \u0010\u0000\u0151\u0152\u0005\u001b\u0000"+
		"\u0000\u0152\u0154\u0003@ \u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154A\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0007\u0001\u0000\u0000\u0156C\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"\u0004\u0000\u0000\u0158\u0159\u0003@ \u0000\u0159E\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005\u0005\u0000\u0000\u015b\u015e\u0005\u0004\u0000"+
		"\u0000\u015c\u015f\u0003\u0018\f\u0000\u015d\u015f\u0003@ \u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015f"+
		"G\u0001\u0000\u0000\u0000\u0160\u0162\u0003J%\u0000\u0161\u0163\u0005"+
		"\u0019\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163I\u0001\u0000\u0000\u0000\u0164\u0165\u0003@ "+
		"\u0000\u0165K\u0001\u0000\u0000\u0000\u0166\u0168\u0003N\'\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"M\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016f"+
		"\u0003H$\u0000\u016d\u016f\u0003\u0018\f\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016fO\u0001\u0000\u0000"+
		"\u0000\u001d\\k|\u008e\u0094\u0099\u009d\u00a5\u00b1\u00bc\u00c8\u00e7"+
		"\u00fb\u00fd\u0103\u010b\u010d\u011c\u011e\u0126\u012b\u013e\u0144\u014d"+
		"\u0153\u015e\u0162\u0169\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}