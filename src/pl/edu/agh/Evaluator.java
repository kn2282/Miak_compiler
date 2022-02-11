package pl.edu.agh;

import pl.edu.agh.Interpreter.CanvasGrammarParser;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

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
                ErrorHandler.criticalError("evaluation error: bad shape of expression");
                throw new IllegalStateException();
        }
    }

    ValueContainer eval(CanvasGrammarParser.ExpressionContext ctx)  {
        ValueContainer result = eval(ctx.priorityExpression().get(0));
        for (int i = 1; i < ctx.priorityExpression().size(); i++) {
            try {
                switch (ctx.nonPriorityArithmeticOperator(i - 1).getText()) {
                    case "+":
                        result = result.add(eval(ctx.priorityExpression(i)));
                        break;
                    case "-":
                        result = result.minus(eval(ctx.priorityExpression(i)));
                        break;
                    default:
                        ErrorHandler.criticalError("incorrect operator");
                }
            } catch (ArithmeticException e) {
                ErrorHandler.zeroDivisionError(ctx.priorityExpression(i).start);
            }
        }
        return result;
    }

    ValueContainer eval(CanvasGrammarParser.PriorityExpressionContext ctx) {

        ValueContainer result = halfEval(ctx.halfExpression(0));
        for (int i = 1; i < ctx.halfExpression().size(); i++) {
            try {
                ValueContainer right = halfEval(ctx.halfExpression(i));
                switch (ctx.priorityArithmeticOperator(i - 1).getText()) {
                    case "*":
                        result = result.add(right);
                        break;
                    case "/":
                        if (right.getValue().floatValue() == 0.0)
                            throw new  ArithmeticException("zero division");
                        result = result.divide(right);
                        break;
                    default:
                        ErrorHandler.criticalError("incorrect operator");
                }
            } catch (ArithmeticException e) {
                ErrorHandler.zeroDivisionError(ctx.halfExpression(i).start);
            } catch (ValueException e){
                ErrorHandler.criticalError(e.toString());
            }
        }
        return result;
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
                return minus ? mem.get(toReturn, 1) : mem.get(toReturn, 1).adversity();
            } else if (varRef instanceof CanvasGrammarParser.TopScopeVarContext) {
                toReturn = ((CanvasGrammarParser.TopScopeVarContext) varRef).variableName().getText();
                return minus ? mem.get(toReturn, 2) : mem.get(toReturn, 2).adversity();
            } else {
                toReturn = ((CanvasGrammarParser.SameScopeVarContext) varRef).variableName().getText();
                return minus ? mem.get(toReturn, 0) : mem.get(toReturn, 0).adversity();
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
            float left = eval(expressionContextLeft).getValue().floatValue(), right = eval(expressionContextRight).getValue().floatValue();
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
