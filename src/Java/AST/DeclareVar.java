package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class DeclareVar extends Node {

    public List<String> nameOfVar =new ArrayList<String>();
    public exper valueOfVar ;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i =0 ;i<nameOfVar.size();i++){
            System.out.println("name of var : "+nameOfVar.get(i));
        }
        if(valueOfVar!=null){
            valueOfVar.accept(astVisitor);
        }


        //super.accept(astVisitor);
    }

}
