package Java.AST.QueryStmt;

import Java.AST.AnyName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ForeignTable extends Node {
    public AnyName anyNamee;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        anyNamee.accept(astVisitor);

    }
}
