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
		RGB=24, DRAW=25, BLOCK=26, AssignOperator=27, ArithmeticOperator=28, ComprehensionOperator=29, 
		ColorName=30;
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
			"BLOCK", "AssignOperator", "ArithmeticOperator", "ComprehensionOperator", 
			"ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'BLOCK'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "VariableName", "Constant", 
			"SPACE", "ENDL", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", 
			"LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", 
			"DRAW", "BLOCK", "AssignOperator", "ArithmeticOperator", "ComprehensionOperator", 
			"ColorName"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0165\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\7\13g\n\13\f\13\16\13j\13\13\3\f\5\fm\n\f\3\f\7\fp\n\f\f\f\16\fs\13"+
		"\f\3\r\3\r\3\16\3\16\3\17\5\17z\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20"+
		"\u0082\n\20\3\20\6\20\u0085\n\20\r\20\16\20\u0086\3\21\3\21\3\21\5\21"+
		"\u008c\n\21\3\21\6\21\u008f\n\21\r\21\16\21\u0090\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u009b\n\22\3\22\6\22\u009e\n\22\r\22\16\22\u009f"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ac\n\23\3\23"+
		"\6\23\u00af\n\23\r\23\16\23\u00b0\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\7\24\u00be\n\24\f\24\16\24\u00c1\13\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u00cb\n\25\f\25\16\25\u00ce\13\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u00d6\n\26\f\26\16\26\u00d9\13\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u00e2\n\27\r\27\16\27\u00e3\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u00f5\n\31\3\31\6\31\u00f8\n\31\r\31\16\31\u00f9"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0101\n\32\3\32\6\32\u0104\n\32\r\32\16"+
		"\32\u0105\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010e\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0117\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u011e"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0126\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u012e\n\37\f\37\16\37\u0131\13\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0146\n#\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$"+
		"\u0164\n$\2\2%\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\2\27\b\31\t"+
		"\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67"+
		"\309\31;\32=\33?\34A\35C\36E\37G \3\2\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3"+
		"\2\62;\4\2aac|\6\2\62;C\\aac|\5\2,-//\61\61\2\u0184\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2"+
		"\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17X\3\2\2\2\21"+
		"Z\3\2\2\2\23\\\3\2\2\2\25d\3\2\2\2\27l\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2"+
		"\35y\3\2\2\2\37\u0081\3\2\2\2!\u008b\3\2\2\2#\u009a\3\2\2\2%\u00ab\3\2"+
		"\2\2\'\u00b2\3\2\2\2)\u00c2\3\2\2\2+\u00cf\3\2\2\2-\u00da\3\2\2\2/\u00e5"+
		"\3\2\2\2\61\u00f4\3\2\2\2\63\u0100\3\2\2\2\65\u0107\3\2\2\2\67\u010f\3"+
		"\2\2\29\u0118\3\2\2\2;\u0125\3\2\2\2=\u0127\3\2\2\2?\u0132\3\2\2\2A\u0138"+
		"\3\2\2\2C\u013a\3\2\2\2E\u0145\3\2\2\2G\u0163\3\2\2\2IJ\7*\2\2J\4\3\2"+
		"\2\2KL\7.\2\2L\6\3\2\2\2MN\7+\2\2N\b\3\2\2\2OP\7<\2\2P\n\3\2\2\2QR\t\2"+
		"\2\2R\f\3\2\2\2ST\t\3\2\2T\16\3\2\2\2UY\7%\2\2VW\7\62\2\2WY\t\4\2\2XU"+
		"\3\2\2\2XV\3\2\2\2Y\20\3\2\2\2Z[\t\5\2\2[\22\3\2\2\2\\]\5\17\b\2]^\5\r"+
		"\7\2^_\5\r\7\2_`\5\r\7\2`a\5\r\7\2ab\5\r\7\2bc\5\r\7\2c\24\3\2\2\2dh\5"+
		"\13\6\2eg\5\21\t\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\26\3\2\2\2"+
		"jh\3\2\2\2km\t\6\2\2lk\3\2\2\2mq\3\2\2\2np\t\7\2\2on\3\2\2\2ps\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2r\30\3\2\2\2sq\3\2\2\2tu\5\25\13\2u\32\3\2\2\2vw\7"+
		"\"\2\2w\34\3\2\2\2xz\7\17\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2"+
		"|\36\3\2\2\2}~\7C\2\2~\177\7P\2\2\177\u0082\7F\2\2\u0080\u0082\7(\2\2"+
		"\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5"+
		"\33\16\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087 \3\2\2\2\u0088\u0089\7Q\2\2\u0089\u008c\7T\2\2\u008a"+
		"\u008c\7~\2\2\u008b\u0088\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008f\5\33\16\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\"\3\2\2\2\u0092\u0093\7V\2\2"+
		"\u0093\u0094\7T\2\2\u0094\u0095\7W\2\2\u0095\u009b\7G\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7w\2\2\u0099\u009b\7g\2\2\u009a"+
		"\u0092\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5\33"+
		"\16\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3\7C\2\2\u00a3"+
		"\u00a4\7N\2\2\u00a4\u00a5\7U\2\2\u00a5\u00ac\7G\2\2\u00a6\u00a7\7h\2\2"+
		"\u00a7\u00a8\7c\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ac"+
		"\7g\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00af\5\33\16\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7T\2\2\u00b3\u00b4"+
		"\7G\2\2\u00b4\u00b5\7E\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b7\7C\2\2\u00b7"+
		"\u00b8\7P\2\2\u00b8\u00b9\7I\2\2\u00b9\u00ba\7N\2\2\u00ba\u00bb\7G\2\2"+
		"\u00bb\u00bf\3\2\2\2\u00bc\u00be\5\33\16\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0(\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7T\2"+
		"\2\u00c5\u00c6\7E\2\2\u00c6\u00c7\7N\2\2\u00c7\u00c8\7G\2\2\u00c8\u00cc"+
		"\3\2\2\2\u00c9\u00cb\5\33\16\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd*\3\2\2\2\u00ce\u00cc\3"+
		"\2\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7P\2\2\u00d2"+
		"\u00d3\7G\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\5\33\16\2\u00d5\u00d4\3"+
		"\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		",\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7D\2\2\u00db\u00dc\7G\2\2\u00dc"+
		"\u00dd\7I\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7P\2\2\u00df\u00e1\3\2\2"+
		"\2\u00e0\u00e2\5\33\16\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7G\2\2\u00e6"+
		"\u00e7\7P\2\2\u00e7\u00e8\7F\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\5\33"+
		"\16\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\60\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7K\2\2"+
		"\u00f0\u00f5\7H\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f5\7h\2\2\u00f3\u00f5"+
		"\7A\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f8\5\33\16\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\62\3\2\2\2\u00fb"+
		"\u0101\7#\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7N\2\2\u00fe\u00ff\7U\2\2"+
		"\u00ff\u0101\7G\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u0104\5\33\16\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\64\3\2\2\2\u0107\u0108"+
		"\7V\2\2\u0108\u0109\7J\2\2\u0109\u010a\7G\2\2\u010a\u010b\7P\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010e\5\33\16\2\u010d\u010c\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\66\3\2\2\2\u010f\u0110\7Y\2\2\u0110\u0111\7J\2\2\u0111\u0112"+
		"\7K\2\2\u0112\u0113\7N\2\2\u0113\u0114\7G\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0117\5\33\16\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u01178\3\2\2"+
		"\2\u0118\u0119\7F\2\2\u0119\u011a\7G\2\2\u011a\u011b\7H\2\2\u011b\u011d"+
		"\3\2\2\2\u011c\u011e\5\33\16\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e:\3\2\2\2\u011f\u0120\7T\2\2\u0120\u0121\7I\2\2\u0121\u0126\7D\2"+
		"\2\u0122\u0123\7t\2\2\u0123\u0124\7i\2\2\u0124\u0126\7d\2\2\u0125\u011f"+
		"\3\2\2\2\u0125\u0122\3\2\2\2\u0126<\3\2\2\2\u0127\u0128\7F\2\2\u0128\u0129"+
		"\7T\2\2\u0129\u012a\7C\2\2\u012a\u012b\7Y\2\2\u012b\u012f\3\2\2\2\u012c"+
		"\u012e\5\33\16\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130>\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133"+
		"\7D\2\2\u0133\u0134\7N\2\2\u0134\u0135\7Q\2\2\u0135\u0136\7E\2\2\u0136"+
		"\u0137\7M\2\2\u0137@\3\2\2\2\u0138\u0139\7?\2\2\u0139B\3\2\2\2\u013a\u013b"+
		"\t\b\2\2\u013bD\3\2\2\2\u013c\u013d\7?\2\2\u013d\u0146\7?\2\2\u013e\u0146"+
		"\7>\2\2\u013f\u0140\7>\2\2\u0140\u0146\7?\2\2\u0141\u0146\7@\2\2\u0142"+
		"\u0143\7@\2\2\u0143\u0146\7?\2\2\u0144\u0146\7\u0080\2\2\u0145\u013c\3"+
		"\2\2\2\u0145\u013e\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0141\3\2\2\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146F\3\2\2\2\u0147\u0148\7T\2\2\u0148"+
		"\u0149\7G\2\2\u0149\u0164\7F\2\2\u014a\u014b\7D\2\2\u014b\u014c\7N\2\2"+
		"\u014c\u014d\7W\2\2\u014d\u0164\7G\2\2\u014e\u014f\7[\2\2\u014f\u0150"+
		"\7G\2\2\u0150\u0151\7N\2\2\u0151\u0152\7N\2\2\u0152\u0153\7Q\2\2\u0153"+
		"\u0164\7Y\2\2\u0154\u0155\7I\2\2\u0155\u0156\7T\2\2\u0156\u0157\7G\2\2"+
		"\u0157\u0158\7G\2\2\u0158\u0164\7P\2\2\u0159\u015a\7Y\2\2\u015a\u015b"+
		"\7J\2\2\u015b\u015c\7K\2\2\u015c\u015d\7V\2\2\u015d\u0164\7G\2\2\u015e"+
		"\u015f\7D\2\2\u015f\u0160\7N\2\2\u0160\u0161\7C\2\2\u0161\u0162\7E\2\2"+
		"\u0162\u0164\7M\2\2\u0163\u0147\3\2\2\2\u0163\u014a\3\2\2\2\u0163\u014e"+
		"\3\2\2\2\u0163\u0154\3\2\2\2\u0163\u0159\3\2\2\2\u0163\u015e\3\2\2\2\u0164"+
		"H\3\2\2\2!\2Xhloqy\u0081\u0086\u008b\u0090\u009a\u009f\u00ab\u00b0\u00bf"+
		"\u00cc\u00d7\u00e3\u00ec\u00f4\u00f9\u0100\u0105\u010d\u0116\u011d\u0125"+
		"\u012f\u0145\u0163\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}