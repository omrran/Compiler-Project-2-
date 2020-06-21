package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

import java.util.ArrayList;
import java.util.List;

public class SelectCore extends Node {
    public List<ResultColumn> resultColumnList = new ArrayList<ResultColumn>();
    public FromClause fromClause;
    public WhereClause whereClause;
    public GroupByClause groupByClause;
    public List<exper> experList =new ArrayList<exper>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i=0 ; i<resultColumnList.size();i++){
            resultColumnList.get(i).accept(astVisitor);
        }
        if(fromClause!=null){
            fromClause.accept(astVisitor);
        }
        if(whereClause!=null){
            whereClause.accept(astVisitor);
        }
        if(groupByClause!=null){
            groupByClause.accept(astVisitor);
        }
        for(int i=0 ; i<experList.size();i++){
            experList.get(i).accept(astVisitor);
        }

    }
}
