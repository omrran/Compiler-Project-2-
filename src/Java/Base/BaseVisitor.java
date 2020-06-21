package Java.Base;

import Java.AST.*;
import Java.AST.QueryStmt.*;
import generated.SQLBaseVisitor;
import generated.SQLParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends SQLBaseVisitor {


    @Override
    public  Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();

        if(ctx.sql_stmt_list()!=null){
            List<SqlStatement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list());
            p.setSqlStmts(sqlStmts);
        }
        if(ctx.func_statment_list()!=null){
            List<FunctionDeclaration> functions =  visitFunc_statment_list(ctx.func_statment_list());
            p.setFunctions(functions);

        }
            p.setLine(ctx.getStart().getLine()); //get line number
            p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
            return p;
    }


    @Override public  List<FunctionDeclaration> visitFunc_statment_list(SQLParser.Func_statment_listContext ctx){
        //try {

            System.out.println("visitFunc_statment_list");
            List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
            int k ;
            for (int i = 0; i < ctx.func_statment().size(); i++) {
                k=i+1;
                System.out.println("function number     " + k);
                functions.add(visitFunc_statment(ctx.func_statment(i)));

            }

            return functions;
    //    }
     //   catch (Exception e){}
      //  return null;
    }
    @Override public FunctionDeclaration visitFunc_statment(SQLParser.Func_statmentContext ctx) {
        System.out.println("visitFunc_statment");
        FunctionDeclaration s = new FunctionDeclaration();
        s.setHeader( visitPrototype_func(ctx.prototype_func()));
        s.setBody(visitBlock_of_stms(ctx.block_of_stms()));
        return s;
    }
    @Override public HeaderFunc visitPrototype_func(SQLParser.Prototype_funcContext ctx) {
        System.out.println("visitPrototype");
        HeaderFunc h=new HeaderFunc();
        h.nameOfFunction = ctx.IDENTIFIER().getText();
        System.out.println("nameOfFunction  :"+h.nameOfFunction);
        if(ctx.parameter_list_without_values()!=null){
            h.paremeterWithOutValues = visitParameter_list_without_values(ctx.parameter_list_without_values());
        }
        else if(ctx.parameter_list_with_values()!=null){
            h.parameterWithValues = visitParameter_list_with_values(ctx.parameter_list_with_values());
        }
        else if (ctx.parameter_list_mix()!=null){
            h.parameterMix = visitParameter_list_mix(ctx.parameter_list_mix());
        }
        return h;
    }
    @Override public BodyFunc visitBlock_of_stms(SQLParser.Block_of_stmsContext ctx) {
        System.out.println("visitBlock_of_stms");
        BodyFunc h=new BodyFunc();
         List<all_statm> statements =new ArrayList<all_statm>();
        //to print count of statement in Body function .
        System.out.println("<<<<<<< count of statements in Body function >>>>> "+ ctx.all_stm().size());
        //to visit all statement in Body function
        for (int i =0; i < ctx.all_stm().size() ; i++){
            statements.add(visitAll_stm(ctx.all_stm(i)));
        }
        h.setStmts(statements);
        return h;
    }
    @Override public all_statm visitAll_stm(SQLParser.All_stmContext ctx) {
        System.out.println("all_statm");
        all_statm s =new all_statm();

        if(ctx.if_stm()!=null){
            s.ifStatm=visitIf_stm(ctx.if_stm());
        }
        if(ctx.break_stm()!=null){
            s.breakStatm=visitBreak_stm(ctx.break_stm());
        }
        if(ctx.continue_stm()!=null){
            s.continueStatm=visitContinue_stm(ctx.continue_stm());
        }
        if(ctx.one_line_cond()!=null){
            s.oneLineCon=visitOne_line_cond(ctx.one_line_cond());
        }
        if(ctx.while_stm()!=null){
            s.whileStatm=visitWhile_stm(ctx.while_stm());
        }
        if(ctx.do_while_stm()!=null){
            s.doWhile=visitDo_while_stm(ctx.do_while_stm());
        }
        if(ctx.for_stm()!=null){
            s.forStatm=visitFor_stm(ctx.for_stm());
        }
        if(ctx.for_each_stm()!=null){
            s.forEachStatm=visitFor_each_stm(ctx.for_each_stm());
        }
        if(ctx.switch_stm()!=null){
            s.switchStatm=visitSwitch_stm(ctx.switch_stm());
        }
        if(ctx.increment()!=null){
            s.inc=visitIncrement(ctx.increment());
        }
        if(ctx.decrement()!=null){
            s.dec=visitDecrement(ctx.decrement());
        }
        if(ctx.array_one_dimension()!=null){
            s.arrayOnDimention=visitArray_one_dimension(ctx.array_one_dimension());
        }
        if(ctx.func_call()!=null){
            s.functionCall=visitFunc_call(ctx.func_call());
        }
        if(ctx.print_stm()!=null){
            s.printStatm=visitPrint_stm(ctx.print_stm());
        }
        if(ctx.higher_order_func()!=null){
            s.higherOrderFunc=visitHigher_order_func(ctx.higher_order_func());
        }
        if(ctx.read_property_json()!=null){
            s.readPropertyJson=visitRead_property_json(ctx.read_property_json());
        }
        if(ctx.assignment_value_to_property_json()!=null){
            s.assignValueToPropertyJson=visitAssignment_value_to_property_json(ctx.assignment_value_to_property_json());
        }
        if(ctx.declare_variable()!=null){
            s.declareVar = visitDeclare_variable(ctx.declare_variable());
        }
        if(ctx.initialize_variable()!=null) {
            s.initialVar = visitInitialize_variable(ctx.initialize_variable());
        }
        if(ctx.return_stm()!=null){
            s.returnStarment=visitReturn_stm(ctx.return_stm());
        }
        return s;
    }
    @Override public BreakStatm visitBreak_stm(SQLParser.Break_stmContext ctx) {
        System.out.println("visitBreak_stm");
        BreakStatm _break=new BreakStatm();
        return _break;
    }
    @Override public Continuestatm visitContinue_stm(SQLParser.Continue_stmContext ctx) {
        System.out.println("visitContinue_stm");
        Continuestatm _Continuestatm=new Continuestatm();
        return _Continuestatm;
    }
    @Override public IfStatm visitIf_stm(SQLParser.If_stmContext ctx) {
        System.out.println("visitIf_stm");
        IfStatm If =new IfStatm();

        If.expr=visitExpr(ctx.expr());
        //to visit all statement in body of If
        for (int i=0 ;i<ctx.all_stm().size();i++){
            If.bodyIf.add(visitAll_stm(ctx.all_stm(i)));
        }
        System.out.println("number of else of  "+ctx.else_if().size());
        for (int i=0 ;i<ctx.else_if().size();i++){
            If.elseIf.add(visitElse_if(ctx.else_if(i)));
            //print count of statement in each else if body:
            //System.out.println("xxxxxxxxx "+ctx.else_if(i).all_stm().size());
       }

        if(ctx.else_stm()!=null){
          If.elseStm =visitElse_stm(ctx.else_stm());
        }


        return If;
    }
    @Override public else_if visitElse_if(SQLParser.Else_ifContext ctx) {
        System.out.println("visitElse_if");
        else_if elseIf =new else_if();
        System.out.println("visitElse_if >>>>>>> "+ctx.all_stm().size());
        for(int i=0 ;i<ctx.all_stm().size();i++){

            elseIf.bodyElseIf.add(visitAll_stm(ctx.all_stm(i)));
        }


        return elseIf;
    }
    @Override public else_stm visitElse_stm(SQLParser.Else_stmContext ctx) {
        System.out.println("visitElse_stm");

        else_stm elseStm =new else_stm();
        try{
            for(int i =0 ;i<ctx.all_stm().size();i++){
                elseStm.bodyElseStm.add(visitAll_stm(ctx.all_stm(i)));
            }
        }catch (Exception e){
            System.out.println(e);
        }



        return elseStm;
    }
    @Override public OneLineCond visitOne_line_cond(SQLParser.One_line_condContext ctx) {
        System.out.println("visitOne_line_cond");
        OneLineCond oneLineCond =new OneLineCond();
        oneLineCond.mainCondition = visitExpr(ctx.expr(0));

        //System.out.println("count expr"+ctx.expr().size());
        //System.out.println("one line cond  : "+ctx.one_line_cond(1).getText());
        if(ctx.expr(1)!=null){
            oneLineCond.trueChoiceExp = visitExpr(ctx.expr(1));
        }
        if(ctx.one_line_cond(0)!=null){
            oneLineCond.trueChoiceOne = new OneLineCond();
            oneLineCond.trueChoiceOne =  visitOne_line_cond(ctx.one_line_cond(0));
        }

        if(ctx.expr(2)!=null){
            oneLineCond.falseChoiceExp = visitExpr(ctx.expr(2));
        }
        if(ctx.one_line_cond(1)!=null){
            oneLineCond.falseChoiceOne =new OneLineCond();
                    oneLineCond.falseChoiceOne =visitOne_line_cond(ctx.one_line_cond(1));
        }


        return oneLineCond;
    }
    @Override public WhileStatm visitWhile_stm(SQLParser.While_stmContext ctx) {
        System.out.println("visitWhile_stm");
        WhileStatm whileStatm =new WhileStatm();
        whileStatm.exper=visitExpr(ctx.expr());

        for(int i =0 ;i<ctx.all_stm().size();i++){
            whileStatm.bodyWileStatm.add(visitAll_stm(ctx.all_stm(i)));
        }

        return whileStatm;
    }
    @Override public doWhile visitDo_while_stm(SQLParser.Do_while_stmContext ctx) {
        System.out.println("visitDo_while_stm");

        doWhile doWhil =new doWhile();
        for(int i =0 ;i<ctx.all_stm().size();i++){
            doWhil.bodydoWileStatm.add(visitAll_stm(ctx.all_stm(i)));
        }
        doWhil.exper = visitExpr(ctx.expr());

        return doWhil;
    }
    @Override public ForStatm visitFor_stm(SQLParser.For_stmContext ctx) {
        System.out.println("visitFor_stm");
        ForStatm forStatm =new ForStatm();
        if(ctx.first_sec()!=null){
            forStatm.initial=visitFirst_sec(ctx.first_sec());
        }
        if(ctx.second_sec()!=null){
            forStatm.check=visitSecond_sec(ctx.second_sec());
        }
        if(ctx.third_sec()!=null){
            forStatm.update=visitThird_sec(ctx.third_sec());
        }

        for(int i =0 ;i<ctx.all_stm().size();i++){
            forStatm.bodyForStatm.add(visitAll_stm(ctx.all_stm(i)));
        }
        return forStatm;
    }
    @Override public first_sec visitFirst_sec(SQLParser.First_secContext ctx) {
        System.out.println("visitFirst_sec");
        first_sec firstSec =new first_sec();
        if(ctx.expr()!=null){
            firstSec.exp=visitExpr(ctx.expr());
        }
        if(ctx.one_line_cond()!=null){
            firstSec.oneLineCond=visitOne_line_cond(ctx.one_line_cond());
        }

        return firstSec;
    }
    @Override public second_sec visitSecond_sec(SQLParser.Second_secContext ctx) {
        System.out.println("visitSecond_sec");
        second_sec secondSec =new second_sec();
        if(ctx.expr()!=null){
            secondSec.exp=visitExpr(ctx.expr());
        }
        else if (ctx.expr()==null){
            for(int i=0 ;i<ctx.IDENTIFIER().size();i++){
                System.out.println("..................");
                System.out.println(ctx.IDENTIFIER(i).getSymbol().getText());
                System.out.println(ctx.ARRAY_BRACKET_WITH_INDEX().getSymbol().getText());
                System.out.println("..................");
            }
        }
        return secondSec;
    }
    @Override public third_sec visitThird_sec(SQLParser.Third_secContext ctx) {
        System.out.println("visitThird_sec");
        third_sec thirdSec =new third_sec();
        if(ctx.increment()!=null){
            thirdSec.inc=visitIncrement(ctx.increment());
        }
        if(ctx.decrement()!=null){
            thirdSec.dec=visitDecrement(ctx.decrement());
        }

        return thirdSec;
    }
    @Override public increment visitIncrement(SQLParser.IncrementContext ctx) {
        System.out.println("visitIncrement");

        increment inc =new increment();
        return inc;
    }
    @Override public decrement visitDecrement(SQLParser.DecrementContext ctx) {
        System.out.println("visitDecrement");

        decrement dec =new decrement();
        return dec;
    }
    @Override public ForEachStatm visitFor_each_stm(SQLParser.For_each_stmContext ctx) {
        System.out.println("visitFor_each_stm");
        ForEachStatm forEachStatm =new ForEachStatm();
        forEachStatm.varName=ctx.IDENTIFIER(0).getText();
        forEachStatm.ArrayName=ctx.IDENTIFIER(1).getText();
        System.out.println("varName "+forEachStatm.varName);
        System.out.println("ArrayName "+forEachStatm.ArrayName);

        for(int i =0 ;i<ctx.all_stm().size();i++){
            forEachStatm.bodyForEachstm.add(visitAll_stm(ctx.all_stm(i)));
        }


        return forEachStatm;
    }
    @Override public SwitchStatm visitSwitch_stm(SQLParser.Switch_stmContext ctx) {
        System.out.println("visitSwitch_stm");
        SwitchStatm switchStatm = new SwitchStatm();

        switchStatm.nameVar=ctx.IDENTIFIER().getText();
        System.out.println("nameVar  :"+switchStatm.nameVar);

        System.out.println("count of cases :"+ctx.case_part().size());

        for(int i=0 ;i<ctx.case_part().size();i++){
            switchStatm.casePart.add(visitCase_part(ctx.case_part(i)));
        }

        if(ctx.default_part()!=null){
            switchStatm.defaultPart=visitDefault_part(ctx.default_part());
        }


        return switchStatm;
    }
    @Override public CasePart visitCase_part(SQLParser.Case_partContext ctx) {
        System.out.println("visitCase_part");
        CasePart casePart =new CasePart();
        casePart.exp=visitExpr(ctx.expr());
        for(int i =0 ;i<ctx.all_stm().size();i++){
            casePart.bodyCasePart.add(visitAll_stm(ctx.all_stm(i)));
        }



        return casePart;
    }
    @Override public DefaultPart visitDefault_part(SQLParser.Default_partContext ctx) {
        System.out.println("visitDefault_part");
        DefaultPart defaultPart =new DefaultPart();
        for(int i =0 ;i<ctx.all_stm().size();i++){
            defaultPart.bodyDefaultPart.add(visitAll_stm(ctx.all_stm(i)));
        }
        return defaultPart;
    }
    @Override public ArrayOnDimention visitArray_one_dimension(SQLParser.Array_one_dimensionContext ctx) {
        System.out.println("ArrayOnDimention");
        ArrayOnDimention arrayOnDimention =new ArrayOnDimention();
        //to save name of arrays ---> var a[] ,b[] ;
        for (int i=0;i<ctx.IDENTIFIER().size();i++){
            arrayOnDimention.nameOfArrays.add(ctx.IDENTIFIER(i).getText());
            System.out.println("name of array :"+arrayOnDimention.nameOfArrays.get(i));
        }
        if (ctx.contents_of_array()!=null){
            arrayOnDimention.contentsOfArray = visitContents_of_array(ctx.contents_of_array());
        }

        return arrayOnDimention;
    }

    @Override
    public ContentsOfArray visitContents_of_array(SQLParser.Contents_of_arrayContext ctx) {
        System.out.println("visit Contents_of_array");
        ContentsOfArray contentsOfArray = new ContentsOfArray();
        if(ctx.func_call()!=null) {
            contentsOfArray.functionCall=visitFunc_call(ctx.func_call());
        }
        for (int i =0 ;i< ctx.expr().size();i++){
            contentsOfArray.experList.add(visitExpr(ctx.expr(i)));
        }
        for (int i =0 ;i< ctx.json_body().size();i++){
            contentsOfArray.jsonBodies.add(visitJson_body(ctx.json_body(i)));
        }
        return contentsOfArray;
    }

    @Override public FunctionCall visitFunc_call(SQLParser.Func_callContext ctx) {
        System.out.println("visitFunc_call");
        FunctionCall functionCall =new FunctionCall();
        functionCall.nameOfFunc=ctx.IDENTIFIER().getText();
        System.out.println("name of function  :"+functionCall.nameOfFunc);
        for(int i=0 ; i<ctx.argument().size();i++){
            functionCall.argumentList.add(visitArgument(ctx.argument(i)));
        }


        return functionCall;
    }

    @Override
    public Argument visitArgument(SQLParser.ArgumentContext ctx) {
        System.out.println("visitArgument");
        Argument argument = new Argument();
        if (ctx.expr()!=null){
            argument.expr = visitExpr(ctx.expr());
        }
        else if (ctx.IDENTIFIER()!=null){
            argument.elementOfArray = ctx.IDENTIFIER().getText() + ctx.ARRAY_BRACKET_WITH_INDEX().getText();
            System.out.println("elementOfArray :" +argument.elementOfArray);
        }
        return argument;
    }

    @Override public JsonBody visitJson_body(SQLParser.Json_bodyContext ctx) {
        System.out.println("visitJson_body");
        JsonBody jsonBody =new JsonBody();
        for(int i=0 ;i<ctx.IDENTIFIER().size();i++) {
            jsonBody.nameOfPropertys.add(ctx.IDENTIFIER(i).getText());
            System.out.println("name of property :"+jsonBody.nameOfPropertys.get(i));

            jsonBody.valueOfPropertys.add(visitValue_of_property( ctx.value_of_property(i)));

        }
        return jsonBody;
    }

    @Override
    public ValueOfPropertys visitValue_of_property(SQLParser.Value_of_propertyContext ctx) {
        System.out.println("visitValue_of_property");
        ValueOfPropertys valueOfPropertys = new ValueOfPropertys();
        if(ctx.expr()!=null){
            valueOfPropertys.valueOfPropertysExpr = visitExpr(ctx.expr());
        }
        if(ctx.json_body()!=null){
            valueOfPropertys.valueOfPropertysJson = visitJson_body(ctx.json_body());
        }
        if(ctx.contents_of_array()!=null){
            valueOfPropertys.valueOfPropertysContentsOfArrays = visitContents_of_array(ctx.contents_of_array());
        }
        return valueOfPropertys;
    }

    @Override public PrintStatm visitPrint_stm(SQLParser.Print_stmContext ctx) {
        System.out.println("visitPrint_stm");
        PrintStatm printStatm = new PrintStatm();
        return printStatm;
    }
    @Override public HigherOrderFunc visitHigher_order_func(SQLParser.Higher_order_funcContext ctx) {
        System.out.println("visitHigher_order_func");
        HigherOrderFunc higherOrderFunc =new HigherOrderFunc();
        return higherOrderFunc;
    }
    @Override public ReadPropertyJson visitRead_property_json(SQLParser.Read_property_jsonContext ctx) {
        System.out.println("visitRead_property_json");
        ReadPropertyJson readPropertyJson = new ReadPropertyJson();
        return readPropertyJson;
    }
    @Override public AssignValueToPropertyJson visitAssignment_value_to_property_json(SQLParser.Assignment_value_to_property_jsonContext ctx) {
        System.out.println("visitAssignment_value_to_property_json");
        AssignValueToPropertyJson assignValueToPropertyJson =new AssignValueToPropertyJson();
        assignValueToPropertyJson.val=visitExpr(ctx.expr());
        return assignValueToPropertyJson;
    }
    @Override public DeclareVar visitDeclare_variable(SQLParser.Declare_variableContext ctx) {
        System.out.println("visitDeclare_variable");
        DeclareVar declareVar = new DeclareVar();
        for(int i=0;i < ctx.IDENTIFIER().size();i++){
            declareVar.nameOfVar.add(ctx.IDENTIFIER(i).getText());
            System.out.println("name of variable  :"+declareVar.nameOfVar.get(i));
        }
        if(ctx.expr()!=null){
            declareVar.valueOfVar = visitExpr(ctx.expr());
        }
        return declareVar;
    }
    @Override public InitialVar visitInitialize_variable(SQLParser.Initialize_variableContext ctx) {
        System.out.println("visitInitialize_variable");
        InitialVar initialVar =new InitialVar();

        initialVar.varName = ctx.IDENTIFIER(0).getText();
        System.out.println("name of var  :"+initialVar.varName );

        if (ctx.IDENTIFIER(1)!=null){
            initialVar.arrayName=ctx.IDENTIFIER(1).getText() +ctx.ARRAY_BRACKET_WITH_INDEX().getText();
            System.out.println("Value of variable  :"+initialVar.arrayName );
        }
        else if (ctx.func_call()!=null){
            initialVar.functionCallVal=visitFunc_call(ctx.func_call());
        }
        else if (ctx.json_body()!=null){
            initialVar.jsonBodyVal = visitJson_body(ctx.json_body());
        }
        else if (ctx.expr()!=null){
            initialVar.expr = visitExpr(ctx.expr());
        }
        return initialVar;
    }
    @Override public ReturnStarment visitReturn_stm(SQLParser.Return_stmContext ctx) {
        System.out.println("visitReturn_stm");
        ReturnStarment returnStarment =new ReturnStarment();

        if(ctx.expr()!=null){
            returnStarment.experValue = visitExpr(ctx.expr());

        }
        if(ctx.decrement()!=null){
            returnStarment.decReturnedValue = visitDecrement(ctx.decrement());
        }
        if(ctx.increment()!=null){
            returnStarment.incReturnedValue = visitIncrement(ctx.increment());
        }
        if(ctx.one_line_cond()!=null){
            returnStarment.oneLineCondReturnedValue = visitOne_line_cond(ctx.one_line_cond());
        }

        return returnStarment;
    }
    @Override public ParemeterWithOutValues visitParameter_list_without_values(SQLParser.Parameter_list_without_valuesContext ctx) {
        System.out.println("visitParameter_list_without_values");
        ParemeterWithOutValues paremeterWithOutValues =new ParemeterWithOutValues();
        for(int i=0 ;i<ctx.IDENTIFIER().size() ;i++){
            paremeterWithOutValues.nameOfVars.add(ctx.IDENTIFIER(i).getText());
            System.out.println(paremeterWithOutValues.nameOfVars.get(i));
        }

        return paremeterWithOutValues;
    }
    @Override public ParameterWithValues visitParameter_list_with_values(SQLParser.Parameter_list_with_valuesContext ctx) {
        System.out.println("visitParameter_list_with_values");
        ParameterWithValues parameterWithValues = new ParameterWithValues();
        for(int i=0 ;i<ctx.IDENTIFIER().size() ;i++){
            parameterWithValues.nameOfVars.add(ctx.IDENTIFIER(i).getText());
            System.out.println(parameterWithValues.nameOfVars.get(i));
            parameterWithValues.valOfVars.add(visitExpr(ctx.expr(i)));

            //System.out.println(parameterWithValues.valOfVars.get(i));
        }
        return parameterWithValues;
    }
    @Override public ParameterMix visitParameter_list_mix(SQLParser.Parameter_list_mixContext ctx) {
        System.out.println("visitParameter_list_mix");
        ParameterMix parameterMix =new ParameterMix();
       // int x ,y;
        for(int i =0;i<ctx.IDENTIFIER().size();i++){
            System.out.println(ctx.IDENTIFIER().get(i).getText());
            parameterMix.nameOfVars.add(ctx.IDENTIFIER().get(i).getText());
        }
        for(int i =0;i<ctx.expr().size();i++){
            parameterMix.valOfVars.add(visitExpr(ctx.expr(i)));
        }
        return parameterMix;
    }
    @Override public  exper visitExpr(SQLParser.ExprContext ctx) {
        System.out.println("visitExpr");
        exper exp=new exper();
        if(ctx.literal_value()!=null){
            exp.literalValue=visitLiteral_value(ctx.literal_value());
        }
        if(ctx.unary_expr()!=null){
            exp.unaryExper = visitUnary_expr(ctx.unary_expr());
        }
        // math and logic exper
        if (ctx.expr().size()==2){
            //Math
            if(ctx.DIV()!=null){
                MathExpr m =new MathExpr();

                System.out.println("Math exper");
                m.operand=ctx.DIV().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println("index of array : "+m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.mathExpr=m;
            }
            if(ctx.MINUS()!=null){
                MathExpr m =new MathExpr();

                System.out.println("Math exper");
                m.operand=ctx.MINUS().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.mathExpr=m;

            }
            if(ctx.PLUS()!=null){
                MathExpr m =new MathExpr();

                System.out.println("Math exper");
                m.operand=ctx.PLUS().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.mathExpr=m;

            }
            if(ctx.MOD()!=null){
                MathExpr m =new MathExpr();

                System.out.println("Math exper");
                m.operand=ctx.MOD().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.mathExpr=m;

            }
            if(ctx.STAR()!=null){
                MathExpr m =new MathExpr();

                System.out.println("Math exper");
                m.operand=ctx.STAR().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.mathExpr=m;

            }
            //Logic
            if(ctx.PIPE2()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.PIPE2().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.PIPE()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.PIPE().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.ASSIGN()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.ASSIGN().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.EQ()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.EQ().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getSymbol().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.GT()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.GT().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.GT2()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.GT2().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.GT_EQ()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.GT_EQ().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.LT()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.LT().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.LT2()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.LT2().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.LT_EQ()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.LT_EQ().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.NOT_EQ1()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.NOT_EQ1().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.NOT_EQ2()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.NOT_EQ2().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.AMP()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.AMP().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.AMP2()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.AMP2().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            //The remaining word processing exists between two expressions?

            if(ctx.K_IS()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_IS().getText();
                if(ctx.K_NOT()!=null){
                    m.operand +=" "+ctx.K_NOT().getText();
                }
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_IN()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_IN().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_LIKE()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_LIKE().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_GLOB()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_GLOB().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_MATCH()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_MATCH().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_REGEXP()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_REGEXP().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_AND()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_AND().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }
            if(ctx.K_OR()!=null){
                LogicExpr m =new LogicExpr();

                System.out.println("Logic exper");
                m.operand=ctx.K_OR().getText();
                System.out.println("operand : "+m.operand);
                m.leftExpr=visitExpr(ctx.expr(0));
                if(ctx.ARRAY_BRACKET_WITH_INDEX()!=null){
                    m.indexOfArray = ctx.ARRAY_BRACKET_WITH_INDEX().getText();
                    System.out.println(m.indexOfArray);
                }
                m.RightExpr=visitExpr(ctx.expr(1));
                exp.logicExpr=m;
            }

        }
        if(ctx.bd_table_column_name()!=null){
            exp.bd_table_column_Name=visitBd_table_column_name(ctx.bd_table_column_name());

        }
        if(ctx.call_function_in_expr()!=null){
            exp.callFuncInExpr = visitCall_function_in_expr(ctx.call_function_in_expr());
        }
        if(ctx.expr_enclose_with_brackets()!=null){
            exp.exprEncloseWithBrackets = visitExpr_enclose_with_brackets(ctx.expr_enclose_with_brackets());

        }
        if(ctx.select_enclose_with_brackets()!=null){
            exp.selectEncloseWithBrackets = visitSelect_enclose_with_brackets(ctx.select_enclose_with_brackets());
            System.out.println("selectEncloseWithBrackets ");
        }


        return exp;
    }
    @Override public Literal_value visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        System.out.println("visitLiteral_value");
        Literal_value literal_value = new Literal_value();

        if(ctx.NUMERIC_LITERAL()!=null){
            literal_value.value = ctx.NUMERIC_LITERAL().getText();
            System.out.println("value of expr : "+literal_value.value);
        }
        else if(ctx.STRING_LITERAL()!=null){
            literal_value.value = ctx.STRING_LITERAL().getText();
            System.out.println("value of expr : "+literal_value.value);
        }
        else {
            literal_value.value = " non string or number";
            System.out.println("value of expr : "+literal_value.value);
        }
        return literal_value;
    }
    @Override public UnaryExper visitUnary_expr(SQLParser.Unary_exprContext ctx) {
        System.out.println("visitUnary_expr");
        UnaryExper UExp = new UnaryExper();
        if(ctx.K_NOT()!=null){
            UExp.operand=ctx.K_NOT().getText();
            System.out.println("operand : "+UExp.operand);
        }else if(ctx.MINUS()!=null){
            UExp.operand=ctx.MINUS().getText();
            System.out.println("operand : "+UExp.operand);
        }else if(ctx.PLUS()!=null){
            UExp.operand=ctx.PLUS().getText();
            System.out.println("operand : "+UExp.operand);
        }else if(ctx.TILDE()!=null){
            UExp.operand=ctx.TILDE().getText();
            System.out.println("operand : "+UExp.operand);
        }

        UExp.exp = visitExpr(ctx.expr());

        return UExp;
    }
    @Override public BD_Table_Column_name visitBd_table_column_name(SQLParser.Bd_table_column_nameContext ctx) {
        System.out.println("visitBd_table_column_name");
        BD_Table_Column_name bd_table_column_name =new BD_Table_Column_name();
        if(ctx.database_name()!=null){
            bd_table_column_name.dateBaseName=visitDatabase_name(ctx.database_name());
        }
        if(ctx.table_name()!=null){
            bd_table_column_name.tableName=visitTable_name(ctx.table_name());
        }
        if(ctx.column_name()!=null){
            bd_table_column_name.columnName=visitColumn_name(ctx.column_name());
        }



        return bd_table_column_name;
    }
    @Override public ColumnName visitColumn_name(SQLParser.Column_nameContext ctx) {
        System.out.println("visitColumn_name");
        ColumnName columnName =new ColumnName();
        columnName.anyName = visitAny_name(ctx.any_name());
        return columnName;
    }
    @Override public TableName visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.println("visitTable_name");
        TableName tableName = new TableName();
        tableName.tname= visitTname(ctx.tname());
        return tableName;
    }
    @Override public DateBaseName visitDatabase_name(SQLParser.Database_nameContext ctx) {
        System.out.println("visitDatabase_name");
        DateBaseName dateBaseName = new DateBaseName();
        dateBaseName.anyName=visitAny_name(ctx.any_name());
        return dateBaseName;
    }
    @Override public AnyName visitAny_name(SQLParser.Any_nameContext ctx) {
        System.out.println("visitAny_name");
        AnyName anyName =new AnyName();
        if(ctx.IDENTIFIER()!=null){
            anyName.value= ctx.IDENTIFIER().getText();
        }
        if(ctx.STRING_LITERAL()!=null){
            anyName.value= ctx.STRING_LITERAL().getText();

        }
        if(ctx.keyword()!=null){
            anyName.value="keyword";

        }
        //?!
        if(ctx.any_name()!=null){
            anyName = visitAny_name(ctx.any_name());

        }
        System.out.println("anyName : "+ anyName.value);
        return anyName;
    }
    //this anyName without keyword
    @Override public Tname visitTname(SQLParser.TnameContext ctx) {
        System.out.println("visitTname");
        Tname tname =new Tname();

        if(ctx.IDENTIFIER()!=null){
            tname.value= ctx.IDENTIFIER().getText();
        }
        if(ctx.STRING_LITERAL()!=null){
            tname.value= ctx.STRING_LITERAL().getText();

        }

        //?!
        if(ctx.tname()!=null){
            tname = visitTname(ctx.tname());

        }
        System.out.println("table Name : "+ tname.value);


        return tname;
    }

    @Override public CallFuncInExpr visitCall_function_in_expr(SQLParser.Call_function_in_exprContext ctx) {
        System.out.println("visitCall_function_in_expr");
        CallFuncInExpr callFuncInExpr = new CallFuncInExpr();
        callFuncInExpr.functionName = visitFunction_name(ctx.function_name());
        if(ctx.K_DISTINCT()!=null){
            System.out.println("there is a DISTINCT key word here");
            callFuncInExpr.DISTINCT=ctx.K_DISTINCT().getText();
        }

        for(int i=0 ; i< ctx.expr().size();i++){
            callFuncInExpr.experList.add(visitExpr(ctx.expr().get(i)));
        }
        if(ctx.STAR()!=null){
            callFuncInExpr.Star=ctx.STAR().getText();
            System.out.println(callFuncInExpr.Star);
        }

        return callFuncInExpr;
    }

    @Override public FunctionName visitFunction_name(SQLParser.Function_nameContext ctx) {
        System.out.println("visitFunction_name");
        FunctionName functionName = new FunctionName();
        functionName.anyName = visitAny_name(ctx.any_name());
        return functionName;
    }

    @Override public Expr_enclose_with_brackets visitExpr_enclose_with_brackets(SQLParser.Expr_enclose_with_bracketsContext ctx) {
        System.out.println("visitExpr_enclose_with_brackets");
        Expr_enclose_with_brackets exprEncloseWithBrackets = new Expr_enclose_with_brackets() ;
        exprEncloseWithBrackets.exp = visitExpr(ctx.expr());
        return exprEncloseWithBrackets;
    }

    @Override public Select_enclose_with_brackets visitSelect_enclose_with_brackets(SQLParser.Select_enclose_with_bracketsContext ctx) {
        System.out.println("visitSelect_enclose_with_brackets");
        Select_enclose_with_brackets select_enclose_with_brackets =new Select_enclose_with_brackets();
        if(ctx.K_NOT()!=null){
            select_enclose_with_brackets.NOT = ctx.K_NOT().getText();
            System.out.println(select_enclose_with_brackets.NOT);
        }
        if(ctx.K_EXISTS()!=null){
            select_enclose_with_brackets.EXISTS = ctx.K_EXISTS().getText();
            System.out.println(select_enclose_with_brackets.EXISTS);
        }
        return select_enclose_with_brackets;
    }

    ///////////SSSSSSSSSSSSS QQQQQQQQQQQQQQQQQQQQQ LLLLLLLLLLLLL

    @Override public List<SqlStatement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {
        System.out.println("visitSql_stmt_list");
        List<SqlStatement> sqlStmt = new ArrayList<SqlStatement>();

        for (int i =0; i < ctx.sql_stmt().size() ; i++){
            sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
        }
        return sqlStmt;

    }
    @Override public SqlStatement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt");
        SqlStatement s = new SqlStatement();
        if(ctx.alter_table_stmt()!=null){
            s=visitAlter_table_stmt(ctx.alter_table_stmt());
        }
        if(ctx.create_table_stmt()!=null){
            s=visitCreate_table_stmt(ctx.create_table_stmt());
        }

        if(ctx.delete_stmt()!=null){
            s=visitDelete_stmt(ctx.delete_stmt());
        }
        if(ctx.drop_table_stmt()!=null){
            s=visitDrop_table_stmt(ctx.drop_table_stmt());
        }
        if(ctx.factored_select_stmt() != null){
            s = visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        if(ctx.insert_stmt() != null){
            s = visitInsert_stmt(ctx.insert_stmt());
        }
        if(ctx.update_stmt() != null){
            s = visitUpdate_stmt(ctx.update_stmt());
        }


        return s;
    }

    @Override
    public FactoredSelect visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        System.out.println("visitFactored_select_stmt");
        FactoredSelect factoredSelect = new FactoredSelect();
        factoredSelect.selectCore = visitSelect_core(ctx.select_core());
        for (int i=0 ; i < ctx.ordering_term().size() ; i++){
            factoredSelect.orderingTermList.add(visitOrdering_term(ctx.ordering_term().get(i)));
        }
        for (int i=0 ; i < ctx.expr().size() ; i++){
            factoredSelect.experList.add(visitExpr(ctx.expr(i)));
        }

        return factoredSelect;
    }

    @Override
    public SelectCore visitSelect_core(SQLParser.Select_coreContext ctx) {
        System.out.println("visitSelect_core");
        SelectCore selectCore =new SelectCore();
        for(int i =0 ;i<ctx.result_column().size();i++){
            selectCore.resultColumnList.add(visitResult_column(ctx.result_column(i)));
        }
        if(ctx.from_clause()!=null){
            selectCore.fromClause = visitFrom_clause(ctx.from_clause());
        }
        if(ctx.where_clause()!=null){
            selectCore.whereClause = visitWhere_clause(ctx.where_clause());
        }
        if(ctx.groupBy_clause()!=null){
            selectCore.groupByClause= visitGroupBy_clause(ctx.groupBy_clause());
        }
        for(int i =0 ;i<ctx.expr().size();i++){
            selectCore.experList.add(visitExpr(ctx.expr(i)));
        }

        return selectCore;
    }

    @Override public FromClause visitFrom_clause(SQLParser.From_clauseContext ctx) {
        System.out.println("visitFrom_clause");
        FromClause fromClause =new FromClause();
        for(int i=0 ;i < ctx.table_or_subquery().size();i++){
            fromClause.tableOrSubqueryList.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
        }
        if(ctx.join_clause()!=null){
            fromClause.join=visitJoin_clause(ctx.join_clause());
        }
        return fromClause;
    }

    @Override
    public WhereClause visitWhere_clause(SQLParser.Where_clauseContext ctx) {
        System.out.println("visitWhere_clause");
        WhereClause whereClause =new WhereClause();
        whereClause.expr=visitExpr(ctx.expr());
        return whereClause;
    }

    @Override
    public GroupByClause visitGroupBy_clause(SQLParser.GroupBy_clauseContext ctx) {
        System.out.println("visitGroupBy_clause");
        GroupByClause groupByClause =new GroupByClause();
        for(int i=0;i<ctx.expr().size();i++){
            groupByClause.experList.add(visitExpr(ctx.expr(i)));
        }
        if(ctx.having_clause()!=null){
            groupByClause.havingClause = visitHaving_clause(ctx.having_clause());
        }
        return groupByClause;
    }

    @Override
    public HavingClause visitHaving_clause(SQLParser.Having_clauseContext ctx) {
        System.out.println("visitHaving_clause");
        HavingClause havingClause =new HavingClause();
        havingClause.exp = visitExpr(ctx.expr());
        return havingClause;
    }

    @Override public JoinClause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        System.out.println("visitJoin_clause");
        JoinClause join=new JoinClause();

        join.tableOrSubqueryList.add(0,visitTable_or_subquery(ctx.table_or_subquery(0)));
        for (int i =0 ; i < ctx.join_operator().size();i++){
            join.joinOperatorList.add(visitJoin_operator(ctx.join_operator(i)));
            join.tableOrSubqueryList.add(i+1,visitTable_or_subquery(ctx.table_or_subquery(i+1)));
            join.joinConstraints.add(visitJoin_constraint(ctx.join_constraint(i)));

        }
        return join;
    }

    @Override
    public JoinOperator visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        System.out.println("visitJoin_operator");
        JoinOperator joinOperator = new JoinOperator();
        if(ctx.COMMA()!=null){
            joinOperator.joinOperator = ctx.COMMA().getText();
        }
        else {
            if(ctx.K_LEFT()!=null&&ctx.K_OUTER()!=null){
                joinOperator.joinOperator = ctx.K_LEFT().getText()+ctx.K_OUTER().getText()+ctx.K_JOIN().getText();

            }
            if(ctx.K_LEFT()!=null && ctx.K_OUTER()==null){
                joinOperator.joinOperator = ctx.K_LEFT().getText()+ctx.K_JOIN().getText();

            }
            if(ctx.K_INNER()!=null){
                joinOperator.joinOperator = ctx.K_INNER().getText()+ctx.K_JOIN().getText();
            }
        }
        return joinOperator;
    }

    @Override
    public JoinConstraint visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        System.out.println("visitJoin_constraint");
        JoinConstraint joinConstraint = new JoinConstraint();
        joinConstraint.exr = visitExpr(ctx.expr());
        return joinConstraint;
    }

    @Override public  OrderingTerm visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        System.out.println("visitOrdering_term");
        OrderingTerm orderingTerm =new OrderingTerm();
        orderingTerm.expr = visitExpr(ctx.expr());
        if(ctx.collation_name()!=null){
            orderingTerm.collationName = visitCollation_name(ctx.collation_name());
        }
        if(ctx.K_ASC()!=null){
            orderingTerm.ASC=ctx.K_ASC().getText().toUpperCase();
        }
        if(ctx.K_DESC()!=null){
            orderingTerm.DESC=ctx.K_DESC().getText().toUpperCase();
        }
        return orderingTerm;
    }
    @Override public  CollationName visitCollation_name(SQLParser.Collation_nameContext ctx) {
        System.out.println("visitCollation_name");
        CollationName collationName = new CollationName();
        collationName.anyName = visitAny_name(ctx.any_name());
        return collationName;
    }


    @Override
    public AlterTable visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
        System.out.println("visitAlter_table_stmt");
        AlterTable alterTable = new AlterTable();
        if(ctx.database_name()!=null){
            alterTable.dateBaseName = visitDatabase_name(ctx.database_name());
        }
        alterTable.sourceTableName = visitSource_table_name(ctx.source_table_name());

        if(ctx.new_table_name()!=null){
          alterTable.newTableName = visitNew_table_name(ctx.new_table_name());
        }
        if(ctx.alter_table_add()!=null){
            alterTable.alterTableAdd = visitAlter_table_add(ctx.alter_table_add());
        }
        if(ctx.alter_table_add_constraint()!=null){
            alterTable.alterTableAddConstraint = visitAlter_table_add_constraint(ctx.alter_table_add_constraint());
        }
        if(ctx.column_def()!=null){
            alterTable.columnDef = visitColumn_def(ctx.column_def());
        }
        return alterTable;
    }

    @Override
    public SourceTableName visitSource_table_name(SQLParser.Source_table_nameContext ctx) {
        System.out.println("visitSource_table_name");
        SourceTableName sourceTableName = new SourceTableName();
        sourceTableName.anyName =visitAny_name(ctx.any_name());
        return sourceTableName;
    }

    @Override
    public NewTableName visitNew_table_name(SQLParser.New_table_nameContext ctx) {
        System.out.println("visitNew_table_name");
        NewTableName newTableName =new NewTableName();
        newTableName.anyName = visitAny_name(ctx.any_name());
        return newTableName;
    }

    @Override
    public AlterTableAdd visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
        System.out.println("visitAlter_table_add");
        AlterTableAdd alterTableAdd =new AlterTableAdd();
        alterTableAdd.tableConstraint = visitTable_constraint(ctx.table_constraint());

        return alterTableAdd;
    }

    @Override
    public Name visitName(SQLParser.NameContext ctx) {
        System.out.println("visitName");
        Name name = new Name();
        name.anyName = visitAny_name(ctx.any_name());
        return name;
    }

    @Override
    public TableConstraintPrimaryKey visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) {
        System.out.println("visitTable_constraint_primary_key");
        TableConstraintPrimaryKey tableConstraintPrimaryKey =  new TableConstraintPrimaryKey();
        for(int i =0 ; i<ctx.indexed_column().size();i++){
            tableConstraintPrimaryKey.indexedColumn.add(visitIndexed_column(ctx.indexed_column(i)));
        }

        return tableConstraintPrimaryKey;
    }
    @Override
    public TableConstraintKey visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) {
        System.out.println("visitTable_constraint_key");
        TableConstraintKey tableConstraintKey =  new TableConstraintKey();
        if(ctx.name()!=null){
            tableConstraintKey.name = visitName(ctx.name());
        }
        for(int i =0 ; i<ctx.indexed_column().size();i++){
            tableConstraintKey.indexedColumnList.add(visitIndexed_column(ctx.indexed_column(i)));
        }
        return tableConstraintKey;
    }
    @Override
    public TableConstraintUnique visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) {
        System.out.println("visitTable_constraint_unique");
        TableConstraintUnique tableConstraintUnique =  new TableConstraintUnique();
        return tableConstraintUnique;
    }

    @Override
    public TableConstraintForeignKey visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) {
        System.out.println("visitTable_constraint_foreign_key");
        TableConstraintForeignKey tableConstraintForeignKey =new TableConstraintForeignKey();
        return tableConstraintForeignKey;
    }

    @Override
    public FkOriginColumnName visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx) {
        System.out.println("visitFk_origin_column_name");
        FkOriginColumnName fkOriginColumnName = new FkOriginColumnName();
        fkOriginColumnName.columnName = visitColumn_name(ctx.column_name());
        return fkOriginColumnName;
    }

    @Override
    //this rule need to some fix for tokens
    public ForeignKeyClause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        System.out.println("visitForeign_key_clause");
        ForeignKeyClause foreignKeyClause = new ForeignKeyClause();
        if(ctx.database_name()!=null){
            foreignKeyClause.datebaseName = visitDatabase_name(ctx.database_name());
        }
        foreignKeyClause.foreignTable = visitForeign_table(ctx.foreign_table());
        for(int i=0 ; i < ctx.fk_target_column_name().size();i++){
            foreignKeyClause.fkTargetColumnNameList.add(visitFk_target_column_name(ctx.fk_target_column_name(i)));
        }
        for(int i=0 ; i < ctx.on_sectin_or_matchName().size();i++){
            foreignKeyClause.onSectionOrMatchNames.add(visitOn_sectin_or_matchName(ctx.on_sectin_or_matchName(i)));
        }

        if(ctx.K_NOT()!=null){
            foreignKeyClause.NOT = "NOT";
        }
        if(ctx.K_DEFERRABLE()!=null){
            foreignKeyClause.DEFERRABLE= "DEFERRABLE";
        }
        if(ctx.K_DEFERRED()!=null){
            foreignKeyClause.INITIALLY_DEFERRED= "INITIALLY_DEFERRED";
        }
        if(ctx.K_IMMEDIATE()!=null){
            foreignKeyClause.INITIALLY_IMMEDIATE= "INITIALLY_IMMEDIATE";
        }
        if(ctx.K_ENABLE()!=null){
            foreignKeyClause.ENABLE= "ENABLE";
        }

    return foreignKeyClause;
    }

    @Override
    public OnSectionOrMatchName visitOn_sectin_or_matchName(SQLParser.On_sectin_or_matchNameContext ctx) {
        System.out.println("visitOn_sectin_or_matchName");
        OnSectionOrMatchName onSectionOrMatchName = new OnSectionOrMatchName();
        if(ctx.on_sectin()!=null){
            onSectionOrMatchName.onSection = visitOn_sectin(ctx.on_sectin());
        }
        else if (ctx.match_name()!=null){
            onSectionOrMatchName.matchName = visitMatch_name(ctx.match_name());
        }
        return onSectionOrMatchName;
    }

    @Override
    public OnSection visitOn_sectin(SQLParser.On_sectinContext ctx) {
        System.out.println("visitOn_sectin");
        OnSection onSection = new OnSection();
        onSection.ON = ctx.K_ON().getText();
        if(ctx.K_DELETE()!=null){
            onSection.DELETE = ctx.K_DELETE().getText();
        }
        if(ctx.K_UPDATE()!=null){
            onSection.UPDATE = ctx.K_UPDATE().getText();
        }
        if(ctx.K_NULL()!=null){
            onSection.SET_NULL = "SET_NULL";
        }
        if(ctx.K_DEFAULT()!=null){
            onSection.SET_DEFAULT = "SET_DEFAULT";
        }
        if(ctx.K_CASCADE()!=null){
            onSection.CASCADE = ctx.K_CASCADE().getText();
        }
        if(ctx.K_RESTRICT()!=null){
            onSection.RESTRICT = ctx.K_RESTRICT().getText();
        }
        if(ctx.K_ACTION()!=null){
            onSection.NO_ACTION = "NO_ACTION";
        }
        return onSection;
    }

    @Override
    public MatchName visitMatch_name(SQLParser.Match_nameContext ctx) {
        System.out.println("visitMatch_name");
        MatchName matchName = new MatchName();
        matchName.name = visitName(ctx.name());
        return matchName;
    }

    @Override
    public ForeignTable visitForeign_table(SQLParser.Foreign_tableContext ctx) {
        System.out.println("visitForeign_table");
        ForeignTable foreignTable = new ForeignTable();
        foreignTable.anyNamee = visitAny_name(ctx.any_name());
        return foreignTable;
    }

    @Override
    public FkTargetColumnName visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx) {
        System.out.println("visitFk_target_column_name");
        FkTargetColumnName fkTargetColumnName = new FkTargetColumnName();
        fkTargetColumnName.n = visitName(ctx.name());
        return fkTargetColumnName;
    }

    @Override
    public AlterTableAddConstraint visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) {
        System.out.println("visitAlter_table_add_constraint");
        AlterTableAddConstraint alterTableAddConstraint =new AlterTableAddConstraint();
        alterTableAddConstraint.anyName=visitAny_name(ctx.any_name());
        alterTableAddConstraint.tableConstraint = visitTable_constraint(ctx.table_constraint());

        return alterTableAddConstraint;
    }

    @Override
    public ColumnDef visitColumn_def(SQLParser.Column_defContext ctx) {
        System.out.println("visitColumn_def");
        ColumnDef columnDef =new ColumnDef();
        columnDef.columnName = visitColumn_name(ctx.column_name());
        for(int i=0 ;i< ctx.column_constraint().size();i++){
            columnDef.columnConstraintList.add(visitColumn_constraint(ctx.column_constraint(i)));
        }
        for(int i=0 ;i< ctx.type_name().size();i++){
            columnDef.typeNameList.add(visitType_name(ctx.type_name(i)));
        }


        return columnDef;
    }

    @Override
    public ColumnConstraint visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        System.out.println("visitColumn_constraint");
        ColumnConstraint columnCconstraint = new ColumnConstraint();
        if(ctx.name()!=null){
            columnCconstraint.name = visitName(ctx.name());
        }
        if(ctx.column_constraint_primary_key()!=null){
            columnCconstraint.columnConstraintPrimaryKey = visitColumn_constraint_primary_key(ctx.column_constraint_primary_key());
        }
        if(ctx.column_constraint_foreign_key()!=null){
            columnCconstraint.columnConstraintForeignKey = visitColumn_constraint_foreign_key(ctx.column_constraint_foreign_key());
        }
        if(ctx.column_constraint_not_null()!=null){
            columnCconstraint.columnConstraintNotNull = visitColumn_constraint_not_null(ctx.column_constraint_not_null());
        }
        if(ctx.column_constraint_null()!=null){
            columnCconstraint.columnConstraintNull = visitColumn_constraint_null(ctx.column_constraint_null());
        }
        if(ctx.expr()!=null){
            columnCconstraint.expr = visitExpr(ctx.expr());
        }
        if(ctx.column_default()!=null){
            columnCconstraint.columnDefault = visitColumn_default(ctx.column_default());
        }
        if(ctx.collation_name()!=null){
            columnCconstraint.collationName = visitCollation_name(ctx.collation_name());
        }
        return columnCconstraint;
    }

    @Override
    public ColumnConstraintPrimaryKey visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx) {
        System.out.println("visitColumn_constraint_primary_key");
        ColumnConstraintPrimaryKey columnConstraintPrimaryKey = new ColumnConstraintPrimaryKey();
        if(ctx.K_ASC()!=null){
            columnConstraintPrimaryKey.ASC_OR_DESC = ctx.K_ASC().getText();
        }
        if(ctx.K_DESC()!=null){
            columnConstraintPrimaryKey.ASC_OR_DESC = ctx.K_DESC().getText();
        }
        if(ctx.K_AUTOINCREMENT()!=null){
            columnConstraintPrimaryKey.AUTOINCREMENT = ctx.K_AUTOINCREMENT().getText();
        }
        return columnConstraintPrimaryKey;
    }
    @Override
    public ColumnConstraintForeignKey visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx) {
        System.out.println("visitColumn_constraint_foreign_key");
        ColumnConstraintForeignKey columnConstraintForeignKeyKey = new ColumnConstraintForeignKey();
        columnConstraintForeignKeyKey.foreignKeyClause = visitForeign_key_clause(ctx.foreign_key_clause());
        return columnConstraintForeignKeyKey;
    }

    @Override
    public ColumnConstraintNotNull visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx) {
        System.out.println("visitColumn_constraint_not_null");
        ColumnConstraintNotNull columnConstraintNotNull = new ColumnConstraintNotNull();
        return columnConstraintNotNull;
    }
    @Override
    public ColumnConstraintNull visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx) {
        System.out.println("visitColumn_constraint_null");
        ColumnConstraintNull columnConstraintNull = new ColumnConstraintNull();
        return columnConstraintNull;
    }

    @Override
    public ColumnDefault visitColumn_default(SQLParser.Column_defaultContext ctx) {
        System.out.println("visitColumn_default");
        ColumnDefault columnDefault = new ColumnDefault();
        if(ctx.column_default_value()!=null){
            columnDefault.columnDefaultValue = visitColumn_default_value(ctx.column_default_value());
        }
        else if(ctx.expr()!=null){
            columnDefault.expr = visitExpr(ctx.expr());
        }
        else if (ctx.next_val()!=null){
            columnDefault.nv = visitNext_val(ctx.next_val());
        }
        else if(ctx.any_name()!=null){
            columnDefault.anyName = visitAny_name(ctx.any_name());
        }
        if(ctx.any_name_colon()!=null){
            columnDefault.anyNameColon = visitAny_name_colon(ctx.any_name_colon());
        }
        return columnDefault;
    }

    @Override
    public ColumnDefaultValue visitColumn_default_value(SQLParser.Column_default_valueContext ctx) {
        System.out.println("visitColumn_default_value");
        ColumnDefaultValue columnDefaultValue = new ColumnDefaultValue();
        if(ctx.signed_number()!=null){
            columnDefaultValue.signedNumber = visitSigned_number(ctx.signed_number());
        }
        else if (ctx.literal_value()!=null){
            columnDefaultValue.literalValue = visitLiteral_value(ctx.literal_value());
        }
        return columnDefaultValue;
    }

    @Override
    public NextVal visitNext_val(SQLParser.Next_valContext ctx) {
        System.out.println("visitNext_val");
        NextVal nextVal = new NextVal();
        nextVal.expr = visitExpr(ctx.expr());
        return nextVal;
    }

    @Override
    public AnyNameColon visitAny_name_colon(SQLParser.Any_name_colonContext ctx) {
        System.out.println("visitAny_name_colon");
        AnyNameColon anyNameColon = new AnyNameColon();
        for (int i =0 ; i < ctx.any_name().size();i++){
            anyNameColon.anyNames.add(visitAny_name(ctx.any_name(i)));
        }
        return anyNameColon;
    }

    @Override
    public TypeName visitType_name(SQLParser.Type_nameContext ctx) {
        System.out.println("visitType_name");
        TypeName typeName = new TypeName();
        typeName.name = visitName(ctx.name());
        for (int i =0 ; i< ctx.signed_number().size();i++){
            typeName.signedNumberList.add(visitSigned_number(ctx.signed_number(i)));
            if(ctx.any_name(i)!=null){
                typeName.anyNameList.add(i,visitAny_name(ctx.any_name(i)));
            }
        }

        return typeName;
    }

    @Override
    public SignedNumber visitSigned_number(SQLParser.Signed_numberContext ctx) {
        System.out.println("visitSigned_number");
        SignedNumber signedNumber = new SignedNumber();
        if(ctx.PLUS()!=null){
            signedNumber.sign = " + ";
        }
        else  if (ctx.MINUS()!=null){
            signedNumber.sign = " - ";
        }
        if (ctx.NUMERIC_LITERAL()!=null){
            signedNumber.NUMERIC_LITERALL = ctx.NUMERIC_LITERAL().getText();
        }
        if (ctx.STAR()!=null){
            signedNumber.star = " * ";
        }
        return signedNumber;
    }

    @Override
    public CreateTable visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        System.out.println("visitCreate_table_stmt");
        CreateTable createTable=new CreateTable();
        if(ctx.database_name()!=null){
            createTable.dateBaseName = visitDatabase_name(ctx.database_name());
        }
        createTable.tableName=visitTable_name( ctx.table_name());
        for(int i =0 ; i< ctx.column_def().size();i++){
            createTable.columnDeflist.add(visitColumn_def(ctx.column_def().get(i)));
        }
        for(int i =0 ; i< ctx.table_constraint().size();i++){
            createTable.tableConstraints.add(visitTable_constraint(ctx.table_constraint().get(i)));
        }
        if(ctx.select_stmt()!=null){
            createTable.selectStmt = visitSelect_stmt(ctx.select_stmt());
        }

        return createTable;
    }

    @Override
    public Delete visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        System.out.println("visitDelete_stmt");
        Delete delete = new Delete();

        delete.qualifiedTableName = visitQualified_table_name(ctx.qualified_table_name());
        if(ctx.expr()!=null){
            delete.exp = visitExpr(ctx.expr());
        }
        return delete;
    }

    @Override
    public QualifiedTableName visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        System.out.println("visitQualified_table_name");
        QualifiedTableName qualifiedTableName = new QualifiedTableName();
        if(ctx.database_name()!=null){
            qualifiedTableName.dateBaseName = visitDatabase_name(ctx.database_name());
        }
        qualifiedTableName.tableName=visitTable_name(ctx.table_name());
        if(ctx.index_name()!=null){
            qualifiedTableName.indexName=visitIndex_name(ctx.index_name());
        }
        if(ctx.K_NOT()!=null && ctx.K_INDEXED()!=null){
            qualifiedTableName.NOT_INDEXED=ctx.K_NOT().getText().toUpperCase()+" "+ctx.K_INDEXED().getText().toUpperCase();
        }
        return qualifiedTableName;
    }

    @Override
    public IndexName visitIndex_name(SQLParser.Index_nameContext ctx) {
        System.out.println("visitIndex_name");
        IndexName indexName =new IndexName();
        indexName.anyName  = visitAny_name(ctx.any_name());
        return indexName;
    }

    @Override
    public TableConstraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        System.out.println("visitTable_constraint");
        TableConstraint tableConstraint = new TableConstraint();
        if(ctx.name()!=null){
            tableConstraint.name = visitName(ctx.name());
        }
        if(ctx.table_constraint_primary_key()!=null){
            tableConstraint.tableConstraintPrimaryKey=visitTable_constraint_primary_key(ctx.table_constraint_primary_key());
        }
        if(ctx.table_constraint_key()!=null){
            tableConstraint.tableConstraintKey = visitTable_constraint_key(ctx.table_constraint_key());
        }
        if(ctx.table_constraint_unique()!=null){
            tableConstraint.tableConstraintUnique = visitTable_constraint_unique(ctx.table_constraint_unique());
        }
        if(ctx.table_constraint_foreign_key()!=null){
            tableConstraint.tableConstraintForeignKey = visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key());
        }
        if(ctx.expr()!=null){
            tableConstraint.exp = visitExpr(ctx.expr());
        }

        return tableConstraint;
    }

    @Override
    public IndexedColumn visitIndexed_column(SQLParser.Indexed_columnContext ctx) {
        System.out.println("visitIndexed_column");
        IndexedColumn indexedColumn = new IndexedColumn();

        indexedColumn.columnName=visitColumn_name(ctx.column_name());
        if(ctx.collation_name()!=null){
            indexedColumn.collationName = visitCollation_name(ctx.collation_name());
        }
        if(ctx.K_ASC()!=null){
            indexedColumn.ASC = ctx.K_ASC().getText().toUpperCase();
            System.out.println(indexedColumn.ASC);
        }
        if(ctx.K_DESC()!=null){
            indexedColumn.DESC=ctx.K_DESC().getText().toUpperCase();
            System.out.println(indexedColumn.DESC);
        }
        return indexedColumn;
    }

    @Override
    public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");
        SelectStmt selectStmt =new SelectStmt();
        selectStmt.selectOrValues = visitSelect_or_values(ctx.select_or_values());
        for(int i=0 ; i< ctx.ordering_term().size();i++){
            selectStmt.orderingTermList.add(visitOrdering_term(ctx.ordering_term(i)));
        }
        for(int i=0 ; i< ctx.expr().size();i++){
            selectStmt.experList.add(visitExpr(ctx.expr(i)));
        }
        return selectStmt;
    }

    @Override
    public DropTable visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        System.out.println("visitDrop_table_stmt");
        DropTable dropTable =new DropTable();
        if(ctx.K_IF()!=null){
            dropTable.if_exists = ctx.K_IF().getText() + ctx.K_EXISTS().getText();
        }
        if(ctx.database_name()!=null){
            dropTable.dateBaseName = visitDatabase_name(ctx.database_name());
        }
        dropTable.tableName = visitTable_name(ctx.table_name());
        return dropTable;
    }

    @Override
    public Insert visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
        System.out.println("visitInsert_stmt");
        Insert insert =new Insert();
        if(ctx.database_name()!=null){
            insert.dateBaseName = visitDatabase_name(ctx.database_name());
        }
        if(ctx.table_name()!=null){
            insert.tableName = visitTable_name(ctx.table_name());
            for(int i=0 ; i< ctx.column_name().size();i++){
                insert.columnNameList.add(visitColumn_name(ctx.column_name(i)));
            }
        }
        for(int i=0 ; i< ctx.expr().size();i++){
            insert.exprList.add(visitExpr(ctx.expr(i)));
        }
        if(ctx.select_stmt()!=null){
            insert.selectStmt = visitSelect_stmt(ctx.select_stmt());
        }
        if(ctx.K_DEFAULT()!=null && ctx.K_VALUES()!=null){
            insert.default_values = ctx.K_DEFAULT().getText().toUpperCase()+" "+ ctx.K_VALUES().getText().toUpperCase();
            System.out.println(insert.default_values);
        }
        return insert;
    }

    @Override
    public Update visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        System.out.println("visitUpdate_stmt");
        Update update = new Update();
        update.qualifiedTableName = visitQualified_table_name(ctx.qualified_table_name());
        for(int i=0;i<ctx.column_name().size();i++ ){
            update.columnNameList.add(visitColumn_name(ctx.column_name(i)));
            update.experList.add(visitExpr(ctx.expr(i)));
        }
        if(ctx.where_clause()!=null){
            update.where = visitWhere_clause(ctx.where_clause());
        }
        return update;
    }

    @Override public  Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
    @Override public  SelectOrValues visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        System.out.println("visitSelect_or_values");
        SelectOrValues selectOrValues = new SelectOrValues();
        if(ctx.K_DISTINCT()!=null){
            selectOrValues.DISTINCT = ctx.K_DISTINCT().getText();
        }
        if(ctx.K_ALL()!=null){
            selectOrValues.ALL = ctx.K_ALL().getText();
        }
        for(int i=0;i<ctx.result_column().size();i++ ){
            selectOrValues.resultColumnList.add(visitResult_column(ctx.result_column(i)));
        }
        if(ctx.from_clause()!=null){
            selectOrValues.fromClause = visitFrom_clause(ctx.from_clause());
        }
        if(ctx.where_clause()!=null){
            selectOrValues.whereClause = visitWhere_clause(ctx.where_clause());
        }
        if(ctx.groupBy_clause()!=null){
            selectOrValues.groupByClause= visitGroupBy_clause(ctx.groupBy_clause());
        }
        for(int i =0 ;i<ctx.expr().size();i++){
            selectOrValues.experList.add(visitExpr(ctx.expr(i)));
        }

        return selectOrValues;
    }

    @Override public  ResultColumn visitResult_column(SQLParser.Result_columnContext ctx) {
        System.out.println("visitResult_column");
        ResultColumn resultColumn = new ResultColumn();
        if(ctx.table_name()==null&&ctx.expr()==null){
            resultColumn.star1 = "*";
            System.out.println(resultColumn.star1);
        }
        if(ctx.table_name()!=null){
            resultColumn.tableName = visitTable_name(ctx.table_name());
            resultColumn.star2 = "*";
            System.out.println(resultColumn.star2);
        }
        if(ctx.expr()!=null){
            resultColumn.exp = visitExpr(ctx.expr());
        }
        return resultColumn;
    }


    @Override public TableOrSubquery visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {
        System.out.println("visitTable_or_subquery");
        TableOrSubquery tableOrSubquery =new TableOrSubquery();
        if(ctx.database_name()!=null){
            tableOrSubquery.dateBaseName = visitDatabase_name(ctx.database_name());
        }
        if(ctx.table_name()!=null){
           tableOrSubquery.tableName = visitTable_name(ctx.table_name());
        }
        if(ctx.table_alias()!=null){
            tableOrSubquery.tableAlias = visitTable_alias(ctx.table_alias());
        }
        if(ctx.index_name()!=null){
            tableOrSubquery.indexName = visitIndex_name(ctx.index_name());
        }
        if(ctx.K_NOT()!=null){
            tableOrSubquery.NOT_INDEXED = ctx.K_NOT().getText().toUpperCase() +" "+ctx.K_INDEXED().getText().toUpperCase();
        }
        for(int i=0 ; i<ctx.table_or_subquery().size();i++){
            tableOrSubquery.tableOrSubqueryList.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
        }
        if(ctx.join_clause()!=null){
            tableOrSubquery.join = visitJoin_clause(ctx.join_clause());
        }
       if(ctx.select_core()!=null){
            tableOrSubquery.select = visitSelect_core(ctx.select_core());
        }


        return tableOrSubquery;
    }

    @Override
    public TableAlias visitTable_alias(SQLParser.Table_aliasContext ctx) {
        System.out.println("visitTable_alias");
        TableAlias tableAlias =new TableAlias();
        tableAlias.anyName = visitAny_name(ctx.any_name());
        return tableAlias;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  ColumnAlias visitColumn_alias(SQLParser.Column_aliasContext ctx) {
        System.out.println("visitColumn_alias");
        ColumnAlias columnAlias = new ColumnAlias();
        if(ctx.IDENTIFIER()!=null){
            columnAlias.IDENTIFIER = ctx.IDENTIFIER().getText();
        }
        else if(ctx.STRING_LITERAL()!=null){
            columnAlias.STRING_LITERAL = ctx.STRING_LITERAL().getText();
        }
        return columnAlias;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */



    @Override public  Object visitKeyword(SQLParser.KeywordContext ctx) { return visitChildren(ctx); }


}
