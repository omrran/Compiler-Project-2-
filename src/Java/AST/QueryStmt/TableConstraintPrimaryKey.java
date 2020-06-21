package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class TableConstraintPrimaryKey extends Node {
    public List<IndexedColumn> indexedColumn = new ArrayList<IndexedColumn>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        for(int i=0;i<indexedColumn.size();i++){
            indexedColumn.get(i).accept(astVisitor);
        }
    }
}
