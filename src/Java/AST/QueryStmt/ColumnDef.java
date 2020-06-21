package Java.AST.QueryStmt;

import Java.AST.ColumnName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ColumnDef extends Node {
    public ColumnName columnName;
    public List<ColumnConstraint> columnConstraintList = new ArrayList<ColumnConstraint>();
    public List<TypeName> typeNameList = new ArrayList<TypeName>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        columnName.accept(astVisitor);

        for(int i =0 ; i < columnConstraintList.size();i++){
            columnConstraintList.get(i).accept(astVisitor);
        }
        for(int i =0 ; i < typeNameList.size();i++){
            typeNameList.get(i).accept(astVisitor);
        }
    }
}
