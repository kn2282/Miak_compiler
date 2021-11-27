// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package Interpreter;
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
	 * Enter a parse tree produced by {@link CanvasGrammarParser#arithmeticInstruction}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticInstruction(CanvasGrammarParser.ArithmeticInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CanvasGrammarParser#arithmeticInstruction}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticInstruction(CanvasGrammarParser.ArithmeticInstructionContext ctx);
}