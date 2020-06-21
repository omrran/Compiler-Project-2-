package Java.AST.QueryStmt;

import Java.AST.ColumnName;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

import java.util.ArrayList;
import java.util.List;

public class Update extends SqlStatement {
    public QualifiedTableName qualifiedTableName;
    public List<ColumnName> columnNameList = new ArrayList<ColumnName>();
    public List<exper> experList = new ArrayList<exper>();
    public WhereClause where ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        qualifiedTableName.accept(astVisitor);
        for(int i=0 ;i<columnNameList.size();i++){
            columnNameList.get(i).accept(astVisitor);
        }
        for(int i=0 ;i<experList.size();i++){
            experList.get(i).accept(astVisitor);
        }
        if(where!=null){
            where.accept(astVisitor);

        }
    }
}
