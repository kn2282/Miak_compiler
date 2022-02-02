// Generated from D:/AGH/Metody i Algorytmy Kompilacji/lab/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
package pl.edu.agh.Interpreter;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, HexColor=6, Integer=7, Float=8, 
		VariableName=9, SPACE=10, ENDL=11, COMMENT=12, AND=13, OR=14, TRUE=15, 
		FALSE=16, RECTANGLE=17, CIRCLE=18, LINE=19, BEGIN=20, END=21, IF=22, ELSE=23, 
		THEN=24, WHILE=25, DEF=26, RGB=27, DRAW=28, BLOCK=29, FILL=30, AssignOperator=31, 
		TopScopeModifier=32, HigherScopeModifier=33, Minus=34, Plus=35, Mult=36, 
		Divide=37, ROTATED=38, ComprehensionOperator=39, ColorName=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "Float", "VariableName", "SPACE", "ENDL", 
			"COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", "LINE", 
			"BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", "DRAW", 
			"BLOCK", "FILL", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"Minus", "Plus", "Mult", "Divide", "ROTATED", "ComprehensionOperator", 
			"ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEBUG'", "'('", "','", "')'", "':'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'CIRCLE'", "'LINE'", 
			"'BEGIN'", "'END'", null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", 
			"'BLOCK'", "'FILL'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'", 
			"'ROTATED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "HexColor", "Integer", "Float", "VariableName", 
			"SPACE", "ENDL", "COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", 
			"CIRCLE", "LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", 
			"RGB", "DRAW", "BLOCK", "FILL", "AssignOperator", "TopScopeModifier", 
			"HigherScopeModifier", "Minus", "Plus", "Mult", "Divide", "ROTATED", 
			"ComprehensionOperator", "ColorName"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\7\f\177\n\f\f\f\16\f\u0082\13\f\3\f\5\f\u0085\n\f\3"+
		"\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r\3\r\5\r\u008f\n\r\3\r\3\r\3\r"+
		"\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\r\5\r\u009a\n\r\3\16\5\16\u009d\n"+
		"\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\17\6\17\u00a6\n\17\r"+
		"\17\16\17\u00a7\3\17\3\17\3\20\5\20\u00ad\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\7\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00c2\n\22\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d1\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0104\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u010b"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0122\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0154\n,\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\5-\u0172\n-\2\2.\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\2\23\2"+
		"\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26"+
		"\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*\3\2"+
		"\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3\2\62;\4\2aac|\6\2\62;C\\aac|\4\2\13\13"+
		"\"\u0080\2\u018c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3["+
		"\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3"+
		"\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27\u0084\3\2\2\2\31\u008e\3"+
		"\2\2\2\33\u009c\3\2\2\2\35\u00a5\3\2\2\2\37\u00ac\3\2\2\2!\u00b0\3\2\2"+
		"\2#\u00c1\3\2\2\2%\u00c6\3\2\2\2\'\u00d0\3\2\2\2)\u00dc\3\2\2\2+\u00de"+
		"\3\2\2\2-\u00e8\3\2\2\2/\u00ef\3\2\2\2\61\u00f4\3\2\2\2\63\u00fa\3\2\2"+
		"\2\65\u0103\3\2\2\2\67\u010a\3\2\2\29\u010c\3\2\2\2;\u0111\3\2\2\2=\u0117"+
		"\3\2\2\2?\u0121\3\2\2\2A\u0123\3\2\2\2C\u0128\3\2\2\2E\u012e\3\2\2\2G"+
		"\u0133\3\2\2\2I\u0135\3\2\2\2K\u0138\3\2\2\2M\u013a\3\2\2\2O\u013c\3\2"+
		"\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142\3\2\2\2W\u0153\3\2\2\2Y\u0171"+
		"\3\2\2\2[\\\7F\2\2\\]\7G\2\2]^\7D\2\2^_\7W\2\2_`\7I\2\2`\4\3\2\2\2ab\7"+
		"*\2\2b\6\3\2\2\2cd\7.\2\2d\b\3\2\2\2ef\7+\2\2f\n\3\2\2\2gh\7<\2\2h\f\3"+
		"\2\2\2ij\t\2\2\2j\16\3\2\2\2kl\t\3\2\2l\20\3\2\2\2mq\7%\2\2no\7\62\2\2"+
		"oq\t\4\2\2pm\3\2\2\2pn\3\2\2\2q\22\3\2\2\2rs\t\5\2\2s\24\3\2\2\2tu\5\21"+
		"\t\2uv\5\17\b\2vw\5\17\b\2wx\5\17\b\2xy\5\17\b\2yz\5\17\b\2z{\5\17\b\2"+
		"{\26\3\2\2\2|\u0080\5\r\7\2}\177\5\23\n\2~}\3\2\2\2\177\u0082\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0085\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0085\7\62\2\2\u0084|\3\2\2\2\u0084\u0083\3\2\2\2\u0085\30"+
		"\3\2\2\2\u0086\u008a\5\r\7\2\u0087\u0089\5\23\n\2\u0088\u0087\3\2\2\2"+
		"\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\7\62\2\2\u008e\u0086\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0099\7\60\2\2\u0091\u0095"+
		"\5\r\7\2\u0092\u0094\5\23\n\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009a\7\62\2\2\u0099\u0091\3\2\2\2\u0099\u0098\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\32\3\2\2\2\u009b\u009d\t\6\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\t\7\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\34\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7\"\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\b\17\2\2\u00aa\36\3\2\2\2\u00ab\u00ad\7\17\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\f\2\2\u00af"+
		" \3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b6\3\2\2"+
		"\2\u00b3\u00b5\t\b\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\5\37\20\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\21\2\2\u00bc\"\3\2"+
		"\2\2\u00bd\u00be\7C\2\2\u00be\u00bf\7P\2\2\u00bf\u00c2\7F\2\2\u00c0\u00c2"+
		"\7(\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2$\3\2\2\2\u00c3\u00c4"+
		"\7Q\2\2\u00c4\u00c7\7T\2\2\u00c5\u00c7\7~\2\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7V\2\2\u00c9\u00ca\7T\2\2\u00ca"+
		"\u00cb\7W\2\2\u00cb\u00d1\7G\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2\2"+
		"\u00ce\u00cf\7w\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cc"+
		"\3\2\2\2\u00d1(\3\2\2\2\u00d2\u00d3\7H\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5"+
		"\7N\2\2\u00d5\u00d6\7U\2\2\u00d6\u00dd\7G\2\2\u00d7\u00d8\7h\2\2\u00d8"+
		"\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dd\7g\2\2"+
		"\u00dc\u00d2\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd*\3\2\2\2\u00de\u00df\7"+
		"T\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e3"+
		"\7C\2\2\u00e3\u00e4\7P\2\2\u00e4\u00e5\7I\2\2\u00e5\u00e6\7N\2\2\u00e6"+
		"\u00e7\7G\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7E\2\2\u00e9\u00ea\7K\2\2\u00ea"+
		"\u00eb\7T\2\2\u00eb\u00ec\7E\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee\7G\2\2"+
		"\u00ee.\3\2\2\2\u00ef\u00f0\7N\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f2\7P\2"+
		"\2\u00f2\u00f3\7G\2\2\u00f3\60\3\2\2\2\u00f4\u00f5\7D\2\2\u00f5\u00f6"+
		"\7G\2\2\u00f6\u00f7\7I\2\2\u00f7\u00f8\7K\2\2\u00f8\u00f9\7P\2\2\u00f9"+
		"\62\3\2\2\2\u00fa\u00fb\7G\2\2\u00fb\u00fc\7P\2\2\u00fc\u00fd\7F\2\2\u00fd"+
		"\64\3\2\2\2\u00fe\u00ff\7K\2\2\u00ff\u0104\7H\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0104\7h\2\2\u0102\u0104\7A\2\2\u0103\u00fe\3\2\2\2\u0103\u0100\3\2\2"+
		"\2\u0103\u0102\3\2\2\2\u0104\66\3\2\2\2\u0105\u010b\7#\2\2\u0106\u0107"+
		"\7G\2\2\u0107\u0108\7N\2\2\u0108\u0109\7U\2\2\u0109\u010b\7G\2\2\u010a"+
		"\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010b8\3\2\2\2\u010c\u010d\7V\2\2\u010d"+
		"\u010e\7J\2\2\u010e\u010f\7G\2\2\u010f\u0110\7P\2\2\u0110:\3\2\2\2\u0111"+
		"\u0112\7Y\2\2\u0112\u0113\7J\2\2\u0113\u0114\7K\2\2\u0114\u0115\7N\2\2"+
		"\u0115\u0116\7G\2\2\u0116<\3\2\2\2\u0117\u0118\7F\2\2\u0118\u0119\7G\2"+
		"\2\u0119\u011a\7H\2\2\u011a>\3\2\2\2\u011b\u011c\7T\2\2\u011c\u011d\7"+
		"I\2\2\u011d\u0122\7D\2\2\u011e\u011f\7t\2\2\u011f\u0120\7i\2\2\u0120\u0122"+
		"\7d\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122@\3\2\2\2\u0123\u0124"+
		"\7F\2\2\u0124\u0125\7T\2\2\u0125\u0126\7C\2\2\u0126\u0127\7Y\2\2\u0127"+
		"B\3\2\2\2\u0128\u0129\7D\2\2\u0129\u012a\7N\2\2\u012a\u012b\7Q\2\2\u012b"+
		"\u012c\7E\2\2\u012c\u012d\7M\2\2\u012dD\3\2\2\2\u012e\u012f\7H\2\2\u012f"+
		"\u0130\7K\2\2\u0130\u0131\7N\2\2\u0131\u0132\7N\2\2\u0132F\3\2\2\2\u0133"+
		"\u0134\7?\2\2\u0134H\3\2\2\2\u0135\u0136\7`\2\2\u0136\u0137\7`\2\2\u0137"+
		"J\3\2\2\2\u0138\u0139\7`\2\2\u0139L\3\2\2\2\u013a\u013b\7/\2\2\u013bN"+
		"\3\2\2\2\u013c\u013d\7-\2\2\u013dP\3\2\2\2\u013e\u013f\7,\2\2\u013fR\3"+
		"\2\2\2\u0140\u0141\7\61\2\2\u0141T\3\2\2\2\u0142\u0143\7T\2\2\u0143\u0144"+
		"\7Q\2\2\u0144\u0145\7V\2\2\u0145\u0146\7C\2\2\u0146\u0147\7V\2\2\u0147"+
		"\u0148\7G\2\2\u0148\u0149\7F\2\2\u0149V\3\2\2\2\u014a\u014b\7?\2\2\u014b"+
		"\u0154\7?\2\2\u014c\u0154\7>\2\2\u014d\u014e\7>\2\2\u014e\u0154\7?\2\2"+
		"\u014f\u0154\7@\2\2\u0150\u0151\7@\2\2\u0151\u0154\7?\2\2\u0152\u0154"+
		"\7\u0080\2\2\u0153\u014a\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014d\3\2\2"+
		"\2\u0153\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0152\3\2\2\2\u0154X"+
		"\3\2\2\2\u0155\u0156\7T\2\2\u0156\u0157\7G\2\2\u0157\u0172\7F\2\2\u0158"+
		"\u0159\7D\2\2\u0159\u015a\7N\2\2\u015a\u015b\7W\2\2\u015b\u0172\7G\2\2"+
		"\u015c\u015d\7[\2\2\u015d\u015e\7G\2\2\u015e\u015f\7N\2\2\u015f\u0160"+
		"\7N\2\2\u0160\u0161\7Q\2\2\u0161\u0172\7Y\2\2\u0162\u0163\7I\2\2\u0163"+
		"\u0164\7T\2\2\u0164\u0165\7G\2\2\u0165\u0166\7G\2\2\u0166\u0172\7P\2\2"+
		"\u0167\u0168\7Y\2\2\u0168\u0169\7J\2\2\u0169\u016a\7K\2\2\u016a\u016b"+
		"\7V\2\2\u016b\u0172\7G\2\2\u016c\u016d\7D\2\2\u016d\u016e\7N\2\2\u016e"+
		"\u016f\7C\2\2\u016f\u0170\7E\2\2\u0170\u0172\7M\2\2\u0171\u0155\3\2\2"+
		"\2\u0171\u0158\3\2\2\2\u0171\u015c\3\2\2\2\u0171\u0162\3\2\2\2\u0171\u0167"+
		"\3\2\2\2\u0171\u016c\3\2\2\2\u0172Z\3\2\2\2\31\2p\u0080\u0084\u008a\u008e"+
		"\u0095\u0099\u009c\u009f\u00a1\u00a7\u00ac\u00b6\u00c1\u00c6\u00d0\u00dc"+
		"\u0103\u010a\u0121\u0153\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}