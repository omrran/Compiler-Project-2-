package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class SelectStmt extends SqlStatement {
    public SelectOrValues selectOrValues ;
    public List<OrderingTerm> orderingTermList = new ArrayList<OrderingTerm>();
    public List<exper> experList = new ArrayList<exper>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        selectOrValues.accept(astVisitor);
        for (int i = 0 ;i<orderingTermList.size();i++){
            orderingTermList.get(i).accept(astVisitor);
        }
        for (int i = 0 ;i<experList.size();i++){
            experList.get(i).accept(astVisitor);
        }



    }
}
