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
		ORSTR=15, NullLiteral=16, NUMBER=17, LPAREN=18, RPAREN=19, LBRACE=20, 
		RBRACE=21, LBRACK=22, RBRACK=23, COMMA=24, SEMI=25, COLON=26, ASSIGN=27, 
		GT=28, LT=29, BANG=30, EQUAL=31, LE=32, GE=33, NOTEQUAL=34, INC=35, DEC=36, 
		ADD=37, SUB=38, MUL=39, DIV=40, MOD=41, QUESTIONMARK=42, BooleanLiteral=43, 
		CharacterLiteral=44, StringLiteral=45, IDENTIFIER=46, WS=47, COMMENT=48, 
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
			"NullLiteral", "NUMBER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "COMMA", "SEMI", "COLON", "ASSIGN", "GT", "LT", "BANG", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"QUESTIONMARK", "Sign", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"IDENTIFIER", "SchemeLetter", "SchemeLetterOrDigit", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'given'", "' as input'", "'compute'", "'each '", "'sumOf '", "'eligibleWhen'", 
			"'pay'", "'before'", "'after'", "'in'", "'proportion'", "'default'", 
			"'of'", "'and'", "'or'", "'null'", null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "','", "';'", "':'", "'='", "'>'", "'<'", "'!'", "'=='", 
			"'<='", "'>='", "'!='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GIVEN", "ASINPUT", "COMPUTE", "EACH", "SUMOF", "ELIGIBLEWHEN", 
			"PAY", "BEFORE", "AFTER", "IN", "PROPORTION", "DEFAULT", "OF", "ANDSTR", 
			"ORSTR", "NullLiteral", "NUMBER", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMA", "SEMI", "COLON", "ASSIGN", "GT", "LT", "BANG", 
			"EQUAL", "LE", "GE", "NOTEQUAL", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
			"MOD", "QUESTIONMARK", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
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
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\5"+
		"\22\u00dd\n\22\3\22\3\22\6\22\u00e1\n\22\r\22\16\22\u00e2\3\22\6\22\u00e6"+
		"\n\22\r\22\16\22\u00e7\3\22\3\22\7\22\u00ec\n\22\f\22\16\22\u00ef\13\22"+
		"\5\22\u00f1\n\22\5\22\u00f3\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u0138\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0142\n.\3/\3/\3\60"+
		"\3\60\5\60\u0148\n\60\3\60\3\60\3\61\6\61\u014d\n\61\r\61\16\61\u014e"+
		"\3\62\3\62\5\62\u0153\n\62\3\63\3\63\3\63\3\64\3\64\7\64\u015a\n\64\f"+
		"\64\16\64\u015d\13\64\3\65\3\65\3\66\3\66\3\67\6\67\u0164\n\67\r\67\16"+
		"\67\u0165\3\67\3\67\38\38\38\38\78\u016e\n8\f8\168\u0171\138\38\38\38"+
		"\38\38\39\39\39\39\79\u017c\n9\f9\169\u017f\139\39\39\3\u016f\2:\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y-[.]\2_/a\2c\2e\2g\60i\2k\2m\61o\62q\63\3"+
		"\2\13\3\2\62;\4\2--//\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\6\2&&C\\aac"+
		"|\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0189\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2g\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\3s\3\2\2\2\5y\3\2\2\2\7\u0083\3\2\2\2\t\u008b\3\2\2\2\13\u0091"+
		"\3\2\2\2\r\u0098\3\2\2\2\17\u00a5\3\2\2\2\21\u00a9\3\2\2\2\23\u00b0\3"+
		"\2\2\2\25\u00b6\3\2\2\2\27\u00b9\3\2\2\2\31\u00c4\3\2\2\2\33\u00cc\3\2"+
		"\2\2\35\u00cf\3\2\2\2\37\u00d3\3\2\2\2!\u00d6\3\2\2\2#\u00dc\3\2\2\2%"+
		"\u00f4\3\2\2\2\'\u00f6\3\2\2\2)\u00f8\3\2\2\2+\u00fa\3\2\2\2-\u00fc\3"+
		"\2\2\2/\u00fe\3\2\2\2\61\u0100\3\2\2\2\63\u0102\3\2\2\2\65\u0104\3\2\2"+
		"\2\67\u0106\3\2\2\29\u0108\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2?\u010e"+
		"\3\2\2\2A\u0111\3\2\2\2C\u0114\3\2\2\2E\u0117\3\2\2\2G\u011a\3\2\2\2I"+
		"\u011d\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2\2\2O\u0124\3\2\2\2Q\u0126\3\2"+
		"\2\2S\u0128\3\2\2\2U\u012a\3\2\2\2W\u012c\3\2\2\2Y\u0137\3\2\2\2[\u0141"+
		"\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a\u014c\3\2\2\2c\u0152\3\2\2\2e"+
		"\u0154\3\2\2\2g\u0157\3\2\2\2i\u015e\3\2\2\2k\u0160\3\2\2\2m\u0163\3\2"+
		"\2\2o\u0169\3\2\2\2q\u0177\3\2\2\2st\7i\2\2tu\7k\2\2uv\7x\2\2vw\7g\2\2"+
		"wx\7p\2\2x\4\3\2\2\2yz\7\"\2\2z{\7c\2\2{|\7u\2\2|}\7\"\2\2}~\7k\2\2~\177"+
		"\7p\2\2\177\u0080\7r\2\2\u0080\u0081\7w\2\2\u0081\u0082\7v\2\2\u0082\6"+
		"\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7q\2\2\u0085\u0086\7o\2\2\u0086"+
		"\u0087\7r\2\2\u0087\u0088\7w\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2"+
		"\u008a\b\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d\u008e\7e"+
		"\2\2\u008e\u008f\7j\2\2\u008f\u0090\7\"\2\2\u0090\n\3\2\2\2\u0091\u0092"+
		"\7u\2\2\u0092\u0093\7w\2\2\u0093\u0094\7o\2\2\u0094\u0095\7Q\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7\"\2\2\u0097\f\3\2\2\2\u0098\u0099\7g\2\2\u0099"+
		"\u009a\7n\2\2\u009a\u009b\7k\2\2\u009b\u009c\7i\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7d\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7Y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\16\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7{\2\2\u00a8"+
		"\20\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7h\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\22\3\2\2\2\u00b0"+
		"\u00b1\7c\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\u00b5\7t\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7"+
		"p\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc"+
		"\7q\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7p\2\2"+
		"\u00c3\30\3\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7"+
		"h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb"+
		"\7v\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7h\2\2\u00ce\34"+
		"\3\2\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2"+
		"\36\3\2\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5 \3\2\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7n\2\2"+
		"\u00da\"\3\2\2\2\u00db\u00dd\5W,\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00f2\3\2\2\2\u00de\u00e0\7\60\2\2\u00df\u00e1\t\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00f3\3\2\2\2\u00e4\u00e6\t\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00f0\3\2"+
		"\2\2\u00e9\u00ed\7\60\2\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00de\3\2\2\2\u00f2\u00e5\3\2\2\2\u00f3$\3\2\2\2"+
		"\u00f4\u00f5\7*\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7(\3\2\2\2\u00f8"+
		"\u00f9\7}\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7\177\2\2\u00fb,\3\2\2\2\u00fc"+
		"\u00fd\7]\2\2\u00fd.\3\2\2\2\u00fe\u00ff\7_\2\2\u00ff\60\3\2\2\2\u0100"+
		"\u0101\7.\2\2\u0101\62\3\2\2\2\u0102\u0103\7=\2\2\u0103\64\3\2\2\2\u0104"+
		"\u0105\7<\2\2\u0105\66\3\2\2\2\u0106\u0107\7?\2\2\u01078\3\2\2\2\u0108"+
		"\u0109\7@\2\2\u0109:\3\2\2\2\u010a\u010b\7>\2\2\u010b<\3\2\2\2\u010c\u010d"+
		"\7#\2\2\u010d>\3\2\2\2\u010e\u010f\7?\2\2\u010f\u0110\7?\2\2\u0110@\3"+
		"\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113B\3\2\2\2\u0114\u0115"+
		"\7@\2\2\u0115\u0116\7?\2\2\u0116D\3\2\2\2\u0117\u0118\7#\2\2\u0118\u0119"+
		"\7?\2\2\u0119F\3\2\2\2\u011a\u011b\7-\2\2\u011b\u011c\7-\2\2\u011cH\3"+
		"\2\2\2\u011d\u011e\7/\2\2\u011e\u011f\7/\2\2\u011fJ\3\2\2\2\u0120\u0121"+
		"\7-\2\2\u0121L\3\2\2\2\u0122\u0123\7/\2\2\u0123N\3\2\2\2\u0124\u0125\7"+
		",\2\2\u0125P\3\2\2\2\u0126\u0127\7\61\2\2\u0127R\3\2\2\2\u0128\u0129\7"+
		"\'\2\2\u0129T\3\2\2\2\u012a\u012b\7A\2\2\u012bV\3\2\2\2\u012c\u012d\t"+
		"\3\2\2\u012dX\3\2\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2\u0130\u0131"+
		"\7w\2\2\u0131\u0138\7g\2\2\u0132\u0133\7h\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7n\2\2\u0135\u0136\7u\2\2\u0136\u0138\7g\2\2\u0137\u012e\3\2\2"+
		"\2\u0137\u0132\3\2\2\2\u0138Z\3\2\2\2\u0139\u013a\7)\2\2\u013a\u013b\5"+
		"]/\2\u013b\u013c\7)\2\2\u013c\u0142\3\2\2\2\u013d\u013e\7)\2\2\u013e\u013f"+
		"\5e\63\2\u013f\u0140\7)\2\2\u0140\u0142\3\2\2\2\u0141\u0139\3\2\2\2\u0141"+
		"\u013d\3\2\2\2\u0142\\\3\2\2\2\u0143\u0144\n\4\2\2\u0144^\3\2\2\2\u0145"+
		"\u0147\7$\2\2\u0146\u0148\5a\61\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7$\2\2\u014a`\3\2\2\2\u014b\u014d"+
		"\5c\62\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014fb\3\2\2\2\u0150\u0153\n\5\2\2\u0151\u0153\5e\63\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153d\3\2\2\2\u0154\u0155\7"+
		"^\2\2\u0155\u0156\t\6\2\2\u0156f\3\2\2\2\u0157\u015b\5i\65\2\u0158\u015a"+
		"\5k\66\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015ch\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\t\7\2\2"+
		"\u015fj\3\2\2\2\u0160\u0161\t\b\2\2\u0161l\3\2\2\2\u0162\u0164\t\t\2\2"+
		"\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\67\2\2\u0168n\3\2\2\2\u0169"+
		"\u016a\7\61\2\2\u016a\u016b\7,\2\2\u016b\u016f\3\2\2\2\u016c\u016e\13"+
		"\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7,"+
		"\2\2\u0173\u0174\7\61\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b8\2\2\u0176"+
		"p\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179\7\61\2\2\u0179\u017d\3\2\2"+
		"\2\u017a\u017c\n\n\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0181\b9\2\2\u0181r\3\2\2\2\22\2\u00dc\u00e2\u00e7\u00ed\u00f0\u00f2"+
		"\u0137\u0141\u0147\u014e\u0152\u015b\u0165\u016f\u017d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}