package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class else_if extends Statement {
    private exper expr =new exper();
    //private BodyFunc bodyElseIf = new BodyFunc();

    public List<all_statm> bodyElseIf = new ArrayList<all_statm>();

    public void setExpr(exper expr) {
        this.expr = expr;
    }

    public exper getExpr() {
        return expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i=0 ;i <bodyElseIf.size();i++)
        {
            bodyElseIf.get(i).accept(astVisitor);
        }

    }
}
