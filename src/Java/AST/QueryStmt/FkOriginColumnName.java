package Java.AST.QueryStmt;

import Java.AST.ColumnName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class FkOriginColumnName extends Node {
    public ColumnName columnName ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        columnName.accept(astVisitor);
    }
}
