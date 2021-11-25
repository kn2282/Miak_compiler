// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/javaprocessor/canvas-compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package CanvasGrammar;
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
	 * Enter a parse tree produced by {@link CanvasGrammarParser#instruction_chain}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_chain(CanvasGrammarParser.Instruction_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#instruction_chain}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_chain(CanvasGrammarParser.Instruction_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(CanvasGrammarParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(CanvasGrammarParser.WsContext ctx);
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
	 * Enter a parse tree produced by {@link CanvasGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CanvasGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CanvasGrammarParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(CanvasGrammarParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(CanvasGrammarParser.ColorContext ctx);
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
	 * Enter a parse tree produced by {@link CanvasGrammarParser#bool_src}.
	 * @param ctx the parse tree
	 */
	void enterBool_src(CanvasGrammarParser.Bool_srcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#bool_src}.
	 * @param ctx the parse tree
	 */
	void exitBool_src(CanvasGrammarParser.Bool_srcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(CanvasGrammarParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(CanvasGrammarParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#draw_instruction}.
	 * @param ctx the parse tree
	 */
	void enterDraw_instruction(CanvasGrammarParser.Draw_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#draw_instruction}.
	 * @param ctx the parse tree
	 */
	void exitDraw_instruction(CanvasGrammarParser.Draw_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CanvasGrammarParser#arithmetic_instruction}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_instruction(CanvasGrammarParser.Arithmetic_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#arithmetic_instruction}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_instruction(CanvasGrammarParser.Arithmetic_instructionContext ctx);
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
}