grammar MathExpression;
expression          : '(' expression ')'                        #parenthesisExp
                    | expression (ASTERISK|SLASH) expression    #mulDivExp
                    | expression (PLUS|MINUS) expression        #addSubExp
                    | <assoc=right>  expression '^' expression  #powerExp
                    | ID '(' expression ')'                     #funExp
                    | NUMBER                                    #numericAtomExp
                    | ID                                        #idAtomExp
                    ;

ASTERISK            : '*' ;
SLASH               : '/' ;
PLUS                : '+' ;
MINUS               : '-' ;
ID                  : [a-zA-Z] | [a-zA-Z][a-zA-Z0-9_]+ ;
NUMBER              : [0-9]+ ('.' [0-9]+)? ;
WHITESPACE          : ' ' -> skip;