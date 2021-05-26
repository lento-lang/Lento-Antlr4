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
		NUMBER_HEX=7, NUMBER_BINARY=8, IDENTIFIER=9, IDENTIFIER_NAMESPACED=10, 
		IDENTIFIER_IGNORE=11, ATOM=12, ESCAPED=13, SPRING=14, CHARACTER=15, LPAREN=16, 
		RPAREN=17, LBRACKET=18, RBRACKET=19, LBRACE=20, RBRACE=21, ASSIGN=22, 
		SEPARATOR_COMMA=23, SEPARATOR_DOT=24, COLON=25, SEMI_COLON=26, OPERATOR=27;
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
			"INTEGER", "FLOATING_POINT", "NUMBER_HEX", "NUMBER_BINARY", "IDENTIFIER", 
			"IDENTIFIER_NAMESPACED", "IDENTIFIER_IGNORE", "ATOM", "ESCAPED", "SPRING", 
			"CHARACTER", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
			"ASSIGN", "SEPARATOR_COMMA", "SEPARATOR_DOT", "COLON", "SEMI_COLON", 
			"OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", 
			"','", "'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SP", "NL", "COMMENT_SINGLE", "COMMENT_MULTI", "INTEGER", "FLOATING_POINT", 
			"NUMBER_HEX", "NUMBER_BINARY", "IDENTIFIER", "IDENTIFIER_NAMESPACED", 
			"IDENTIFIER_IGNORE", "ATOM", "ESCAPED", "SPRING", "CHARACTER", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "ASSIGN", "SEPARATOR_COMMA", 
			"SEPARATOR_DOT", "COLON", "SEMI_COLON", "OPERATOR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\6\2I\n\2\r\2\16\2J\3\3\3\3\3\3\6\3P\n\3\r\3"+
		"\16\3Q\3\4\3\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5c\n\5\f\5\16\5f\13\5\3\5\3\5\3\5\3\5\3\5\3\6\5\6n\n\6\3\7\3\7\3\b"+
		"\3\b\5\bt\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6\r\u0081"+
		"\n\r\r\r\16\r\u0082\3\16\5\16\u0086\n\16\3\16\3\16\6\16\u008a\n\16\r\16"+
		"\16\16\u008b\3\17\3\17\6\17\u0090\n\17\r\17\16\17\u0091\3\20\3\20\6\20"+
		"\u0096\n\20\r\20\16\20\u0097\3\21\6\21\u009b\n\21\r\21\16\21\u009c\3\21"+
		"\3\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21\3\22\3\22\3\22\3\22"+
		"\6\22\u00ab\n\22\r\22\16\22\u00ac\3\23\3\23\7\23\u00b1\n\23\f\23\16\23"+
		"\u00b4\13\23\3\23\5\23\u00b7\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00cc"+
		"\n\25\3\26\3\26\3\26\7\26\u00d1\n\26\f\26\16\26\u00d4\13\26\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u00db\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3#\6#\u00f8\n#\r#\16#\u00f9\3d\2$\3\3\5\4\7\5\t\6\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\7\33\b\35\t\37\n!\13#\f%\r\'\16)\17+\20-\21/\22"+
		"\61\23\63\24\65\25\67\269\27;\30=\31?\32A\33C\34E\35\3\2\n\4\2\13\13\""+
		"\"\4\2\f\f\17\17\4\2C\\c|\3\2\62;\4\2CHch\3\2$$\3\2))\f\2##%(,-//\61\61"+
		">>@B``~~\u0080\u0080\2\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3"+
		"H\3\2\2\2\5O\3\2\2\2\7S\3\2\2\2\t^\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17s"+
		"\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27|\3\2\2\2\31\u0080\3\2"+
		"\2\2\33\u0085\3\2\2\2\35\u008d\3\2\2\2\37\u0093\3\2\2\2!\u009a\3\2\2\2"+
		"#\u00a6\3\2\2\2%\u00ae\3\2\2\2\'\u00b8\3\2\2\2)\u00cb\3\2\2\2+\u00cd\3"+
		"\2\2\2-\u00d7\3\2\2\2/\u00de\3\2\2\2\61\u00e0\3\2\2\2\63\u00e2\3\2\2\2"+
		"\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ec"+
		"\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E\u00f7\3\2\2\2G"+
		"I\t\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\4\3\2\2\2LP\t\3\2\2"+
		"MN\7\17\2\2NP\7\f\2\2OL\3\2\2\2OM\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2R\6\3\2\2\2ST\7\61\2\2TU\7\61\2\2UY\3\2\2\2VX\n\3\2\2WV\3\2\2\2X[\3"+
		"\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\4\2\2]\b\3\2\2\2"+
		"^_\7\61\2\2_`\7,\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2"+
		"\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hi\7\61\2\2ij\3\2\2\2jk\b\5\2"+
		"\2k\n\3\2\2\2ln\t\4\2\2ml\3\2\2\2n\f\3\2\2\2op\t\5\2\2p\16\3\2\2\2qt\5"+
		"\r\7\2rt\t\6\2\2sq\3\2\2\2sr\3\2\2\2t\20\3\2\2\2uv\4\62\63\2v\22\3\2\2"+
		"\2wx\7\60\2\2x\24\3\2\2\2yz\7\62\2\2z{\7z\2\2{\26\3\2\2\2|}\7\62\2\2}"+
		"~\7d\2\2~\30\3\2\2\2\177\u0081\5\r\7\2\u0080\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\32\3\2\2\2\u0084"+
		"\u0086\5\31\r\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0089\5\23\n\2\u0088\u008a\5\r\7\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\34\3\2\2"+
		"\2\u008d\u008f\5\25\13\2\u008e\u0090\5\17\b\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\36\3\2\2"+
		"\2\u0093\u0095\5\27\f\2\u0094\u0096\5\21\t\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098 \3\2\2\2"+
		"\u0099\u009b\5\13\6\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a3\3\2\2\2\u009e\u00a2\5\r\7\2\u009f"+
		"\u00a2\5\13\6\2\u00a0\u00a2\7a\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00aa\5!\21\2"+
		"\u00a7\u00a8\5? \2\u00a8\u00a9\5!\21\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"$\3\2\2\2\u00ae\u00b2\7a\2\2\u00af\u00b1\5\r\7\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5!\21\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7<\2\2\u00b9\u00ba\5!\21\2\u00ba"+
		"(\3\2\2\2\u00bb\u00bc\7^\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\5\17\b\2\u00bf\u00c0\5\17\b\2\u00c0\u00c1\5\17\b\2\u00c1\u00c2"+
		"\5\17\b\2\u00c2\u00cc\3\2\2\2\u00c3\u00c4\7^\2\2\u00c4\u00cc\7$\2\2\u00c5"+
		"\u00c6\7^\2\2\u00c6\u00cc\7)\2\2\u00c7\u00c8\7^\2\2\u00c8\u00cc\7^\2\2"+
		"\u00c9\u00ca\7^\2\2\u00ca\u00cc\13\2\2\2\u00cb\u00bb\3\2\2\2\u00cb\u00c3"+
		"\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"*\3\2\2\2\u00cd\u00d2\7$\2\2\u00ce\u00d1\5)\25\2\u00cf\u00d1\n\7\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7$\2\2\u00d6,\3\2\2\2\u00d7\u00da\7)\2\2\u00d8\u00db\5)\25\2\u00d9"+
		"\u00db\n\b\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\7)\2\2\u00dd.\3\2\2\2\u00de\u00df\7*\2\2\u00df\60\3\2"+
		"\2\2\u00e0\u00e1\7+\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7]\2\2\u00e3\64\3"+
		"\2\2\2\u00e4\u00e5\7_\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7}\2\2\u00e78\3"+
		"\2\2\2\u00e8\u00e9\7\177\2\2\u00e9:\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb<"+
		"\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7\60\2\2\u00ef"+
		"@\3\2\2\2\u00f0\u00f1\7<\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3D"+
		"\3\2\2\2\u00f4\u00f8\5;\36\2\u00f5\u00f8\5A!\2\u00f6\u00f8\t\t\2\2\u00f7"+
		"\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faF\3\2\2\2\33\2JOQYd"+
		"ms\u0082\u0085\u008b\u0091\u0097\u009c\u00a1\u00a3\u00ac\u00b2\u00b6\u00cb"+
		"\u00d0\u00d2\u00da\u00f7\u00f9\3\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}