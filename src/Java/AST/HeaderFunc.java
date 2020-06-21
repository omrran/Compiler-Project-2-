package Java.AST;

import Java.AST.QueryStmt.SqlStatement;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class HeaderFunc extends Node{
    public String nameOfFunction ;
    public ParameterWithValues parameterWithValues;
    public ParemeterWithOutValues paremeterWithOutValues;
    public ParameterMix parameterMix ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("nameOfFunction  ---> "+nameOfFunction);
        if(this.parameterWithValues!=null)
        {
            this.parameterWithValues.accept(astVisitor);
        }
        if(this.paremeterWithOutValues!=null)
        {
            this.paremeterWithOutValues.accept(astVisitor);
        }
        if(this.parameterMix!=null) {
            this.parameterMix.accept(astVisitor);
        }
    }
}
