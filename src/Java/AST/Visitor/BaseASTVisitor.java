package Java.AST.Visitor;

import Java.AST.*;
import Java.AST.QueryStmt.*;

public class BaseASTVisitor implements ASTVisitor {
    @Override public void visit(Parse p) {
        System.out.println("ast parse ");
    }
    @Override public void visit(FunctionDeclaration funcDec) {
        System.out.println("ast FunctionDeclaration ");
    }
    @Override public void visit(Statement stmt) {
        System.out.println("ast Statement ");
    }
    @Override public void visit(SelectStmt selectStmt) {
        System.out.println("ast selectStmt ");
    }
    @Override public void visit(SourceTableName sourceTableName) {
        System.out.println("ast SourceTableName ");
    }
    @Override public void visit(TableAlias tableAlias) { System.out.println("ast TableAlias "); }
    @Override public void visit(TableConstraint tableConstraint) { System.out.println("ast TableConstraint "); }
    @Override public void visit(TableConstraintForeignKey tableConstraintForeignKey) { System.out.println("ast TableConstraintForeignKey "); }
    @Override public void visit(TableConstraintKey tableConstraintKey) { System.out.println("ast TableConstraintKey "); }
    @Override public void visit(TableConstraintPrimaryKey tableConstraintPrimaryKey) { System.out.println("ast TableConstraintPrimaryKey "); }
    @Override public void visit(TableConstraintUnique tableConstraintUnique) {
        System.out.println("ast TableConstraintUnique ");

    }

    @Override
    public void visit(TableOrSubquery tableOrSubquery) {
        System.out.println("ast TableOrSubquery ");

    }

    @Override
    public void visit(TypeName typeName) {
        System.out.println("ast TypeName ");

    }

    @Override
    public void visit(Update update) {
        System.out.println("ast Update ");

    }

    @Override
    public void visit(WhereClause whereClause) {
        System.out.println("ast WhereClause ");

    }

    @Override
    public void visit(AnyNameColon anyNameColon) {
        System.out.println("ast AnyNameColon ");

    }

    @Override
    public void visit(ColumnConstraintPrimaryKey columnConstraintPrimaryKey) {
        System.out.println("ast ColumnConstraintPrimaryKey");
    }

    @Override
    public void visit(ColumnConstraintForeignKey columnConstraintForeignKey) {
        System.out.println("ast ColumnConstraintForeignKey");
    }

    @Override
    public void visit(ColumnConstraintNotNull columnConstraintNotNull) {
        System.out.println("ast ColumnConstraintNotNull");
    }

    @Override
    public void visit(ColumnConstraintNull columnConstraintNull) {
        System.out.println("ast ColumnConstraintNull");
    }

    @Override
    public void visit(ColumnDefaultValue columnDefaultValue) {
        System.out.println("ast ColumnDefaultValue");
    }

    @Override
    public void visit(FkOriginColumnName fkOriginColumnName) {
        System.out.println("ast FkOriginColumnName");
    }

    @Override
    public void visit(FkTargetColumnName fkTargetColumnName) {
        System.out.println("ast FkTargetColumnName");
    }

    @Override
    public void visit(ForeignKeyClause foreignKeyClause) {
        System.out.println("ast ForeignKeyClause");
    }

    @Override
    public void visit(ColumnDefault columnDefault) {
        System.out.println("ast ColumnDefault");
    }

    @Override
    public void visit(JoinConstraint joinConstraint) {
        System.out.println("ast JoinConstraint");
    }

    @Override
    public void visit(JoinClause joinClause) {
        System.out.println("ast JoinClause");
    }

    @Override
    public void visit(JoinOperator joinOperator) {
        System.out.println("ast JoinOperator");
    }

    @Override
    public void visit(NextVal nextVal) {
        System.out.println("ast NextVal");
    }

    @Override
    public void visit(ColumnAlias columnAlias) {
        System.out.println("ast ColumnAlias");
    }

    @Override
    public void visit(SignedNumber signedNumber) {
        System.out.println("ast SignedNumber");
    }

    @Override
    public void visit(ForeignTable foreignTable) {
        System.out.println("ast ForeignTable");
    }

    @Override
    public void visit(SelectOrValues selectOrValues) {
        System.out.println("ast SelectOrValues");
    }

