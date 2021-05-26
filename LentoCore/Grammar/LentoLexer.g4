lexer grammar LentoLexer;

/*
	Similar grammar:
		-	https://github.com/antlr/grammars-v4/blob/master/csharp/CSharpLexer.g4
		-	https://github.com/antlr/grammars-v4/blob/master/csharp/CSharpParser.g4
		-	https://github.com/antlr/grammars-v4/blob/master/python/python3/Python3Lexer.g4
*/

channels { COMMENTS }

SP: (' ' | '\t')+;
NL: ('\r' | '\n' | '\r\n')+;

COMMENT_SINGLE: '//' (~[\r\n])* -> channel(COMMENTS);
COMMENT_MULTI: '/*' .*? '*/' -> channel(COMMENTS);

fragment LETTER: [a-z] | [A-Z];
fragment DIGIT: [0-9];
fragment DIGIT_HEX: DIGIT | [A-F] | [a-f];
fragment DIGIT_BINARY: '0' | '1';
fragment DECIMAL_POINT: '.';

fragment NUMBER_PREFIX_HEX: '0x';
fragment NUMBER_PREFIX_BINARY: '0b';

INTEGER: DIGIT+;																			/* Negative numbers are not supported by lexer, but '-' is implemented as a unary negation function */
FLOATING_POINT: INTEGER? DECIMAL_POINT DIGIT+;
NUMBER_HEX: NUMBER_PREFIX_HEX DIGIT_HEX+;
NUMBER_BINARY: NUMBER_PREFIX_BINARY DIGIT_BINARY+;

IDENTIFIER: LETTER+ (DIGIT | LETTER | '_')*;
IDENTIFIER_NAMESPACED: IDENTIFIER (SEPARATOR_DOT IDENTIFIER)+; 										/* var, a, b or System.Console */
IDENTIFIER_IGNORE: '_' DIGIT* IDENTIFIER?;
ATOM: ':' IDENTIFIER;

ESCAPED
	: '\\u' DIGIT_HEX DIGIT_HEX DIGIT_HEX DIGIT_HEX
	| '\\"'		/* \" */
	| '\\\''	/* \' */
	| '\\\\'	/* \\ */
	| '\\' .
	; 
SPRING: '"' (ESCAPED | ~'"')* '"';
CHARACTER: '\'' (ESCAPED | ~'\'') '\'';							/* Must be validated in evaluator that it contains only one character, Todo: validate in lexer*/

LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
ASSIGN: '=';
SEPARATOR_COMMA: ',';
SEPARATOR_DOT: '.';
COLON: ':';
SEMI_COLON: ';';


OPERATOR								/* NOT: SEPARATOR_COMMA or EXPRESSION_SEPARATOR */
	: (ASSIGN
	| COLON
	| '*' 
	| '/'
	| '+'
	| '-'
	| '!'
	| '&'
	| '$'
	| '|'
	| '<'
	| '>'
	| '^'
	| '%'
	| '#'
	| '?'
	| '~'
	| '@'
	)+;