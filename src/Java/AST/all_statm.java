package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class all_statm extends Node {
    public IfStatm ifStatm;
    public BreakStatm breakStatm;
    public Continuestatm continueStatm;
    public OneLineCond oneLineCon;
    public WhileStatm whileStatm;
    public doWhile doWhile;
    public ForStatm forStatm;
    public ForEachStatm forEachStatm;
    public SwitchStatm switchStatm;
    public increment inc;
    public decrement dec;
    public ArrayOnDimention arrayOnDimention ;
    public FunctionCall functionCall ;
    public PrintStatm printStatm;
    public HigherOrderFunc higherOrderFunc ;
    public ReadPropertyJson readPropertyJson ;
    public AssignValueToPropertyJson assignValueToPropertyJson;
    public DeclareVar declareVar ;
    public InitialVar initialVar ;
    public ReturnStarment returnStarment ;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if(ifStatm!=null){ifStatm.accept(astVisitor);}
        if(breakStatm!=null){breakStatm.accept(astVisitor);}
        if(continueStatm!=null){continueStatm.accept(astVisitor);}
        if(oneLineCon!=null){oneLineCon.accept(astVisitor);}
        if(whileStatm!=null){whileStatm.accept(astVisitor);}
        if(doWhile!=null){doWhile.accept(astVisitor);}
        if(forStatm!=null){forStatm.accept(astVisitor);}
        if(forEachStatm!=null){forEachStatm.accept(astVisitor);}
        if(switchStatm!=null){switchStatm.accept(astVisitor);}
        if(inc!=null){inc.accept(astVisitor);}
        if(dec!=null){dec.accept(astVisitor);}
        if(arrayOnDimention!=null){arrayOnDimention.accept(astVisitor);}
        if(functionCall!=null){functionCall.accept(astVisitor);}
        if(printStatm!=null){printStatm.accept(astVisitor);}
        if(higherOrderFunc!=null){higherOrderFunc.accept(astVisitor);}
        if(readPropertyJson!=null){readPropertyJson.accept(astVisitor);}
        if(assignValueToPropertyJson!=null){assignValueToPropertyJson.accept(astVisitor);}
        if(declareVar!=null){declareVar.accept(astVisitor);}
        if(initialVar!=null){initialVar.accept(astVisitor);}
        if(returnStarment!=null){returnStarment.accept(astVisitor);}


    }




}
