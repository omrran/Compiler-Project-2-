package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.security.PublicKey;

public class AssignValueToPropertyJson extends Node {
    public exper val;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        val.accept(astVisitor);


    }
}
