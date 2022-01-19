package Interpreter;// Generated from C:/Materia³y/MIAK/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CanvasGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "Float", "VariableName", "SPACE", "ENDL", 
			"COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", 
			"BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", 
			"BLOCK", "FILL", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"Minus", "Plus", "Mult", "Divide", "ROTATED", "ComprehensionOperator", 
			"ColorName"
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


	public CanvasGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CanvasGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bi"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13w\n\13\f\13"+
		"\16\13z\13\13\3\13\5\13}\n\13\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084\13"+
		"\f\3\f\5\f\u0087\n\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\f"+
		"\5\f\u0092\n\f\3\r\5\r\u0095\n\r\3\r\7\r\u0098\n\r\f\r\16\r\u009b\13\r"+
		"\3\16\6\16\u009e\n\16\r\16\16\16\u009f\3\16\3\16\3\17\5\17\u00a5\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00ad\n\20\f\20\16\20\u00b0\13\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22\3\22"+
		"\5\22\u00bf\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d5\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u00fc\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0103\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u011a\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u014c\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u016a\n,\2\2-\3"+
		"\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31\n\33\13\35\f\37\r"+
		"!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34"+
		"?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)\3\2\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3"+
		"\2\62;\4\2aac|\6\2\62;C\\aac|\4\2\13\13\"\u0080\2\u0184\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2"+
		"\13a\3\2\2\2\rc\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25|\3\2\2"+
		"\2\27\u0086\3\2\2\2\31\u0094\3\2\2\2\33\u009d\3\2\2\2\35\u00a4\3\2\2\2"+
		"\37\u00a8\3\2\2\2!\u00b9\3\2\2\2#\u00be\3\2\2\2%\u00c8\3\2\2\2\'\u00d4"+
		"\3\2\2\2)\u00d6\3\2\2\2+\u00e0\3\2\2\2-\u00e7\3\2\2\2/\u00ec\3\2\2\2\61"+
		"\u00f2\3\2\2\2\63\u00fb\3\2\2\2\65\u0102\3\2\2\2\67\u0104\3\2\2\29\u0109"+
		"\3\2\2\2;\u010f\3\2\2\2=\u0119\3\2\2\2?\u011b\3\2\2\2A\u0120\3\2\2\2C"+
		"\u0126\3\2\2\2E\u012b\3\2\2\2G\u012d\3\2\2\2I\u0130\3\2\2\2K\u0132\3\2"+
		"\2\2M\u0134\3\2\2\2O\u0136\3\2\2\2Q\u0138\3\2\2\2S\u013a\3\2\2\2U\u014b"+
		"\3\2\2\2W\u0169\3\2\2\2YZ\7*\2\2Z\4\3\2\2\2[\\\7.\2\2\\\6\3\2\2\2]^\7"+
		"+\2\2^\b\3\2\2\2_`\7<\2\2`\n\3\2\2\2ab\t\2\2\2b\f\3\2\2\2cd\t\3\2\2d\16"+
		"\3\2\2\2ei\7%\2\2fg\7\62\2\2gi\t\4\2\2he\3\2\2\2hf\3\2\2\2i\20\3\2\2\2"+
		"jk\t\5\2\2k\22\3\2\2\2lm\5\17\b\2mn\5\r\7\2no\5\r\7\2op\5\r\7\2pq\5\r"+
		"\7\2qr\5\r\7\2rs\5\r\7\2s\24\3\2\2\2tx\5\13\6\2uw\5\21\t\2vu\3\2\2\2w"+
		"z\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}\3\2\2\2zx\3\2\2\2{}\7\62\2\2|t\3\2\2\2"+
		"|{\3\2\2\2}\26\3\2\2\2~\u0082\5\13\6\2\177\u0081\5\21\t\2\u0080\177\3"+
		"\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0087\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7\62\2\2\u0086~\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0091\7\60\2\2\u0089\u008d"+
		"\5\13\6\2\u008a\u008c\5\21\t\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0092\7\62\2\2\u0091\u0089\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\30\3\2\2\2\u0093\u0095\t\6\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0099\3\2\2\2\u0096\u0098\t\7\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\32\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009c\u009e\7\"\2\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\b\16\2\2\u00a2\34\3\2\2\2\u00a3\u00a5\7\17\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7"+
		"\36\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\3\2"+
		"\2\2\u00ab\u00ad\t\b\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\5\35\17\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\20\2\2\u00b4"+
		" \3\2\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7P\2\2\u00b7\u00ba\7F\2\2\u00b8"+
		"\u00ba\7(\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\"\3\2\2\2"+
		"\u00bb\u00bc\7Q\2\2\u00bc\u00bf\7T\2\2\u00bd\u00bf\7~\2\2\u00be\u00bb"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7V\2\2\u00c1\u00c2"+
		"\7T\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c9\7G\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c9\7g\2\2\u00c8\u00c0\3\2\2"+
		"\2\u00c8\u00c4\3\2\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7H\2\2\u00cb\u00cc\7"+
		"C\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce\7U\2\2\u00ce\u00d5\7G\2\2\u00cf\u00d0"+
		"\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"\u00d5\7g\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5(\3\2\2\2\u00d6"+
		"\u00d7\7T\2\2\u00d7\u00d8\7G\2\2\u00d8\u00d9\7E\2\2\u00d9\u00da\7V\2\2"+
		"\u00da\u00db\7C\2\2\u00db\u00dc\7P\2\2\u00dc\u00dd\7I\2\2\u00dd\u00de"+
		"\7N\2\2\u00de\u00df\7G\2\2\u00df*\3\2\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e2"+
		"\7K\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7E\2\2\u00e4\u00e5\7N\2\2\u00e5"+
		"\u00e6\7G\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7N\2\2\u00e8\u00e9\7K\2\2\u00e9"+
		"\u00ea\7P\2\2\u00ea\u00eb\7G\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7D\2\2\u00ed"+
		"\u00ee\7G\2\2\u00ee\u00ef\7I\2\2\u00ef\u00f0\7K\2\2\u00f0\u00f1\7P\2\2"+
		"\u00f1\60\3\2\2\2\u00f2\u00f3\7G\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5\7"+
		"F\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7K\2\2\u00f7\u00fc\7H\2\2\u00f8\u00f9"+
		"\7k\2\2\u00f9\u00fc\7h\2\2\u00fa\u00fc\7A\2\2\u00fb\u00f6\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\64\3\2\2\2\u00fd\u0103\7#\2\2"+
		"\u00fe\u00ff\7G\2\2\u00ff\u0100\7N\2\2\u0100\u0101\7U\2\2\u0101\u0103"+
		"\7G\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\66\3\2\2\2\u0104"+
		"\u0105\7V\2\2\u0105\u0106\7J\2\2\u0106\u0107\7G\2\2\u0107\u0108\7P\2\2"+
		"\u01088\3\2\2\2\u0109\u010a\7Y\2\2\u010a\u010b\7J\2\2\u010b\u010c\7K\2"+
		"\2\u010c\u010d\7N\2\2\u010d\u010e\7G\2\2\u010e:\3\2\2\2\u010f\u0110\7"+
		"F\2\2\u0110\u0111\7G\2\2\u0111\u0112\7H\2\2\u0112<\3\2\2\2\u0113\u0114"+
		"\7T\2\2\u0114\u0115\7I\2\2\u0115\u011a\7D\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7i\2\2\u0118\u011a\7d\2\2\u0119\u0113\3\2\2\2\u0119\u0116\3\2\2"+
		"\2\u011a>\3\2\2\2\u011b\u011c\7F\2\2\u011c\u011d\7T\2\2\u011d\u011e\7"+
		"C\2\2\u011e\u011f\7Y\2\2\u011f@\3\2\2\2\u0120\u0121\7D\2\2\u0121\u0122"+
		"\7N\2\2\u0122\u0123\7Q\2\2\u0123\u0124\7E\2\2\u0124\u0125\7M\2\2\u0125"+
		"B\3\2\2\2\u0126\u0127\7H\2\2\u0127\u0128\7K\2\2\u0128\u0129\7N\2\2\u0129"+
		"\u012a\7N\2\2\u012aD\3\2\2\2\u012b\u012c\7?\2\2\u012cF\3\2\2\2\u012d\u012e"+
		"\7`\2\2\u012e\u012f\7`\2\2\u012fH\3\2\2\2\u0130\u0131\7`\2\2\u0131J\3"+
		"\2\2\2\u0132\u0133\7/\2\2\u0133L\3\2\2\2\u0134\u0135\7-\2\2\u0135N\3\2"+
		"\2\2\u0136\u0137\7,\2\2\u0137P\3\2\2\2\u0138\u0139\7\61\2\2\u0139R\3\2"+
		"\2\2\u013a\u013b\7T\2\2\u013b\u013c\7Q\2\2\u013c\u013d\7V\2\2\u013d\u013e"+
		"\7C\2\2\u013e\u013f\7V\2\2\u013f\u0140\7G\2\2\u0140\u0141\7F\2\2\u0141"+
		"T\3\2\2\2\u0142\u0143\7?\2\2\u0143\u014c\7?\2\2\u0144\u014c\7>\2\2\u0145"+
		"\u0146\7>\2\2\u0146\u014c\7?\2\2\u0147\u014c\7@\2\2\u0148\u0149\7@\2\2"+
		"\u0149\u014c\7?\2\2\u014a\u014c\7\u0080\2\2\u014b\u0142\3\2\2\2\u014b"+
		"\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014cV\3\2\2\2\u014d\u014e\7T\2\2\u014e\u014f"+
		"\7G\2\2\u014f\u016a\7F\2\2\u0150\u0151\7D\2\2\u0151\u0152\7N\2\2\u0152"+
		"\u0153\7W\2\2\u0153\u016a\7G\2\2\u0154\u0155\7[\2\2\u0155\u0156\7G\2\2"+
		"\u0156\u0157\7N\2\2\u0157\u0158\7N\2\2\u0158\u0159\7Q\2\2\u0159\u016a"+
		"\7Y\2\2\u015a\u015b\7I\2\2\u015b\u015c\7T\2\2\u015c\u015d\7G\2\2\u015d"+
		"\u015e\7G\2\2\u015e\u016a\7P\2\2\u015f\u0160\7Y\2\2\u0160\u0161\7J\2\2"+
		"\u0161\u0162\7K\2\2\u0162\u0163\7V\2\2\u0163\u016a\7G\2\2\u0164\u0165"+
		"\7D\2\2\u0165\u0166\7N\2\2\u0166\u0167\7C\2\2\u0167\u0168\7E\2\2\u0168"+
		"\u016a\7M\2\2\u0169\u014d\3\2\2\2\u0169\u0150\3\2\2\2\u0169\u0154\3\2"+
		"\2\2\u0169\u015a\3\2\2\2\u0169\u015f\3\2\2\2\u0169\u0164\3\2\2\2\u016a"+
		"X\3\2\2\2\31\2hx|\u0082\u0086\u008d\u0091\u0094\u0097\u0099\u009f\u00a4"+
		"\u00ae\u00b9\u00be\u00c8\u00d4\u00fb\u0102\u0119\u014b\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}