    @Override
    public void visit(OnSectionOrMatchName onSectionOrMatchName) {
        System.out.println("ast OnSectionOrMatchName");
    }

    @Override
    public void visit(OnSection onSection) {
        System.out.println("ast OnSection");
    }

    @Override
    public void visit(MatchName matchName) {
        System.out.println("ast MatchName");
    }

    @Override public void visit(IfStatm ifStatm) {
        System.out.println("ast IfStatm ");
    }
    @Override public void visit(WhileStatm whileStatm) {
        System.out.println("ast whileStatm ");
    }
    @Override public void visit(doWhile doWhilestatm)
    {
        System.out.println("ast doWhile ");
    }
    @Override public void visit(ForStatm forStatm) {
        System.out.println("ast forStatm ");
    }
    @Override public void visit(ForEachStatm forEachStatm) {
        System.out.println("ast forEachStatm ");
    }
    @Override public void visit(SwitchStatm switchStatm) {
        System.out.println("ast switchStatm ");
    }
    @Override public void visit(all_statm allStatm) {
        System.out.println("ast allStatm ");
    }
    @Override public void visit(ArrayOnDimention arrayOnDimention) {
        System.out.println("ast ArrayOnDimention ");
    }
    @Override public void visit(ContentsOfArray contentsOfArray){System.out.println("ast ContentsOfArray ");}
    @Override public void visit(AssignValueToPropertyJson assignValueToPropertyJson) {
        System.out.println("ast AssignValueToPropertyJson ");

    }
    @Override public void visit(BodyFunc bodyFunc) {
        System.out.println("ast BodyFunc ");

    }
    @Override public void visit(BreakStatm breakStatm) {
        System.out.println("ast BreakStatm ");

    }
    @Override public void visit(CasePart casePart) {
        System.out.println("ast CasePart ");

    }
    @Override public void visit(Continuestatm continuestatm) {
        System.out.println("ast ContinueStatem ");

    }
    @Override public void visit(DeclareVar declareVar) {
        System.out.println("ast DeclareVar ");

    }
    @Override public void visit(decrement dec) {
        System.out.println("ast decrement ");

    }
    @Override public void visit(DefaultPart defaultPart) {
        System.out.println("ast DefaultPart ");

    }
    @Override public void visit(else_if elseIf) {
        System.out.println("ast else_if ");

    }
    @Override public void visit(else_stm elseStm) {
        System.out.println("ast else_stm ");

    }
    @Override public void visit(exper exp) {
        System.out.println("ast exper ");

    }
    @Override public void visit(first_sec firstSec) {
        System.out.println("ast first_sec ");

    }
    @Override public void visit(FunctionCall functionCall) {
        System.out.println("ast FunctionCall ");

    }
    @Override public void visit(Argument argument) {
        System.out.println("ast Argument ");

    }
    @Override public void visit(HeaderFunc headerFunc) {
        System.out.println("ast HeaderFunc ");

    }
    @Override public void visit(HigherOrderFunc higherOrderFunc) {
        System.out.println("ast HigherOrderFunc ");

    }
    @Override public void visit(increment inc) {
        System.out.println("ast increment ");

    }
    @Override public void visit(InitialVar initialVar) {
        System.out.println("ast InitialVar ");

    }
    @Override public void visit(JsonBody jsonBody) {
        System.out.println("ast JsonBody ");

    }

    @Override
    public void visit(ValueOfPropertys valueOfPropertys) {
        System.out.println("ast value of propertys ");

    }

    @Override public void visit(Literal_value literalValue) {
        System.out.println("ast Literal_value ");

    }

    @Override public void visit(BD_Table_Column_name bd_table_column_name) {
        System.out.println("ast DB_Table_Column_name ");
    }

    @Override
    public void visit(UnaryExper unaryExper) {
        System.out.println("ast UnaryExper");
    }

    @Override
    public void visit(MathExpr mathExpr) {
        System.out.println("ast MathExpr");
    }

    @Override
    public void visit(LogicExpr logicExpr) {
        System.out.println("ast LogicExpr");
    }

    @Override
    public void visit(CallFuncInExpr callFuncInExpr) {
        System.out.println("ast CallFuncInExpr");
    }

    @Override
    public void visit(FunctionName functionName) {
        System.out.println("ast FunctionName");
    }

    @Override
    public void visit(Expr_enclose_with_brackets expr_enclose_with_brackets) {
        System.out.println("ast Expr_enclose_with_brackets");
    }

