// A grammar for first order language, as defined in "Introduction to Mathematical Logic" by Elliot Mendelson.

grammar fol;

/* parser stuff */

// wffs as the starting point, instead of the alphabet
program : wffs ;

// one or more wffs
wffs : wff wffs 
     | ;

// following tex syntax for symbols
wff : '(' '(' '\\forall' variable ')' wff ')'
    | '\\lnot' '(' wff ')' 
    | '(' wff '\\Rightarrow' wff ')' 
    | atomic_formula ;

atomic_formula : predicate '(' terms ')';

terms  : term 
       | term ',' terms ;

term : variable 
     | constant 
     | function '(' terms ')';

letter : function
       | predicate
       | variable 
       | constant ;

predicate : 'A' '_' NUMBER '^' NUMBER ;
function : 'f' '_' NUMBER '^' NUMBER ; 
variable : 'x' '_' NUMBER;
constant : 'a' '_' NUMBER;


/* Lexer stuff, for efficiency */

// natural NUMBERs, naturally
NUMBER : DIGIT+;  

// for proof documentation
COMMENT : '/*' .*? '*/' -> skip; 

// ignore whitespace 
WS : [ \t\n\r]+ -> skip; 

fragment DIGIT : ('0'..'9') ;
