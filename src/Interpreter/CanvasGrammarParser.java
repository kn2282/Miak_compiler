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
		SPACE=8, ENDL=9, AND=10, OR=11, TRUE=12, FALSE=13, RECTANGLE=14, CIRCLE=15, 
		LINE=16, BEGIN=17, END=18, IF=19, ELSE=20, THEN=21, WHILE=22, DEF=23, 
		RGB=24, DRAW=25, BLOCK=26, AssignOperator=27, TopScopeModifier=28, HigherScopeModifier=29, 
		ArithmeticOperator=30, ComprehensionOperator=31, ColorName=32, VariableRef=33;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_block = 2, RULE_instructionChain = 3, 
		RULE_functionName = 4, RULE_variableName = 5, RULE_variableRef = 6, RULE_variable = 7, 
		RULE_functionCall = 8, RULE_functionCallArguments = 9, RULE_arguments = 10, 
		RULE_condition = 11, RULE_functionDefinition = 12, RULE_loop = 13, RULE_color = 14, 
		RULE_expression = 15, RULE_halfExpression = 16, RULE_expressionSuffix = 17, 
		RULE_bool = 18, RULE_boolSrc = 19, RULE_figure = 20, RULE_drawInstruction = 21, 
		RULE_variableOperation = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "block", "instructionChain", "functionName", 
			"variableName", "variableRef", "variable", "functionCall", "functionCallArguments", 
			"arguments", "condition", "functionDefinition", "loop", "color", "expression", 
			"halfExpression", "expressionSuffix", "bool", "boolSrc", "figure", "drawInstruction", 
			"variableOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'BLOCK'", "'='", "'^^'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "VariableName", "Constant", 
			"SPACE", "ENDL", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", 
			"LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", 
			"DRAW", "BLOCK", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"ArithmeticOperator", "ComprehensionOperator", "ColorName", "VariableRef"
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
			setState(46);
			instructionChain();
			setState(47);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				drawInstruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				variableOperation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				block();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(56);
					match(ENDL);
					}
					break;
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
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(BLOCK);
			setState(62);
			match(ENDL);
			setState(63);
			instructionChain();
			setState(64);
			match(END);
			setState(65);
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
		enterRule(_localctx, 6, RULE_instructionChain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((InstructionChainContext)_localctx).instruction = instruction();
			((InstructionChainContext)_localctx).instr.add(((InstructionChainContext)_localctx).instruction);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					match(ENDL);
					setState(69);
					((InstructionChainContext)_localctx).instruction = instruction();
					((InstructionChainContext)_localctx).instr.add(((InstructionChainContext)_localctx).instruction);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENDL) {
				{
				setState(75);
				match(ENDL);
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
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		enterRule(_localctx, 10, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		enterRule(_localctx, 12, RULE_variableRef);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TopScopeModifier:
				_localctx = new TopScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(TopScopeModifier);
				setState(83);
				variableName();
				}
				break;
			case HigherScopeModifier:
				_localctx = new HigherScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(HigherScopeModifier);
				setState(85);
				variableName();
				}
				break;
			case VariableName:
				_localctx = new SameScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			match(VariableRef);
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
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			functionName();
			setState(92);
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
		enterRule(_localctx, 18, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__0);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(95);
				((FunctionCallArgumentsContext)_localctx).expression = expression();
				((FunctionCallArgumentsContext)_localctx).arg.add(((FunctionCallArgumentsContext)_localctx).expression);
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(98);
				match(T__1);
				setState(99);
				((FunctionCallArgumentsContext)_localctx).expression = expression();
				((FunctionCallArgumentsContext)_localctx).arg.add(((FunctionCallArgumentsContext)_localctx).expression);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__2);
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
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__0);
			setState(108);
			((ArgumentsContext)_localctx).variableRef = variableRef();
			((ArgumentsContext)_localctx).arg.add(((ArgumentsContext)_localctx).variableRef);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(109);
				match(T__1);
				setState(110);
				((ArgumentsContext)_localctx).variableRef = variableRef();
				((ArgumentsContext)_localctx).arg.add(((ArgumentsContext)_localctx).variableRef);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__2);
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			bool();
			setState(120);
			match(T__3);
			setState(121);
			match(ENDL);
			setState(122);
			instructionChain();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(123);
				match(ELSE);
				setState(124);
				instructionChain();
				}
			}

			setState(127);
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
		enterRule(_localctx, 24, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(DEF);
			setState(130);
			functionName();
			setState(131);
			arguments();
			setState(132);
			match(ENDL);
			setState(133);
			instructionChain();
			setState(134);
			match(END);
			setState(135);
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
		enterRule(_localctx, 26, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(WHILE);
			setState(138);
			bool();
			setState(139);
			match(ENDL);
			setState(140);
			instructionChain();
			setState(141);
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
		enterRule(_localctx, 28, RULE_color);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ColorName:
				_localctx = new ColorNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(ColorName);
				}
				break;
			case RGB:
				_localctx = new ColorRGBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(RGB);
				setState(145);
				match(T__0);
				setState(146);
				expression();
				setState(147);
				match(T__1);
				setState(148);
				expression();
				setState(149);
				match(T__1);
				setState(150);
				expression();
				setState(151);
				match(T__2);
				}
				break;
			case HexColor:
				_localctx = new ColorHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case ENDL:
			case AND:
			case OR:
			case END:
			case ELSE:
			case ComprehensionOperator:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
			case VariableName:
			case Constant:
			case TopScopeModifier:
			case HigherScopeModifier:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(157);
				halfExpression();
				setState(158);
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
		enterRule(_localctx, 32, RULE_halfExpression);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
			case TopScopeModifier:
			case HigherScopeModifier:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				variableRef();
				}
				break;
			case T__0:
				_localctx = new BracketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__0);
				setState(164);
				expression();
				setState(165);
				match(T__2);
				}
				break;
			case Constant:
				_localctx = new ConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
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
		enterRule(_localctx, 34, RULE_expressionSuffix);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ArithmeticOperator:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ArithmeticOperator);
				setState(171);
				expression();
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case ENDL:
			case AND:
			case OR:
			case END:
			case ELSE:
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
		enterRule(_localctx, 36, RULE_bool);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				boolSrc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(176);
				boolSrc();
				setState(177);
				match(AND);
				setState(178);
				bool();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(180);
				boolSrc();
				setState(181);
				match(OR);
				setState(182);
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
		enterRule(_localctx, 38, RULE_boolSrc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case VariableName:
			case Constant:
			case TopScopeModifier:
			case HigherScopeModifier:
			case ComprehensionOperator:
				{
				{
				setState(186);
				expression();
				setState(187);
				match(ComprehensionOperator);
				setState(188);
				expression();
				}
				}
				break;
			case TRUE:
				{
				setState(190);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(191);
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
		enterRule(_localctx, 40, RULE_figure);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECTANGLE:
				_localctx = new RectangleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(194);
				match(RECTANGLE);
				setState(195);
				match(T__0);
				setState(196);
				expression();
				setState(197);
				match(T__1);
				setState(198);
				expression();
				setState(199);
				match(T__1);
				setState(200);
				expression();
				setState(201);
				match(T__1);
				setState(202);
				expression();
				setState(203);
				match(T__2);
				}
				}
				break;
			case CIRCLE:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(205);
				match(CIRCLE);
				setState(206);
				match(T__0);
				setState(207);
				expression();
				setState(208);
				match(T__1);
				setState(209);
				expression();
				setState(210);
				match(T__1);
				setState(211);
				expression();
				setState(212);
				match(T__2);
				}
				}
				break;
			case LINE:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(214);
				match(LINE);
				setState(215);
				match(T__0);
				setState(216);
				expression();
				setState(217);
				match(T__1);
				setState(218);
				expression();
				setState(219);
				match(T__1);
				setState(220);
				expression();
				setState(221);
				match(T__1);
				setState(222);
				expression();
				setState(223);
				match(T__2);
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
		enterRule(_localctx, 42, RULE_drawInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(DRAW);
			setState(228);
			figure();
			setState(229);
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
		enterRule(_localctx, 44, RULE_variableOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			variableRef();
			setState(232);
			match(AssignOperator);
			setState(233);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\5\3>\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\5\5O\n\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13c\n"+
		"\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7"+
		"\fr\n\f\f\f\16\fu\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u009d\n\20\3\21\3\21\3\21\3\21\5\21\u00a3\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00ab\n\22\3\23\3\23\3\23\5\23\u00b0\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bb\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00c3\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e4\n\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\2\2\u00f1\2\60\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bE\3\2\2\2\n"+
		"P\3\2\2\2\fR\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22]\3\2\2\2\24`\3\2\2\2\26"+
		"m\3\2\2\2\30x\3\2\2\2\32\u0083\3\2\2\2\34\u008b\3\2\2\2\36\u009c\3\2\2"+
		"\2 \u00a2\3\2\2\2\"\u00aa\3\2\2\2$\u00af\3\2\2\2&\u00ba\3\2\2\2(\u00c2"+
		"\3\2\2\2*\u00e3\3\2\2\2,\u00e5\3\2\2\2.\u00e9\3\2\2\2\60\61\5\b\5\2\61"+
		"\62\7\2\2\3\62\3\3\2\2\2\63>\5\34\17\2\64>\5\32\16\2\65>\5\30\r\2\66>"+
		"\5,\27\2\67>\5.\30\28>\5\22\n\29;\5\6\4\2:<\7\13\2\2;:\3\2\2\2;<\3\2\2"+
		"\2<>\3\2\2\2=\63\3\2\2\2=\64\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2=\67\3\2\2"+
		"\2=8\3\2\2\2=9\3\2\2\2>\5\3\2\2\2?@\7\34\2\2@A\7\13\2\2AB\5\b\5\2BC\7"+
		"\24\2\2CD\7\34\2\2D\7\3\2\2\2EJ\5\4\3\2FG\7\13\2\2GI\5\4\3\2HF\3\2\2\2"+
		"IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\7\13\2\2NM\3\2\2"+
		"\2NO\3\2\2\2O\t\3\2\2\2PQ\7\b\2\2Q\13\3\2\2\2RS\7\b\2\2S\r\3\2\2\2TU\7"+
		"\36\2\2UZ\5\f\7\2VW\7\37\2\2WZ\5\f\7\2XZ\5\f\7\2YT\3\2\2\2YV\3\2\2\2Y"+
		"X\3\2\2\2Z\17\3\2\2\2[\\\7#\2\2\\\21\3\2\2\2]^\5\n\6\2^_\5\24\13\2_\23"+
		"\3\2\2\2`b\7\3\2\2ac\5 \21\2ba\3\2\2\2bc\3\2\2\2ch\3\2\2\2de\7\4\2\2e"+
		"g\5 \21\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2"+
		"kl\7\5\2\2l\25\3\2\2\2mn\7\3\2\2ns\5\16\b\2op\7\4\2\2pr\5\16\b\2qo\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5\2\2w\27\3"+
		"\2\2\2xy\7\25\2\2yz\5&\24\2z{\7\6\2\2{|\7\13\2\2|\177\5\b\5\2}~\7\26\2"+
		"\2~\u0080\5\b\5\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\7\24\2\2\u0082\31\3\2\2\2\u0083\u0084\7\31\2\2\u0084\u0085\5\n"+
		"\6\2\u0085\u0086\5\26\f\2\u0086\u0087\7\13\2\2\u0087\u0088\5\b\5\2\u0088"+
		"\u0089\7\24\2\2\u0089\u008a\7\31\2\2\u008a\33\3\2\2\2\u008b\u008c\7\30"+
		"\2\2\u008c\u008d\5&\24\2\u008d\u008e\7\13\2\2\u008e\u008f\5\b\5\2\u008f"+
		"\u0090\7\24\2\2\u0090\35\3\2\2\2\u0091\u009d\7\"\2\2\u0092\u0093\7\32"+
		"\2\2\u0093\u0094\7\3\2\2\u0094\u0095\5 \21\2\u0095\u0096\7\4\2\2\u0096"+
		"\u0097\5 \21\2\u0097\u0098\7\4\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\5"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u009d\7\7\2\2\u009c\u0091\3\2\2\2\u009c"+
		"\u0092\3\2\2\2\u009c\u009b\3\2\2\2\u009d\37\3\2\2\2\u009e\u00a3\3\2\2"+
		"\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\5$\23\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3!\3\2\2\2\u00a4\u00ab\5\16\b\2"+
		"\u00a5\u00a6\7\3\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\7\5\2\2\u00a8\u00ab"+
		"\3\2\2\2\u00a9\u00ab\7\t\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab#\3\2\2\2\u00ac\u00ad\7 \2\2\u00ad\u00b0\5 \21\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0%\3\2\2\2"+
		"\u00b1\u00bb\5(\25\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5"+
		"\5&\24\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\7\r\2\2\u00b8"+
		"\u00b9\5&\24\2\u00b9\u00bb\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2\3\2"+
		"\2\2\u00ba\u00b6\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be"+
		"\7!\2\2\u00be\u00bf\5 \21\2\u00bf\u00c3\3\2\2\2\u00c0\u00c3\7\16\2\2\u00c1"+
		"\u00c3\7\17\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3)\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7"+
		"\5 \21\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\4\2\2\u00ca"+
		"\u00cb\5 \21\2\u00cb\u00cc\7\4\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7\5"+
		"\2\2\u00ce\u00e4\3\2\2\2\u00cf\u00d0\7\21\2\2\u00d0\u00d1\7\3\2\2\u00d1"+
		"\u00d2\5 \21\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\7\4"+
		"\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\7\5\2\2\u00d7\u00e4\3\2\2\2\u00d8"+
		"\u00d9\7\22\2\2\u00d9\u00da\7\3\2\2\u00da\u00db\5 \21\2\u00db\u00dc\7"+
		"\4\2\2\u00dc\u00dd\5 \21\2\u00dd\u00de\7\4\2\2\u00de\u00df\5 \21\2\u00df"+
		"\u00e0\7\4\2\2\u00e0\u00e1\5 \21\2\u00e1\u00e2\7\5\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00c4\3\2\2\2\u00e3\u00cf\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e4"+
		"+\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\5*\26\2\u00e7\u00e8\5\36\20"+
		"\2\u00e8-\3\2\2\2\u00e9\u00ea\5\16\b\2\u00ea\u00eb\7\35\2\2\u00eb\u00ec"+
		"\5 \21\2\u00ec/\3\2\2\2\22;=JNYbhs\177\u009c\u00a2\u00aa\u00af\u00ba\u00c2"+
		"\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}