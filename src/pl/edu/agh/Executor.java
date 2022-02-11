package pl.edu.agh;

import pl.edu.agh.Interpreter.CanvasGrammarParser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Executor {

    private FunctionPool functionPool;
    private MemoryPool memory;
    private Evaluator evaluator;

    public Executor(MemoryPool memory, FunctionPool functionPool, Evaluator evaluator) {
        this.functionPool = functionPool;
        this.memory = memory;
        this.evaluator = evaluator;
    }

    void executeInstructionChain(CanvasGrammarParser.InstructionChainContext ctx) {
        for (CanvasGrammarParser.InstructionContext instCtx : ctx.instr
        ) {
            try {
                executeInstruction(instCtx);

            } catch (StackOverflowError e) {
                ErrorHandler.stackOverflow(ctx.start);
                return;
            }
        }

    }

    void executeInstruction(CanvasGrammarParser.InstructionContext ctx) throws StackOverflowError {

        CanvasGrammarParser.FunctionDefinitionContext f = ctx.functionDefinition();
        if (f != null) {
            functionPool.define(f.functionName().getText(), f.arguments().arg, f.instructionChain(), memory);
        }
        CanvasGrammarParser.FunctionCallContext c = ctx.functionCall();
        if (c != null) {
            LinkedList<ValueContainer> args = new LinkedList<>();
            for (CanvasGrammarParser.ExpressionContext expr : c.functionCallArguments().arg
            ) {
                args.add(evaluator.eval(expr));
            }
            try {
                functionPool.call(c.functionName().getText(), args);
            } catch (NoSuchElementException e) {
                ErrorHandler.functionNotDefined(ctx.start, c.functionName().getText());
                System.exit(1);
            } catch (Exception e) {
                ErrorHandler.argumentMismatch(ctx.start, c.functionName().getText());
            }
        }
        CanvasGrammarParser.VariableOperationContext v = ctx.variableOperation();
        if (v != null) {
            ValueContainer cont = evaluator.eval(v.expression());
            CanvasGrammarParser.VariableRefContext varRef = v.variableRef();
            if (varRef instanceof CanvasGrammarParser.SameScopeVarContext)
                memory.set(((CanvasGrammarParser.SameScopeVarContext) varRef).variableName().getText(), cont, 0);
            else if (varRef instanceof CanvasGrammarParser.HigherScopeVarContext)
                memory.set(((CanvasGrammarParser.HigherScopeVarContext) varRef).variableName().getText(), cont, 1);
            else if (varRef instanceof CanvasGrammarParser.TopScopeVarContext)
                memory.set(((CanvasGrammarParser.TopScopeVarContext) varRef).variableName().getText(), cont, 2);

        }
        CanvasGrammarParser.DrawInstructionContext d = ctx.drawInstruction();
        if (d != null) {
            String instruction = "";
            String fillMode;
            ValueContainer[] middle = new ValueContainer[3];
            if (d.FILL() == null)
                fillMode = "stroke";
            else
                fillMode = "fill";
            CanvasGrammarParser.FigureContext figure = d.figure();
            switch (figure.getClass().getSimpleName()) {
                case "CircleContext":
                    CanvasGrammarParser.CircleContext circle = (CanvasGrammarParser.CircleContext) figure;
                    // ArrayList<String> strings = new ArrayList<>();
                    instruction += "ctx.beginPath()\n";
                    instruction += "ctx.arc(";
                    ValueContainer[] cargs = new ValueContainer[3];
                    for (int i = 0; i < 3; i++) {
                        //String s = rect.expression(i).getText();
                        cargs[i] = evaluator.eval(circle.expression(i));
                    }
                    middle = new ValueContainer[]{cargs[0], cargs[1]};
                    for (int i = 0; i < 3; i++) {
                        instruction += cargs[i].toString();//s;//Integer.parseInt(s);
                        instruction += ",";
                    }
                    instruction += " 0, 2 * Math.PI)\n";
                    instruction += "ctx." + fillMode + "()";


                    break;
                case "RectangleContext":
                    CanvasGrammarParser.RectangleContext rect = (CanvasGrammarParser.RectangleContext) figure;
                    ArrayList<String> strings = new ArrayList<>();
                    instruction += "ctx."+fillMode + "Rect(";
                    ValueContainer[] rargs = new ValueContainer[4];

                    for (int i = 0; i < 4; i++) {
                        //String s = rect.expression(i).getText();
                        rargs[i] = evaluator.eval(rect.expression(i));
                    }
                    middle = new ValueContainer[]{(rargs[0].add(rargs[2].divide(2))),(rargs[1].add(rargs[3].divide(2)))};
                    for (int i = 0; i < 4; i++) {
                        instruction += rargs[i].toString();//s;//Integer.parseInt(s);
                        if (i == 3)
                            instruction += ")";
                        else instruction += ",";
                    }
                    break;
                case "LineContext":
                    CanvasGrammarParser.LineContext line = (CanvasGrammarParser.LineContext) figure;
                    // ArrayList<String> strings = new ArrayList<>();
                    ArrayList<String> parsedArgs = new ArrayList<>();
                    ValueContainer[] largs=new ValueContainer[4];
                    for (int i = 0; i < 4; i++) {
                        largs[i] = evaluator.eval(line.expression(i));
                        parsedArgs.add(largs[i].toString());
                    }
                    middle = new ValueContainer[]{(largs[0].add(largs[2])).divide(2), (largs[1].add(largs[3])).divide(2)};
                    instruction += "ctx.beginPath()\n";
                    instruction += "ctx.moveTo(" + parsedArgs.get(0) + "," + parsedArgs.get(1) + ")\n";
                    instruction += "ctx.lineTo(" + parsedArgs.get(2) + "," + parsedArgs.get(3) + ")\n";
                    instruction += "ctx." + fillMode + "();\n";
            }
            //definiowanie koloru
            String finalColor;
            CanvasGrammarParser.ColorContext color = d.color();
            if(d.color().getClass().getSimpleName().equals("ColorRGBContext")){
                CanvasGrammarParser.ColorRGBContext rgb = (CanvasGrammarParser.ColorRGBContext) color;
                finalColor="rgb(";
                for (int i = 0; i < 3; i++) {
                    finalColor+=evaluator.eval(rgb.expression(i)).getValue().intValue();
                    if(i==2)
                        finalColor+=")";
                    else finalColor+=",";
                }

            }else{
                finalColor = color.getText();
            }
            
            if (d.rotation() == null) {
                Main.OutputWriter.add("ctx." + fillMode + "Style = '" + finalColor + "'");
                Main.OutputWriter.add(instruction);
            } else {
                Main.OutputWriter.add("ctx.save()");
                Main.OutputWriter.add("ctx.translate(" + middle[0].toString() + "," + middle[1] + ");");
                Main.OutputWriter.add("ctx.rotate(" + evaluator.eval(d.rotation().expression()) + "*Math.PI/180);");
                Main.OutputWriter.add("ctx.translate(-" + middle[0] + ",-" + middle[1] + ");");
                Main.OutputWriter.add("ctx." + fillMode + "Style = '" + color.getText() + "'");
                Main.OutputWriter.add(instruction);
                Main.OutputWriter.add("ctx.restore()");
            }
            

        }
        CanvasGrammarParser.BlockContext b = ctx.block();
        if (b != null) {
            MemoryPool lesserMem = new MemoryPool(this.memory);
            Executor lesserExecutor = new Executor(lesserMem, this.functionPool.copy(), new Evaluator(lesserMem, functionPool.copy()));
            lesserExecutor.executeInstructionChain(b.instructionChain());
        }

        CanvasGrammarParser.ConditionContext conditionContext = ctx.condition();
        if (conditionContext != null) {
            if (evaluator.evalBool(conditionContext.bool())) {
//                MemoryPool lesserMem = new MemoryPool(this.memory);
//                Executor lesserExecutor = new Executor(this.memory, this.functionPool, new Evaluator(this.memory, functionPool));
                executeInstructionChain(conditionContext.instructionChain().get(0));
            } else {
                if (conditionContext.ELSE() != null) {
//                    MemoryPool lesserMem = new MemoryPool(this.memory);
//                    Executor lesserExecutor = new Executor(this.memory, this.functionPool, new Evaluator(this.memory, functionPool));
                    executeInstructionChain(conditionContext.instructionChain().get(1));
                }
            }
        }

        CanvasGrammarParser.LoopContext loopContext = ctx.loop();
        if (loopContext != null) {
            while (evaluator.evalBool(loopContext.bool())) {
//                MemoryPool lesserMem = new MemoryPool(this.memory);
//                Executor lesserExecutor = new Executor(this.memory, this.functionPool, new Evaluator(this.memory, functionPool));
                executeInstructionChain(loopContext.instructionChain());
            }
        }
        CanvasGrammarParser.DebugContext debugContext = ctx.debug();
        if (debugContext != null) {

            MemoryPool mem = memory;
            while (true) {
                mem.dump();
                mem = mem.widerScopePool;
                if (mem == null) {
                    break;
                }
                System.out.println("<<< End of scope >>>");
                Main.OutputWriter.add("console.log('<<< End of scope >>>')");
            }
        }

    }//todo - refractor
}
