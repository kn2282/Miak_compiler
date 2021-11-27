package pl.edu.agh;

import Interpreter.CanvasGrammarBaseVisitor;
import Interpreter.CanvasGrammarParser;

public class CanvasMainVisitor extends CanvasGrammarBaseVisitor {
    @Override public Object visitDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx) {

        return visitChildren(ctx);
    }
}
