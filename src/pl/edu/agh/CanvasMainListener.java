package pl.edu.agh;

import pl.edu.agh.Interpreter.CanvasGrammarBaseListener;
import pl.edu.agh.Interpreter.CanvasGrammarParser;

public class CanvasMainListener extends CanvasGrammarBaseListener {
    CanvasGrammarParser parser;
    private Evaluator evaluator;
    private MemoryPool memory;
    private FunctionPool functions;
    private int depth;
    private String currentFunctionName;
    private Executor executor;
    public CanvasMainListener(CanvasGrammarParser parser) {
        this.parser = parser;
        this.memory = new MemoryPool(null);
        this.functions = new FunctionPool();
        this.depth = 0;
        this.evaluator = new Evaluator(memory,functions);
        this.executor = new Executor(memory,functions,evaluator);
    }
    @Override public void enterFunctionDefinition(CanvasGrammarParser.FunctionDefinitionContext ctx){
        this.currentFunctionName = ctx.functionName().getText();    //znacznik - nie wykonywaæ instrukcji wewn¹trz funkcji
    }
    @Override public void exitFunctionDefinition(CanvasGrammarParser.FunctionDefinitionContext ctx) {
        for (CanvasGrammarParser.VariableRefContext argCtx:ctx.arguments().arg
             ) {

        }
        //ctx.arguments().arg;
       // functions.define(ctx.functionName().getText(),ctx.arguments().arg,ctx.instructionChain());
        //this.currentFunctionName = null;
        this.currentFunctionName = null;
    }

    @Override
    public void exitDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx) {


    }

    @Override
    public void enterDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx) {

    }
    @Override public void exitVariableOperation(CanvasGrammarParser.VariableOperationContext ctx) {

    }
    @Override public void exitInstruction(CanvasGrammarParser.InstructionContext ctx) {

    }

    @Override
    public void exitProgram(CanvasGrammarParser.ProgramContext ctx){
        //if(currentFunctionName==null)
        executor.executeInstructionChain(ctx.instructionChain());
    }
}
