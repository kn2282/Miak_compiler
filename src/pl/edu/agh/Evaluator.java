package pl.edu.agh;

import Interpreter.CanvasGrammarParser;

import java.util.LinkedList;
import java.util.List;

public class Evaluator {
    private MemoryPool mem;
    private FunctionPool functionPool;
    private CanvasMainListener listener;
    int depth;

    public Evaluator(MemoryPool mem, FunctionPool functionPool) {
        this.mem = mem;
        this.functionPool = functionPool;
        this.depth = 0;
        this.listener = listener;
    }

    int halfEval(CanvasGrammarParser.HalfExpressionContext ctx) {
        //CanvasGrammarParser. e = ctx.exp();

        switch (ctx.getClass().getSimpleName()) {
            case "ConstantExpressionContext":
                return evalConstant((CanvasGrammarParser.ConstantExpressionContext) ctx);
            case "VariableExpressionContext":
                return evalVariable((CanvasGrammarParser.VariableExpressionContext) ctx);
            case "BracketExpressionContext":
                return evalBracket((CanvasGrammarParser.BracketExpressionContext) ctx);
            default:
                System.out.println("//evaluation error");
                return 0;

        }
    }

    int eval(CanvasGrammarParser.ExpressionContext ctx) {
        if (ctx.expressionSuffix().ArithmeticOperator() == null) {  //czy wyra¿enie jest jednostronne?
            return halfEval(ctx.halfExpression());
            //return halfEval(ctx.halfExpression());
        } else {
            return calc(ctx.halfExpression(), ctx.expressionSuffix());
        }
    }

    int calc(CanvasGrammarParser.HalfExpressionContext expr1, CanvasGrammarParser.ExpressionSuffixContext expr2) {
        int left = halfEval(expr1);
        int right = eval(expr2.expression());
        try {
            switch (expr2.ArithmeticOperator().getText()) {
                case "+":
                    return left + right;
                case "-":
                    return left - right;
                case "*":
                    return left * right;
                case "/":
                    return left / right;
                default:
                    return 0;
            }
        } catch (ArithmeticException e) {
            System.out.println("//Error at "+expr1.start+" - arithmetic/division by 0");
            return 0;
        }

    }

    int evalBracket(CanvasGrammarParser.BracketExpressionContext ctx) {
        return eval(ctx.expression());
    }

    int evalConstant(CanvasGrammarParser.ConstantExpressionContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    int evalVariable(CanvasGrammarParser.VariableExpressionContext ctx) {
        String toReturn = "";
        CanvasGrammarParser.VariableRefContext varRef = ctx.variableRef();
        try {
            if (varRef instanceof CanvasGrammarParser.HigherScopeVarContext) {
                toReturn = ((CanvasGrammarParser.HigherScopeVarContext) varRef).variableName().getText();
                return mem.get(toReturn, 1).getInt();
            } else if (varRef instanceof CanvasGrammarParser.TopScopeVarContext) {
                toReturn = ((CanvasGrammarParser.TopScopeVarContext) varRef).variableName().getText();
                return mem.get(toReturn, 2).getInt();
            } else {
                toReturn = ((CanvasGrammarParser.SameScopeVarContext) varRef).variableName().getText();
                return mem.get(toReturn, 0).getInt();
            }
        } catch (Exception e) {
            System.out.println("//Error at " + ctx.start+" - value not found:" + toReturn);
            System.exit(1);
        }
        return 0;
    }


}
