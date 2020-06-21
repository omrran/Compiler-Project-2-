package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ArrayOnDimention extends Node {
    public List<String> nameOfArrays=new ArrayList<String>();
    public ContentsOfArray contentsOfArray ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.print("name of arrays : ");
        for(int i=0 ;i<nameOfArrays.size();i++){
            System.out.print(" , "+nameOfArrays.get(i));
        }
        System.out.println();
        if(contentsOfArray!=null){
            contentsOfArray.accept(astVisitor);
        }




        //super.accept(astVisitor);
    }

}
