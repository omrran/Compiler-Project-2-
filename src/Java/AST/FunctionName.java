package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class FunctionName extends Node {
    public AnyName anyName;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        anyName.accept(astVisitor);

    }
}
