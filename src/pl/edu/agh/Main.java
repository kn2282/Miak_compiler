package pl.edu.agh;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import Interpreter.CanvasGrammarParser;
import Interpreter.CanvasGrammarLexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {


        //CanvasGrammarLexer lexer = new CanvasGrammarLexer((CharStream) fr);
        CanvasGrammarLexer lexer = null;
        try {
            lexer = new CanvasGrammarLexer(CharStreams.fromFileName(System.getProperty("user.dir")+"\\input.cnv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        lexer.removeErrorListeners();
        lexer.addErrorListener(CanvasErrorHandler.INSTANCE);
        // CanvasGrammarLexer lexer = new CanvasGrammarLexer(CharStreams.fromString("var=19\nDRAW RECTANGLE(10+10,10*10,var,var-10) RED\n"));
        CanvasGrammarParser parser = new CanvasGrammarParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(CanvasErrorHandler.INSTANCE);
        CanvasMainListener listener = new CanvasMainListener(parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTree tree = parser.program();
        walker.walk(listener,tree);


        //parser.program();
    }
}
