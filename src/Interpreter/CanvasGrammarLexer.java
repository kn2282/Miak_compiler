package Interpreter;// Generated from C:/Materia�y/MIAK/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
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
		DEF=24, RGB=25, DRAW=26, BLOCK=27, AssignOperator=28, TopScopeModifier=29, 
		HigherScopeModifier=30, Minus=31, Plus=32, Mult=33, Divide=34, ComprehensionOperator=35, 
		ColorName=36;
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
			"AssignOperator", "TopScopeModifier", "HigherScopeModifier", "Minus", 
			"Plus", "Mult", "Divide", "ComprehensionOperator", "ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, "'CIRCLE'", "'LINE'", "'BEGIN'", "'END'", 
			null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", "'BLOCK'", 
			"'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "Integer", "VariableName", 
			"SPACE", "ENDL", "COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", 
			"CIRCLE", "LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", 
			"RGB", "DRAW", "BLOCK", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"Minus", "Plus", "Mult", "Divide", "ComprehensionOperator", "ColorName"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bc\n\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13q\n\13\f\13\16\13t\13\13\3\13"+
		"\5\13w\n\13\3\f\5\fz\n\f\3\f\7\f}\n\f\f\f\16\f\u0080\13\f\3\r\6\r\u0083"+
		"\n\r\r\r\16\r\u0084\3\r\3\r\3\16\5\16\u008a\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u009f\n\20\3\21\3\21\3\21\5\21\u00a4\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ae\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ba\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00e1\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00e8"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ff\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0124\n(\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0142"+
		"\n)\2\2*\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31\n\33\13"+
		"\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32"+
		";\33=\34?\35A\36C\37E G!I\"K#M$O%Q&\3\2\t\3\2\63;\5\2\62;CHch\4\2ZZzz"+
		"\3\2\62;\4\2aac|\6\2\62;C\\aac|\4\2\13\13\"\u0080\2\u0157\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3"+
		"\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17b\3\2"+
		"\2\2\21d\3\2\2\2\23f\3\2\2\2\25v\3\2\2\2\27y\3\2\2\2\31\u0082\3\2\2\2"+
		"\33\u0089\3\2\2\2\35\u008d\3\2\2\2\37\u009e\3\2\2\2!\u00a3\3\2\2\2#\u00ad"+
		"\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00c5\3\2\2\2+\u00cc\3\2\2\2"+
		"-\u00d1\3\2\2\2/\u00d7\3\2\2\2\61\u00e0\3\2\2\2\63\u00e7\3\2\2\2\65\u00e9"+
		"\3\2\2\2\67\u00ee\3\2\2\29\u00f4\3\2\2\2;\u00fe\3\2\2\2=\u0100\3\2\2\2"+
		"?\u0105\3\2\2\2A\u010b\3\2\2\2C\u010d\3\2\2\2E\u0110\3\2\2\2G\u0112\3"+
		"\2\2\2I\u0114\3\2\2\2K\u0116\3\2\2\2M\u0118\3\2\2\2O\u0123\3\2\2\2Q\u0141"+
		"\3\2\2\2ST\7*\2\2T\4\3\2\2\2UV\7.\2\2V\6\3\2\2\2WX\7+\2\2X\b\3\2\2\2Y"+
		"Z\7<\2\2Z\n\3\2\2\2[\\\t\2\2\2\\\f\3\2\2\2]^\t\3\2\2^\16\3\2\2\2_c\7%"+
		"\2\2`a\7\62\2\2ac\t\4\2\2b_\3\2\2\2b`\3\2\2\2c\20\3\2\2\2de\t\5\2\2e\22"+
		"\3\2\2\2fg\5\17\b\2gh\5\r\7\2hi\5\r\7\2ij\5\r\7\2jk\5\r\7\2kl\5\r\7\2"+
		"lm\5\r\7\2m\24\3\2\2\2nr\5\13\6\2oq\5\21\t\2po\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2sw\3\2\2\2tr\3\2\2\2uw\7\62\2\2vn\3\2\2\2vu\3\2\2\2w\26"+
		"\3\2\2\2xz\t\6\2\2yx\3\2\2\2z~\3\2\2\2{}\t\7\2\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\30\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\7\"\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\r\2\2\u0087\32\3\2\2"+
		"\2\u0088\u008a\7\17\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\7\f\2\2\u008c\34\3\2\2\2\u008d\u008e\7\61\2"+
		"\2\u008e\u008f\7\61\2\2\u008f\u0093\3\2\2\2\u0090\u0092\t\b\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\33\16\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\b\17\2\2\u0099\36\3\2\2\2\u009a\u009b\7C\2"+
		"\2\u009b\u009c\7P\2\2\u009c\u009f\7F\2\2\u009d\u009f\7(\2\2\u009e\u009a"+
		"\3\2\2\2\u009e\u009d\3\2\2\2\u009f \3\2\2\2\u00a0\u00a1\7Q\2\2\u00a1\u00a4"+
		"\7T\2\2\u00a2\u00a4\7~\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\"\3\2\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7W\2\2\u00a8"+
		"\u00ae\7G\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7w\2\2"+
		"\u00ac\u00ae\7g\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ae$\3\2"+
		"\2\2\u00af\u00b0\7H\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7N\2\2\u00b2\u00b3"+
		"\7U\2\2\u00b3\u00ba\7G\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00ba\7g\2\2\u00b9\u00af\3\2\2"+
		"\2\u00b9\u00b4\3\2\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd\7"+
		"G\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7V\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1"+
		"\7P\2\2\u00c1\u00c2\7I\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c4\7G\2\2\u00c4"+
		"(\3\2\2\2\u00c5\u00c6\7E\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c8\7T\2\2\u00c8"+
		"\u00c9\7E\2\2\u00c9\u00ca\7N\2\2\u00ca\u00cb\7G\2\2\u00cb*\3\2\2\2\u00cc"+
		"\u00cd\7N\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7P\2\2\u00cf\u00d0\7G\2\2"+
		"\u00d0,\3\2\2\2\u00d1\u00d2\7D\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7I\2"+
		"\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7P\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7"+
		"G\2\2\u00d8\u00d9\7P\2\2\u00d9\u00da\7F\2\2\u00da\60\3\2\2\2\u00db\u00dc"+
		"\7K\2\2\u00dc\u00e1\7H\2\2\u00dd\u00de\7k\2\2\u00de\u00e1\7h\2\2\u00df"+
		"\u00e1\7A\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\62\3\2\2\2\u00e2\u00e8\7#\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5"+
		"\7N\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e8\7G\2\2\u00e7\u00e2\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7V\2\2\u00ea\u00eb\7J\2\2"+
		"\u00eb\u00ec\7G\2\2\u00ec\u00ed\7P\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7"+
		"Y\2\2\u00ef\u00f0\7J\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f2\7N\2\2\u00f2\u00f3"+
		"\7G\2\2\u00f38\3\2\2\2\u00f4\u00f5\7F\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7"+
		"\7H\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7T\2\2\u00f9\u00fa\7I\2\2\u00fa\u00ff"+
		"\7D\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7i\2\2\u00fd\u00ff\7d\2\2\u00fe"+
		"\u00f8\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff<\3\2\2\2\u0100\u0101\7F\2\2\u0101"+
		"\u0102\7T\2\2\u0102\u0103\7C\2\2\u0103\u0104\7Y\2\2\u0104>\3\2\2\2\u0105"+
		"\u0106\7D\2\2\u0106\u0107\7N\2\2\u0107\u0108\7Q\2\2\u0108\u0109\7E\2\2"+
		"\u0109\u010a\7M\2\2\u010a@\3\2\2\2\u010b\u010c\7?\2\2\u010cB\3\2\2\2\u010d"+
		"\u010e\7`\2\2\u010e\u010f\7`\2\2\u010fD\3\2\2\2\u0110\u0111\7`\2\2\u0111"+
		"F\3\2\2\2\u0112\u0113\7/\2\2\u0113H\3\2\2\2\u0114\u0115\7-\2\2\u0115J"+
		"\3\2\2\2\u0116\u0117\7,\2\2\u0117L\3\2\2\2\u0118\u0119\7\61\2\2\u0119"+
		"N\3\2\2\2\u011a\u011b\7?\2\2\u011b\u0124\7?\2\2\u011c\u0124\7>\2\2\u011d"+
		"\u011e\7>\2\2\u011e\u0124\7?\2\2\u011f\u0124\7@\2\2\u0120\u0121\7@\2\2"+
		"\u0121\u0124\7?\2\2\u0122\u0124\7\u0080\2\2\u0123\u011a\3\2\2\2\u0123"+
		"\u011c\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0124P\3\2\2\2\u0125\u0126\7T\2\2\u0126\u0127"+
		"\7G\2\2\u0127\u0142\7F\2\2\u0128\u0129\7D\2\2\u0129\u012a\7N\2\2\u012a"+
		"\u012b\7W\2\2\u012b\u0142\7G\2\2\u012c\u012d\7[\2\2\u012d\u012e\7G\2\2"+
		"\u012e\u012f\7N\2\2\u012f\u0130\7N\2\2\u0130\u0131\7Q\2\2\u0131\u0142"+
		"\7Y\2\2\u0132\u0133\7I\2\2\u0133\u0134\7T\2\2\u0134\u0135\7G\2\2\u0135"+
		"\u0136\7G\2\2\u0136\u0142\7P\2\2\u0137\u0138\7Y\2\2\u0138\u0139\7J\2\2"+
		"\u0139\u013a\7K\2\2\u013a\u013b\7V\2\2\u013b\u0142\7G\2\2\u013c\u013d"+
		"\7D\2\2\u013d\u013e\7N\2\2\u013e\u013f\7C\2\2\u013f\u0140\7E\2\2\u0140"+
		"\u0142\7M\2\2\u0141\u0125\3\2\2\2\u0141\u0128\3\2\2\2\u0141\u012c\3\2"+
		"\2\2\u0141\u0132\3\2\2\2\u0141\u0137\3\2\2\2\u0141\u013c\3\2\2\2\u0142"+
		"R\3\2\2\2\25\2brvy|~\u0084\u0089\u0093\u009e\u00a3\u00ad\u00b9\u00e0\u00e7"+
		"\u00fe\u0123\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}