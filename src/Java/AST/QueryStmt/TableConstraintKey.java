package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class TableConstraintKey extends Node {
    public Name name;
    public List<IndexedColumn> indexedColumnList = new ArrayList<IndexedColumn>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(name!=null){
            name.accept(astVisitor);
        }
        for(int i=0;i<indexedColumnList.size();i++){
            indexedColumnList.get(i).accept(astVisitor);
        }
    }
}
