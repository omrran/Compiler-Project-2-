package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableAdd extends Node {
    public TableConstraint tableConstraint;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        tableConstraint.accept(astVisitor);
    }
}
