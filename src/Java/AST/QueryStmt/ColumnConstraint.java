package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class ColumnConstraint extends Node {
    public Name name;
    public ColumnConstraintPrimaryKey columnConstraintPrimaryKey ;
    public ColumnConstraintForeignKey columnConstraintForeignKey;
    public ColumnConstraintNotNull columnConstraintNotNull;
    public ColumnConstraintNull columnConstraintNull;
    public exper expr;
    public ColumnDefault columnDefault;
    public CollationName collationName;
    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(name!=null){
            System.out.println("name of constraint :");
            name.accept(astVisitor);
        }
        if(columnConstraintPrimaryKey!=null){
            columnConstraintPrimaryKey.accept(astVisitor);
        }
        if(columnConstraintForeignKey!=null){
            columnConstraintForeignKey.accept(astVisitor);
        }
        if(columnConstraintNotNull!=null){
            columnConstraintNotNull.accept(astVisitor);
        }
        if(columnConstraintNull!=null){
            columnConstraintNull.accept(astVisitor);
        }
        if(expr!=null){
            expr.accept(astVisitor);
        }
        if(columnDefault!=null){
            columnDefault.accept(astVisitor);
        }
        if(collationName!=null){
            collationName.accept(astVisitor);
        }

    }
}
