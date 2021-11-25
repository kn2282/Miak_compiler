// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/javaprocessor/canvas-compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package CanvasGrammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CanvasGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "SPACE", "NEW_LINE", 
			"AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", "BEGIN", 
			"END", "IF", "THEN", "WHILE", "DEF", "RGB", "DRAW", "AssignOperator", 
			"AritmeticOperator", "ComprehensionOperator", "Hex", "Number", "Variable_ref", 
			"Color_name", "Name"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0149\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\5\nV\n\n\3\n\6\nY\n\n\r\n\16\nZ\3\13\3\13\3\13\5\13`\n\13\3\13"+
		"\6\13c\n\13\r\13\16\13d\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\f\6"+
		"\fr\n\f\r\f\16\fs\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n"+
		"\r\3\r\6\r\u0083\n\r\r\r\16\r\u0084\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00aa\n\20\f\20\16\20\u00ad\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00b6\n\21\r\21\16\21\u00b7\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00bf\n\22\f\22\16\22\u00c2\13\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00c8\n\23\3\23\6\23\u00cb\n\23\r\23\16\23\u00cc\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\6\24\u00d5\n\24\r\24\16\24\u00d6\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\6\25\u00e0\n\25\r\25\16\25\u00e1\3\26\3\26\3"+
		"\26\3\26\3\26\6\26\u00e9\n\26\r\26\16\26\u00ea\3\27\3\27\3\27\3\27\3\27"+
		"\6\27\u00f2\n\27\r\27\16\27\u00f3\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00fc"+
		"\n\30\f\30\16\30\u00ff\13\30\3\31\3\31\7\31\u0103\n\31\f\31\16\31\u0106"+
		"\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0113"+
		"\n\33\3\34\5\34\u0116\n\34\3\35\3\35\3\35\6\35\u011b\n\35\r\35\16\35\u011c"+
		"\5\35\u011f\n\35\3\36\5\36\u0122\n\36\3\36\7\36\u0125\n\36\f\36\16\36"+
		"\u0128\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u0146\n\37\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\6\5\2,-//\61\61\4\2\62"+
		";CH\5\2C\\aac|\6\2\62;C\\aac|\2\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3"+
		"\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2"+
		"\2\2\21O\3\2\2\2\23U\3\2\2\2\25_\3\2\2\2\27n\3\2\2\2\31\177\3\2\2\2\33"+
		"\u0086\3\2\2\2\35\u0096\3\2\2\2\37\u00a3\3\2\2\2!\u00ae\3\2\2\2#\u00b9"+
		"\3\2\2\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d8\3\2\2\2+\u00e3\3\2\2\2"+
		"-\u00ec\3\2\2\2/\u00f5\3\2\2\2\61\u0100\3\2\2\2\63\u0107\3\2\2\2\65\u0112"+
		"\3\2\2\2\67\u0115\3\2\2\29\u011e\3\2\2\2;\u0121\3\2\2\2=\u0145\3\2\2\2"+
		"?\u0147\3\2\2\2AB\7<\2\2B\4\3\2\2\2CD\7#\2\2D\6\3\2\2\2EF\7*\2\2F\b\3"+
		"\2\2\2GH\7.\2\2H\n\3\2\2\2IJ\7+\2\2J\f\3\2\2\2KL\7%\2\2L\16\3\2\2\2MN"+
		"\7\"\2\2N\20\3\2\2\2OP\7\f\2\2P\22\3\2\2\2QR\7C\2\2RS\7P\2\2SV\7F\2\2"+
		"TV\7(\2\2UQ\3\2\2\2UT\3\2\2\2VX\3\2\2\2WY\5\17\b\2XW\3\2\2\2YZ\3\2\2\2"+
		"ZX\3\2\2\2Z[\3\2\2\2[\24\3\2\2\2\\]\7Q\2\2]`\7T\2\2^`\7~\2\2_\\\3\2\2"+
		"\2_^\3\2\2\2`b\3\2\2\2ac\5\17\b\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2e\26\3\2\2\2fg\7V\2\2gh\7T\2\2hi\7W\2\2io\7G\2\2jk\7v\2\2kl\7t\2\2"+
		"lm\7w\2\2mo\7g\2\2nf\3\2\2\2nj\3\2\2\2oq\3\2\2\2pr\5\17\b\2qp\3\2\2\2"+
		"rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\30\3\2\2\2uv\7H\2\2vw\7C\2\2wx\7N\2\2"+
		"xy\7U\2\2y\u0080\7G\2\2z{\7h\2\2{|\7c\2\2|}\7n\2\2}~\7u\2\2~\u0080\7g"+
		"\2\2\177u\3\2\2\2\177z\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\17\b"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\32\3\2\2\2\u0086\u0087\7T\2\2\u0087\u0088\7G\2\2\u0088"+
		"\u0089\7E\2\2\u0089\u008a\7V\2\2\u008a\u008b\7C\2\2\u008b\u008c\7P\2\2"+
		"\u008c\u008d\7I\2\2\u008d\u008e\7N\2\2\u008e\u008f\7G\2\2\u008f\u0093"+
		"\3\2\2\2\u0090\u0092\5\17\b\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\34\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\7E\2\2\u0097\u0098\7K\2\2\u0098\u0099\7T\2\2\u0099"+
		"\u009a\7E\2\2\u009a\u009b\7N\2\2\u009b\u009c\7G\2\2\u009c\u00a0\3\2\2"+
		"\2\u009d\u009f\5\17\b\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\36\3\2\2\2\u00a2\u00a0\3\2\2"+
		"\2\u00a3\u00a4\7N\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7"+
		"\7G\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00aa\5\17\b\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac \3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00af\7D\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1"+
		"\7I\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b6\5\17\b\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb"+
		"\7P\2\2\u00bb\u00bc\7F\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\5\17\b\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1$\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c8"+
		"\7H\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c8\7h\2\2\u00c7\u00c3\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00cb\5\17\b\2\u00ca\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"&\3\2\2\2\u00ce\u00cf\7V\2\2\u00cf\u00d0\7J\2\2\u00d0\u00d1\7G\2\2\u00d1"+
		"\u00d2\7P\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5\17\b\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"(\3\2\2\2\u00d8\u00d9\7Y\2\2\u00d9\u00da\7J\2\2\u00da\u00db\7K\2\2\u00db"+
		"\u00dc\7N\2\2\u00dc\u00dd\7G\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\5\17"+
		"\b\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\7G\2\2\u00e5"+
		"\u00e6\7H\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5\17\b\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		",\3\2\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7I\2\2\u00ee\u00ef\7D\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00f2\5\17\b\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4.\3\2\2\2\u00f5\u00f6"+
		"\7F\2\2\u00f6\u00f7\7T\2\2\u00f7\u00f8\7C\2\2\u00f8\u00f9\7Y\2\2\u00f9"+
		"\u00fd\3\2\2\2\u00fa\u00fc\5\17\b\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\60\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0104\7?\2\2\u0101\u0103\5\17\b\2\u0102\u0101\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\62\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\t\2\2\2\u0108\64\3\2\2\2\u0109"+
		"\u010a\7?\2\2\u010a\u0113\7?\2\2\u010b\u0113\7>\2\2\u010c\u010d\7>\2\2"+
		"\u010d\u0113\7?\2\2\u010e\u0113\7@\2\2\u010f\u0110\7@\2\2\u0110\u0113"+
		"\7?\2\2\u0111\u0113\7\u0080\2\2\u0112\u0109\3\2\2\2\u0112\u010b\3\2\2"+
		"\2\u0112\u010c\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\66\3\2\2\2\u0114\u0116\t\3\2\2\u0115\u0114\3\2\2\2\u0116"+
		"8\3\2\2\2\u0117\u011f\4\62;\2\u0118\u011a\4\63;\2\u0119\u011b\4\62;\2"+
		"\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0118\3\2\2\2\u011f"+
		":\3\2\2\2\u0120\u0122\t\4\2\2\u0121\u0120\3\2\2\2\u0122\u0126\3\2\2\2"+
		"\u0123\u0125\t\5\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127<\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7T\2\2\u012a\u012b\7G\2\2\u012b\u0146\7F\2\2\u012c\u012d\7D\2\2"+
		"\u012d\u012e\7N\2\2\u012e\u012f\7W\2\2\u012f\u0146\7G\2\2\u0130\u0131"+
		"\7[\2\2\u0131\u0132\7G\2\2\u0132\u0133\7N\2\2\u0133\u0134\7N\2\2\u0134"+
		"\u0135\7Q\2\2\u0135\u0146\7Y\2\2\u0136\u0137\7I\2\2\u0137\u0138\7T\2\2"+
		"\u0138\u0139\7G\2\2\u0139\u013a\7G\2\2\u013a\u0146\7P\2\2\u013b\u013c"+
		"\7Y\2\2\u013c\u013d\7J\2\2\u013d\u013e\7K\2\2\u013e\u013f\7V\2\2\u013f"+
		"\u0146\7G\2\2\u0140\u0141\7D\2\2\u0141\u0142\7N\2\2\u0142\u0143\7C\2\2"+
		"\u0143\u0144\7E\2\2\u0144\u0146\7M\2\2\u0145\u0129\3\2\2\2\u0145\u012c"+
		"\3\2\2\2\u0145\u0130\3\2\2\2\u0145\u0136\3\2\2\2\u0145\u013b\3\2\2\2\u0145"+
		"\u0140\3\2\2\2\u0146>\3\2\2\2\u0147\u0148\5;\36\2\u0148@\3\2\2\2 \2UZ"+
		"_dns\177\u0084\u0093\u00a0\u00ab\u00b7\u00c0\u00c7\u00cc\u00d6\u00e1\u00ea"+
		"\u00f3\u00fd\u0104\u0112\u0115\u011c\u011e\u0121\u0124\u0126\u0145\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}