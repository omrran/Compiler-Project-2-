// Generated from C:/Users/SCC/Desktop/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignment_query_to_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_query_to_var(SQLParser.Assignment_query_to_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#func_statment_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_statment_list(SQLParser.Func_statment_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#func_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_statment(SQLParser.Func_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#prototype_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype_func(SQLParser.Prototype_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameter_list_without_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list_without_values(SQLParser.Parameter_list_without_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameter_list_with_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list_with_values(SQLParser.Parameter_list_with_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameter_list_mix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list_mix(SQLParser.Parameter_list_mixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#block_of_stms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_of_stms(SQLParser.Block_of_stmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#all_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_stm(SQLParser.All_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stm(SQLParser.If_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#compare_element_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_element_array(SQLParser.Compare_element_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(SQLParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stm(SQLParser.Else_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stm(SQLParser.While_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#do_while_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stm(SQLParser.Do_while_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stm(SQLParser.For_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#first_sec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_sec(SQLParser.First_secContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#second_sec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_sec(SQLParser.Second_secContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#third_sec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThird_sec(SQLParser.Third_secContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_each_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_stm(SQLParser.For_each_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#try_catch_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_stm(SQLParser.Try_catch_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#one_line_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_cond(SQLParser.One_line_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_one_dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_one_dimension(SQLParser.Array_one_dimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#contents_of_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContents_of_array(SQLParser.Contents_of_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#initialize_array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize_array_element(SQLParser.Initialize_array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stm(SQLParser.Switch_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_part(SQLParser.Case_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#default_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_part(SQLParser.Default_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#break_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stm(SQLParser.Break_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#continue_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stm(SQLParser.Continue_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(SQLParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SQLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stm(SQLParser.Print_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#higher_order_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigher_order_func(SQLParser.Higher_order_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_stmt(SQLParser.Json_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_body(SQLParser.Json_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value_of_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_of_property(SQLParser.Value_of_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(SQLParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(SQLParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#read_property_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_property_json(SQLParser.Read_property_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignment_value_to_property_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_value_to_property_json(SQLParser.Assignment_value_to_property_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declare_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_variable(SQLParser.Declare_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#initialize_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize_variable(SQLParser.Initialize_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stm(SQLParser.Return_stmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#next_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_val(SQLParser.Next_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_colon(SQLParser.Any_name_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#bd_table_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBd_table_column_name(SQLParser.Bd_table_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(SQLParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#call_function_in_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function_in_expr(SQLParser.Call_function_in_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr_enclose_with_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_enclose_with_brackets(SQLParser.Expr_enclose_with_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_enclose_with_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_enclose_with_brackets(SQLParser.Select_enclose_with_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#on_sectin_or_matchName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_sectin_or_matchName(SQLParser.On_sectin_or_matchNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#on_sectin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_sectin(SQLParser.On_sectinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#match_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_name(SQLParser.Match_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(SQLParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupBy_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy_clause(SQLParser.GroupBy_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SQLParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTname(SQLParser.TnameContext ctx);
}