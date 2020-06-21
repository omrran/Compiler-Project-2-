package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class MatchName extends Node {
    public Name name;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        name.accept(astVisitor);
    }
}
