package Java.AST.QueryStmt;

import Java.AST.AnyName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class ColumnDefault extends Node {
    public ColumnDefaultValue columnDefaultValue ;
    public exper expr ;
    public NextVal nv;
    public AnyName anyName;
    public AnyNameColon anyNameColon;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(columnDefaultValue!=null){
            columnDefaultValue.accept(astVisitor);
        }
        if(expr!=null){
            expr.accept(astVisitor);
        }
        if(nv!=null){
            nv.accept(astVisitor);
        }
        if(anyName!=null){
            anyName.accept(astVisitor);
        }
        if(anyNameColon!=null){
            anyNameColon.accept(astVisitor);
        }
    }
}
