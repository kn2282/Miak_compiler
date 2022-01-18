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
		HigherScopeModifier=31, Minus=32, Plus=33, Mult=34, Divide=35, ROTATED=36, 
		ComprehensionOperator=37, ColorName=38;
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
			"Minus", "Plus", "Mult", "Divide", "ROTATED", "ComprehensionOperator", 
			"ColorName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "':'", null, null, null, null, null, null, 
			null, null, null, null, null, "'CIRCLE'", "'LINE'", "'BEGIN'", "'END'", 
			null, null, "'THEN'", "'WHILE'", "'DEF'", null, "'DRAW'", "'BLOCK'", 
			"'FILL'", "'='", "'^^'", "'^'", "'-'", "'+'", "'*'", "'/'", "'ROTATED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HexColor", "Integer", "VariableName", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\bg\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13u\n\13\f\13\16\13"+
		"x\13\13\3\13\5\13{\n\13\3\f\5\f~\n\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084"+
		"\13\f\3\r\6\r\u0087\n\r\r\r\16\r\u0088\3\r\3\r\3\16\5\16\u008e\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\7\17\u0096\n\17\f\17\16\17\u0099\13\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\3\21"+
		"\5\21\u00a8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b2\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00be\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00e5\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00ec\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0103\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0135\n*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0153\n"+
		"+\2\2,\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\31\n\33\13\35"+
		"\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;"+
		"\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(\3\2\t\3\2\63;\5\2\62;CHch\4\2"+
		"ZZzz\3\2\62;\4\2aac|\6\2\62;C\\aac|\4\2\13\13\"\u0080\2\u0168\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3"+
		"\2\2\2\ra\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25z\3\2\2\2\27}"+
		"\3\2\2\2\31\u0086\3\2\2\2\33\u008d\3\2\2\2\35\u0091\3\2\2\2\37\u00a2\3"+
		"\2\2\2!\u00a7\3\2\2\2#\u00b1\3\2\2\2%\u00bd\3\2\2\2\'\u00bf\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00d0\3\2\2\2-\u00d5\3\2\2\2/\u00db\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00f2\3\2\2\29\u00f8\3\2\2\2;\u0102"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0109\3\2\2\2A\u010f\3\2\2\2C\u0114\3\2\2\2E"+
		"\u0116\3\2\2\2G\u0119\3\2\2\2I\u011b\3\2\2\2K\u011d\3\2\2\2M\u011f\3\2"+
		"\2\2O\u0121\3\2\2\2Q\u0123\3\2\2\2S\u0134\3\2\2\2U\u0152\3\2\2\2WX\7*"+
		"\2\2X\4\3\2\2\2YZ\7.\2\2Z\6\3\2\2\2[\\\7+\2\2\\\b\3\2\2\2]^\7<\2\2^\n"+
		"\3\2\2\2_`\t\2\2\2`\f\3\2\2\2ab\t\3\2\2b\16\3\2\2\2cg\7%\2\2de\7\62\2"+
		"\2eg\t\4\2\2fc\3\2\2\2fd\3\2\2\2g\20\3\2\2\2hi\t\5\2\2i\22\3\2\2\2jk\5"+
		"\17\b\2kl\5\r\7\2lm\5\r\7\2mn\5\r\7\2no\5\r\7\2op\5\r\7\2pq\5\r\7\2q\24"+
		"\3\2\2\2rv\5\13\6\2su\5\21\t\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"w{\3\2\2\2xv\3\2\2\2y{\7\62\2\2zr\3\2\2\2zy\3\2\2\2{\26\3\2\2\2|~\t\6"+
		"\2\2}|\3\2\2\2~\u0082\3\2\2\2\177\u0081\t\7\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\30\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0085\u0087\7\"\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\r\2\2\u008b\32\3\2\2\2\u008c\u008e\7\17\2\2\u008d\u008c\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\f\2\2\u0090\34"+
		"\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\7\61\2\2\u0093\u0097\3\2\2\2"+
		"\u0094\u0096\t\b\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\5\33\16\2\u009b\u009c\3\2\2\2\u009c\u009d\b\17\2\2\u009d\36\3\2"+
		"\2\2\u009e\u009f\7C\2\2\u009f\u00a0\7P\2\2\u00a0\u00a3\7F\2\2\u00a1\u00a3"+
		"\7(\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3 \3\2\2\2\u00a4\u00a5"+
		"\7Q\2\2\u00a5\u00a8\7T\2\2\u00a6\u00a8\7~\2\2\u00a7\u00a4\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7T\2\2\u00ab"+
		"\u00ac\7W\2\2\u00ac\u00b2\7G\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7t\2\2"+
		"\u00af\u00b0\7w\2\2\u00b0\u00b2\7g\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ad"+
		"\3\2\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6"+
		"\7N\2\2\u00b6\u00b7\7U\2\2\u00b7\u00be\7G\2\2\u00b8\u00b9\7h\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00be\7g\2\2"+
		"\u00bd\u00b3\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be&\3\2\2\2\u00bf\u00c0\7"+
		"T\2\2\u00c0\u00c1\7G\2\2\u00c1\u00c2\7E\2\2\u00c2\u00c3\7V\2\2\u00c3\u00c4"+
		"\7C\2\2\u00c4\u00c5\7P\2\2\u00c5\u00c6\7I\2\2\u00c6\u00c7\7N\2\2\u00c7"+
		"\u00c8\7G\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7E\2\2\u00ca\u00cb\7K\2\2\u00cb"+
		"\u00cc\7T\2\2\u00cc\u00cd\7E\2\2\u00cd\u00ce\7N\2\2\u00ce\u00cf\7G\2\2"+
		"\u00cf*\3\2\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2\7K\2\2\u00d2\u00d3\7P\2"+
		"\2\u00d3\u00d4\7G\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7D\2\2\u00d6\u00d7\7"+
		"G\2\2\u00d7\u00d8\7I\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7P\2\2\u00da."+
		"\3\2\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7P\2\2\u00dd\u00de\7F\2\2\u00de"+
		"\60\3\2\2\2\u00df\u00e0\7K\2\2\u00e0\u00e5\7H\2\2\u00e1\u00e2\7k\2\2\u00e2"+
		"\u00e5\7h\2\2\u00e3\u00e5\7A\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e1\3\2\2"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5\62\3\2\2\2\u00e6\u00ec\7#\2\2\u00e7\u00e8"+
		"\7G\2\2\u00e8\u00e9\7N\2\2\u00e9\u00ea\7U\2\2\u00ea\u00ec\7G\2\2\u00eb"+
		"\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7V\2\2"+
		"\u00ee\u00ef\7J\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7P\2\2\u00f1\66\3\2"+
		"\2\2\u00f2\u00f3\7Y\2\2\u00f3\u00f4\7J\2\2\u00f4\u00f5\7K\2\2\u00f5\u00f6"+
		"\7N\2\2\u00f6\u00f7\7G\2\2\u00f78\3\2\2\2\u00f8\u00f9\7F\2\2\u00f9\u00fa"+
		"\7G\2\2\u00fa\u00fb\7H\2\2\u00fb:\3\2\2\2\u00fc\u00fd\7T\2\2\u00fd\u00fe"+
		"\7I\2\2\u00fe\u0103\7D\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7i\2\2\u0101"+
		"\u0103\7d\2\2\u0102\u00fc\3\2\2\2\u0102\u00ff\3\2\2\2\u0103<\3\2\2\2\u0104"+
		"\u0105\7F\2\2\u0105\u0106\7T\2\2\u0106\u0107\7C\2\2\u0107\u0108\7Y\2\2"+
		"\u0108>\3\2\2\2\u0109\u010a\7D\2\2\u010a\u010b\7N\2\2\u010b\u010c\7Q\2"+
		"\2\u010c\u010d\7E\2\2\u010d\u010e\7M\2\2\u010e@\3\2\2\2\u010f\u0110\7"+
		"H\2\2\u0110\u0111\7K\2\2\u0111\u0112\7N\2\2\u0112\u0113\7N\2\2\u0113B"+
		"\3\2\2\2\u0114\u0115\7?\2\2\u0115D\3\2\2\2\u0116\u0117\7`\2\2\u0117\u0118"+
		"\7`\2\2\u0118F\3\2\2\2\u0119\u011a\7`\2\2\u011aH\3\2\2\2\u011b\u011c\7"+
		"/\2\2\u011cJ\3\2\2\2\u011d\u011e\7-\2\2\u011eL\3\2\2\2\u011f\u0120\7,"+
		"\2\2\u0120N\3\2\2\2\u0121\u0122\7\61\2\2\u0122P\3\2\2\2\u0123\u0124\7"+
		"T\2\2\u0124\u0125\7Q\2\2\u0125\u0126\7V\2\2\u0126\u0127\7C\2\2\u0127\u0128"+
		"\7V\2\2\u0128\u0129\7G\2\2\u0129\u012a\7F\2\2\u012aR\3\2\2\2\u012b\u012c"+
		"\7?\2\2\u012c\u0135\7?\2\2\u012d\u0135\7>\2\2\u012e\u012f\7>\2\2\u012f"+
		"\u0135\7?\2\2\u0130\u0135\7@\2\2\u0131\u0132\7@\2\2\u0132\u0135\7?\2\2"+
		"\u0133\u0135\7\u0080\2\2\u0134\u012b\3\2\2\2\u0134\u012d\3\2\2\2\u0134"+
		"\u012e\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0134\u0133\3\2"+
		"\2\2\u0135T\3\2\2\2\u0136\u0137\7T\2\2\u0137\u0138\7G\2\2\u0138\u0153"+
		"\7F\2\2\u0139\u013a\7D\2\2\u013a\u013b\7N\2\2\u013b\u013c\7W\2\2\u013c"+
		"\u0153\7G\2\2\u013d\u013e\7[\2\2\u013e\u013f\7G\2\2\u013f\u0140\7N\2\2"+
		"\u0140\u0141\7N\2\2\u0141\u0142\7Q\2\2\u0142\u0153\7Y\2\2\u0143\u0144"+
		"\7I\2\2\u0144\u0145\7T\2\2\u0145\u0146\7G\2\2\u0146\u0147\7G\2\2\u0147"+
		"\u0153\7P\2\2\u0148\u0149\7Y\2\2\u0149\u014a\7J\2\2\u014a\u014b\7K\2\2"+
		"\u014b\u014c\7V\2\2\u014c\u0153\7G\2\2\u014d\u014e\7D\2\2\u014e\u014f"+
		"\7N\2\2\u014f\u0150\7C\2\2\u0150\u0151\7E\2\2\u0151\u0153\7M\2\2\u0152"+
		"\u0136\3\2\2\2\u0152\u0139\3\2\2\2\u0152\u013d\3\2\2\2\u0152\u0143\3\2"+
		"\2\2\u0152\u0148\3\2\2\2\u0152\u014d\3\2\2\2\u0153V\3\2\2\2\25\2fvz}\u0080"+
		"\u0082\u0088\u008d\u0097\u00a2\u00a7\u00b1\u00bd\u00e4\u00eb\u0102\u0134"+
		"\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}