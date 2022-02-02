// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package pl.edu.agh.Interpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CanvasGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, HexColor=6, Integer=7, Float=8, 
		VariableName=9, SPACE=10, ENDL=11, COMMENT=12, AND=13, OR=14, TRUE=15, 
		FALSE=16, RECTANGLE=17, CIRCLE=18, LINE=19, BEGIN=20, END=21, IF=22, ELSE=23, 
		THEN=24, WHILE=25, DEF=26, RGB=27, DRAW=28, BLOCK=29, FILL=30, AssignOperator=31, 
		TopScopeModifier=32, HigherScopeModifier=33, Minus=34, Plus=35, Mult=36, 
		Divide=37, ROTATED=38, ComprehensionOperator=39, ColorName=40;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_debug = 2, RULE_block = 3, 
		RULE_instructionChain = 4, RULE_functionName = 5, RULE_variableName = 6, 
		RULE_variableRef = 7, RULE_variable = 8, RULE_constant = 9, RULE_nonPriorityArithmeticOperator = 10, 
		RULE_priorityArithmeticOperator = 11, RULE_functionCall = 12, RULE_functionCallArguments = 13, 
		RULE_arguments = 14, RULE_condition = 15, RULE_functionDefinition = 16, 
		RULE_loop = 17, RULE_color = 18, RULE_expression = 19, RULE_priorityExpression = 20, 
		RULE_halfExpression = 21, RULE_priorityExpressionSuffix = 22, RULE_expressionSuffix = 23, 
		RULE_bool = 24, RULE_boolSrc = 25, RULE_figure = 26, RULE_drawInstruction = 27, 
		RULE_rotation = 28, RULE_variableOperation = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "debug", "block", "instructionChain", "functionName", 
			"variableName", "variableRef", "variable", "constant", "nonPriorityArithmeticOperator", 
			"priorityArithmeticOperator", "functionCall", "functionCallArguments", 
			"arguments", "condition", "functionDefinition", "loop", "color", "expression", 
			"priorityExpression", "halfExpression", "priorityExpressionSuffix", "expressionSuffix", 
			"bool", "boolSrc", "figure", "drawInstruction", "rotation", "variableOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEBUG'", "'('", "','", "')'", "':'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'CIRCLE'", "'LINE'", 
			"'BEGIN'", "'END'", null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", 
			"'BLOCK'", "'FILL'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'", 
			"'ROTATED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "HexColor", "Integer", "Float", "VariableName", 
			"SPACE", "ENDL", "COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", 
			"CIRCLE", "LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", 
			"RGB", "DRAW", "BLOCK", "FILL", "AssignOperator", "TopScopeModifier", 
			"HigherScopeModifier", "Minus", "Plus", "Mult", "Divide", "ROTATED", 
			"ComprehensionOperator", "ColorName"
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
			setState(60);
			instructionChain();
			setState(61);
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(CanvasGrammarParser.ENDL, 0); }
		public DebugContext debug() {
			return getRuleContext(DebugContext.class,0);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				drawInstruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				variableOperation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				block();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(70);
					match(ENDL);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				debug();
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

	public static class DebugContext extends ParserRuleContext {
		public DebugContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_debug; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterDebug(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitDebug(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitDebug(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DebugContext debug() throws RecognitionException {
		DebugContext _localctx = new DebugContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_debug);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK() { return getTokens(CanvasGrammarParser.BLOCK); }
		public TerminalNode BLOCK(int i) {
			return getToken(CanvasGrammarParser.BLOCK, i);
		}
		public TerminalNode ENDL() { return getToken(CanvasGrammarParser.ENDL, 0); }
		public InstructionChainContext instructionChain() {
			return getRuleContext(InstructionChainContext.class,0);
		}
		public TerminalNode END() { return getToken(CanvasGrammarParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(BLOCK);
			setState(79);
			match(ENDL);
			setState(80);
			instructionChain();
			setState(81);
			match(END);
			setState(82);
			match(BLOCK);
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
		public InstructionContext instruction;
		public List<InstructionContext> instr = new ArrayList<InstructionContext>();
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> ENDL() { return getTokens(CanvasGrammarParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(CanvasGrammarParser.ENDL, i);
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
		enterRule(_localctx, 8, RULE_instructionChain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(84);
				match(ENDL);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			((InstructionChainContext)_localctx).instruction = instruction();
			((InstructionChainContext)_localctx).instr.add(((InstructionChainContext)_localctx).instruction);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(91);
						match(ENDL);
						}
						}
						setState(94); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ENDL );
					setState(96);
					((InstructionChainContext)_localctx).instruction = instruction();
					((InstructionChainContext)_localctx).instr.add(((InstructionChainContext)_localctx).instruction);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(102);
				match(ENDL);
				}
				}
				setState(107);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(CanvasGrammarParser.VariableName, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(CanvasGrammarParser.VariableName, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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

	public static class VariableRefContext extends ParserRuleContext {
		public VariableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRef; }
	 
		public VariableRefContext() { }
		public void copyFrom(VariableRefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HigherScopeVarContext extends VariableRefContext {
		public TerminalNode HigherScopeModifier() { return getToken(CanvasGrammarParser.HigherScopeModifier, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public HigherScopeVarContext(VariableRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterHigherScopeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitHigherScopeVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitHigherScopeVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopScopeVarContext extends VariableRefContext {
		public TerminalNode TopScopeModifier() { return getToken(CanvasGrammarParser.TopScopeModifier, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TopScopeVarContext(VariableRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterTopScopeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitTopScopeVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitTopScopeVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SameScopeVarContext extends VariableRefContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SameScopeVarContext(VariableRefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterSameScopeVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitSameScopeVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitSameScopeVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableRef);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TopScopeModifier:
				_localctx = new TopScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(TopScopeModifier);
				setState(113);
				variableName();
				}
				break;
			case HigherScopeModifier:
				_localctx = new HigherScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(HigherScopeModifier);
				setState(115);
				variableName();
				}
				break;
			case VariableName:
				_localctx = new SameScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				variableName();
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

	public static class VariableContext extends ParserRuleContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode Minus() { return getToken(CanvasGrammarParser.Minus, 0); }
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
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(119);
				match(Minus);
				}
			}

			setState(122);
			variableRef();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(CanvasGrammarParser.Integer, 0); }
		public TerminalNode Float() { return getToken(CanvasGrammarParser.Float, 0); }
		public TerminalNode Minus() { return getToken(CanvasGrammarParser.Minus, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(124);
				match(Minus);
				}
			}

			setState(127);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NonPriorityArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(CanvasGrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CanvasGrammarParser.Minus, 0); }
		public NonPriorityArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonPriorityArithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterNonPriorityArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitNonPriorityArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitNonPriorityArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonPriorityArithmeticOperatorContext nonPriorityArithmeticOperator() throws RecognitionException {
		NonPriorityArithmeticOperatorContext _localctx = new NonPriorityArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nonPriorityArithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==Minus || _la==Plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PriorityArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode Mult() { return getToken(CanvasGrammarParser.Mult, 0); }
		public TerminalNode Divide() { return getToken(CanvasGrammarParser.Divide, 0); }
		public PriorityArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priorityArithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterPriorityArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitPriorityArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitPriorityArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityArithmeticOperatorContext priorityArithmeticOperator() throws RecognitionException {
		PriorityArithmeticOperatorContext _localctx = new PriorityArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_priorityArithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==Mult || _la==Divide) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			functionName();
			setState(134);
			functionCallArguments();
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> arg = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitFunctionCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__1);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Integer) | (1L << Float) | (1L << VariableName) | (1L << TopScopeModifier) | (1L << HigherScopeModifier) | (1L << Minus))) != 0)) {
				{
				setState(137);
				((FunctionCallArgumentsContext)_localctx).expression = expression();
				((FunctionCallArgumentsContext)_localctx).arg.add(((FunctionCallArgumentsContext)_localctx).expression);
				}
			}

			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(140);
				match(T__2);
				setState(141);
				((FunctionCallArgumentsContext)_localctx).expression = expression();
				((FunctionCallArgumentsContext)_localctx).arg.add(((FunctionCallArgumentsContext)_localctx).expression);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(T__3);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public VariableRefContext variableRef;
		public List<VariableRefContext> arg = new ArrayList<VariableRefContext>();
		public List<VariableRefContext> variableRef() {
			return getRuleContexts(VariableRefContext.class);
		}
		public VariableRefContext variableRef(int i) {
			return getRuleContext(VariableRefContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__1);
			setState(150);
			((ArgumentsContext)_localctx).variableRef = variableRef();
			((ArgumentsContext)_localctx).arg.add(((ArgumentsContext)_localctx).variableRef);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(151);
				match(T__2);
				setState(152);
				((ArgumentsContext)_localctx).variableRef = variableRef();
				((ArgumentsContext)_localctx).arg.add(((ArgumentsContext)_localctx).variableRef);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__3);
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
		public TerminalNode ENDL() { return getToken(CanvasGrammarParser.ENDL, 0); }
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
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IF);
			setState(161);
			bool();
			setState(162);
			match(T__4);
			setState(163);
			match(ENDL);
			setState(164);
			instructionChain();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(165);
				match(ELSE);
				setState(166);
				instructionChain();
				}
			}

			setState(169);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> DEF() { return getTokens(CanvasGrammarParser.DEF); }
		public TerminalNode DEF(int i) {
			return getToken(CanvasGrammarParser.DEF, i);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(CanvasGrammarParser.ENDL, 0); }
		public InstructionChainContext instructionChain() {
			return getRuleContext(InstructionChainContext.class,0);
		}
		public TerminalNode END() { return getToken(CanvasGrammarParser.END, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(DEF);
			setState(172);
			functionName();
			setState(173);
			arguments();
			setState(174);
			match(ENDL);
			setState(175);
			instructionChain();
			setState(176);
			match(END);
			setState(177);
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
		public TerminalNode ENDL() { return getToken(CanvasGrammarParser.ENDL, 0); }
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
		enterRule(_localctx, 34, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WHILE);
			setState(180);
			bool();
			setState(181);
			match(T__4);
			setState(182);
			match(ENDL);
			setState(183);
			instructionChain();
			setState(184);
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
		enterRule(_localctx, 36, RULE_color);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ColorName:
				_localctx = new ColorNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(ColorName);
				}
				break;
			case RGB:
				_localctx = new ColorRGBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(RGB);
				setState(188);
				match(T__1);
				setState(189);
				expression();
				setState(190);
				match(T__2);
				setState(191);
				expression();
				setState(192);
				match(T__2);
				setState(193);
				expression();
				setState(194);
				match(T__3);
				}
				break;
			case HexColor:
				_localctx = new ColorHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
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
		public PriorityExpressionContext priorityExpression() {
			return getRuleContext(PriorityExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			priorityExpression();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus || _la==Plus) {
				{
				setState(200);
				expressionSuffix();
				}
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

	public static class PriorityExpressionContext extends ParserRuleContext {
		public HalfExpressionContext halfExpression() {
			return getRuleContext(HalfExpressionContext.class,0);
		}
		public PriorityExpressionSuffixContext priorityExpressionSuffix() {
			return getRuleContext(PriorityExpressionSuffixContext.class,0);
		}
		public PriorityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priorityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterPriorityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitPriorityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitPriorityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityExpressionContext priorityExpression() throws RecognitionException {
		PriorityExpressionContext _localctx = new PriorityExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_priorityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			halfExpression();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Divide) {
				{
				setState(204);
				priorityExpressionSuffix();
				}
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
		enterRule(_localctx, 42, RULE_halfExpression);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				variable();
				}
				break;
			case 2:
				_localctx = new BracketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__1);
				setState(209);
				expression();
				setState(210);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				constant();
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

	public static class PriorityExpressionSuffixContext extends ParserRuleContext {
		public PriorityArithmeticOperatorContext priorityArithmeticOperator() {
			return getRuleContext(PriorityArithmeticOperatorContext.class,0);
		}
		public PriorityExpressionContext priorityExpression() {
			return getRuleContext(PriorityExpressionContext.class,0);
		}
		public PriorityExpressionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priorityExpressionSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterPriorityExpressionSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitPriorityExpressionSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitPriorityExpressionSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityExpressionSuffixContext priorityExpressionSuffix() throws RecognitionException {
		PriorityExpressionSuffixContext _localctx = new PriorityExpressionSuffixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_priorityExpressionSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			priorityArithmeticOperator();
			setState(216);
			priorityExpression();
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
		public NonPriorityArithmeticOperatorContext nonPriorityArithmeticOperator() {
			return getRuleContext(NonPriorityArithmeticOperatorContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_expressionSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			nonPriorityArithmeticOperator();
			setState(219);
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
		enterRule(_localctx, 48, RULE_bool);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				boolSrc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(222);
				boolSrc();
				setState(223);
				match(AND);
				setState(224);
				bool();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(226);
				boolSrc();
				setState(227);
				match(OR);
				setState(228);
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
		enterRule(_localctx, 50, RULE_boolSrc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case Integer:
			case Float:
			case VariableName:
			case TopScopeModifier:
			case HigherScopeModifier:
			case Minus:
				{
				{
				setState(232);
				expression();
				setState(233);
				match(ComprehensionOperator);
				setState(234);
				expression();
				}
				}
				break;
			case TRUE:
				{
				setState(236);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(237);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 52, RULE_figure);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECTANGLE:
				_localctx = new RectangleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(240);
				match(RECTANGLE);
				setState(241);
				match(T__1);
				setState(242);
				expression();
				setState(243);
				match(T__2);
				setState(244);
				expression();
				setState(245);
				match(T__2);
				setState(246);
				expression();
				setState(247);
				match(T__2);
				setState(248);
				expression();
				setState(249);
				match(T__3);
				}
				}
				break;
			case CIRCLE:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(251);
				match(CIRCLE);
				setState(252);
				match(T__1);
				setState(253);
				expression();
				setState(254);
				match(T__2);
				setState(255);
				expression();
				setState(256);
				match(T__2);
				setState(257);
				expression();
				setState(258);
				match(T__3);
				}
				}
				break;
			case LINE:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(260);
				match(LINE);
				setState(261);
				match(T__1);
				setState(262);
				expression();
				setState(263);
				match(T__2);
				setState(264);
				expression();
				setState(265);
				match(T__2);
				setState(266);
				expression();
				setState(267);
				match(T__2);
				setState(268);
				expression();
				setState(269);
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
		public TerminalNode FILL() { return getToken(CanvasGrammarParser.FILL, 0); }
		public RotationContext rotation() {
			return getRuleContext(RotationContext.class,0);
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
		enterRule(_localctx, 54, RULE_drawInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(DRAW);
			setState(274);
			figure();
			setState(275);
			color();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILL) {
				{
				setState(276);
				match(FILL);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROTATED) {
				{
				setState(279);
				rotation();
				}
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

	public static class RotationContext extends ParserRuleContext {
		public TerminalNode ROTATED() { return getToken(CanvasGrammarParser.ROTATED, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).enterRotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CanvasGrammarListener ) ((CanvasGrammarListener)listener).exitRotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CanvasGrammarVisitor ) return ((CanvasGrammarVisitor<? extends T>)visitor).visitRotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotationContext rotation() throws RecognitionException {
		RotationContext _localctx = new RotationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ROTATED);
			setState(283);
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
		enterRule(_localctx, 58, RULE_variableOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			variableRef();
			setState(286);
			match(AssignOperator);
			setState(287);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\3\5\3M\n\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\6\6_\n\6\r\6\16"+
		"\6`\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tx\n\t\3\n\5\n{\n\n\3\n\3\n\3\13\5\13\u0080"+
		"\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\5\17\u008d\n"+
		"\17\3\17\3\17\7\17\u0091\n\17\f\17\16\17\u0094\13\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\7\20\u009c\n\20\f\20\16\20\u009f\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00aa\n\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c8\n\24\3\25\3\25"+
		"\5\25\u00cc\n\25\3\26\3\26\5\26\u00d0\n\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00d8\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00e9\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00f1\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0112\n\34\3\35\3\35\3\35\3\35\5\35"+
		"\u0118\n\35\3\35\5\35\u011b\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<\2\5\3\2\t\n\3\2$%\3\2&\'\2\u0127\2>\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\b"+
		"P\3\2\2\2\nY\3\2\2\2\fn\3\2\2\2\16p\3\2\2\2\20w\3\2\2\2\22z\3\2\2\2\24"+
		"\177\3\2\2\2\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34\u008a"+
		"\3\2\2\2\36\u0097\3\2\2\2 \u00a2\3\2\2\2\"\u00ad\3\2\2\2$\u00b5\3\2\2"+
		"\2&\u00c7\3\2\2\2(\u00c9\3\2\2\2*\u00cd\3\2\2\2,\u00d7\3\2\2\2.\u00d9"+
		"\3\2\2\2\60\u00dc\3\2\2\2\62\u00e8\3\2\2\2\64\u00f0\3\2\2\2\66\u0111\3"+
		"\2\2\28\u0113\3\2\2\2:\u011c\3\2\2\2<\u011f\3\2\2\2>?\5\n\6\2?@\7\2\2"+
		"\3@\3\3\2\2\2AM\5$\23\2BM\5\"\22\2CM\5 \21\2DM\58\35\2EM\5<\37\2FM\5\32"+
		"\16\2GI\5\b\5\2HJ\7\r\2\2IH\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KM\5\6\4\2LA\3"+
		"\2\2\2LB\3\2\2\2LC\3\2\2\2LD\3\2\2\2LE\3\2\2\2LF\3\2\2\2LG\3\2\2\2LK\3"+
		"\2\2\2M\5\3\2\2\2NO\7\3\2\2O\7\3\2\2\2PQ\7\37\2\2QR\7\r\2\2RS\5\n\6\2"+
		"ST\7\27\2\2TU\7\37\2\2U\t\3\2\2\2VX\7\r\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\e\5\4\3\2]_\7\r\2\2^]\3\2\2\2_`\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\5\4\3\2c^\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\7\r\2\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\13\3\2\2\2mk\3\2\2\2no\7\13\2\2o\r\3\2\2\2pq\7\13\2"+
		"\2q\17\3\2\2\2rs\7\"\2\2sx\5\16\b\2tu\7#\2\2ux\5\16\b\2vx\5\16\b\2wr\3"+
		"\2\2\2wt\3\2\2\2wv\3\2\2\2x\21\3\2\2\2y{\7$\2\2zy\3\2\2\2z{\3\2\2\2{|"+
		"\3\2\2\2|}\5\20\t\2}\23\3\2\2\2~\u0080\7$\2\2\177~\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\t\2\2\2\u0082\25\3\2\2\2\u0083"+
		"\u0084\t\3\2\2\u0084\27\3\2\2\2\u0085\u0086\t\4\2\2\u0086\31\3\2\2\2\u0087"+
		"\u0088\5\f\7\2\u0088\u0089\5\34\17\2\u0089\33\3\2\2\2\u008a\u008c\7\4"+
		"\2\2\u008b\u008d\5(\25\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0092\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0091\5(\25\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\6\2\2\u0096\35\3\2\2"+
		"\2\u0097\u0098\7\4\2\2\u0098\u009d\5\20\t\2\u0099\u009a\7\5\2\2\u009a"+
		"\u009c\5\20\t\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\7\6\2\2\u00a1\37\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\5\62"+
		"\32\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a9\5\n\6\2\u00a7"+
		"\u00a8\7\31\2\2\u00a8\u00aa\5\n\6\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\27\2\2\u00ac!\3\2\2\2\u00ad\u00ae"+
		"\7\34\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\r\2"+
		"\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\7\27\2\2\u00b3\u00b4\7\34\2\2\u00b4"+
		"#\3\2\2\2\u00b5\u00b6\7\33\2\2\u00b6\u00b7\5\62\32\2\u00b7\u00b8\7\7\2"+
		"\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb\7\27\2\2\u00bb"+
		"%\3\2\2\2\u00bc\u00c8\7*\2\2\u00bd\u00be\7\35\2\2\u00be\u00bf\7\4\2\2"+
		"\u00bf\u00c0\5(\25\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5(\25\2\u00c2\u00c3"+
		"\7\5\2\2\u00c3\u00c4\5(\25\2\u00c4\u00c5\7\6\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c8\7\b\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\'\3\2\2\2\u00c9\u00cb\5*\26\2\u00ca\u00cc\5\60\31\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00cf\5,\27\2\u00ce"+
		"\u00d0\5.\30\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0+\3\2\2\2"+
		"\u00d1\u00d8\5\22\n\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\5(\25\2\u00d4\u00d5"+
		"\7\6\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d8\5\24\13\2\u00d7\u00d1\3\2\2\2"+
		"\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00da\5"+
		"\30\r\2\u00da\u00db\5*\26\2\u00db/\3\2\2\2\u00dc\u00dd\5\26\f\2\u00dd"+
		"\u00de\5(\25\2\u00de\61\3\2\2\2\u00df\u00e9\5\64\33\2\u00e0\u00e1\5\64"+
		"\33\2\u00e1\u00e2\7\17\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e9\3\2\2\2\u00e4"+
		"\u00e5\5\64\33\2\u00e5\u00e6\7\20\2\2\u00e6\u00e7\5\62\32\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9"+
		"\63\3\2\2\2\u00ea\u00eb\5(\25\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\5(\25\2"+
		"\u00ed\u00f1\3\2\2\2\u00ee\u00f1\7\21\2\2\u00ef\u00f1\7\22\2\2\u00f0\u00ea"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\65\3\2\2\2\u00f2"+
		"\u00f3\7\23\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\7"+
		"\5\2\2\u00f6\u00f7\5(\25\2\u00f7\u00f8\7\5\2\2\u00f8\u00f9\5(\25\2\u00f9"+
		"\u00fa\7\5\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7\6\2\2\u00fc\u0112\3\2"+
		"\2\2\u00fd\u00fe\7\24\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\5(\25\2\u0100"+
		"\u0101\7\5\2\2\u0101\u0102\5(\25\2\u0102\u0103\7\5\2\2\u0103\u0104\5("+
		"\25\2\u0104\u0105\7\6\2\2\u0105\u0112\3\2\2\2\u0106\u0107\7\25\2\2\u0107"+
		"\u0108\7\4\2\2\u0108\u0109\5(\25\2\u0109\u010a\7\5\2\2\u010a\u010b\5("+
		"\25\2\u010b\u010c\7\5\2\2\u010c\u010d\5(\25\2\u010d\u010e\7\5\2\2\u010e"+
		"\u010f\5(\25\2\u010f\u0110\7\6\2\2\u0110\u0112\3\2\2\2\u0111\u00f2\3\2"+
		"\2\2\u0111\u00fd\3\2\2\2\u0111\u0106\3\2\2\2\u0112\67\3\2\2\2\u0113\u0114"+
		"\7\36\2\2\u0114\u0115\5\66\34\2\u0115\u0117\5&\24\2\u0116\u0118\7 \2\2"+
		"\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b"+
		"\5:\36\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b9\3\2\2\2\u011c"+
		"\u011d\7(\2\2\u011d\u011e\5(\25\2\u011e;\3\2\2\2\u011f\u0120\5\20\t\2"+
		"\u0120\u0121\7!\2\2\u0121\u0122\5(\25\2\u0122=\3\2\2\2\30ILY`ekwz\177"+
		"\u008c\u0092\u009d\u00a9\u00c7\u00cb\u00cf\u00d7\u00e8\u00f0\u0111\u0117"+
		"\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}