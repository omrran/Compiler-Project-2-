package Java.AST.QueryStmt;

import Java.AST.AnyName;
import Java.AST.Node;
import Java.AST.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class TypeName extends Node {
    public Name name;
    public List<SignedNumber> signedNumberList = new ArrayList<SignedNumber>();
    public List<AnyName> anyNameList = new ArrayList<AnyName>();

    @Override
    public void accept(ASTVisitor astVisitor) {

        astVisitor.visit(this);
        name.accept(astVisitor);
        for(int i = 0 ; i<signedNumberList.size();i++){
            signedNumberList.get(i).accept(astVisitor);
        }
        for(int i = 0 ; i<anyNameList.size();i++){
            anyNameList.get(i).accept(astVisitor);
        }
    }
}
