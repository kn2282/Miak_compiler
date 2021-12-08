// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package Interpreter;
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
		T__0=1, T__1=2, T__2=3, T__3=4, HexColor=5, VariableName=6, Constant=7, 
		SPACE=8, ENDL=9, AND=10, OR=11, TRUE=12, FALSE=13, RECTANGLE=14, CIRCLE=15, 
		LINE=16, BEGIN=17, END=18, IF=19, ELSE=20, THEN=21, WHILE=22, DEF=23, 
		RGB=24, DRAW=25, BLOCK=26, AssignOperator=27, TopScopeModifier=28, HigherScopeModifier=29, 
		ArithmeticOperator=30, ComprehensionOperator=31, ColorName=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "VariableName", "Constant", "SPACE", 
			"ENDL", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", 
			"BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", 
			"BLOCK", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"ArithmeticOperator", "ComprehensionOperator", "ColorName"
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
			"ArithmeticOperator", "ComprehensionOperator", "ColorName"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\5\fq\n\f\3\f\7\ft\n"+
		"\f\f\f\16\fw\13\f\3\r\3\r\3\16\6\16|\n\16\r\16\16\16}\3\16\3\16\3\17\5"+
		"\17\u0083\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u008b\n\20\3\20\6\20"+
		"\u008e\n\20\r\20\16\20\u008f\3\21\3\21\3\21\5\21\u0095\n\21\3\21\6\21"+
		"\u0098\n\21\r\21\16\21\u0099\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00a4\n\22\3\22\6\22\u00a7\n\22\r\22\16\22\u00a8\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b5\n\23\3\23\6\23\u00b8\n\23"+
		"\r\23\16\23\u00b9\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u00c7\n\24\f\24\16\24\u00ca\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u00d4\n\25\f\25\16\25\u00d7\13\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00df\n\26\f\26\16\26\u00e2\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\6\27\u00eb\n\27\r\27\16\27\u00ec\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00fe\n\31\3\31\6\31\u0101\n\31\r\31\16\31\u0102\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u010a\n\32\3\32\6\32\u010d\n\32\r\32\16\32\u010e\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0117\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0120\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0127\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u012f\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0137\n\37\f\37\16\37\u013a\13\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0154\n%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\5&\u0172\n&\2\2\'\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\2\27"+
		"\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65"+
		"\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"\3\2\t\3\2\63;\5\2\62;CHc"+
		"h\4\2ZZzz\3\2\62;\4\2aac|\6\2\62;C\\aac|\5\2,-//\61\61\2\u0193\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3"+
		"\2\2\2\rW\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25h\3\2\2\2\27"+
		"p\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35\u0082\3\2\2\2\37\u008a\3\2\2\2!\u0094"+
		"\3\2\2\2#\u00a3\3\2\2\2%\u00b4\3\2\2\2\'\u00bb\3\2\2\2)\u00cb\3\2\2\2"+
		"+\u00d8\3\2\2\2-\u00e3\3\2\2\2/\u00ee\3\2\2\2\61\u00fd\3\2\2\2\63\u0109"+
		"\3\2\2\2\65\u0110\3\2\2\2\67\u0118\3\2\2\29\u0121\3\2\2\2;\u012e\3\2\2"+
		"\2=\u0130\3\2\2\2?\u013b\3\2\2\2A\u0141\3\2\2\2C\u0143\3\2\2\2E\u0146"+
		"\3\2\2\2G\u0148\3\2\2\2I\u0153\3\2\2\2K\u0171\3\2\2\2MN\7*\2\2N\4\3\2"+
		"\2\2OP\7.\2\2P\6\3\2\2\2QR\7+\2\2R\b\3\2\2\2ST\7<\2\2T\n\3\2\2\2UV\t\2"+
		"\2\2V\f\3\2\2\2WX\t\3\2\2X\16\3\2\2\2Y]\7%\2\2Z[\7\62\2\2[]\t\4\2\2\\"+
		"Y\3\2\2\2\\Z\3\2\2\2]\20\3\2\2\2^_\t\5\2\2_\22\3\2\2\2`a\5\17\b\2ab\5"+
		"\r\7\2bc\5\r\7\2cd\5\r\7\2de\5\r\7\2ef\5\r\7\2fg\5\r\7\2g\24\3\2\2\2h"+
		"l\5\13\6\2ik\5\21\t\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\26\3\2"+
		"\2\2nl\3\2\2\2oq\t\6\2\2po\3\2\2\2qu\3\2\2\2rt\t\7\2\2sr\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v\30\3\2\2\2wu\3\2\2\2xy\5\25\13\2y\32\3\2\2\2"+
		"z|\7\"\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\b\16\2\2\u0080\34\3\2\2\2\u0081\u0083\7\17\2\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\f\2\2\u0085\36\3\2\2"+
		"\2\u0086\u0087\7C\2\2\u0087\u0088\7P\2\2\u0088\u008b\7F\2\2\u0089\u008b"+
		"\7(\2\2\u008a\u0086\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008e\5\33\16\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090 \3\2\2\2\u0091\u0092\7Q\2\2\u0092\u0095"+
		"\7T\2\2\u0093\u0095\7~\2\2\u0094\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0098\5\33\16\2\u0097\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\"\3\2\2\2\u009b\u009c"+
		"\7V\2\2\u009c\u009d\7T\2\2\u009d\u009e\7W\2\2\u009e\u00a4\7G\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a4\7g\2\2"+
		"\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7"+
		"\5\33\16\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\7C"+
		"\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7U\2\2\u00ae\u00b5\7G\2\2\u00af\u00b0"+
		"\7h\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b5\7g\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b8\5\33\16\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7T\2\2\u00bc"+
		"\u00bd\7G\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7V\2\2\u00bf\u00c0\7C\2\2"+
		"\u00c0\u00c1\7P\2\2\u00c1\u00c2\7I\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c4"+
		"\7G\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\5\33\16\2\u00c6\u00c5\3\2\2\2"+
		"\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9(\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\7K\2\2\u00cd"+
		"\u00ce\7T\2\2\u00ce\u00cf\7E\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7G\2\2"+
		"\u00d1\u00d5\3\2\2\2\u00d2\u00d4\5\33\16\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6*\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7N\2\2\u00d9\u00da\7K\2\2\u00da\u00db\7P\2"+
		"\2\u00db\u00dc\7G\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\5\33\16\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1,\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e5"+
		"\7G\2\2\u00e5\u00e6\7I\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7P\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00eb\5\33\16\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed.\3\2\2\2\u00ee\u00ef"+
		"\7G\2\2\u00ef\u00f0\7P\2\2\u00f0\u00f1\7F\2\2\u00f1\u00f5\3\2\2\2\u00f2"+
		"\u00f4\5\33\16\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\60\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7K\2\2\u00f9\u00fe\7H\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fe\7h\2\2"+
		"\u00fc\u00fe\7A\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u0101\5\33\16\2\u0100\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\62"+
		"\3\2\2\2\u0104\u010a\7#\2\2\u0105\u0106\7G\2\2\u0106\u0107\7N\2\2\u0107"+
		"\u0108\7U\2\2\u0108\u010a\7G\2\2\u0109\u0104\3\2\2\2\u0109\u0105\3\2\2"+
		"\2\u010a\u010c\3\2\2\2\u010b\u010d\5\33\16\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\64\3\2\2"+
		"\2\u0110\u0111\7V\2\2\u0111\u0112\7J\2\2\u0112\u0113\7G\2\2\u0113\u0114"+
		"\7P\2\2\u0114\u0116\3\2\2\2\u0115\u0117\5\33\16\2\u0116\u0115\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\66\3\2\2\2\u0118\u0119\7Y\2\2\u0119\u011a\7"+
		"J\2\2\u011a\u011b\7K\2\2\u011b\u011c\7N\2\2\u011c\u011d\7G\2\2\u011d\u011f"+
		"\3\2\2\2\u011e\u0120\5\33\16\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2"+
		"\u01208\3\2\2\2\u0121\u0122\7F\2\2\u0122\u0123\7G\2\2\u0123\u0124\7H\2"+
		"\2\u0124\u0126\3\2\2\2\u0125\u0127\5\33\16\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127:\3\2\2\2\u0128\u0129\7T\2\2\u0129\u012a\7I\2\2\u012a"+
		"\u012f\7D\2\2\u012b\u012c\7t\2\2\u012c\u012d\7i\2\2\u012d\u012f\7d\2\2"+
		"\u012e\u0128\3\2\2\2\u012e\u012b\3\2\2\2\u012f<\3\2\2\2\u0130\u0131\7"+
		"F\2\2\u0131\u0132\7T\2\2\u0132\u0133\7C\2\2\u0133\u0134\7Y\2\2\u0134\u0138"+
		"\3\2\2\2\u0135\u0137\5\33\16\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139>\3\2\2\2\u013a\u0138\3"+
		"\2\2\2\u013b\u013c\7D\2\2\u013c\u013d\7N\2\2\u013d\u013e\7Q\2\2\u013e"+
		"\u013f\7E\2\2\u013f\u0140\7M\2\2\u0140@\3\2\2\2\u0141\u0142\7?\2\2\u0142"+
		"B\3\2\2\2\u0143\u0144\7`\2\2\u0144\u0145\7`\2\2\u0145D\3\2\2\2\u0146\u0147"+
		"\7`\2\2\u0147F\3\2\2\2\u0148\u0149\t\b\2\2\u0149H\3\2\2\2\u014a\u014b"+
		"\7?\2\2\u014b\u0154\7?\2\2\u014c\u0154\7>\2\2\u014d\u014e\7>\2\2\u014e"+
		"\u0154\7?\2\2\u014f\u0154\7@\2\2\u0150\u0151\7@\2\2\u0151\u0154\7?\2\2"+
		"\u0152\u0154\7\u0080\2\2\u0153\u014a\3\2\2\2\u0153\u014c\3\2\2\2\u0153"+
		"\u014d\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0152\3\2"+
		"\2\2\u0154J\3\2\2\2\u0155\u0156\7T\2\2\u0156\u0157\7G\2\2\u0157\u0172"+
		"\7F\2\2\u0158\u0159\7D\2\2\u0159\u015a\7N\2\2\u015a\u015b\7W\2\2\u015b"+
		"\u0172\7G\2\2\u015c\u015d\7[\2\2\u015d\u015e\7G\2\2\u015e\u015f\7N\2\2"+
		"\u015f\u0160\7N\2\2\u0160\u0161\7Q\2\2\u0161\u0172\7Y\2\2\u0162\u0163"+
		"\7I\2\2\u0163\u0164\7T\2\2\u0164\u0165\7G\2\2\u0165\u0166\7G\2\2\u0166"+
		"\u0172\7P\2\2\u0167\u0168\7Y\2\2\u0168\u0169\7J\2\2\u0169\u016a\7K\2\2"+
		"\u016a\u016b\7V\2\2\u016b\u0172\7G\2\2\u016c\u016d\7D\2\2\u016d\u016e"+
		"\7N\2\2\u016e\u016f\7C\2\2\u016f\u0170\7E\2\2\u0170\u0172\7M\2\2\u0171"+
		"\u0155\3\2\2\2\u0171\u0158\3\2\2\2\u0171\u015c\3\2\2\2\u0171\u0162\3\2"+
		"\2\2\u0171\u0167\3\2\2\2\u0171\u016c\3\2\2\2\u0172L\3\2\2\2\"\2\\lpsu"+
		"}\u0082\u008a\u008f\u0094\u0099\u00a3\u00a8\u00b4\u00b9\u00c8\u00d5\u00e0"+
		"\u00ec\u00f5\u00fd\u0102\u0109\u010e\u0116\u011f\u0126\u012e\u0138\u0153"+
		"\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}