package pl.edu.agh;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import CanvasGrammar.CanvasGrammarParser;
import CanvasGrammar.CanvasGrammarLexer;


public class Main {
    public static void main(String[] args) {
        CanvasGrammarLexer lexer = new CanvasGrammarLexer(CharStreams.fromString("DRAW RECTANGLE(10,10,10,10) RGB (255,255,10)\n"));
        CanvasGrammarParser parser = new CanvasGrammarParser(new CommonTokenStream(lexer));

        parser.program();
    }
}
