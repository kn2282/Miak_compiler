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
    MemoryPool widerScopePool;
    FunctionPool funcPool;
    public FunctionBlock(String name, LinkedList<String> args, CanvasGrammarParser.InstructionChainContext ctx,FunctionPool funcPool,MemoryPool widerScopePool) {
        this.name = name;
        this.args = args;
        this.ctx = ctx;
        this.widerScopePool = widerScopePool;
        this.funcPool = funcPool;
    }
    public int run(List<ValueContainer> arguments) throws Exception{
        MemoryPool memPool = new MemoryPool(this.widerScopePool);

            for (int i = 0; i < this.args.size(); i++) {
                memPool.set(this.args.get(i),arguments.get(i),0);  //dodanie argumentów do puli pamiêci
            }


        Evaluator evaluator= new Evaluator(memPool,funcPool);
        Executor executor = new Executor(memPool,funcPool,evaluator);   //todo - nowa instancja executor mo¿e nie byæ potrzebna
        executor.executeInstructionChain(this.ctx);

        return 0;
    }

}
