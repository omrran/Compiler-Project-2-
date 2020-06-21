package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ParameterMix extends Node {
    public List<String> nameOfVars = new ArrayList<String>();
    public List<exper> valOfVars = new ArrayList<exper>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        //super.accept(astVisitor);
    }
}
