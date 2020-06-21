package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class UnaryExper extends Node {

    public String operand;
    public exper exp;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("operand : "+ this.operand);
        this.exp.accept(astVisitor);
    }
}
