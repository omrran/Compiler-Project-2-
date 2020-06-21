package Java.AST.QueryStmt;

import Java.AST.DateBaseName;
import Java.AST.Node;
import Java.AST.TableName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class TableOrSubquery extends Node {
    public DateBaseName dateBaseName ;
    public TableName tableName ;
    public TableAlias tableAlias ;//
    public IndexName  indexName;
    public String NOT_INDEXED ;
    public List<TableOrSubquery> tableOrSubqueryList = new ArrayList<TableOrSubquery>();
    public JoinClause join ;
    public SelectCore select ;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(dateBaseName!=null){
            dateBaseName.accept(astVisitor);
        }
        if(tableName!=null){
            tableName.accept(astVisitor);
        }
        if(tableAlias!=null){
            tableAlias.accept(astVisitor);
        }
        if(indexName!=null){
            indexName.accept(astVisitor);
        }
        if(NOT_INDEXED!=null){
            System.out.println(NOT_INDEXED);

        }
        for(int i=0;i<tableOrSubqueryList.size();i++){
            tableOrSubqueryList.get(i).accept(astVisitor);
        }
        if(join!=null){
            join.accept(astVisitor);
        }
        if(select!=null){
            select.accept(astVisitor);
        }
    }


}
