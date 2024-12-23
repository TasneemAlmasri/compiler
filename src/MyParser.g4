parser grammar MyParser;

options {
    tokenVocab=MyLexer;
}

program
    : form* EOF
    ;

form
    : parameter_definition
    | fun_definition
    | fun_call
    | lambda_definition
    | if_statement
    |lambda_definition
    |arithmetic_expressions
    |logical_expression
    |format_definition
    | expression
    ;

parameter_definition
    : Left_pren DEFPARAMETER Identifier expression Right_pren
    ;

fun_definition
    : Left_pren DEFUN Identifier parameter_list String body Right_pren
    ;

fun_call
    : Left_pren Funcall? Identifier argument_list Right_pren
    ;

lambda_definition
    : Left_pren Lambda parameter_list body Right_pren
    ;

if_statement
    : Left_pren IF condition form (form)? Right_pren
    ;
condition
    : Number
    | Identifier
    | fun_call
    | arithmetic_expressions
    | logical_expression
    | Left_pren condition+ Right_pren
    ;

format_definition
  : Left_pren FORMAT Destination String value Right_pren
  ;
value:
  (fun_call|
  Identifier
  )*
;

logical_expression
    : Left_pren (AND | OR | NOT |EQUAL) expression+ Right_pren
    ;

arithmetic_expressions:
 Left_pren operator operand operand Right_pren
;
operand
    : Number
    |fun_call
    | Identifier
    | arithmetic_expressions
    ;
operator:
Plus
|Star
|Minus
|Less_or_equal
|Greater_or_equal ;

expression
    : Number
    | String
    | Identifier
    | lambda_definition
    | arithmetic_expressions
    | logical_expression
    | Left_pren form+ Right_pren
    ;

parameter_list
    : Left_pren Identifier* Right_pren
    ;

argument_list
    : (expression)*
    ;

body
     : (fun_call
        | lambda_definition
        | if_statement
        | logical_expression
        | arithmetic_expressions
        | expression
        |format_definition
        )+
        ;
