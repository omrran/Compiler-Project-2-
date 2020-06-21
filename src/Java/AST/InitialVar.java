package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class InitialVar extends Node {
   // :K_VAR? IDENTIFIER ('='|'-='|'+='|'*='|'/=') /*literal_value*/
//    K_VAR? IDENTIFIER ('='|'-='|'+='|'*='|'/=') (IDENTIFIER ARRAY_BRACKET_WITH_INDEX|json_body|func_call|expr) ';'
//
    public  String varName ;
    public String arrayName;
    public JsonBody jsonBodyVal;
    public FunctionCall functionCallVal;
    public exper expr;


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("name of variable : "+varName);
        if(arrayName!=null){
            System.out.println("name of array : "+arrayName);
        }
        if(jsonBodyVal!=null){jsonBodyVal.accept(astVisitor);}
        if(functionCallVal!=null){functionCallVal.accept(astVisitor);}
        if(expr!=null){expr.accept(astVisitor);}



        //super.accept(astVisitor);
    }

}
