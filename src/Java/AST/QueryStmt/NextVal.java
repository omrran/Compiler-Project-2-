package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class NextVal extends Node {
    public exper expr;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expr.accept(astVisitor);
    }
}
