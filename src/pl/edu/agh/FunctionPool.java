package pl.edu.agh;

import Interpreter.CanvasGrammarParser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FunctionPool {
    HashMap<String,FunctionBlock> pool;
    public FunctionPool(){
        this.pool=new HashMap<>();
    }
    public void define(String name, List<CanvasGrammarParser.VariableRefContext> args, CanvasGrammarParser.InstructionChainContext ctx){
        LinkedList<String> argNames = new LinkedList<>();
        for (CanvasGrammarParser.VariableRefContext arg:args
             ) {
            argNames.add(arg.VariableName().getText());
        }
        FunctionBlock functionBlock = new FunctionBlock(name,argNames,ctx,this);
        pool.put(name,functionBlock);
    }
    public int call(String name, List<ValueContainer> args){
        return pool.get(name).run(args);
    }
}
