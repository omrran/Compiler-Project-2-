package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class third_sec extends Node {
    public increment inc ;
    public decrement dec ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(inc!=null){
            inc.accept(astVisitor);
        }
        if(dec!=null){
            dec.accept(astVisitor);
        }

        //super.accept(astVisitor);
    }

}
