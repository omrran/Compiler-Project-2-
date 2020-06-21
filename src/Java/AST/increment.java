package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class increment extends Node {

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        //super.accept(astVisitor);
    }
}
