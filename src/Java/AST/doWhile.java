package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class doWhile extends Node {
    public List<all_statm> bodydoWileStatm = new ArrayList<all_statm>();
    public exper exper;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        for(int i=0;i<bodydoWileStatm.size();i++){

            bodydoWileStatm.get(i).accept(astVisitor);
        }
        exper.accept(astVisitor);



    }


    }
