package pl.edu.agh;

import Interpreter.CanvasGrammarBaseListener;
import Interpreter.CanvasGrammarParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CanvasMainListener extends CanvasGrammarBaseListener {
    CanvasGrammarParser parser;

    public CanvasMainListener(CanvasGrammarParser parser) {
        this.parser = parser;
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
                    String s = rect.expression(i).getText();
                    instruction += s;//Integer.parseInt(s);
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
}
