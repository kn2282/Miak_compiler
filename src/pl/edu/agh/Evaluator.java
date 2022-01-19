package pl.edu.agh;

import Interpreter.CanvasGrammarParser;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

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

    ValueContainer halfEval(CanvasGrammarParser.HalfExpressionContext ctx) {
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
                return new ValueContainer(0);

        }
    }

    ValueContainer eval(CanvasGrammarParser.ExpressionContext ctx)  {
        if (ctx.expressionSuffix().nonPriorityArithmeticOperator() == null) {  //czy wyra¿enie jest jednostronne?
            return eval(ctx.priorityExpression());
        } else {
            return calc(eval(ctx.priorityExpression()), ctx.expressionSuffix());
        }
    }

    ValueContainer eval(CanvasGrammarParser.PriorityExpressionContext ctx) {

        if (ctx.priorityExpressionSuffix().priorityArithmeticOperator() == null) {  //czy wyra¿enie jest jednostronne?

            return halfEval(ctx.halfExpression());
            //return halfEval(ctx.halfExpression());
        } else {
            return calc(halfEval(ctx.halfExpression()), ctx.priorityExpressionSuffix());
        }
    }

    ValueContainer calc(ValueContainer expr1, CanvasGrammarParser.ExpressionSuffixContext expr2) {
        ValueContainer right = eval(expr2.expression());

        try {
            switch (expr2.nonPriorityArithmeticOperator().getText()) {
                case "+":
                    return expr1.add(right);
                case "-":
                    return expr1.minus(right);
                default:
                    throw new ValueException("incorrect operator");
            }
        } catch (ArithmeticException e) {
            ErrorHandler.arithmeticError(expr2.start);
            return new ValueContainer(0);
        }

    }

    ValueContainer calc(ValueContainer expr1, CanvasGrammarParser.PriorityExpressionSuffixContext expr2) {
        ValueContainer right = eval(expr2.priorityExpression());
        try {
            switch (expr2.priorityArithmeticOperator().getText()) {
                case "*":
                    return expr1.mul(right);
                case "/":
                    return expr1.divide(right);
                default:
                    throw new ValueException("incorrect operator");
            }
        } catch (ArithmeticException e) {
            ErrorHandler.arithmeticError(expr2.start);
            return new ValueContainer(0);
        }

    }

    ValueContainer evalBracket(CanvasGrammarParser.BracketExpressionContext ctx) {
        return eval(ctx.expression());
    }

    ValueContainer evalConstant(CanvasGrammarParser.ConstantExpressionContext ctx) {
        if (ctx.constant().Integer() != null)
            return new ValueContainer(Integer.parseInt(ctx.getText()));
        else
            return new ValueContainer(Float.parseFloat(ctx.getText()));
    }

    ValueContainer evalVariable(CanvasGrammarParser.VariableExpressionContext ctx) {
        String toReturn = "";
        CanvasGrammarParser.VariableRefContext varRef = ctx.variable().variableRef();
        boolean minus = ctx.variable().Minus() == null;
        try {
            if (varRef instanceof CanvasGrammarParser.HigherScopeVarContext) {
                toReturn = ((CanvasGrammarParser.HigherScopeVarContext) varRef).variableName().getText();
                return minus ? mem.get(toReturn, 1).adversity() : mem.get(toReturn, 1);
            } else if (varRef instanceof CanvasGrammarParser.TopScopeVarContext) {
                toReturn = ((CanvasGrammarParser.TopScopeVarContext) varRef).variableName().getText();
                return minus ? mem.get(toReturn, 2).adversity() : mem.get(toReturn, 2);
            } else {
                toReturn = ((CanvasGrammarParser.SameScopeVarContext) varRef).variableName().getText();
                return minus ? mem.get(toReturn, 0).adversity() : mem.get(toReturn, 0);
            }
        } catch (Exception e) {
            ErrorHandler.variableNotFound(ctx.start, varRef.getText());
            System.exit(1);
        }
        throw new ValueException("incorrect variable");
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
            float left = (float) eval(expressionContextLeft).getValue(), right = (float) eval(expressionContextRight).getValue();
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
