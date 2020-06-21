package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class SwitchStatm extends Node {

    public String nameVar;
    public List<CasePart> casePart =new ArrayList<CasePart>();
    public DefaultPart defaultPart;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("name of variable : "+nameVar);
        for(int i=0 ; i<casePart.size();i++){
            casePart.get(i).accept(astVisitor);
        }
        if(defaultPart!=null){
            defaultPart.accept(astVisitor);

        }

        //super.accept(astVisitor);
    }

}
