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
            executeInstruction(instCtx);
        }

    }
    void executeInstruction(CanvasGrammarParser.InstructionContext ctx){
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
            memory.add(v.variableRef().getText(),cont);
        }
        CanvasGrammarParser.DrawInstructionContext d = ctx.drawInstruction();
        if (d != null) {
            String instruction = "ctx.";
            CanvasGrammarParser.FigureContext figure = d.figure();
            switch (figure.getClass().getSimpleName()) {
                case "CircleContext":

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

            }
            //definiowanie koloru
            CanvasGrammarParser.ColorContext color = d.color();
            System.out.println("ctx.fillsyle = "+color.getText());
            System.out.println(instruction);
        }

    }
}
