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
			"EscapeSequence", "SchemeLetter", "SchemeLetterOrDigit", "WS", "COMMENT", 
			"LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0182\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00e0\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23"+
		"\u00e9\n\23\f\23\16\23\u00ec\13\23\3\24\5\24\u00ef\n\24\3\24\3\24\6\24"+
		"\u00f3\n\24\r\24\16\24\u00f4\3\24\6\24\u00f8\n\24\r\24\16\24\u00f9\3\24"+
		"\3\24\7\24\u00fe\n\24\f\24\16\24\u0101\13\24\5\24\u0103\n\24\5\24\u0105"+
		"\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0149\n/\3\60\3\60\3"+
		"\61\3\61\5\61\u014f\n\61\3\61\3\61\3\62\6\62\u0154\n\62\r\62\16\62\u0155"+
		"\3\63\3\63\5\63\u015a\n\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\6\67"+
		"\u0164\n\67\r\67\16\67\u0165\3\67\3\67\38\38\38\38\78\u016e\n8\f8\168"+
		"\u0171\138\38\38\38\38\38\39\39\39\39\79\u017c\n9\f9\169\u017f\139\39"+
		"\39\3\u016f\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/_\2a\60c\2e\2g\2i\2"+
		"k\2m\61o\62q\63\3\2\13\3\2\62;\4\2--//\4\2))^^\4\2$$^^\n\2$$))^^ddhhp"+
		"pttvv\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2"+
		"\u0189\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5y\3\2\2\2\7\u0083\3\2\2\2\t\u008b"+
		"\3\2\2\2\13\u0091\3\2\2\2\r\u0098\3\2\2\2\17\u00a5\3\2\2\2\21\u00a9\3"+
		"\2\2\2\23\u00b0\3\2\2\2\25\u00b6\3\2\2\2\27\u00b9\3\2\2\2\31\u00c4\3\2"+
		"\2\2\33\u00cc\3\2\2\2\35\u00cf\3\2\2\2\37\u00d3\3\2\2\2!\u00df\3\2\2\2"+
		"#\u00e1\3\2\2\2%\u00e6\3\2\2\2\'\u00ee\3\2\2\2)\u0106\3\2\2\2+\u0108\3"+
		"\2\2\2-\u010a\3\2\2\2/\u010c\3\2\2\2\61\u010e\3\2\2\2\63\u0110\3\2\2\2"+
		"\65\u0112\3\2\2\2\67\u0114\3\2\2\29\u0116\3\2\2\2;\u0118\3\2\2\2=\u011a"+
		"\3\2\2\2?\u011c\3\2\2\2A\u011e\3\2\2\2C\u0120\3\2\2\2E\u0123\3\2\2\2G"+
		"\u0126\3\2\2\2I\u0129\3\2\2\2K\u012c\3\2\2\2M\u012f\3\2\2\2O\u0132\3\2"+
		"\2\2Q\u0134\3\2\2\2S\u0136\3\2\2\2U\u0138\3\2\2\2W\u013a\3\2\2\2Y\u013c"+
		"\3\2\2\2[\u013e\3\2\2\2]\u0148\3\2\2\2_\u014a\3\2\2\2a\u014c\3\2\2\2c"+
		"\u0153\3\2\2\2e\u0159\3\2\2\2g\u015b\3\2\2\2i\u015e\3\2\2\2k\u0160\3\2"+
		"\2\2m\u0163\3\2\2\2o\u0169\3\2\2\2q\u0177\3\2\2\2st\7i\2\2tu\7k\2\2uv"+
		"\7x\2\2vw\7g\2\2wx\7p\2\2x\4\3\2\2\2yz\7\"\2\2z{\7c\2\2{|\7u\2\2|}\7\""+
		"\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7r\2\2\u0080\u0081\7w\2\2\u0081\u0082"+
		"\7v\2\2\u0082\6\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7q\2\2\u0085\u0086"+
		"\7o\2\2\u0086\u0087\7r\2\2\u0087\u0088\7w\2\2\u0088\u0089\7v\2\2\u0089"+
		"\u008a\7g\2\2\u008a\b\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7e\2\2\u008e\u008f\7j\2\2\u008f\u0090\7\"\2\2\u0090\n\3\2\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7w\2\2\u0093\u0094\7o\2\2\u0094\u0095\7Q\2\2"+
		"\u0095\u0096\7h\2\2\u0096\u0097\7\"\2\2\u0097\f\3\2\2\2\u0098\u0099\7"+
		"g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7k\2\2\u009b\u009c\7i\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7d\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7Y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2"+
		"\u00a4\16\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7"+
		"{\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7h\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\22\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2"+
		"\u00bf\u00c0\7v\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3"+
		"\7p\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7h\2\2\u00ce"+
		"\34\3\2\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"\36\3\2\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5 \3\2\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7w\2\2\u00d9\u00e0\7g\2\2"+
		"\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de"+
		"\7u\2\2\u00de\u00e0\7g\2\2\u00df\u00d6\3\2\2\2\u00df\u00da\3\2\2\2\u00e0"+
		"\"\3\2\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4\7n\2\2\u00e4"+
		"\u00e5\7n\2\2\u00e5$\3\2\2\2\u00e6\u00ea\5i\65\2\u00e7\u00e9\5k\66\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb&\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\5[.\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0104\3\2\2\2\u00f0\u00f2\7\60\2\2"+
		"\u00f1\u00f3\t\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0105\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u0102\3\2\2\2\u00fb\u00ff\7\60\2\2\u00fc\u00fe\t\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u00fb\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00f0\3\2\2\2\u0104\u00f7\3\2"+
		"\2\2\u0105(\3\2\2\2\u0106\u0107\7*\2\2\u0107*\3\2\2\2\u0108\u0109\7+\2"+
		"\2\u0109,\3\2\2\2\u010a\u010b\7}\2\2\u010b.\3\2\2\2\u010c\u010d\7\177"+
		"\2\2\u010d\60\3\2\2\2\u010e\u010f\7]\2\2\u010f\62\3\2\2\2\u0110\u0111"+
		"\7_\2\2\u0111\64\3\2\2\2\u0112\u0113\7.\2\2\u0113\66\3\2\2\2\u0114\u0115"+
		"\7=\2\2\u01158\3\2\2\2\u0116\u0117\7<\2\2\u0117:\3\2\2\2\u0118\u0119\7"+
		"?\2\2\u0119<\3\2\2\2\u011a\u011b\7@\2\2\u011b>\3\2\2\2\u011c\u011d\7>"+
		"\2\2\u011d@\3\2\2\2\u011e\u011f\7#\2\2\u011fB\3\2\2\2\u0120\u0121\7?\2"+
		"\2\u0121\u0122\7?\2\2\u0122D\3\2\2\2\u0123\u0124\7>\2\2\u0124\u0125\7"+
		"?\2\2\u0125F\3\2\2\2\u0126\u0127\7@\2\2\u0127\u0128\7?\2\2\u0128H\3\2"+
		"\2\2\u0129\u012a\7#\2\2\u012a\u012b\7?\2\2\u012bJ\3\2\2\2\u012c\u012d"+
		"\7-\2\2\u012d\u012e\7-\2\2\u012eL\3\2\2\2\u012f\u0130\7/\2\2\u0130\u0131"+
		"\7/\2\2\u0131N\3\2\2\2\u0132\u0133\7-\2\2\u0133P\3\2\2\2\u0134\u0135\7"+
		"/\2\2\u0135R\3\2\2\2\u0136\u0137\7,\2\2\u0137T\3\2\2\2\u0138\u0139\7\61"+
		"\2\2\u0139V\3\2\2\2\u013a\u013b\7\'\2\2\u013bX\3\2\2\2\u013c\u013d\7A"+
		"\2\2\u013dZ\3\2\2\2\u013e\u013f\t\3\2\2\u013f\\\3\2\2\2\u0140\u0141\7"+
		")\2\2\u0141\u0142\5_\60\2\u0142\u0143\7)\2\2\u0143\u0149\3\2\2\2\u0144"+
		"\u0145\7)\2\2\u0145\u0146\5g\64\2\u0146\u0147\7)\2\2\u0147\u0149\3\2\2"+
		"\2\u0148\u0140\3\2\2\2\u0148\u0144\3\2\2\2\u0149^\3\2\2\2\u014a\u014b"+
		"\n\4\2\2\u014b`\3\2\2\2\u014c\u014e\7$\2\2\u014d\u014f\5c\62\2\u014e\u014d"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7$\2\2\u0151"+
		"b\3\2\2\2\u0152\u0154\5e\63\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156d\3\2\2\2\u0157\u015a\n"+
		"\5\2\2\u0158\u015a\5g\64\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a"+
		"f\3\2\2\2\u015b\u015c\7^\2\2\u015c\u015d\t\6\2\2\u015dh\3\2\2\2\u015e"+
		"\u015f\t\7\2\2\u015fj\3\2\2\2\u0160\u0161\t\b\2\2\u0161l\3\2\2\2\u0162"+
		"\u0164\t\t\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\67\2\2\u0168"+
		"n\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7,\2\2\u016b\u016f\3\2\2\2"+
		"\u016c\u016e\13\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\7,\2\2\u0173\u0174\7\61\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b8"+
		"\2\2\u0176p\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7\61\2\2\u0179\u017d"+
		"\3\2\2\2\u017a\u017c\n\n\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0181\b9\2\2\u0181r\3\2\2\2\22\2\u00df\u00ea\u00ee\u00f4\u00f9"+
		"\u00ff\u0102\u0104\u0148\u014e\u0155\u0159\u0165\u016f\u017d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}