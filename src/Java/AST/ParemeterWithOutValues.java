package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ParemeterWithOutValues extends Node {
    public List<String> nameOfVars = new ArrayList<String>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.print("name of parameters :");
        for(int i=0 ;i<nameOfVars.size();i++){
            System.out.print(" "+nameOfVars.get(i));
        }
        System.out.println("");

        //super.accept(astVisitor);
    }

}
