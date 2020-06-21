package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ColumnConstraintForeignKey extends Node {
    public ForeignKeyClause foreignKeyClause ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        foreignKeyClause.accept(astVisitor);
    }
}
