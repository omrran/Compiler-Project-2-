package Java.AST;



import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class BodyFunc extends Node {
    ///////begin
    private List<all_statm> Stmts = new ArrayList<all_statm>();




    public void addStmts(all_statm stm){
        this.Stmts.add(stm);
    }

    public void setStmts(List<all_statm> Stmts) {
        this.Stmts = Stmts;
    }

    public List<all_statm> getStmts() {
        return this.Stmts;
    }
   // public String getCount (){return Stmts.}
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        System.out.println("number of Statements in this Function : "+  this.Stmts.size());


        for(int i=0 ;i< this.Stmts.size();i++) {
            this.Stmts.get(i).accept(astVisitor);
        }

        //super.accept(astVisitor);
    }
    ///////end
}
