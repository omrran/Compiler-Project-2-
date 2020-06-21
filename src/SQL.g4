
grammar SQL;
//compiler 2 from omran 2
//compiler 2 from omran 2
//compiler 2 from omran 2
//compiler 2 from omran 2
//compiler 2 from omran 2
parse
 : ( sql_stmt_list | func_statment_list| error ) EOF
 ;

error
 : UNEXPECTED_CHAR

   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt_list
 :sql_stmt ';'? ( sql_stmt ';'?)*

 ;

sql_stmt
//: ( K_EXPLAIN ( K_QUERY K_PLAN )? )? ( alter_table_stmt
  :                                    ( alter_table_stmt
//                                     | analyze_stmt
//                                     | attach_stmt
//                                     | begin_stmt
//                                     | commit_stmt
//                                     | compound_select_stmt
//                                     | create_index_stmt
                                       | create_table_stmt
//                                     | create_trigger_stmt
//                                     | create_view_stmt
//                                     | create_virtual_table_stmt
                                       | delete_stmt
//                                     | delete_stmt_limited
//                                     | detach_stmt
//                                     | drop_index_stmt
                                       | drop_table_stmt
//                                     | drop_trigger_stmt
//                                     | drop_view_stmt
                                       | factored_select_stmt
                                       | insert_stmt
//                                     | pragma_stmt
//                                     | reindex_stmt
//                                     | release_stmt
//                                     | rollback_stmt
//                                     | savepoint_stmt
//                                     | simple_select_stmt
//                                     | select_stmt
                                       | update_stmt
//                                     | update_stmt_limited
//                                     | vacuum_stmt
                                      )
 ;

alter_table_stmt/*class*/
 : K_ALTER K_TABLE  ( database_name/*class*/ '.' )? source_table_name/*class*/
       ( K_RENAME K_TO new_table_name/*class*/
       | alter_table_add/*class*/
       | alter_table_add_constraint/*class*/
       | K_ADD K_COLUMN? column_def/*class*/
       )
 ;

alter_table_add_constraint/*class*/
 : K_ADD K_CONSTRAINT any_name/*class*/ table_constraint/*class*/
 ;

alter_table_add/*class*/
 : K_ADD table_constraint/*class*/
 ;


create_table_stmt/*class*/
 : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
   (
   '(' column_def/*class*/ ( ',' table_constraint/*class*/ | ',' column_def )* ')'
   |
   K_AS select_stmt
   )
 ;


delete_stmt
 :  K_DELETE K_FROM qualified_table_name
   ( K_WHERE expr )?
 ;

drop_table_stmt
 : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name
 ;


factored_select_stmt
 :
   select_core
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;


insert_stmt
:   K_INSERT  K_INTO
   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
   | select_stmt
   | K_DEFAULT K_VALUES
   )
 ;

select_stmt/*class*/
 :  select_or_values/*class*/
   ( K_ORDER K_BY ordering_term/*class*/ ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr/*class*/ )? )?
 ;


select_or_values/*class*/
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column/*c*/ ( ',' result_column )*
   from_clause/*c*/?
   where_clause/*c*/?
   groupBy_clause/*c*/?
 | K_VALUES '(' expr/*c*/ ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

update_stmt/*c*/
:  K_UPDATE  qualified_table_name/*c*/
   K_SET column_name/*c*/ '=' expr ( ',' column_name '=' expr )* where_clause/*c*/?
;


 assignment_query_to_var
 :K_VAR? IDENTIFIER '=' sql_stmt ';'
 ;

 func_statment_list
 :func_statment+
 ;
func_statment
 : prototype_func block_of_stms
 ;

