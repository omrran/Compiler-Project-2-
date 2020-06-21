package Java.AST;

import Java.AST.Visitor.ASTVisitor;

public class FunctionDeclaration extends Node {

    private HeaderFunc header = new HeaderFunc();
    private BodyFunc body = new BodyFunc();

    public void setHeader (HeaderFunc header){
        this.header=header;
    }
    public HeaderFunc getHeader (){
        return this.header;
    }

    public void setBody (BodyFunc body){
        this.body=body;
    }
    public BodyFunc getBody (){
        return this.body;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);

        this.header.accept(astVisitor);
        this.body.accept(astVisitor);

    }
}
