package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class BD_Table_Column_name extends Node {
    public DateBaseName dateBaseName;
    public TableName tableName;
    public ColumnName columnName;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(this.dateBaseName!=null){
            this.dateBaseName.accept(astVisitor);
        }
        if(this.tableName!=null){
            this.tableName.accept(astVisitor);
        }
        this.columnName.accept(astVisitor);



    }
}