/*prototype_func
:(K_VAR)? IDENTIFIER
 '('
     (
         (K_VAR IDENTIFIER(',' K_VAR IDENTIFIER )*)?
       |   K_VAR IDENTIFIER'='expr(',' K_VAR IDENTIFIER'='expr )*
       |   K_VAR IDENTIFIER(',' K_VAR IDENTIFIER )*(',' K_VAR IDENTIFIER'='expr )+
     )
 ')'
;*/
prototype_func
:(K_VAR)? IDENTIFIER '('(parameter_list_without_values?|parameter_list_with_values|parameter_list_mix)')'
;
parameter_list_without_values
:K_VAR IDENTIFIER(',' K_VAR IDENTIFIER )*
;
parameter_list_with_values
:K_VAR IDENTIFIER'='expr(',' K_VAR IDENTIFIER'='expr )*
;
parameter_list_mix
:K_VAR IDENTIFIER(',' K_VAR IDENTIFIER )*(',' K_VAR IDENTIFIER'='expr )+
;


block_of_stms
:'{'all_stm*'}'
;


all_stm
:
(if_stm
|while_stm
|do_while_stm
|for_stm
|for_each_stm
|try_catch_stm
|one_line_cond ';'
|switch_stm
|break_stm
|continue_stm
|array_one_dimension
|initialize_array_element
|func_call ';'
|print_stm
|higher_order_func
//|json_stmt
|assignment_query_to_var
//|sql_stmt_list
|sql_stmt
//|array_one_dimension_json
|read_property_json
|assignment_value_to_property_json
|declare_variable//var x; var x,y,z;
|initialize_variable //x=8;
|increment ';'
|decrement ';'
|return_stm
|/*block*/block_of_stms// to accept block of stm
)
;
if_stm
//:K_IF '('(expr|compare_element_array)')' ('{' all_stm* '}'|all_stm?) else_if* else_stm?
:K_IF '('expr')' ('{' all_stm* '}'|all_stm?) else_if* else_stm?
;
//this rule for test
compare_element_array
:IDENTIFIER ARRAY_BRACKET_WITH_INDEX ( '*'|'/'|'%' |'+' |'-' |'||'|'&&'|'<'|'<='|'>'|
                                      '>='|'='|'=='|'!='|'<>'|'<<'|'>>'|'&'|'|' |
                                       K_IS K_NOT?| K_IN |K_LIKE|K_GLOB|K_MATCH|K_REGEXP|K_AND|K_OR)
                                      (expr|IDENTIFIER ARRAY_BRACKET_WITH_INDEX)
;
////////////////
else_if
:
K_ELSE K_IF '(' expr')' ('{'all_stm*'}'|all_stm?)
;
else_stm
:K_ELSE ('{'all_stm*'}'|all_stm?)
;

while_stm
:K_WHILE '('expr')'('{'all_stm*'}'|all_stm?)
;
do_while_stm
:K_DO ('{'all_stm*'}'|all_stm?) K_WHILE '('expr')'';'
;
for_stm
:
//K_FOR '(' K_VAR expr ';' expr ';' (increment|decrement) ')' '{' all_stm* '}'

K_FOR '(' first_sec? ';'second_sec?';' third_sec? ')' ('{'all_stm*'}'|all_stm?)/*block_of_stms?*/
;

first_sec
:(K_VAR? expr)
|one_line_cond

;
second_sec
:expr
|IDENTIFIER ('>'|'<'|'<='|'>='|'==') (IDENTIFIER ARRAY_BRACKET_WITH_INDEX?) (('.'func_call)|('.'IDENTIFIER)+)

;
third_sec
:(increment|decrement)
;

for_each_stm
:K_FOR '(' K_VAR? IDENTIFIER ':' IDENTIFIER ')' ('{'all_stm*'}'|all_stm?)
;


try_catch_stm
:
K_TRY '{' all_stm* '}' (K_CATCH '(' IDENTIFIER')' '{' all_stm*'}')+(K_FINALLY '{' all_stm*'}')?
;


one_line_cond
:
(K_VAR? IDENTIFIER '=')?
     ('(' expr ')'|expr)        '?'
     (expr|'('one_line_cond')') ':'
     (expr|'('one_line_cond')')
