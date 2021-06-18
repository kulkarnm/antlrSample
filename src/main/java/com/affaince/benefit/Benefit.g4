grammar Benefit;

@header {
package com.affaince.benefit;
}
scheme
    : givenStatement  computeStatement    eligibilityStatement    payStatement
    ;

inputOrAssignmentOnly
    :   inputExpression |   assignmentExpression
    ;
givenStatement
    :   GivenOperator (inputOrAssignmentOnly SemiColonOperator)+
    ;

computeStatement
    :   ComputeOperator assignmentExpression (SemiColonOperator assignmentExpression)+
    ;


eligibilityStatement
   :    EligibleWhenOperator comparisonExpression (SemiColonOperator | (combiningExpression comparisonExpression)+)
   ;

payStatement
   :    PayOperator
        (BeforeOperator | AfterOperator)
        (expression (CommaOperator expression)*  OfOperator)
        IDENTIFIER
        (proportionExpression) SemiColonOperator
   ;
inputExpression
    :  (IDENTIFIER | array) AsInputOperator
    ;
comparisonExpression
    :   expression (ArithmaticOperatorLT | ArithmaticOperatorLE  | ArithmaticOperatorGE | ArithmaticOperatorGT | ArithmaticOperatorEQUAL |ArithmaticOperatorNOTEQUAL) expression
    ;

combiningExpression
    :    comparisonExpression (AndOperator | OrOperator) comparisonExpression
    ;
proportionExpression
    :   InOperator  DefaultOperator | (NUMBER ColonOperator NUMBER (ColonOperator NUMBER)+)  ProprotionOperator
    ;
assignmentExpression
    :   IDENTIFIER  ArithmaticOperatorAssignment  expression
    ;
loopExpression
    :    EachOperator expression
    ;
aggregateSumExpression
    :  SumOfOperator (EachOperator)? expressionList
    ;
array
    : ((IDENTIFIER LBrackOperator (NUMBER (CommaOperator NUMBER)* | StringLiteral (CommaOperator StringLiteral)) RBrackOperator)
    | (IDENTIFIER LBrackOperator RBrackOperator)) // empty array
    ;


expressionList
    :   expression      #singleExpresionInList
    |   expression (CommaOperator expression)*     #multipleExpressionsInList
    ;

expression
    :   expression ArithmaticOperatorModMultDiv expression
    |   expression ArithmaticOperatorAddSubtract expression
    |   (NUMBER | StringLiteral | BooleanLiteral | NullLiteral)
    |   IDENTIFIER
    |   array
    |   comparisonExpression
    |   assignmentExpression
    |   inputExpression
    |   LParanOperator expression RParanOperator
    |   loopExpression
    |   aggregateSumExpression
    ;






//end of expressions



//Lexer



NUMBER
    :   Sign? ('.' [0-9]+ | [0-9]+ ('.' [0-9]*)? ) ;

GIVEN
    :   'given'
    ;
ASINPUT
    :   'as input'
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
    ;
ORSTR
    :   'or'
    ;


fragment
Sign
	:	[+\-]
	;

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
BooleanLiteral
	:	'true'
	|	'false'
	;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	;
NullLiteral
	:	'null'
	;
IDENTIFIER
    :    '$'[A-Za-z]+[0-9]*('_'[A-Za-z]+[0-9]*)*  ;


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
ANY_SPACE	:	SINGLE_SPACE+ ;
SINGLE_SPACE	:	' ';


//arithmatic /functional operators with/without spaces
AsInputOperator
    :  ANY_SPACE ASINPUT ANY_SPACE | ANY_SPACE ASINPUT | ASINPUT ANY_SPACE
    ;
ArithmaticOperatorModMultDiv
    :   ANY_SPACE (MOD|MUL|DIV) ANY_SPACE | ANY_SPACE (MOD|MUL|DIV) | (MOD|MUL|DIV) ANY_SPACE
    ;
ArithmaticOperatorAddSubtract
    :   ANY_SPACE (ADD | SUB) ANY_SPACE | ANY_SPACE (ADD | SUB) | (ADD | SUB) ANY_SPACE
    ;
ArithmaticOperatorAssignment
    :   ANY_SPACE ASSIGN ANY_SPACE | ANY_SPACE ASSIGN | ASSIGN ANY_SPACE
    ;
ArithmaticOperatorLT
    :   ANY_SPACE LT ANY_SPACE | ANY_SPACE LT | LT ANY_SPACE
    ;

