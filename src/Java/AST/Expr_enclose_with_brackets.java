package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class Expr_enclose_with_brackets extends Node {
    public exper exp;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        exp.accept(astVisitor);
    }
}
