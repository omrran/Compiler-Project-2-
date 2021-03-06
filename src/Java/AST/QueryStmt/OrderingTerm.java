package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class OrderingTerm extends Node {
    public exper expr ;
    public CollationName collationName;
    public String ASC , DESC ;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        expr.accept(astVisitor);
        if(collationName!=null){
            collationName.accept(astVisitor);
        }
        if(ASC!=null){
            System.out.println(ASC);
        }
        if(DESC!=null){
            System.out.println(DESC);
        }
    }

}
