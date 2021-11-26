package pl.edu.agh;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import Interpreter.CanvasGrammarParser;
import Interpreter.CanvasGrammarLexer;


public class Main {
    public static void main(String[] args) {
        CanvasGrammarLexer lexer = new CanvasGrammarLexer(CharStreams.fromString("DRAW RECTANGLE(10,10,10,1) #FF00CE\n"));
        CanvasGrammarParser parser = new CanvasGrammarParser(new CommonTokenStream(lexer));

        parser.program();
    }
}
