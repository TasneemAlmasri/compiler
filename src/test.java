// Generated from MyLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class test extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Double_Semicolon_Comment=1, Single_Semicolon_Comment=2, DEFUN=3, DEFPARAMETER=4, 
		FORMAT=5, IF=6, AND=7, EQUAL=8, Lambda=9, Funcall=10, Function_Name=11, 
		T=12, Identifier=13, Number=14, Plus=15, Star=16, Minus=17, Less_or_equal=18, 
		Greater_or_equal=19, Left_pren=20, Right_pren=21, String=22, Tilde_command=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Double_Semicolon_Comment", "Single_Semicolon_Comment", "DEFUN", "DEFPARAMETER", 
			"FORMAT", "IF", "AND", "EQUAL", "Lambda", "Funcall", "Function_Name", 
			"T", "Identifier", "Number", "Plus", "Star", "Minus", "Less_or_equal", 
			"Greater_or_equal", "Left_pren", "Right_pren", "String", "Esc_seq", "Tilde_command", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'defun'", "'defparameter'", "'format'", "'if'", "'and'", 
			"'equal'", "'lambda'", "'funcall'", null, "'t'", null, null, "'+'", "'*'", 
			"'-'", "'<='", "'>='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Double_Semicolon_Comment", "Single_Semicolon_Comment", "DEFUN", 
			"DEFPARAMETER", "FORMAT", "IF", "AND", "EQUAL", "Lambda", "Funcall", 
			"Function_Name", "T", "Identifier", "Number", "Plus", "Star", "Minus", 
			"Less_or_equal", "Greater_or_equal", "Left_pren", "Right_pren", "String", 
			"Tilde_command", "WS"
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


	public test(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3"+
		"\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0082\n\f"+
		"\f\f\16\f\u0085\13\f\3\r\3\r\3\16\5\16\u008a\n\16\3\16\3\16\7\16\u008e"+
		"\n\16\f\16\16\16\u0091\13\16\3\17\6\17\u0094\n\17\r\17\16\17\u0095\3\17"+
		"\3\17\6\17\u009a\n\17\r\17\16\17\u009b\5\17\u009e\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\7\27\u00b3\n\27\f\27\16\27\u00b6\13\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\6\32\u00c1\n\32\r\32\16\32\u00c2\3\32\3\32\2"+
		"\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\31\63\32\3\2\r\4\2\f\f\17"+
		"\17\5\2C\\aac|\6\2\62;C\\aac|\4\2,,//\4\2C\\c|\7\2,,//\62;C\\c|\3\2\62"+
		";\4\2$$^^\t\2$$^^ddhhppttvv\4\2\'\'cc\5\2\13\f\17\17\"\"\2\u00cf\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\3\65\3\2\2\2\5@\3\2\2\2\7I\3\2\2\2\tO\3\2\2\2\13\\\3\2\2\2"+
		"\rc\3\2\2\2\17f\3\2\2\2\21j\3\2\2\2\23p\3\2\2\2\25w\3\2\2\2\27\177\3\2"+
		"\2\2\31\u0086\3\2\2\2\33\u0089\3\2\2\2\35\u0093\3\2\2\2\37\u009f\3\2\2"+
		"\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a8\3\2\2\2)\u00ab"+
		"\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b9\3\2\2\2\61\u00bc\3\2\2\2"+
		"\63\u00c0\3\2\2\2\65\66\7=\2\2\66\67\7=\2\2\67;\3\2\2\28:\n\2\2\298\3"+
		"\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\2\2\2?\4"+
		"\3\2\2\2@D\7=\2\2AC\n\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG"+
		"\3\2\2\2FD\3\2\2\2GH\b\3\2\2H\6\3\2\2\2IJ\7f\2\2JK\7g\2\2KL\7h\2\2LM\7"+
		"w\2\2MN\7p\2\2N\b\3\2\2\2OP\7f\2\2PQ\7g\2\2QR\7h\2\2RS\7r\2\2ST\7c\2\2"+
		"TU\7t\2\2UV\7c\2\2VW\7o\2\2WX\7g\2\2XY\7v\2\2YZ\7g\2\2Z[\7t\2\2[\n\3\2"+
		"\2\2\\]\7h\2\2]^\7q\2\2^_\7t\2\2_`\7o\2\2`a\7c\2\2ab\7v\2\2b\f\3\2\2\2"+
		"cd\7k\2\2de\7h\2\2e\16\3\2\2\2fg\7c\2\2gh\7p\2\2hi\7f\2\2i\20\3\2\2\2"+
		"jk\7g\2\2kl\7s\2\2lm\7w\2\2mn\7c\2\2no\7n\2\2o\22\3\2\2\2pq\7n\2\2qr\7"+
		"c\2\2rs\7o\2\2st\7d\2\2tu\7f\2\2uv\7c\2\2v\24\3\2\2\2wx\7h\2\2xy\7w\2"+
		"\2yz\7p\2\2z{\7e\2\2{|\7c\2\2|}\7n\2\2}~\7n\2\2~\26\3\2\2\2\177\u0083"+
		"\t\3\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\30\3\2\2\2\u0085\u0083\3\2\2"+
		"\2\u0086\u0087\7v\2\2\u0087\32\3\2\2\2\u0088\u008a\t\5\2\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\t\6\2\2\u008c"+
		"\u008e\t\7\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\34\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094"+
		"\t\b\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u009d\3\2\2\2\u0097\u0099\7\60\2\2\u0098\u009a\t"+
		"\b\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\36\3\2\2\2\u009f\u00a0\7-\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7"+
		",\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7"+
		">\2\2\u00a6\u00a7\7?\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7"+
		"+\2\2\u00ae,\3\2\2\2\u00af\u00b4\7$\2\2\u00b0\u00b3\5/\30\2\u00b1\u00b3"+
		"\n\t\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7$\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7^\2\2\u00ba\u00bb"+
		"\t\n\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7\u0080\2\2\u00bd\u00be\t\13\2\2"+
		"\u00be\62\3\2\2\2\u00bf\u00c1\t\f\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\b\32\2\2\u00c5\64\3\2\2\2\16\2;D\u0083\u0089\u008f\u0095\u009b"+
		"\u009d\u00b2\u00b4\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}