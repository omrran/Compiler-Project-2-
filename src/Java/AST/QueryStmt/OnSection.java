package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class OnSection extends Node {
    public String ON,DELETE,UPDATE,SET_NULL,SET_DEFAULT,CASCADE,RESTRICT,NO_ACTION;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        System.out.println(ON);


        if(DELETE!=null){
            System.out.println(DELETE);
        }
        if(UPDATE!=null){
            System.out.println(UPDATE);
        }
        if(SET_NULL!=null){
            System.out.println(SET_NULL);
        }
        if(SET_DEFAULT!=null){
            System.out.println(SET_DEFAULT);
        }
        if(CASCADE!=null){
            System.out.println(CASCADE);
        }
        if(RESTRICT!=null){
            System.out.println(RESTRICT);
        }
        if(NO_ACTION!=null){
            System.out.println(NO_ACTION);
        }
    }
}
