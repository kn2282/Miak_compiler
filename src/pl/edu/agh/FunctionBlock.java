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
        //this.memPool = new MemoryPool(null);
        this.funcPool = funcPool;
    }
    public int run(List<ValueContainer> arguments){
        MemoryPool memPool = new MemoryPool(null);
        try {
            for (int i = 0; i < this.args.size(); i++) {
                memPool.set(this.args.get(i),arguments.get(i),0);  //dodanie argumentów do puli pamiêci
            }
        }catch (Exception e){
            System.out.println("//Error:Not enough aruments in function "+this.name);
            System.exit(1);
        }

        Evaluator evaluator= new Evaluator(memPool,funcPool);
        Executor executor = new Executor(memPool,funcPool,evaluator);   //todo - nowa instancja executor mo¿e nie byæ potrzebna
        executor.executeInstructionChain(this.ctx);

        return 0;
    }

}
