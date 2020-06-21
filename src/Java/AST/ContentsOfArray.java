package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ContentsOfArray extends Node {
    //contents_of_array
    // :func_call
    //|'['(expr (',' expr)*|json_body (',' json_body)*)']'
    //  ;
    public FunctionCall functionCall ;
    public List<exper> experList =new ArrayList<exper>();
    public List<JsonBody> jsonBodies =new ArrayList<JsonBody>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(functionCall!=null){
            functionCall.accept(astVisitor);
        }
        for(int i=0 ;i<experList.size();i++){
            experList.get(i).accept(astVisitor);
        }
        for(int i=0 ;i<jsonBodies.size();i++){
            jsonBodies.get(i).accept(astVisitor);
        }
    }
}
