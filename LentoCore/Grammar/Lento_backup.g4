grammar Lento;

/*
	Similar grammar:
		-	https://github.com/antlr/grammars-v4/blob/master/csharp/CSharpLexer.g4
		-	https://github.com/antlr/grammars-v4/blob/master/csharp/CSharpParser.g4
*/

channels { COMMENTS }

NL: ('\r' | '\n')+;		/* Newlines */
ST: (' ' | '\t')+;		/* Spaces and Tabs */
WS: (NL | ST) -> channel(HIDDEN);				/* Any Whitespace */

EXPRESSION_SEPARATOR: NL | ';';
COMMENT_SINGLE: '//' ~NL* -> channel(COMMENTS);
COMMENT_MULTI: '/*' .*? '*/' -> channel(COMMENTS);
comment
	: COMMENT_SINGLE
	| COMMENT_MULTI
	;

IDENTIFIER_SPECIAL: '$' | '#' | '&' | '%';
IDENTIFIER: ([a-zA-Z] | IDENTIFIER_SPECIAL)+ ([0-9a-zA-Z] | IDENTIFIER_SPECIAL | '_')*;
IGNORE_IDENTIFIER: '_' IDENTIFIER?;
ATOM: ':' IDENTIFIER+;
FUNCTION_NAME: IDENTIFIER;
TYPE: [a-zA-Z]+ ([0-9a-zA-Z] | '_')*;

OPERATOR: ~([0-9] | '(' | ')' | ',')+;


DIGIT: [0-9];
DIGIT_HEX: DIGIT | [A-F] | [a-f];
DIGIT_BINARY: '0' | '1';

integer: '-'? DIGIT+;
floating_point: integer? '.' DIGIT+;
number_hex: '0x' DIGIT_HEX+;
number_binary: '0b' DIGIT_BINARY+;

numerical
	: integer
	| floating_point
	| number_hex
	| number_binary
	;
	
string: '"' (~('"') | '\\"')* '"';
char: '\'' (~('\'') | '\'')+ '\'';											/* Must be validated in parser or lexer that it contains only one character */

tuple: '(' (expression (',' expression)*)? ')';
tuple_type_element: TYPE WS IDENTIFIER;
tuple_type: '(' (tuple_type_element (',' tuple_type_element)*)? ')';		/* Type for tuple */

list: '[' (expression (',' expression)*)? ']';
list_type: '[' (TYPE (',' TYPE)*)? ']';

map_element: IDENTIFIER ':' expression;
map: '(' map_element (',' map_element)* ')';								/* A map must have at least one element to ensure it's a map and not a tuple. Empty map can be created using Map.new() */
map_type_element: TYPE WS IDENTIFIER;
map_type: '(' map_type_element (',' map_type_element)* ')';

block: '{' (expression EXPRESSION_SEPARATOR)* '}';

function_call
	: FUNCTION_NAME tuple													/* func(10, 2)	or	if(12 == 32, "Test") */
	| FUNCTION_NAME (WS expression)+ EXPRESSION_SEPARATOR					/* func 10 2	or	if 12 == 32 "Test"	 */
	;
function_declaration
	: FUNCTION_NAME tuple_type '=' (block | expression)
	;

expression
	: IDENTIFIER
	| IGNORE_IDENTIFIER
	| numerical
	| block
	| function_call
	| function_declaration
	| expression OPERATOR expression
	| tuple
	| list
	| map
	;

compilation_unit: expression* EOF;