package pl.edu.agh;

import org.antlr.v4.runtime.Token;

public class ErrorHandler {
    private static void error(String string){
        Main.OutputWriter.add("console.error(\""+string+"\")");
        System.err.println("Error: "+string);
    }
    public static void  criticalError(String string){
        error(string);
        System.err.println("Stopping execution...");
        System.exit(1);

    }
    public static void zeroDivisionError(Token where) {
        criticalError("Error at " + where.getLine() + ":" + where.getCharPositionInLine() + " - arithmetic/division by 0");
    }


    public static void variableNotFound(Token where, String variableName) {
        error("Error at " + where.getLine() + ":" + where.getCharPositionInLine() + " - value not found: " + variableName);

    }

    public static void functionNotDefined(Token where, String text) {
        error("Error at " + where.getLine() + " - function " + text + " is not defined");

    }

    public static void stackOverflow(Token where) {
        criticalError("Error at " + where.getLine() + ":" + where.getCharPositionInLine() + " - stack overflow");

    }

    public static void argumentMismatch(Token where, String text) {
        criticalError("Error:Arguments mismatch in " + where.getLine() + ":" + where.getCharPositionInLine() + " in function "+text);
    }
}
