grammar CanvasGrammar;
options {}

// lexer only
@actionName {...}

program: instructionChain EOF;

instruction  :
     loop
	| functionDefinition
	| condition
	| drawInstruction
	| variableOperation
	| functionCall
	| block ENDL?
	;

block:BLOCK ENDL
instructionChain
END BLOCK;

instructionChain  :  instr+=instruction (ENDL+ instr+=instruction )* ENDL+;

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

Integer  :  NonZeroDigit Digit*|
'0';

functionName : VariableName;

variableName: VariableName;

variableRef  :
TopScopeModifier variableName  #TopScopeVar
|HigherScopeModifier variableName   #HigherScopeVar
|variableName   #SameScopeVar
;

VariableName: (('a'..'z') |'_') (('a'..'z') | ('A'..'Z') | '_' | '0'..'9')* ;



variable  :  Minus? variableRef ;


constant : Minus? Integer;

//WhiteSpace:
// ' '+
//-> skip
//;
SPACE: ' '+
-> skip
;

ENDL:  '\r'? '\n'
;

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
ELSE : ('!'|'ELSE')SPACE+;
THEN: 'THEN'SPACE?;
WHILE: 'WHILE'SPACE?;
DEF: 'DEF'SPACE?;
RGB: ('RGB'|'rgb');
DRAW:'DRAW'SPACE*;
BLOCK: 'BLOCK';
AssignOperator: '=';
TopScopeModifier: '^^';
HigherScopeModifier: '^';
Minus: '-';
Plus: '+';
Mult: '*';
Divide: '/';

nonPriorityArithmeticOperator: Plus | Minus;


priorityArithmeticOperator: Mult | Divide;

ComprehensionOperator: '==' | '<' | '<=' | '>' | '>=' | '~';

functionCall : functionName functionCallArguments;

functionCallArguments:
'(' (arg+=expression)? (',' arg+=expression)* ')'
;

arguments:
'(' arg+=variableRef (',' arg+=variableRef)* ')'
;
 condition  : IF  bool ':' ENDL
 instructionChain
(ELSE
 instructionChain )?
END ;

functionDefinition  : DEF  functionName arguments ENDL
instructionChain
END DEF ;

loop : WHILE bool ':' ENDL
 instructionChain
END ;

color  :
    ColorName   #ColorName
	|RGB '(' expression  ',' expression  ',' expression ')'   #ColorRGB
	|HexColor #ColorHex
	;

expression:
 (priorityExpression expressionSuffix)
 ;

priorityExpression:
 halfExpression priorityExpressionSuffix
;

halfExpression:
    variable #VariableExpression
 | '(' expression ')' #BracketExpression
 | constant #ConstantExpression
 ;

priorityExpressionSuffix:
 priorityArithmeticOperator priorityExpression
 |
;


expressionSuffix:
nonPriorityArithmeticOperator expression
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
    | FALSE)
    ;

figure :
    (RECTANGLE '(' expression ',' expression ','  expression ',' expression ')')    #Rectangle
	| (CIRCLE '(' expression ',' expression ',' expression ')') #Circle
	| (LINE '(' expression  ',' expression  ',' expression  ',' expression ')') #Line
	;

 drawInstruction  : DRAW  figure  color ;

 variableOperation  :  variableRef AssignOperator expression ;

ColorName: 'RED' | 'BLUE' | 'YELLOW' | 'GREEN' | 'WHITE' | 'BLACK';


