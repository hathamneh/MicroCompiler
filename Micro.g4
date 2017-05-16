// Define a grammar called Micro
grammar Micro;

KEYWORD: ( 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' | 'ENDIF' | 'FOR' | 'ENDFOR' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' );

IDENTIFIER: ( [A-Z] | [a-z] )( [A-Z] | [a-z] | [0-9] )*;
INTLITERAL: [0-9]+;
FLOATLITERAL: ([0-9])*('.')([0-9])+;
STRINGLITERAL: '"' ~'"'* '"';
COMMENT: '--' ~[\r\n]* -> channel(HIDDEN);

OPERATOR: ( ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' );
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines

// program
program: 'PROGRAM' id 'BEGIN' pgm_body 'END' ;
id: var_name=IDENTIFIER ;
pgm_body: decl func_declarations ;
decl: string_decl decl 
	| var_decl decl
	| ;

// String decleration
string_decl: 'STRING' id ':=' str ';' ;
str: str_val=STRINGLITERAL ;

// variable decleration
var_decl: var_type id_list ';' ;
var_type: 'FLOAT'  #FloatDeclaration 
		| 'INT'    #IntDeclaration;
any_type: 'VOID' 
		| var_type ;
id_list: id id_tail ;
id_tail: ',' id id_tail 
		| ;

// function parameter list
param_decl_list: param_decl param_decl_tail 
				| ;
param_decl: var_type id ;
param_decl_tail: ',' param_decl param_decl_tail 
				| ;

// function decleration
func_declarations: func_decl func_declarations 
				| ;
func_decl: 'FUNCTION' any_type id '(' param_decl_list ')' 'BEGIN' func_body 'END' ;
func_body: decl stmt_list ;

// statement list
stmt_list: stmt stmt_list 
		| ;
stmt: basic_stmt 
	| if_stmt 
	| for_stmt ;
basic_stmt: assign_stmt 
		| read_stmt 
		| write_stmt 
		| return_stmt ;

// basic statement
assign_stmt: assign_expr ';' ;
assign_expr: id ':=' expr ;
read_stmt: 'READ' '(' id_list ')' ';' ;
write_stmt: 'WRITE' '(' id_list ')' ';' ;
return_stmt: 'RETURN' expr ';' ;

// if statement
if_stmt: 'IF' '(' cond ')' decl stmt_list else_part 'ENDIF' ;
else_part	: 'ELSE' decl stmt_list  #existElse
		  | #noElse ;
cond		: expr compare expr ;
compare		: '=' 
			| '!=' 
			| '<=' 
			| '>=' 
			| '<' 
			| '>' ;

// for statement
for_stmt: 'FOR' '(' init_expr ';' cond ';' incr_expr ')' decl stmt_list 'ENDFOR' ;
init_expr: assign_expr 
		| ;
incr_expr: assign_expr 
		| ;

// expression
expr : expr_prefix term ;
expr_prefix : expr_prefix term addop #exprPrefix
			| #noExprPrefix ;
term : factor_prefix factor ;
factor_prefix : factor_prefix factor mulop #factorPrefix
			| #noFactorPrefix ;
factor: primary  #factorPrimary
		| call_expr #factorCallExpr ;
primary: '(' expr ')'  #newExpr
		| id #primaryId
		| operand=INTLITERAL #primaryInt
		| operand=FLOATLITERAL #primaryFloat ;
call_expr: id '(' expr_list ')' ;
expr_list: expr expr_list_tail 
		| ;
expr_list_tail: ',' expr expr_list_tail 
		| ;
addop: '+' 
	| '-' ;
mulop: '*' 
	| '/' ;


