// Generated from Benefit.g4 by ANTLR 4.9.2

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
		GIVEN=1, ASINPUT=2, COMPUTE=3, EACH=4, SUMOF=5, ELIGIBLEWHEN=6, PAY=7, 
		BEFORE=8, AFTER=9, IN=10, PROPORTION=11, DEFAULT=12, OF=13, ANDSTR=14, 
		ORSTR=15, BooleanLiteral=16, NullLiteral=17, IDENTIFIER=18, NUMBER=19, 
		LPAREN=20, RPAREN=21, LBRACE=22, RBRACE=23, LBRACK=24, RBRACK=25, COMMA=26, 
		SEMI=27, COLON=28, ASSIGN=29, GT=30, LT=31, BANG=32, EQUAL=33, LE=34, 
		GE=35, NOTEQUAL=36, INC=37, DEC=38, ADD=39, SUB=40, MUL=41, DIV=42, MOD=43, 
		QUESTIONMARK=44, CharacterLiteral=45, StringLiteral=46, WS=47, COMMENT=48, 
		LINE_COMMENT=49;
	public static final int
		RULE_scheme = 0, RULE_givenUnit = 1, RULE_givenBody = 2, RULE_computeUnit = 3, 
		RULE_computeBlock = 4, RULE_eligibilityUnit = 5, RULE_payUnit = 6, RULE_payBefore = 7, 
		RULE_payAfter = 8, RULE_payMultiplier = 9, RULE_variableDeclarationStatement = 10, 
		RULE_variableDeclaratorId = 11, RULE_variableInitializer = 12, RULE_arrayInitializer = 13, 
		RULE_conditionalExpression = 14, RULE_conditionalOrExpression = 15, RULE_conditionalAndExpression = 16, 
		RULE_relationalOp = 17, RULE_relationalExpression = 18, RULE_additiveExpression = 19, 
		RULE_multiplicativeExpression = 20, RULE_unaryExpression = 21, RULE_primary = 22, 
		RULE_variableName = 23, RULE_connectorAnd = 24, RULE_connectorOr = 25, 
		RULE_parExpression = 26, RULE_nonDefaultProportionExpression = 27, RULE_proportionExpression = 28, 
		RULE_expressionList = 29, RULE_expression = 30, RULE_literal = 31, RULE_iterativeStatement = 32, 
		RULE_iterativeAggregationExpression = 33, RULE_statement = 34, RULE_statementExpression = 35, 
		RULE_block = 36, RULE_blockStatement = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"scheme", "givenUnit", "givenBody", "computeUnit", "computeBlock", "eligibilityUnit", 
			"payUnit", "payBefore", "payAfter", "payMultiplier", "variableDeclarationStatement", 
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
			null, "'given'", "' as input'", "'compute'", "'each '", "'sumOf '", "'eligibleWhen'", 
			"'pay'", "'before'", "'after'", "'in'", "'proportion'", "'default'", 
			"'of'", "'and'", "'or'", null, "'null'", null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "','", "';'", "':'", "'='", "'>'", "'<'", "'!'", 
			"'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GIVEN", "ASINPUT", "COMPUTE", "EACH", "SUMOF", "ELIGIBLEWHEN", 
			"PAY", "BEFORE", "AFTER", "IN", "PROPORTION", "DEFAULT", "OF", "ANDSTR", 
			"ORSTR", "BooleanLiteral", "NullLiteral", "IDENTIFIER", "NUMBER", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", "SEMI", "COLON", 
			"ASSIGN", "GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "MOD", "QUESTIONMARK", "CharacterLiteral", 
			"StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(76);
			givenUnit();
			setState(77);
			computeUnit();
			setState(78);
			eligibilityUnit();
			setState(79);
			payUnit();
			setState(80);
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
			setState(82);
			match(GIVEN);
			setState(83);
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

	public static class GivenBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BenefitParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BenefitParser.RBRACE, 0); }
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
			setState(85);
			match(LBRACE);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(86);
				variableDeclarationStatement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
			setState(94);
			match(COMPUTE);
			setState(95);
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
			setState(97);
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
			setState(99);
			match(ELIGIBLEWHEN);
			setState(100);
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

	public static class PayUnitContext extends ParserRuleContext {
		public TerminalNode PAY() { return getToken(BenefitParser.PAY, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PayMultiplierContext payMultiplier() {
			return getRuleContext(PayMultiplierContext.class,0);
		}
		public ProportionExpressionContext proportionExpression() {
			return getRuleContext(ProportionExpressionContext.class,0);
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
			setState(102);
			match(PAY);
			setState(103);
			variableName();
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE:
				{
				setState(104);
				payBefore();
				}
				break;
			case AFTER:
				{
				setState(105);
				payAfter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			expressionList();
			setState(109);
			payMultiplier();
			setState(110);
			variableName();
			setState(111);
			proportionExpression();
			setState(112);
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
		enterRule(_localctx, 14, RULE_payBefore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		enterRule(_localctx, 16, RULE_payAfter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 18, RULE_payMultiplier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BenefitParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BenefitParser.SEMI, 0); }
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
		enterRule(_localctx, 20, RULE_variableDeclarationStatement);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				variableDeclaratorId();
				setState(122);
				match(ASSIGN);
				setState(123);
				variableInitializer();
				setState(124);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				variableDeclaratorId();
				setState(127);
				match(ASINPUT);
				setState(128);
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
		enterRule(_localctx, 22, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			variableName();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(133);
				match(LBRACK);
				setState(134);
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
		enterRule(_localctx, 24, RULE_variableInitializer);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				arrayInitializer();
				}
				break;
			case EACH:
			case SUMOF:
			case BooleanLiteral:
			case NullLiteral:
			case IDENTIFIER:
			case NUMBER:
			case LPAREN:
			case ADD:
			case SUB:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				expression();
				}
				break;
			case RBRACE:
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
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
		enterRule(_localctx, 26, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LBRACE);
			setState(143);
			variableInitializer();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				variableInitializer();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
		enterRule(_localctx, 28, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			conditionalOrExpression();
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(154);
				match(QUESTIONMARK);
				setState(155);
				expression();
				setState(156);
				match(COLON);
				setState(157);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<ConnectorOrContext> connectorOr() {
			return getRuleContexts(ConnectorOrContext.class);
		}
		public ConnectorOrContext connectorOr(int i) {
			return getRuleContext(ConnectorOrContext.class,i);
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
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			conditionalAndExpression();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					connectorOr();
					setState(163);
					conditionalAndExpression();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<ConnectorAndContext> connectorAnd() {
			return getRuleContexts(ConnectorAndContext.class);
		}
		public ConnectorAndContext connectorAnd(int i) {
			return getRuleContext(ConnectorAndContext.class,i);
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
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			relationalExpression();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					connectorAnd();
					setState(172);
					relationalExpression();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 34, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public IterativeStatementContext iterativeStatement() {
			return getRuleContext(IterativeStatementContext.class,0);
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
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationalExpression);
		try {
			int _alt;
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMOF:
			case BooleanLiteral:
			case NullLiteral:
			case IDENTIFIER:
			case NUMBER:
			case LPAREN:
			case ADD:
			case SUB:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				additiveExpression();
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(182);
						relationalOp();
						setState(183);
						additiveExpression();
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case EACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				iterativeStatement();
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						relationalOp();
						setState(192);
						additiveExpression();
						}
						} 
					}
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(BenefitParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(BenefitParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(BenefitParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(BenefitParser.SUB, i);
		}
		public IterativeAggregationExpressionContext iterativeAggregationExpression() {
			return getRuleContext(IterativeAggregationExpressionContext.class,0);
		}
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
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiteral:
			case NullLiteral:
			case IDENTIFIER:
			case NUMBER:
			case LPAREN:
			case ADD:
			case SUB:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				multiplicativeExpression();
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(202);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(203);
						multiplicativeExpression();
						}
						} 
					}
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case SUMOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				iterativeAggregationExpression();
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(BenefitParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(BenefitParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(BenefitParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(BenefitParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(BenefitParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(BenefitParser.MOD, i);
		}
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
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			unaryExpression();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				unaryExpression();
				}
				}
				setState(219);
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
		enterRule(_localctx, 42, RULE_unaryExpression);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(ADD);
				setState(221);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(SUB);
				setState(223);
				unaryExpression();
				}
				break;
			case BooleanLiteral:
			case NullLiteral:
			case IDENTIFIER:
			case NUMBER:
			case LPAREN:
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
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
		enterRule(_localctx, 44, RULE_primary);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				parExpression();
				}
				break;
			case BooleanLiteral:
			case NullLiteral:
			case NUMBER:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
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
		enterRule(_localctx, 46, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		enterRule(_localctx, 48, RULE_connectorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 50, RULE_connectorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 52, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LPAREN);
			setState(239);
			expression();
			setState(240);
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
		enterRule(_localctx, 54, RULE_nonDefaultProportionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(NUMBER);
			setState(243);
			match(COLON);
			setState(244);
			match(NUMBER);
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				match(COLON);
				setState(246);
				match(NUMBER);
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON );
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
		enterRule(_localctx, 56, RULE_proportionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IN);
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(252);
				match(DEFAULT);
				}
				break;
			case NUMBER:
				{
				setState(253);
				nonDefaultProportionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(256);
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
		enterRule(_localctx, 58, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expression();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				expression();
				}
				}
				setState(265);
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
		enterRule(_localctx, 60, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			conditionalExpression();
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(267);
				match(ASSIGN);
				setState(268);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(BenefitParser.NUMBER, 0); }
		public TerminalNode StringLiteral() { return getToken(BenefitParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BenefitParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(BenefitParser.NullLiteral, 0); }
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
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiteral) | (1L << NullLiteral) | (1L << NUMBER) | (1L << StringLiteral))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_iterativeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(EACH);
			setState(274);
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
		enterRule(_localctx, 66, RULE_iterativeAggregationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(SUMOF);
			setState(277);
			match(EACH);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(278);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(279);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_statement);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				block();
				}
				break;
			case EACH:
			case SUMOF:
			case BooleanLiteral:
			case NullLiteral:
			case IDENTIFIER:
			case NUMBER:
			case LPAREN:
			case ADD:
			case SUB:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				statementExpression();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(284);
					match(SEMI);
					}
				}

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
		enterRule(_localctx, 70, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BenefitParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BenefitParser.RBRACE, 0); }
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
		enterRule(_localctx, 72, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LBRACE);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EACH) | (1L << SUMOF) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << LPAREN) | (1L << LBRACE) | (1L << ADD) | (1L << SUB) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(292);
				blockStatement();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
		enterRule(_localctx, 74, RULE_blockStatement);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0133\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0085\n"+
		"\f\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\5\16\u008f\n\16\3\17\3\17"+
		"\3\17\3\17\7\17\u0095\n\17\f\17\16\17\u0098\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00a2\n\20\3\21\3\21\3\21\3\21\7\21\u00a8\n"+
		"\21\f\21\16\21\u00ab\13\21\3\22\3\22\3\22\3\22\7\22\u00b1\n\22\f\22\16"+
		"\22\u00b4\13\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00bc\n\24\f\24\16"+
		"\24\u00bf\13\24\3\24\3\24\3\24\3\24\7\24\u00c5\n\24\f\24\16\24\u00c8\13"+
		"\24\5\24\u00ca\n\24\3\25\3\25\3\25\7\25\u00cf\n\25\f\25\16\25\u00d2\13"+
		"\25\3\25\5\25\u00d5\n\25\3\26\3\26\3\26\7\26\u00da\n\26\f\26\16\26\u00dd"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u00e4\n\27\3\30\3\30\3\30\5\30\u00e9"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\6\35\u00fa\n\35\r\35\16\35\u00fb\3\36\3\36\3\36\5\36\u0101"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\7\37\u0108\n\37\f\37\16\37\u010b\13\37"+
		"\3 \3 \3 \5 \u0110\n \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u011b\n#\3$\3$"+
		"\3$\5$\u0120\n$\5$\u0122\n$\3%\3%\3&\3&\7&\u0128\n&\f&\16&\u012b\13&\3"+
		"&\3&\3\'\3\'\5\'\u0131\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\4\2 !#&\3\2)*\3\2+-\5\2\22\23"+
		"\25\25\60\60\2\u012a\2N\3\2\2\2\4T\3\2\2\2\6W\3\2\2\2\b`\3\2\2\2\nc\3"+
		"\2\2\2\fe\3\2\2\2\16h\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24x\3\2\2\2\26\u0084"+
		"\3\2\2\2\30\u0086\3\2\2\2\32\u008e\3\2\2\2\34\u0090\3\2\2\2\36\u009b\3"+
		"\2\2\2 \u00a3\3\2\2\2\"\u00ac\3\2\2\2$\u00b5\3\2\2\2&\u00c9\3\2\2\2(\u00d4"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00e3\3\2\2\2.\u00e8\3\2\2\2\60\u00ea\3\2\2\2"+
		"\62\u00ec\3\2\2\2\64\u00ee\3\2\2\2\66\u00f0\3\2\2\28\u00f4\3\2\2\2:\u00fd"+
		"\3\2\2\2<\u0104\3\2\2\2>\u010c\3\2\2\2@\u0111\3\2\2\2B\u0113\3\2\2\2D"+
		"\u0116\3\2\2\2F\u0121\3\2\2\2H\u0123\3\2\2\2J\u0125\3\2\2\2L\u0130\3\2"+
		"\2\2NO\5\4\3\2OP\5\b\5\2PQ\5\f\7\2QR\5\16\b\2RS\7\2\2\3S\3\3\2\2\2TU\7"+
		"\3\2\2UV\5\6\4\2V\5\3\2\2\2W[\7\30\2\2XZ\5\26\f\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\31\2\2_\7\3\2\2\2`a\7\5"+
		"\2\2ab\5\n\6\2b\t\3\2\2\2cd\5J&\2d\13\3\2\2\2ef\7\b\2\2fg\5J&\2g\r\3\2"+
		"\2\2hi\7\t\2\2il\5\60\31\2jm\5\20\t\2km\5\22\n\2lj\3\2\2\2lk\3\2\2\2m"+
		"n\3\2\2\2no\5<\37\2op\5\24\13\2pq\5\60\31\2qr\5:\36\2rs\7\35\2\2s\17\3"+
		"\2\2\2tu\7\n\2\2u\21\3\2\2\2vw\7\13\2\2w\23\3\2\2\2xy\7\17\2\2y\25\3\2"+
		"\2\2z\u0085\5\30\r\2{|\5\30\r\2|}\7\37\2\2}~\5\32\16\2~\177\7\35\2\2\177"+
		"\u0085\3\2\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\4\2\2\u0082\u0083\7"+
		"\35\2\2\u0083\u0085\3\2\2\2\u0084z\3\2\2\2\u0084{\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0085\27\3\2\2\2\u0086\u0089\5\60\31\2\u0087\u0088\7\32\2\2\u0088"+
		"\u008a\7\33\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\31\3\2\2"+
		"\2\u008b\u008f\5\34\17\2\u008c\u008f\5> \2\u008d\u008f\3\2\2\2\u008e\u008b"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\33\3\2\2\2\u0090"+
		"\u0091\7\30\2\2\u0091\u0096\5\32\16\2\u0092\u0093\7\34\2\2\u0093\u0095"+
		"\5\32\16\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\7\31\2\2\u009a\35\3\2\2\2\u009b\u00a1\5 \21\2\u009c\u009d\7.\2\2\u009d"+
		"\u009e\5> \2\u009e\u009f\7\36\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a2\3"+
		"\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\37\3\2\2\2\u00a3"+
		"\u00a9\5\"\22\2\u00a4\u00a5\5\64\33\2\u00a5\u00a6\5\"\22\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b2\5&\24\2"+
		"\u00ad\u00ae\5\62\32\2\u00ae\u00af\5&\24\2\u00af\u00b1\3\2\2\2\u00b0\u00ad"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"#\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6%\3\2\2\2\u00b7"+
		"\u00bd\5(\25\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\5(\25\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00ca\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c6\5B"+
		"\"\2\u00c1\u00c2\5$\23\2\u00c2\u00c3\5(\25\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00ca\'\3\2\2\2\u00cb\u00d0\5*\26\2\u00cc\u00cd\t\3\2\2"+
		"\u00cd\u00cf\5*\26\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\5D#\2\u00d4\u00cb\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5)\3\2\2\2\u00d6"+
		"\u00db\5,\27\2\u00d7\u00d8\t\4\2\2\u00d8\u00da\5,\27\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"+\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7)\2\2\u00df\u00e4\5,\27\2\u00e0"+
		"\u00e1\7*\2\2\u00e1\u00e4\5,\27\2\u00e2\u00e4\5.\30\2\u00e3\u00de\3\2"+
		"\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4-\3\2\2\2\u00e5\u00e9"+
		"\5\66\34\2\u00e6\u00e9\5@!\2\u00e7\u00e9\5\60\31\2\u00e8\u00e5\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00eb\7"+
		"\24\2\2\u00eb\61\3\2\2\2\u00ec\u00ed\7\20\2\2\u00ed\63\3\2\2\2\u00ee\u00ef"+
		"\7\21\2\2\u00ef\65\3\2\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5> \2\u00f2"+
		"\u00f3\7\27\2\2\u00f3\67\3\2\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6\7\36"+
		"\2\2\u00f6\u00f9\7\25\2\2\u00f7\u00f8\7\36\2\2\u00f8\u00fa\7\25\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc9\3\2\2\2\u00fd\u0100\7\f\2\2\u00fe\u0101\7\16\2\2\u00ff\u0101"+
		"\58\35\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\7\r\2\2\u0103;\3\2\2\2\u0104\u0109\5> \2\u0105\u0106\7\34\2\2\u0106"+
		"\u0108\5> \2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2"+
		"\2\u0109\u010a\3\2\2\2\u010a=\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010f"+
		"\5\36\20\2\u010d\u010e\7\37\2\2\u010e\u0110\5> \2\u010f\u010d\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110?\3\2\2\2\u0111\u0112\t\5\2\2\u0112A\3\2\2\2"+
		"\u0113\u0114\7\6\2\2\u0114\u0115\5> \2\u0115C\3\2\2\2\u0116\u0117\7\7"+
		"\2\2\u0117\u011a\7\6\2\2\u0118\u011b\5\26\f\2\u0119\u011b\5> \2\u011a"+
		"\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011bE\3\2\2\2\u011c\u0122\5J&\2\u011d"+
		"\u011f\5H%\2\u011e\u0120\7\35\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0122"+
		"G\3\2\2\2\u0123\u0124\5> \2\u0124I\3\2\2\2\u0125\u0129\7\30\2\2\u0126"+
		"\u0128\5L\'\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7\31\2\2\u012dK\3\2\2\2\u012e\u0131\5F$\2\u012f\u0131\5\26\f\2"+
		"\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131M\3\2\2\2\34[l\u0084\u0089"+
		"\u008e\u0096\u00a1\u00a9\u00b2\u00bd\u00c6\u00c9\u00d0\u00d4\u00db\u00e3"+
		"\u00e8\u00fb\u0100\u0109\u010f\u011a\u011f\u0121\u0129\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}