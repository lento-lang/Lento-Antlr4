parser grammar LentoParser;

options { tokenVocab = LentoLexer; }
	
whitespace_any: (NL | SP | COMMENT_MULTI)+;
whitespace_sp: (SP | COMMENT_MULTI)+;
whitespace_nl: (NL | COMMENT_MULTI)+;

identifier
	: IDENTIFIER
	| IGNORE_IDENTIFIER
	;

integer: INTEGER;
floating_point: FLOATING_POINT;
number_hex: NUMBER_HEX;
number_binary: NUMBER_BINARY;

numerical
	: integer
	| floating_point
	| number_hex
	| number_binary
	;

string: SPRING;
character: CHARACTER;

typed_identifier: TYPE whitespace_sp identifier;													/* int a */

tuple: LPAREN (expression (SEPARATOR_COMMA expression)*)? RPAREN;
tuple_type: LPAREN (typed_identifier (SEPARATOR_COMMA typed_identifier)*)? RPAREN;		/* Type for tuple */

list: LBRACKET (expression (SEPARATOR_COMMA expression)*)? RBRACKET;
list_type: LBRACKET (TYPE (SEPARATOR_COMMA TYPE)*)? RBRACKET;

map_element: identifier COLON expression;
map: LPAREN map_element (SEPARATOR_COMMA map_element)* RPAREN;								/* A map must have at least one element to ensure it's a map and not a tuple. Empty map can be created using Map.new() */
map_type: LPAREN typed_identifier (SEPARATOR_COMMA typed_identifier)* RPAREN;

block: LBRACE (expression | (expression expression_separator)*) RBRACE;

function_call
	: FUNCTION_NAME tuple																	/* func(10, 2)	or	if(12 == 32, "Test") */
	| FUNCTION_NAME (whitespace_sp expression)+ expression_separator									/* func 10 2	or	if 12 == 32 "Test"	 */
	;
function_declaration
	: TYPE whitespace_sp FUNCTION_NAME tuple_type whitespace_sp? (ASSIGN expression | block)
	;

operator_infix: OPERATOR_INFIX;
operator_prefix: OPERATOR_PREFIX;

expression_separator: whitespace_sp? (whitespace_nl | SEMI_COLON) whitespace_any?;
expression
	: whitespace_any expression
	| expression whitespace_sp					/* Reason for whitespace_sp is because expression_separator matches newlines, hence only match spaces here. */
	| expression operator_infix expression 			/* Chained infix operators (order does not matter, precedence is accounted for in evaluator) */
	| operator_prefix expression						/* Prefix operators */
	| function_declaration
	| function_call
	| identifier
	| numerical
	| character
	| string
	| tuple															/* A single element tuple is a parenthesised expression */
	| list
	| map
	| block
	;

compilation_unit: expression (expression_separator expression)* expression_separator? EOF;