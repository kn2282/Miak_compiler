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
		RGB=24, DRAW=25, AssignOperator=26, ArithmeticOperator=27, ComprehensionOperator=28, 
		ColorName=29;
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
			"AssignOperator", "ArithmeticOperator", "ComprehensionOperator", "ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, "'\n'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "VariableName", "Constant", 
			"SPACE", "ENDL", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", 
			"LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", 
			"DRAW", "AssignOperator", "ArithmeticOperator", "ComprehensionOperator", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u015a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\5\bW\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\7\13e\n\13\f\13\16\13h\13\13\3\f\5\fk\n\f\3\f\7\fn\n\f\f\f\16\fq\13\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20}\n\20\3\20\6\20"+
		"\u0080\n\20\r\20\16\20\u0081\3\21\3\21\3\21\5\21\u0087\n\21\3\21\6\21"+
		"\u008a\n\21\r\21\16\21\u008b\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0096\n\22\3\22\6\22\u0099\n\22\r\22\16\22\u009a\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a7\n\23\3\23\6\23\u00aa\n\23"+
		"\r\23\16\23\u00ab\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u00b9\n\24\f\24\16\24\u00bc\13\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u00c6\n\25\f\25\16\25\u00c9\13\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00d1\n\26\f\26\16\26\u00d4\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\6\27\u00dd\n\27\r\27\16\27\u00de\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00e6\n\30\f\30\16\30\u00e9\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00f0\n\31\3\31\6\31\u00f3\n\31\r\31\16\31\u00f4\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u00fc\n\32\3\32\6\32\u00ff\n\32\r\32\16\32\u0100\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0109\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0112\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0119\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u0121\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u0129\n\37\f\37\16\37\u012c\13\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u013b\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0159\n#\2\2$\3\3\5"+
		"\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\2\27\b\31\t\33\n\35\13\37\f!\r#"+
		"\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A"+
		"\35C\36E\37\3\2\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3\2\62;\4\2aac|\6\2\62;"+
		"C\\aac|\5\2,-//\61\61\2\u0178\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2"+
		"\13O\3\2\2\2\rQ\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25b\3\2\2"+
		"\2\27j\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37|\3\2\2\2!\u0086"+
		"\3\2\2\2#\u0095\3\2\2\2%\u00a6\3\2\2\2\'\u00ad\3\2\2\2)\u00bd\3\2\2\2"+
		"+\u00ca\3\2\2\2-\u00d5\3\2\2\2/\u00e0\3\2\2\2\61\u00ef\3\2\2\2\63\u00fb"+
		"\3\2\2\2\65\u0102\3\2\2\2\67\u010a\3\2\2\29\u0113\3\2\2\2;\u0120\3\2\2"+
		"\2=\u0122\3\2\2\2?\u012d\3\2\2\2A\u012f\3\2\2\2C\u013a\3\2\2\2E\u0158"+
		"\3\2\2\2GH\7*\2\2H\4\3\2\2\2IJ\7.\2\2J\6\3\2\2\2KL\7+\2\2L\b\3\2\2\2M"+
		"N\7<\2\2N\n\3\2\2\2OP\t\2\2\2P\f\3\2\2\2QR\t\3\2\2R\16\3\2\2\2SW\7%\2"+
		"\2TU\7\62\2\2UW\t\4\2\2VS\3\2\2\2VT\3\2\2\2W\20\3\2\2\2XY\t\5\2\2Y\22"+
		"\3\2\2\2Z[\5\17\b\2[\\\5\r\7\2\\]\5\r\7\2]^\5\r\7\2^_\5\r\7\2_`\5\r\7"+
		"\2`a\5\r\7\2a\24\3\2\2\2bf\5\13\6\2ce\5\21\t\2dc\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2g\26\3\2\2\2hf\3\2\2\2ik\t\6\2\2ji\3\2\2\2ko\3\2\2\2l"+
		"n\t\7\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\30\3\2\2\2qo\3\2\2"+
		"\2rs\5\25\13\2s\32\3\2\2\2tu\7\"\2\2u\34\3\2\2\2vw\7\f\2\2w\36\3\2\2\2"+
		"xy\7C\2\2yz\7P\2\2z}\7F\2\2{}\7(\2\2|x\3\2\2\2|{\3\2\2\2}\177\3\2\2\2"+
		"~\u0080\5\33\16\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082 \3\2\2\2\u0083\u0084\7Q\2\2\u0084\u0087\7T\2\2\u0085"+
		"\u0087\7~\2\2\u0086\u0083\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u008a\5\33\16\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\"\3\2\2\2\u008d\u008e\7V\2\2"+
		"\u008e\u008f\7T\2\2\u008f\u0090\7W\2\2\u0090\u0096\7G\2\2\u0091\u0092"+
		"\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u0096\7g\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5\33"+
		"\16\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b$\3\2\2\2\u009c\u009d\7H\2\2\u009d\u009e\7C\2\2\u009e"+
		"\u009f\7N\2\2\u009f\u00a0\7U\2\2\u00a0\u00a7\7G\2\2\u00a1\u00a2\7h\2\2"+
		"\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a7"+
		"\7g\2\2\u00a6\u009c\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00aa\5\33\16\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af"+
		"\7G\2\2\u00af\u00b0\7E\2\2\u00b0\u00b1\7V\2\2\u00b1\u00b2\7C\2\2\u00b2"+
		"\u00b3\7P\2\2\u00b3\u00b4\7I\2\2\u00b4\u00b5\7N\2\2\u00b5\u00b6\7G\2\2"+
		"\u00b6\u00ba\3\2\2\2\u00b7\u00b9\5\33\16\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb(\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7T\2"+
		"\2\u00c0\u00c1\7E\2\2\u00c1\u00c2\7N\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c7"+
		"\3\2\2\2\u00c4\u00c6\5\33\16\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8*\3\2\2\2\u00c9\u00c7\3"+
		"\2\2\2\u00ca\u00cb\7N\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7P\2\2\u00cd"+
		"\u00ce\7G\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1\5\33\16\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		",\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7D\2\2\u00d6\u00d7\7G\2\2\u00d7"+
		"\u00d8\7I\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7P\2\2\u00da\u00dc\3\2\2"+
		"\2\u00db\u00dd\5\33\16\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df.\3\2\2\2\u00e0\u00e1\7G\2\2\u00e1"+
		"\u00e2\7P\2\2\u00e2\u00e3\7F\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e6\5\33"+
		"\16\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\60\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7K\2\2"+
		"\u00eb\u00f0\7H\2\2\u00ec\u00ed\7k\2\2\u00ed\u00f0\7h\2\2\u00ee\u00f0"+
		"\7A\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00f3\5\33\16\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\62\3\2\2\2\u00f6"+
		"\u00fc\7#\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9\7N\2\2\u00f9\u00fa\7U\2\2"+
		"\u00fa\u00fc\7G\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\u00fe"+
		"\3\2\2\2\u00fd\u00ff\5\33\16\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\64\3\2\2\2\u0102\u0103"+
		"\7V\2\2\u0103\u0104\7J\2\2\u0104\u0105\7G\2\2\u0105\u0106\7P\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0109\5\33\16\2\u0108\u0107\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\66\3\2\2\2\u010a\u010b\7Y\2\2\u010b\u010c\7J\2\2\u010c\u010d"+
		"\7K\2\2\u010d\u010e\7N\2\2\u010e\u010f\7G\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0112\5\33\16\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u01128\3\2\2"+
		"\2\u0113\u0114\7F\2\2\u0114\u0115\7G\2\2\u0115\u0116\7H\2\2\u0116\u0118"+
		"\3\2\2\2\u0117\u0119\5\33\16\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119:\3\2\2\2\u011a\u011b\7T\2\2\u011b\u011c\7I\2\2\u011c\u0121\7D\2"+
		"\2\u011d\u011e\7t\2\2\u011e\u011f\7i\2\2\u011f\u0121\7d\2\2\u0120\u011a"+
		"\3\2\2\2\u0120\u011d\3\2\2\2\u0121<\3\2\2\2\u0122\u0123\7F\2\2\u0123\u0124"+
		"\7T\2\2\u0124\u0125\7C\2\2\u0125\u0126\7Y\2\2\u0126\u012a\3\2\2\2\u0127"+
		"\u0129\5\33\16\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b>\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e"+
		"\7?\2\2\u012e@\3\2\2\2\u012f\u0130\t\b\2\2\u0130B\3\2\2\2\u0131\u0132"+
		"\7?\2\2\u0132\u013b\7?\2\2\u0133\u013b\7>\2\2\u0134\u0135\7>\2\2\u0135"+
		"\u013b\7?\2\2\u0136\u013b\7@\2\2\u0137\u0138\7@\2\2\u0138\u013b\7?\2\2"+
		"\u0139\u013b\7\u0080\2\2\u013a\u0131\3\2\2\2\u013a\u0133\3\2\2\2\u013a"+
		"\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0139\3\2"+
		"\2\2\u013bD\3\2\2\2\u013c\u013d\7T\2\2\u013d\u013e\7G\2\2\u013e\u0159"+
		"\7F\2\2\u013f\u0140\7D\2\2\u0140\u0141\7N\2\2\u0141\u0142\7W\2\2\u0142"+
		"\u0159\7G\2\2\u0143\u0144\7[\2\2\u0144\u0145\7G\2\2\u0145\u0146\7N\2\2"+
		"\u0146\u0147\7N\2\2\u0147\u0148\7Q\2\2\u0148\u0159\7Y\2\2\u0149\u014a"+
		"\7I\2\2\u014a\u014b\7T\2\2\u014b\u014c\7G\2\2\u014c\u014d\7G\2\2\u014d"+
		"\u0159\7P\2\2\u014e\u014f\7Y\2\2\u014f\u0150\7J\2\2\u0150\u0151\7K\2\2"+
		"\u0151\u0152\7V\2\2\u0152\u0159\7G\2\2\u0153\u0154\7D\2\2\u0154\u0155"+
		"\7N\2\2\u0155\u0156\7C\2\2\u0156\u0157\7E\2\2\u0157\u0159\7M\2\2\u0158"+
		"\u013c\3\2\2\2\u0158\u013f\3\2\2\2\u0158\u0143\3\2\2\2\u0158\u0149\3\2"+
		"\2\2\u0158\u014e\3\2\2\2\u0158\u0153\3\2\2\2\u0159F\3\2\2\2 \2Vfjmo|\u0081"+
		"\u0086\u008b\u0095\u009a\u00a6\u00ab\u00ba\u00c7\u00d2\u00de\u00e7\u00ef"+
		"\u00f4\u00fb\u0100\u0108\u0111\u0118\u0120\u012a\u013a\u0158\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}