grammar Benefit;
@header {
package com.affaince.benefits.grammar;
}

// Scheme structure
scheme
    : givenUnit  computeUnit    eligibilityUnit    payUnit  EOF
    ;


givenUnit
    :   GIVEN   givenBody
    ;

givenBody
    :   variableDeclarationStatement*
    ;


computeUnit
    :   COMPUTE computeBlock
    ;

computeBlock
    :   block
    ;


eligibilityUnit
   :    ELIGIBLEWHEN block
   ;

payUnit
   :  PAY benefitPayComputeBlock  (payBefore | payAfter)  separatedInstalmentDeliverySequencesExpression SEMI
   //PAY variableName (payBefore | payAfter) expressionList payMultiplier variableName proportionExpression SEMI
   ;

benefitPayComputeBlock
    :   computeBlock
    ;

separatedInstalmentDeliverySequencesExpression
    :  expression payMultiplier variableName(COMMA expression payMultiplier variableName)* proportionExpression
    ;

payBefore
    :   BEFORE
    ;

payAfter
    :   AFTER
    ;

payMultiplier
    :   OF
    ;
variableDeclarationStatement
    :   variableDeclaratorId SEMI
    |   variableDeclaratorId ASSIGN variableInitializer SEMI?
    |   variableDeclaratorId ASINPUT SEMI
    ;
variableDeclaratorId
    :   variableName (LBRACK RBRACK)?    //* is removed as we do not intend to support multidimensional arrays as of now
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   LBRACE variableInitializer (COMMA variableInitializer)* RBRACE
    ;


conditionalExpression
    :   conditionalOrExpression
    |   conditionalOrExpression QUESTIONMARK expression COLON conditionalExpression
    ;

conditionalOrExpression
    :   conditionalAndExpression
    |   conditionalOrExpression connectorOr conditionalAndExpression
    ;

conditionalAndExpression
    :   relationalExpression
    |   conditionalAndExpression connectorAnd relationalExpression
    ;
relationalOp
    :   GT
    |   GE
    |   LE
    |   LT
    |   EQUAL
    |   NOTEQUAL
    ;
relationalExpression
    :   additiveExpression
    |   relationalExpression EQUAL additiveExpression
    |   relationalExpression NOTEQUAL additiveExpression
    |   relationalExpression LT additiveExpression
    |   relationalExpression LE additiveExpression
    |   relationalExpression GT additiveExpression
    |   relationalExpression GE additiveExpression
    |   iterativeStatement EQUAL additiveExpression
    |   iterativeStatement NOTEQUAL additiveExpression
    |   iterativeStatement LT additiveExpression
    |   iterativeStatement LE additiveExpression
    |   iterativeStatement GT additiveExpression
    |   iterativeStatement GE additiveExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression ADD multiplicativeExpression
    |   additiveExpression SUB multiplicativeExpression
    |   iterativeAggregationExpression
    ;

multiplicativeExpression
    :   unaryExpression
    |   multiplicativeExpression MUL unaryExpression
    |   multiplicativeExpression DIV unaryExpression
    |   multiplicativeExpression MOD unaryExpression
    ;

unaryExpression
    :   ADD unaryExpression
    |   SUB unaryExpression
    |   primary
    ;

primary
    :   parExpression
    |   literal
    |   variableName
    ;

variableName
    :   IDENTIFIER
    ;
connectorAnd
    :   ANDSTR
    ;
connectorOr
    :   ORSTR
    ;
parExpression
    :   LPAREN expression RPAREN
    ;


nonDefaultProportionExpression
    :    NUMBER COLON NUMBER (COLON NUMBER)*
    ;

proportionExpression
    :   IN  (DEFAULT | nonDefaultProportionExpression)   PROPORTION
    ;

expressionList
    :   expression (COMMA expression)*
    ;

expression
    :   conditionalExpression (ASSIGN expression)?
    ;

literal
    :   NUMBER
    |   CHARACTERLITERAL
    |   STRINGLITERAL
    |   BOOLEANLITERAL
    |   NULL
    ;
iterativeStatement
    :   EACH expression
    ;

iterativeAggregationExpression
    :   SUMOF EACH (variableDeclarationStatement | expression)
    ;

statement
     :  statementExpression (SEMI)?                       //block
     //|  statementExpression (SEMI)?
     ;

statementExpression
    :   expression
    ;
block
    :  blockStatement*
    ;


blockStatement
    :   statement
    |   variableDeclarationStatement
    ;


//end of expressions
//Lexer
GIVEN
    :   'given'
    ;

ASINPUT
    :   ' as input'
    ;

COMPUTE
    :   'compute'
    ;

EACH
    :   'each'
    ;

SUMOF
    :   'sumOf'
    ;

ELIGIBLEWHEN
    :   'eligibleWhen'
    ;

PAY
    :   'pay'
    ;

BEFORE
    :   'before'
    ;

AFTER
    :   'after'
    ;

IN
    :   'in'
    ;

PROPORTION
    :   'proportion'
    ;

DEFAULT
    :   'default'
    ;

OF
    :   'of'
    ;

ANDSTR
    :   'and'
    |   '&&'
    ;

ORSTR
    :   'or'
    |   '||'
    ;

NULL
	:	'null'
	;

//end -keywords



NUMBER
    :   SIGN? ('.' [0-9]+ | [0-9]+ ('.' [0-9]*)? ) ;


//now define all operators to be used
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
COMMA : ',';
SEMI : ';';
COLON : ':' ;
ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
QUESTIONMARK  : '?' ;

//end-operators


fragment
SIGN
	:	[+\-]
	;
BOOLEANLITERAL
	:	'true'
	|	'false'
	;
CHARACTERLITERAL
	:	'\'' SINGLECHARACTER '\''
	|	'\'' ESCAPESEQUENCE '\''
	;

fragment
SINGLECHARACTER
	:	~['\\]
	;
// §3.10.5 String Literals
STRINGLITERAL
	:	'"' STRINGCHARACTERS? '"'
	;
fragment
STRINGCHARACTERS
	:	STRINGCHARACTER+
	;
fragment
STRINGCHARACTER
	:	~["\\]
	|	ESCAPESEQUENCE
	;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
ESCAPESEQUENCE
	:	'\\' [btnfr"'\\]
	//:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	;
//Identifiers (must appear after all keywords in the grammar)
IDENTIFIER
    :   SCHEMELETTER SCHEMELETTERORDIGIT*
    ;
fragment
SCHEMELETTER
	:	[a-zA-Z$_]
	;
fragment
SCHEMELETTERORDIGIT
	:	[a-zA-Z0-9$_]
	;
WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;


