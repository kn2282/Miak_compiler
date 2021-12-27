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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\13\5\13q\n\13\3\f\5\f"+
		"t\n\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\r\3\r\3\16\6\16\177\n\16\r\16\16\16"+
		"\u0080\3\16\3\16\3\17\5\17\u0086\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5"+
		"\20\u008e\n\20\3\20\6\20\u0091\n\20\r\20\16\20\u0092\3\21\3\21\3\21\5"+
		"\21\u0098\n\21\3\21\6\21\u009b\n\21\r\21\16\21\u009c\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00a7\n\22\3\22\6\22\u00aa\n\22\r\22\16\22"+
		"\u00ab\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b8\n"+
		"\23\3\23\6\23\u00bb\n\23\r\23\16\23\u00bc\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00d7\n\25\f\25\16\25\u00da\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00e2\n\26\f\26\16\26\u00e5\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u00ee\n\27\r\27\16\27\u00ef"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u00f7\n\30\f\30\16\30\u00fa\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0101\n\31\3\31\6\31\u0104\n\31\r\31\16\31\u0105"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u010d\n\32\3\32\6\32\u0110\n\32\r\32\16"+
		"\32\u0111\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011a\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0123\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u012a"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0132\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u013a\n\37\f\37\16\37\u013d\13\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0157\n%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u0175\n&\2\2\'\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23"+
		"\7\25\2\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25"+
		"\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"\3\2\t\3\2\63;\5"+
		"\2\62;CHch\4\2ZZzz\3\2\62;\4\2aac|\6\2\62;C\\aac|\5\2,-//\61\61\2\u0197"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2"+
		"\2\2\13U\3\2\2\2\rW\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25p\3"+
		"\2\2\2\27s\3\2\2\2\31{\3\2\2\2\33~\3\2\2\2\35\u0085\3\2\2\2\37\u008d\3"+
		"\2\2\2!\u0097\3\2\2\2#\u00a6\3\2\2\2%\u00b7\3\2\2\2\'\u00be\3\2\2\2)\u00ce"+
		"\3\2\2\2+\u00db\3\2\2\2-\u00e6\3\2\2\2/\u00f1\3\2\2\2\61\u0100\3\2\2\2"+
		"\63\u010c\3\2\2\2\65\u0113\3\2\2\2\67\u011b\3\2\2\29\u0124\3\2\2\2;\u0131"+
		"\3\2\2\2=\u0133\3\2\2\2?\u013e\3\2\2\2A\u0144\3\2\2\2C\u0146\3\2\2\2E"+
		"\u0149\3\2\2\2G\u014b\3\2\2\2I\u0156\3\2\2\2K\u0174\3\2\2\2MN\7*\2\2N"+
		"\4\3\2\2\2OP\7.\2\2P\6\3\2\2\2QR\7+\2\2R\b\3\2\2\2ST\7<\2\2T\n\3\2\2\2"+
		"UV\t\2\2\2V\f\3\2\2\2WX\t\3\2\2X\16\3\2\2\2Y]\7%\2\2Z[\7\62\2\2[]\t\4"+
		"\2\2\\Y\3\2\2\2\\Z\3\2\2\2]\20\3\2\2\2^_\t\5\2\2_\22\3\2\2\2`a\5\17\b"+
		"\2ab\5\r\7\2bc\5\r\7\2cd\5\r\7\2de\5\r\7\2ef\5\r\7\2fg\5\r\7\2g\24\3\2"+
		"\2\2hl\5\13\6\2ik\5\21\t\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mq\3"+
		"\2\2\2nl\3\2\2\2oq\7\62\2\2ph\3\2\2\2po\3\2\2\2q\26\3\2\2\2rt\t\6\2\2"+
		"sr\3\2\2\2tx\3\2\2\2uw\t\7\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y\30\3\2\2\2zx\3\2\2\2{|\5\25\13\2|\32\3\2\2\2}\177\7\"\2\2~}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u0083\b\16\2\2\u0083\34\3\2\2\2\u0084\u0086\7\17\2\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\f"+
		"\2\2\u0088\36\3\2\2\2\u0089\u008a\7C\2\2\u008a\u008b\7P\2\2\u008b\u008e"+
		"\7F\2\2\u008c\u008e\7(\2\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0091\5\33\16\2\u0090\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\7Q\2\2\u0095\u0098\7T\2\2\u0096\u0098\7~\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5\33\16\2\u009a\u0099\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7T\2\2\u00a0\u00a1\7W\2\2\u00a1"+
		"\u00a7\7G\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7w\2\2"+
		"\u00a5\u00a7\7g\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00aa\5\33\16\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7"+
		"H\2\2\u00ae\u00af\7C\2\2\u00af\u00b0\7N\2\2\u00b0\u00b1\7U\2\2\u00b1\u00b8"+
		"\7G\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b8\7g\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b2\3\2\2"+
		"\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\5\33\16\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd&\3\2\2\2"+
		"\u00be\u00bf\7T\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7E\2\2\u00c1\u00c2"+
		"\7V\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7I\2\2\u00c5"+
		"\u00c6\7N\2\2\u00c6\u00c7\7G\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\5\33"+
		"\16\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc(\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7E\2\2\u00cf"+
		"\u00d0\7K\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\7E\2\2\u00d2\u00d3\7N\2\2"+
		"\u00d3\u00d4\7G\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7\5\33\16\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"*\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd\7K\2\2\u00dd"+
		"\u00de\7P\2\2\u00de\u00df\7G\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\5\33"+
		"\16\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4,\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7D\2\2\u00e7"+
		"\u00e8\7G\2\2\u00e8\u00e9\7I\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7P\2\2"+
		"\u00eb\u00ed\3\2\2\2\u00ec\u00ee\5\33\16\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0.\3\2\2\2\u00f1"+
		"\u00f2\7G\2\2\u00f2\u00f3\7P\2\2\u00f3\u00f4\7F\2\2\u00f4\u00f8\3\2\2"+
		"\2\u00f5\u00f7\5\33\16\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\60\3\2\2\2\u00fa\u00f8\3\2\2"+
		"\2\u00fb\u00fc\7K\2\2\u00fc\u0101\7H\2\2\u00fd\u00fe\7k\2\2\u00fe\u0101"+
		"\7h\2\2\u00ff\u0101\7A\2\2\u0100\u00fb\3\2\2\2\u0100\u00fd\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5\33\16\2\u0103\u0102\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\62\3\2\2\2\u0107\u010d\7#\2\2\u0108\u0109\7G\2\2\u0109\u010a\7N\2\2\u010a"+
		"\u010b\7U\2\2\u010b\u010d\7G\2\2\u010c\u0107\3\2\2\2\u010c\u0108\3\2\2"+
		"\2\u010d\u010f\3\2\2\2\u010e\u0110\5\33\16\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\64\3\2\2"+
		"\2\u0113\u0114\7V\2\2\u0114\u0115\7J\2\2\u0115\u0116\7G\2\2\u0116\u0117"+
		"\7P\2\2\u0117\u0119\3\2\2\2\u0118\u011a\5\33\16\2\u0119\u0118\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\66\3\2\2\2\u011b\u011c\7Y\2\2\u011c\u011d\7"+
		"J\2\2\u011d\u011e\7K\2\2\u011e\u011f\7N\2\2\u011f\u0120\7G\2\2\u0120\u0122"+
		"\3\2\2\2\u0121\u0123\5\33\16\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u01238\3\2\2\2\u0124\u0125\7F\2\2\u0125\u0126\7G\2\2\u0126\u0127\7H\2"+
		"\2\u0127\u0129\3\2\2\2\u0128\u012a\5\33\16\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a:\3\2\2\2\u012b\u012c\7T\2\2\u012c\u012d\7I\2\2\u012d"+
		"\u0132\7D\2\2\u012e\u012f\7t\2\2\u012f\u0130\7i\2\2\u0130\u0132\7d\2\2"+
		"\u0131\u012b\3\2\2\2\u0131\u012e\3\2\2\2\u0132<\3\2\2\2\u0133\u0134\7"+
		"F\2\2\u0134\u0135\7T\2\2\u0135\u0136\7C\2\2\u0136\u0137\7Y\2\2\u0137\u013b"+
		"\3\2\2\2\u0138\u013a\5\33\16\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c>\3\2\2\2\u013d\u013b\3"+
		"\2\2\2\u013e\u013f\7D\2\2\u013f\u0140\7N\2\2\u0140\u0141\7Q\2\2\u0141"+
		"\u0142\7E\2\2\u0142\u0143\7M\2\2\u0143@\3\2\2\2\u0144\u0145\7?\2\2\u0145"+
		"B\3\2\2\2\u0146\u0147\7`\2\2\u0147\u0148\7`\2\2\u0148D\3\2\2\2\u0149\u014a"+
		"\7`\2\2\u014aF\3\2\2\2\u014b\u014c\t\b\2\2\u014cH\3\2\2\2\u014d\u014e"+
		"\7?\2\2\u014e\u0157\7?\2\2\u014f\u0157\7>\2\2\u0150\u0151\7>\2\2\u0151"+
		"\u0157\7?\2\2\u0152\u0157\7@\2\2\u0153\u0154\7@\2\2\u0154\u0157\7?\2\2"+
		"\u0155\u0157\7\u0080\2\2\u0156\u014d\3\2\2\2\u0156\u014f\3\2\2\2\u0156"+
		"\u0150\3\2\2\2\u0156\u0152\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0155\3\2"+
		"\2\2\u0157J\3\2\2\2\u0158\u0159\7T\2\2\u0159\u015a\7G\2\2\u015a\u0175"+
		"\7F\2\2\u015b\u015c\7D\2\2\u015c\u015d\7N\2\2\u015d\u015e\7W\2\2\u015e"+
		"\u0175\7G\2\2\u015f\u0160\7[\2\2\u0160\u0161\7G\2\2\u0161\u0162\7N\2\2"+
		"\u0162\u0163\7N\2\2\u0163\u0164\7Q\2\2\u0164\u0175\7Y\2\2\u0165\u0166"+
		"\7I\2\2\u0166\u0167\7T\2\2\u0167\u0168\7G\2\2\u0168\u0169\7G\2\2\u0169"+
		"\u0175\7P\2\2\u016a\u016b\7Y\2\2\u016b\u016c\7J\2\2\u016c\u016d\7K\2\2"+
		"\u016d\u016e\7V\2\2\u016e\u0175\7G\2\2\u016f\u0170\7D\2\2\u0170\u0171"+
		"\7N\2\2\u0171\u0172\7C\2\2\u0172\u0173\7E\2\2\u0173\u0175\7M\2\2\u0174"+
		"\u0158\3\2\2\2\u0174\u015b\3\2\2\2\u0174\u015f\3\2\2\2\u0174\u0165\3\2"+
		"\2\2\u0174\u016a\3\2\2\2\u0174\u016f\3\2\2\2\u0175L\3\2\2\2#\2\\lpsvx"+
		"\u0080\u0085\u008d\u0092\u0097\u009c\u00a6\u00ab\u00b7\u00bc\u00cb\u00d8"+
		"\u00e3\u00ef\u00f8\u0100\u0105\u010c\u0111\u0119\u0122\u0129\u0131\u013b"+
		"\u0156\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}