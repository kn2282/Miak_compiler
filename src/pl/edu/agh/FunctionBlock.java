package pl.edu.agh;

import Interpreter.CanvasGrammarParser;

import java.util.LinkedList;
import java.util.List;

public class FunctionBlock {
    String name;
    int argc;
    LinkedList<String> args;
    CanvasGrammarParser.InstructionChainContext ctx;
    MemoryPool memPool;
    FunctionPool funcPool;
    public FunctionBlock(String name, LinkedList<String> args, CanvasGrammarParser.InstructionChainContext ctx,FunctionPool funcPool) {
        this.name = name;
        this.args = args;
        this.ctx = ctx;
        this.memPool = new MemoryPool();
        this.funcPool = funcPool;
    }
    public int run(List<ValueContainer> arguments){
        for (int i = 0; i < this.args.size(); i++) {
            memPool.add(this.args.get(i),arguments.get(i));  //dodanie argumentów do puli pamiêci
        }

        Evaluator evaluator= new Evaluator(memPool,funcPool);
        Executor executor = new Executor(memPool,funcPool,evaluator);   //todo - nowa instancja executor mo¿e nie byæ potrzebna
        executor.executeInstructionChain(this.ctx);
        return 0;
    }

}
