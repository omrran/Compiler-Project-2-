package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class first_sec extends Node {

    public exper exp;
    public OneLineCond oneLineCond;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(exp!=null){
            exp.accept(astVisitor);
        }
        if(oneLineCond!=null){
            oneLineCond.accept(astVisitor);
        }

        //super.accept(astVisitor);
    }
}
