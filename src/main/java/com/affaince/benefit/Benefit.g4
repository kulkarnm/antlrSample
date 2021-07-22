grammar Benefit;


@header {
package com.affaince.benefit;
}

// Scheme structure
scheme
    : givenUnit  computeUnit    eligibilityUnit    payUnit  EOF
    ;


givenUnit
    :   GIVEN   givenBody
    ;

givenBody
    :   '{' variableDeclarationStatement* '}'
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
   :    PAY IDENTIFIER (BEFORE | AFTER) expressionList OF IDENTIFIER proportionExpression SEMI
   ;


variableDeclarationStatement
    :   variableDeclaratorId
    |   variableDeclaratorId ASSIGN variableInitializer SEMI
    |   variableDeclaratorId ASINPUT SEMI
    ;
variableDeclaratorId
    :   IDENTIFIER ('[' ']')?    //* is removed as we do not intend to support multidimensional arrays as of now
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' variableInitializer (',' variableInitializer)* '}'
    ;


conditionalExpression
    :   conditionalOrExpression ( QUESTIONMARK expression COLON conditionalExpression )?
    ;

conditionalOrExpression
    :   conditionalAndExpression ( ORSTR conditionalAndExpression )*
    ;

conditionalAndExpression
    :   relationalExpression ( ANDSTR relationalExpression )*
    ;
relationalOp
    :   GT | GE | LE | LT | EQUAL | NOTEQUAL
    ;
relationalExpression
    :   additiveExpression ( relationalOp additiveExpression )*
    |   iterativeStatement ( relationalOp additiveExpression )*
    ;

additiveExpression
    :   multiplicativeExpression ( (ADD | SUB) multiplicativeExpression )*
    |   iterativeAggregationStatement
    ;

multiplicativeExpression
    :   unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
    ;

unaryExpression
    :   '+' unaryExpression
    |   '-' unaryExpression
    |   primary
    ;

primary
    :   parExpression
    |   literal
    |   IDENTIFIER
    ;

parExpression
    :   LPAREN expression RPAREN
    ;


nonDefaultProportionExpression
    :    NUMBER COLON NUMBER (COLON NUMBER)+
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
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;
iterativeStatement
    :   EACH (variableDeclarationStatement | statement)
    ;
iterativeAggregationStatement
    :   SUMOF EACH (variableDeclarationStatement | statement)
    ;
statement
     :  block
     |  statementExpression SEMI
     //|  iterativeStatement
     ;

statementExpression
    :   expression
    ;
block
    :  '{' blockStatement* '}'
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
    :   'each '
    ;

SUMOF
    :   'sumOf '
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
    ;

ORSTR
    :   'or'
    ;

BooleanLiteral
	:	'true'
	|	'false'
	;

NullLiteral
	:	'null'
	;
//end -keywords
IDENTIFIER
    :   [A-Za-z]+[0-9]*('_'[A-Za-z]+[0-9]*)*
    ;


NUMBER
    :   Sign? ('.' [0-9]+ | [0-9]+ ('.' [0-9]*)? ) ;


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
Sign
	:	[+\-]
	;
CharacterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

fragment
SingleCharacter
	:	~['\\]
	;
// §3.10.5 String Literals
StringLiteral
	:	'"' StringCharacters? '"'
	;
fragment
StringCharacters
	:	StringCharacter+
	;
fragment
StringCharacter
	:	~["\\]
	|	EscapeSequence
	;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;


