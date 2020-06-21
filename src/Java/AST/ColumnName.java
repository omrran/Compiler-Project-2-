package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class ColumnName extends Node {
    public AnyName anyName;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.anyName.accept(astVisitor);


    }
}
