package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class HavingClause extends Node {
    public exper exp;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        this.exp.accept(astVisitor);


    }
}
