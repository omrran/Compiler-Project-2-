package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

// ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
public class SignedNumber extends Node {
    public String sign , NUMERIC_LITERALL,star;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(sign!=null){
            System.out.println(sign);
        }
        if(NUMERIC_LITERALL!=null){
            System.out.println(NUMERIC_LITERALL);
        }
        if(star!=null){
            System.out.println(star);
        }
    }
}
