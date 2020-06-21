package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Node {
    public String nameOfFunc;
    public List<Argument> argumentList = new ArrayList<Argument>();

   // public List<exper> parameterList =new ArrayList<exper>();
    // public List<String> parameterListIdentefeir =new ArrayList<String>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("nam of function : "+nameOfFunc);
        for(int i=0 ;i <argumentList.size();i++){
            argumentList.get(i).accept(astVisitor);
        }

        //super.accept(astVisitor);
    }
}