;
array_one_dimension //normal array or Json array
:K_VAR? IDENTIFIER ARRAY_BRACKET/*SMALL_LP SMALL_RP*//*[]*/
(
 ('=' contents_of_array)
 |
 (','IDENTIFIER ARRAY_BRACKET)*
) ';'
;
contents_of_array
:func_call
|'['(expr (',' expr)*|json_body (',' json_body)*)']'
;
///////////////
initialize_array_element
:IDENTIFIER ARRAY_BRACKET_WITH_INDEX ('='|'-='|'+='|'*='|'/=') expr ';'
;


switch_stm
:
K_SWITCH '('IDENTIFIER')' '{' case_part+ default_part?'}'
;
case_part
:K_CASE expr':'  all_stm*
;
default_part
:K_DEFAULT ('{' all_stm* '}'|all_stm?)
;
break_stm
:K_BREAK SCOL
;
continue_stm
:K_CONTINUE SCOL
;
func_call
://IDENTIFIER '('(expr(','expr)*)?')'/*';'*/
IDENTIFIER '('(argument(','argument)*)?')'
//IDENTIFIER '('((expr|IDENTIFIER ARRAY_BRACKET_WITH_INDEX)(','(expr|IDENTIFIER ARRAY_BRACKET_WITH_INDEX))*)?')'/*';'*/

;
argument
:expr
|IDENTIFIER ARRAY_BRACKET_WITH_INDEX
;
print_stm
:K_PRINT '('
((IDENTIFIER |IDENTIFIER ARRAY_BRACKET_WITH_INDEX|IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)*)'+' )*
 (IDENTIFIER |IDENTIFIER ARRAY_BRACKET_WITH_INDEX|IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)*)

          ')' ';'
;

higher_order_func
:K_VAR? IDENTIFIER '=' IDENTIFIER'('(IDENTIFIER',')+K_FUNCTION'('IDENTIFIER (','IDENTIFIER)*')'block_of_stms')'';'
;

//json

json_stmt
:K_VAR? IDENTIFIER '='json_body';'
;
json_body
:'{'IDENTIFIER ':' value_of_property (',' IDENTIFIER ':' value_of_property)*'}'
;

value_of_property
:expr|json_body|contents_of_array
;
increment
:IDENTIFIER  ('++'|('+='|'*=')expr)
|'++' IDENTIFIER

;
decrement
:IDENTIFIER  ('--'|('-='|'/=')expr)
 |'--' IDENTIFIER
;


read_property_json
:  K_VAR? IDENTIFIER '=' IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)*';'
;
assignment_value_to_property_json
:   IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)* '=' expr ';'
;
declare_variable
:K_VAR IDENTIFIER( (','IDENTIFIER)*  |  '='expr) ';'
;
initialize_variable
://K_VAR? IDENTIFIER ('='|'-='|'+='|'*='|'/=') /*literal_value*/ (NUMERIC_LITERAL|STRING_LITERAL|IDENTIFIER ARRAY_BRACKET_WITH_INDEX|json_body|func_call) ';'
K_VAR? IDENTIFIER ('='|'-='|'+='|'*='|'/=') (IDENTIFIER ARRAY_BRACKET_WITH_INDEX|json_body|func_call|expr) ';'
;
return_stm
:K_RETURN (expr|increment|decrement|one_line_cond) ';'
;



column_def/*class*/
: column_name/*class*/ ( column_constraint/*class*/ | type_name/*class*/ )*
;

type_name/*class*/
: name ( '(' signed_number (any_name)? ')'
         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )?
;

column_constraint/*c*/
 : ( K_CONSTRAINT name/*c*/ )?
   ( column_constraint_primary_key
   | column_constraint_foreign_key
   | column_constraint_not_null
   | column_constraint_null
   | K_CHECK '(' expr ')'
   | column_default
   | K_COLLATE collation_name
   )
 ;

