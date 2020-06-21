package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class JoinClause extends Node {
    public List<TableOrSubquery> tableOrSubqueryList = new ArrayList<TableOrSubquery>();
    public List<JoinOperator> joinOperatorList = new ArrayList<JoinOperator>();
    public List<JoinConstraint> joinConstraints = new ArrayList<JoinConstraint>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        tableOrSubqueryList.get(0).accept(astVisitor);
        for (int i =0 ; i <joinOperatorList.size();i++){
            joinOperatorList.get(i).accept(astVisitor);
            tableOrSubqueryList.get(i+1).accept(astVisitor);
            joinConstraints.get(i).accept(astVisitor);

        }

    }
}
