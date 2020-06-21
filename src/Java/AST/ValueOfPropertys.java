package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ValueOfPropertys extends Node {

    public exper valueOfPropertysExpr ;
    public JsonBody valueOfPropertysJson ;
    public ContentsOfArray valueOfPropertysContentsOfArrays ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(valueOfPropertysExpr!=null){
            valueOfPropertysExpr.accept(astVisitor);
        }
        if(valueOfPropertysJson!=null){
            valueOfPropertysJson.accept(astVisitor);
        }
        if(valueOfPropertysContentsOfArrays!=null){
            valueOfPropertysContentsOfArrays.accept(astVisitor);
        }
    }
}
