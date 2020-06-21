package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

import java.util.ArrayList;
import java.util.List;

public class FactoredSelect extends SqlStatement {
    public SelectCore selectCore;
    public List<OrderingTerm> orderingTermList = new ArrayList<OrderingTerm>();
    public List<exper> experList =new ArrayList<exper>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        selectCore.accept(astVisitor);
        for(int i=0 ; i<orderingTermList.size();i++){
            orderingTermList.get(i).accept(astVisitor);
        }
        for(int i=0 ; i<experList.size();i++){
            experList.get(i).accept(astVisitor);
        }
    }
}
