// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CanvasGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CanvasGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CanvasGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(CanvasGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebug(CanvasGrammarParser.DebugContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CanvasGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#instructionChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionChain(CanvasGrammarParser.InstructionChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(CanvasGrammarParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(CanvasGrammarParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TopScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopScopeVar(CanvasGrammarParser.TopScopeVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HigherScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigherScopeVar(CanvasGrammarParser.HigherScopeVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SameScopeVar}
	 * labeled alternative in {@link CanvasGrammarParser#variableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameScopeVar(CanvasGrammarParser.SameScopeVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CanvasGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CanvasGrammarParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#nonPriorityArithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonPriorityArithmeticOperator(CanvasGrammarParser.NonPriorityArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#priorityArithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityArithmeticOperator(CanvasGrammarParser.PriorityArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CanvasGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#functionCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArguments(CanvasGrammarParser.FunctionCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CanvasGrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CanvasGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CanvasGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(CanvasGrammarParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorName}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorName(CanvasGrammarParser.ColorNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorRGB}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorRGB(CanvasGrammarParser.ColorRGBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorHex}
	 * labeled alternative in {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorHex(CanvasGrammarParser.ColorHexContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CanvasGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#priorityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityExpression(CanvasGrammarParser.PriorityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(CanvasGrammarParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(CanvasGrammarParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantExpression}
	 * labeled alternative in {@link CanvasGrammarParser#halfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CanvasGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#priorityExpressionSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorityExpressionSuffix(CanvasGrammarParser.PriorityExpressionSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#expressionSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSuffix(CanvasGrammarParser.ExpressionSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CanvasGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#boolSrc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolSrc(CanvasGrammarParser.BoolSrcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Rectangle}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangle(CanvasGrammarParser.RectangleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Circle}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(CanvasGrammarParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Line}
	 * labeled alternative in {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CanvasGrammarParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#drawInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawInstruction(CanvasGrammarParser.DrawInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#rotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotation(CanvasGrammarParser.RotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#variableOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOperation(CanvasGrammarParser.VariableOperationContext ctx);
}