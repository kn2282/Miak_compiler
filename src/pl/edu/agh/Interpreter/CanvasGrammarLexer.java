package pl.edu.agh.Interpreter;// Generated from C:/Materia�y/MIAK/Miak_compiler/src\CanvasGrammar.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, HexColor=6, Integer=7, Float=8, 
		VariableName=9, SPACE=10, TAB=11, ENDL=12, COMMENT=13, AND=14, OR=15, 
		TRUE=16, FALSE=17, RECTANGLE=18, CIRCLE=19, LINE=20, BEGIN=21, END=22, 
		IF=23, ELSE=24, THEN=25, WHILE=26, DEF=27, RGB=28, DRAW=29, BLOCK=30, 
		FILL=31, AssignOperator=32, TopScopeModifier=33, HigherScopeModifier=34, 
		Minus=35, Plus=36, Mult=37, Divide=38, ROTATED=39, ComprehensionOperator=40, 
		ColorName=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NonZeroDigit", "HexDigit", "HexPrefix", 
			"Digit", "HexColor", "Integer", "Float", "VariableName", "SPACE", "TAB", 
			"ENDL", "COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", "CIRCLE", 
			"LINE", "BEGIN", "END", "IF", "ELSE", "THEN", "WHILE", "DEF", "RGB", 
			"DRAW", "BLOCK", "FILL", "AssignOperator", "TopScopeModifier", "HigherScopeModifier", 
			"Minus", "Plus", "Mult", "Divide", "ROTATED", "ComprehensionOperator", 
			"ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEBUG'", "'('", "','", "')'", "':'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'CIRCLE'", "'LINE'", 
			"'BEGIN'", "'END'", null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", 
			"'BLOCK'", "'FILL'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'", 
			"'ROTATED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "HexColor", "Integer", "Float", "VariableName", 
			"SPACE", "TAB", "ENDL", "COMMENT", "AND", "OR", "TRUE", "FALSE", "RECTANGLE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\ts\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084\13\f\3\f\5\f\u0087"+
		"\n\f\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13\r\3\r\5\r\u0091\n\r\3\r\3"+
		"\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\r\5\r\u009c\n\r\3\16\5\16\u009f"+
		"\n\16\3\16\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\17\6\17\u00a8\n\17"+
		"\r\17\16\17\u00a9\3\17\3\17\3\20\6\20\u00af\n\20\r\20\16\20\u00b0\3\20"+
		"\3\20\3\21\5\21\u00b6\n\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00be\n"+
		"\22\f\22\16\22\u00c1\13\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c9\n"+
		"\23\3\24\3\24\3\24\5\24\u00ce\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00d8\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00e4\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u010b"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0112\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0129"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\5-\u015b\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0179\n.\2\2/\3\3\5\4\7"+
		"\5\t\6\13\7\r\2\17\2\21\2\23\2\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17"+
		"%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36"+
		"C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+\3\2\t\3\2\63;\5\2\62;CHch\4\2ZZzz\3\2\62"+
		";\4\2aac|\6\2\62;C\\aac|\4\2\13\13\"\u0080\2\u0194\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5c\3\2\2\2\7e\3\2"+
		"\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21r\3\2\2\2\23t\3\2"+
		"\2\2\25v\3\2\2\2\27\u0086\3\2\2\2\31\u0090\3\2\2\2\33\u009e\3\2\2\2\35"+
		"\u00a7\3\2\2\2\37\u00ae\3\2\2\2!\u00b5\3\2\2\2#\u00b9\3\2\2\2%\u00c8\3"+
		"\2\2\2\'\u00cd\3\2\2\2)\u00d7\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3\2\2\2/\u00ef"+
		"\3\2\2\2\61\u00f6\3\2\2\2\63\u00fb\3\2\2\2\65\u0101\3\2\2\2\67\u010a\3"+
		"\2\2\29\u0111\3\2\2\2;\u0113\3\2\2\2=\u0118\3\2\2\2?\u011e\3\2\2\2A\u0128"+
		"\3\2\2\2C\u012a\3\2\2\2E\u012f\3\2\2\2G\u0135\3\2\2\2I\u013a\3\2\2\2K"+
		"\u013c\3\2\2\2M\u013f\3\2\2\2O\u0141\3\2\2\2Q\u0143\3\2\2\2S\u0145\3\2"+
		"\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u015a\3\2\2\2[\u0178\3\2\2\2]^\7F"+
		"\2\2^_\7G\2\2_`\7D\2\2`a\7W\2\2ab\7I\2\2b\4\3\2\2\2cd\7*\2\2d\6\3\2\2"+
		"\2ef\7.\2\2f\b\3\2\2\2gh\7+\2\2h\n\3\2\2\2ij\7<\2\2j\f\3\2\2\2kl\t\2\2"+
		"\2l\16\3\2\2\2mn\t\3\2\2n\20\3\2\2\2os\7%\2\2pq\7\62\2\2qs\t\4\2\2ro\3"+
		"\2\2\2rp\3\2\2\2s\22\3\2\2\2tu\t\5\2\2u\24\3\2\2\2vw\5\21\t\2wx\5\17\b"+
		"\2xy\5\17\b\2yz\5\17\b\2z{\5\17\b\2{|\5\17\b\2|}\5\17\b\2}\26\3\2\2\2"+
		"~\u0082\5\r\7\2\177\u0081\5\23\n\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0087\7\62\2\2\u0086~\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\30\3\2\2\2\u0088\u008c\5\r\7\2\u0089\u008b\5\23\n\2\u008a\u0089\3\2\2"+
		"\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\7\62\2\2\u0090\u0088\3\2\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u009b\7\60\2\2\u0093\u0097"+
		"\5\r\7\2\u0094\u0096\5\23\n\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009c\7\62\2\2\u009b\u0093\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\32\3\2\2\2\u009d\u009f\t\6\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\t\7\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\34\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\7\"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\b\17\2\2\u00ac\36\3\2\2\2\u00ad\u00af\7\13\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\20\2\2\u00b3 \3\2\2\2\u00b4\u00b6\7\17\2"+
		"\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\7\f\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7\61\2\2\u00bb"+
		"\u00bf\3\2\2\2\u00bc\u00be\t\b\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\5!\21\2\u00c3$\3\2\2\2\u00c4\u00c5\7C\2\2\u00c5"+
		"\u00c6\7P\2\2\u00c6\u00c9\7F\2\2\u00c7\u00c9\7(\2\2\u00c8\u00c4\3\2\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7Q\2\2\u00cb\u00ce\7"+
		"T\2\2\u00cc\u00ce\7~\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"(\3\2\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2\7W\2\2\u00d2"+
		"\u00d8\7G\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7w\2\2"+
		"\u00d6\u00d8\7g\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8*\3\2"+
		"\2\2\u00d9\u00da\7H\2\2\u00da\u00db\7C\2\2\u00db\u00dc\7N\2\2\u00dc\u00dd"+
		"\7U\2\2\u00dd\u00e4\7G\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e4\7g\2\2\u00e3\u00d9\3\2\2"+
		"\2\u00e3\u00de\3\2\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7T\2\2\u00e6\u00e7\7"+
		"G\2\2\u00e7\u00e8\7E\2\2\u00e8\u00e9\7V\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb"+
		"\7P\2\2\u00eb\u00ec\7I\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee\7G\2\2\u00ee"+
		".\3\2\2\2\u00ef\u00f0\7E\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f2\7T\2\2\u00f2"+
		"\u00f3\7E\2\2\u00f3\u00f4\7N\2\2\u00f4\u00f5\7G\2\2\u00f5\60\3\2\2\2\u00f6"+
		"\u00f7\7N\2\2\u00f7\u00f8\7K\2\2\u00f8\u00f9\7P\2\2\u00f9\u00fa\7G\2\2"+
		"\u00fa\62\3\2\2\2\u00fb\u00fc\7D\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7"+
		"I\2\2\u00fe\u00ff\7K\2\2\u00ff\u0100\7P\2\2\u0100\64\3\2\2\2\u0101\u0102"+
		"\7G\2\2\u0102\u0103\7P\2\2\u0103\u0104\7F\2\2\u0104\66\3\2\2\2\u0105\u0106"+
		"\7K\2\2\u0106\u010b\7H\2\2\u0107\u0108\7k\2\2\u0108\u010b\7h\2\2\u0109"+
		"\u010b\7A\2\2\u010a\u0105\3\2\2\2\u010a\u0107\3\2\2\2\u010a\u0109\3\2"+
		"\2\2\u010b8\3\2\2\2\u010c\u0112\7#\2\2\u010d\u010e\7G\2\2\u010e\u010f"+
		"\7N\2\2\u010f\u0110\7U\2\2\u0110\u0112\7G\2\2\u0111\u010c\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0112:\3\2\2\2\u0113\u0114\7V\2\2\u0114\u0115\7J\2\2\u0115"+
		"\u0116\7G\2\2\u0116\u0117\7P\2\2\u0117<\3\2\2\2\u0118\u0119\7Y\2\2\u0119"+
		"\u011a\7J\2\2\u011a\u011b\7K\2\2\u011b\u011c\7N\2\2\u011c\u011d\7G\2\2"+
		"\u011d>\3\2\2\2\u011e\u011f\7F\2\2\u011f\u0120\7G\2\2\u0120\u0121\7H\2"+
		"\2\u0121@\3\2\2\2\u0122\u0123\7T\2\2\u0123\u0124\7I\2\2\u0124\u0129\7"+
		"D\2\2\u0125\u0126\7t\2\2\u0126\u0127\7i\2\2\u0127\u0129\7d\2\2\u0128\u0122"+
		"\3\2\2\2\u0128\u0125\3\2\2\2\u0129B\3\2\2\2\u012a\u012b\7F\2\2\u012b\u012c"+
		"\7T\2\2\u012c\u012d\7C\2\2\u012d\u012e\7Y\2\2\u012eD\3\2\2\2\u012f\u0130"+
		"\7D\2\2\u0130\u0131\7N\2\2\u0131\u0132\7Q\2\2\u0132\u0133\7E\2\2\u0133"+
		"\u0134\7M\2\2\u0134F\3\2\2\2\u0135\u0136\7H\2\2\u0136\u0137\7K\2\2\u0137"+
		"\u0138\7N\2\2\u0138\u0139\7N\2\2\u0139H\3\2\2\2\u013a\u013b\7?\2\2\u013b"+
		"J\3\2\2\2\u013c\u013d\7`\2\2\u013d\u013e\7`\2\2\u013eL\3\2\2\2\u013f\u0140"+
		"\7`\2\2\u0140N\3\2\2\2\u0141\u0142\7/\2\2\u0142P\3\2\2\2\u0143\u0144\7"+
		"-\2\2\u0144R\3\2\2\2\u0145\u0146\7,\2\2\u0146T\3\2\2\2\u0147\u0148\7\61"+
		"\2\2\u0148V\3\2\2\2\u0149\u014a\7T\2\2\u014a\u014b\7Q\2\2\u014b\u014c"+
		"\7V\2\2\u014c\u014d\7C\2\2\u014d\u014e\7V\2\2\u014e\u014f\7G\2\2\u014f"+
		"\u0150\7F\2\2\u0150X\3\2\2\2\u0151\u0152\7?\2\2\u0152\u015b\7?\2\2\u0153"+
		"\u015b\7>\2\2\u0154\u0155\7>\2\2\u0155\u015b\7?\2\2\u0156\u015b\7@\2\2"+
		"\u0157\u0158\7@\2\2\u0158\u015b\7?\2\2\u0159\u015b\7\u0080\2\2\u015a\u0151"+
		"\3\2\2\2\u015a\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0156\3\2\2\2\u015a"+
		"\u0157\3\2\2\2\u015a\u0159\3\2\2\2\u015bZ\3\2\2\2\u015c\u015d\7T\2\2\u015d"+
		"\u015e\7G\2\2\u015e\u0179\7F\2\2\u015f\u0160\7D\2\2\u0160\u0161\7N\2\2"+
		"\u0161\u0162\7W\2\2\u0162\u0179\7G\2\2\u0163\u0164\7[\2\2\u0164\u0165"+
		"\7G\2\2\u0165\u0166\7N\2\2\u0166\u0167\7N\2\2\u0167\u0168\7Q\2\2\u0168"+
		"\u0179\7Y\2\2\u0169\u016a\7I\2\2\u016a\u016b\7T\2\2\u016b\u016c\7G\2\2"+
		"\u016c\u016d\7G\2\2\u016d\u0179\7P\2\2\u016e\u016f\7Y\2\2\u016f\u0170"+
		"\7J\2\2\u0170\u0171\7K\2\2\u0171\u0172\7V\2\2\u0172\u0179\7G\2\2\u0173"+
		"\u0174\7D\2\2\u0174\u0175\7N\2\2\u0175\u0176\7C\2\2\u0176\u0177\7E\2\2"+
		"\u0177\u0179\7M\2\2\u0178\u015c\3\2\2\2\u0178\u015f\3\2\2\2\u0178\u0163"+
		"\3\2\2\2\u0178\u0169\3\2\2\2\u0178\u016e\3\2\2\2\u0178\u0173\3\2\2\2\u0179"+
		"\\\3\2\2\2\32\2r\u0082\u0086\u008c\u0090\u0097\u009b\u009e\u00a1\u00a3"+
		"\u00a9\u00b0\u00b5\u00bf\u00c8\u00cd\u00d7\u00e3\u010a\u0111\u0128\u015a"+
		"\u0178\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}