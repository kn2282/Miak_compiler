// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/javaprocessor/canvas-compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package CanvasGrammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CanvasGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SPACE=7, NEW_LINE=8, AND=9, 
		OR=10, TRUE=11, FALSE=12, RECTANGLE=13, CIRCLE=14, LINE=15, BEGIN=16, 
		END=17, IF=18, THEN=19, WHILE=20, DEF=21, RGB=22, DRAW=23, AssignOperator=24, 
		AritmeticOperator=25, ComprehensionOperator=26, Hex=27, Number=28, Variable_ref=29, 
		Color_name=30, Name=31;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_instruction_chain = 2, RULE_ws = 3, 
		RULE_condition = 4, RULE_function = 5, RULE_loop = 6, RULE_color = 7, 
		RULE_expression = 8, RULE_bool = 9, RULE_bool_src = 10, RULE_figure = 11, 
		RULE_draw_instruction = 12, RULE_arithmetic_instruction = 13, RULE_variable = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "instruction_chain", "ws", "condition", "function", 
			"loop", "color", "expression", "bool", "bool_src", "figure", "draw_instruction", 
			"arithmetic_instruction", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'!'", "'('", "','", "')'", "'#'", null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SPACE", "NEW_LINE", "AND", 
			"OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", "BEGIN", "END", 
			"IF", "THEN", "WHILE", "DEF", "RGB", "DRAW", "AssignOperator", "AritmeticOperator", 
			"ComprehensionOperator", "Hex", "Number", "Variable_ref", "Color_name", 
			"Name"
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
		public Instruction_chainContext instruction_chain() {
			return getRuleContext(Instruction_chainContext.class,0);
		}
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
			setState(30);
			instruction_chain();
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
		public Draw_instructionContext draw_instruction() {
			return getRuleContext(Draw_instructionContext.class,0);
		}
		public Arithmetic_instructionContext arithmetic_instruction() {
			return getRuleContext(Arithmetic_instructionContext.class,0);
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				loop();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				function();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				condition();
				}
				break;
			case DRAW:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				draw_instruction();
				}
				break;
			case Variable_ref:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				arithmetic_instruction();
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

	public static class Instruction_chainContext extends ParserRuleContext {
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
		public Instruction_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterInstruction_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitInstruction_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitInstruction_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_chainContext instruction_chain() throws RecognitionException {
		Instruction_chainContext _localctx = new Instruction_chainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				instruction();
				setState(40);
				match(NEW_LINE);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << DEF) | (1L << DRAW) | (1L << Variable_ref))) != 0) );
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
		enterRule(_localctx, 6, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(SPACE);
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public List<Instruction_chainContext> instruction_chain() {
			return getRuleContexts(Instruction_chainContext.class);
		}
		public Instruction_chainContext instruction_chain(int i) {
			return getRuleContext(Instruction_chainContext.class,i);
		}
		public TerminalNode END() { return getToken(CanvasGrammarParser.END, 0); }
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
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IF);
			setState(53);
			bool();
			setState(54);
			match(T__0);
			setState(55);
			match(NEW_LINE);
			setState(56);
			instruction_chain();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(57);
				match(T__1);
				setState(58);
				instruction_chain();
				}
			}

			setState(61);
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
		public Instruction_chainContext instruction_chain() {
			return getRuleContext(Instruction_chainContext.class,0);
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
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DEF);
			setState(64);
			match(Name);
			setState(65);
			instruction_chain();
			setState(66);
			match(END);
			setState(67);
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
		public Instruction_chainContext instruction_chain() {
			return getRuleContext(Instruction_chainContext.class,0);
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
		enterRule(_localctx, 12, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(WHILE);
			setState(70);
			bool();
			setState(71);
			match(NEW_LINE);
			setState(72);
			instruction_chain();
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode Color_name() { return getToken(CanvasGrammarParser.Color_name, 0); }
		public TerminalNode RGB() { return getToken(CanvasGrammarParser.RGB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Hex() { return getTokens(CanvasGrammarParser.Hex); }
		public TerminalNode Hex(int i) {
			return getToken(CanvasGrammarParser.Hex, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_color);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Color_name:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(Color_name);
				}
				break;
			case RGB:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(76);
				match(RGB);
				setState(77);
				match(T__2);
				setState(78);
				expression();
				setState(79);
				match(T__3);
				setState(80);
				expression();
				setState(81);
				match(T__3);
				setState(82);
				expression();
				setState(83);
				match(T__4);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(85);
				match(T__5);
				setState(86);
				match(Hex);
				setState(87);
				match(Hex);
				setState(88);
				match(Hex);
				setState(89);
				match(Hex);
				setState(90);
				match(Hex);
				setState(91);
				match(Hex);
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

	public static class ExpressionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AritmeticOperator() { return getToken(CanvasGrammarParser.AritmeticOperator, 0); }
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__2);
				setState(96);
				expression();
				setState(97);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(99);
				variable();
				setState(100);
				match(AritmeticOperator);
				setState(101);
				expression();
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

	public static class BoolContext extends ParserRuleContext {
		public Bool_srcContext bool_src() {
			return getRuleContext(Bool_srcContext.class,0);
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
		enterRule(_localctx, 18, RULE_bool);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				bool_src();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106);
				bool_src();
				setState(107);
				match(AND);
				setState(108);
				bool();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(110);
				bool_src();
				setState(111);
				match(OR);
				setState(112);
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

	public static class Bool_srcContext extends ParserRuleContext {
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
		public Bool_srcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterBool_src(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitBool_src(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBool_src(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_srcContext bool_src() throws RecognitionException {
		Bool_srcContext _localctx = new Bool_srcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Number:
			case Variable_ref:
				{
				{
				setState(116);
				expression();
				setState(117);
				match(ComprehensionOperator);
				setState(118);
				expression();
				}
				}
				break;
			case TRUE:
				{
				setState(120);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(121);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
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
		public TerminalNode RECTANGLE() { return getToken(CanvasGrammarParser.RECTANGLE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CIRCLE() { return getToken(CanvasGrammarParser.CIRCLE, 0); }
		public TerminalNode LINE() { return getToken(CanvasGrammarParser.LINE, 0); }
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_figure);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECTANGLE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(126);
				match(RECTANGLE);
				setState(127);
				match(T__2);
				setState(128);
				expression();
				setState(129);
				match(T__3);
				setState(130);
				expression();
				setState(131);
				match(T__3);
				setState(132);
				expression();
				setState(133);
				match(T__3);
				setState(134);
				expression();
				setState(135);
				match(T__4);
				}
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(137);
				match(CIRCLE);
				setState(138);
				match(T__2);
				setState(139);
				expression();
				setState(140);
				match(T__3);
				setState(141);
				expression();
				setState(142);
				match(T__3);
				setState(143);
				expression();
				setState(144);
				match(T__4);
				}
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(146);
				match(LINE);
				setState(147);
				match(T__2);
				setState(148);
				expression();
				setState(149);
				match(T__3);
				setState(150);
				expression();
				setState(151);
				match(T__3);
				setState(152);
				expression();
				setState(153);
				match(T__3);
				setState(154);
				expression();
				setState(155);
				match(T__4);
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

	public static class Draw_instructionContext extends ParserRuleContext {
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
		public Draw_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterDraw_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitDraw_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitDraw_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Draw_instructionContext draw_instruction() throws RecognitionException {
		Draw_instructionContext _localctx = new Draw_instructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_draw_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DRAW);
			setState(160);
			figure();
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(SPACE);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPACE );
			setState(166);
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

	public static class Arithmetic_instructionContext extends ParserRuleContext {
		public TerminalNode Variable_ref() { return getToken(CanvasGrammarParser.Variable_ref, 0); }
		public TerminalNode AssignOperator() { return getToken(CanvasGrammarParser.AssignOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arithmetic_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterArithmetic_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitArithmetic_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitArithmetic_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_instructionContext arithmetic_instruction() throws RecognitionException {
		Arithmetic_instructionContext _localctx = new Arithmetic_instructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arithmetic_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Variable_ref);
			setState(169);
			match(AssignOperator);
			setState(170);
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

	public static class VariableContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Number() { return getToken(CanvasGrammarParser.Number, 0); }
		public TerminalNode Variable_ref() { return getToken(CanvasGrammarParser.Variable_ref, 0); }
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
		enterRule(_localctx, 28, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !(_la==Number || _la==Variable_ref) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\5\7\5\62\n\5\f\5\16"+
		"\5\65\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13u\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\6\16\u00a5\n"+
		"\16\r\16\16\16\u00a6\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\36\37\2\u00b4\2"+
		" \3\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\b\63\3\2\2\2\n\66\3\2\2\2\fA\3\2\2\2"+
		"\16G\3\2\2\2\20^\3\2\2\2\22i\3\2\2\2\24t\3\2\2\2\26|\3\2\2\2\30\u009f"+
		"\3\2\2\2\32\u00a1\3\2\2\2\34\u00aa\3\2\2\2\36\u00ae\3\2\2\2 !\5\6\4\2"+
		"!\3\3\2\2\2\"(\5\16\b\2#(\5\f\7\2$(\5\n\6\2%(\5\32\16\2&(\5\34\17\2\'"+
		"\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\5"+
		"\4\3\2*+\7\n\2\2+-\3\2\2\2,)\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7"+
		"\3\2\2\2\60\62\7\t\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\t\3\2\2\2\65\63\3\2\2\2\66\67\7\24\2\2\678\5\24\13\289\7\3"+
		"\2\29:\7\n\2\2:=\5\6\4\2;<\7\4\2\2<>\5\6\4\2=;\3\2\2\2=>\3\2\2\2>?\3\2"+
		"\2\2?@\7\23\2\2@\13\3\2\2\2AB\7\27\2\2BC\7!\2\2CD\5\6\4\2DE\7\23\2\2E"+
		"F\7\27\2\2F\r\3\2\2\2GH\7\26\2\2HI\5\24\13\2IJ\7\n\2\2JK\5\6\4\2KL\7\23"+
		"\2\2L\17\3\2\2\2M_\7 \2\2NO\7\30\2\2OP\7\5\2\2PQ\5\22\n\2QR\7\6\2\2RS"+
		"\5\22\n\2ST\7\6\2\2TU\5\22\n\2UV\7\7\2\2V_\3\2\2\2WX\7\b\2\2XY\7\35\2"+
		"\2YZ\7\35\2\2Z[\7\35\2\2[\\\7\35\2\2\\]\7\35\2\2]_\7\35\2\2^M\3\2\2\2"+
		"^N\3\2\2\2^W\3\2\2\2_\21\3\2\2\2`j\5\36\20\2ab\7\5\2\2bc\5\22\n\2cd\7"+
		"\7\2\2dj\3\2\2\2ef\5\36\20\2fg\7\33\2\2gh\5\22\n\2hj\3\2\2\2i`\3\2\2\2"+
		"ia\3\2\2\2ie\3\2\2\2j\23\3\2\2\2ku\5\26\f\2lm\5\26\f\2mn\7\13\2\2no\5"+
		"\24\13\2ou\3\2\2\2pq\5\26\f\2qr\7\f\2\2rs\5\24\13\2su\3\2\2\2tk\3\2\2"+
		"\2tl\3\2\2\2tp\3\2\2\2u\25\3\2\2\2vw\5\22\n\2wx\7\34\2\2xy\5\22\n\2y}"+
		"\3\2\2\2z}\7\r\2\2{}\7\16\2\2|v\3\2\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2"+
		"~\177\5\b\5\2\177\27\3\2\2\2\u0080\u0081\7\17\2\2\u0081\u0082\7\5\2\2"+
		"\u0082\u0083\5\22\n\2\u0083\u0084\7\6\2\2\u0084\u0085\5\22\n\2\u0085\u0086"+
		"\7\6\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\6\2\2\u0088\u0089\5\22\n\2"+
		"\u0089\u008a\7\7\2\2\u008a\u00a0\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d"+
		"\7\5\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\6\2\2\u008f\u0090\5\22\n\2"+
		"\u0090\u0091\7\6\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\7\2\2\u0093\u00a0"+
		"\3\2\2\2\u0094\u0095\7\21\2\2\u0095\u0096\7\5\2\2\u0096\u0097\5\22\n\2"+
		"\u0097\u0098\7\6\2\2\u0098\u0099\5\22\n\2\u0099\u009a\7\6\2\2\u009a\u009b"+
		"\5\22\n\2\u009b\u009c\7\6\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\7\2\2"+
		"\u009e\u00a0\3\2\2\2\u009f\u0080\3\2\2\2\u009f\u008b\3\2\2\2\u009f\u0094"+
		"\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00a4\5\30\r\2\u00a3"+
		"\u00a5\7\t\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\20\t\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\5\22"+
		"\n\2\u00ad\35\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\u00b0\5\b\5\2\u00b0\37"+
		"\3\2\2\2\f\'.\63=^it|\u009f\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}