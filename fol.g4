grammar fol;

@header {
    package compiler;

    import java.util.List;
    import java.util.LinkedList;
    import ast.*;
 
}

@members {
     private SymbolTable st; //Symbol table for the program
     private ASTNode ast;    //AST for the program

     public void setSymbolTable(SymbolTable st) {
          this.st = st;
     }

     public SymbolTable getSymbolTable() {
          return st;
     }


     public ASTNode getAST() {
          return ast;
     }
}

/* wffs as the starting point */
program : wffs {ast = $wffs.node;} ;

wffs : wff wffs 
     | ;

wff returns [StatementListNode node] : 
      '(' '(' '\\forall' variable ')' wff ')'
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

predicate : 'A_' NUMBER '^' NUMBER ;
function : 'f_' NUMBER '^' NUMBER ; 
variable : 'x_' NUMBER;
constant : 'a_' NUMBER;


/* Lexer stuff */

NUMBER : DIGIT+;  /* natural NUMBERs, naturally */

/* document your proofs! */
COMMENT : '/*' .*? '*/' -> skip; 

/* ignore whitespace */
WS : [ \t\n\r]+ -> skip; 

fragment DIGIT : ('0'..'9') ;
