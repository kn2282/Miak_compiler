// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/canvas-interpreter/src\CanvasGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SPACE=7, NEW_LINE=8, AND=9, 
		OR=10, TRUE=11, FALSE=12, RECTANGLE=13, CIRCLE=14, LINE=15, BEGIN=16, 
		END=17, IF=18, THEN=19, WHILE=20, DEF=21, RGB=22, DRAW=23, AssignOperator=24, 
		AritmeticOperator=25, ComprehensionOperator=26, VariableRef=27, ColorName=28, 
		Name=29;
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
			"AritmeticOperator", "ComprehensionOperator", "NonZeroDigit", "Hex", 
			"Digit", "Integer", "VariableRef", "ColorName", "Name"
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
			"ComprehensionOperator", "VariableRef", "ColorName", "Name"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u014e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\5\nZ\n\n\3\n\6\n]\n\n\r\n\16\n^\3\13\3\13\3"+
		"\13\5\13d\n\13\3\13\6\13g\n\13\r\13\16\13h\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\fs\n\f\3\f\6\fv\n\f\r\f\16\fw\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0084\n\r\3\r\6\r\u0087\n\r\r\r\16\r\u0088\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0096\n\16\f\16\16\16\u0099"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17\16"+
		"\17\u00a6\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ae\n\20\f\20\16"+
		"\20\u00b1\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00ba\n\21\r\21"+
		"\16\21\u00bb\3\22\3\22\3\22\3\22\3\22\7\22\u00c3\n\22\f\22\16\22\u00c6"+
		"\13\22\3\23\3\23\3\23\3\23\5\23\u00cc\n\23\3\23\6\23\u00cf\n\23\r\23\16"+
		"\23\u00d0\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u00d9\n\24\r\24\16\24\u00da"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00e4\n\25\r\25\16\25\u00e5\3"+
		"\26\3\26\3\26\3\26\3\26\6\26\u00ed\n\26\r\26\16\26\u00ee\3\27\3\27\3\27"+
		"\3\27\3\27\6\27\u00f6\n\27\r\27\16\27\u00f7\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\7\30\u0100\n\30\f\30\16\30\u0103\13\30\3\31\3\31\7\31\u0107\n\31\f"+
		"\31\16\31\u010a\13\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0117\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u0121"+
		"\n\37\f\37\16\37\u0124\13\37\3 \5 \u0127\n \3 \7 \u012a\n \f \16 \u012d"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u014b\n!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\29\2;\2=\2?\35A\36C\37\3\2\b\5\2,-/"+
		"/\61\61\3\2\63;\5\2\62;CHch\3\2\62;\4\2aac|\6\2\62;C\\aac|\2\u016a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17"+
		"Q\3\2\2\2\21S\3\2\2\2\23Y\3\2\2\2\25c\3\2\2\2\27r\3\2\2\2\31\u0083\3\2"+
		"\2\2\33\u008a\3\2\2\2\35\u009a\3\2\2\2\37\u00a7\3\2\2\2!\u00b2\3\2\2\2"+
		"#\u00bd\3\2\2\2%\u00cb\3\2\2\2\'\u00d2\3\2\2\2)\u00dc\3\2\2\2+\u00e7\3"+
		"\2\2\2-\u00f0\3\2\2\2/\u00f9\3\2\2\2\61\u0104\3\2\2\2\63\u010b\3\2\2\2"+
		"\65\u0116\3\2\2\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u011c\3\2\2\2=\u011e"+
		"\3\2\2\2?\u0126\3\2\2\2A\u014a\3\2\2\2C\u014c\3\2\2\2EF\7<\2\2F\4\3\2"+
		"\2\2GH\7#\2\2H\6\3\2\2\2IJ\7*\2\2J\b\3\2\2\2KL\7.\2\2L\n\3\2\2\2MN\7+"+
		"\2\2N\f\3\2\2\2OP\7%\2\2P\16\3\2\2\2QR\7\"\2\2R\20\3\2\2\2ST\7\f\2\2T"+
		"\22\3\2\2\2UV\7C\2\2VW\7P\2\2WZ\7F\2\2XZ\7(\2\2YU\3\2\2\2YX\3\2\2\2Z\\"+
		"\3\2\2\2[]\5\17\b\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\24\3\2"+
		"\2\2`a\7Q\2\2ad\7T\2\2bd\7~\2\2c`\3\2\2\2cb\3\2\2\2df\3\2\2\2eg\5\17\b"+
		"\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\26\3\2\2\2jk\7V\2\2kl\7T\2"+
		"\2lm\7W\2\2ms\7G\2\2no\7v\2\2op\7t\2\2pq\7w\2\2qs\7g\2\2rj\3\2\2\2rn\3"+
		"\2\2\2su\3\2\2\2tv\5\17\b\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\30"+
		"\3\2\2\2yz\7H\2\2z{\7C\2\2{|\7N\2\2|}\7U\2\2}\u0084\7G\2\2~\177\7h\2\2"+
		"\177\u0080\7c\2\2\u0080\u0081\7n\2\2\u0081\u0082\7u\2\2\u0082\u0084\7"+
		"g\2\2\u0083y\3\2\2\2\u0083~\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\5"+
		"\17\b\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\32\3\2\2\2\u008a\u008b\7T\2\2\u008b\u008c\7G\2\2"+
		"\u008c\u008d\7E\2\2\u008d\u008e\7V\2\2\u008e\u008f\7C\2\2\u008f\u0090"+
		"\7P\2\2\u0090\u0091\7I\2\2\u0091\u0092\7N\2\2\u0092\u0093\7G\2\2\u0093"+
		"\u0097\3\2\2\2\u0094\u0096\5\17\b\2\u0095\u0094\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\34\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009b\7E\2\2\u009b\u009c\7K\2\2\u009c\u009d\7T\2"+
		"\2\u009d\u009e\7E\2\2\u009e\u009f\7N\2\2\u009f\u00a0\7G\2\2\u00a0\u00a4"+
		"\3\2\2\2\u00a1\u00a3\5\17\b\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\36\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7P\2\2\u00aa"+
		"\u00ab\7G\2\2\u00ab\u00af\3\2\2\2\u00ac\u00ae\5\17\b\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		" \3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7D\2\2\u00b3\u00b4\7G\2\2\u00b4"+
		"\u00b5\7I\2\2\u00b5\u00b6\7K\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b9\3\2\2"+
		"\2\u00b8\u00ba\5\17\b\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7G\2\2"+
		"\u00be\u00bf\7P\2\2\u00bf\u00c0\7F\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3"+
		"\5\17\b\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5$\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7"+
		"K\2\2\u00c8\u00cc\7H\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cc\7h\2\2\u00cb\u00c7"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\5\17\b\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1&\3\2\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7J\2\2\u00d4\u00d5"+
		"\7G\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\5\17\b\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db(\3\2\2\2\u00dc\u00dd\7Y\2\2\u00dd\u00de\7J\2\2\u00de\u00df"+
		"\7K\2\2\u00df\u00e0\7N\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e4\5\17\b\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9"+
		"\7G\2\2\u00e9\u00ea\7H\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00ed\5\17\b\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2\7I\2\2\u00f2\u00f3"+
		"\7D\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5\17\b\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8.\3\2\2\2"+
		"\u00f9\u00fa\7F\2\2\u00fa\u00fb\7T\2\2\u00fb\u00fc\7C\2\2\u00fc\u00fd"+
		"\7Y\2\2\u00fd\u0101\3\2\2\2\u00fe\u0100\5\17\b\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\60\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0108\7?\2\2\u0105\u0107\5\17\b\2\u0106\u0105"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\62\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\t\2\2\2\u010c\64\3\2\2\2\u010d"+
		"\u010e\7?\2\2\u010e\u0117\7?\2\2\u010f\u0117\7>\2\2\u0110\u0111\7>\2\2"+
		"\u0111\u0117\7?\2\2\u0112\u0117\7@\2\2\u0113\u0114\7@\2\2\u0114\u0117"+
		"\7?\2\2\u0115\u0117\7\u0080\2\2\u0116\u010d\3\2\2\2\u0116\u010f\3\2\2"+
		"\2\u0116\u0110\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\66\3\2\2\2\u0118\u0119\t\3\2\2\u01198\3\2\2\2\u011a\u011b"+
		"\t\4\2\2\u011b:\3\2\2\2\u011c\u011d\t\5\2\2\u011d<\3\2\2\2\u011e\u0122"+
		"\5\67\34\2\u011f\u0121\5;\36\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123>\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0125\u0127\t\6\2\2\u0126\u0125\3\2\2\2\u0127\u012b\3\2\2\2\u0128"+
		"\u012a\t\7\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c@\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f"+
		"\7T\2\2\u012f\u0130\7G\2\2\u0130\u014b\7F\2\2\u0131\u0132\7D\2\2\u0132"+
		"\u0133\7N\2\2\u0133\u0134\7W\2\2\u0134\u014b\7G\2\2\u0135\u0136\7[\2\2"+
		"\u0136\u0137\7G\2\2\u0137\u0138\7N\2\2\u0138\u0139\7N\2\2\u0139\u013a"+
		"\7Q\2\2\u013a\u014b\7Y\2\2\u013b\u013c\7I\2\2\u013c\u013d\7T\2\2\u013d"+
		"\u013e\7G\2\2\u013e\u013f\7G\2\2\u013f\u014b\7P\2\2\u0140\u0141\7Y\2\2"+
		"\u0141\u0142\7J\2\2\u0142\u0143\7K\2\2\u0143\u0144\7V\2\2\u0144\u014b"+
		"\7G\2\2\u0145\u0146\7D\2\2\u0146\u0147\7N\2\2\u0147\u0148\7C\2\2\u0148"+
		"\u0149\7E\2\2\u0149\u014b\7M\2\2\u014a\u012e\3\2\2\2\u014a\u0131\3\2\2"+
		"\2\u014a\u0135\3\2\2\2\u014a\u013b\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0145"+
		"\3\2\2\2\u014bB\3\2\2\2\u014c\u014d\5? \2\u014dD\3\2\2\2\36\2Y^chrw\u0083"+
		"\u0088\u0097\u00a4\u00af\u00bb\u00c4\u00cb\u00d0\u00da\u00e5\u00ee\u00f7"+
		"\u0101\u0108\u0116\u0122\u0126\u0129\u012b\u014a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}