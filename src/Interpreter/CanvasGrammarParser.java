package Interpreter;// Generated from C:/Materia³y/MIAK/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, HexColor=5, Integer=6, Float=7, VariableName=8, 
		SPACE=9, ENDL=10, COMMENT=11, AND=12, OR=13, TRUE=14, FALSE=15, RECTANGLE=16, 
		CIRCLE=17, LINE=18, BEGIN=19, END=20, IF=21, ELSE=22, THEN=23, WHILE=24, 
		DEF=25, RGB=26, DRAW=27, BLOCK=28, FILL=29, AssignOperator=30, TopScopeModifier=31, 
		HigherScopeModifier=32, Minus=33, Plus=34, Mult=35, Divide=36, ROTATED=37, 
		ComprehensionOperator=38, ColorName=39;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_block = 2, RULE_instructionChain = 3, 
		RULE_functionName = 4, RULE_variableName = 5, RULE_variableRef = 6, RULE_variable = 7, 
		RULE_constant = 8, RULE_nonPriorityArithmeticOperator = 9, RULE_priorityArithmeticOperator = 10, 
		RULE_functionCall = 11, RULE_functionCallArguments = 12, RULE_arguments = 13, 
		RULE_condition = 14, RULE_functionDefinition = 15, RULE_loop = 16, RULE_color = 17, 
		RULE_expression = 18, RULE_priorityExpression = 19, RULE_halfExpression = 20, 
		RULE_priorityExpressionSuffix = 21, RULE_expressionSuffix = 22, RULE_bool = 23, 
		RULE_boolSrc = 24, RULE_figure = 25, RULE_drawInstruction = 26, RULE_rotation = 27, 
		RULE_variableOperation = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "block", "instructionChain", "functionName", 
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
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, null, "'CIRCLE'", "'LINE'", "'BEGIN'", 
			"'END'", null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", "'BLOCK'", 
			"'FILL'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'", "'ROTATED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "Integer", "Float", "VariableName", 
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			instructionChain();
			setState(59);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				drawInstruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				variableOperation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				block();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(68);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BLOCK);
			setState(74);
			match(ENDL);
			setState(75);
			instructionChain();
			setState(76);
			match(END);
			setState(77);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitInstructionChain(this);
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(79);
				match(ENDL);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			((InstructionChainContext)_localctx).instruction = instruction();
			((InstructionChainContext)_localctx).instr.add(((InstructionChainContext)_localctx).instruction);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(86);
						match(ENDL);
						}
						}
						setState(89); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==ENDL );
					setState(91);
					((InstructionChainContext)_localctx).instruction = instruction();
					((InstructionChainContext)_localctx).instr.add(((InstructionChainContext)_localctx).instruction);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(97);
				match(ENDL);
				}
				}
				setState(102);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitHigherScopeVar(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitTopScopeVar(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitSameScopeVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableRef);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TopScopeModifier:
				_localctx = new TopScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(TopScopeModifier);
				setState(108);
				variableName();
				}
				break;
			case HigherScopeModifier:
				_localctx = new HigherScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(HigherScopeModifier);
				setState(110);
				variableName();
				}
				break;
			case VariableName:
				_localctx = new SameScopeVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus) {
				{
				setState(114);
				match(Minus);
				}
			}

			setState(117);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitNonPriorityArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonPriorityArithmeticOperatorContext nonPriorityArithmeticOperator() throws RecognitionException {
		NonPriorityArithmeticOperatorContext _localctx = new NonPriorityArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonPriorityArithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitPriorityArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityArithmeticOperatorContext priorityArithmeticOperator() throws RecognitionException {
		PriorityArithmeticOperatorContext _localctx = new PriorityArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_priorityArithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			functionName();
			setState(129);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCallArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__0);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Integer) | (1L << Float) | (1L << VariableName) | (1L << TopScopeModifier) | (1L << HigherScopeModifier) | (1L << Minus))) != 0)) {
				{
				setState(132);
				((FunctionCallArgumentsContext)_localctx).expression = expression();
				((FunctionCallArgumentsContext)_localctx).arg.add(((FunctionCallArgumentsContext)_localctx).expression);
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(135);
				match(T__1);
				setState(136);
				((FunctionCallArgumentsContext)_localctx).expression = expression();
				((FunctionCallArgumentsContext)_localctx).arg.add(((FunctionCallArgumentsContext)_localctx).expression);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__0);
			setState(145);
			((ArgumentsContext)_localctx).variableRef = variableRef();
			((ArgumentsContext)_localctx).arg.add(((ArgumentsContext)_localctx).variableRef);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(146);
				match(T__1);
				setState(147);
				((ArgumentsContext)_localctx).variableRef = variableRef();
				((ArgumentsContext)_localctx).arg.add(((ArgumentsContext)_localctx).variableRef);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IF);
			setState(156);
			bool();
			setState(157);
			match(T__3);
			setState(158);
			match(ENDL);
			setState(159);
			instructionChain();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(160);
				match(ELSE);
				setState(161);
				instructionChain();
				}
			}

			setState(164);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DEF);
			setState(167);
			functionName();
			setState(168);
			arguments();
			setState(169);
			match(ENDL);
			setState(170);
			instructionChain();
			setState(171);
			match(END);
			setState(172);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(WHILE);
			setState(175);
			bool();
			setState(176);
			match(T__3);
			setState(177);
			match(ENDL);
			setState(178);
			instructionChain();
			setState(179);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColorRGB(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColorHex(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitColorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_color);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ColorName:
				_localctx = new ColorNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ColorName);
				}
				break;
			case RGB:
				_localctx = new ColorRGBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(RGB);
				setState(183);
				match(T__0);
				setState(184);
				expression();
				setState(185);
				match(T__1);
				setState(186);
				expression();
				setState(187);
				match(T__1);
				setState(188);
				expression();
				setState(189);
				match(T__2);
				}
				break;
			case HexColor:
				_localctx = new ColorHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			priorityExpression();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Minus || _la==Plus) {
				{
				setState(195);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitPriorityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityExpressionContext priorityExpression() throws RecognitionException {
		PriorityExpressionContext _localctx = new PriorityExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_priorityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			halfExpression();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mult || _la==Divide) {
				{
				setState(199);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBracketExpression(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitConstantExpression(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HalfExpressionContext halfExpression() throws RecognitionException {
		HalfExpressionContext _localctx = new HalfExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_halfExpression);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				variable();
				}
				break;
			case 2:
				_localctx = new BracketExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__0);
				setState(204);
				expression();
				setState(205);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new ConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitPriorityExpressionSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityExpressionSuffixContext priorityExpressionSuffix() throws RecognitionException {
		PriorityExpressionSuffixContext _localctx = new PriorityExpressionSuffixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_priorityExpressionSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			priorityArithmeticOperator();
			setState(211);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitExpressionSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSuffixContext expressionSuffix() throws RecognitionException {
		ExpressionSuffixContext _localctx = new ExpressionSuffixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			nonPriorityArithmeticOperator();
			setState(214);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				boolSrc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(217);
				boolSrc();
				setState(218);
				match(AND);
				setState(219);
				bool();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(221);
				boolSrc();
				setState(222);
				match(OR);
				setState(223);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitBoolSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSrcContext boolSrc() throws RecognitionException {
		BoolSrcContext _localctx = new BoolSrcContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolSrc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Integer:
			case Float:
			case VariableName:
			case TopScopeModifier:
			case HigherScopeModifier:
			case Minus:
				{
				{
				setState(227);
				expression();
				setState(228);
				match(ComprehensionOperator);
				setState(229);
				expression();
				}
				}
				break;
			case TRUE:
				{
				setState(231);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(232);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitLine(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitCircle(this);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_figure);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECTANGLE:
				_localctx = new RectangleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(235);
				match(RECTANGLE);
				setState(236);
				match(T__0);
				setState(237);
				expression();
				setState(238);
				match(T__1);
				setState(239);
				expression();
				setState(240);
				match(T__1);
				setState(241);
				expression();
				setState(242);
				match(T__1);
				setState(243);
				expression();
				setState(244);
				match(T__2);
				}
				}
				break;
			case CIRCLE:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(246);
				match(CIRCLE);
				setState(247);
				match(T__0);
				setState(248);
				expression();
				setState(249);
				match(T__1);
				setState(250);
				expression();
				setState(251);
				match(T__1);
				setState(252);
				expression();
				setState(253);
				match(T__2);
				}
				}
				break;
			case LINE:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(255);
				match(LINE);
				setState(256);
				match(T__0);
				setState(257);
				expression();
				setState(258);
				match(T__1);
				setState(259);
				expression();
				setState(260);
				match(T__1);
				setState(261);
				expression();
				setState(262);
				match(T__1);
				setState(263);
				expression();
				setState(264);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitDrawInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawInstructionContext drawInstruction() throws RecognitionException {
		DrawInstructionContext _localctx = new DrawInstructionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_drawInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(DRAW);
			setState(269);
			figure();
			setState(270);
			color();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILL) {
				{
				setState(271);
				match(FILL);
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROTATED) {
				{
				setState(274);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitRotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotationContext rotation() throws RecognitionException {
		RotationContext _localctx = new RotationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ROTATED);
			setState(278);
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
			if ( visitor instanceof CanvasGrammarVisitor) return ((CanvasGrammarVisitor<? extends T>)visitor).visitVariableOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOperationContext variableOperation() throws RecognitionException {
		VariableOperationContext _localctx = new VariableOperationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			variableRef();
			setState(281);
			match(AssignOperator);
			setState(282);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\6\5Z\n\5\r\5\16\5[\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bs\n\b\3\t\5\tv\n\t\3\t\3\t\3\n\5\n{\n\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\5\16\u0088\n\16\3\16\3\16\7\16\u008c\n\16\f\16"+
		"\16\16\u008f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0097\n\17\f\17"+
		"\16\17\u009a\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a5"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00c3\n\23\3\24\3\24\5\24\u00c7\n\24\3\25\3\25\5\25\u00cb\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d3\n\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e4\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ec\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010d"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u0113\n\34\3\34\5\34\u0116\n\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2\b\t\3\2#$\3\2%&\2\u0122\2<\3"+
		"\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bT\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16r\3\2"+
		"\2\2\20u\3\2\2\2\22z\3\2\2\2\24~\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2"+
		"\2\2\32\u0085\3\2\2\2\34\u0092\3\2\2\2\36\u009d\3\2\2\2 \u00a8\3\2\2\2"+
		"\"\u00b0\3\2\2\2$\u00c2\3\2\2\2&\u00c4\3\2\2\2(\u00c8\3\2\2\2*\u00d2\3"+
		"\2\2\2,\u00d4\3\2\2\2.\u00d7\3\2\2\2\60\u00e3\3\2\2\2\62\u00eb\3\2\2\2"+
		"\64\u010c\3\2\2\2\66\u010e\3\2\2\28\u0117\3\2\2\2:\u011a\3\2\2\2<=\5\b"+
		"\5\2=>\7\2\2\3>\3\3\2\2\2?J\5\"\22\2@J\5 \21\2AJ\5\36\20\2BJ\5\66\34\2"+
		"CJ\5:\36\2DJ\5\30\r\2EG\5\6\4\2FH\7\f\2\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2"+
		"\2I?\3\2\2\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2"+
		"\2J\5\3\2\2\2KL\7\36\2\2LM\7\f\2\2MN\5\b\5\2NO\7\26\2\2OP\7\36\2\2P\7"+
		"\3\2\2\2QS\7\f\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2V"+
		"T\3\2\2\2W`\5\4\3\2XZ\7\f\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\]\3\2\2\2]_\5\4\3\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2"+
		"\2b`\3\2\2\2ce\7\f\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2"+
		"\2\2hf\3\2\2\2ij\7\n\2\2j\13\3\2\2\2kl\7\n\2\2l\r\3\2\2\2mn\7!\2\2ns\5"+
		"\f\7\2op\7\"\2\2ps\5\f\7\2qs\5\f\7\2rm\3\2\2\2ro\3\2\2\2rq\3\2\2\2s\17"+
		"\3\2\2\2tv\7#\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\16\b\2x\21\3\2\2\2"+
		"y{\7#\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\t\2\2\2}\23\3\2\2\2~\177\t\3"+
		"\2\2\177\25\3\2\2\2\u0080\u0081\t\4\2\2\u0081\27\3\2\2\2\u0082\u0083\5"+
		"\n\6\2\u0083\u0084\5\32\16\2\u0084\31\3\2\2\2\u0085\u0087\7\3\2\2\u0086"+
		"\u0088\5&\24\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008d\3\2"+
		"\2\2\u0089\u008a\7\4\2\2\u008a\u008c\5&\24\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\5\2\2\u0091\33\3\2\2\2\u0092\u0093"+
		"\7\3\2\2\u0093\u0098\5\16\b\2\u0094\u0095\7\4\2\2\u0095\u0097\5\16\b\2"+
		"\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\5\2\2\u009c"+
		"\35\3\2\2\2\u009d\u009e\7\27\2\2\u009e\u009f\5\60\31\2\u009f\u00a0\7\6"+
		"\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a4\5\b\5\2\u00a2\u00a3\7\30\2\2\u00a3"+
		"\u00a5\5\b\5\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\7\26\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\33\2\2\u00a9"+
		"\u00aa\5\n\6\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\5"+
		"\b\5\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\33\2\2\u00af!\3\2\2\2\u00b0"+
		"\u00b1\7\32\2\2\u00b1\u00b2\5\60\31\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4"+
		"\7\f\2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\7\26\2\2\u00b6#\3\2\2\2\u00b7"+
		"\u00c3\7)\2\2\u00b8\u00b9\7\34\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\5&"+
		"\24\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\4\2\2\u00be"+
		"\u00bf\5&\24\2\u00bf\u00c0\7\5\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c3\7\7"+
		"\2\2\u00c2\u00b7\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"%\3\2\2\2\u00c4\u00c6\5(\25\2\u00c5\u00c7\5.\30\2\u00c6\u00c5\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00ca\5*\26\2\u00c9\u00cb\5"+
		",\27\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb)\3\2\2\2\u00cc\u00d3"+
		"\5\20\t\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7\5\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5\22\n\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd"+
		"\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3+\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5"+
		"\u00d6\5(\25\2\u00d6-\3\2\2\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\5&\24"+
		"\2\u00d9/\3\2\2\2\u00da\u00e4\5\62\32\2\u00db\u00dc\5\62\32\2\u00dc\u00dd"+
		"\7\16\2\2\u00dd\u00de\5\60\31\2\u00de\u00e4\3\2\2\2\u00df\u00e0\5\62\32"+
		"\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\61\3\2\2"+
		"\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7(\2\2\u00e7\u00e8\5&\24\2\u00e8\u00ec"+
		"\3\2\2\2\u00e9\u00ec\7\20\2\2\u00ea\u00ec\7\21\2\2\u00eb\u00e5\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\63\3\2\2\2\u00ed\u00ee"+
		"\7\22\2\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\5&\24\2\u00f0\u00f1\7\4\2\2"+
		"\u00f1\u00f2\5&\24\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\5&\24\2\u00f4\u00f5"+
		"\7\4\2\2\u00f5\u00f6\5&\24\2\u00f6\u00f7\7\5\2\2\u00f7\u010d\3\2\2\2\u00f8"+
		"\u00f9\7\23\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc\7"+
		"\4\2\2\u00fc\u00fd\5&\24\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\5&\24\2\u00ff"+
		"\u0100\7\5\2\2\u0100\u010d\3\2\2\2\u0101\u0102\7\24\2\2\u0102\u0103\7"+
		"\3\2\2\u0103\u0104\5&\24\2\u0104\u0105\7\4\2\2\u0105\u0106\5&\24\2\u0106"+
		"\u0107\7\4\2\2\u0107\u0108\5&\24\2\u0108\u0109\7\4\2\2\u0109\u010a\5&"+
		"\24\2\u010a\u010b\7\5\2\2\u010b\u010d\3\2\2\2\u010c\u00ed\3\2\2\2\u010c"+
		"\u00f8\3\2\2\2\u010c\u0101\3\2\2\2\u010d\65\3\2\2\2\u010e\u010f\7\35\2"+
		"\2\u010f\u0110\5\64\33\2\u0110\u0112\5$\23\2\u0111\u0113\7\37\2\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\58"+
		"\35\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\67\3\2\2\2\u0117\u0118"+
		"\7\'\2\2\u0118\u0119\5&\24\2\u01199\3\2\2\2\u011a\u011b\5\16\b\2\u011b"+
		"\u011c\7 \2\2\u011c\u011d\5&\24\2\u011d;\3\2\2\2\30GIT[`fruz\u0087\u008d"+
		"\u0098\u00a4\u00c2\u00c6\u00ca\u00d2\u00e3\u00eb\u010c\u0112\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}