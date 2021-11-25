// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/javaprocessor/canvas-compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package CanvasGrammar;
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
	 * Visit a parse tree produced by {@link CanvasGrammarParser#instruction_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_chain(CanvasGrammarParser.Instruction_chainContext ctx);
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
	 * Visit a parse tree produced by {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(CanvasGrammarParser.ColorContext ctx);
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
	 * Visit a parse tree produced by {@link CanvasGrammarParser#bool_src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_src(CanvasGrammarParser.Bool_srcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(CanvasGrammarParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#draw_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDraw_instruction(CanvasGrammarParser.Draw_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#arithmetic_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_instruction(CanvasGrammarParser.Arithmetic_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CanvasGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CanvasGrammarParser.VariableContext ctx);
}