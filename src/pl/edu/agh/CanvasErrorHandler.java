package pl.edu.agh;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CanvasErrorHandler extends BaseErrorListener {
    public static final CanvasErrorHandler INSTANCE = new CanvasErrorHandler();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        System.out.println("Syntax Error in line " + line + ":" + charPositionInLine + " " + msg );
        System.exit(1);
    }
}