ArithmaticOperatorLE
    :   ANY_SPACE LE ANY_SPACE | ANY_SPACE LE | LE ANY_SPACE
    ;

ArithmaticOperatorGT
    :   ANY_SPACE GT ANY_SPACE | ANY_SPACE GT | GT ANY_SPACE
    ;

ArithmaticOperatorGE
    :   ANY_SPACE GE ANY_SPACE | ANY_SPACE GE | GE ANY_SPACE
    ;
ArithmaticOperatorEQUAL
    :   ANY_SPACE EQUAL ANY_SPACE | ANY_SPACE EQUAL | EQUAL ANY_SPACE
    ;
ArithmaticOperatorNOTEQUAL
    :   ANY_SPACE NOTEQUAL ANY_SPACE | ANY_SPACE NOTEQUAL | NOTEQUAL ANY_SPACE
    ;
LParanOperator
    :   ANY_SPACE LPAREN ANY_SPACE | ANY_SPACE LPAREN | LPAREN  ANY_SPACE
    ;
RParanOperator
    :   ANY_SPACE RPAREN ANY_SPACE | ANY_SPACE RPAREN | RPAREN   ANY_SPACE
    ;
LBrackOperator
    :   ANY_SPACE LBRACK ANY_SPACE | ANY_SPACE LBRACK | LBRACK ANY_SPACE
    ;
RBrackOperator
    :   ANY_SPACE RBRACK ANY_SPACE | ANY_SPACE RBRACK | RBRACK ANY_SPACE
    ;
SemiColonOperator
    :   ANY_SPACE SEMI ANY_SPACE | ANY_SPACE SEMI | SEMI ANY_SPACE
    ;
ColonOperator
    :   ANY_SPACE COLON ANY_SPACE | ANY_SPACE COLON | COLON ANY_SPACE
    ;
CommaOperator
    :   ANY_SPACE COMMA ANY_SPACE | ANY_SPACE COMMA | COMMA ANY_SPACE
    ;
GivenOperator
    :    ANY_SPACE GIVEN ANY_SPACE | ANY_SPACE GIVEN | GIVEN ANY_SPACE
    ;
ComputeOperator
    :   ANY_SPACE COMPUTE ANY_SPACE | ANY_SPACE COMPUTE | COMPUTE ANY_SPACE
    ;
EligibleWhenOperator
    :   ANY_SPACE ELIGIBLEWHEN ANY_SPACE | ANY_SPACE ELIGIBLEWHEN | ELIGIBLEWHEN ANY_SPACE
    ;
PayOperator
    :   ANY_SPACE PAY ANY_SPACE | ANY_SPACE PAY | PAY ANY_SPACE
    ;
BeforeOperator
    :   ANY_SPACE BEFORE ANY_SPACE | ANY_SPACE BEFORE | BEFORE ANY_SPACE
    ;
AfterOperator
    :  ANY_SPACE AFTER ANY_SPACE | ANY_SPACE AFTER | AFTER ANY_SPACE
    ;
DefaultOperator
    :  ANY_SPACE DEFAULT ANY_SPACE | ANY_SPACE DEFAULT | DEFAULT ANY_SPACE
    ;
InOperator
    :  ANY_SPACE IN ANY_SPACE | ANY_SPACE IN | IN ANY_SPACE
    ;
ProprotionOperator
    :  ANY_SPACE PROPORTION ANY_SPACE | ANY_SPACE PROPORTION | PROPORTION ANY_SPACE
    ;
OfOperator
    :  ANY_SPACE OF ANY_SPACE | ANY_SPACE OF | OF ANY_SPACE
    ;
EachOperator
    :   ANY_SPACE EACH ANY_SPACE | ANY_SPACE EACH | EACH ANY_SPACE
    ;
AndOperator
    :   ANY_SPACE ANDSTR ANY_SPACE | ANY_SPACE ANDSTR | ANDSTR ANY_SPACE
    ;
OrOperator
    :   ANY_SPACE ORSTR ANY_SPACE | ANY_SPACE ORSTR | ORSTR ANY_SPACE
    ;
SumOfOperator
    :   ANY_SPACE SUMOF ANY_SPACE | ANY_SPACE SUMOF | SUMOF ANY_SPACE
    ;
//end - arithmatic /functional operators with/without spaces

WS  :   [\t\n\r]+ -> skip ;