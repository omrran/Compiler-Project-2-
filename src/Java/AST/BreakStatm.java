package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class BreakStatm extends Node {

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);


    }
}
