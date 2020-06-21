package Java.AST.QueryStmt;

import Java.AST.AnyName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class AnyNameColon extends Node {
    public List<AnyName> anyNames = new ArrayList<AnyName>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i =0 ;i<anyNames.size();i++){
            anyNames.get(i).accept(astVisitor);
        }
    }
}