column_constraint_primary_key/*c*/
 : K_PRIMARY K_KEY ( K_ASC | K_DESC )?  K_AUTOINCREMENT?
 ;

column_constraint_foreign_key/*class*/
 : foreign_key_clause
 ;

column_constraint_not_null/*c*/
 : K_NOT K_NULL
 ;
column_constraint_null/*c*/
 : K_NULL
 ;


column_default/*c*/
 : K_DEFAULT (column_default_value | '(' expr ')' | next_val | any_name )
              any_name_colon ?
 ;

column_default_value/*c*/
 : ( signed_number | literal_value )
 ;
 next_val/*c*/
 :K_NEXTVAL '(' expr ')'
 ;
any_name_colon/*c*/
:'::' any_name+
;
//conflict_clause
// : ( K_ON K_CONFLICT ( K_ROLLBACK
//                     | K_ABORT
//                     | K_FAIL
//                     | K_IGNORE
//                     | K_REPLACE
//                     )
//   )?
// ;

/*
    SQLite understands the following binary operators, in order from highest to
    lowest precedence:

    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR
*/

expr
 : literal_value
 | unary_expr
 | expr ARRAY_BRACKET_WITH_INDEX? ( '*'|'/'|'%' |'+' |'-' |'||'|'&&'|'<'|'<='|'>'|
         '>='|'='|'=='|'!='|'<>'|'<<'|'>>'|'&'|'|' |
          K_IS K_NOT?| K_IN |K_LIKE|K_GLOB|K_MATCH|K_REGEXP|K_AND|K_OR)
  expr
 | bd_table_column_name
 | call_function_in_expr
 | expr_enclose_with_brackets
 | select_enclose_with_brackets
 ;




 bd_table_column_name
 : ( ( database_name '.' )? table_name '.' )? column_name
 ;
 unary_expr
 :('-'| '+'| '~'| K_NOT) expr
 ;

 call_function_in_expr
 :function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
 ;
 expr_enclose_with_brackets
 :'(' expr ')'
 ;
 select_enclose_with_brackets
 :( ( K_NOT )? K_EXISTS )? '(' /*select_stmt */factored_select_stmt')'
 ;



 ///////////////////////////////////////////////
foreign_key_clause/*class*/
 : K_REFERENCES ( database_name '.' )? foreign_table
                ( '(' fk_target_column_name ( ',' fk_target_column_name )* ')' )?
   on_sectin_or_matchName*
   ( K_NOT? K_DEFERRABLE ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE )? K_ENABLE? )?
 ;

 on_sectin_or_matchName/*c*/
 :on_sectin|match_name
 ;
on_sectin/*c*/
:K_ON ( K_DELETE | K_UPDATE )( K_SET K_NULL | K_SET K_DEFAULT | K_CASCADE| K_RESTRICT | K_NO K_ACTION )
;
match_name/*c*/
:K_MATCH name
;
fk_target_column_name/*class*/
 : name
 ;

//raise_function
// : K_RAISE '(' ( K_IGNORE
//               | ( K_ROLLBACK | K_ABORT | K_FAIL ) ',' error_message )
//           ')'
// ;

indexed_column/*class*/
 : column_name/*class*/ ( K_COLLATE collation_name/*class*/ )? ( K_ASC | K_DESC )?
 ;

table_constraint/*class*/
 : ( K_CONSTRAINT name/*class*/ )?
   ( table_constraint_primary_key/*class*/
   | table_constraint_key/*class*/
   | table_constraint_unique/*class*/
   | K_CHECK '(' expr/*class*/ ')'
   | table_constraint_foreign_key/*class*/
   )
 ;

table_constraint_primary_key/*class*/
// : K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_PRIMARY K_KEY '(' indexed_column/*class*/ ( ',' indexed_column/*class*/ )* ')'
 ;


