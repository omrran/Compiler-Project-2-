package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class CallFuncInExpr extends Node {
    public FunctionName functionName;
    public List<exper> experList = new ArrayList<exper>();
    public String Star;
    public String DISTINCT;


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.functionName.accept(astVisitor);
        if(DISTINCT!=null){
            System.out.println(DISTINCT);
        }
        for(int i=0 ;i <experList.size();i++){
            experList.get(i).accept(astVisitor);
        }
        if(Star!=null){
            System.out.println(Star);
        }



    }

}
