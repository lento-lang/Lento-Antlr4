parser grammar LentoParser;

options { tokenVocab = LentoLexer; }
	
whitespace_any: (NL | SP | COMMENT_MULTI)+;
whitespace_sp: (SP | COMMENT_MULTI)+;
whitespace_nl: (NL | COMMENT_MULTI)+;
semi_colon: SEMI_COLON;

atom: ATOM;
type: IDENTIFIER;
type_namespaced
	: IDENTIFIER
	| IDENTIFIER_NAMESPACED
	;
identifier: IDENTIFIER;
identifier_namespaced
	: IDENTIFIER
	| IDENTIFIER_NAMESPACED
	;
identifier_ignore: IDENTIFIER_IGNORE;
function_name: IDENTIFIER;
function_name_namespaced
	: IDENTIFIER
	| IDENTIFIER_NAMESPACED
	;

operator_infix: OPERATOR;
operator_prefix: OPERATOR;

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

typed_identifier: type_namespaced whitespace_sp identifier;													/* int a */

tuple: LPAREN whitespace_sp? (expression (whitespace_sp? SEPARATOR_COMMA whitespace_sp? expression)*)? whitespace_sp? RPAREN;
tuple_type: LPAREN whitespace_sp? (typed_identifier whitespace_sp? (SEPARATOR_COMMA whitespace_sp? typed_identifier whitespace_sp?)*)? whitespace_sp? RPAREN;		/* Type for tuple */

list: LBRACKET (expression (SEPARATOR_COMMA expression)*)? RBRACKET;
list_type: LBRACKET whitespace_sp? (type_namespaced whitespace_sp? (SEPARATOR_COMMA whitespace_sp? type_namespaced whitespace_sp?)*)? whitespace_sp? RBRACKET;

map_element: identifier COLON expression;
map: LPAREN whitespace_sp? map_element (SEPARATOR_COMMA map_element)* whitespace_sp? RPAREN;								/* A map must have at least one element to ensure it's a map and not a tuple. Empty map can be created using Map.new() */
map_type: LPAREN whitespace_sp? typed_identifier (SEPARATOR_COMMA typed_identifier)* whitespace_sp? RPAREN;

block: LBRACE (expression expression_separator)* RBRACE;

function_call
	: function_name_namespaced tuple																	/* func(10, 2)	or	if(12 == 32, "Test") */
	| function_name_namespaced map																		/* Named arugments */
	| function_name_namespaced (whitespace_sp expression)+												/* func 10 2	or	if 12 == 32 "Test"	 */
	;
function_declaration
	: type_namespaced whitespace_sp function_name tuple_type whitespace_sp? ((ASSIGN expression) | block)
	| type_namespaced whitespace_sp function_name (whitespace_sp expression)* ((ASSIGN expression) | block)
	;
variable_declaration: type_namespaced whitespace_sp identifier;
variable_assignment: identifier_namespaced whitespace_sp? ASSIGN whitespace_sp? (expression | block);
variable_initialization: type_namespaced whitespace_sp identifier whitespace_sp? ASSIGN whitespace_sp? (expression | block);

expression_separator: whitespace_sp? (whitespace_nl | semi_colon) whitespace_any?;
expression
	: whitespace_any expression
	| expression whitespace_sp					/* Reason for whitespace_sp is because expression_separator matches newlines, hence only match spaces here. */
	| expression operator_infix expression 			/* Chained infix operators (order does not matter, precedence is accounted for in evaluator) */
	| operator_prefix expression						/* Prefix operators */
	| function_declaration
	| variable_declaration
	| variable_initialization
	| variable_assignment
	| identifier_namespaced
	| identifier_ignore
	| numerical
	| character
	| string
	| tuple															/* A single element tuple is a parenthesised expression */
	| list
	| map
	| atom
	| function_call
	;

compilation_unit: (expression expression_separator)* EOF;