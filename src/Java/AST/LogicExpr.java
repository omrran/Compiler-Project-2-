package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class LogicExpr extends Node {
    public exper leftExpr;
    public String indexOfArray;
    public String operand;
    public exper RightExpr;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.leftExpr.accept(astVisitor);
        if(indexOfArray!=null){
            System.out.println("index of array : "+this.indexOfArray);
        }
        System.out.println("operand :: "+operand);
        this.RightExpr.accept(astVisitor);
    }
}