table_constraint_foreign_key/*class*/
 : K_FOREIGN K_KEY '(' fk_origin_column_name/*class*/ ( ',' fk_origin_column_name/*class*/ )* ')' foreign_key_clause/*class*/
 ;

table_constraint_unique/*class*/
// : K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_UNIQUE K_KEY? name/*class*/? '(' indexed_column/*class*/ ( ',' indexed_column/*class*/ )* ')'
 ;

table_constraint_key/*class*/
// : K_KEY name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_KEY name/*class*/? '(' indexed_column /*class*/( ',' indexed_column/*class*/ )* ')'
 ;
fk_origin_column_name/*class*/
 : column_name/*class*/
 ;

//with_clause
// : K_WITH K_RECURSIVE? cte_table_name K_AS '(' select_stmt ')' ( ',' cte_table_name K_AS '(' select_stmt ')' )*
// ;
qualified_table_name/*class*/
 : ( database_name/*c*/ '.' )? table_name/*c*/ ( K_INDEXED K_BY index_name/*c*/
                                     | K_NOT K_INDEXED )?
 ;

ordering_term/*class*/
 : expr ( K_COLLATE collation_name/*class*/ )? ( K_ASC | K_DESC )?
 ;

pragma_value
 : signed_number
 | name
 | STRING_LITERAL
 ;

common_table_expression
 : table_name ( '(' column_name ( ',' column_name )* ')' )? K_AS '(' select_stmt ')'
 ;

result_column/*class*/
 : '*'
 | table_name '.' '*'
 | expr ( K_AS? column_alias )?
 ;

table_or_subquery/*c*/
 : ( database_name '.' )? table_name ( K_AS? table_alias )? ( K_INDEXED K_BY index_name |  K_NOT K_INDEXED )?
 | '(' ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) ')' ( K_AS? table_alias )?
 | '(' select_core ')' ( K_AS? table_alias )?
 ;

join_clause/*class*/
 : table_or_subquery/*c*/ ( join_operator/*c*/ table_or_subquery join_constraint/*c*/ )*
 ;

join_operator/*c*/
 : ','
 |  ( K_LEFT K_OUTER? | K_INNER  )? K_JOIN
 ;

join_constraint/*c*/
:  K_ON expr
;
select_core/*c*/
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   from_clause ?
   where_clause?
   groupBy_clause ?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

 from_clause/*c*/
 :K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause )
 ;
 where_clause/*c*/
 :K_WHERE expr
 ;
 groupBy_clause/*c*/
 :K_GROUP K_BY expr ( ',' expr )*  having_clause?
 ;
 having_clause/*c*/
 : K_HAVING expr
 ;


signed_number/*class*/
 : ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
 ;

literal_value/*class*/
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ////////////
 //| IDENTIFIER ARRAY_BRACKET_WITH_INDEX
 ;

/*unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;*/

error_message
 : STRING_LITERAL
 ;

module_argument // TODO check what exactly is permitted here
 : expr
 | column_def
 ;

column_alias/*class*/
 : IDENTIFIER
 | STRING_LITERAL
 ;


