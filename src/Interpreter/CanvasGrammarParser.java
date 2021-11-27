// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package Interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CanvasGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, HexColor=5, VariableName=6, Constant=7, 
		SPACE=8, NEW_LINE=9, AND=10, OR=11, TRUE=12, FALSE=13, RECTANGLE=14, CIRCLE=15, 
		LINE=16, BEGIN=17, END=18, IF=19, ELSE=20, THEN=21, WHILE=22, DEF=23, 
		RGB=24, DRAW=25, AssignOperator=26, ArithmeticOperator=27, ComprehensionOperator=28, 
		ColorName=29, VariableRef=30, Name=31;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_instructionChain = 2, RULE_variableRef = 3, 
		RULE_variable = 4, RULE_ws = 5, RULE_condition = 6, RULE_function = 7, 
		RULE_loop = 8, RULE_color = 9, RULE_expression = 10, RULE_halfExpression = 11, 
		RULE_expressionSuffix = 12, RULE_bool = 13, RULE_boolSrc = 14, RULE_figure = 15, 
		RULE_drawInstruction = 16, RULE_variableOperation = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "instructionChain", "variableRef", "variable", 
			"ws", "condition", "function", "loop", "color", "expression", "halfExpression", 
			"expressionSuffix", "bool", "boolSrc", "figure", "drawInstruction", "variableOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "','", "')'", null, null, null, null, "'\n'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "VariableName", "Constant", 
			"SPACE", "NEW_LINE", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", 
			"LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", 
			"DRAW", "AssignOperator", "ArithmeticOperator", "ComprehensionOperator", 
			"ColorName", "VariableRef", "Name"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CanvasGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CanvasGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public InstructionChainContext instructionChain() {
			return getRuleContext(InstructionChainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CanvasGrammarParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			instructionChain();
			setState(37);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DrawInstructionContext drawInstruction() {
			return getRuleContext(DrawInstructionContext.class,0);
		}
		public VariableOperationContext variableOperation() {
			return getRuleContext(VariableOperationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				loop();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				function();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				condition();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				drawInstruction();
				}
				break;
			case VariableName:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				variableOperation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionChainContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(CanvasGrammarParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(CanvasGrammarParser.NEW_LINE, i);
		}
		public InstructionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterInstructionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitInstructionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitInstructionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionChainContext instructionChain() throws RecognitionException {
		InstructionChainContext _localctx = new InstructionChainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instructionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				instruction();
				setState(47);
				match(NEW_LINE);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VariableName) | (1L << IF) | (1L << WHILE) | (1L << DEF) | (1L << DRAW))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableRefContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(CanvasGrammarParser.VariableName, 0); }
		public VariableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterVariableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitVariableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(VariableName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode VariableRef() { return getToken(CanvasGrammarParser.VariableRef, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(55);
			match(VariableRef);
			}
			setState(56);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(CanvasGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CanvasGrammarParser.SPACE, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ws);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(58);
				match(SPACE);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CanvasGrammarParser.IF, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(CanvasGrammarParser.NEW_LINE, 0); }
		public List<InstructionChainContext> instructionChain() {
			return getRuleContexts(InstructionChainContext.class);
		}
		public InstructionChainContext instructionChain(int i) {
			return getRuleContext(InstructionChainContext.class,i);
		}
		public TerminalNode END() { return getToken(CanvasGrammarParser.END, 0); }
		public TerminalNode ELSE() { return getToken(CanvasGrammarParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			bool();
			setState(66);
			match(T__0);
			setState(67);
			match(NEW_LINE);
			setState(68);
			instructionChain();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(69);
				match(ELSE);
				setState(70);
				instructionChain();
				}
			}

			setState(73);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> DEF() { return getTokens(CanvasGrammarParser.DEF); }
		public TerminalNode DEF(int i) {
			return getToken(CanvasGrammarParser.DEF, i);
		}
		public TerminalNode Name() { return getToken(CanvasGrammarParser.Name, 0); }
		public InstructionChainContext instructionChain() {
			return getRuleContext(InstructionChainContext.class,0);
		}
		public TerminalNode END() { return getToken(CanvasGrammarParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DEF);
			setState(76);
			match(Name);
			setState(77);
			instructionChain();
			setState(78);
			match(END);
			setState(79);
			match(DEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CanvasGrammarParser.WHILE, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(CanvasGrammarParser.NEW_LINE, 0); }
		public InstructionChainContext instructionChain() {
			return getRuleContext(InstructionChainContext.class,0);
		}
		public TerminalNode END() { return getToken(CanvasGrammarParser.END, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WHILE);
			setState(82);
			bool();
			setState(83);
			match(NEW_LINE);
			setState(84);
			instructionChain();
			setState(85);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	 
		public ColorContext() { }
		public void copyFrom(ColorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ColorRGBContext extends ColorContext {
		public TerminalNode RGB() { return getToken(CanvasGrammarParser.RGB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ColorRGBContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterColorRGB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitColorRGB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColorRGB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColorHexContext extends ColorContext {
		public TerminalNode HexColor() { return getToken(CanvasGrammarParser.HexColor, 0); }
		public ColorHexContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterColorHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitColorHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColorHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColorNameContext extends ColorContext {
		public TerminalNode ColorName() { return getToken(CanvasGrammarParser.ColorName, 0); }
		public ColorNameContext(ColorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterColorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitColorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_color);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ColorName:
				_localctx = new ColorNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(ColorName);
				}
				break;
			case RGB:
				_localctx = new ColorRGBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(RGB);
				setState(89);
				match(T__1);
				setState(90);
				expression();
				setState(91);
				match(T__2);
				setState(92);
				expression();
				setState(93);
				match(T__2);
				setState(94);
				expression();
				setState(95);
				match(T__3);
				}
				break;
			case HexColor:
				_localctx = new ColorHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(HexColor);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public HalfExpressionContext halfExpression() {
			return getRuleContext(HalfExpressionContext.class,0);
		}
		public ExpressionSuffixContext expressionSuffix() {
			return getRuleContext(ExpressionSuffixContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
			case SPACE:
			case NEW_LINE:
			case AND:
			case OR:
			case ComprehensionOperator:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case VariableName:
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(101);
				halfExpression();
				setState(102);
				expressionSuffix();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HalfExpressionContext extends ParserRuleContext {
		public HalfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_halfExpression; }
	 
		public HalfExpressionContext() { }
		public void copyFrom(HalfExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketExpressionContext extends HalfExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExpressionContext(HalfExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExpressionContext extends HalfExpressionContext {
		public TerminalNode Constant() { return getToken(CanvasGrammarParser.Constant, 0); }
		public ConstantExpressionContext(HalfExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends HalfExpressionContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public VariableExpressionContext(HalfExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HalfExpressionContext halfExpression() throws RecognitionException {
		HalfExpressionContext _localctx = new HalfExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_halfExpression);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				variableRef();
				}
				break;
			case T__1:
				_localctx = new BracketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__1);
				setState(108);
				expression();
				setState(109);
				match(T__3);
				}
				break;
			case Constant:
				_localctx = new ConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(Constant);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSuffixContext extends ParserRuleContext {
		public TerminalNode ArithmeticOperator() { return getToken(CanvasGrammarParser.ArithmeticOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterExpressionSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitExpressionSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitExpressionSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSuffixContext expressionSuffix() throws RecognitionException {
		ExpressionSuffixContext _localctx = new ExpressionSuffixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressionSuffix);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ArithmeticOperator:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(ArithmeticOperator);
				setState(115);
				expression();
				}
				break;
			case T__0:
			case T__2:
			case T__3:
			case SPACE:
			case NEW_LINE:
			case AND:
			case OR:
			case ComprehensionOperator:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolSrcContext boolSrc() {
			return getRuleContext(BoolSrcContext.class,0);
		}
		public TerminalNode AND() { return getToken(CanvasGrammarParser.AND, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode OR() { return getToken(CanvasGrammarParser.OR, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				boolSrc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(120);
				boolSrc();
				setState(121);
				match(AND);
				setState(122);
				bool();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(124);
				boolSrc();
				setState(125);
				match(OR);
				setState(126);
				bool();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolSrcContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CanvasGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CanvasGrammarParser.FALSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ComprehensionOperator() { return getToken(CanvasGrammarParser.ComprehensionOperator, 0); }
		public BoolSrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolSrc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterBoolSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitBoolSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBoolSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSrcContext boolSrc() throws RecognitionException {
		BoolSrcContext _localctx = new BoolSrcContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolSrc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case VariableName:
			case Constant:
			case ComprehensionOperator:
				{
				{
				setState(130);
				expression();
				setState(131);
				match(ComprehensionOperator);
				setState(132);
				expression();
				}
				}
				break;
			case TRUE:
				{
				setState(134);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(135);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FigureContext extends ParserRuleContext {
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
	 
		public FigureContext() { }
		public void copyFrom(FigureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineContext extends FigureContext {
		public TerminalNode LINE() { return getToken(CanvasGrammarParser.LINE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LineContext(FigureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CircleContext extends FigureContext {
		public TerminalNode CIRCLE() { return getToken(CanvasGrammarParser.CIRCLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CircleContext(FigureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitCircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitCircle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RectangleContext extends FigureContext {
		public TerminalNode RECTANGLE() { return getToken(CanvasGrammarParser.RECTANGLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RectangleContext(FigureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterRectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitRectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_figure);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECTANGLE:
				_localctx = new RectangleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(140);
				match(RECTANGLE);
				setState(141);
				match(T__1);
				setState(142);
				expression();
				setState(143);
				match(T__2);
				setState(144);
				expression();
				setState(145);
				match(T__2);
				setState(146);
				expression();
				setState(147);
				match(T__2);
				setState(148);
				expression();
				setState(149);
				match(T__3);
				}
				}
				break;
			case CIRCLE:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(151);
				match(CIRCLE);
				setState(152);
				match(T__1);
				setState(153);
				expression();
				setState(154);
				match(T__2);
				setState(155);
				expression();
				setState(156);
				match(T__2);
				setState(157);
				expression();
				setState(158);
				match(T__3);
				}
				}
				break;
			case LINE:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(160);
				match(LINE);
				setState(161);
				match(T__1);
				setState(162);
				expression();
				setState(163);
				match(T__2);
				setState(164);
				expression();
				setState(165);
				match(T__2);
				setState(166);
				expression();
				setState(167);
				match(T__2);
				setState(168);
				expression();
				setState(169);
				match(T__3);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DrawInstructionContext extends ParserRuleContext {
		public TerminalNode DRAW() { return getToken(CanvasGrammarParser.DRAW, 0); }
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CanvasGrammarParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CanvasGrammarParser.SPACE, i);
		}
		public DrawInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterDrawInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitDrawInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitDrawInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawInstructionContext drawInstruction() throws RecognitionException {
		DrawInstructionContext _localctx = new DrawInstructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_drawInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(DRAW);
			setState(174);
			figure();
			setState(176); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				match(SPACE);
				}
				}
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(180);
			color();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOperationContext extends ParserRuleContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode AssignOperator() { return getToken(CanvasGrammarParser.AssignOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterVariableOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitVariableOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOperationContext variableOperation() throws RecognitionException {
		VariableOperationContext _localctx = new VariableOperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			variableRef();
			setState(183);
			match(AssignOperator);
			setState(184);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\3\5\3\6\3\6\3\6\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bJ\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13e\n\13\3\f\3\f\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rs\n"+
		"\r\3\16\3\16\3\16\5\16x\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0083\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008b\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\22\3\22\3\22\6\22\u00b3\n\22\r"+
		"\22\16\22\u00b4\3\22\3\22\3\23\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\2\2\u00be\2&\3\2\2\2\4.\3\2\2\2\6\63"+
		"\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\f?\3\2\2\2\16B\3\2\2\2\20M\3\2\2\2\22"+
		"S\3\2\2\2\24d\3\2\2\2\26j\3\2\2\2\30r\3\2\2\2\32w\3\2\2\2\34\u0082\3\2"+
		"\2\2\36\u008a\3\2\2\2 \u00ad\3\2\2\2\"\u00af\3\2\2\2$\u00b8\3\2\2\2&\'"+
		"\5\6\4\2\'(\7\2\2\3(\3\3\2\2\2)/\5\22\n\2*/\5\20\t\2+/\5\16\b\2,/\5\""+
		"\22\2-/\5$\23\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3"+
		"\2\2\2\60\61\5\4\3\2\61\62\7\13\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\65"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\678\7\b\2\28\t\3\2\2"+
		"\29:\7 \2\2:;\5\f\7\2;\13\3\2\2\2<>\7\n\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2"+
		"\2\2?@\3\2\2\2@\r\3\2\2\2A?\3\2\2\2BC\7\25\2\2CD\5\34\17\2DE\7\3\2\2E"+
		"F\7\13\2\2FI\5\6\4\2GH\7\26\2\2HJ\5\6\4\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KL\7\24\2\2L\17\3\2\2\2MN\7\31\2\2NO\7!\2\2OP\5\6\4\2PQ\7\24\2\2QR\7"+
		"\31\2\2R\21\3\2\2\2ST\7\30\2\2TU\5\34\17\2UV\7\13\2\2VW\5\6\4\2WX\7\24"+
		"\2\2X\23\3\2\2\2Ye\7\37\2\2Z[\7\32\2\2[\\\7\4\2\2\\]\5\26\f\2]^\7\5\2"+
		"\2^_\5\26\f\2_`\7\5\2\2`a\5\26\f\2ab\7\6\2\2be\3\2\2\2ce\7\7\2\2dY\3\2"+
		"\2\2dZ\3\2\2\2dc\3\2\2\2e\25\3\2\2\2fk\3\2\2\2gh\5\30\r\2hi\5\32\16\2"+
		"ik\3\2\2\2jf\3\2\2\2jg\3\2\2\2k\27\3\2\2\2ls\5\b\5\2mn\7\4\2\2no\5\26"+
		"\f\2op\7\6\2\2ps\3\2\2\2qs\7\t\2\2rl\3\2\2\2rm\3\2\2\2rq\3\2\2\2s\31\3"+
		"\2\2\2tu\7\35\2\2ux\5\26\f\2vx\3\2\2\2wt\3\2\2\2wv\3\2\2\2x\33\3\2\2\2"+
		"y\u0083\5\36\20\2z{\5\36\20\2{|\7\f\2\2|}\5\34\17\2}\u0083\3\2\2\2~\177"+
		"\5\36\20\2\177\u0080\7\r\2\2\u0080\u0081\5\34\17\2\u0081\u0083\3\2\2\2"+
		"\u0082y\3\2\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0083\35\3\2\2\2\u0084\u0085"+
		"\5\26\f\2\u0085\u0086\7\36\2\2\u0086\u0087\5\26\f\2\u0087\u008b\3\2\2"+
		"\2\u0088\u008b\7\16\2\2\u0089\u008b\7\17\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\5\f"+
		"\7\2\u008d\37\3\2\2\2\u008e\u008f\7\20\2\2\u008f\u0090\7\4\2\2\u0090\u0091"+
		"\5\26\f\2\u0091\u0092\7\5\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7\5\2\2"+
		"\u0094\u0095\5\26\f\2\u0095\u0096\7\5\2\2\u0096\u0097\5\26\f\2\u0097\u0098"+
		"\7\6\2\2\u0098\u00ae\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u009b\7\4\2\2"+
		"\u009b\u009c\5\26\f\2\u009c\u009d\7\5\2\2\u009d\u009e\5\26\f\2\u009e\u009f"+
		"\7\5\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\7\6\2\2\u00a1\u00ae\3\2\2\2"+
		"\u00a2\u00a3\7\22\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6"+
		"\7\5\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\5\26\f\2"+
		"\u00a9\u00aa\7\5\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\7\6\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u008e\3\2\2\2\u00ad\u0099\3\2\2\2\u00ad\u00a2\3\2\2\2\u00ae"+
		"!\3\2\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b2\5 \21\2\u00b1\u00b3\7\n\2\2"+
		"\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5\24\13\2\u00b7#\3\2\2\2\u00b8"+
		"\u00b9\5\b\5\2\u00b9\u00ba\7\34\2\2\u00ba\u00bb\5\26\f\2\u00bb%\3\2\2"+
		"\2\16.\65?Idjrw\u0082\u008a\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}