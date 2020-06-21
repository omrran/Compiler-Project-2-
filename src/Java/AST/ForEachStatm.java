package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForEachStatm extends Node {
    public String varName;
    public String ArrayName;
    public List<all_statm> bodyForEachstm = new ArrayList<all_statm>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("varName : "+varName);
        System.out.println("ArrayName : "+ArrayName);
        for(int i =0 ;i<bodyForEachstm.size();i++){
            bodyForEachstm.get(i).accept(astVisitor);
        }

        //super.accept(astVisitor);
    }


}
