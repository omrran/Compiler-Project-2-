package Java.AST.QueryStmt;

import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

public class ColumnConstraintPrimaryKey extends Node {
  public String ASC_OR_DESC,AUTOINCREMENT;
  @Override
  public void accept(ASTVisitor astVisitor) {
    astVisitor.visit(this);

    if(ASC_OR_DESC!=null){
     System.out.println(ASC_OR_DESC);
    }
   if(AUTOINCREMENT!=null){
    System.out.println(AUTOINCREMENT);
   }

  }
}
