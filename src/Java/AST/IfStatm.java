package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class IfStatm extends Node {

    public exper expr =new exper();
    public List<all_statm> bodyIf = new ArrayList<all_statm>();
    public List<else_if> elseIf =new ArrayList<else_if>();
    public else_stm elseStm ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(this.expr!=null){
            this.expr.accept(astVisitor);
        }

        for(int i=0 ;i<this.bodyIf.size();i++){
            this.bodyIf.get(i).accept(astVisitor);
        }
        for(int i=0 ;i<this.elseIf.size();i++){
            this.elseIf.get(i).accept(astVisitor);
        }
        if (this.elseStm!=null){
            this.elseStm.accept(astVisitor);
        }



    }


}
