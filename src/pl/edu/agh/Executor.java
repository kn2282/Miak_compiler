package pl.edu.agh;

import Interpreter.CanvasGrammarParser;

import java.util.ArrayList;
import java.util.LinkedList;

public class Executor {

    private FunctionPool functionPool;
    private MemoryPool memory;
    private Evaluator evaluator;
    public  Executor(MemoryPool memory,FunctionPool functionPool,Evaluator evaluator){
        this.functionPool=functionPool;
        this.memory = memory;
        this.evaluator = evaluator;
    }
    void executeInstructionChain(CanvasGrammarParser.InstructionChainContext ctx){
        for (CanvasGrammarParser.InstructionContext instCtx:ctx.instr
        ) {
            try{
                executeInstruction(instCtx);

            }catch (StackOverflowError e){
                System.out.println("//Stack overflow!");
                return;
            }
        }

    }
    void executeInstruction(CanvasGrammarParser.InstructionContext ctx) throws StackOverflowError{
        CanvasGrammarParser.FunctionDefinitionContext f = ctx.functionDefinition();
        if(f != null){
            functionPool.define(f.functionName().getText(),f.arguments().arg,f.instructionChain());
        }
        CanvasGrammarParser.FunctionCallContext c = ctx.functionCall();
        if(c!=null){
            LinkedList<ValueContainer> args = new LinkedList<>();
            for (CanvasGrammarParser.ExpressionContext expr:c.functionCallArguments().arg
            ) {
                 args.add(new ValueContainer(evaluator.eval(expr)));
            }

            functionPool.call(c.functionName().getText(),args);
        }
        CanvasGrammarParser.VariableOperationContext v = ctx.variableOperation();
        if(v!=null){
            ValueContainer cont = new ValueContainer(evaluator.eval(v.expression()));
            CanvasGrammarParser.VariableRefContext varRef = v.variableRef();
            if(varRef instanceof CanvasGrammarParser.SameScopeVarContext)
                memory.set(((CanvasGrammarParser.SameScopeVarContext) varRef).variableName().getText(),cont,0);
            else if(varRef instanceof CanvasGrammarParser.HigherScopeVarContext)
                memory.set(((CanvasGrammarParser.HigherScopeVarContext) varRef).variableName().getText(),cont,1);
            else if(varRef instanceof CanvasGrammarParser.TopScopeVarContext)
                memory.set(((CanvasGrammarParser.TopScopeVarContext) varRef).variableName().getText(),cont,2);

        }
        CanvasGrammarParser.DrawInstructionContext d = ctx.drawInstruction();
        if (d != null) {
            String instruction = "ctx.";
            CanvasGrammarParser.FigureContext figure = d.figure();
            switch (figure.getClass().getSimpleName()) {
                case "CircleContext":
                    CanvasGrammarParser.CircleContext circle = (CanvasGrammarParser.CircleContext) figure;
                   // ArrayList<String> strings = new ArrayList<>();
                    instruction+="ctx.beginPath()\n";
                    instruction+="ctx.arc(";
                    for (int i = 0; i < 3; i++) {
                        //String s = rect.expression(i).getText();
                        instruction += Integer.toString(evaluator.eval(circle.expression(i)));//s;//Integer.parseInt(s);
                        instruction+=",";
                    }
                    instruction+=" 0, 2 * Math.PI)\n";
                    instruction+="ctx.stroke()";

                    break;
                case "RectangleContext":
                    CanvasGrammarParser.RectangleContext rect = (CanvasGrammarParser.RectangleContext)figure;
                    ArrayList<String> strings = new ArrayList<>();
                    instruction+="fillRect(";
                    for (int i = 0; i < 4; i++) {
                        //String s = rect.expression(i).getText();
                        instruction += Integer.toString(evaluator.eval(rect.expression(i)));//s;//Integer.parseInt(s);
                        if(i==3)
                            instruction+=")";
                        else instruction+=",";
                    }
                    break;
                case "LineContext":
                    CanvasGrammarParser.LineContext line = (CanvasGrammarParser.LineContext)figure;
                   // ArrayList<String> strings = new ArrayList<>();
                    ArrayList<String> parsedArgs = new ArrayList<>();
                    for (int i = 0; i < 4; i++) {
                        parsedArgs.add(Integer.toString(evaluator.eval(line.expression(i))));
                    }
                    instruction+="ctx.moveTo("+parsedArgs.get(0)+","+parsedArgs.get(1)+")\n";
                    instruction+="ctx.lineTo("+parsedArgs.get(2)+","+parsedArgs.get(3)+")\n";
                    instruction+="ctx.stroke();\n";
            }
            //definiowanie koloru
            CanvasGrammarParser.ColorContext color = d.color();
            System.out.println("ctx.fillsyle = '"+color.getText()+"'");
            System.out.println(instruction);
        }
        CanvasGrammarParser.BlockContext b = ctx.block();
        if(b!=null){
            MemoryPool lesserMem = new MemoryPool(this.memory);
            Executor lesserExecutor = new Executor(lesserMem,this.functionPool,new Evaluator(lesserMem,functionPool));
            lesserExecutor.executeInstructionChain(b.instructionChain());
        }

    }//todo - refractor
}
