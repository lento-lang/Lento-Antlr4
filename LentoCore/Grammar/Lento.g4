grammar Lento;

SPACE: (' ' | '\t');
WS: (SPACE | [\r\n])+ -> skip;

IDENTIFIER: [a-zA-Z]+;
TYPE: IDENTIFIER;

NUMERICAL

OPERATOR: ~([0-9] | '(' | ')' | ',')+;

tuple: '(' expression (',' expression)* ')';
map_element: TYPE SPACE IDENTIFIER ':' expression;
map: '(' map_element (',' map_element)* ')';

block: '{' (expression ('\n' | ';'))* '}';
	
function_call: IDENTIFIER tuple;
function_declaration
	: IDENTIFIER tuple '=' (block | expression)
	;

expression
	: IDENTIFIER
	| function_call	
	| function_declaration
	| expression OPERATOR expression
	;

root: expression* EOF;