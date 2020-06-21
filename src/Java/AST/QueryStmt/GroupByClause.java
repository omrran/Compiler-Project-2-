package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

import java.util.ArrayList;
import java.util.List;

public class GroupByClause extends Node {
    public List<exper> experList = new ArrayList<exper>();
    public HavingClause havingClause;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i =0 ;i<experList.size();i++){
            experList.get(i).accept(astVisitor);
        }
        if(havingClause!=null){
            havingClause.accept(astVisitor);
        }

    }
}
