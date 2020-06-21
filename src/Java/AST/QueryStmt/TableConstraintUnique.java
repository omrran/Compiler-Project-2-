package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class TableConstraintUnique extends Node {
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

    }
}
