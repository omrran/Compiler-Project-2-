package Java.AST.QueryStmt;

import Java.AST.DateBaseName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class ForeignKeyClause extends Node {
    public DateBaseName datebaseName ;
    public ForeignTable foreignTable ;
    public List<FkTargetColumnName> fkTargetColumnNameList = new ArrayList<FkTargetColumnName>();
    public List<OnSectionOrMatchName> onSectionOrMatchNames = new ArrayList<OnSectionOrMatchName>();
    public String  NOT,DEFERRABLE,INITIALLY_DEFERRED,INITIALLY_IMMEDIATE,ENABLE;


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(datebaseName!=null){
            datebaseName.accept(astVisitor);
        }
        foreignTable.accept(astVisitor);
        for(int i =0 ;i<fkTargetColumnNameList.size();i++){
            fkTargetColumnNameList.get(i).accept(astVisitor);
        }
        for(int i =0 ;i<onSectionOrMatchNames.size();i++){
            onSectionOrMatchNames.get(i).accept(astVisitor);
        }



        if(NOT!=null){
            System.out.println(NOT);
        }
        if(DEFERRABLE!=null){
            System.out.println(DEFERRABLE);
        }
        if(INITIALLY_DEFERRED!=null){

            System.out.println(INITIALLY_DEFERRED);
        }
        if(INITIALLY_IMMEDIATE!=null){
            System.out.println(INITIALLY_IMMEDIATE);
        }
        if(ENABLE!=null){
            System.out.println(ENABLE);
        }

    }
}
