package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class OnSectionOrMatchName extends Node {
    public OnSection onSection ;
    public MatchName matchName ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(onSection!=null){
            onSection.accept(astVisitor);
        }
        else{
            matchName.accept(astVisitor);
        }

    }
}
