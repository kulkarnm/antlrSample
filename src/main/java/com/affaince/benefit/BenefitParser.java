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
		RULE_computeBlock = 4, RULE_eligibilityUnit = 5, RULE_payUnit = 6, RULE_variableDeclarationStatement = 7, 
		RULE_variableDeclaratorId = 8, RULE_variableInitializer = 9, RULE_arrayInitializer = 10, 
		RULE_conditionalExpression = 11, RULE_conditionalOrExpression = 12, RULE_conditionalAndExpression = 13, 
		RULE_relationalOp = 14, RULE_relationalExpression = 15, RULE_additiveExpression = 16, 
		RULE_multiplicativeExpression = 17, RULE_unaryExpression = 18, RULE_primary = 19, 
		RULE_parExpression = 20, RULE_nonDefaultProportionExpression = 21, RULE_proportionExpression = 22, 
		RULE_expressionList = 23, RULE_expression = 24, RULE_literal = 25, RULE_iterativeStatement = 26, 
		RULE_iterativeAggregationStatement = 27, RULE_statement = 28, RULE_statementExpression = 29, 
		RULE_block = 30, RULE_blockStatement = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"scheme", "givenUnit", "givenBody", "computeUnit", "computeBlock", "eligibilityUnit", 
			"payUnit", "variableDeclarationStatement", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "relationalOp", "relationalExpression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "primary", "parExpression", 
			"nonDefaultProportionExpression", "proportionExpression", "expressionList", 
			"expression", "literal", "iterativeStatement", "iterativeAggregationStatement", 
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
			setState(64);
			givenUnit();
			setState(65);
			computeUnit();
			setState(66);
			eligibilityUnit();
			setState(67);
			payUnit();
			setState(68);
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
			setState(70);
			match(GIVEN);
			setState(71);
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
			setState(73);
			match(LBRACE);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(74);
				variableDeclarationStatement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(82);
			match(COMPUTE);
			setState(83);
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
			setState(85);
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
			setState(87);
			match(ELIGIBLEWHEN);
			setState(88);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(BenefitParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BenefitParser.IDENTIFIER, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode OF() { return getToken(BenefitParser.OF, 0); }
		public ProportionExpressionContext proportionExpression() {
			return getRuleContext(ProportionExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BenefitParser.SEMI, 0); }
		public TerminalNode BEFORE() { return getToken(BenefitParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(BenefitParser.AFTER, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(PAY);
			setState(91);
			match(IDENTIFIER);
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(93);
			expressionList();
			setState(94);
			match(OF);
			setState(95);
			match(IDENTIFIER);
			setState(96);
			proportionExpression();
			setState(97);
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
		enterRule(_localctx, 14, RULE_variableDeclarationStatement);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				variableDeclaratorId();
				setState(101);
				match(ASSIGN);
				setState(102);
				variableInitializer();
				setState(103);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				variableDeclaratorId();
				setState(106);
				match(ASINPUT);
				setState(107);
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
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 16, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENTIFIER);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(112);
				match(LBRACK);
				setState(113);
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
		enterRule(_localctx, 18, RULE_variableInitializer);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
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
				setState(117);
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
		enterRule(_localctx, 20, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LBRACE);
			setState(121);
			variableInitializer();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				variableInitializer();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
		enterRule(_localctx, 22, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			conditionalOrExpression();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTIONMARK) {
				{
				setState(132);
				match(QUESTIONMARK);
				setState(133);
				expression();
				setState(134);
				match(COLON);
				setState(135);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> ORSTR() { return getTokens(BenefitParser.ORSTR); }
		public TerminalNode ORSTR(int i) {
			return getToken(BenefitParser.ORSTR, i);
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
		enterRule(_localctx, 24, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			conditionalAndExpression();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORSTR) {
				{
				{
				setState(140);
				match(ORSTR);
				setState(141);
				conditionalAndExpression();
				}
				}
				setState(146);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> ANDSTR() { return getTokens(BenefitParser.ANDSTR); }
		public TerminalNode ANDSTR(int i) {
			return getToken(BenefitParser.ANDSTR, i);
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
		enterRule(_localctx, 26, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			relationalExpression();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDSTR) {
				{
				{
				setState(148);
				match(ANDSTR);
				setState(149);
				relationalExpression();
				}
				}
				setState(154);
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
		enterRule(_localctx, 28, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 30, RULE_relationalExpression);
		int _la;
		try {
			setState(175);
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
				setState(157);
				additiveExpression();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) {
					{
					{
					setState(158);
					relationalOp();
					setState(159);
					additiveExpression();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				iterativeStatement();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) {
					{
					{
					setState(167);
					relationalOp();
					setState(168);
					additiveExpression();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public IterativeAggregationStatementContext iterativeAggregationStatement() {
			return getRuleContext(IterativeAggregationStatementContext.class,0);
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
		enterRule(_localctx, 32, RULE_additiveExpression);
		int _la;
		try {
			setState(186);
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
				setState(177);
				multiplicativeExpression();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD || _la==SUB) {
					{
					{
					setState(178);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(179);
					multiplicativeExpression();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SUMOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				iterativeAggregationStatement();
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
		enterRule(_localctx, 34, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			unaryExpression();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(189);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				unaryExpression();
				}
				}
				setState(195);
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
		enterRule(_localctx, 36, RULE_unaryExpression);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(ADD);
				setState(197);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(SUB);
				setState(199);
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
				setState(200);
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
		public TerminalNode IDENTIFIER() { return getToken(BenefitParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				parExpression();
				}
				break;
			case BooleanLiteral:
			case NullLiteral:
			case NUMBER:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(IDENTIFIER);
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
		enterRule(_localctx, 40, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LPAREN);
			setState(209);
			expression();
			setState(210);
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
		enterRule(_localctx, 42, RULE_nonDefaultProportionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(NUMBER);
			setState(213);
			match(COLON);
			setState(214);
			match(NUMBER);
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				match(COLON);
				setState(216);
				match(NUMBER);
				}
				}
				setState(219); 
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
		enterRule(_localctx, 44, RULE_proportionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IN);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(222);
				match(DEFAULT);
				}
				break;
			case NUMBER:
				{
				setState(223);
				nonDefaultProportionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226);
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
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				expression();
				}
				}
				setState(235);
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
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			conditionalExpression();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(237);
				match(ASSIGN);
				setState(238);
				expression();
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
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 52, RULE_iterativeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(EACH);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(244);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(245);
				statement();
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

	public static class IterativeAggregationStatementContext extends ParserRuleContext {
		public TerminalNode SUMOF() { return getToken(BenefitParser.SUMOF, 0); }
		public TerminalNode EACH() { return getToken(BenefitParser.EACH, 0); }
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterativeAggregationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeAggregationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).enterIterativeAggregationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BenefitListener ) ((BenefitListener)listener).exitIterativeAggregationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BenefitVisitor ) return ((BenefitVisitor<? extends T>)visitor).visitIterativeAggregationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeAggregationStatementContext iterativeAggregationStatement() throws RecognitionException {
		IterativeAggregationStatementContext _localctx = new IterativeAggregationStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_iterativeAggregationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(SUMOF);
			setState(249);
			match(EACH);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(250);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(251);
				statement();
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
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
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
				setState(255);
				statementExpression();
				setState(256);
				match(SEMI);
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
		enterRule(_localctx, 58, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LBRACE);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EACH) | (1L << SUMOF) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << LPAREN) | (1L << LBRACE) | (1L << ADD) | (1L << SUB) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(263);
				blockStatement();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
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
		enterRule(_localctx, 62, RULE_blockStatement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0116\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4N\n\4\f\4\16\4Q\13"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n"+
		"\5\nu\n\n\3\13\3\13\5\13y\n\13\3\f\3\f\3\f\3\f\7\f\177\n\f\f\f\16\f\u0082"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\7\16"+
		"\u0091\n\16\f\16\16\16\u0094\13\16\3\17\3\17\3\17\7\17\u0099\n\17\f\17"+
		"\16\17\u009c\13\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a4\n\21\f\21"+
		"\16\21\u00a7\13\21\3\21\3\21\3\21\3\21\7\21\u00ad\n\21\f\21\16\21\u00b0"+
		"\13\21\5\21\u00b2\n\21\3\22\3\22\3\22\7\22\u00b7\n\22\f\22\16\22\u00ba"+
		"\13\22\3\22\5\22\u00bd\n\22\3\23\3\23\3\23\7\23\u00c2\n\23\f\23\16\23"+
		"\u00c5\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u00cc\n\24\3\25\3\25\3\25\5"+
		"\25\u00d1\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\6\27\u00dc"+
		"\n\27\r\27\16\27\u00dd\3\30\3\30\3\30\5\30\u00e3\n\30\3\30\3\30\3\31\3"+
		"\31\3\31\7\31\u00ea\n\31\f\31\16\31\u00ed\13\31\3\32\3\32\3\32\5\32\u00f2"+
		"\n\32\3\33\3\33\3\34\3\34\3\34\5\34\u00f9\n\34\3\35\3\35\3\35\3\35\5\35"+
		"\u00ff\n\35\3\36\3\36\3\36\3\36\5\36\u0105\n\36\3\37\3\37\3 \3 \7 \u010b"+
		"\n \f \16 \u010e\13 \3 \3 \3!\3!\5!\u0114\n!\3!\2\2\"\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\3\2\n\13\4\2 !#&\3"+
		"\2)*\3\2+-\5\2\22\23\25\25\60\60\2\u0111\2B\3\2\2\2\4H\3\2\2\2\6K\3\2"+
		"\2\2\bT\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16\\\3\2\2\2\20o\3\2\2\2\22q\3\2"+
		"\2\2\24x\3\2\2\2\26z\3\2\2\2\30\u0085\3\2\2\2\32\u008d\3\2\2\2\34\u0095"+
		"\3\2\2\2\36\u009d\3\2\2\2 \u00b1\3\2\2\2\"\u00bc\3\2\2\2$\u00be\3\2\2"+
		"\2&\u00cb\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00d6\3\2\2\2.\u00df"+
		"\3\2\2\2\60\u00e6\3\2\2\2\62\u00ee\3\2\2\2\64\u00f3\3\2\2\2\66\u00f5\3"+
		"\2\2\28\u00fa\3\2\2\2:\u0104\3\2\2\2<\u0106\3\2\2\2>\u0108\3\2\2\2@\u0113"+
		"\3\2\2\2BC\5\4\3\2CD\5\b\5\2DE\5\f\7\2EF\5\16\b\2FG\7\2\2\3G\3\3\2\2\2"+
		"HI\7\3\2\2IJ\5\6\4\2J\5\3\2\2\2KO\7\30\2\2LN\5\20\t\2ML\3\2\2\2NQ\3\2"+
		"\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\31\2\2S\7\3\2\2\2TU\7"+
		"\5\2\2UV\5\n\6\2V\t\3\2\2\2WX\5> \2X\13\3\2\2\2YZ\7\b\2\2Z[\5> \2[\r\3"+
		"\2\2\2\\]\7\t\2\2]^\7\24\2\2^_\t\2\2\2_`\5\60\31\2`a\7\17\2\2ab\7\24\2"+
		"\2bc\5.\30\2cd\7\35\2\2d\17\3\2\2\2ep\5\22\n\2fg\5\22\n\2gh\7\37\2\2h"+
		"i\5\24\13\2ij\7\35\2\2jp\3\2\2\2kl\5\22\n\2lm\7\4\2\2mn\7\35\2\2np\3\2"+
		"\2\2oe\3\2\2\2of\3\2\2\2ok\3\2\2\2p\21\3\2\2\2qt\7\24\2\2rs\7\32\2\2s"+
		"u\7\33\2\2tr\3\2\2\2tu\3\2\2\2u\23\3\2\2\2vy\5\26\f\2wy\5\62\32\2xv\3"+
		"\2\2\2xw\3\2\2\2y\25\3\2\2\2z{\7\30\2\2{\u0080\5\24\13\2|}\7\34\2\2}\177"+
		"\5\24\13\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\31\2\2\u0084"+
		"\27\3\2\2\2\u0085\u008b\5\32\16\2\u0086\u0087\7.\2\2\u0087\u0088\5\62"+
		"\32\2\u0088\u0089\7\36\2\2\u0089\u008a\5\30\r\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008b\u008c\3\2\2\2\u008c\31\3\2\2\2\u008d\u0092\5\34\17"+
		"\2\u008e\u008f\7\21\2\2\u008f\u0091\5\34\17\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\33\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u009a\5 \21\2\u0096\u0097\7\20\2\2\u0097"+
		"\u0099\5 \21\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\35\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e"+
		"\t\3\2\2\u009e\37\3\2\2\2\u009f\u00a5\5\"\22\2\u00a0\u00a1\5\36\20\2\u00a1"+
		"\u00a2\5\"\22\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b2\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00ae\5\66\34\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab"+
		"\5\"\22\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b2!\3\2\2\2\u00b3"+
		"\u00b8\5$\23\2\u00b4\u00b5\t\4\2\2\u00b5\u00b7\5$\23\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bd\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\58\35\2\u00bc\u00b3\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd#\3\2\2\2\u00be\u00c3\5&\24\2\u00bf\u00c0"+
		"\t\5\2\2\u00c0\u00c2\5&\24\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00c7\7)\2\2\u00c7\u00cc\5&\24\2\u00c8\u00c9\7*\2\2\u00c9\u00cc"+
		"\5&\24\2\u00ca\u00cc\5(\25\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\'\3\2\2\2\u00cd\u00d1\5*\26\2\u00ce\u00d1\5\64\33"+
		"\2\u00cf\u00d1\7\24\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\5\62\32"+
		"\2\u00d4\u00d5\7\27\2\2\u00d5+\3\2\2\2\u00d6\u00d7\7\25\2\2\u00d7\u00d8"+
		"\7\36\2\2\u00d8\u00db\7\25\2\2\u00d9\u00da\7\36\2\2\u00da\u00dc\7\25\2"+
		"\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de-\3\2\2\2\u00df\u00e2\7\f\2\2\u00e0\u00e3\7\16\2\2\u00e1"+
		"\u00e3\5,\27\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\7\r\2\2\u00e5/\3\2\2\2\u00e6\u00eb\5\62\32\2\u00e7\u00e8"+
		"\7\34\2\2\u00e8\u00ea\5\62\32\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2"+
		"\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\61\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f1\5\30\r\2\u00ef\u00f0\7\37\2\2\u00f0\u00f2\5\62\32"+
		"\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\63\3\2\2\2\u00f3\u00f4"+
		"\t\6\2\2\u00f4\65\3\2\2\2\u00f5\u00f8\7\6\2\2\u00f6\u00f9\5\20\t\2\u00f7"+
		"\u00f9\5:\36\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\67\3\2\2"+
		"\2\u00fa\u00fb\7\7\2\2\u00fb\u00fe\7\6\2\2\u00fc\u00ff\5\20\t\2\u00fd"+
		"\u00ff\5:\36\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff9\3\2\2\2"+
		"\u0100\u0105\5> \2\u0101\u0102\5<\37\2\u0102\u0103\7\35\2\2\u0103\u0105"+
		"\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0105;\3\2\2\2\u0106"+
		"\u0107\5\62\32\2\u0107=\3\2\2\2\u0108\u010c\7\30\2\2\u0109\u010b\5@!\2"+
		"\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\31\2\2"+
		"\u0110?\3\2\2\2\u0111\u0114\5:\36\2\u0112\u0114\5\20\t\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0112\3\2\2\2\u0114A\3\2\2\2\33Ootx\u0080\u008b\u0092\u009a"+
		"\u00a5\u00ae\u00b1\u00b8\u00bc\u00c3\u00cb\u00d0\u00dd\u00e2\u00eb\u00f1"+
		"\u00f8\u00fe\u0104\u010c\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}