// Generated from Benefit.g4 by ANTLR 4.9.2

package com.affaince.benefit;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BenefitLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GIVEN", "ASINPUT", "COMPUTE", "EACH", "SUMOF", "ELIGIBLEWHEN", "PAY", 
			"BEFORE", "AFTER", "IN", "PROPORTION", "DEFAULT", "OF", "ANDSTR", "ORSTR", 
			"BooleanLiteral", "NullLiteral", "IDENTIFIER", "NUMBER", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "COMMA", "SEMI", "COLON", "ASSIGN", 
			"GT", "LT", "BANG", "EQUAL", "LE", "GE", "NOTEQUAL", "INC", "DEC", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "QUESTIONMARK", "Sign", "CharacterLiteral", 
			"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
			"EscapeSequence", "WS", "COMMENT", "LINE_COMMENT"
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


	public BenefitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Benefit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u018f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00dc\n\21\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u00e4\n\23\r\23\16"+
		"\23\u00e5\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec\13\23\3\23\3\23\6\23\u00f0"+
		"\n\23\r\23\16\23\u00f1\3\23\7\23\u00f5\n\23\f\23\16\23\u00f8\13\23\7\23"+
		"\u00fa\n\23\f\23\16\23\u00fd\13\23\3\24\5\24\u0100\n\24\3\24\3\24\6\24"+
		"\u0104\n\24\r\24\16\24\u0105\3\24\6\24\u0109\n\24\r\24\16\24\u010a\3\24"+
		"\3\24\7\24\u010f\n\24\f\24\16\24\u0112\13\24\5\24\u0114\n\24\5\24\u0116"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u015a\n/\3\60\3\60\3"+
		"\61\3\61\5\61\u0160\n\61\3\61\3\61\3\62\6\62\u0165\n\62\r\62\16\62\u0166"+
		"\3\63\3\63\5\63\u016b\n\63\3\64\3\64\3\64\3\65\6\65\u0171\n\65\r\65\16"+
		"\65\u0172\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u017b\n\66\f\66\16\66\u017e"+
		"\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0189\n\67\f"+
		"\67\16\67\u018c\13\67\3\67\3\67\3\u017c\28\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[\2]/_\2a\60c\2e\2g\2i\61k\62m\63\3\2\n\4\2C\\c|\3\2\62;\4\2--/"+
		"/\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\2\u019c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5u\3\2\2\2\7\177\3\2\2\2\t\u0087"+
		"\3\2\2\2\13\u008d\3\2\2\2\r\u0094\3\2\2\2\17\u00a1\3\2\2\2\21\u00a5\3"+
		"\2\2\2\23\u00ac\3\2\2\2\25\u00b2\3\2\2\2\27\u00b5\3\2\2\2\31\u00c0\3\2"+
		"\2\2\33\u00c8\3\2\2\2\35\u00cb\3\2\2\2\37\u00cf\3\2\2\2!\u00db\3\2\2\2"+
		"#\u00dd\3\2\2\2%\u00e3\3\2\2\2\'\u00ff\3\2\2\2)\u0117\3\2\2\2+\u0119\3"+
		"\2\2\2-\u011b\3\2\2\2/\u011d\3\2\2\2\61\u011f\3\2\2\2\63\u0121\3\2\2\2"+
		"\65\u0123\3\2\2\2\67\u0125\3\2\2\29\u0127\3\2\2\2;\u0129\3\2\2\2=\u012b"+
		"\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C\u0131\3\2\2\2E\u0134\3\2\2\2G"+
		"\u0137\3\2\2\2I\u013a\3\2\2\2K\u013d\3\2\2\2M\u0140\3\2\2\2O\u0143\3\2"+
		"\2\2Q\u0145\3\2\2\2S\u0147\3\2\2\2U\u0149\3\2\2\2W\u014b\3\2\2\2Y\u014d"+
		"\3\2\2\2[\u014f\3\2\2\2]\u0159\3\2\2\2_\u015b\3\2\2\2a\u015d\3\2\2\2c"+
		"\u0164\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2\2\2i\u0170\3\2\2\2k\u0176\3\2"+
		"\2\2m\u0184\3\2\2\2op\7i\2\2pq\7k\2\2qr\7x\2\2rs\7g\2\2st\7p\2\2t\4\3"+
		"\2\2\2uv\7\"\2\2vw\7c\2\2wx\7u\2\2xy\7\"\2\2yz\7k\2\2z{\7p\2\2{|\7r\2"+
		"\2|}\7w\2\2}~\7v\2\2~\6\3\2\2\2\177\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7o\2\2\u0082\u0083\7r\2\2\u0083\u0084\7w\2\2\u0084\u0085\7v\2\2"+
		"\u0085\u0086\7g\2\2\u0086\b\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c"+
		"\2\2\u0089\u008a\7e\2\2\u008a\u008b\7j\2\2\u008b\u008c\7\"\2\2\u008c\n"+
		"\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7w\2\2\u008f\u0090\7o\2\2\u0090"+
		"\u0091\7Q\2\2\u0091\u0092\7h\2\2\u0092\u0093\7\"\2\2\u0093\f\3\2\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098\7i\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7d\2\2\u009a\u009b\7n\2\2\u009b\u009c"+
		"\7g\2\2\u009c\u009d\7Y\2\2\u009d\u009e\7j\2\2\u009e\u009f\7g\2\2\u009f"+
		"\u00a0\7p\2\2\u00a0\16\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7{\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\22\3\2\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7"+
		"v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7t\2\2\u00b1\24\3\2\2\2\u00b2\u00b3"+
		"\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7"+
		"\7t\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7q\2\2"+
		"\u00be\u00bf\7p\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7"+
		"g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6\u00c7\7v\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7f\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1 "+
		"\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5"+
		"\u00dc\7g\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2"+
		"\u00d9\u00da\7u\2\2\u00da\u00dc\7g\2\2\u00db\u00d2\3\2\2\2\u00db\u00d6"+
		"\3\2\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7w\2\2\u00df\u00e0"+
		"\7n\2\2\u00e0\u00e1\7n\2\2\u00e1$\3\2\2\2\u00e2\u00e4\t\2\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00ea\3\2\2\2\u00e7\u00e9\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00fb\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\7a\2\2\u00ee\u00f0\t\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f6\3\2\2\2\u00f3\u00f5\t\3\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00ed\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc&\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100"+
		"\5[.\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0115\3\2\2\2\u0101"+
		"\u0103\7\60\2\2\u0102\u0104\t\3\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0116\3\2\2\2\u0107"+
		"\u0109\t\3\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u0113\3\2\2\2\u010c\u0110\7\60\2\2\u010d"+
		"\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0101\3\2"+
		"\2\2\u0115\u0108\3\2\2\2\u0116(\3\2\2\2\u0117\u0118\7*\2\2\u0118*\3\2"+
		"\2\2\u0119\u011a\7+\2\2\u011a,\3\2\2\2\u011b\u011c\7}\2\2\u011c.\3\2\2"+
		"\2\u011d\u011e\7\177\2\2\u011e\60\3\2\2\2\u011f\u0120\7]\2\2\u0120\62"+
		"\3\2\2\2\u0121\u0122\7_\2\2\u0122\64\3\2\2\2\u0123\u0124\7.\2\2\u0124"+
		"\66\3\2\2\2\u0125\u0126\7=\2\2\u01268\3\2\2\2\u0127\u0128\7<\2\2\u0128"+
		":\3\2\2\2\u0129\u012a\7?\2\2\u012a<\3\2\2\2\u012b\u012c\7@\2\2\u012c>"+
		"\3\2\2\2\u012d\u012e\7>\2\2\u012e@\3\2\2\2\u012f\u0130\7#\2\2\u0130B\3"+
		"\2\2\2\u0131\u0132\7?\2\2\u0132\u0133\7?\2\2\u0133D\3\2\2\2\u0134\u0135"+
		"\7>\2\2\u0135\u0136\7?\2\2\u0136F\3\2\2\2\u0137\u0138\7@\2\2\u0138\u0139"+
		"\7?\2\2\u0139H\3\2\2\2\u013a\u013b\7#\2\2\u013b\u013c\7?\2\2\u013cJ\3"+
		"\2\2\2\u013d\u013e\7-\2\2\u013e\u013f\7-\2\2\u013fL\3\2\2\2\u0140\u0141"+
		"\7/\2\2\u0141\u0142\7/\2\2\u0142N\3\2\2\2\u0143\u0144\7-\2\2\u0144P\3"+
		"\2\2\2\u0145\u0146\7/\2\2\u0146R\3\2\2\2\u0147\u0148\7,\2\2\u0148T\3\2"+
		"\2\2\u0149\u014a\7\61\2\2\u014aV\3\2\2\2\u014b\u014c\7\'\2\2\u014cX\3"+
		"\2\2\2\u014d\u014e\7A\2\2\u014eZ\3\2\2\2\u014f\u0150\t\4\2\2\u0150\\\3"+
		"\2\2\2\u0151\u0152\7)\2\2\u0152\u0153\5_\60\2\u0153\u0154\7)\2\2\u0154"+
		"\u015a\3\2\2\2\u0155\u0156\7)\2\2\u0156\u0157\5g\64\2\u0157\u0158\7)\2"+
		"\2\u0158\u015a\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0155\3\2\2\2\u015a^"+
		"\3\2\2\2\u015b\u015c\n\5\2\2\u015c`\3\2\2\2\u015d\u015f\7$\2\2\u015e\u0160"+
		"\5c\62\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\7$\2\2\u0162b\3\2\2\2\u0163\u0165\5e\63\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167d\3\2\2\2"+
		"\u0168\u016b\n\6\2\2\u0169\u016b\5g\64\2\u016a\u0168\3\2\2\2\u016a\u0169"+
		"\3\2\2\2\u016bf\3\2\2\2\u016c\u016d\7^\2\2\u016d\u016e\t\7\2\2\u016eh"+
		"\3\2\2\2\u016f\u0171\t\b\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b\65"+
		"\2\2\u0175j\3\2\2\2\u0176\u0177\7\61\2\2\u0177\u0178\7,\2\2\u0178\u017c"+
		"\3\2\2\2\u0179\u017b\13\2\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017f\u0180\7,\2\2\u0180\u0181\7\61\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\b\66\2\2\u0183l\3\2\2\2\u0184\u0185\7\61\2\2\u0185\u0186\7\61\2"+
		"\2\u0186\u018a\3\2\2\2\u0187\u0189\n\t\2\2\u0188\u0187\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\b\67\2\2\u018en\3\2\2\2\26\2\u00db\u00e5\u00ea"+
		"\u00f1\u00f6\u00fb\u00ff\u0105\u010a\u0110\u0113\u0115\u0159\u015f\u0166"+
		"\u016a\u0172\u017c\u018a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}