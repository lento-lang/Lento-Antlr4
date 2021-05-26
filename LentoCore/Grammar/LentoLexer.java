// Generated from LentoLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LentoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SP=1, NL=2, COMMENT_SINGLE=3, COMMENT_MULTI=4, INTEGER=5, FLOATING_POINT=6, 
		NUMBER_HEX=7, NUMBER_BINARY=8, IDENTIFIER_SPECIAL=9, IDENTIFIER=10, IGNORE_IDENTIFIER=11, 
		ATOM=12, FUNCTION_NAME=13, TYPE=14, ESCAPED=15, SPRING=16, CHARACTER=17, 
		LPAREN=18, RPAREN=19, LBRACKET=20, RBRACKET=21, LBRACE=22, RBRACE=23, 
		ASSIGN=24, SEPARATOR_COMMA=25, COLON=26, SEMI_COLON=27, OPERATOR=28;
	public static final int
		COMMENTS=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SP", "NL", "COMMENT_SINGLE", "COMMENT_MULTI", "LETTER", "DIGIT", "DIGIT_HEX", 
			"DIGIT_BINARY", "DECIMAL_POINT", "NUMBER_PREFIX_HEX", "NUMBER_PREFIX_BINARY", 
			"INTEGER", "FLOATING_POINT", "NUMBER_HEX", "NUMBER_BINARY", "IDENTIFIER_SPECIAL", 
			"IDENTIFIER", "IGNORE_IDENTIFIER", "ATOM", "FUNCTION_NAME", "TYPE", "ESCAPED", 
			"SPRING", "CHARACTER", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "ASSIGN", "SEPARATOR_COMMA", "COLON", "SEMI_COLON", "OPERATOR_ALLOWED", 
			"OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'='", "','", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SP", "NL", "COMMENT_SINGLE", "COMMENT_MULTI", "INTEGER", "FLOATING_POINT", 
			"NUMBER_HEX", "NUMBER_BINARY", "IDENTIFIER_SPECIAL", "IDENTIFIER", "IGNORE_IDENTIFIER", 
			"ATOM", "FUNCTION_NAME", "TYPE", "ESCAPED", "SPRING", "CHARACTER", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "ASSIGN", "SEPARATOR_COMMA", 
			"COLON", "SEMI_COLON", "OPERATOR"
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


	public LentoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LentoLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u010f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2M\n\2\r\2\16\2N\3\3\3\3\3\3\6"+
		"\3T\n\3\r\3\16\3U\3\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6r\n\6"+
		"\3\7\3\7\3\b\3\b\5\bx\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\6\r\u0085\n\r\r\r\16\r\u0086\3\16\5\16\u008a\n\16\3\16\3\16\6\16\u008e"+
		"\n\16\r\16\16\16\u008f\3\17\3\17\6\17\u0094\n\17\r\17\16\17\u0095\3\20"+
		"\3\20\6\20\u009a\n\20\r\20\16\20\u009b\3\21\3\21\3\22\3\22\6\22\u00a2"+
		"\n\22\r\22\16\22\u00a3\3\22\3\22\3\22\3\22\7\22\u00aa\n\22\f\22\16\22"+
		"\u00ad\13\22\3\23\3\23\7\23\u00b1\n\23\f\23\16\23\u00b4\13\23\3\23\5\23"+
		"\u00b7\n\23\3\24\3\24\6\24\u00bb\n\24\r\24\16\24\u00bc\3\25\3\25\3\26"+
		"\6\26\u00c2\n\26\r\26\16\26\u00c3\3\26\3\26\3\26\7\26\u00c9\n\26\f\26"+
		"\16\26\u00cc\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u00de\n\27\3\30\3\30\3\30\7\30\u00e3"+
		"\n\30\f\30\16\30\u00e6\13\30\3\30\3\30\3\31\3\31\3\31\5\31\u00ed\n\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u0109\n$\3%\6%\u010c\n%\r%\16"+
		"%\u010d\3h\2&\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\7\33"+
		"\b\35\t\37\n!\13#\f%\r\'\16)\17+\20-\21/\22\61\23\63\24\65\25\67\269\27"+
		";\30=\31?\32A\33C\34E\35G\2I\36\3\2\n\4\2\13\13\"\"\4\2\f\f\17\17\4\2"+
		"C\\c|\3\2\62;\4\2CHch\3\2$$\3\2))\r\2##%%\'(,-//\61\61>>@B``~~\u0080\u0080"+
		"\2\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\3L\3\2\2\2"+
		"\5S\3\2\2\2\7W\3\2\2\2\tb\3\2\2\2\13q\3\2\2\2\rs\3\2\2\2\17w\3\2\2\2\21"+
		"y\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\u0080\3\2\2\2\31\u0084\3\2\2\2\33"+
		"\u0089\3\2\2\2\35\u0091\3\2\2\2\37\u0097\3\2\2\2!\u009d\3\2\2\2#\u00a1"+
		"\3\2\2\2%\u00ae\3\2\2\2\'\u00b8\3\2\2\2)\u00be\3\2\2\2+\u00c1\3\2\2\2"+
		"-\u00dd\3\2\2\2/\u00df\3\2\2\2\61\u00e9\3\2\2\2\63\u00f0\3\2\2\2\65\u00f2"+
		"\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8\3\2\2\2=\u00fa\3\2\2\2"+
		"?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E\u0102\3\2\2\2G\u0108\3"+
		"\2\2\2I\u010b\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2O\4\3\2\2\2PT\t\3\2\2QR\7\17\2\2RT\7\f\2\2SP\3\2\2\2SQ\3\2\2\2TU\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2V\6\3\2\2\2WX\7\61\2\2XY\7\61\2\2Y]\3\2\2\2Z\\"+
		"\n\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2"+
		"`a\b\4\2\2a\b\3\2\2\2bc\7\61\2\2cd\7,\2\2dh\3\2\2\2eg\13\2\2\2fe\3\2\2"+
		"\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7,\2\2lm\7\61\2"+
		"\2mn\3\2\2\2no\b\5\2\2o\n\3\2\2\2pr\t\4\2\2qp\3\2\2\2r\f\3\2\2\2st\t\5"+
		"\2\2t\16\3\2\2\2ux\5\r\7\2vx\t\6\2\2wu\3\2\2\2wv\3\2\2\2x\20\3\2\2\2y"+
		"z\4\62\63\2z\22\3\2\2\2{|\7\60\2\2|\24\3\2\2\2}~\7\62\2\2~\177\7z\2\2"+
		"\177\26\3\2\2\2\u0080\u0081\7\62\2\2\u0081\u0082\7d\2\2\u0082\30\3\2\2"+
		"\2\u0083\u0085\5\r\7\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\32\3\2\2\2\u0088\u008a\5\31\r\2\u0089"+
		"\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\5\23"+
		"\n\2\u008c\u008e\5\r\7\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\34\3\2\2\2\u0091\u0093\5\25\13"+
		"\2\u0092\u0094\5\17\b\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\36\3\2\2\2\u0097\u0099\5\27\f"+
		"\2\u0098\u009a\5\21\t\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c \3\2\2\2\u009d\u009e\4%(\2\u009e"+
		"\"\3\2\2\2\u009f\u00a2\5\13\6\2\u00a0\u00a2\5!\21\2\u00a1\u009f\3\2\2"+
		"\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00ab\3\2\2\2\u00a5\u00aa\5\r\7\2\u00a6\u00aa\5\13\6\2"+
		"\u00a7\u00aa\5!\21\2\u00a8\u00aa\7a\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a6"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac$\3\2\2\2\u00ad\u00ab\3\2\2\2"+
		"\u00ae\u00b2\7a\2\2\u00af\u00b1\5\r\7\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b7\5#\22\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7&\3\2\2\2\u00b8\u00ba\7<\2\2\u00b9\u00bb\5#\22\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"(\3\2\2\2\u00be\u00bf\5#\22\2\u00bf*\3\2\2\2\u00c0\u00c2\5\13\6\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00ca\3\2\2\2\u00c5\u00c9\5\r\7\2\u00c6\u00c9\5\13\6\2\u00c7"+
		"\u00c9\7a\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		",\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7^\2\2\u00ce\u00cf\7w\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\5\17\b\2\u00d1\u00d2\5\17\b\2\u00d2\u00d3\5"+
		"\17\b\2\u00d3\u00d4\5\17\b\2\u00d4\u00de\3\2\2\2\u00d5\u00d6\7^\2\2\u00d6"+
		"\u00de\7$\2\2\u00d7\u00d8\7^\2\2\u00d8\u00de\7)\2\2\u00d9\u00da\7^\2\2"+
		"\u00da\u00de\7^\2\2\u00db\u00dc\7^\2\2\u00dc\u00de\13\2\2\2\u00dd\u00cd"+
		"\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de.\3\2\2\2\u00df\u00e4\7$\2\2\u00e0\u00e3\5-\27\2\u00e1"+
		"\u00e3\n\7\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8\60\3\2\2\2\u00e9\u00ec\7)\2\2"+
		"\u00ea\u00ed\5-\27\2\u00eb\u00ed\n\b\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7)\2\2\u00ef\62\3\2\2\2\u00f0"+
		"\u00f1\7*\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3\66\3\2\2\2\u00f4"+
		"\u00f5\7]\2\2\u00f58\3\2\2\2\u00f6\u00f7\7_\2\2\u00f7:\3\2\2\2\u00f8\u00f9"+
		"\7}\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7\177\2\2\u00fb>\3\2\2\2\u00fc\u00fd"+
		"\7?\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7.\2\2\u00ffB\3\2\2\2\u0100\u0101\7"+
		"<\2\2\u0101D\3\2\2\2\u0102\u0103\7=\2\2\u0103F\3\2\2\2\u0104\u0109\5\13"+
		"\6\2\u0105\u0109\5? \2\u0106\u0109\5C\"\2\u0107\u0109\t\t\2\2\u0108\u0104"+
		"\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"H\3\2\2\2\u010a\u010c\5G$\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eJ\3\2\2\2\37\2NSU]hqw\u0086\u0089"+
		"\u008f\u0095\u009b\u00a1\u00a3\u00a9\u00ab\u00b2\u00b6\u00bc\u00c3\u00c8"+
		"\u00ca\u00dd\u00e2\u00e4\u00ec\u0108\u010d\3\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}