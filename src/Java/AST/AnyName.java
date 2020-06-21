package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class AnyName extends Node {
    public String value;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("Name : "+value);

    }

}
