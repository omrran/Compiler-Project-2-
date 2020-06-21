package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class JoinConstraint extends Node {
    public exper exr;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        exr.accept(astVisitor);
    }
}
