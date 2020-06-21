package Java.AST.QueryStmt;

import Java.AST.DateBaseName;
import Java.AST.TableName;
import Java.AST.Visitor.ASTVisitor;

public class DropTable extends SqlStatement {
        public String if_exists;
        public DateBaseName dateBaseName;
        public TableName tableName;

        @Override
        public void accept(ASTVisitor astVisitor) {
                astVisitor.visit(this);
                if(if_exists!=null){
                        System.out.println("there is : "+if_exists);
                }
                if(dateBaseName!=null){
                        dateBaseName.accept(astVisitor);
                }
                tableName.accept(astVisitor);


        }
}
