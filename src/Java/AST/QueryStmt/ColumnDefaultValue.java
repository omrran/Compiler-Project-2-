package Java.AST.QueryStmt;

import Java.AST.Literal_value;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ColumnDefaultValue extends Node {
    public SignedNumber signedNumber;
    public Literal_value literalValue;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(signedNumber!=null){
            signedNumber.accept(astVisitor);
        }
        else if(literalValue!=null){
            literalValue.accept(astVisitor);
        }
    }
}
