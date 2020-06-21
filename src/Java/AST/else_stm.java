package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class else_stm extends Statement {
    public List<all_statm> bodyElseStm = new ArrayList<all_statm>();



    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i=0 ;i <bodyElseStm.size();i++)
        {
            bodyElseStm.get(i).accept(astVisitor);
        }


        //super.accept(astVisitor);
    }


}
