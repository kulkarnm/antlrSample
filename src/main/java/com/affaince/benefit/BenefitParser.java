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
		RULE_statement = 27, RULE_statementExpression = 28, RULE_block = 29, RULE_blockStatement = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"scheme", "givenUnit", "givenBody", "computeUnit", "computeBlock", "eligibilityUnit", 
			"payUnit", "variableDeclarationStatement", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "relationalOp", "relationalExpression", "additiveExpression", 
			"multiplicativeExpression", "unaryExpression", "primary", "parExpression", 
			"nonDefaultProportionExpression", "proportionExpression", "expressionList", 
			"expression", "literal", "iterativeStatement", "statement", "statementExpression", 
			"block", "blockStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'given'", "'as input'", "'compute'", "'each'", "'sumOf'", "'eligibleWhen'", 
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
			setState(62);
			givenUnit();
			setState(63);
			computeUnit();
			setState(64);
			eligibilityUnit();
			setState(65);
			payUnit();
			setState(66);
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
			setState(68);
			match(GIVEN);
			setState(69);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
			setState(73);
			match(COMPUTE);
			setState(74);
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
			setState(76);
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
			setState(78);
			match(ELIGIBLEWHEN);
			setState(79);
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
			setState(81);
			match(PAY);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
			expressionList();
			setState(85);
			match(OF);
			setState(86);
			match(IDENTIFIER);
			setState(87);
			proportionExpression();
			setState(88);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				variableDeclaratorId();
				setState(92);
				match(ASSIGN);
				setState(93);
				variableInitializer();
				setState(94);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				variableDeclaratorId();
				setState(97);
				match(ASINPUT);
				setState(98);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				variableDeclaratorId();
				setState(101);
				match(ASSIGN);
				setState(102);
				statement();
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
		public List<TerminalNode> LBRACK() { return getTokens(BenefitParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BenefitParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BenefitParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BenefitParser.RBRACK, i);
		}
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
			setState(106);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(107);
				match(LBRACK);
				setState(108);
				match(RBRACK);
				}
				}
				setState(113);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
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
				setState(115);
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
			setState(118);
			match(LBRACE);
			setState(119);
			variableInitializer();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				variableInitializer();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
			setState(129);
			conditionalOrExpression();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTIONMARK) {
				{
				setState(130);
				match(QUESTIONMARK);
				setState(131);
				expression();
				setState(132);
				match(COLON);
				setState(133);
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
			setState(137);
			conditionalAndExpression();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORSTR) {
				{
				{
				setState(138);
				match(ORSTR);
				setState(139);
				conditionalAndExpression();
				}
				}
				setState(144);
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
			setState(145);
			relationalExpression();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDSTR) {
				{
				{
				setState(146);
				match(ANDSTR);
				setState(147);
				relationalExpression();
				}
				}
				setState(152);
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
			setState(153);
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
			setState(173);
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
				setState(155);
				additiveExpression();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) {
					{
					{
					setState(156);
					relationalOp();
					setState(157);
					additiveExpression();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EACH:
			case SUMOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				iterativeStatement();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) {
					{
					{
					setState(165);
					relationalOp();
					setState(166);
					additiveExpression();
					}
					}
					setState(172);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			multiplicativeExpression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				multiplicativeExpression();
				}
				}
				setState(182);
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
			setState(183);
			unaryExpression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				unaryExpression();
				}
				}
				setState(190);
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(ADD);
				setState(192);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(SUB);
				setState(194);
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
				setState(195);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				parExpression();
				}
				break;
			case BooleanLiteral:
			case NullLiteral:
			case NUMBER:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
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
			setState(203);
			match(LPAREN);
			setState(204);
			expression();
			setState(205);
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
			setState(207);
			match(NUMBER);
			setState(208);
			match(COLON);
			setState(209);
			match(NUMBER);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(COLON);
				setState(211);
				match(NUMBER);
				}
				}
				setState(214); 
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
			setState(216);
			match(IN);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(217);
				match(DEFAULT);
				}
				break;
			case NUMBER:
				{
				setState(218);
				nonDefaultProportionExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
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
			setState(223);
			expression();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(224);
				match(COMMA);
				setState(225);
				expression();
				}
				}
				setState(230);
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
			setState(231);
			conditionalExpression();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(232);
				match(ASSIGN);
				setState(233);
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
			setState(236);
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
		public TerminalNode SUMOF() { return getToken(BenefitParser.SUMOF, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUMOF) {
				{
				setState(238);
				match(SUMOF);
				}
			}

			setState(241);
			match(EACH);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(242);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(243);
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
		public IterativeStatementContext iterativeStatement() {
			return getRuleContext(IterativeStatementContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				statementExpression();
				setState(248);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				iterativeStatement();
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
		enterRule(_localctx, 56, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LBRACE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EACH) | (1L << SUMOF) | (1L << BooleanLiteral) | (1L << NullLiteral) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << LPAREN) | (1L << LBRACE) | (1L << ADD) | (1L << SUB) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(256);
				blockStatement();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
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
		enterRule(_localctx, 60, RULE_blockStatement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u010f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\7\np\n\n\f\n\16\ns\13\n"+
		"\3\13\3\13\5\13w\n\13\3\f\3\f\3\f\3\f\7\f}\n\f\f\f\16\f\u0080\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\7\16\u008f\n"+
		"\16\f\16\16\16\u0092\13\16\3\17\3\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5"+
		"\13\21\3\21\3\21\3\21\3\21\7\21\u00ab\n\21\f\21\16\21\u00ae\13\21\5\21"+
		"\u00b0\n\21\3\22\3\22\3\22\7\22\u00b5\n\22\f\22\16\22\u00b8\13\22\3\23"+
		"\3\23\3\23\7\23\u00bd\n\23\f\23\16\23\u00c0\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00c7\n\24\3\25\3\25\3\25\5\25\u00cc\n\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\6\27\u00d7\n\27\r\27\16\27\u00d8\3\30\3\30"+
		"\3\30\5\30\u00de\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u00e5\n\31\f\31\16"+
		"\31\u00e8\13\31\3\32\3\32\3\32\5\32\u00ed\n\32\3\33\3\33\3\34\5\34\u00f2"+
		"\n\34\3\34\3\34\3\34\5\34\u00f7\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u00fe"+
		"\n\35\3\36\3\36\3\37\3\37\7\37\u0104\n\37\f\37\16\37\u0107\13\37\3\37"+
		"\3\37\3 \3 \5 \u010d\n \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>\2\7\3\2\n\13\4\2 !#&\3\2)*\3\2+-\5\2\22\23\25"+
		"\25\60\60\2\u010b\2@\3\2\2\2\4F\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\nN\3\2\2"+
		"\2\fP\3\2\2\2\16S\3\2\2\2\20j\3\2\2\2\22l\3\2\2\2\24v\3\2\2\2\26x\3\2"+
		"\2\2\30\u0083\3\2\2\2\32\u008b\3\2\2\2\34\u0093\3\2\2\2\36\u009b\3\2\2"+
		"\2 \u00af\3\2\2\2\"\u00b1\3\2\2\2$\u00b9\3\2\2\2&\u00c6\3\2\2\2(\u00cb"+
		"\3\2\2\2*\u00cd\3\2\2\2,\u00d1\3\2\2\2.\u00da\3\2\2\2\60\u00e1\3\2\2\2"+
		"\62\u00e9\3\2\2\2\64\u00ee\3\2\2\2\66\u00f1\3\2\2\28\u00fd\3\2\2\2:\u00ff"+
		"\3\2\2\2<\u0101\3\2\2\2>\u010c\3\2\2\2@A\5\4\3\2AB\5\b\5\2BC\5\f\7\2C"+
		"D\5\16\b\2DE\7\2\2\3E\3\3\2\2\2FG\7\3\2\2GH\5\6\4\2H\5\3\2\2\2IJ\5<\37"+
		"\2J\7\3\2\2\2KL\7\5\2\2LM\5\n\6\2M\t\3\2\2\2NO\5<\37\2O\13\3\2\2\2PQ\7"+
		"\b\2\2QR\5<\37\2R\r\3\2\2\2ST\7\t\2\2TU\7\24\2\2UV\t\2\2\2VW\5\60\31\2"+
		"WX\7\17\2\2XY\7\24\2\2YZ\5.\30\2Z[\7\35\2\2[\17\3\2\2\2\\k\5\22\n\2]^"+
		"\5\22\n\2^_\7\37\2\2_`\5\24\13\2`a\7\35\2\2ak\3\2\2\2bc\5\22\n\2cd\7\4"+
		"\2\2de\7\35\2\2ek\3\2\2\2fg\5\22\n\2gh\7\37\2\2hi\58\35\2ik\3\2\2\2j\\"+
		"\3\2\2\2j]\3\2\2\2jb\3\2\2\2jf\3\2\2\2k\21\3\2\2\2lq\7\24\2\2mn\7\32\2"+
		"\2np\7\33\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\23\3\2\2\2sq\3"+
		"\2\2\2tw\5\26\f\2uw\5\62\32\2vt\3\2\2\2vu\3\2\2\2w\25\3\2\2\2xy\7\30\2"+
		"\2y~\5\24\13\2z{\7\34\2\2{}\5\24\13\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\31\2\2"+
		"\u0082\27\3\2\2\2\u0083\u0089\5\32\16\2\u0084\u0085\7.\2\2\u0085\u0086"+
		"\5\62\32\2\u0086\u0087\7\36\2\2\u0087\u0088\5\30\r\2\u0088\u008a\3\2\2"+
		"\2\u0089\u0084\3\2\2\2\u0089\u008a\3\2\2\2\u008a\31\3\2\2\2\u008b\u0090"+
		"\5\34\17\2\u008c\u008d\7\21\2\2\u008d\u008f\5\34\17\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\33\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0098\5 \21\2\u0094\u0095\7\20\2"+
		"\2\u0095\u0097\5 \21\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\35\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\t\3\2\2\u009c\37\3\2\2\2\u009d\u00a3\5\"\22\2\u009e\u009f\5\36"+
		"\20\2\u009f\u00a0\5\"\22\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b0\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ac\5\66\34\2\u00a7\u00a8\5\36\20\2\u00a8"+
		"\u00a9\5\"\22\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u009d\3\2\2\2\u00af\u00a6\3\2\2\2\u00b0!\3\2\2\2"+
		"\u00b1\u00b6\5$\23\2\u00b2\u00b3\t\4\2\2\u00b3\u00b5\5$\23\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"#\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00be\5&\24\2\u00ba\u00bb\t\5\2\2"+
		"\u00bb\u00bd\5&\24\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf%\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7)\2\2\u00c2\u00c7\5&\24\2\u00c3\u00c4\7*\2\2\u00c4\u00c7\5&\24"+
		"\2\u00c5\u00c7\5(\25\2\u00c6\u00c1\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00cc\5*\26\2\u00c9\u00cc\5\64\33\2\u00ca"+
		"\u00cc\7\24\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3"+
		"\2\2\2\u00cc)\3\2\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\5\62\32\2\u00cf"+
		"\u00d0\7\27\2\2\u00d0+\3\2\2\2\u00d1\u00d2\7\25\2\2\u00d2\u00d3\7\36\2"+
		"\2\u00d3\u00d6\7\25\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d7\7\25\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9-\3\2\2\2\u00da\u00dd\7\f\2\2\u00db\u00de\7\16\2\2\u00dc\u00de"+
		"\5,\27\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\7\r\2\2\u00e0/\3\2\2\2\u00e1\u00e6\5\62\32\2\u00e2\u00e3\7\34\2"+
		"\2\u00e3\u00e5\5\62\32\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\61\3\2\2\2\u00e8\u00e6\3\2\2"+
		"\2\u00e9\u00ec\5\30\r\2\u00ea\u00eb\7\37\2\2\u00eb\u00ed\5\62\32\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ef\t\6\2"+
		"\2\u00ef\65\3\2\2\2\u00f0\u00f2\7\7\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\7\6\2\2\u00f4\u00f7\5\20\t\2"+
		"\u00f5\u00f7\58\35\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\67"+
		"\3\2\2\2\u00f8\u00fe\5<\37\2\u00f9\u00fa\5:\36\2\u00fa\u00fb\7\35\2\2"+
		"\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\66\34\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe9\3\2\2\2\u00ff\u0100\5\62\32\2\u0100"+
		";\3\2\2\2\u0101\u0105\7\30\2\2\u0102\u0104\5> \2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\31\2\2\u0109=\3\2\2\2\u010a\u010d"+
		"\58\35\2\u010b\u010d\5\20\t\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d?\3\2\2\2\31jqv~\u0089\u0090\u0098\u00a3\u00ac\u00af\u00b6\u00be"+
		"\u00c6\u00cb\u00d8\u00dd\u00e6\u00ec\u00f1\u00f6\u00fd\u0105\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}