package Java.AST.QueryStmt;

import Java.AST.DateBaseName;
import Java.AST.TableName;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CreateTable extends SqlStatement {
    public DateBaseName dateBaseName;
    public TableName tableName;
    public List<ColumnDef> columnDeflist=new ArrayList<ColumnDef>();
    public List<TableConstraint> tableConstraints = new ArrayList<TableConstraint>();
    public SelectStmt selectStmt ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(dateBaseName!=null){
            dateBaseName.accept(astVisitor);
        }
        tableName.accept(astVisitor);

        for(int i =0 ;i<columnDeflist.size() ;i++){
            columnDeflist.get(i).accept(astVisitor);
        }
        for(int i =0 ;i<tableConstraints.size() ;i++){
            tableConstraints.get(i).accept(astVisitor);
        }
        if(selectStmt!=null){
            selectStmt.accept(astVisitor);
        }
    }
}