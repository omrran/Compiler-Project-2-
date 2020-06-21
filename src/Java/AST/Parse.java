package Java.AST;

import Java.AST.QueryStmt.SqlStatement;
import Java.AST.Visitor.ASTVisitor;
import Java.AST.Visitor.BaseASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<SqlStatement> sqlStmts = new ArrayList<SqlStatement>();
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();

    //to add query statement to list sqlStmts
    public void addQuery(SqlStatement query){
        this.sqlStmts.add(query);
    }

    /////////////////////////////////////////////
    public void addFunc(FunctionDeclaration func){
        this.functions.add(func);
    }

    public void setSqlStmts(List<SqlStatement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public List<SqlStatement> getSqlStmts() {
        return sqlStmts;
    }

    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }



    @Override
    public String toString(){
       // return "sql stmts = "+ getSqlStmts().get(0).getName();
        return null;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        try{
            for(int i = 0 ; i < this.sqlStmts.size() ; i++){
                this.sqlStmts.get(i).accept(astVisitor);
            }
            for(int i = 0 ; i < this.functions.size() ; i++){
                this.functions.get(i).accept(astVisitor);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
