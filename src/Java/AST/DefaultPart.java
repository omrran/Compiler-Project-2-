package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DefaultPart extends Node {
    public List<all_statm> bodyDefaultPart = new ArrayList<all_statm>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i=0 ;i<bodyDefaultPart.size();i++){
            bodyDefaultPart.get(i).accept(astVisitor);
        }

        //super.accept(astVisitor);
    }

}
