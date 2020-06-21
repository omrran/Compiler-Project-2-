package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ColumnAlias extends Node {
    public String IDENTIFIER,STRING_LITERAL;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(IDENTIFIER!=null){
            System.out.println(IDENTIFIER);
        }
        else if(STRING_LITERAL!=null){
            System.out.println(STRING_LITERAL);
        }
    }
}
