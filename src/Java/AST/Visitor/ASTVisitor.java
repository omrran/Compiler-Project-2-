package Java.AST.Visitor;


import Java.AST.*;
import Java.AST.QueryStmt.*;

public interface ASTVisitor {
    public void visit(Parse p);
    public void visit(FunctionDeclaration funcDec);
    public void visit(Statement stmt);
    public void visit(IfStatm ifStatm);
    public void visit(WhileStatm whileStatm);
    public void visit(doWhile doWhile);
    public void visit(ForStatm forStatm);
    public void visit(ForEachStatm forEachStatm);
    public void visit(SwitchStatm switchStatm);
    public void visit(all_statm allStatm);
    public void visit(ArrayOnDimention arrayOnDimention);
    public void visit(ContentsOfArray contentsOfArray);
    public void visit(AssignValueToPropertyJson assignValueToPropertyJson);
    public void visit(BodyFunc bodyFunc);
    public void visit(BreakStatm breakStatm);
    public void visit(CasePart casePart);
    public void visit(Continuestatm continuestatm);
    public void visit(DeclareVar declareVar);
    public void visit(decrement dec);
    public void visit(DefaultPart defaultPart);
    public void visit(else_if elseIf);
    public void visit(else_stm elseStm);
    public void visit(first_sec firstSec);
    public void visit(FunctionCall functionCall);
    public void visit(Argument argument);
    public void visit(HeaderFunc headerFunc);
    public void visit(HigherOrderFunc higherOrderFunc);
    public void visit(increment inc);
    public void visit(InitialVar initialVar);
    public void visit(JsonBody jsonBody);
    public void visit(ValueOfPropertys valueOfPropertys);
    public void visit(OneLineCond oneLineCond);
    public void visit(ParameterWithValues parameterWithValues);
    public void visit(ParemeterWithOutValues paremeterWithOutValues);
    public void visit(ParameterMix parameterMix);
    public void visit(PrintStatm printStatm);
    public void visit(ReadPropertyJson readPropertyJson);
    public void visit(ReturnStarment returnStarment);
    public void visit(second_sec secondSec);
    public void visit(third_sec thirdSec);
    public void visit(exper exp);
    public void visit(Literal_value literalValue);
    public void visit(BD_Table_Column_name bd_table_column_name);
    public void visit(UnaryExper unaryExper);
    public void visit(MathExpr mathExpr);
    public void visit(LogicExpr logicExpr);
    public void visit(CallFuncInExpr callFuncInExpr);
    public void visit(FunctionName functionName);
    public void visit(Expr_enclose_with_brackets expr_enclose_with_brackets);
    public void visit(Select_enclose_with_brackets select_enclose_with_brackets);
    public void visit(DateBaseName dateBaseName);
    public void visit(TableName tableName);
    public void visit(ColumnName columnName);
    public void visit(AnyName anyName);
    public void visit(Tname tname);
    public void visit(AlterTable alterTable);
    public void visit(AlterTableAdd alterTableAdd);
    public void visit(AlterTableAddConstraint alterTableAddConstraint);
    public void visit(CollationName collationName);
    public void visit(ColumnConstraint columnCconstraint);
    public void visit(ColumnDef columnDef);
    public void visit(CreateTable createTable);
    public void visit(Delete delete);
    public void visit(DropTable dropTable);
    public void visit(FactoredSelect factoredSelect);
    public void visit(FromClause fromClause);
    public void visit(GroupByClause groupByClause);
    public void visit(HavingClause havingClause);
    public void visit(IndexedColumn indexedColumn);
    public void visit(IndexName indexName);
    public void visit(Insert insert);
    public void visit(Join join);
    public void visit(Name name);
    public void visit(NewTableName newTableName);
    public void visit(OrderingTerm orderingTerm);
    public void visit(QualifiedTableName qualifiedTableName);
    public void visit(ResultColumn resultColumn);
    public void visit(SelectCore selectCore);
    public void visit(SelectStmt selectStmt);
    public void visit(SourceTableName sourceTableName);
    public void visit(TableAlias tableAlias);
    public void visit(TableConstraint tableConstraint);
    public void visit(TableConstraintForeignKey tableConstraintForeignKey);
    public void visit(TableConstraintKey tableConstraintKey);
    public void visit(TableConstraintPrimaryKey tableConstraintPrimaryKey);
    public void visit(TableConstraintUnique tableConstraintUnique);
    public void visit(TableOrSubquery tableOrSubquery);
    public void visit(TypeName typeName);
    public void visit(Update update);
    public void visit(WhereClause whereClause);
    public void visit(AnyNameColon anyNameColon);
    public void visit(ColumnConstraintPrimaryKey columnConstraintPrimaryKey);
    public void visit(ColumnConstraintForeignKey columnConstraintForeignKey);
    public void visit(ColumnConstraintNotNull columnConstraintNotNull);
    public void visit(ColumnConstraintNull columnConstraintNull);
    public void visit(ColumnDefaultValue columnDefaultValue);
    public void visit(FkOriginColumnName fkOriginColumnName);
    public void visit(FkTargetColumnName fkTargetColumnName);
    public void visit(ForeignKeyClause foreignKeyClause);
    public void visit(ColumnDefault columnDefault);
    public void visit(JoinConstraint joinConstraint);
    public void visit(JoinClause joinClause);
    public void visit(JoinOperator joinOperator);
    public void visit(NextVal nextVal);
    public void visit(ColumnAlias columnAlias);
    public void visit(SignedNumber signedNumber);
    public void visit(OnSectionOrMatchName onSectionOrMatchName);
    public void visit(OnSection onSection);
    public void visit(MatchName matchName);
    public void visit(ForeignTable foreignTable);
    public void visit(SelectOrValues selectOrValues);








}
