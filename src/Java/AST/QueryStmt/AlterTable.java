package Java.AST.QueryStmt;

import Java.AST.*;
import Java.AST.Visitor.ASTVisitor;

public class AlterTable extends SqlStatement {

    public DateBaseName dateBaseName ;
    public SourceTableName sourceTableName;
    public NewTableName newTableName;
    public AlterTableAdd alterTableAdd;
    public AlterTableAddConstraint alterTableAddConstraint;
    public ColumnDef columnDef ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(dateBaseName!=null){
            dateBaseName.accept(astVisitor);
        }
        sourceTableName.accept(astVisitor);
        if(newTableName!=null){
            newTableName.accept(astVisitor);
        }
        if(alterTableAdd!=null){
            alterTableAdd.accept(astVisitor);
        }
        if(alterTableAddConstraint!=null){
            alterTableAddConstraint.accept(astVisitor);
        }
        if(columnDef!=null){
            columnDef.accept(astVisitor);
        }

    }

}
