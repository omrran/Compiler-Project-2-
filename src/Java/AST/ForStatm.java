package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForStatm extends Node {
    public first_sec initial;
    public second_sec check ;
    public third_sec update;
    public List<all_statm> bodyForStatm = new ArrayList<all_statm>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(initial!=null){
            initial.accept(astVisitor);
        }
        if(check!=null){
            check.accept(astVisitor);
        }
        if(update!=null){
            update.accept(astVisitor);
        }
        for(int i=0;i<bodyForStatm.size();i++){

            bodyForStatm.get(i).accept(astVisitor);
        }


        //super.accept(astVisitor);
    }


}
