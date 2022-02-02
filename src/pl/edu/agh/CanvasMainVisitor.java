package pl.edu.agh;

import pl.edu.agh.Interpreter.CanvasGrammarBaseVisitor;
import pl.edu.agh.Interpreter.CanvasGrammarParser;

public class CanvasMainVisitor extends CanvasGrammarBaseVisitor {
    @Override public Object visitDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx) {

        return visitChildren(ctx);
    }
}
