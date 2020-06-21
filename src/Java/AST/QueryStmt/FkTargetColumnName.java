package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class FkTargetColumnName extends Node {
    public Name n;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        n.accept(astVisitor);
    }
}
