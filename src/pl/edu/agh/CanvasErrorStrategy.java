package pl.edu.agh;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class CanvasErrorStrategy extends BaseErrorListener {
    public static final CanvasErrorStrategy INSTANCE = new CanvasErrorStrategy();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
             {
                 System.out.println("console.error('"+ ("line " + line + ":" + charPositionInLine + " " + msg)+"')");
    }
}
