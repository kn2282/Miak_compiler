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

        if (ctx.expressionSuffix().nonPriorityArithmeticOperator() == null) {  //czy wyra¿enie jest jednostronne?

            return eval(ctx.priorityExpression());
            //return halfEval(ctx.halfExpression());
        } else {
            return calc(eval(ctx.priorityExpression()), ctx.expressionSuffix());
        }
    }

    int eval(CanvasGrammarParser.PriorityExpressionContext ctx) {

        if (ctx.priorityExpressionSuffix().priorityArithmeticOperator() == null) {  //czy wyra¿enie jest jednostronne?

            return halfEval(ctx.halfExpression());
            //return halfEval(ctx.halfExpression());
        } else {
            return calc(halfEval(ctx.halfExpression()), ctx.priorityExpressionSuffix());
        }
    }

    int calc(int expr1, CanvasGrammarParser.ExpressionSuffixContext expr2) {
        int right = eval(expr2.expression());
        try {
            switch (expr2.nonPriorityArithmeticOperator().getText()) {
                case "+":
                    return expr1 + right;
                case "-":
                    return expr1 - right;
                default:
                    return 0;
            }
        } catch (ArithmeticException e) {
            ErrorHandler.arithmeticError(expr2.start);
            return 0;
        }

    }

    int calc(int expr1, CanvasGrammarParser.PriorityExpressionSuffixContext expr2) {
        int right = eval(expr2.priorityExpression());
        try {
            switch (expr2.priorityArithmeticOperator().getText()) {
                case "*":
                    return expr1 * right;
                case "/":
                    return expr1 / right;
                default:
                    return 0;
            }
        } catch (ArithmeticException e) {
            ErrorHandler.arithmeticError(expr2.start);
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
        CanvasGrammarParser.VariableRefContext varRef = ctx.variable().variableRef();
        int minus = ctx.variable().Minus() == null ? 1 : -1;
        try {
            if (varRef instanceof CanvasGrammarParser.HigherScopeVarContext) {
                toReturn = ((CanvasGrammarParser.HigherScopeVarContext) varRef).variableName().getText();
                return mem.get(toReturn, 1).getInt() * minus;
            } else if (varRef instanceof CanvasGrammarParser.TopScopeVarContext) {
                toReturn = ((CanvasGrammarParser.TopScopeVarContext) varRef).variableName().getText();
                return mem.get(toReturn, 2).getInt() * minus;
            } else {
                toReturn = ((CanvasGrammarParser.SameScopeVarContext) varRef).variableName().getText();
                return mem.get(toReturn, 0).getInt() * minus;
            }
        } catch (Exception e) {
            ErrorHandler.variableNotFound(ctx.start, varRef.getText());
            System.exit(1);
        }
        return 0;
    }

    boolean evalBool(CanvasGrammarParser.BoolContext boolContext){
        if(boolContext.bool() == null){
            return evalBoolSRC(boolContext.boolSrc());
        }
        if (boolContext.AND() != null){
            return evalBoolSRC(boolContext.boolSrc()) & evalBool(boolContext.bool());
        }
        if (boolContext.OR() != null){
            return evalBoolSRC(boolContext.boolSrc()) | evalBool(boolContext.bool());
        }
        return false;
    }

    boolean evalBoolSRC(CanvasGrammarParser.BoolSrcContext boolSrcContext){
        if (boolSrcContext.TRUE() != null) return true;
        if (boolSrcContext.FALSE() != null) return false;
        if (boolSrcContext.expression()!=null){
            CanvasGrammarParser.ExpressionContext expressionContextLeft = boolSrcContext.expression().get(0), expressionContextRight = boolSrcContext.expression().get(1);
            int left = eval(expressionContextLeft), right = eval(expressionContextRight);
            switch (boolSrcContext.ComprehensionOperator().getText()){
                case "==":
                    return left == right;
                case "<":
                    return  left<right;
                case "<=":
                    return left<=right;
                case ">":
                    return left>right;
                case ">=":
                    return left>=right;
            }
        }
        return false;
    }


}
