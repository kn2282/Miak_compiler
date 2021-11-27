package pl.edu.agh;

import Interpreter.CanvasGrammarBaseListener;
import Interpreter.CanvasGrammarParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CanvasMainListener extends CanvasGrammarBaseListener {
    CanvasGrammarParser parser;
    private Evaluator evaluator;
    private Memory memory;

    public CanvasMainListener(CanvasGrammarParser parser) {
        this.parser = parser;
        this.memory = new Memory();
        this.evaluator = new Evaluator(memory);
    }

    @Override
    public void exitDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx) {
        String color;
        String instruction = "ctx.";
        System.out.println(ctx.figure().getText());
        CanvasGrammarParser.FigureContext f = ctx.figure();
        switch (f.getClass().getSimpleName()) {
            case "CircleContext":

                break;
            case "RectangleContext":
                CanvasGrammarParser.RectangleContext rect = (CanvasGrammarParser.RectangleContext)f;
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
        CanvasGrammarParser.ColorContext c = ctx.color();
        System.out.println("ctx.fillsyle = "+c.getText());
        System.out.println(instruction);
        /*
        switch (c.getClass().getSimpleName()) {
            case "ColorRGBContext":
                //System.out.println(((CanvasGrammarParser.ColorRGBContext) c).expression(1));
                break;
            case "ColorHexContext":
                break;
            case "ColorNameContext":
                System.out.println(((CanvasGrammarParser.ColorNameContext) c).getText());
                switch (((CanvasGrammarParser.ColorNameContext) c).getText()) {
                    case "RED":
                        color = ("#ff0000");
                        break;
                    case "GREEN":
                        color = ("#00ff00");
                        break;
                    case "BLUE":
                        color = ("#0000ff");
                }
        }
        */
        System.out.println(c);
    }

    @Override
    public void enterDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx) {
        System.out.println("enter draw");

    }
    @Override public void exitVariableOperation(CanvasGrammarParser.VariableOperationContext ctx) {
        ValueContainer cont = new ValueContainer(evaluator.eval(ctx.expression()));
        memory.add(ctx.variableRef().getText(),cont);
    }

}
