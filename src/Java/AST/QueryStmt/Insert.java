package Java.AST.QueryStmt;

import Java.AST.ColumnName;
import Java.AST.DateBaseName;
import Java.AST.TableName;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

import java.util.ArrayList;
import java.util.List;

public class Insert extends SqlStatement {
        public DateBaseName dateBaseName;
        public TableName tableName;
        public List<ColumnName> columnNameList = new ArrayList<ColumnName>();
        public List<exper> exprList =new ArrayList<exper>();
        public SelectStmt selectStmt ;
        public String default_values;

        @Override
        public void accept(ASTVisitor astVisitor) {
                astVisitor.visit(this);
                if(dateBaseName!=null){
                        dateBaseName.accept(astVisitor);
                }
                if(tableName!=null){
                        tableName.accept(astVisitor);
                }
                for(int i =0 ;i<columnNameList.size();i++){
                       columnNameList.get(i).accept(astVisitor);
                }
                for(int i =0 ;i<exprList.size();i++){
                        exprList.get(i).accept(astVisitor);
                }
                if(selectStmt!=null){
                        selectStmt.accept(astVisitor);
                }
                if (default_values!=null) {
                        System.out.println(default_values);
                }
        }
}
