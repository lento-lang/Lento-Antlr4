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
		NUMBER_HEX=7, NUMBER_BINARY=8, IDENTIFIER=9, IDENTIFIER_NAMESPACED=10, 
		IDENTIFIER_IGNORE=11, ATOM=12, ESCAPED=13, SPRING=14, CHARACTER=15, LPAREN=16, 
		RPAREN=17, LBRACKET=18, RBRACKET=19, LBRACE=20, RBRACE=21, ASSIGN=22, 
		SEPARATOR_COMMA=23, SEPARATOR_DOT=24, COLON=25, SEMI_COLON=26, OPERATOR=27;
	public static final int
		RULE_whitespace_any = 0, RULE_whitespace_sp = 1, RULE_whitespace_nl = 2, 
		RULE_semi_colon = 3, RULE_atom = 4, RULE_type = 5, RULE_type_namespaced = 6, 
		RULE_identifier = 7, RULE_identifier_namespaced = 8, RULE_identifier_ignore = 9, 
		RULE_function_name = 10, RULE_function_name_namespaced = 11, RULE_operator_infix = 12, 
		RULE_operator_prefix = 13, RULE_integer = 14, RULE_floating_point = 15, 
		RULE_number_hex = 16, RULE_number_binary = 17, RULE_numerical = 18, RULE_string = 19, 
		RULE_character = 20, RULE_typed_identifier = 21, RULE_tuple = 22, RULE_tuple_type = 23, 
		RULE_list = 24, RULE_list_type = 25, RULE_map_element = 26, RULE_map = 27, 
		RULE_map_type = 28, RULE_block = 29, RULE_function_call = 30, RULE_function_declaration = 31, 
		RULE_variable_declaration = 32, RULE_variable_assignment = 33, RULE_variable_initialization = 34, 
		RULE_expression_separator = 35, RULE_expression = 36, RULE_compilation_unit = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"whitespace_any", "whitespace_sp", "whitespace_nl", "semi_colon", "atom", 
			"type", "type_namespaced", "identifier", "identifier_namespaced", "identifier_ignore", 
			"function_name", "function_name_namespaced", "operator_infix", "operator_prefix", 
			"integer", "floating_point", "number_hex", "number_binary", "numerical", 
			"string", "character", "typed_identifier", "tuple", "tuple_type", "list", 
			"list_type", "map_element", "map", "map_type", "block", "function_call", 
			"function_declaration", "variable_declaration", "variable_assignment", 
			"variable_initialization", "expression_separator", "expression", "compilation_unit"
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
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(76);
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
				setState(79); 
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
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(81);
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
				setState(84); 
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
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
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
				setState(89); 
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

	public static class Semi_colonContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(LentoParser.SEMI_COLON, 0); }
		public Semi_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_colon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitSemi_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semi_colonContext semi_colon() throws RecognitionException {
		Semi_colonContext _localctx = new Semi_colonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_semi_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SEMI_COLON);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(LentoParser.ATOM, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ATOM);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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

	public static class Type_namespacedContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
		public TerminalNode IDENTIFIER_NAMESPACED() { return getToken(LentoParser.IDENTIFIER_NAMESPACED, 0); }
		public Type_namespacedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_namespaced; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitType_namespaced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_namespacedContext type_namespaced() throws RecognitionException {
		Type_namespacedContext _localctx = new Type_namespacedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_namespaced);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==IDENTIFIER_NAMESPACED) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 14, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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

	public static class Identifier_namespacedContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
		public TerminalNode IDENTIFIER_NAMESPACED() { return getToken(LentoParser.IDENTIFIER_NAMESPACED, 0); }
		public Identifier_namespacedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_namespaced; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitIdentifier_namespaced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_namespacedContext identifier_namespaced() throws RecognitionException {
		Identifier_namespacedContext _localctx = new Identifier_namespacedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier_namespaced);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==IDENTIFIER_NAMESPACED) ) {
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

	public static class Identifier_ignoreContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_IGNORE() { return getToken(LentoParser.IDENTIFIER_IGNORE, 0); }
		public Identifier_ignoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_ignore; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitIdentifier_ignore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_ignoreContext identifier_ignore() throws RecognitionException {
		Identifier_ignoreContext _localctx = new Identifier_ignoreContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier_ignore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IDENTIFIER_IGNORE);
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class Function_name_namespacedContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LentoParser.IDENTIFIER, 0); }
		public TerminalNode IDENTIFIER_NAMESPACED() { return getToken(LentoParser.IDENTIFIER_NAMESPACED, 0); }
		public Function_name_namespacedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name_namespaced; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitFunction_name_namespaced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_name_namespacedContext function_name_namespaced() throws RecognitionException {
		Function_name_namespacedContext _localctx = new Function_name_namespacedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_name_namespaced);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==IDENTIFIER_NAMESPACED) ) {
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
		enterRule(_localctx, 24, RULE_operator_infix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 26, RULE_operator_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		enterRule(_localctx, 28, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 30, RULE_floating_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 32, RULE_number_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 34, RULE_number_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 36, RULE_numerical);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				integer();
				}
				break;
			case FLOATING_POINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				floating_point();
				}
				break;
			case NUMBER_HEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				number_hex();
				}
				break;
			case NUMBER_BINARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
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
		enterRule(_localctx, 38, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		enterRule(_localctx, 40, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		public Type_namespacedContext type_namespaced() {
			return getRuleContext(Type_namespacedContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_typed_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			type_namespaced();
			setState(132);
			whitespace_sp();
			setState(133);
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
		enterRule(_localctx, 44, RULE_tuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LPAREN);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(136);
				whitespace_sp();
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(139);
				expression(0);
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP || _la==COMMENT_MULTI) {
							{
							setState(140);
							whitespace_sp();
							}
						}

						setState(143);
						match(SEPARATOR_COMMA);
						setState(145);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(144);
							whitespace_sp();
							}
							break;
						}
						setState(147);
						expression(0);
						}
						} 
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(155);
				whitespace_sp();
				}
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

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LentoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LentoParser.RPAREN, 0); }
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
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
		enterRule(_localctx, 46, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LPAREN);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(161);
				whitespace_sp();
				}
				break;
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==IDENTIFIER_NAMESPACED) {
				{
				setState(164);
				typed_identifier();
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(165);
					whitespace_sp();
					}
					break;
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(168);
					match(SEPARATOR_COMMA);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP || _la==COMMENT_MULTI) {
						{
						setState(169);
						whitespace_sp();
						}
					}

					setState(172);
					typed_identifier();
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(173);
						whitespace_sp();
						}
						break;
					}
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(183);
				whitespace_sp();
				}
			}

			setState(186);
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
		enterRule(_localctx, 48, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LBRACKET);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << NUMBER_HEX) | (1L << NUMBER_BINARY) | (1L << IDENTIFIER) | (1L << IDENTIFIER_NAMESPACED) | (1L << IDENTIFIER_IGNORE) | (1L << ATOM) | (1L << SPRING) | (1L << CHARACTER) | (1L << LPAREN) | (1L << LBRACKET) | (1L << OPERATOR))) != 0)) {
				{
				setState(189);
				expression(0);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(190);
					match(SEPARATOR_COMMA);
					setState(191);
					expression(0);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(199);
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
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
		public List<Type_namespacedContext> type_namespaced() {
			return getRuleContexts(Type_namespacedContext.class);
		}
		public Type_namespacedContext type_namespaced(int i) {
			return getRuleContext(Type_namespacedContext.class,i);
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
		enterRule(_localctx, 50, RULE_list_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LBRACKET);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(202);
				whitespace_sp();
				}
				break;
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==IDENTIFIER_NAMESPACED) {
				{
				setState(205);
				type_namespaced();
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(206);
					whitespace_sp();
					}
					break;
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR_COMMA) {
					{
					{
					setState(209);
					match(SEPARATOR_COMMA);
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP || _la==COMMENT_MULTI) {
						{
						setState(210);
						whitespace_sp();
						}
					}

					setState(213);
					type_namespaced();
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(214);
						whitespace_sp();
						}
						break;
					}
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(224);
				whitespace_sp();
				}
			}

			setState(227);
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
		enterRule(_localctx, 52, RULE_map_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			identifier();
			setState(230);
			match(COLON);
			setState(231);
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
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
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
		enterRule(_localctx, 54, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(LPAREN);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(234);
				whitespace_sp();
				}
			}

			setState(237);
			map_element();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR_COMMA) {
				{
				{
				setState(238);
				match(SEPARATOR_COMMA);
				setState(239);
				map_element();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(245);
				whitespace_sp();
				}
			}

			setState(248);
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
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
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
		enterRule(_localctx, 56, RULE_map_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LPAREN);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(251);
				whitespace_sp();
				}
			}

			setState(254);
			typed_identifier();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR_COMMA) {
				{
				{
				setState(255);
				match(SEPARATOR_COMMA);
				setState(256);
				typed_identifier();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(262);
				whitespace_sp();
				}
			}

			setState(265);
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
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << NUMBER_HEX) | (1L << NUMBER_BINARY) | (1L << IDENTIFIER) | (1L << IDENTIFIER_NAMESPACED) | (1L << IDENTIFIER_IGNORE) | (1L << ATOM) | (1L << SPRING) | (1L << CHARACTER) | (1L << LPAREN) | (1L << LBRACKET) | (1L << OPERATOR))) != 0)) {
				{
				{
				setState(268);
				expression(0);
				setState(269);
				expression_separator();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
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
		public Function_name_namespacedContext function_name_namespaced() {
			return getRuleContext(Function_name_namespacedContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
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
		enterRule(_localctx, 60, RULE_function_call);
		try {
			int _alt;
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				function_name_namespaced();
				setState(279);
				tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				function_name_namespaced();
				setState(282);
				map();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				function_name_namespaced();
				setState(288); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(285);
						whitespace_sp();
						setState(286);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public Type_namespacedContext type_namespaced() {
			return getRuleContext(Type_namespacedContext.class,0);
		}
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LentoParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 62, RULE_function_declaration);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				type_namespaced();
				setState(295);
				whitespace_sp();
				setState(296);
				function_name();
				setState(297);
				tuple_type();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP || _la==COMMENT_MULTI) {
					{
					setState(298);
					whitespace_sp();
					}
				}

				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(301);
					match(ASSIGN);
					setState(302);
					expression(0);
					}
					}
					break;
				case LBRACE:
					{
					setState(303);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				type_namespaced();
				setState(307);
				whitespace_sp();
				setState(308);
				function_name();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SP || _la==COMMENT_MULTI) {
					{
					{
					setState(309);
					whitespace_sp();
					setState(310);
					expression(0);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					{
					setState(317);
					match(ASSIGN);
					setState(318);
					expression(0);
					}
					}
					break;
				case LBRACE:
					{
					setState(319);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Type_namespacedContext type_namespaced() {
			return getRuleContext(Type_namespacedContext.class,0);
		}
		public Whitespace_spContext whitespace_sp() {
			return getRuleContext(Whitespace_spContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			type_namespaced();
			setState(325);
			whitespace_sp();
			setState(326);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public Identifier_namespacedContext identifier_namespaced() {
			return getRuleContext(Identifier_namespacedContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LentoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			identifier_namespaced();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(329);
				whitespace_sp();
				}
			}

			setState(332);
			match(ASSIGN);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(333);
				whitespace_sp();
				}
				break;
			}
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SP:
			case NL:
			case COMMENT_MULTI:
			case INTEGER:
			case FLOATING_POINT:
			case NUMBER_HEX:
			case NUMBER_BINARY:
			case IDENTIFIER:
			case IDENTIFIER_NAMESPACED:
			case IDENTIFIER_IGNORE:
			case ATOM:
			case SPRING:
			case CHARACTER:
			case LPAREN:
			case LBRACKET:
			case OPERATOR:
				{
				setState(336);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(337);
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

	public static class Variable_initializationContext extends ParserRuleContext {
		public Type_namespacedContext type_namespaced() {
			return getRuleContext(Type_namespacedContext.class,0);
		}
		public List<Whitespace_spContext> whitespace_sp() {
			return getRuleContexts(Whitespace_spContext.class);
		}
		public Whitespace_spContext whitespace_sp(int i) {
			return getRuleContext(Whitespace_spContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LentoParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Variable_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initialization; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LentoParserVisitor ) return ((LentoParserVisitor<? extends T>)visitor).visitVariable_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initializationContext variable_initialization() throws RecognitionException {
		Variable_initializationContext _localctx = new Variable_initializationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variable_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			type_namespaced();
			setState(341);
			whitespace_sp();
			setState(342);
			identifier();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP || _la==COMMENT_MULTI) {
				{
				setState(343);
				whitespace_sp();
				}
			}

			setState(346);
			match(ASSIGN);
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(347);
				whitespace_sp();
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SP:
			case NL:
			case COMMENT_MULTI:
			case INTEGER:
			case FLOATING_POINT:
			case NUMBER_HEX:
			case NUMBER_BINARY:
			case IDENTIFIER:
			case IDENTIFIER_NAMESPACED:
			case IDENTIFIER_IGNORE:
			case ATOM:
			case SPRING:
			case CHARACTER:
			case LPAREN:
			case LBRACKET:
			case OPERATOR:
				{
				setState(350);
				expression(0);
				}
				break;
			case LBRACE:
				{
				setState(351);
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

	public static class Expression_separatorContext extends ParserRuleContext {
		public Whitespace_nlContext whitespace_nl() {
			return getRuleContext(Whitespace_nlContext.class,0);
		}
		public Semi_colonContext semi_colon() {
			return getRuleContext(Semi_colonContext.class,0);
		}
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
		enterRule(_localctx, 70, RULE_expression_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(354);
				whitespace_sp();
				}
				break;
			}
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
			case COMMENT_MULTI:
				{
				setState(357);
				whitespace_nl();
				}
				break;
			case SEMI_COLON:
				{
				setState(358);
				semi_colon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(361);
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
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Variable_initializationContext variable_initialization() {
			return getRuleContext(Variable_initializationContext.class,0);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Identifier_namespacedContext identifier_namespaced() {
			return getRuleContext(Identifier_namespacedContext.class,0);
		}
		public Identifier_ignoreContext identifier_ignore() {
			return getRuleContext(Identifier_ignoreContext.class,0);
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
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(365);
				whitespace_any();
				setState(366);
				expression(18);
				}
				break;
			case 2:
				{
				setState(368);
				operator_prefix();
				setState(369);
				expression(15);
				}
				break;
			case 3:
				{
				setState(371);
				function_declaration();
				}
				break;
			case 4:
				{
				setState(372);
				variable_declaration();
				}
				break;
			case 5:
				{
				setState(373);
				variable_initialization();
				}
				break;
			case 6:
				{
				setState(374);
				variable_assignment();
				}
				break;
			case 7:
				{
				setState(375);
				identifier_namespaced();
				}
				break;
			case 8:
				{
				setState(376);
				identifier_ignore();
				}
				break;
			case 9:
				{
				setState(377);
				numerical();
				}
				break;
			case 10:
				{
				setState(378);
				character();
				}
				break;
			case 11:
				{
				setState(379);
				string();
				}
				break;
			case 12:
				{
				setState(380);
				tuple();
				}
				break;
			case 13:
				{
				setState(381);
				list();
				}
				break;
			case 14:
				{
				setState(382);
				map();
				}
				break;
			case 15:
				{
				setState(383);
				atom();
				}
				break;
			case 16:
				{
				setState(384);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(393);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(388);
						operator_infix();
						setState(389);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(391);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(392);
						whitespace_sp();
						}
						break;
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public TerminalNode EOF() { return getToken(LentoParser.EOF, 0); }
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
		enterRule(_localctx, 74, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SP) | (1L << NL) | (1L << COMMENT_MULTI) | (1L << INTEGER) | (1L << FLOATING_POINT) | (1L << NUMBER_HEX) | (1L << NUMBER_BINARY) | (1L << IDENTIFIER) | (1L << IDENTIFIER_NAMESPACED) | (1L << IDENTIFIER_IGNORE) | (1L << ATOM) | (1L << SPRING) | (1L << CHARACTER) | (1L << LPAREN) | (1L << LBRACKET) | (1L << OPERATOR))) != 0)) {
				{
				{
				setState(398);
				expression(0);
				setState(399);
				expression_separator();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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
		case 36:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u019b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\6\3U\n\3\r\3\16\3V\3\4\6\4Z\n\4\r\4\16\4[\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0080\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u008c\n\30\3\30"+
		"\3\30\5\30\u0090\n\30\3\30\3\30\5\30\u0094\n\30\3\30\7\30\u0097\n\30\f"+
		"\30\16\30\u009a\13\30\5\30\u009c\n\30\3\30\5\30\u009f\n\30\3\30\3\30\3"+
		"\31\3\31\5\31\u00a5\n\31\3\31\3\31\5\31\u00a9\n\31\3\31\3\31\5\31\u00ad"+
		"\n\31\3\31\3\31\5\31\u00b1\n\31\7\31\u00b3\n\31\f\31\16\31\u00b6\13\31"+
		"\5\31\u00b8\n\31\3\31\5\31\u00bb\n\31\3\31\3\31\3\32\3\32\3\32\3\32\7"+
		"\32\u00c3\n\32\f\32\16\32\u00c6\13\32\5\32\u00c8\n\32\3\32\3\32\3\33\3"+
		"\33\5\33\u00ce\n\33\3\33\3\33\5\33\u00d2\n\33\3\33\3\33\5\33\u00d6\n\33"+
		"\3\33\3\33\5\33\u00da\n\33\7\33\u00dc\n\33\f\33\16\33\u00df\13\33\5\33"+
		"\u00e1\n\33\3\33\5\33\u00e4\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\5\35\u00ee\n\35\3\35\3\35\3\35\7\35\u00f3\n\35\f\35\16\35\u00f6\13"+
		"\35\3\35\5\35\u00f9\n\35\3\35\3\35\3\36\3\36\5\36\u00ff\n\36\3\36\3\36"+
		"\3\36\7\36\u0104\n\36\f\36\16\36\u0107\13\36\3\36\5\36\u010a\n\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\7\37\u0112\n\37\f\37\16\37\u0115\13\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u0123\n \r \16 \u0124\5 \u0127"+
		"\n \3!\3!\3!\3!\3!\5!\u012e\n!\3!\3!\3!\5!\u0133\n!\3!\3!\3!\3!\3!\3!"+
		"\7!\u013b\n!\f!\16!\u013e\13!\3!\3!\3!\5!\u0143\n!\5!\u0145\n!\3\"\3\""+
		"\3\"\3\"\3#\3#\5#\u014d\n#\3#\3#\5#\u0151\n#\3#\3#\5#\u0155\n#\3$\3$\3"+
		"$\3$\5$\u015b\n$\3$\3$\5$\u015f\n$\3$\3$\5$\u0163\n$\3%\5%\u0166\n%\3"+
		"%\3%\5%\u016a\n%\3%\5%\u016d\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0184\n&\3&\3&\3&\3&\3&\3&\7&\u018c\n&\f"+
		"&\16&\u018f\13&\3\'\3\'\3\'\7\'\u0194\n\'\f\'\16\'\u0197\13\'\3\'\3\'"+
		"\3\'\2\3J(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJL\2\6\4\2\3\4\6\6\4\2\3\3\6\6\4\2\4\4\6\6\3\2\13\f\2\u01ba\2"+
		"O\3\2\2\2\4T\3\2\2\2\6Y\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16c\3"+
		"\2\2\2\20e\3\2\2\2\22g\3\2\2\2\24i\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32"+
		"o\3\2\2\2\34q\3\2\2\2\36s\3\2\2\2 u\3\2\2\2\"w\3\2\2\2$y\3\2\2\2&\177"+
		"\3\2\2\2(\u0081\3\2\2\2*\u0083\3\2\2\2,\u0085\3\2\2\2.\u0089\3\2\2\2\60"+
		"\u00a2\3\2\2\2\62\u00be\3\2\2\2\64\u00cb\3\2\2\2\66\u00e7\3\2\2\28\u00eb"+
		"\3\2\2\2:\u00fc\3\2\2\2<\u010d\3\2\2\2>\u0126\3\2\2\2@\u0144\3\2\2\2B"+
		"\u0146\3\2\2\2D\u014a\3\2\2\2F\u0156\3\2\2\2H\u0165\3\2\2\2J\u0183\3\2"+
		"\2\2L\u0195\3\2\2\2NP\t\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"R\3\3\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\5\3\2\2"+
		"\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3\2\2\2]^\7"+
		"\34\2\2^\t\3\2\2\2_`\7\16\2\2`\13\3\2\2\2ab\7\13\2\2b\r\3\2\2\2cd\t\5"+
		"\2\2d\17\3\2\2\2ef\7\13\2\2f\21\3\2\2\2gh\t\5\2\2h\23\3\2\2\2ij\7\r\2"+
		"\2j\25\3\2\2\2kl\7\13\2\2l\27\3\2\2\2mn\t\5\2\2n\31\3\2\2\2op\7\35\2\2"+
		"p\33\3\2\2\2qr\7\35\2\2r\35\3\2\2\2st\7\7\2\2t\37\3\2\2\2uv\7\b\2\2v!"+
		"\3\2\2\2wx\7\t\2\2x#\3\2\2\2yz\7\n\2\2z%\3\2\2\2{\u0080\5\36\20\2|\u0080"+
		"\5 \21\2}\u0080\5\"\22\2~\u0080\5$\23\2\177{\3\2\2\2\177|\3\2\2\2\177"+
		"}\3\2\2\2\177~\3\2\2\2\u0080\'\3\2\2\2\u0081\u0082\7\20\2\2\u0082)\3\2"+
		"\2\2\u0083\u0084\7\21\2\2\u0084+\3\2\2\2\u0085\u0086\5\16\b\2\u0086\u0087"+
		"\5\4\3\2\u0087\u0088\5\20\t\2\u0088-\3\2\2\2\u0089\u008b\7\22\2\2\u008a"+
		"\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u009b\3\2"+
		"\2\2\u008d\u0098\5J&\2\u008e\u0090\5\4\3\2\u008f\u008e\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\31\2\2\u0092\u0094\5\4\3\2"+
		"\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\5J&\2\u0096\u008f\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u008d\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5\4\3\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\23"+
		"\2\2\u00a1/\3\2\2\2\u00a2\u00a4\7\22\2\2\u00a3\u00a5\5\4\3\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b7\3\2\2\2\u00a6\u00a8\5,\27\2\u00a7"+
		"\u00a9\5\4\3\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b4\3\2"+
		"\2\2\u00aa\u00ac\7\31\2\2\u00ab\u00ad\5\4\3\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\5,\27\2\u00af\u00b1\5\4"+
		"\3\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00aa\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00a6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5\4\3\2\u00ba\u00b9\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd"+
		"\61\3\2\2\2\u00be\u00c7\7\24\2\2\u00bf\u00c4\5J&\2\u00c0\u00c1\7\31\2"+
		"\2\u00c1\u00c3\5J&\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\25"+
		"\2\2\u00ca\63\3\2\2\2\u00cb\u00cd\7\24\2\2\u00cc\u00ce\5\4\3\2\u00cd\u00cc"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00e0\3\2\2\2\u00cf\u00d1\5\16\b\2"+
		"\u00d0\u00d2\5\4\3\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00dd"+
		"\3\2\2\2\u00d3\u00d5\7\31\2\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\5\16\b\2\u00d8\u00da"+
		"\5\4\3\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d3\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00cf\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\5\4\3\2\u00e3\u00e2\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\25\2\2\u00e6"+
		"\65\3\2\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9\7\33\2\2\u00e9\u00ea\5J&"+
		"\2\u00ea\67\3\2\2\2\u00eb\u00ed\7\22\2\2\u00ec\u00ee\5\4\3\2\u00ed\u00ec"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f4\5\66\34\2"+
		"\u00f0\u00f1\7\31\2\2\u00f1\u00f3\5\66\34\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\5\4\3\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\23\2\2\u00fb9\3\2\2\2"+
		"\u00fc\u00fe\7\22\2\2\u00fd\u00ff\5\4\3\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0105\5,\27\2\u0101\u0102\7\31\2\2"+
		"\u0102\u0104\5,\27\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010a\5\4\3\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\7\23\2\2\u010c;\3\2\2\2\u010d\u0113\7\26\2\2\u010e\u010f"+
		"\5J&\2\u010f\u0110\5H%\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\27\2\2\u0117=\3\2\2\2\u0118\u0119"+
		"\5\30\r\2\u0119\u011a\5.\30\2\u011a\u0127\3\2\2\2\u011b\u011c\5\30\r\2"+
		"\u011c\u011d\58\35\2\u011d\u0127\3\2\2\2\u011e\u0122\5\30\r\2\u011f\u0120"+
		"\5\4\3\2\u0120\u0121\5J&\2\u0121\u0123\3\2\2\2\u0122\u011f\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0118\3\2\2\2\u0126\u011b\3\2\2\2\u0126\u011e\3\2\2\2\u0127"+
		"?\3\2\2\2\u0128\u0129\5\16\b\2\u0129\u012a\5\4\3\2\u012a\u012b\5\26\f"+
		"\2\u012b\u012d\5\60\31\2\u012c\u012e\5\4\3\2\u012d\u012c\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0132\3\2\2\2\u012f\u0130\7\30\2\2\u0130\u0133\5"+
		"J&\2\u0131\u0133\5<\37\2\u0132\u012f\3\2\2\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0145\3\2\2\2\u0134\u0135\5\16\b\2\u0135\u0136\5\4\3\2\u0136\u013c\5"+
		"\26\f\2\u0137\u0138\5\4\3\2\u0138\u0139\5J&\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0137\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u0142\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\30\2\2\u0140"+
		"\u0143\5J&\2\u0141\u0143\5<\37\2\u0142\u013f\3\2\2\2\u0142\u0141\3\2\2"+
		"\2\u0143\u0145\3\2\2\2\u0144\u0128\3\2\2\2\u0144\u0134\3\2\2\2\u0145A"+
		"\3\2\2\2\u0146\u0147\5\16\b\2\u0147\u0148\5\4\3\2\u0148\u0149\5\20\t\2"+
		"\u0149C\3\2\2\2\u014a\u014c\5\22\n\2\u014b\u014d\5\4\3\2\u014c\u014b\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\30\2\2\u014f"+
		"\u0151\5\4\3\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0155\5J&\2\u0153\u0155\5<\37\2\u0154\u0152\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155E\3\2\2\2\u0156\u0157\5\16\b\2\u0157\u0158\5\4\3\2\u0158"+
		"\u015a\5\20\t\2\u0159\u015b\5\4\3\2\u015a\u0159\3\2\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\7\30\2\2\u015d\u015f\5\4\3\2\u015e"+
		"\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0163\5J"+
		"&\2\u0161\u0163\5<\37\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"G\3\2\2\2\u0164\u0166\5\4\3\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u016a\5\6\4\2\u0168\u016a\5\b\5\2\u0169\u0167"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u016d\5\2\2\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016dI\3\2\2\2\u016e\u016f\b&\1\2\u016f"+
		"\u0170\5\2\2\2\u0170\u0171\5J&\24\u0171\u0184\3\2\2\2\u0172\u0173\5\34"+
		"\17\2\u0173\u0174\5J&\21\u0174\u0184\3\2\2\2\u0175\u0184\5@!\2\u0176\u0184"+
		"\5B\"\2\u0177\u0184\5F$\2\u0178\u0184\5D#\2\u0179\u0184\5\22\n\2\u017a"+
		"\u0184\5\24\13\2\u017b\u0184\5&\24\2\u017c\u0184\5*\26\2\u017d\u0184\5"+
		"(\25\2\u017e\u0184\5.\30\2\u017f\u0184\5\62\32\2\u0180\u0184\58\35\2\u0181"+
		"\u0184\5\n\6\2\u0182\u0184\5> \2\u0183\u016e\3\2\2\2\u0183\u0172\3\2\2"+
		"\2\u0183\u0175\3\2\2\2\u0183\u0176\3\2\2\2\u0183\u0177\3\2\2\2\u0183\u0178"+
		"\3\2\2\2\u0183\u0179\3\2\2\2\u0183\u017a\3\2\2\2\u0183\u017b\3\2\2\2\u0183"+
		"\u017c\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u017f\3\2"+
		"\2\2\u0183\u0180\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184"+
		"\u018d\3\2\2\2\u0185\u0186\f\22\2\2\u0186\u0187\5\32\16\2\u0187\u0188"+
		"\5J&\23\u0188\u018c\3\2\2\2\u0189\u018a\f\23\2\2\u018a\u018c\5\4\3\2\u018b"+
		"\u0185\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018eK\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191"+
		"\5J&\2\u0191\u0192\5H%\2\u0192\u0194\3\2\2\2\u0193\u0190\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\2\2\3\u0199M\3\2\2\2\67QV[\177"+
		"\u008b\u008f\u0093\u0098\u009b\u009e\u00a4\u00a8\u00ac\u00b0\u00b4\u00b7"+
		"\u00ba\u00c4\u00c7\u00cd\u00d1\u00d5\u00d9\u00dd\u00e0\u00e3\u00ed\u00f4"+
		"\u00f8\u00fe\u0105\u0109\u0113\u0124\u0126\u012d\u0132\u013c\u0142\u0144"+
		"\u014c\u0150\u0154\u015a\u015e\u0162\u0165\u0169\u016c\u0183\u018b\u018d"+
		"\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}