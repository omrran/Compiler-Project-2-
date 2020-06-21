package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class Argument extends Node {

    public exper expr ;
    public String elementOfArray ;


    @Override
    public void accept(ASTVisitor astVisitor) {
        if(expr!=null){
            expr.accept(astVisitor);
        }
        else if (elementOfArray!=null){
            System.out.println(elementOfArray);
        }

    }
}
