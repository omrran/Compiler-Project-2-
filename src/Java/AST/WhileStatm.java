package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class WhileStatm extends Node {
    public exper exper;
    public List<all_statm> bodyWileStatm = new ArrayList<all_statm>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        exper.accept(astVisitor);
        for(int i =0 ;i<bodyWileStatm.size();i++){
            bodyWileStatm.get(i).accept(astVisitor);
        }

        //super.accept(astVisitor);
    }


}
