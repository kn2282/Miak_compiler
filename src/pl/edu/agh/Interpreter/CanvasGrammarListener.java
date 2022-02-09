package pl.edu.agh.Interpreter;// Generated from C:/Materia³y/MIAK/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CanvasGrammarParser}.
 */
public interface CanvasGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CanvasGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CanvasGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CanvasGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CanvasGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#debug}.
	 * @param ctx the parse tree
	 */
	void enterDebug(CanvasGrammarParser.DebugContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#debug}.
	 * @param ctx the parse tree
	 */
	void exitDebug(CanvasGrammarParser.DebugContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CanvasGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CanvasGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#instructionChain}.
	 * @param ctx the parse tree
	 */
	void enterInstructionChain(CanvasGrammarParser.InstructionChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#instructionChain}.
	 * @param ctx the parse tree
	 */
	void exitInstructionChain(CanvasGrammarParser.InstructionChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(CanvasGrammarParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(CanvasGrammarParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(CanvasGrammarParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(CanvasGrammarParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TopScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterTopScopeVar(CanvasGrammarParser.TopScopeVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitTopScopeVar(CanvasGrammarParser.TopScopeVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HigherScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterHigherScopeVar(CanvasGrammarParser.HigherScopeVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HigherScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitHigherScopeVar(CanvasGrammarParser.HigherScopeVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SameScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterSameScopeVar(CanvasGrammarParser.SameScopeVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SameScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitSameScopeVar(CanvasGrammarParser.SameScopeVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CanvasGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CanvasGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CanvasGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CanvasGrammarParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#nonPriorityArithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterNonPriorityArithmeticOperator(CanvasGrammarParser.NonPriorityArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#nonPriorityArithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitNonPriorityArithmeticOperator(CanvasGrammarParser.NonPriorityArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#priorityArithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterPriorityArithmeticOperator(CanvasGrammarParser.PriorityArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#priorityArithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitPriorityArithmeticOperator(CanvasGrammarParser.PriorityArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CanvasGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CanvasGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(CanvasGrammarParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(CanvasGrammarParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CanvasGrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CanvasGrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CanvasGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CanvasGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CanvasGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CanvasGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CanvasGrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CanvasGrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorName}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorName(CanvasGrammarParser.ColorNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorName}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorName(CanvasGrammarParser.ColorNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorRGB}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorRGB(CanvasGrammarParser.ColorRGBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorRGB}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorRGB(CanvasGrammarParser.ColorRGBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorHex}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColorHex(CanvasGrammarParser.ColorHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorHex}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColorHex(CanvasGrammarParser.ColorHexContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CanvasGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CanvasGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#priorityExpression}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpression(CanvasGrammarParser.PriorityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#priorityExpression}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpression(CanvasGrammarParser.PriorityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(CanvasGrammarParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(CanvasGrammarParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpression(CanvasGrammarParser.BracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpression(CanvasGrammarParser.BracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CanvasGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CanvasGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#priorityExpressionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterPriorityExpressionSuffix(CanvasGrammarParser.PriorityExpressionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#priorityExpressionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitPriorityExpressionSuffix(CanvasGrammarParser.PriorityExpressionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#expressionSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSuffix(CanvasGrammarParser.ExpressionSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#expressionSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSuffix(CanvasGrammarParser.ExpressionSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(CanvasGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(CanvasGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#boolSrc}.
	 * @param ctx the parse tree
	 */
	void enterBoolSrc(CanvasGrammarParser.BoolSrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#boolSrc}.
	 * @param ctx the parse tree
	 */
	void exitBoolSrc(CanvasGrammarParser.BoolSrcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rectangle}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterRectangle(CanvasGrammarParser.RectangleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rectangle}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitRectangle(CanvasGrammarParser.RectangleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Circle}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterCircle(CanvasGrammarParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Circle}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitCircle(CanvasGrammarParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Line}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterLine(CanvasGrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Line}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitLine(CanvasGrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#drawInstruction}.
	 * @param ctx the parse tree
	 */
	void enterDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#drawInstruction}.
	 * @param ctx the parse tree
	 */
	void exitDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#rotation}.
	 * @param ctx the parse tree
	 */
	void enterRotation(CanvasGrammarParser.RotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#rotation}.
	 * @param ctx the parse tree
	 */
	void exitRotation(CanvasGrammarParser.RotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#variableOperation}.
	 * @param ctx the parse tree
	 */
	void enterVariableOperation(CanvasGrammarParser.VariableOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#variableOperation}.
	 * @param ctx the parse tree
	 */
	void exitVariableOperation(CanvasGrammarParser.VariableOperationContext ctx);
}