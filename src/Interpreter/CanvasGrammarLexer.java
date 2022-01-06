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
		T__0=1, T__1=2, T__2=3, T__3=4, HexColor=5, Integer=6, VariableName=7, 
		SPACE=8, ENDL=9, AND=10, OR=11, TRUE=12, FALSE=13, RECTANGLE=14, CIRCLE=15, 
		LINE=16, BEGIN=17, END=18, IF=19, ELSE=20, THEN=21, WHILE=22, DEF=23, 
		RGB=24, DRAW=25, BLOCK=26, AssignOperator=27, TopScopeModifier=28, HigherScopeModifier=29, 
		Minus=30, Plus=31, Mult=32, Divide=33, ComprehensionOperator=34, ColorName=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "VariableName", "SPACE", "ENDL", "AND", 
			"OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", "BEGIN", "END", 
			"IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", "BLOCK", "AssignOperator", 
			"TopScopeModifier", "HigherScopeModifier", "Minus", "Plus", "Mult", "Divide", 
			"ComprehensionOperator", "ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'BLOCK'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "Integer", "VariableName", 
			"SPACE", "ENDL", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", 
			"LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", 
			"DRAW", "BLOCK", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13o\n\13\f\13\16\13r\13\13\3\13\5\13"+
		"u\n\13\3\f\5\fx\n\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\6\r\u0081\n\r\r\r"+
		"\16\r\u0082\3\r\3\r\3\16\5\16\u0088\n\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u0090\n\17\3\17\6\17\u0093\n\17\r\17\16\17\u0094\3\20\3\20\3\20"+
		"\5\20\u009a\n\20\3\20\6\20\u009d\n\20\r\20\16\20\u009e\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3\21\6\21\u00ac\n\21\r\21\16"+
		"\21\u00ad\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ba"+
		"\n\22\3\22\6\22\u00bd\n\22\r\22\16\22\u00be\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\7\23\u00cc\n\23\f\23\16\23\u00cf\13\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d9\n\24\f\24\16\24\u00dc"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00e4\n\25\f\25\16\25\u00e7"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00f0\n\26\r\26\16\26\u00f1"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0103\n\30\3\30\6\30\u0106\n\30\r\30\16\30\u0107"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u010f\n\31\3\31\6\31\u0112\n\31\r\31\16"+
		"\31\u0113\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u011c\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0125\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u012c"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0134\n\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u013c\n\36\f\36\16\36\u013f\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u015f\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u017d\n(\2\2)"+
		"\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31\n\33\13\35\f\37"+
		"\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34"+
		"?\35A\36C\37E G!I\"K#M$O%\3\2\b\3\2\63;\5\2\62;CHch\4\2ZZzz\3\2\62;\4"+
		"\2aac|\6\2\62;C\\aac|\2\u01a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13"+
		"Y\3\2\2\2\r[\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25t\3\2\2\2\27"+
		"w\3\2\2\2\31\u0080\3\2\2\2\33\u0087\3\2\2\2\35\u008f\3\2\2\2\37\u0099"+
		"\3\2\2\2!\u00a8\3\2\2\2#\u00b9\3\2\2\2%\u00c0\3\2\2\2\'\u00d0\3\2\2\2"+
		")\u00dd\3\2\2\2+\u00e8\3\2\2\2-\u00f3\3\2\2\2/\u0102\3\2\2\2\61\u010e"+
		"\3\2\2\2\63\u0115\3\2\2\2\65\u011d\3\2\2\2\67\u0126\3\2\2\29\u0133\3\2"+
		"\2\2;\u0135\3\2\2\2=\u0140\3\2\2\2?\u0146\3\2\2\2A\u0148\3\2\2\2C\u014b"+
		"\3\2\2\2E\u014d\3\2\2\2G\u014f\3\2\2\2I\u0151\3\2\2\2K\u0153\3\2\2\2M"+
		"\u015e\3\2\2\2O\u017c\3\2\2\2QR\7*\2\2R\4\3\2\2\2ST\7.\2\2T\6\3\2\2\2"+
		"UV\7+\2\2V\b\3\2\2\2WX\7<\2\2X\n\3\2\2\2YZ\t\2\2\2Z\f\3\2\2\2[\\\t\3\2"+
		"\2\\\16\3\2\2\2]a\7%\2\2^_\7\62\2\2_a\t\4\2\2`]\3\2\2\2`^\3\2\2\2a\20"+
		"\3\2\2\2bc\t\5\2\2c\22\3\2\2\2de\5\17\b\2ef\5\r\7\2fg\5\r\7\2gh\5\r\7"+
		"\2hi\5\r\7\2ij\5\r\7\2jk\5\r\7\2k\24\3\2\2\2lp\5\13\6\2mo\5\21\t\2nm\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qu\3\2\2\2rp\3\2\2\2su\7\62\2\2tl"+
		"\3\2\2\2ts\3\2\2\2u\26\3\2\2\2vx\t\6\2\2wv\3\2\2\2x|\3\2\2\2y{\t\7\2\2"+
		"zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\30\3\2\2\2~|\3\2\2\2\177\u0081"+
		"\7\"\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\r\2\2\u0085\32\3\2\2"+
		"\2\u0086\u0088\7\17\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a\34\3\2\2\2\u008b\u008c\7C\2\2"+
		"\u008c\u008d\7P\2\2\u008d\u0090\7F\2\2\u008e\u0090\7(\2\2\u008f\u008b"+
		"\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5\31\r\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\36\3\2\2\2\u0096\u0097\7Q\2\2\u0097\u009a\7T\2\2\u0098"+
		"\u009a\7~\2\2\u0099\u0096\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u009d\5\31\r\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f \3\2\2\2\u00a0\u00a1\7V\2\2\u00a1"+
		"\u00a2\7T\2\2\u00a2\u00a3\7W\2\2\u00a3\u00a9\7G\2\2\u00a4\u00a5\7v\2\2"+
		"\u00a5\u00a6\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a9\7g\2\2\u00a8\u00a0"+
		"\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5\31\r\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7H\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2"+
		"\7N\2\2\u00b2\u00b3\7U\2\2\u00b3\u00ba\7G\2\2\u00b4\u00b5\7h\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00ba\7g\2\2"+
		"\u00b9\u00af\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd"+
		"\5\31\r\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7T\2\2\u00c1\u00c2\7G"+
		"\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7V\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6"+
		"\7P\2\2\u00c6\u00c7\7I\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7G\2\2\u00c9"+
		"\u00cd\3\2\2\2\u00ca\u00cc\5\31\r\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce&\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7T\2\2\u00d3"+
		"\u00d4\7E\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7G\2\2\u00d6\u00da\3\2\2"+
		"\2\u00d7\u00d9\5\31\r\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db(\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dd\u00de\7N\2\2\u00de\u00df\7K\2\2\u00df\u00e0\7P\2\2\u00e0\u00e1"+
		"\7G\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\5\31\r\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6*\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7D\2\2\u00e9\u00ea\7G\2\2\u00ea\u00eb"+
		"\7I\2\2\u00eb\u00ec\7K\2\2\u00ec\u00ed\7P\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00f0\5\31\r\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2,\3\2\2\2\u00f3\u00f4\7G\2\2\u00f4\u00f5"+
		"\7P\2\2\u00f5\u00f6\7F\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\5\31\r\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb.\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7K\2\2\u00fe\u0103"+
		"\7H\2\2\u00ff\u0100\7k\2\2\u0100\u0103\7h\2\2\u0101\u0103\7A\2\2\u0102"+
		"\u00fd\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0106\5\31\r\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\60\3\2\2\2\u0109\u010f\7#\2\2"+
		"\u010a\u010b\7G\2\2\u010b\u010c\7N\2\2\u010c\u010d\7U\2\2\u010d\u010f"+
		"\7G\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0112\5\31\r\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114\62\3\2\2\2\u0115\u0116\7V\2\2\u0116\u0117"+
		"\7J\2\2\u0117\u0118\7G\2\2\u0118\u0119\7P\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u011c\5\31\r\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\64\3\2\2"+
		"\2\u011d\u011e\7Y\2\2\u011e\u011f\7J\2\2\u011f\u0120\7K\2\2\u0120\u0121"+
		"\7N\2\2\u0121\u0122\7G\2\2\u0122\u0124\3\2\2\2\u0123\u0125\5\31\r\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\66\3\2\2\2\u0126\u0127\7F\2\2"+
		"\u0127\u0128\7G\2\2\u0128\u0129\7H\2\2\u0129\u012b\3\2\2\2\u012a\u012c"+
		"\5\31\r\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c8\3\2\2\2\u012d"+
		"\u012e\7T\2\2\u012e\u012f\7I\2\2\u012f\u0134\7D\2\2\u0130\u0131\7t\2\2"+
		"\u0131\u0132\7i\2\2\u0132\u0134\7d\2\2\u0133\u012d\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0134:\3\2\2\2\u0135\u0136\7F\2\2\u0136\u0137\7T\2\2\u0137\u0138"+
		"\7C\2\2\u0138\u0139\7Y\2\2\u0139\u013d\3\2\2\2\u013a\u013c\5\31\r\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e<\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7D\2\2\u0141\u0142"+
		"\7N\2\2\u0142\u0143\7Q\2\2\u0143\u0144\7E\2\2\u0144\u0145\7M\2\2\u0145"+
		">\3\2\2\2\u0146\u0147\7?\2\2\u0147@\3\2\2\2\u0148\u0149\7`\2\2\u0149\u014a"+
		"\7`\2\2\u014aB\3\2\2\2\u014b\u014c\7`\2\2\u014cD\3\2\2\2\u014d\u014e\7"+
		"/\2\2\u014eF\3\2\2\2\u014f\u0150\7-\2\2\u0150H\3\2\2\2\u0151\u0152\7,"+
		"\2\2\u0152J\3\2\2\2\u0153\u0154\7\61\2\2\u0154L\3\2\2\2\u0155\u0156\7"+
		"?\2\2\u0156\u015f\7?\2\2\u0157\u015f\7>\2\2\u0158\u0159\7>\2\2\u0159\u015f"+
		"\7?\2\2\u015a\u015f\7@\2\2\u015b\u015c\7@\2\2\u015c\u015f\7?\2\2\u015d"+
		"\u015f\7\u0080\2\2\u015e\u0155\3\2\2\2\u015e\u0157\3\2\2\2\u015e\u0158"+
		"\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"N\3\2\2\2\u0160\u0161\7T\2\2\u0161\u0162\7G\2\2\u0162\u017d\7F\2\2\u0163"+
		"\u0164\7D\2\2\u0164\u0165\7N\2\2\u0165\u0166\7W\2\2\u0166\u017d\7G\2\2"+
		"\u0167\u0168\7[\2\2\u0168\u0169\7G\2\2\u0169\u016a\7N\2\2\u016a\u016b"+
		"\7N\2\2\u016b\u016c\7Q\2\2\u016c\u017d\7Y\2\2\u016d\u016e\7I\2\2\u016e"+
		"\u016f\7T\2\2\u016f\u0170\7G\2\2\u0170\u0171\7G\2\2\u0171\u017d\7P\2\2"+
		"\u0172\u0173\7Y\2\2\u0173\u0174\7J\2\2\u0174\u0175\7K\2\2\u0175\u0176"+
		"\7V\2\2\u0176\u017d\7G\2\2\u0177\u0178\7D\2\2\u0178\u0179\7N\2\2\u0179"+
		"\u017a\7C\2\2\u017a\u017b\7E\2\2\u017b\u017d\7M\2\2\u017c\u0160\3\2\2"+
		"\2\u017c\u0163\3\2\2\2\u017c\u0167\3\2\2\2\u017c\u016d\3\2\2\2\u017c\u0172"+
		"\3\2\2\2\u017c\u0177\3\2\2\2\u017dP\3\2\2\2#\2`ptwz|\u0082\u0087\u008f"+
		"\u0094\u0099\u009e\u00a8\u00ad\u00b9\u00be\u00cd\u00da\u00e5\u00f1\u00fa"+
		"\u0102\u0107\u010e\u0113\u011b\u0124\u012b\u0133\u013d\u015e\u017c\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}