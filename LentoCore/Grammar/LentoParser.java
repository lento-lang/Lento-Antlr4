// Generated from LentoParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LentoParser extends Parser {
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
		RULE_whitespace_any = 0, RULE_whitespace_sp = 1, RULE_whitespace_nl = 2, 
		RULE_identifier = 3, RULE_integer = 4, RULE_floating_point = 5, RULE_number_hex = 6, 
		RULE_number_binary = 7, RULE_numerical = 8, RULE_string = 9, RULE_character = 10, 
		RULE_typed_identifier = 11, RULE_tuple = 12, RULE_tuple_type = 13, RULE_list = 14, 
		RULE_list_type = 15, RULE_map_element = 16, RULE_map = 17, RULE_map_type = 18, 
		RULE_block = 19, RULE_function_call = 20, RULE_function_declaration = 21, 
		RULE_operator_infix = 22, RULE_operator_prefix = 23, RULE_expression_separator = 24, 
		RULE_expression = 25, RULE_compilation_unit = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"whitespace_any", "whitespace_sp", "whitespace_nl", "identifier", "integer", 
			"floating_point", "number_hex", "number_binary", "numerical", "string", 
			"character", "typed_identifier", "tuple", "tuple_type", "list", "list_type", 
			"map_element", "map", "map_type", "block", "function_call", "function_declaration", 
			"operator_infix", "operator_prefix", "expression_separator", "expression", 
			"compilation_unit"
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

	@Override
	public String getGrammarFileName() { return "LentoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LentoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Whitespace_anyContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(LentoParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(LentoParser.NL, i);
		}
		public List<TerminalNode> SP() { return getTokens(LentoParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(LentoParser.SP, i);
		}
		public List<TerminalNode> COMMENT_MULTI() { return getTokens(LentoParser.COMMENT_MULTI); }
		public TerminalNode COMMENT_MULTI(int i) {
			return getToken(LentoParser.COMMENT_MULTI, i);
		}
		public Whitespace_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace_any; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitWhitespace_any(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whitespace_anyContext whitespace_any() throws RecognitionException {
		Whitespace_anyContext _localctx = new Whitespace_anyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_whitespace_any);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Whitespace_spContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(LentoParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(LentoParser.SP, i);
		}
		public List<TerminalNode> COMMENT_MULTI() { return getTokens(LentoParser.COMMENT_MULTI); }
		public TerminalNode COMMENT_MULTI(int i) {
			return getToken(LentoParser.COMMENT_MULTI, i);
		}
		public Whitespace_spContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace_sp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitWhitespace_sp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whitespace_spContext whitespace_sp() throws RecognitionException {
		Whitespace_spContext _localctx = new Whitespace_spContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whitespace_sp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(59);
					_la = _input.LA(1);
					if ( !(_la==SP || _la==COMMENT_MULTI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Whitespace_nlContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(LentoParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(LentoParser.NL, i);
		}
		public List<TerminalNode> COMMENT_MULTI() { return getTokens(LentoParser.COMMENT_MULTI); }
		public TerminalNode COMMENT_MULTI(int i) {
			return getToken(LentoParser.COMMENT_MULTI, i);
		}
		public Whitespace_nlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitespace_nl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitWhitespace_nl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whitespace_nlContext whitespace_nl() throws RecognitionException {
		Whitespace_nlContext _localctx = new Whitespace_nlContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whitespace_nl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					_la = _input.LA(1);
					if ( !(_la==NL || _la==COMMENT_MULTI) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
		public TerminalNode IGNORE_IDENTIFIER() { return getToken(LentoParser.IGNORE_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==IGNORE_IDENTIFIER) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LentoParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(INTEGER);
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

	public static class Floating_pointContext extends ParserRuleContext {
		public TerminalNode FLOATING_POINT() { return getToken(LentoParser.FLOATING_POINT, 0); }
		public Floating_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitFloating_point(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_pointContext floating_point() throws RecognitionException {
		Floating_pointContext _localctx = new Floating_pointContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floating_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FLOATING_POINT);
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

	public static class Number_hexContext extends ParserRuleContext {
		public TerminalNode NUMBER_HEX() { return getToken(LentoParser.NUMBER_HEX, 0); }
		public Number_hexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_hex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitNumber_hex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_hexContext number_hex() throws RecognitionException {
		Number_hexContext _localctx = new Number_hexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(NUMBER_HEX);
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

	public static class Number_binaryContext extends ParserRuleContext {
		public TerminalNode NUMBER_BINARY() { return getToken(LentoParser.NUMBER_BINARY, 0); }
		public Number_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_binary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitNumber_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_binaryContext number_binary() throws RecognitionException {
		Number_binaryContext _localctx = new Number_binaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(NUMBER_BINARY);
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

	public static class NumericalContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Floating_pointContext floating_point() {
			return getRuleContext(Floating_pointContext.class,0);
		}
		public Number_hexContext number_hex() {
			return getRuleContext(Number_hexContext.class,0);
		}
		public Number_binaryContext number_binary() {
			return getRuleContext(Number_binaryContext.class,0);
		}
		public NumericalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitNumerical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalContext numerical() throws RecognitionException {
		NumericalContext _localctx = new NumericalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numerical);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				integer();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				floating_point();
				}
				break;
			case NUMBER_HEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				number_hex();
				}
				break;
			case NUMBER_BINARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				number_binary();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SPRING() { return getToken(LentoParser.SPRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(SPRING);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(LentoParser.CHARACTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CHARACTER);
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

	public static class Typed_identifierContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LentoParser.TYPE, 0); }
		public Whitespace_spContext whitespace_sp() {
			return getRuleContext(Whitespace_spContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typed_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitTyped_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_identifierContext typed_identifier() throws RecognitionException {
		Typed_identifierContext _localctx = new Typed_identifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typed_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(TYPE);
			setState(90);
			whitespace_sp();
			setState(91);
			identifier();
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

	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LentoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LentoParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPARATOR_COMMA() { return getTokens(LentoParser.SEPARATOR_COMMA); }
		public TerminalNode SEPARATOR_COMMA(int i) {
			return getToken(LentoParser.SEPARATOR_COMMA, i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LPAREN);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << NUMBER_HEX) | (1L << NUMBER_BINARY) | (1L << IDENTIFIER) | (1L << IGNORE_IDENTIFIER) | (1L << FUNCTION_NAME) | (1L << TYPE) | (1L << SPRING) | (1L << CHARACTER) | (1L << LPAREN) | (1L << LBRACKET) | (1L << LBRACE) | (1L << OPERATOR))) != 0)) {
				{
				setState(94);
				expression(0);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(95);
					match(SEPARATOR_COMMA);
					setState(96);
					expression(0);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
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

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LentoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LentoParser.RPAREN, 0); }
		public List<Typed_identifierContext> typed_identifier() {
			return getRuleContexts(Typed_identifierContext.class);
		}
		public Typed_identifierContext typed_identifier(int i) {
			return getRuleContext(Typed_identifierContext.class,i);
		}
		public List<TerminalNode> SEPARATOR_COMMA() { return getTokens(LentoParser.SEPARATOR_COMMA); }
		public TerminalNode SEPARATOR_COMMA(int i) {
			return getToken(LentoParser.SEPARATOR_COMMA, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LPAREN);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(107);
				typed_identifier();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(108);
					match(SEPARATOR_COMMA);
					setState(109);
					typed_identifier();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(117);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(LentoParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LentoParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPARATOR_COMMA() { return getTokens(LentoParser.SEPARATOR_COMMA); }
		public TerminalNode SEPARATOR_COMMA(int i) {
			return getToken(LentoParser.SEPARATOR_COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LBRACKET);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << NUMBER_HEX) | (1L << NUMBER_BINARY) | (1L << IDENTIFIER) | (1L << IGNORE_IDENTIFIER) | (1L << FUNCTION_NAME) | (1L << TYPE) | (1L << SPRING) | (1L << CHARACTER) | (1L << LPAREN) | (1L << LBRACKET) | (1L << LBRACE) | (1L << OPERATOR))) != 0)) {
				{
				setState(120);
				expression(0);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(121);
					match(SEPARATOR_COMMA);
					setState(122);
					expression(0);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(130);
			match(RBRACKET);
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

	public static class List_typeContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(LentoParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(LentoParser.RBRACKET, 0); }
		public List<TerminalNode> TYPE() { return getTokens(LentoParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(LentoParser.TYPE, i);
		}
		public List<TerminalNode> SEPARATOR_COMMA() { return getTokens(LentoParser.SEPARATOR_COMMA); }
		public TerminalNode SEPARATOR_COMMA(int i) {
			return getToken(LentoParser.SEPARATOR_COMMA, i);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitList_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LBRACKET);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(133);
				match(TYPE);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(134);
					match(SEPARATOR_COMMA);
					setState(135);
					match(TYPE);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			match(RBRACKET);
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

	public static class Map_elementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LentoParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Map_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitMap_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_elementContext map_element() throws RecognitionException {
		Map_elementContext _localctx = new Map_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_map_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			identifier();
			setState(146);
			match(COLON);
			setState(147);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LentoParser.LPAREN, 0); }
		public List<Map_elementContext> map_element() {
			return getRuleContexts(Map_elementContext.class);
		}
		public Map_elementContext map_element(int i) {
			return getRuleContext(Map_elementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LentoParser.RPAREN, 0); }
		public List<TerminalNode> SEPARATOR_COMMA() { return getTokens(LentoParser.SEPARATOR_COMMA); }
		public TerminalNode SEPARATOR_COMMA(int i) {
			return getToken(LentoParser.SEPARATOR_COMMA, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LPAREN);
			setState(150);
			map_element();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR_COMMA) {
				{
				{
				setState(151);
				match(SEPARATOR_COMMA);
				setState(152);
				map_element();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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

	public static class Map_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LentoParser.LPAREN, 0); }
		public List<Typed_identifierContext> typed_identifier() {
			return getRuleContexts(Typed_identifierContext.class);
		}
		public Typed_identifierContext typed_identifier(int i) {
			return getRuleContext(Typed_identifierContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LentoParser.RPAREN, 0); }
		public List<TerminalNode> SEPARATOR_COMMA() { return getTokens(LentoParser.SEPARATOR_COMMA); }
		public TerminalNode SEPARATOR_COMMA(int i) {
			return getToken(LentoParser.SEPARATOR_COMMA, i);
		}
		public Map_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitMap_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_typeContext map_type() throws RecognitionException {
		Map_typeContext _localctx = new Map_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_map_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LPAREN);
			setState(161);
			typed_identifier();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR_COMMA) {
				{
				{
				setState(162);
				match(SEPARATOR_COMMA);
				setState(163);
				typed_identifier();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LentoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LentoParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Expression_separatorContext> expression_separator() {
			return getRuleContexts(Expression_separatorContext.class);
		}
		public Expression_separatorContext expression_separator(int i) {
			return getRuleContext(Expression_separatorContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LBRACE);
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(172);
				expression(0);
				}
				break;
			case 2:
				{
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << NUMBER_HEX) | (1L << NUMBER_BINARY) | (1L << IDENTIFIER) | (1L << IGNORE_IDENTIFIER) | (1L << FUNCTION_NAME) | (1L << TYPE) | (1L << SPRING) | (1L << CHARACTER) | (1L << LPAREN) | (1L << LBRACKET) | (1L << LBRACE) | (1L << OPERATOR))) != 0)) {
					{
					{
					setState(173);
					expression(0);
					setState(174);
					expression_separator();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(183);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode FUNCTION_NAME() { return getToken(LentoParser.FUNCTION_NAME, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public Expression_separatorContext expression_separator() {
			return getRuleContext(Expression_separatorContext.class,0);
		}
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_call);
		try {
			int _alt;
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(FUNCTION_NAME);
				setState(186);
				tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(FUNCTION_NAME);
				setState(191); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(188);
						whitespace_sp();
						setState(189);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(193); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(195);
				expression_separator();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LentoParser.TYPE, 0); }
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
		public TerminalNode FUNCTION_NAME() { return getToken(LentoParser.FUNCTION_NAME, 0); }
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LentoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(TYPE);
			setState(200);
			whitespace_sp();
			setState(201);
			match(FUNCTION_NAME);
			setState(202);
			tuple_type();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(203);
				whitespace_sp();
				}
			}

			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(206);
				match(ASSIGN);
				setState(207);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(208);
				block();
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

	public static class Operator_infixContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(LentoParser.OPERATOR, 0); }
		public Operator_infixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_infix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitOperator_infix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_infixContext operator_infix() throws RecognitionException {
		Operator_infixContext _localctx = new Operator_infixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operator_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(OPERATOR);
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

	public static class Operator_prefixContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(LentoParser.OPERATOR, 0); }
		public Operator_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_prefix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitOperator_prefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_prefixContext operator_prefix() throws RecognitionException {
		Operator_prefixContext _localctx = new Operator_prefixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operator_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(OPERATOR);
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

	public static class Expression_separatorContext extends ParserRuleContext {
		public Whitespace_nlContext whitespace_nl() {
			return getRuleContext(Whitespace_nlContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(LentoParser.SEMI_COLON, 0); }
		public Whitespace_spContext whitespace_sp() {
			return getRuleContext(Whitespace_spContext.class,0);
		}
		public Whitespace_anyContext whitespace_any() {
			return getRuleContext(Whitespace_anyContext.class,0);
		}
		public Expression_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_separator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitExpression_separator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_separatorContext expression_separator() throws RecognitionException {
		Expression_separatorContext _localctx = new Expression_separatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(215);
				whitespace_sp();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case COMMENT_MULTI:
				{
				setState(218);
				whitespace_nl();
				}
				break;
			case SEMI_COLON:
				{
				setState(219);
				match(SEMI_COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(222);
				whitespace_any();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Whitespace_anyContext whitespace_any() {
			return getRuleContext(Whitespace_anyContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Operator_prefixContext operator_prefix() {
			return getRuleContext(Operator_prefixContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumericalContext numerical() {
			return getRuleContext(NumericalContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Operator_infixContext operator_infix() {
			return getRuleContext(Operator_infixContext.class,0);
		}
		public Whitespace_spContext whitespace_sp() {
			return getRuleContext(Whitespace_spContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(226);
				whitespace_any();
				setState(227);
				expression(14);
				}
				break;
			case 2:
				{
				setState(229);
				operator_prefix();
				setState(230);
				expression(11);
				}
				break;
			case 3:
				{
				setState(232);
				function_declaration();
				}
				break;
			case 4:
				{
				setState(233);
				function_call();
				}
				break;
			case 5:
				{
				setState(234);
				identifier();
				}
				break;
			case 6:
				{
				setState(235);
				numerical();
				}
				break;
			case 7:
				{
				setState(236);
				character();
				}
				break;
			case 8:
				{
				setState(237);
				string();
				}
				break;
			case 9:
				{
				setState(238);
				tuple();
				}
				break;
			case 10:
				{
				setState(239);
				list();
				}
				break;
			case 11:
				{
				setState(240);
				map();
				}
				break;
			case 12:
				{
				setState(241);
				block();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(245);
						operator_infix();
						setState(246);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(249);
						whitespace_sp();
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Compilation_unitContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EOF() { return getToken(LentoParser.EOF, 0); }
		public List<Expression_separatorContext> expression_separator() {
			return getRuleContexts(Expression_separatorContext.class);
		}
		public Expression_separatorContext expression_separator(int i) {
			return getRuleContext(Expression_separatorContext.class,i);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expression(0);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(256);
					expression_separator();
					setState(257);
					expression(0);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << SEMI_COLON))) != 0)) {
				{
				setState(264);
				expression_separator();
				}
			}

			setState(267);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\3\6\3?\n\3\r\3"+
		"\16\3@\3\4\6\4D\n\4\r\4\16\4E\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\5\nV\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\7\16d\n\16\f\16\16\16g\13\16\5\16i\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\7\17q\n\17\f\17\16\17t\13\17\5\17v\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20~\n\20\f\20\16\20\u0081\13\20\5\20\u0083\n\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\7\21\u008b\n\21\f\21\16\21\u008e\13\21\5\21\u0090"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u009c\n\23"+
		"\f\23\16\23\u009f\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00a7\n\24"+
		"\f\24\16\24\u00aa\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00b3"+
		"\n\25\f\25\16\25\u00b6\13\25\5\25\u00b8\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\6\26\u00c2\n\26\r\26\16\26\u00c3\3\26\3\26\5\26\u00c8"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00cf\n\27\3\27\3\27\3\27\5\27\u00d4"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\5\32\u00db\n\32\3\32\3\32\5\32\u00df\n"+
		"\32\3\32\5\32\u00e2\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f5\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u00fd\n\33\f\33\16\33\u0100\13\33\3\34\3\34\3\34"+
		"\3\34\7\34\u0106\n\34\f\34\16\34\u0109\13\34\3\34\5\34\u010c\n\34\3\34"+
		"\3\34\3\34\2\3\64\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\6\4\2\3\4\6\6\4\2\3\3\6\6\4\2\4\4\6\6\3\2\f\r\2\u011c\29\3"+
		"\2\2\2\4>\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16M\3\2"+
		"\2\2\20O\3\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26Y\3\2\2\2\30[\3\2\2\2\32_\3"+
		"\2\2\2\34l\3\2\2\2\36y\3\2\2\2 \u0086\3\2\2\2\"\u0093\3\2\2\2$\u0097\3"+
		"\2\2\2&\u00a2\3\2\2\2(\u00ad\3\2\2\2*\u00c7\3\2\2\2,\u00c9\3\2\2\2.\u00d5"+
		"\3\2\2\2\60\u00d7\3\2\2\2\62\u00da\3\2\2\2\64\u00f4\3\2\2\2\66\u0101\3"+
		"\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=?"+
		"\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2BD\t\4\2\2"+
		"CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH\t\5\2\2H\t\3\2\2"+
		"\2IJ\7\7\2\2J\13\3\2\2\2KL\7\b\2\2L\r\3\2\2\2MN\7\t\2\2N\17\3\2\2\2OP"+
		"\7\n\2\2P\21\3\2\2\2QV\5\n\6\2RV\5\f\7\2SV\5\16\b\2TV\5\20\t\2UQ\3\2\2"+
		"\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\23\3\2\2\2WX\7\22\2\2X\25\3\2\2\2YZ"+
		"\7\23\2\2Z\27\3\2\2\2[\\\7\20\2\2\\]\5\4\3\2]^\5\b\5\2^\31\3\2\2\2_h\7"+
		"\24\2\2`e\5\64\33\2ab\7\33\2\2bd\5\64\33\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2"+
		"\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2h`\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\25"+
		"\2\2k\33\3\2\2\2lu\7\24\2\2mr\5\30\r\2no\7\33\2\2oq\5\30\r\2pn\3\2\2\2"+
		"qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2um\3\2\2\2uv\3\2\2\2"+
		"vw\3\2\2\2wx\7\25\2\2x\35\3\2\2\2y\u0082\7\26\2\2z\177\5\64\33\2{|\7\33"+
		"\2\2|~\5\64\33\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082z\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\27\2\2\u0085\37\3\2\2\2\u0086"+
		"\u008f\7\26\2\2\u0087\u008c\7\20\2\2\u0088\u0089\7\33\2\2\u0089\u008b"+
		"\7\20\2\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0087"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\27\2\2"+
		"\u0092!\3\2\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\34\2\2\u0095\u0096\5"+
		"\64\33\2\u0096#\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u009d\5\"\22\2\u0099"+
		"\u009a\7\33\2\2\u009a\u009c\5\"\22\2\u009b\u0099\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1%\3\2\2\2\u00a2\u00a3\7\24\2"+
		"\2\u00a3\u00a8\5\30\r\2\u00a4\u00a5\7\33\2\2\u00a5\u00a7\5\30\r\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\25\2\2\u00ac"+
		"\'\3\2\2\2\u00ad\u00b7\7\30\2\2\u00ae\u00b8\5\64\33\2\u00af\u00b0\5\64"+
		"\33\2\u00b0\u00b1\5\62\32\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba)\3\2\2\2\u00bb\u00bc\7\17\2"+
		"\2\u00bc\u00c8\5\32\16\2\u00bd\u00c1\7\17\2\2\u00be\u00bf\5\4\3\2\u00bf"+
		"\u00c0\5\64\33\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\5\62\32\2\u00c6\u00c8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7\u00bd\3"+
		"\2\2\2\u00c8+\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc"+
		"\7\17\2\2\u00cc\u00ce\5\34\17\2\u00cd\u00cf\5\4\3\2\u00ce\u00cd\3\2\2"+
		"\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0\u00d1\7\32\2\2\u00d1"+
		"\u00d4\5\64\33\2\u00d2\u00d4\5(\25\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2\3"+
		"\2\2\2\u00d4-\3\2\2\2\u00d5\u00d6\7\36\2\2\u00d6/\3\2\2\2\u00d7\u00d8"+
		"\7\36\2\2\u00d8\61\3\2\2\2\u00d9\u00db\5\4\3\2\u00da\u00d9\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00df\5\6\4\2\u00dd\u00df\7\35"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00e2\5\2\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\63\3\2\2"+
		"\2\u00e3\u00e4\b\33\1\2\u00e4\u00e5\5\2\2\2\u00e5\u00e6\5\64\33\20\u00e6"+
		"\u00f5\3\2\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\5\64\33\r\u00e9\u00f5"+
		"\3\2\2\2\u00ea\u00f5\5,\27\2\u00eb\u00f5\5*\26\2\u00ec\u00f5\5\b\5\2\u00ed"+
		"\u00f5\5\22\n\2\u00ee\u00f5\5\26\f\2\u00ef\u00f5\5\24\13\2\u00f0\u00f5"+
		"\5\32\16\2\u00f1\u00f5\5\36\20\2\u00f2\u00f5\5$\23\2\u00f3\u00f5\5(\25"+
		"\2\u00f4\u00e3\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00eb"+
		"\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4"+
		"\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7\f\16\2\2\u00f7"+
		"\u00f8\5.\30\2\u00f8\u00f9\5\64\33\17\u00f9\u00fd\3\2\2\2\u00fa\u00fb"+
		"\f\17\2\2\u00fb\u00fd\5\4\3\2\u00fc\u00f6\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\65"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0107\5\64\33\2\u0102\u0103\5\62\32"+
		"\2\u0103\u0104\5\64\33\2\u0104\u0106\3\2\2\2\u0105\u0102\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u010c\5\62\32\2\u010b\u010a\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\2\2\3\u010e\67\3\2\2"+
		"\2\36;@EUehru\177\u0082\u008c\u008f\u009d\u00a8\u00b4\u00b7\u00c3\u00c7"+
		"\u00ce\u00d3\u00da\u00de\u00e1\u00f4\u00fc\u00fe\u0107\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}