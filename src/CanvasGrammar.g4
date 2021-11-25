grammar CanvasGrammar;
options {}

// lexer only
@actionName {...}

program: instruction_chain EOF;

instruction  :
     loop
	| function
	| condition
	| draw_instruction
	| arithmetic_instruction
	;

instruction_chain  :  (instruction NEW_LINE)+ ;

ws: SPACE*;
SPACE: (' ');
NEW_LINE: '\n';


AND: ('AND' | '&')SPACE+;
OR: ('OR' | '|')SPACE+;
TRUE: ('TRUE' | 'true')SPACE+;
FALSE:  ('FALSE' | 'false')SPACE+;
RECTANGLE: ('RECTANGLE')SPACE*;
CIRCLE: 'CIRCLE'SPACE*;
LINE: 'LINE'SPACE*;
BEGIN: 'BEGIN'SPACE+;
END: 'END'SPACE*;
IF: ('IF' | 'if')SPACE+;
THEN: 'THEN'SPACE+;
WHILE: 'WHILE'SPACE+;
DEF: 'DEF'SPACE+;
RGB: 'RGB'SPACE+;
DRAW:'DRAW'SPACE*;
AssignOperator: '='SPACE*;



AritmeticOperator: '+' | '-' | '*' | '/';

ComprehensionOperator: '==' | '<' | '<=' | '>' | '>=' | '~';

 condition  : IF  bool ':' NEW_LINE
 instruction_chain 
('!'
 instruction_chain )?
END ;

function  : DEF  Name
 instruction_chain 
END DEF ;

loop : WHILE bool NEW_LINE
 instruction_chain
END ;

color  :
    Color_name
	|(RGB '(' expression  ',' expression  ',' expression ')')
	|('#' Hex  Hex  Hex  Hex  Hex  Hex)
	;

expression :   variable | '(' expression ')' | (variable AritmeticOperator expression);

bool :
    bool_src
    | (bool_src AND bool)
    | (bool_src OR bool)
	;

bool_src :
    ((expression ComprehensionOperator expression)
    | TRUE
    | FALSE) ws
    ;

figure :
    (RECTANGLE '(' expression ',' expression ','  expression ',' expression ')')
	| (CIRCLE '(' expression ',' expression ',' expression ')')
	| (LINE '(' expression  ',' expression  ',' expression  ',' expression ')')
	;

 draw_instruction  : DRAW  figure SPACE+  color ;

 arithmetic_instruction  :  Variable_ref AssignOperator expression ;

Hex  : (('0'..'9') | ('A'..'F')) ;

Number  :  ('0'..'9') | (('1'..'9')('0'..'9')+) ;

Variable_ref  :  (('a'..'z') | ('A'..'Z') | '_') (('a'..'z') | ('A'..'Z') | '_' | '0'..'9')* ;



variable  :  (Number | Variable_ref) ws ;

Color_name: 'RED' | 'BLUE' | 'YELLOW' | 'GREEN' | 'WHITE' | 'BLACK';

Name : Variable_ref;


