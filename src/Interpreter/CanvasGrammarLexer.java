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
		T__0=1, T__1=2, T__2=3, T__3=4, HexColor=5, Integer=6, VariableName=7, 
		SPACE=8, ENDL=9, COMMENT=10, AND=11, OR=12, TRUE=13, FALSE=14, RECTANGLE=15, 
		CIRCLE=16, LINE=17, BEGIN=18, END=19, IF=20, ELSE=21, THEN=22, WHILE=23, 
		DEF=24, RGB=25, DRAW=26, BLOCK=27, FILL=28, AssignOperator=29, TopScopeModifier=30, 
		HigherScopeModifier=31, Minus=32, Plus=33, Mult=34, Divide=35, ComprehensionOperator=36, 
		ColorName=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "VariableName", "SPACE", "ENDL", "COMMENT", 
			"AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", "BEGIN", 
			"END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", "BLOCK", 
			"FILL", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"Minus", "Plus", "Mult", "Divide", "ComprehensionOperator", "ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, "'CIRCLE'", "'LINE'", "'BEGIN'", "'END'", 
			null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", "'BLOCK'", 
			"'FILL'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "Integer", "VariableName", 
			"SPACE", "ENDL", "COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", 
			"CIRCLE", "LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", 
			"RGB", "DRAW", "BLOCK", "FILL", "AssignOperator", "TopScopeModifier", 
			"HigherScopeModifier", "Minus", "Plus", "Mult", "Divide", "ComprehensionOperator", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\be\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13s\n\13\f\13\16\13v\13\13"+
		"\3\13\5\13y\n\13\3\f\5\f|\n\f\3\f\7\f\177\n\f\f\f\16\f\u0082\13\f\3\r"+
		"\6\r\u0085\n\r\r\r\16\r\u0086\3\r\3\r\3\16\5\16\u008c\n\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\7\17\u0094\n\17\f\17\16\17\u0097\13\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a1\n\20\3\21\3\21\3\21\5\21\u00a6"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b0\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00e3\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00ea\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0101\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u012b"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u0149\n*\2\2+\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2"+
		"\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25"+
		"\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'\3\2"+
		"\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3\2\62;\4\2aac|\6\2\62;C\\aac|\4\2\13\13"+
		"\"\u0080\2\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t["+
		"\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25"+
		"x\3\2\2\2\27{\3\2\2\2\31\u0084\3\2\2\2\33\u008b\3\2\2\2\35\u008f\3\2\2"+
		"\2\37\u00a0\3\2\2\2!\u00a5\3\2\2\2#\u00af\3\2\2\2%\u00bb\3\2\2\2\'\u00bd"+
		"\3\2\2\2)\u00c7\3\2\2\2+\u00ce\3\2\2\2-\u00d3\3\2\2\2/\u00d9\3\2\2\2\61"+
		"\u00e2\3\2\2\2\63\u00e9\3\2\2\2\65\u00eb\3\2\2\2\67\u00f0\3\2\2\29\u00f6"+
		"\3\2\2\2;\u0100\3\2\2\2=\u0102\3\2\2\2?\u0107\3\2\2\2A\u010d\3\2\2\2C"+
		"\u0112\3\2\2\2E\u0114\3\2\2\2G\u0117\3\2\2\2I\u0119\3\2\2\2K\u011b\3\2"+
		"\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u012a\3\2\2\2S\u0148\3\2\2\2UV\7*"+
		"\2\2V\4\3\2\2\2WX\7.\2\2X\6\3\2\2\2YZ\7+\2\2Z\b\3\2\2\2[\\\7<\2\2\\\n"+
		"\3\2\2\2]^\t\2\2\2^\f\3\2\2\2_`\t\3\2\2`\16\3\2\2\2ae\7%\2\2bc\7\62\2"+
		"\2ce\t\4\2\2da\3\2\2\2db\3\2\2\2e\20\3\2\2\2fg\t\5\2\2g\22\3\2\2\2hi\5"+
		"\17\b\2ij\5\r\7\2jk\5\r\7\2kl\5\r\7\2lm\5\r\7\2mn\5\r\7\2no\5\r\7\2o\24"+
		"\3\2\2\2pt\5\13\6\2qs\5\21\t\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"uy\3\2\2\2vt\3\2\2\2wy\7\62\2\2xp\3\2\2\2xw\3\2\2\2y\26\3\2\2\2z|\t\6"+
		"\2\2{z\3\2\2\2|\u0080\3\2\2\2}\177\t\7\2\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\30\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0083\u0085\7\"\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\r\2\2\u0089"+
		"\32\3\2\2\2\u008a\u008c\7\17\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008e\7\f\2\2\u008e\34\3\2\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0095\3\2\2\2\u0092\u0094\t\b\2\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\33\16\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009b\b\17\2\2\u009b\36\3\2\2\2\u009c\u009d"+
		"\7C\2\2\u009d\u009e\7P\2\2\u009e\u00a1\7F\2\2\u009f\u00a1\7(\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7Q\2\2\u00a3"+
		"\u00a6\7T\2\2\u00a4\u00a6\7~\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2"+
		"\2\u00a6\"\3\2\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\7"+
		"W\2\2\u00aa\u00b0\7G\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7w\2\2\u00ae\u00b0\7g\2\2\u00af\u00a7\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"$\3\2\2\2\u00b1\u00b2\7H\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7N\2\2\u00b4"+
		"\u00b5\7U\2\2\u00b5\u00bc\7G\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2"+
		"\u00b8\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bc\7g\2\2\u00bb\u00b1"+
		"\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc&\3\2\2\2\u00bd\u00be\7T\2\2\u00be\u00bf"+
		"\7G\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7V\2\2\u00c1\u00c2\7C\2\2\u00c2"+
		"\u00c3\7P\2\2\u00c3\u00c4\7I\2\2\u00c4\u00c5\7N\2\2\u00c5\u00c6\7G\2\2"+
		"\u00c6(\3\2\2\2\u00c7\u00c8\7E\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7T\2"+
		"\2\u00ca\u00cb\7E\2\2\u00cb\u00cc\7N\2\2\u00cc\u00cd\7G\2\2\u00cd*\3\2"+
		"\2\2\u00ce\u00cf\7N\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2"+
		"\7G\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7D\2\2\u00d4\u00d5\7G\2\2\u00d5\u00d6"+
		"\7I\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d8\7P\2\2\u00d8.\3\2\2\2\u00d9\u00da"+
		"\7G\2\2\u00da\u00db\7P\2\2\u00db\u00dc\7F\2\2\u00dc\60\3\2\2\2\u00dd\u00de"+
		"\7K\2\2\u00de\u00e3\7H\2\2\u00df\u00e0\7k\2\2\u00e0\u00e3\7h\2\2\u00e1"+
		"\u00e3\7A\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\62\3\2\2\2\u00e4\u00ea\7#\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7"+
		"\7N\2\2\u00e7\u00e8\7U\2\2\u00e8\u00ea\7G\2\2\u00e9\u00e4\3\2\2\2\u00e9"+
		"\u00e5\3\2\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7J\2\2"+
		"\u00ed\u00ee\7G\2\2\u00ee\u00ef\7P\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7"+
		"Y\2\2\u00f1\u00f2\7J\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5"+
		"\7G\2\2\u00f58\3\2\2\2\u00f6\u00f7\7F\2\2\u00f7\u00f8\7G\2\2\u00f8\u00f9"+
		"\7H\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7T\2\2\u00fb\u00fc\7I\2\2\u00fc\u0101"+
		"\7D\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7i\2\2\u00ff\u0101\7d\2\2\u0100"+
		"\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101<\3\2\2\2\u0102\u0103\7F\2\2\u0103"+
		"\u0104\7T\2\2\u0104\u0105\7C\2\2\u0105\u0106\7Y\2\2\u0106>\3\2\2\2\u0107"+
		"\u0108\7D\2\2\u0108\u0109\7N\2\2\u0109\u010a\7Q\2\2\u010a\u010b\7E\2\2"+
		"\u010b\u010c\7M\2\2\u010c@\3\2\2\2\u010d\u010e\7H\2\2\u010e\u010f\7K\2"+
		"\2\u010f\u0110\7N\2\2\u0110\u0111\7N\2\2\u0111B\3\2\2\2\u0112\u0113\7"+
		"?\2\2\u0113D\3\2\2\2\u0114\u0115\7`\2\2\u0115\u0116\7`\2\2\u0116F\3\2"+
		"\2\2\u0117\u0118\7`\2\2\u0118H\3\2\2\2\u0119\u011a\7/\2\2\u011aJ\3\2\2"+
		"\2\u011b\u011c\7-\2\2\u011cL\3\2\2\2\u011d\u011e\7,\2\2\u011eN\3\2\2\2"+
		"\u011f\u0120\7\61\2\2\u0120P\3\2\2\2\u0121\u0122\7?\2\2\u0122\u012b\7"+
		"?\2\2\u0123\u012b\7>\2\2\u0124\u0125\7>\2\2\u0125\u012b\7?\2\2\u0126\u012b"+
		"\7@\2\2\u0127\u0128\7@\2\2\u0128\u012b\7?\2\2\u0129\u012b\7\u0080\2\2"+
		"\u012a\u0121\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0126"+
		"\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0129\3\2\2\2\u012bR\3\2\2\2\u012c"+
		"\u012d\7T\2\2\u012d\u012e\7G\2\2\u012e\u0149\7F\2\2\u012f\u0130\7D\2\2"+
		"\u0130\u0131\7N\2\2\u0131\u0132\7W\2\2\u0132\u0149\7G\2\2\u0133\u0134"+
		"\7[\2\2\u0134\u0135\7G\2\2\u0135\u0136\7N\2\2\u0136\u0137\7N\2\2\u0137"+
		"\u0138\7Q\2\2\u0138\u0149\7Y\2\2\u0139\u013a\7I\2\2\u013a\u013b\7T\2\2"+
		"\u013b\u013c\7G\2\2\u013c\u013d\7G\2\2\u013d\u0149\7P\2\2\u013e\u013f"+
		"\7Y\2\2\u013f\u0140\7J\2\2\u0140\u0141\7K\2\2\u0141\u0142\7V\2\2\u0142"+
		"\u0149\7G\2\2\u0143\u0144\7D\2\2\u0144\u0145\7N\2\2\u0145\u0146\7C\2\2"+
		"\u0146\u0147\7E\2\2\u0147\u0149\7M\2\2\u0148\u012c\3\2\2\2\u0148\u012f"+
		"\3\2\2\2\u0148\u0133\3\2\2\2\u0148\u0139\3\2\2\2\u0148\u013e\3\2\2\2\u0148"+
		"\u0143\3\2\2\2\u0149T\3\2\2\2\25\2dtx{~\u0080\u0086\u008b\u0095\u00a0"+
		"\u00a5\u00af\u00bb\u00e2\u00e9\u0100\u012a\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}