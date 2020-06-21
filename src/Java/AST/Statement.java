package Java.AST;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class Statement extends Node {


    private String name;
    public void setName(String name) {
       this.name = name;
    }

    public String getName() {
       return name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        //super.accept(astVisitor);
    }

    
}
