package Java.AST.QueryStmt;

import Java.AST.ColumnName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class IndexedColumn extends Node {
    public ColumnName columnName;
    public CollationName collationName ;
    public String ASC , DESC;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        columnName.accept(astVisitor);

        if(collationName!=null){
            collationName.accept(astVisitor);
        }
        if (ASC!=null) {
            System.out.println(ASC);
        }
        if (DESC!=null) {
            System.out.println(DESC);
        }

    }

}
