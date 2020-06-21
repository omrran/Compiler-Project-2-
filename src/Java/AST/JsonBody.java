package Java.AST;

import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class JsonBody extends Node {

    public List<String> nameOfPropertys =new ArrayList<String>();
    public List<ValueOfPropertys> valueOfPropertys = new ArrayList<ValueOfPropertys>();

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for(int i=0 ;i<nameOfPropertys.size();i++){
            System.out.println("name Of Property : "+nameOfPropertys.get(i));
            valueOfPropertys.get(i).accept(astVisitor);

        }
        for(int i=0 ;i<valueOfPropertys.size();i++){
            //valueOfPropertys.get(i).accept(astVisitor);
        }


    }


}
