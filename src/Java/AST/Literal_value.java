package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class Literal_value extends Node {
    public String value;



    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("value of expr : "+value);

        //super.accept(astVisitor);
    }
}
