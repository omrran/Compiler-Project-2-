package Java.AST.QueryStmt;

import Java.AST.AnyName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class SourceTableName extends Node {
    public AnyName anyName ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        anyName.accept(astVisitor);
    }
}
