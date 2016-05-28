grammar ASM;

compilationUnit locals [
    java.util.Map<String, ExprContext> symbols = new java.util.HashMap();
]: include* (dataSection | textSection)*;
include: 'include' STRING;
dataSection: SECTION DATA varDeclStmt*;
varDeclStmt: ID DB expr;

textSection: SECTION TEXT (stmt | labelDecl)*;

stmt:
    callStmt
    | clmStmt
    | clrStmt
    | cmpStmt
    | decStmt
    | hltStmt
    | incStmt
    | inputStmt
    | jmpStmt
    | jnzStmt
    | jzStmt
    | popStmt
    | printStmt
    | pushStmt
    | rdmemStmt
    | retStmt
;

labelDecl: ID COLON stmt+ END;

callStmt: 'call' ID ((expr COMMA)* expr)?;
clmStmt: 'clm';
clrStmt: 'clr' expr?;
cmpStmt: 'cmp' first=expr COMMA second=expr;
decStmt: 'dec' expr?;
hltStmt: 'hlt';
incStmt: 'inc' expr?;
inputStmt: 'input' expr?;
jmpStmt: 'jmp' expr?;
jnzStmt: 'jnz' expr?;
jzStmt: 'jz' expr?;
popStmt: 'pop' expr?;
printStmt: 'print' expr?;
pushStmt: 'push' expr?;
rdmemStmt: 'rdmem' expr?;
retStmt: 'ret';

expr locals [
    Boolean isStatic = true;
]: CELL | ID | INT | HEX | CHAR | STRING;

WS: (' ' | '\r' | '\n' | '\r\n') -> skip;

COMMENT: ';' (~'\n')* -> channel(HIDDEN);
COLON: ':';
COMMA: ',';
DOT: '.';

CELL: '!';
DATA: '.data';
DB: 'db';
END: 'end';
SECTION: 'section';
TEXT: '.text';

INT: [0-9]+;
HEX: ('0x' [a-zA-Z0-9]+) | ([a-zA-Z0-9]+ 'h');
CHAR: '\'' ('\\\'' | ~('\'')) '\'';
STRING: '"' (~('"' | '\n'))+ '"';
ID: [a-zA-Z] [a-zA-Z0-9]*;