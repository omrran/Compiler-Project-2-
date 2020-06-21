package Java.AST.QueryStmt;

import Java.AST.AnyName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class AlterTableAddConstraint extends Node {
    public AnyName anyName ;
    public TableConstraint tableConstraint;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        anyName.accept(astVisitor);
        tableConstraint.accept(astVisitor);
    }

}
