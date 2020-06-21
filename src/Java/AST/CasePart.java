package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CasePart extends Node {

    public exper exp;
    public List<all_statm> bodyCasePart = new ArrayList<all_statm>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        exp.accept(astVisitor);
        for(int i=0 ;i<bodyCasePart.size();i++){
            bodyCasePart.get(i).accept(astVisitor);
        }

        //super.accept(astVisitor);
    }
}
