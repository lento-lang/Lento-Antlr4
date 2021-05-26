parser grammar LentoParser;

options { tokenVocab = LentoLexer; }
	
whitespace_any: (NL | SP | COMMENT_MULTI)+;
whitespace_sp: (SP | COMMENT_MULTI)+;
whitespace_nl: (NL | COMMENT_MULTI)+;

atom: ATOM;
type: TYPE;
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

typed_identifier: type whitespace_sp identifier;													/* int a */

tuple: LPAREN whitespace_sp? (expression (whitespace_sp? SEPARATOR_COMMA whitespace_sp? expression)*)? whitespace_sp? RPAREN;
tuple_type: LPAREN whitespace_sp? (typed_identifier whitespace_sp? (SEPARATOR_COMMA whitespace_sp? typed_identifier whitespace_sp?)*)? whitespace_sp? RPAREN;		/* Type for tuple */

list: LBRACKET (expression (SEPARATOR_COMMA expression)*)? RBRACKET;
list_type: LBRACKET whitespace_sp? (type whitespace_sp? (SEPARATOR_COMMA whitespace_sp? type whitespace_sp?)*)? whitespace_sp? RBRACKET;

map_element: identifier COLON expression;
map: LPAREN whitespace_sp? map_element (SEPARATOR_COMMA map_element)* whitespace_sp? RPAREN;								/* A map must have at least one element to ensure it's a map and not a tuple. Empty map can be created using Map.new() */
map_type: LPAREN whitespace_sp? typed_identifier (SEPARATOR_COMMA typed_identifier)* whitespace_sp? RPAREN;

statements: expression (expression_separator expression)* expression_separator?;
block: LBRACE statements RBRACE;

function_call
	: FUNCTION_NAME tuple																	/* func(10, 2)	or	if(12 == 32, "Test") */
	| FUNCTION_NAME map																		/* Named arugments */
	| FUNCTION_NAME (whitespace_sp expression)+												/* func 10 2	or	if 12 == 32 "Test"	 */
	;
function_declaration
	: type whitespace_sp FUNCTION_NAME tuple_type whitespace_sp? (ASSIGN whitespace_sp? expression | block)
	;
variable_assignment: type whitespace_sp identifier whitespace_sp? ASSIGN whitespace_sp? (expression | block);

operator_infix: OPERATOR_INFIX;
operator_prefix: OPERATOR_PREFIX;

expression_separator: whitespace_sp? (whitespace_nl | SEMI_COLON) whitespace_any?;
expression
	: whitespace_any expression
	| expression whitespace_sp					/* Reason for whitespace_sp is because expression_separator matches newlines, hence only match spaces here. */
	| expression operator_infix expression 			/* Chained infix operators (order does not matter, precedence is accounted for in evaluator) */
	| operator_prefix expression						/* Prefix operators */
	| function_declaration
	| variable_assignment
	| function_call
	/* | identifier */
	| numerical
	| character
	| string
	| tuple															/* A single element tuple is a parenthesised expression */
	| list
	| map
	| atom
	| block
	;

compilation_unit: statements EOF;