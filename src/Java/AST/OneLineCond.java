package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class OneLineCond extends Node {
    public exper mainCondition;
    public exper trueChoiceExp;
    public exper falseChoiceExp;
    public OneLineCond trueChoiceOne;
    public OneLineCond falseChoiceOne;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        this.mainCondition.accept(astVisitor);
        if(trueChoiceExp!=null){
            trueChoiceExp.accept(astVisitor);
        }
        if(trueChoiceOne!=null){
            trueChoiceOne.accept(astVisitor);
        }
        if(falseChoiceExp!=null){
            falseChoiceExp.accept(astVisitor);
        }
        if(falseChoiceOne!=null){
            falseChoiceOne.accept(astVisitor);
        }

        //super.accept(astVisitor);
    }


}
