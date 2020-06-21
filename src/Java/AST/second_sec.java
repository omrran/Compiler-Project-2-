package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class second_sec extends Node {
    public exper exp;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        exp.accept(astVisitor);


        //super.accept(astVisitor);
    }
}
