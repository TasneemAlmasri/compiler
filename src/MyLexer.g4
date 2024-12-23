lexer grammar MyLexer;

Double_Semicolon_Comment
    : ';;' ~[\r\n]* -> skip
    ;
Single_Semicolon_Comment
    : ';' ~[\r\n]* -> skip
    ;


DEFUN : 'defun' ;
DEFPARAMETER : 'defparameter' ;
FORMAT : 'format' ;
IF : 'if' ;
AND : 'and' ;
OR  : 'or' ;
NOT : 'not' ;
EQUAL : 'equal' ;
Lambda : 'lambda' ;
Funcall : 'funcall' ;
Destination : 't' ;


Identifier : ('*' | '-')? [a-zA-Z][a-zA-Z0-9*-]* ;
Number : [0-9]+ ('.' [0-9]+)? ;

Plus : '+' ;
Star : '*' ;
Minus : '-' ;
Less_or_equal : '<=' ;
Greater_or_equal : '>=' ;

Left_pren : '(' ;
Right_pren : ')' ;


String
    : '"' (Esc_seq | ~["\\])* '"'
    ;

fragment Esc_seq
    : '\\' [btnrf"\\]
    ;

Tilde_command : '~' [%a] ;

WS : [ \t\r\n]+ -> skip ;

