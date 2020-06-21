package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;
import javafx.scene.control.Tab;

public class TableConstraint extends Node {
    public Name name;
    public TableConstraintPrimaryKey tableConstraintPrimaryKey ;
    public TableConstraintKey tableConstraintKey;
    public TableConstraintUnique tableConstraintUnique ;
    public TableConstraintForeignKey tableConstraintForeignKey;
    public exper exp;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(name!=null){
            name.accept(astVisitor);
        }
        if(tableConstraintPrimaryKey!=null){
            tableConstraintPrimaryKey.accept(astVisitor);
        }
        if(tableConstraintKey!=null){
            tableConstraintKey.accept(astVisitor);
        }
        if(tableConstraintUnique!=null){
            tableConstraintUnique.accept(astVisitor);
        }
        if(tableConstraintForeignKey!=null){
            tableConstraintForeignKey.accept(astVisitor);
        }
        if(exp!=null){
            exp.accept(astVisitor);
        }

    }
}
