package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.exper;

public class Delete extends SqlStatement {
        public QualifiedTableName qualifiedTableName ;
        public exper exp;

        @Override
        public void accept(ASTVisitor astVisitor) {
                astVisitor.visit(this);
                qualifiedTableName.accept(astVisitor);
                if(exp!=null){
                        exp.accept(astVisitor);
                }
        }
}
