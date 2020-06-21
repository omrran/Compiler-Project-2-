package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class PrintStatm extends Node {

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

    }
}
