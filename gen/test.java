// Generated from C:/Users/USER/IdeaProjects/third/src/MyLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class test extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, DEFINE=3, IF=4, PRINT=5, GT=6, LT=7, PLUS=8, MINUS=9, MULTIPLY=10, 
		DIVIDE=11, NUMBER=12, ID=13, STRING=14, WS=15, COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "DEFINE", "IF", "PRINT", "GT", "LT", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "NUMBER", "ID", "STRING", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'define'", "'if'", "'print'", "'>'", "'<'", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "DEFINE", "IF", "PRINT", "GT", "LT", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "NUMBER", "ID", "STRING", "WS", "COMMENT"
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
		"\u0004\u0000\u0010i\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0003\u000bC\b\u000b\u0001\u000b\u0004"+
		"\u000bF\b\u000b\u000b\u000b\f\u000bG\u0001\f\u0001\f\u0005\fL\b\f\n\f"+
		"\f\fO\t\f\u0001\r\u0001\r\u0005\rS\b\r\n\r\f\rV\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000e[\b\u000e\u000b\u000e\f\u000e\\\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000fc\b\u000f\n\u000f\f\u000ff\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001"+
		"\u0000\u0006\u0001\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0002\u0000"+
		"\"\"\\\\\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\rn\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000"+
		"\u0003#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007,"+
		"\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b5\u0001\u0000"+
		"\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000"+
		"\u0011;\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015?"+
		"\u0001\u0000\u0000\u0000\u0017B\u0001\u0000\u0000\u0000\u0019I\u0001\u0000"+
		"\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000"+
		"\u001f`\u0001\u0000\u0000\u0000!\"\u0005(\u0000\u0000\"\u0002\u0001\u0000"+
		"\u0000\u0000#$\u0005)\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005"+
		"d\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005f\u0000\u0000()\u0005i\u0000"+
		"\u0000)*\u0005n\u0000\u0000*+\u0005e\u0000\u0000+\u0006\u0001\u0000\u0000"+
		"\u0000,-\u0005i\u0000\u0000-.\u0005f\u0000\u0000.\b\u0001\u0000\u0000"+
		"\u0000/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005i\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005t\u0000\u00004\n\u0001\u0000\u0000\u0000"+
		"56\u0005>\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005<\u0000\u0000"+
		"8\u000e\u0001\u0000\u0000\u00009:\u0005+\u0000\u0000:\u0010\u0001\u0000"+
		"\u0000\u0000;<\u0005-\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0005"+
		"*\u0000\u0000>\u0014\u0001\u0000\u0000\u0000?@\u0005/\u0000\u0000@\u0016"+
		"\u0001\u0000\u0000\u0000AC\u0005-\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DF\u0007\u0000\u0000"+
		"\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0018\u0001\u0000\u0000\u0000"+
		"IM\u0007\u0001\u0000\u0000JL\u0007\u0002\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000N\u001a\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PT\u0005\"\u0000\u0000QS\b\u0003\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005\"\u0000"+
		"\u0000X\u001c\u0001\u0000\u0000\u0000Y[\u0007\u0004\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\u000e\u0000"+
		"\u0000_\u001e\u0001\u0000\u0000\u0000`d\u0005;\u0000\u0000ac\b\u0005\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gh\u0006\u000f\u0000\u0000h \u0001\u0000\u0000\u0000"+
		"\u0007\u0000BGMT\\d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}