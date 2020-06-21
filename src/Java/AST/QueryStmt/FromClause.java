package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FromClause extends Node {
    public List<TableOrSubquery> tableOrSubqueryList =new ArrayList<TableOrSubquery>();
    public JoinClause join;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i =0 ;i<tableOrSubqueryList.size();i++){
            tableOrSubqueryList.get(i).accept(astVisitor);
        }
        if(join!=null){
            join.accept(astVisitor);
        }

    }
}
