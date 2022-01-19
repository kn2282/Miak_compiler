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

instructionChain  :  instr+=instruction (ENDL+ instr+=instruction )* ENDL*;

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

Float : (NonZeroDigit Digit* | '0') '.' (NonZeroDigit Digit* | '0')?;

functionName : VariableName;

variableName: VariableName;

variableRef  :
TopScopeModifier variableName  #TopScopeVar
|HigherScopeModifier variableName   #HigherScopeVar
|variableName   #SameScopeVar
;

VariableName: (('a'..'z') |'_') (('a'..'z') | ('A'..'Z') | '_' | '0'..'9')* ;



variable  :  Minus? variableRef ;


constant : Minus? (Integer | Float);

//WhiteSpace:
// ' '+
//-> skip
//;
SPACE: ' '+
-> skip
;

ENDL:  '\r'? '\n'
;

COMMENT: '//' (' '..'~' | '\t')* ENDL
-> skip
;

AND: ('AND' | '&');
OR: ('OR' | '|');
TRUE: ('TRUE' | 'true');
FALSE:  ('FALSE' | 'false');
RECTANGLE: ('RECTANGLE');
CIRCLE: 'CIRCLE';
LINE: 'LINE';
BEGIN: 'BEGIN';
END: 'END';
IF: ('IF' | 'if' | '?');
ELSE : ('!'|'ELSE');
THEN: 'THEN';
WHILE: 'WHILE';
DEF: 'DEF';
RGB: ('RGB'|'rgb');
DRAW:'DRAW';
BLOCK: 'BLOCK';
FILL: 'FILL';
AssignOperator: '=';
TopScopeModifier: '^^';
HigherScopeModifier: '^';
Minus: '-';
Plus: '+';
Mult: '*';
Divide: '/';
ROTATED: 'ROTATED';

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

 drawInstruction  : DRAW  figure  color FILL? rotation?;
    rotation: ROTATED expression;
 variableOperation  :  variableRef AssignOperator expression ;

ColorName: 'RED' | 'BLUE' | 'YELLOW' | 'GREEN' | 'WHITE' | 'BLACK';


