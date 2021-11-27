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
		T__0=1, T__1=2, T__2=3, T__3=4, HexColor=5, Constant=6, SPACE=7, NEW_LINE=8, 
		AND=9, OR=10, TRUE=11, FALSE=12, RECTANGLE=13, CIRCLE=14, LINE=15, BEGIN=16, 
		END=17, IF=18, ELSE=19, THEN=20, WHILE=21, DEF=22, RGB=23, DRAW=24, AssignOperator=25, 
		AritmeticOperator=26, ComprehensionOperator=27, ColorName=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "VariableRef", "Constant", "SPACE", "NEW_LINE", 
			"AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", "BEGIN", 
			"END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", "AssignOperator", 
			"AritmeticOperator", "ComprehensionOperator", "ColorName", "Name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "','", "')'", null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "Constant", "SPACE", "NEW_LINE", 
			"AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", "BEGIN", 
			"END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", "AssignOperator", 
			"AritmeticOperator", "ComprehensionOperator", "ColorName"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0163\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\5\fm\n\f\3\f\7\fp\n\f\f\f\16"+
		"\fs\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\177\n\20"+
		"\3\20\6\20\u0082\n\20\r\20\16\20\u0083\3\21\3\21\3\21\5\21\u0089\n\21"+
		"\3\21\6\21\u008c\n\21\r\21\16\21\u008d\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0098\n\22\3\22\6\22\u009b\n\22\r\22\16\22\u009c\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a9\n\23\3\23\6\23"+
		"\u00ac\n\23\r\23\16\23\u00ad\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u00bb\n\24\f\24\16\24\u00be\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u00c8\n\25\f\25\16\25\u00cb\13\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\6\27\u00df\n\27\r\27\16\27\u00e0\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u00e8\n\30\f\30\16\30\u00eb\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00f2\n\31\3\31\6\31\u00f5\n\31\r\31\16\31\u00f6\3\32"+
		"\3\32\6\32\u00fb\n\32\r\32\16\32\u00fc\3\33\3\33\3\33\3\33\3\33\3\33\6"+
		"\33\u0105\n\33\r\33\16\33\u0106\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34"+
		"\u0110\n\34\r\34\16\34\u0111\3\35\3\35\3\35\3\35\3\35\6\35\u0119\n\35"+
		"\r\35\16\35\u011a\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0123\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u012b\n\37\f\37\16\37\u012e\13\37\3 \3 \7"+
		" \u0132\n \f \16 \u0135\13 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0142\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0160\n#\3$\3$\2\2%\3\3\5\4\7\5\t\6\13"+
		"\2\r\2\17\2\21\2\23\7\25\2\27\2\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20"+
		"+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\2\3"+
		"\2\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3\2\62;\4\2aac|\6\2\62;C\\aac|\5\2,-"+
		"//\61\61\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17"+
		"X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25d\3\2\2\2\27l\3\2\2\2\31t\3\2\2\2"+
		"\33v\3\2\2\2\35x\3\2\2\2\37~\3\2\2\2!\u0088\3\2\2\2#\u0097\3\2\2\2%\u00a8"+
		"\3\2\2\2\'\u00af\3\2\2\2)\u00bf\3\2\2\2+\u00cc\3\2\2\2-\u00d7\3\2\2\2"+
		"/\u00e2\3\2\2\2\61\u00f1\3\2\2\2\63\u00f8\3\2\2\2\65\u00fe\3\2\2\2\67"+
		"\u0108\3\2\2\29\u0113\3\2\2\2;\u0122\3\2\2\2=\u0124\3\2\2\2?\u012f\3\2"+
		"\2\2A\u0136\3\2\2\2C\u0141\3\2\2\2E\u015f\3\2\2\2G\u0161\3\2\2\2IJ\7<"+
		"\2\2J\4\3\2\2\2KL\7*\2\2L\6\3\2\2\2MN\7.\2\2N\b\3\2\2\2OP\7+\2\2P\n\3"+
		"\2\2\2QR\t\2\2\2R\f\3\2\2\2ST\t\3\2\2T\16\3\2\2\2UY\7%\2\2VW\7\62\2\2"+
		"WY\t\4\2\2XU\3\2\2\2XV\3\2\2\2Y\20\3\2\2\2Z[\t\5\2\2[\22\3\2\2\2\\]\5"+
		"\17\b\2]^\5\r\7\2^_\5\r\7\2_`\5\r\7\2`a\5\r\7\2ab\5\r\7\2bc\5\r\7\2c\24"+
		"\3\2\2\2dh\5\13\6\2eg\5\21\t\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"i\26\3\2\2\2jh\3\2\2\2km\t\6\2\2lk\3\2\2\2mq\3\2\2\2np\t\7\2\2on\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\30\3\2\2\2sq\3\2\2\2tu\5\25\13\2u\32"+
		"\3\2\2\2vw\7\"\2\2w\34\3\2\2\2xy\7\f\2\2y\36\3\2\2\2z{\7C\2\2{|\7P\2\2"+
		"|\177\7F\2\2}\177\7(\2\2~z\3\2\2\2~}\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082"+
		"\5\33\16\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084 \3\2\2\2\u0085\u0086\7Q\2\2\u0086\u0089\7T"+
		"\2\2\u0087\u0089\7~\2\2\u0088\u0085\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u008c\5\33\16\2\u008b\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7V\2\2\u0090\u0091\7T\2\2\u0091\u0092\7W\2\2\u0092\u0098\7G\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096\u0098\7g\2\2"+
		"\u0097\u008f\3\2\2\2\u0097\u0093\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b"+
		"\5\33\16\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d$\3\2\2\2\u009e\u009f\7H\2\2\u009f\u00a0\7C"+
		"\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a9\7G\2\2\u00a3\u00a4"+
		"\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"\u00a9\7g\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00ac\5\33\16\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae&\3\2\2\2\u00af\u00b0\7T\2\2\u00b0"+
		"\u00b1\7G\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7V\2\2\u00b3\u00b4\7C\2\2"+
		"\u00b4\u00b5\7P\2\2\u00b5\u00b6\7I\2\2\u00b6\u00b7\7N\2\2\u00b7\u00b8"+
		"\7G\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\5\33\16\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd(\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7K\2\2\u00c1"+
		"\u00c2\7T\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7N\2\2\u00c4\u00c5\7G\2\2"+
		"\u00c5\u00c9\3\2\2\2\u00c6\u00c8\5\33\16\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca*\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7P\2"+
		"\2\u00cf\u00d0\7G\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\5\33\16\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5,\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7D\2\2\u00d8\u00d9"+
		"\7G\2\2\u00d9\u00da\7I\2\2\u00da\u00db\7K\2\2\u00db\u00dc\7P\2\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00df\5\33\16\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1.\3\2\2\2\u00e2\u00e3"+
		"\7G\2\2\u00e3\u00e4\7P\2\2\u00e4\u00e5\7F\2\2\u00e5\u00e9\3\2\2\2\u00e6"+
		"\u00e8\5\33\16\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\60\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\7K\2\2\u00ed\u00f2\7H\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f2\7h\2\2"+
		"\u00f0\u00f2\7A\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5\33\16\2\u00f4\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\62"+
		"\3\2\2\2\u00f8\u00fa\7#\2\2\u00f9\u00fb\5\33\16\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\64"+
		"\3\2\2\2\u00fe\u00ff\7V\2\2\u00ff\u0100\7J\2\2\u0100\u0101\7G\2\2\u0101"+
		"\u0102\7P\2\2\u0102\u0104\3\2\2\2\u0103\u0105\5\33\16\2\u0104\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\66\3\2\2\2\u0108\u0109\7Y\2\2\u0109\u010a\7J\2\2\u010a\u010b\7K\2\2\u010b"+
		"\u010c\7N\2\2\u010c\u010d\7G\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5\33"+
		"\16\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u01128\3\2\2\2\u0113\u0114\7F\2\2\u0114\u0115\7G\2\2\u0115"+
		"\u0116\7H\2\2\u0116\u0118\3\2\2\2\u0117\u0119\5\33\16\2\u0118\u0117\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		":\3\2\2\2\u011c\u011d\7T\2\2\u011d\u011e\7I\2\2\u011e\u0123\7D\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7i\2\2\u0121\u0123\7d\2\2\u0122\u011c\3\2\2"+
		"\2\u0122\u011f\3\2\2\2\u0123<\3\2\2\2\u0124\u0125\7F\2\2\u0125\u0126\7"+
		"T\2\2\u0126\u0127\7C\2\2\u0127\u0128\7Y\2\2\u0128\u012c\3\2\2\2\u0129"+
		"\u012b\5\33\16\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d>\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133"+
		"\7?\2\2\u0130\u0132\5\33\16\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134@\3\2\2\2\u0135\u0133\3"+
		"\2\2\2\u0136\u0137\t\b\2\2\u0137B\3\2\2\2\u0138\u0139\7?\2\2\u0139\u0142"+
		"\7?\2\2\u013a\u0142\7>\2\2\u013b\u013c\7>\2\2\u013c\u0142\7?\2\2\u013d"+
		"\u0142\7@\2\2\u013e\u013f\7@\2\2\u013f\u0142\7?\2\2\u0140\u0142\7\u0080"+
		"\2\2\u0141\u0138\3\2\2\2\u0141\u013a\3\2\2\2\u0141\u013b\3\2\2\2\u0141"+
		"\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141\u0140\3\2\2\2\u0142D\3\2\2\2"+
		"\u0143\u0144\7T\2\2\u0144\u0145\7G\2\2\u0145\u0160\7F\2\2\u0146\u0147"+
		"\7D\2\2\u0147\u0148\7N\2\2\u0148\u0149\7W\2\2\u0149\u0160\7G\2\2\u014a"+
		"\u014b\7[\2\2\u014b\u014c\7G\2\2\u014c\u014d\7N\2\2\u014d\u014e\7N\2\2"+
		"\u014e\u014f\7Q\2\2\u014f\u0160\7Y\2\2\u0150\u0151\7I\2\2\u0151\u0152"+
		"\7T\2\2\u0152\u0153\7G\2\2\u0153\u0154\7G\2\2\u0154\u0160\7P\2\2\u0155"+
		"\u0156\7Y\2\2\u0156\u0157\7J\2\2\u0157\u0158\7K\2\2\u0158\u0159\7V\2\2"+
		"\u0159\u0160\7G\2\2\u015a\u015b\7D\2\2\u015b\u015c\7N\2\2\u015c\u015d"+
		"\7C\2\2\u015d\u015e\7E\2\2\u015e\u0160\7M\2\2\u015f\u0143\3\2\2\2\u015f"+
		"\u0146\3\2\2\2\u015f\u014a\3\2\2\2\u015f\u0150\3\2\2\2\u015f\u0155\3\2"+
		"\2\2\u015f\u015a\3\2\2\2\u0160F\3\2\2\2\u0161\u0162\5\27\f\2\u0162H\3"+
		"\2\2\2 \2Xhloq~\u0083\u0088\u008d\u0097\u009c\u00a8\u00ad\u00bc\u00c9"+
		"\u00d4\u00e0\u00e9\u00f1\u00f6\u00fc\u0106\u0111\u011a\u0122\u012c\u0133"+
		"\u0141\u015f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}