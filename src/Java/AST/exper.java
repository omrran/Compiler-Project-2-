package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class exper extends Node {
    public Literal_value literalValue ;
    public UnaryExper unaryExper;
    public MathExpr mathExpr;
    public LogicExpr logicExpr;
    public BD_Table_Column_name bd_table_column_Name;
    public CallFuncInExpr callFuncInExpr;
    public Expr_enclose_with_brackets exprEncloseWithBrackets;
    public Select_enclose_with_brackets selectEncloseWithBrackets;



    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        if(this.literalValue!=null){
            this.literalValue.accept(astVisitor);
        }
        if(this.unaryExper!=null){
            this.unaryExper.accept(astVisitor);
        }
        if(this.mathExpr!=null){
            System.out.println("Math Exper");
            this.mathExpr.accept(astVisitor);
        }
        if(this.logicExpr!=null){
            System.out.println("Logic Exper");
            this.logicExpr.accept(astVisitor);

        }
        if(this.bd_table_column_Name!=null){

            this.bd_table_column_Name.accept(astVisitor);
        }
        if(this.callFuncInExpr!=null){
            this.callFuncInExpr.accept(astVisitor);
        }
        if(this.exprEncloseWithBrackets!=null){
            this.exprEncloseWithBrackets.accept(astVisitor);
        }
        if(this.selectEncloseWithBrackets!=null){
            this.selectEncloseWithBrackets.accept(astVisitor);
        }
    }




}
