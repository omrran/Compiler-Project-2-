package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class JoinOperator extends Node {
    public String joinOperator;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println(joinOperator);
    }
}
