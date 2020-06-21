package Java.AST;

import Java.AST.QueryStmt.SelectStmt;
import Java.AST.Visitor.ASTVisitor;

public class Select_enclose_with_brackets extends Node {
        public String NOT;
        public String EXISTS ;
        public SelectStmt selectStmt ;//?!

        @Override
        public void accept(ASTVisitor astVisitor) {
                astVisitor.visit(this);

                if(NOT!=null){
                        System.out.println(NOT);
                }
                if(EXISTS!=null){
                        System.out.println(EXISTS);
                }

        }
}
