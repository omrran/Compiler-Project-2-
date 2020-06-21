package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class ReturnStarment extends Node {

    /*
    return_stm
:K_RETURN (expr|increment|decrement|one_line_cond) ';'
;*/
    public exper experValue ;
    public increment incReturnedValue;
    public decrement decReturnedValue;
    public OneLineCond oneLineCondReturnedValue;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(experValue!=null){
            experValue.accept(astVisitor);

        }
        if(incReturnedValue!=null){
            incReturnedValue.accept(astVisitor);
        }
        if(decReturnedValue!=null){
            decReturnedValue.accept(astVisitor);
        }
        if(oneLineCondReturnedValue!=null){
            oneLineCondReturnedValue.accept(astVisitor);
        }

        //super.accept(astVisitor);
    }

}