    @Override
    public void visit(Select_enclose_with_brackets select_enclose_with_brackets) {
        System.out.println("ast Select_enclose_with_brackets");
    }

    @Override
    public void visit(DateBaseName dateBaseName) {
        System.out.println("ast DateBaseName");
    }

    @Override
    public void visit(TableName tableName) {
        System.out.println("ast TableName");
    }

    @Override
    public void visit(ColumnName columnName) {
        System.out.println("ast ColumnName");
    }

    @Override
    public void visit(AnyName anyName) {
        System.out.println("ast AnyName");
    }

    @Override
    public void visit(Tname tname) {
        System.out.println("ast Tname");
    }

    @Override
    public void visit(AlterTable alterTable) {
        System.out.println("ast AlterTable");
    }

    @Override
    public void visit(AlterTableAdd alterTableAdd) {
        System.out.println("ast AlterTableAdd");

    }

    @Override
    public void visit(AlterTableAddConstraint alterTableAddConstraint) {
        System.out.println("ast AlterTableAddConstraint");

    }

    @Override
    public void visit(CollationName collationName) {
        System.out.println("ast CollationName");

    }

    @Override
    public void visit(ColumnConstraint columnCconstraint) {
        System.out.println("ast ColumnCconstraint");

    }

    @Override
    public void visit(ColumnDef columnDef) {
        System.out.println("ast ColumnDef");

    }

    @Override
    public void visit(CreateTable createTable) {
        System.out.println("ast CreateTable");

    }

    @Override
    public void visit(Delete delete) {
        System.out.println("ast Delete");

    }

    @Override
    public void visit(DropTable dropTable) {
        System.out.println("ast DropTable");

    }

    @Override
    public void visit(FactoredSelect factoredSelect) {
        System.out.println("ast FactoredSelect");

    }

    @Override
    public void visit(FromClause fromClause) {
        System.out.println("ast FromClause");

    }

    @Override
    public void visit(GroupByClause groupByClause) {
        System.out.println("ast GroupByClause");

    }

    @Override
    public void visit(HavingClause havingClause) {
        System.out.println("ast HavingClause");

    }

    @Override
    public void visit(IndexedColumn indexedColumn) {
        System.out.println("ast IndexedColumn");

    }

    @Override
    public void visit(IndexName indexName) {
        System.out.println("ast IndexName");

    }

    @Override
    public void visit(Insert insert) {
        System.out.println("ast Insert");

    }

    @Override
    public void visit(Join join) {
        System.out.println("ast Join");

    }

    @Override
    public void visit(Name name) {
        System.out.println("ast Name");

    }

    @Override
    public void visit(NewTableName newTableName) {
        System.out.println("ast NewTableName");

    }

    @Override
    public void visit(OrderingTerm orderingTerm) {
        System.out.println("ast OrderingTerm");

    }

    @Override
    public void visit(QualifiedTableName qualifiedTableName) {
        System.out.println("ast QualifiedTableName");

    }

    @Override
    public void visit(ResultColumn resultColumn) {
        System.out.println("ast ResultColumn");

    }

    @Override
    public void visit(SelectCore selectCore) {
        System.out.println("ast SelectCore");

    }

    @Override public void visit(OneLineCond oneLineCond) {
        System.out.println("ast OneLineCond ");

    }
    @Override public void visit(ParameterWithValues parameterWithValues) {
        System.out.println("ast ParameterWithValues ");

    }
    @Override public void visit(ParemeterWithOutValues paremeterWithOutValues) {
        System.out.println("ast ParemeterWithOutValues ");

    }
    @Override public void visit(ParameterMix parameterMix) {
        System.out.println("ast ParameterMix ");

    }
    @Override public void visit(PrintStatm printStatm) {
        System.out.println("ast PrintStatm ");

    }
    @Override public void visit(ReadPropertyJson readPropertyJson) {
        System.out.println("ast ReadPropertyJson ");

    }
    @Override public void visit(ReturnStarment returnStarment) {
        System.out.println("ast ReturnStatement ");

    }
    @Override public void visit(second_sec secondSec) {
        System.out.println("ast second_sec ");

    }
    @Override public void visit(third_sec thirdSec) {
        System.out.println("ast third_sec ");

    }
    /////////////////////////////////////////////////////


}
