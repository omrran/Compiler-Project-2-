package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ColumnConstraintNull extends Node {
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
}
}
