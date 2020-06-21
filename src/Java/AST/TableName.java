package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class TableName extends Node {
    public Tname tname;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.tname.accept(astVisitor);

    }
}
