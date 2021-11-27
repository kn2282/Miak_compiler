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
	 * Visit a parse tree produced by {@link CanvasGrammarParser#instructionChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionChain(CanvasGrammarParser.InstructionChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CanvasGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(CanvasGrammarParser.WsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CanvasGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CanvasGrammarParser.FunctionContext ctx);
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
	 * Visit a parse tree produced by {@link CanvasGrammarParser#arithmeticInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticInstruction(CanvasGrammarParser.ArithmeticInstructionContext ctx);
}