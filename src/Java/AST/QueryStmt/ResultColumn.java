package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.TableName;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class ResultColumn extends Node {
    public String star1,star2;
    public TableName tableName;
    public exper exp ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(star1!=null){
            System.out.println(star1);
        }
        if(tableName!=null){
            tableName.accept(astVisitor);
            System.out.println(star2);
        }
        if(exp!=null){
            exp.accept(astVisitor);
        }
    }
}
