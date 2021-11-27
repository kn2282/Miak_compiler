grammar CanvasGrammar;
options {}

// lexer only
@actionName {...}

program: instructionChain EOF;

instruction  :
     loop
	| function
	| condition
	| drawInstruction
	| variableOperation
	;

instructionChain  :  (instruction NEW_LINE)+ ;

fragment
NonZeroDigit : [1-9];

fragment
HexDigit :   [0-9a-fA-F];

fragment
HexPrefix : '#'
|'0'[xX];

fragment
Digit   : [0-9];


HexColor : HexPrefix HexDigit  HexDigit  HexDigit  HexDigit  HexDigit  HexDigit;

fragment
Integer  :  NonZeroDigit Digit* ;

//fragment
variableRef  : VariableName;

 VariableName: (('a'..'z') |'_') (('a'..'z') | ('A'..'Z') | '_' | '0'..'9')* ;



variable  :  ( VariableRef) ws ;


Constant : Integer;

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
IF: ('IF' | 'if' | '?')SPACE+;
ELSE : '!'SPACE+;
THEN: 'THEN'SPACE+;
WHILE: 'WHILE'SPACE+;
DEF: 'DEF'SPACE+;
RGB: ('RGB'|'rgb');
DRAW:'DRAW'SPACE*;
AssignOperator: '=';

ArithmeticOperator: '+' | '-' | '*' | '/';

ComprehensionOperator: '==' | '<' | '<=' | '>' | '>=' | '~';

 condition  : IF  bool ':' NEW_LINE
 instructionChain
(ELSE
 instructionChain )?
END ;

function  : DEF  Name
 instructionChain
END DEF ;

loop : WHILE bool NEW_LINE
 instructionChain
END ;

color  :
    ColorName   #ColorName
	|RGB '(' expression  ',' expression  ',' expression ')'   #ColorRGB
	|HexColor #ColorHex
	;

expression :
 | (halfExpression expressionSuffix)
 ;

halfExpression:
    variableRef #VariableExpression
 | '(' expression ')' #BracketExpression
 | Constant #ConstantExpression
 ;

expressionSuffix:
ArithmeticOperator expression
|
;

bool :
    boolSrc
    | (boolSrc AND bool)
    | (boolSrc OR bool)
	;

boolSrc :
    ((expression ComprehensionOperator expression)
    | TRUE
    | FALSE) ws
    ;

figure :
    (RECTANGLE '(' expression ',' expression ','  expression ',' expression ')')    #Rectangle
	| (CIRCLE '(' expression ',' expression ',' expression ')') #Circle
	| (LINE '(' expression  ',' expression  ',' expression  ',' expression ')') #Line
	;

 drawInstruction  : DRAW  figure SPACE+  color ;

 variableOperation  :  variableRef AssignOperator expression ;

ColorName: 'RED' | 'BLUE' | 'YELLOW' | 'GREEN' | 'WHITE' | 'BLACK';