keyword
 : K_ABORT
 | K_VAR
 | K_ACTION
 | K_ADD
 | K_AFTER
 | K_ALL
 | K_ALTER
 | K_ANALYZE
 | K_AND
 | K_AS
 | K_ASC
 | K_ATTACH
 | K_AUTOINCREMENT
 | K_BEFORE
 | K_BEGIN
 | K_BETWEEN
 | K_BY
 | K_CASCADE
 | K_CASE
 | K_CAST
 | K_CHECK
 | K_COLLATE
 | K_COLUMN
 | K_COMMIT
 | K_CONFLICT
 | K_CONSTRAINT
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DELETE
 | K_DESC
 | K_DETACH
 | K_DISTINCT
 | K_DROP
 | K_EACH
 | K_ELSE
 | K_END
 | K_ENABLE
 | K_ESCAPE
 | K_EXCEPT
 | K_EXCLUSIVE
 | K_EXISTS
 | K_EXPLAIN
 | K_FAIL
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IGNORE
 | K_IMMEDIATE
 | K_IN
 | K_INDEX
 | K_INDEXED
 | K_INITIALLY
 | K_INNER
 | K_INSERT
 | K_INSTEAD
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_MATCH
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PLAN
 | K_PRAGMA
 | K_PRIMARY
 | K_QUERY
 | K_RAISE
 | K_RECURSIVE
 | K_REFERENCES
 | K_REGEXP
 | K_REINDEX
 | K_RELEASE
 | K_RENAME
 | K_REPLACE
 | K_RESTRICT
 | K_RIGHT
 | K_ROLLBACK
 | K_ROW
 | K_SAVEPOINT
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_TEMP
 | K_TEMPORARY
 | K_THEN
 | K_TO
 | K_TRANSACTION
 | K_TRIGGER
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VACUUM
 | K_VALUES
 | K_VIEW
 | K_VIRTUAL
 | K_WHEN
 | K_WHERE
 | K_WITH
 | K_WITHOUT
 | K_NEXTVAL
 | K_WHILE
 | K_RETURN
 | K_TRY
 | K_CATCH
 | K_FINALLY
 | K_SWITCH
 | K_BREAK
 | K_DO
 | K_CONTINUE
 | K_PRINT
 | K_FUNCTION
 |K_FALSE
 |K_TRUE

 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+
//unknown
// : .+
// ;

name/*class*/
 : any_name
 ;

function_name/*class*/
 : any_name
 ;

database_name/*class*/
 : any_name
 ;

source_table_name/*class*/
 : any_name
 ;

/*table_name
 : any_name
 ;*/
 table_name/*class*/
  : tname
  ;


new_table_name/*class*/
 : any_name
 ;

column_name/*class*/
 : any_name
 ;

collation_name/*class*/
 : any_name
 ;

foreign_table/*class*/
 : any_name
 ;

index_name/*class*/
 : any_name
 ;

table_alias/*class*/
 : any_name
 ;



any_name/*class*/
 : IDENTIFIER
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;
 tname/*class*/
  : IDENTIFIER
  | STRING_LITERAL
  | '(' tname ')'
  ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
AMP2: '&&' ;
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';
///////////////////
SMALL_LP:'[';
SMALL_RP:']';
//////////////
ARRAY_BRACKET :'['SPACES*']';
//
ELEMENT_OF_ARRAY :IDENTIFIER '[' IDENTIFIER(('+'|'-'|'*'|'/')(NUMERIC_LITERAL|IDENTIFIER))?']' ;

ARRAY_BRACKET_WITH_INDEX : '['SPACES* (NUMERIC_LITERAL|IDENTIFIER(SPACES*('+'|'-'|'*'|'/')SPACES*(NUMERIC_LITERAL|IDENTIFIER))? |(IDENTIFIER  '++'|'++' IDENTIFIER))SPACES*']';
//CONTENT_OF_ARRY :'['(NUMERIC_LITERAL (',' NUMERIC_LITERAL)*)']';
//('{' expr (',' expr)*'}'|func_call|IDENTIFIER)
// http://www.sqlite.org/lang_keywords.html
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_VAR : V A R;
K_MYIF:M Y I F;
K_MYELSE:M Y E L S E;
K_WHILE: W H I L E;
K_RETURN:R E T U R N;
K_TRY:T R Y;
K_CATCH: C A T C H;
K_FINALLY:F I N A L L Y;
K_SWITCH:S W I T C H ;
K_BREAK:B R E A K ;
K_DO : D O ;
K_CONTINUE : C O N T I N U E ;
K_PRINT : P R I N T;
K_FUNCTION : F U N C T I O N;
K_FALSE : F A L S E ;
K_TRUE : T R U E ;
IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 //| '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;


NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''

 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

/*SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;
*/
MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
