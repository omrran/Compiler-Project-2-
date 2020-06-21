package Java.AST.QueryStmt;

import Java.AST.DateBaseName;
import Java.AST.Node;
import Java.AST.TableName;
import Java.AST.Visitor.ASTVisitor;

public class QualifiedTableName extends Node {
    public DateBaseName dateBaseName;
    public TableName tableName;
    public IndexName indexName;
    public String NOT_INDEXED;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(dateBaseName!=null){
            dateBaseName.accept(astVisitor);
        }
        tableName.accept(astVisitor);

        if(indexName!=null){
            indexName.accept(astVisitor);
        }
        if(NOT_INDEXED!=null){
            System.out.println(NOT_INDEXED);
        }
    }
}
