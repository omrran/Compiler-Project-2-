package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class ReadPropertyJson extends Node {
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        //super.accept(astVisitor);
    }
}