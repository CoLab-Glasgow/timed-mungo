// Generated from /home/luke/Level-5-Project/Mungo/mungo-tools/stmungo/src/main/antlr/Scribble.g4 by ANTLR 4.8

package genantlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScribbleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, MODULEKW=11, IMPORTKW=12, TYPEKW=13, PROTOCOLKW=14, GLOBALKW=15, 
		EXPLICITKW=16, AUXKW=17, LOCALKW=18, ROLEKW=19, SELFKW=20, SIGKW=21, INSTANTIATESKW=22, 
		ASKW=23, FROMKW=24, TOKW=25, CHOICEKW=26, ATKW=27, ORKW=28, RECKW=29, 
		CONTINUEKW=30, PARKW=31, ANDKW=32, INTERRUPTIBLEKW=33, WITHKW=34, BYKW=35, 
		THROWSKW=36, CATCHESKW=37, DOKW=38, CHOICENAMEKW=39, CONNECTKW=40, DISCONNECTKW=41, 
		ACCEPTKW=42, WRAPKW=43, WHITESPACE=44, COMMENT=45, LINE_COMMENT=46, EXTIDENTIFIER=47, 
		INT=48, FLOAT=49, BOOL=50, IDENTIFIER=51, COMMA=52, COLON=53, SEMICOLON=54, 
		CURLYLEFT=55, CURLYRIGHT=56, ROUNDLEFT=57, ROUNDRIGHT=58, ANGLELEFT=59, 
		ANGLERIGHT=60, AT=61;
	public static final int
		RULE_clockconst = 0, RULE_clockid = 1, RULE_rolename = 2, RULE_payloadtypename = 3, 
		RULE_protocolname = 4, RULE_parametername = 5, RULE_annotationname = 6, 
		RULE_recursionlabelname = 7, RULE_recursionvarname = 8, RULE_scopename = 9, 
		RULE_simplemessagesignaturename = 10, RULE_choiceannotationname = 11, 
		RULE_modulename = 12, RULE_membername = 13, RULE_simplemembername = 14, 
		RULE_fullmembername = 15, RULE_module = 16, RULE_datatypedecl = 17, RULE_moduledecl = 18, 
		RULE_importdecl = 19, RULE_importmodule = 20, RULE_importmember = 21, 
		RULE_payloadtypedecl = 22, RULE_messagesignaturedecl = 23, RULE_messagesignature = 24, 
		RULE_payload = 25, RULE_payloadelement = 26, RULE_protocoldecl = 27, RULE_choiceannot = 28, 
		RULE_globalprotocoldecl = 29, RULE_globalprotocolheader = 30, RULE_roledecllist = 31, 
		RULE_roledecl = 32, RULE_parameterdecllist = 33, RULE_parameterdecl = 34, 
		RULE_globalprotocoldefinition = 35, RULE_globalprotocolinstance = 36, 
		RULE_roleinstantiationlist = 37, RULE_roleinstantiation = 38, RULE_argumentlist = 39, 
		RULE_argument = 40, RULE_globalprotocolblock = 41, RULE_globalinteractionsequence = 42, 
		RULE_globalinteraction = 43, RULE_globalmessagetransfer = 44, RULE_message = 45, 
		RULE_globalconnect = 46, RULE_globaldisconnect = 47, RULE_globalwrap = 48, 
		RULE_globalchoice = 49, RULE_globalrecursion = 50, RULE_globalcontinue = 51, 
		RULE_globalparallel = 52, RULE_globalinterruptible = 53, RULE_globalinterrupt = 54, 
		RULE_globaldo = 55, RULE_localprotocoldecl = 56, RULE_localprotocolheader = 57, 
		RULE_localprotocoldefinition = 58, RULE_localprotocolinstance = 59, RULE_localprotocolblock = 60, 
		RULE_localinteraction = 61, RULE_localsend = 62, RULE_localreceive = 63, 
		RULE_localsendwrap = 64, RULE_localreceivewrap = 65, RULE_localconnect = 66, 
		RULE_localaccept = 67, RULE_localdisconnect = 68, RULE_localchoice = 69, 
		RULE_localrecursion = 70, RULE_localcontinue = 71, RULE_localparallel = 72, 
		RULE_localinterruptible = 73, RULE_localthrow = 74, RULE_localcatch = 75, 
		RULE_localdo = 76, RULE_timeconstraint = 77, RULE_constraintspec = 78, 
		RULE_clockconstraint = 79, RULE_resetpredicate = 80, RULE_resetpredlist = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"clockconst", "clockid", "rolename", "payloadtypename", "protocolname", 
			"parametername", "annotationname", "recursionlabelname", "recursionvarname", 
			"scopename", "simplemessagesignaturename", "choiceannotationname", "modulename", 
			"membername", "simplemembername", "fullmembername", "module", "datatypedecl", 
			"moduledecl", "importdecl", "importmodule", "importmember", "payloadtypedecl", 
			"messagesignaturedecl", "messagesignature", "payload", "payloadelement", 
			"protocoldecl", "choiceannot", "globalprotocoldecl", "globalprotocolheader", 
			"roledecllist", "roledecl", "parameterdecllist", "parameterdecl", "globalprotocoldefinition", 
			"globalprotocolinstance", "roleinstantiationlist", "roleinstantiation", 
			"argumentlist", "argument", "globalprotocolblock", "globalinteractionsequence", 
			"globalinteraction", "globalmessagetransfer", "message", "globalconnect", 
			"globaldisconnect", "globalwrap", "globalchoice", "globalrecursion", 
			"globalcontinue", "globalparallel", "globalinterruptible", "globalinterrupt", 
			"globaldo", "localprotocoldecl", "localprotocolheader", "localprotocoldefinition", 
			"localprotocolinstance", "localprotocolblock", "localinteraction", "localsend", 
			"localreceive", "localsendwrap", "localreceivewrap", "localconnect", 
			"localaccept", "localdisconnect", "localchoice", "localrecursion", "localcontinue", 
			"localparallel", "localinterruptible", "localthrow", "localcatch", "localdo", 
			"timeconstraint", "constraintspec", "clockconstraint", "resetpredicate", 
			"resetpredlist"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'['", "']'", "'='", "'<='", "'>='", "'!'", "'&'", "'|'", 
			"'reset'", "'module'", "'import'", "'type'", "'protocol'", "'global'", 
			"'explicit'", "'aux'", "'local'", "'role'", "'self'", "'sig'", "'instantiates'", 
			"'as'", "'from'", "'to'", "'choice'", "'at'", "'or'", "'rec'", "'continue'", 
			"'par'", "'and'", "'interruptible'", "'with'", "'by'", "'throws'", "'catches'", 
			"'do'", "'choicename'", "'connect'", "'disconnect'", "'accept'", "'wrap'", 
			null, null, null, null, null, null, null, null, "','", "':'", "';'", 
			"'{'", "'}'", "'('", "')'", "'<'", "'>'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "MODULEKW", 
			"IMPORTKW", "TYPEKW", "PROTOCOLKW", "GLOBALKW", "EXPLICITKW", "AUXKW", 
			"LOCALKW", "ROLEKW", "SELFKW", "SIGKW", "INSTANTIATESKW", "ASKW", "FROMKW", 
			"TOKW", "CHOICEKW", "ATKW", "ORKW", "RECKW", "CONTINUEKW", "PARKW", "ANDKW", 
			"INTERRUPTIBLEKW", "WITHKW", "BYKW", "THROWSKW", "CATCHESKW", "DOKW", 
			"CHOICENAMEKW", "CONNECTKW", "DISCONNECTKW", "ACCEPTKW", "WRAPKW", "WHITESPACE", 
			"COMMENT", "LINE_COMMENT", "EXTIDENTIFIER", "INT", "FLOAT", "BOOL", "IDENTIFIER", 
			"COMMA", "COLON", "SEMICOLON", "CURLYLEFT", "CURLYRIGHT", "ROUNDLEFT", 
			"ROUNDRIGHT", "ANGLELEFT", "ANGLERIGHT", "AT"
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

	@Override
	public String getGrammarFileName() { return "Scribble.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScribbleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClockconstContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ScribbleParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ScribbleParser.FLOAT, 0); }
		public ClockconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockconst; }
	}

	public final ClockconstContext clockconst() throws RecognitionException {
		ClockconstContext _localctx = new ClockconstContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_clockconst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClockidContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ClockidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockid; }
	}

	public final ClockidContext clockid() throws RecognitionException {
		ClockidContext _localctx = new ClockidContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clockid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public RolenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolename; }
	}

	public final RolenameContext rolename() throws RecognitionException {
		RolenameContext _localctx = new RolenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rolename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PayloadtypenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public PayloadtypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payloadtypename; }
	}

	public final PayloadtypenameContext payloadtypename() throws RecognitionException {
		PayloadtypenameContext _localctx = new PayloadtypenameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_payloadtypename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ProtocolnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolname; }
	}

	public final ProtocolnameContext protocolname() throws RecognitionException {
		ProtocolnameContext _localctx = new ProtocolnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_protocolname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameternameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ParameternameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametername; }
	}

	public final ParameternameContext parametername() throws RecognitionException {
		ParameternameContext _localctx = new ParameternameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public AnnotationnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationname; }
	}

	public final AnnotationnameContext annotationname() throws RecognitionException {
		AnnotationnameContext _localctx = new AnnotationnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_annotationname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursionlabelnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public RecursionlabelnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursionlabelname; }
	}

	public final RecursionlabelnameContext recursionlabelname() throws RecognitionException {
		RecursionlabelnameContext _localctx = new RecursionlabelnameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recursionlabelname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecursionvarnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public RecursionvarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursionvarname; }
	}

	public final RecursionvarnameContext recursionvarname() throws RecognitionException {
		RecursionvarnameContext _localctx = new RecursionvarnameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_recursionvarname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ScopenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopename; }
	}

	public final ScopenameContext scopename() throws RecognitionException {
		ScopenameContext _localctx = new ScopenameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scopename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplemessagesignaturenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public SimplemessagesignaturenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplemessagesignaturename; }
	}

	public final SimplemessagesignaturenameContext simplemessagesignaturename() throws RecognitionException {
		SimplemessagesignaturenameContext _localctx = new SimplemessagesignaturenameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simplemessagesignaturename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceannotationnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ChoiceannotationnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceannotationname; }
	}

	public final ChoiceannotationnameContext choiceannotationname() throws RecognitionException {
		ChoiceannotationnameContext _localctx = new ChoiceannotationnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_choiceannotationname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModulenameContext extends ParserRuleContext {
		public ModulenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulename; }
	 
		public ModulenameContext() { }
		public void copyFrom(ModulenameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StndModuleNameContext extends ModulenameContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public StndModuleNameContext(ModulenameContext ctx) { copyFrom(ctx); }
	}
	public static class LongModuleNameContext extends ModulenameContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ScribbleParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ScribbleParser.IDENTIFIER, i);
		}
		public LongModuleNameContext(ModulenameContext ctx) { copyFrom(ctx); }
	}

	public final ModulenameContext modulename() throws RecognitionException {
		ModulenameContext _localctx = new ModulenameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modulename);
		try {
			int _alt;
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new LongModuleNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(IDENTIFIER);
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						match(T__0);
						setState(190);
						match(IDENTIFIER);
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(196);
				match(T__0);
				setState(197);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new StndModuleNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembernameContext extends ParserRuleContext {
		public MembernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membername; }
	 
		public MembernameContext() { }
		public void copyFrom(MembernameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleMemNameContext extends MembernameContext {
		public SimplemembernameContext simplemembername() {
			return getRuleContext(SimplemembernameContext.class,0);
		}
		public SimpleMemNameContext(MembernameContext ctx) { copyFrom(ctx); }
	}
	public static class FullMemNameContext extends MembernameContext {
		public FullmembernameContext fullmembername() {
			return getRuleContext(FullmembernameContext.class,0);
		}
		public FullMemNameContext(MembernameContext ctx) { copyFrom(ctx); }
	}

	public final MembernameContext membername() throws RecognitionException {
		MembernameContext _localctx = new MembernameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_membername);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SimpleMemNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				simplemembername();
				}
				break;
			case 2:
				_localctx = new FullMemNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				fullmembername();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplemembernameContext extends ParserRuleContext {
		public SimplemembernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplemembername; }
	 
		public SimplemembernameContext() { }
		public void copyFrom(SimplemembernameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProtNameContext extends SimplemembernameContext {
		public ProtocolnameContext protocolname() {
			return getRuleContext(ProtocolnameContext.class,0);
		}
		public ProtNameContext(SimplemembernameContext ctx) { copyFrom(ctx); }
	}
	public static class StndPayloadTypeNameContext extends SimplemembernameContext {
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public StndPayloadTypeNameContext(SimplemembernameContext ctx) { copyFrom(ctx); }
	}

	public final SimplemembernameContext simplemembername() throws RecognitionException {
		SimplemembernameContext _localctx = new SimplemembernameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simplemembername);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StndPayloadTypeNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				payloadtypename();
				}
				break;
			case 2:
				_localctx = new ProtNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				protocolname();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullmembernameContext extends ParserRuleContext {
		public ModulenameContext modulename() {
			return getRuleContext(ModulenameContext.class,0);
		}
		public SimplemembernameContext simplemembername() {
			return getRuleContext(SimplemembernameContext.class,0);
		}
		public FullmembernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullmembername; }
	}

	public final FullmembernameContext fullmembername() throws RecognitionException {
		FullmembernameContext _localctx = new FullmembernameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fullmembername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			modulename();
			setState(210);
			match(T__0);
			setState(211);
			simplemembername();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public ModuledeclContext moduledecl() {
			return getRuleContext(ModuledeclContext.class,0);
		}
		public List<ImportdeclContext> importdecl() {
			return getRuleContexts(ImportdeclContext.class);
		}
		public ImportdeclContext importdecl(int i) {
			return getRuleContext(ImportdeclContext.class,i);
		}
		public List<DatatypedeclContext> datatypedecl() {
			return getRuleContexts(DatatypedeclContext.class);
		}
		public DatatypedeclContext datatypedecl(int i) {
			return getRuleContext(DatatypedeclContext.class,i);
		}
		public List<ProtocoldeclContext> protocoldecl() {
			return getRuleContexts(ProtocoldeclContext.class);
		}
		public ProtocoldeclContext protocoldecl(int i) {
			return getRuleContext(ProtocoldeclContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			moduledecl();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORTKW || _la==FROMKW) {
				{
				{
				setState(214);
				importdecl();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEKW || _la==SIGKW) {
				{
				{
				setState(220);
				datatypedecl();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBALKW || _la==LOCALKW) {
				{
				{
				setState(226);
				protocoldecl();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypedeclContext extends ParserRuleContext {
		public PayloadtypedeclContext payloadtypedecl() {
			return getRuleContext(PayloadtypedeclContext.class,0);
		}
		public MessagesignaturedeclContext messagesignaturedecl() {
			return getRuleContext(MessagesignaturedeclContext.class,0);
		}
		public DatatypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypedecl; }
	}

	public final DatatypedeclContext datatypedecl() throws RecognitionException {
		DatatypedeclContext _localctx = new DatatypedeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_datatypedecl);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				payloadtypedecl();
				}
				break;
			case SIGKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				messagesignaturedecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuledeclContext extends ParserRuleContext {
		public TerminalNode MODULEKW() { return getToken(ScribbleParser.MODULEKW, 0); }
		public ModulenameContext modulename() {
			return getRuleContext(ModulenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public ModuledeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduledecl; }
	}

	public final ModuledeclContext moduledecl() throws RecognitionException {
		ModuledeclContext _localctx = new ModuledeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_moduledecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(MODULEKW);
			setState(237);
			modulename();
			setState(238);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportdeclContext extends ParserRuleContext {
		public ImportmoduleContext importmodule() {
			return getRuleContext(ImportmoduleContext.class,0);
		}
		public ImportmemberContext importmember() {
			return getRuleContext(ImportmemberContext.class,0);
		}
		public ImportdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importdecl; }
	}

	public final ImportdeclContext importdecl() throws RecognitionException {
		ImportdeclContext _localctx = new ImportdeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_importdecl);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				importmodule();
				}
				break;
			case FROMKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				importmember();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportmoduleContext extends ParserRuleContext {
		public TerminalNode IMPORTKW() { return getToken(ScribbleParser.IMPORTKW, 0); }
		public ModulenameContext modulename() {
			return getRuleContext(ModulenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ImportmoduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importmodule; }
	}

	public final ImportmoduleContext importmodule() throws RecognitionException {
		ImportmoduleContext _localctx = new ImportmoduleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_importmodule);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(IMPORTKW);
				setState(245);
				modulename();
				setState(246);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(IMPORTKW);
				setState(249);
				modulename();
				setState(250);
				match(ASKW);
				setState(251);
				match(IDENTIFIER);
				setState(252);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportmemberContext extends ParserRuleContext {
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public ModulenameContext modulename() {
			return getRuleContext(ModulenameContext.class,0);
		}
		public TerminalNode IMPORTKW() { return getToken(ScribbleParser.IMPORTKW, 0); }
		public SimplemembernameContext simplemembername() {
			return getRuleContext(SimplemembernameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ImportmemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importmember; }
	}

	public final ImportmemberContext importmember() throws RecognitionException {
		ImportmemberContext _localctx = new ImportmemberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_importmember);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(FROMKW);
				setState(257);
				modulename();
				setState(258);
				match(IMPORTKW);
				setState(259);
				simplemembername();
				setState(260);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(FROMKW);
				setState(263);
				modulename();
				setState(264);
				match(IMPORTKW);
				setState(265);
				simplemembername();
				setState(266);
				match(ASKW);
				setState(267);
				match(IDENTIFIER);
				setState(268);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PayloadtypedeclContext extends ParserRuleContext {
		public TerminalNode TYPEKW() { return getToken(ScribbleParser.TYPEKW, 0); }
		public TerminalNode ANGLELEFT() { return getToken(ScribbleParser.ANGLELEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public TerminalNode ANGLERIGHT() { return getToken(ScribbleParser.ANGLERIGHT, 0); }
		public List<TerminalNode> EXTIDENTIFIER() { return getTokens(ScribbleParser.EXTIDENTIFIER); }
		public TerminalNode EXTIDENTIFIER(int i) {
			return getToken(ScribbleParser.EXTIDENTIFIER, i);
		}
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public PayloadtypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payloadtypedecl; }
	}

	public final PayloadtypedeclContext payloadtypedecl() throws RecognitionException {
		PayloadtypedeclContext _localctx = new PayloadtypedeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_payloadtypedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(TYPEKW);
			setState(273);
			match(ANGLELEFT);
			setState(274);
			match(IDENTIFIER);
			setState(275);
			match(ANGLERIGHT);
			setState(276);
			match(EXTIDENTIFIER);
			setState(277);
			match(FROMKW);
			setState(278);
			match(EXTIDENTIFIER);
			setState(279);
			match(ASKW);
			setState(280);
			payloadtypename();
			setState(281);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessagesignaturedeclContext extends ParserRuleContext {
		public TerminalNode SIGKW() { return getToken(ScribbleParser.SIGKW, 0); }
		public TerminalNode ANGLELEFT() { return getToken(ScribbleParser.ANGLELEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public TerminalNode ANGLERIGHT() { return getToken(ScribbleParser.ANGLERIGHT, 0); }
		public List<TerminalNode> EXTIDENTIFIER() { return getTokens(ScribbleParser.EXTIDENTIFIER); }
		public TerminalNode EXTIDENTIFIER(int i) {
			return getToken(ScribbleParser.EXTIDENTIFIER, i);
		}
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public SimplemessagesignaturenameContext simplemessagesignaturename() {
			return getRuleContext(SimplemessagesignaturenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public MessagesignaturedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messagesignaturedecl; }
	}

	public final MessagesignaturedeclContext messagesignaturedecl() throws RecognitionException {
		MessagesignaturedeclContext _localctx = new MessagesignaturedeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_messagesignaturedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(SIGKW);
			setState(284);
			match(ANGLELEFT);
			setState(285);
			match(IDENTIFIER);
			setState(286);
			match(ANGLERIGHT);
			setState(287);
			match(EXTIDENTIFIER);
			setState(288);
			match(FROMKW);
			setState(289);
			match(EXTIDENTIFIER);
			setState(290);
			match(ASKW);
			setState(291);
			simplemessagesignaturename();
			setState(292);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessagesignatureContext extends ParserRuleContext {
		public MessagesignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messagesignature; }
	 
		public MessagesignatureContext() { }
		public void copyFrom(MessagesignatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdPayloadContext extends MessagesignatureContext {
		public TerminalNode ROUNDLEFT() { return getToken(ScribbleParser.ROUNDLEFT, 0); }
		public TerminalNode ROUNDRIGHT() { return getToken(ScribbleParser.ROUNDRIGHT, 0); }
		public PayloadContext payload() {
			return getRuleContext(PayloadContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public IdPayloadContext(MessagesignatureContext ctx) { copyFrom(ctx); }
	}

	public final MessagesignatureContext messagesignature() throws RecognitionException {
		MessagesignatureContext _localctx = new MessagesignatureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_messagesignature);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(ROUNDLEFT);
				setState(295);
				match(ROUNDRIGHT);
				}
				break;
			case 2:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(ROUNDLEFT);
				setState(297);
				payload();
				setState(298);
				match(ROUNDRIGHT);
				}
				break;
			case 3:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(IDENTIFIER);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROUNDLEFT) {
					{
					setState(301);
					match(ROUNDLEFT);
					setState(302);
					payload();
					setState(303);
					match(ROUNDRIGHT);
					}
				}

				}
				break;
			case 4:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(IDENTIFIER);
				setState(308);
				match(ROUNDLEFT);
				setState(309);
				match(ROUNDRIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PayloadContext extends ParserRuleContext {
		public List<PayloadelementContext> payloadelement() {
			return getRuleContexts(PayloadelementContext.class);
		}
		public PayloadelementContext payloadelement(int i) {
			return getRuleContext(PayloadelementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public PayloadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload; }
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_payload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			payloadelement();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(313);
				match(COMMA);
				setState(314);
				payloadelement();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PayloadelementContext extends ParserRuleContext {
		public PayloadelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payloadelement; }
	 
		public PayloadelementContext() { }
		public void copyFrom(PayloadelementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnnotParamNameContext extends PayloadelementContext {
		public AnnotationnameContext annotationname() {
			return getRuleContext(AnnotationnameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public ParameternameContext parametername() {
			return getRuleContext(ParameternameContext.class,0);
		}
		public AnnotParamNameContext(PayloadelementContext ctx) { copyFrom(ctx); }
	}
	public static class SimplePayloadContext extends PayloadelementContext {
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public ParameternameContext parametername() {
			return getRuleContext(ParameternameContext.class,0);
		}
		public SimplePayloadContext(PayloadelementContext ctx) { copyFrom(ctx); }
	}
	public static class AnnotPayloadTypeNameContext extends PayloadelementContext {
		public AnnotationnameContext annotationname() {
			return getRuleContext(AnnotationnameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public AnnotPayloadTypeNameContext(PayloadelementContext ctx) { copyFrom(ctx); }
	}

	public final PayloadelementContext payloadelement() throws RecognitionException {
		PayloadelementContext _localctx = new PayloadelementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_payloadelement);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SimplePayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				payloadtypename();
				}
				break;
			case 2:
				_localctx = new SimplePayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				parametername();
				}
				break;
			case 3:
				_localctx = new AnnotPayloadTypeNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				annotationname();
				setState(323);
				match(COLON);
				setState(324);
				payloadtypename();
				}
				break;
			case 4:
				_localctx = new AnnotParamNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				annotationname();
				setState(327);
				match(COLON);
				setState(328);
				parametername();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocoldeclContext extends ParserRuleContext {
		public ProtocoldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocoldecl; }
	 
		public ProtocoldeclContext() { }
		public void copyFrom(ProtocoldeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LcProtocolDeclContext extends ProtocoldeclContext {
		public LocalprotocoldeclContext localprotocoldecl() {
			return getRuleContext(LocalprotocoldeclContext.class,0);
		}
		public LcProtocolDeclContext(ProtocoldeclContext ctx) { copyFrom(ctx); }
	}
	public static class GlProtocolDeclContext extends ProtocoldeclContext {
		public GlobalprotocoldeclContext globalprotocoldecl() {
			return getRuleContext(GlobalprotocoldeclContext.class,0);
		}
		public GlProtocolDeclContext(ProtocoldeclContext ctx) { copyFrom(ctx); }
	}

	public final ProtocoldeclContext protocoldecl() throws RecognitionException {
		ProtocoldeclContext _localctx = new ProtocoldeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_protocoldecl);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBALKW:
				_localctx = new GlProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				globalprotocoldecl();
				}
				break;
			case LOCALKW:
				_localctx = new LcProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				localprotocoldecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceannotContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(ScribbleParser.LINE_COMMENT, 0); }
		public TerminalNode AT() { return getToken(ScribbleParser.AT, 0); }
		public TerminalNode CHOICENAMEKW() { return getToken(ScribbleParser.CHOICENAMEKW, 0); }
		public TerminalNode ROUNDLEFT() { return getToken(ScribbleParser.ROUNDLEFT, 0); }
		public ChoiceannotationnameContext choiceannotationname() {
			return getRuleContext(ChoiceannotationnameContext.class,0);
		}
		public TerminalNode ROUNDRIGHT() { return getToken(ScribbleParser.ROUNDRIGHT, 0); }
		public ChoiceannotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceannot; }
	}

	public final ChoiceannotContext choiceannot() throws RecognitionException {
		ChoiceannotContext _localctx = new ChoiceannotContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_choiceannot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LINE_COMMENT);
			setState(337);
			match(AT);
			setState(338);
			match(CHOICENAMEKW);
			setState(339);
			match(ROUNDLEFT);
			setState(340);
			choiceannotationname();
			setState(341);
			match(ROUNDRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalprotocoldeclContext extends ParserRuleContext {
		public GlobalprotocolheaderContext globalprotocolheader() {
			return getRuleContext(GlobalprotocolheaderContext.class,0);
		}
		public GlobalprotocoldefinitionContext globalprotocoldefinition() {
			return getRuleContext(GlobalprotocoldefinitionContext.class,0);
		}
		public GlobalprotocolinstanceContext globalprotocolinstance() {
			return getRuleContext(GlobalprotocolinstanceContext.class,0);
		}
		public GlobalprotocoldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalprotocoldecl; }
	}

	public final GlobalprotocoldeclContext globalprotocoldecl() throws RecognitionException {
		GlobalprotocoldeclContext _localctx = new GlobalprotocoldeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_globalprotocoldecl);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				globalprotocolheader();
				setState(344);
				globalprotocoldefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				globalprotocolheader();
				setState(347);
				globalprotocolinstance();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalprotocolheaderContext extends ParserRuleContext {
		public TerminalNode GLOBALKW() { return getToken(ScribbleParser.GLOBALKW, 0); }
		public TerminalNode PROTOCOLKW() { return getToken(ScribbleParser.PROTOCOLKW, 0); }
		public ProtocolnameContext protocolname() {
			return getRuleContext(ProtocolnameContext.class,0);
		}
		public RoledecllistContext roledecllist() {
			return getRuleContext(RoledecllistContext.class,0);
		}
		public ParameterdecllistContext parameterdecllist() {
			return getRuleContext(ParameterdecllistContext.class,0);
		}
		public GlobalprotocolheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalprotocolheader; }
	}

	public final GlobalprotocolheaderContext globalprotocolheader() throws RecognitionException {
		GlobalprotocolheaderContext _localctx = new GlobalprotocolheaderContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_globalprotocolheader);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(GLOBALKW);
				setState(352);
				match(PROTOCOLKW);
				setState(353);
				protocolname();
				setState(354);
				roledecllist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(GLOBALKW);
				setState(357);
				match(PROTOCOLKW);
				setState(358);
				protocolname();
				setState(359);
				parameterdecllist();
				setState(360);
				roledecllist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoledecllistContext extends ParserRuleContext {
		public TerminalNode ROUNDLEFT() { return getToken(ScribbleParser.ROUNDLEFT, 0); }
		public List<RoledeclContext> roledecl() {
			return getRuleContexts(RoledeclContext.class);
		}
		public RoledeclContext roledecl(int i) {
			return getRuleContext(RoledeclContext.class,i);
		}
		public TerminalNode ROUNDRIGHT() { return getToken(ScribbleParser.ROUNDRIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public RoledecllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roledecllist; }
	}

	public final RoledecllistContext roledecllist() throws RecognitionException {
		RoledecllistContext _localctx = new RoledecllistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_roledecllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ROUNDLEFT);
			setState(365);
			roledecl();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366);
				match(COMMA);
				setState(367);
				roledecl();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(ROUNDRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoledeclContext extends ParserRuleContext {
		public TerminalNode ROLEKW() { return getToken(ScribbleParser.ROLEKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public TerminalNode SELFKW() { return getToken(ScribbleParser.SELFKW, 0); }
		public RoledeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roledecl; }
	}

	public final RoledeclContext roledecl() throws RecognitionException {
		RoledeclContext _localctx = new RoledeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_roledecl);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(ROLEKW);
				setState(376);
				rolename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(ROLEKW);
				setState(378);
				rolename();
				setState(379);
				match(ASKW);
				setState(380);
				rolename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(SELFKW);
				setState(383);
				rolename();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdecllistContext extends ParserRuleContext {
		public TerminalNode ANGLELEFT() { return getToken(ScribbleParser.ANGLELEFT, 0); }
		public List<ParameterdeclContext> parameterdecl() {
			return getRuleContexts(ParameterdeclContext.class);
		}
		public ParameterdeclContext parameterdecl(int i) {
			return getRuleContext(ParameterdeclContext.class,i);
		}
		public TerminalNode ANGLERIGHT() { return getToken(ScribbleParser.ANGLERIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public ParameterdecllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdecllist; }
	}

	public final ParameterdecllistContext parameterdecllist() throws RecognitionException {
		ParameterdecllistContext _localctx = new ParameterdecllistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameterdecllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ANGLELEFT);
			setState(387);
			parameterdecl();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(388);
				match(COMMA);
				setState(389);
				parameterdecl();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(ANGLERIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclContext extends ParserRuleContext {
		public TerminalNode TYPEKW() { return getToken(ScribbleParser.TYPEKW, 0); }
		public List<ParameternameContext> parametername() {
			return getRuleContexts(ParameternameContext.class);
		}
		public ParameternameContext parametername(int i) {
			return getRuleContext(ParameternameContext.class,i);
		}
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public TerminalNode SIGKW() { return getToken(ScribbleParser.SIGKW, 0); }
		public ParameterdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdecl; }
	}

	public final ParameterdeclContext parameterdecl() throws RecognitionException {
		ParameterdeclContext _localctx = new ParameterdeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parameterdecl);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(TYPEKW);
				setState(398);
				parametername();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(TYPEKW);
				setState(400);
				parametername();
				setState(401);
				match(ASKW);
				setState(402);
				parametername();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(SIGKW);
				setState(405);
				parametername();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(SIGKW);
				setState(407);
				parametername();
				setState(408);
				match(ASKW);
				setState(409);
				parametername();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalprotocoldefinitionContext extends ParserRuleContext {
		public GlobalprotocolblockContext globalprotocolblock() {
			return getRuleContext(GlobalprotocolblockContext.class,0);
		}
		public GlobalprotocoldefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalprotocoldefinition; }
	}

	public final GlobalprotocoldefinitionContext globalprotocoldefinition() throws RecognitionException {
		GlobalprotocoldefinitionContext _localctx = new GlobalprotocoldefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_globalprotocoldefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			globalprotocolblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalprotocolinstanceContext extends ParserRuleContext {
		public TerminalNode INSTANTIATESKW() { return getToken(ScribbleParser.INSTANTIATESKW, 0); }
		public MembernameContext membername() {
			return getRuleContext(MembernameContext.class,0);
		}
		public RoleinstantiationlistContext roleinstantiationlist() {
			return getRuleContext(RoleinstantiationlistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public GlobalprotocolinstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalprotocolinstance; }
	}

	public final GlobalprotocolinstanceContext globalprotocolinstance() throws RecognitionException {
		GlobalprotocolinstanceContext _localctx = new GlobalprotocolinstanceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_globalprotocolinstance);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(INSTANTIATESKW);
				setState(416);
				membername();
				setState(417);
				roleinstantiationlist();
				setState(418);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(INSTANTIATESKW);
				setState(421);
				membername();
				setState(422);
				argumentlist();
				setState(423);
				roleinstantiationlist();
				setState(424);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleinstantiationlistContext extends ParserRuleContext {
		public TerminalNode ROUNDLEFT() { return getToken(ScribbleParser.ROUNDLEFT, 0); }
		public List<RoleinstantiationContext> roleinstantiation() {
			return getRuleContexts(RoleinstantiationContext.class);
		}
		public RoleinstantiationContext roleinstantiation(int i) {
			return getRuleContext(RoleinstantiationContext.class,i);
		}
		public TerminalNode ROUNDRIGHT() { return getToken(ScribbleParser.ROUNDRIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public RoleinstantiationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleinstantiationlist; }
	}

	public final RoleinstantiationlistContext roleinstantiationlist() throws RecognitionException {
		RoleinstantiationlistContext _localctx = new RoleinstantiationlistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_roleinstantiationlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(ROUNDLEFT);
			setState(429);
			roleinstantiation();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(430);
				match(COMMA);
				setState(431);
				roleinstantiation();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(ROUNDRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleinstantiationContext extends ParserRuleContext {
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public RoleinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleinstantiation; }
	}

	public final RoleinstantiationContext roleinstantiation() throws RecognitionException {
		RoleinstantiationContext _localctx = new RoleinstantiationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_roleinstantiation);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				rolename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				rolename();
				setState(441);
				match(ASKW);
				setState(442);
				rolename();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentlistContext extends ParserRuleContext {
		public TerminalNode ANGLELEFT() { return getToken(ScribbleParser.ANGLELEFT, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode ANGLERIGHT() { return getToken(ScribbleParser.ANGLERIGHT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(ANGLELEFT);
			setState(447);
			argument();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(448);
				match(COMMA);
				setState(449);
				argument();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(ANGLERIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public TerminalNode ASKW() { return getToken(ScribbleParser.ASKW, 0); }
		public List<ParameternameContext> parametername() {
			return getRuleContexts(ParameternameContext.class);
		}
		public ParameternameContext parametername(int i) {
			return getRuleContext(ParameternameContext.class,i);
		}
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argument);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				messagesignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				messagesignature();
				setState(459);
				match(ASKW);
				setState(460);
				parametername();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				payloadtypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				payloadtypename();
				setState(464);
				match(ASKW);
				setState(465);
				parametername();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				parametername();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				parametername();
				setState(469);
				match(ASKW);
				setState(470);
				parametername();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalprotocolblockContext extends ParserRuleContext {
		public TerminalNode CURLYLEFT() { return getToken(ScribbleParser.CURLYLEFT, 0); }
		public GlobalinteractionsequenceContext globalinteractionsequence() {
			return getRuleContext(GlobalinteractionsequenceContext.class,0);
		}
		public TerminalNode CURLYRIGHT() { return getToken(ScribbleParser.CURLYRIGHT, 0); }
		public GlobalprotocolblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalprotocolblock; }
	}

	public final GlobalprotocolblockContext globalprotocolblock() throws RecognitionException {
		GlobalprotocolblockContext _localctx = new GlobalprotocolblockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_globalprotocolblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(CURLYLEFT);
			setState(475);
			globalinteractionsequence();
			setState(476);
			match(CURLYRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalinteractionsequenceContext extends ParserRuleContext {
		public List<GlobalinteractionContext> globalinteraction() {
			return getRuleContexts(GlobalinteractionContext.class);
		}
		public GlobalinteractionContext globalinteraction(int i) {
			return getRuleContext(GlobalinteractionContext.class,i);
		}
		public GlobalinteractionsequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalinteractionsequence; }
	}

	public final GlobalinteractionsequenceContext globalinteractionsequence() throws RecognitionException {
		GlobalinteractionsequenceContext _localctx = new GlobalinteractionsequenceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_globalinteractionsequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHOICEKW) | (1L << RECKW) | (1L << CONTINUEKW) | (1L << PARKW) | (1L << INTERRUPTIBLEKW) | (1L << DOKW) | (1L << DISCONNECTKW) | (1L << WRAPKW) | (1L << LINE_COMMENT) | (1L << IDENTIFIER) | (1L << ROUNDLEFT))) != 0)) {
				{
				{
				setState(478);
				globalinteraction();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalinteractionContext extends ParserRuleContext {
		public GlobalmessagetransferContext globalmessagetransfer() {
			return getRuleContext(GlobalmessagetransferContext.class,0);
		}
		public GlobalchoiceContext globalchoice() {
			return getRuleContext(GlobalchoiceContext.class,0);
		}
		public GlobalrecursionContext globalrecursion() {
			return getRuleContext(GlobalrecursionContext.class,0);
		}
		public GlobalcontinueContext globalcontinue() {
			return getRuleContext(GlobalcontinueContext.class,0);
		}
		public GlobalparallelContext globalparallel() {
			return getRuleContext(GlobalparallelContext.class,0);
		}
		public GlobalinterruptibleContext globalinterruptible() {
			return getRuleContext(GlobalinterruptibleContext.class,0);
		}
		public GlobaldoContext globaldo() {
			return getRuleContext(GlobaldoContext.class,0);
		}
		public GlobalconnectContext globalconnect() {
			return getRuleContext(GlobalconnectContext.class,0);
		}
		public GlobaldisconnectContext globaldisconnect() {
			return getRuleContext(GlobaldisconnectContext.class,0);
		}
		public GlobalwrapContext globalwrap() {
			return getRuleContext(GlobalwrapContext.class,0);
		}
		public GlobalinteractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalinteraction; }
	}

	public final GlobalinteractionContext globalinteraction() throws RecognitionException {
		GlobalinteractionContext _localctx = new GlobalinteractionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_globalinteraction);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				globalmessagetransfer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				globalchoice();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				globalrecursion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				globalcontinue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				globalparallel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
				globalinterruptible();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(490);
				globaldo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(491);
				globalconnect();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(492);
				globaldisconnect();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(493);
				globalwrap();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalmessagetransferContext extends ParserRuleContext {
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode TOKW() { return getToken(ScribbleParser.TOKW, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public GlobalmessagetransferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalmessagetransfer; }
	}

	public final GlobalmessagetransferContext globalmessagetransfer() throws RecognitionException {
		GlobalmessagetransferContext _localctx = new GlobalmessagetransferContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_globalmessagetransfer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			message();
			setState(497);
			match(FROMKW);
			setState(498);
			rolename();
			setState(499);
			match(TOKW);
			setState(500);
			rolename();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(501);
				match(COMMA);
				setState(502);
				rolename();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			messagesignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalconnectContext extends ParserRuleContext {
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode CONNECTKW() { return getToken(ScribbleParser.CONNECTKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode TOKW() { return getToken(ScribbleParser.TOKW, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public GlobalconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalconnect; }
	}

	public final GlobalconnectContext globalconnect() throws RecognitionException {
		GlobalconnectContext _localctx = new GlobalconnectContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_globalconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			message();
			setState(513);
			match(CONNECTKW);
			setState(514);
			rolename();
			setState(515);
			match(TOKW);
			setState(516);
			rolename();
			setState(517);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobaldisconnectContext extends ParserRuleContext {
		public TerminalNode DISCONNECTKW() { return getToken(ScribbleParser.DISCONNECTKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode ANDKW() { return getToken(ScribbleParser.ANDKW, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public GlobaldisconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaldisconnect; }
	}

	public final GlobaldisconnectContext globaldisconnect() throws RecognitionException {
		GlobaldisconnectContext _localctx = new GlobaldisconnectContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_globaldisconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(DISCONNECTKW);
			setState(520);
			rolename();
			setState(521);
			match(ANDKW);
			setState(522);
			rolename();
			setState(523);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalwrapContext extends ParserRuleContext {
		public TerminalNode WRAPKW() { return getToken(ScribbleParser.WRAPKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode TOKW() { return getToken(ScribbleParser.TOKW, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public GlobalwrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalwrap; }
	}

	public final GlobalwrapContext globalwrap() throws RecognitionException {
		GlobalwrapContext _localctx = new GlobalwrapContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_globalwrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(WRAPKW);
			setState(526);
			rolename();
			setState(527);
			match(TOKW);
			setState(528);
			rolename();
			setState(529);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalchoiceContext extends ParserRuleContext {
		public TerminalNode CHOICEKW() { return getToken(ScribbleParser.CHOICEKW, 0); }
		public TerminalNode ATKW() { return getToken(ScribbleParser.ATKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public List<GlobalprotocolblockContext> globalprotocolblock() {
			return getRuleContexts(GlobalprotocolblockContext.class);
		}
		public GlobalprotocolblockContext globalprotocolblock(int i) {
			return getRuleContext(GlobalprotocolblockContext.class,i);
		}
		public ChoiceannotContext choiceannot() {
			return getRuleContext(ChoiceannotContext.class,0);
		}
		public List<TerminalNode> ORKW() { return getTokens(ScribbleParser.ORKW); }
		public TerminalNode ORKW(int i) {
			return getToken(ScribbleParser.ORKW, i);
		}
		public GlobalchoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalchoice; }
	}

	public final GlobalchoiceContext globalchoice() throws RecognitionException {
		GlobalchoiceContext _localctx = new GlobalchoiceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_globalchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(531);
				choiceannot();
				}
			}

			setState(534);
			match(CHOICEKW);
			setState(535);
			match(ATKW);
			setState(536);
			rolename();
			setState(537);
			globalprotocolblock();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORKW) {
				{
				{
				setState(538);
				match(ORKW);
				setState(539);
				globalprotocolblock();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalrecursionContext extends ParserRuleContext {
		public TerminalNode RECKW() { return getToken(ScribbleParser.RECKW, 0); }
		public RecursionlabelnameContext recursionlabelname() {
			return getRuleContext(RecursionlabelnameContext.class,0);
		}
		public GlobalprotocolblockContext globalprotocolblock() {
			return getRuleContext(GlobalprotocolblockContext.class,0);
		}
		public GlobalrecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalrecursion; }
	}

	public final GlobalrecursionContext globalrecursion() throws RecognitionException {
		GlobalrecursionContext _localctx = new GlobalrecursionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_globalrecursion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(RECKW);
			setState(546);
			recursionlabelname();
			setState(547);
			globalprotocolblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalcontinueContext extends ParserRuleContext {
		public TerminalNode CONTINUEKW() { return getToken(ScribbleParser.CONTINUEKW, 0); }
		public RecursionlabelnameContext recursionlabelname() {
			return getRuleContext(RecursionlabelnameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public GlobalcontinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalcontinue; }
	}

	public final GlobalcontinueContext globalcontinue() throws RecognitionException {
		GlobalcontinueContext _localctx = new GlobalcontinueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_globalcontinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(CONTINUEKW);
			setState(550);
			recursionlabelname();
			setState(551);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalparallelContext extends ParserRuleContext {
		public TerminalNode PARKW() { return getToken(ScribbleParser.PARKW, 0); }
		public List<GlobalprotocolblockContext> globalprotocolblock() {
			return getRuleContexts(GlobalprotocolblockContext.class);
		}
		public GlobalprotocolblockContext globalprotocolblock(int i) {
			return getRuleContext(GlobalprotocolblockContext.class,i);
		}
		public List<TerminalNode> ANDKW() { return getTokens(ScribbleParser.ANDKW); }
		public TerminalNode ANDKW(int i) {
			return getToken(ScribbleParser.ANDKW, i);
		}
		public GlobalparallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalparallel; }
	}

	public final GlobalparallelContext globalparallel() throws RecognitionException {
		GlobalparallelContext _localctx = new GlobalparallelContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_globalparallel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(PARKW);
			setState(554);
			globalprotocolblock();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDKW) {
				{
				{
				setState(555);
				match(ANDKW);
				setState(556);
				globalprotocolblock();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalinterruptibleContext extends ParserRuleContext {
		public TerminalNode INTERRUPTIBLEKW() { return getToken(ScribbleParser.INTERRUPTIBLEKW, 0); }
		public GlobalprotocolblockContext globalprotocolblock() {
			return getRuleContext(GlobalprotocolblockContext.class,0);
		}
		public TerminalNode WITHKW() { return getToken(ScribbleParser.WITHKW, 0); }
		public TerminalNode CURLYLEFT() { return getToken(ScribbleParser.CURLYLEFT, 0); }
		public TerminalNode CURLYRIGHT() { return getToken(ScribbleParser.CURLYRIGHT, 0); }
		public List<GlobalinterruptContext> globalinterrupt() {
			return getRuleContexts(GlobalinterruptContext.class);
		}
		public GlobalinterruptContext globalinterrupt(int i) {
			return getRuleContext(GlobalinterruptContext.class,i);
		}
		public ScopenameContext scopename() {
			return getRuleContext(ScopenameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public GlobalinterruptibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalinterruptible; }
	}

	public final GlobalinterruptibleContext globalinterruptible() throws RecognitionException {
		GlobalinterruptibleContext _localctx = new GlobalinterruptibleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_globalinterruptible);
		int _la;
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(INTERRUPTIBLEKW);
				setState(563);
				globalprotocolblock();
				setState(564);
				match(WITHKW);
				setState(565);
				match(CURLYLEFT);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==ROUNDLEFT) {
					{
					{
					setState(566);
					globalinterrupt();
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572);
				match(CURLYRIGHT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(INTERRUPTIBLEKW);
				setState(575);
				scopename();
				setState(576);
				match(COLON);
				setState(577);
				globalprotocolblock();
				setState(578);
				match(WITHKW);
				setState(579);
				match(CURLYLEFT);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==ROUNDLEFT) {
					{
					{
					setState(580);
					globalinterrupt();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
				match(CURLYRIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalinterruptContext extends ParserRuleContext {
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public TerminalNode BYKW() { return getToken(ScribbleParser.BYKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public GlobalinterruptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalinterrupt; }
	}

	public final GlobalinterruptContext globalinterrupt() throws RecognitionException {
		GlobalinterruptContext _localctx = new GlobalinterruptContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_globalinterrupt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			message();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(591);
				match(COMMA);
				setState(592);
				message();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(BYKW);
			setState(599);
			rolename();
			setState(600);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobaldoContext extends ParserRuleContext {
		public TerminalNode DOKW() { return getToken(ScribbleParser.DOKW, 0); }
		public MembernameContext membername() {
			return getRuleContext(MembernameContext.class,0);
		}
		public RoleinstantiationlistContext roleinstantiationlist() {
			return getRuleContext(RoleinstantiationlistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ScopenameContext scopename() {
			return getRuleContext(ScopenameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public GlobaldoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globaldo; }
	}

	public final GlobaldoContext globaldo() throws RecognitionException {
		GlobaldoContext _localctx = new GlobaldoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_globaldo);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(DOKW);
				setState(603);
				membername();
				setState(604);
				roleinstantiationlist();
				setState(605);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(DOKW);
				setState(608);
				membername();
				setState(609);
				argumentlist();
				setState(610);
				roleinstantiationlist();
				setState(611);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				match(DOKW);
				setState(614);
				scopename();
				setState(615);
				match(COLON);
				setState(616);
				membername();
				setState(617);
				roleinstantiationlist();
				setState(618);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(620);
				match(DOKW);
				setState(621);
				scopename();
				setState(622);
				match(COLON);
				setState(623);
				membername();
				setState(624);
				argumentlist();
				setState(625);
				roleinstantiationlist();
				setState(626);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalprotocoldeclContext extends ParserRuleContext {
		public LocalprotocoldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localprotocoldecl; }
	 
		public LocalprotocoldeclContext() { }
		public void copyFrom(LocalprotocoldeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StndLocalProtocolDeclContext extends LocalprotocoldeclContext {
		public LocalprotocolheaderContext localprotocolheader() {
			return getRuleContext(LocalprotocolheaderContext.class,0);
		}
		public LocalprotocoldefinitionContext localprotocoldefinition() {
			return getRuleContext(LocalprotocoldefinitionContext.class,0);
		}
		public StndLocalProtocolDeclContext(LocalprotocoldeclContext ctx) { copyFrom(ctx); }
	}
	public static class InstLocalProtocolDeclContext extends LocalprotocoldeclContext {
		public LocalprotocolheaderContext localprotocolheader() {
			return getRuleContext(LocalprotocolheaderContext.class,0);
		}
		public LocalprotocolinstanceContext localprotocolinstance() {
			return getRuleContext(LocalprotocolinstanceContext.class,0);
		}
		public InstLocalProtocolDeclContext(LocalprotocoldeclContext ctx) { copyFrom(ctx); }
	}

	public final LocalprotocoldeclContext localprotocoldecl() throws RecognitionException {
		LocalprotocoldeclContext _localctx = new LocalprotocoldeclContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_localprotocoldecl);
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new StndLocalProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				localprotocolheader();
				setState(631);
				localprotocoldefinition();
				}
				break;
			case 2:
				_localctx = new InstLocalProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				localprotocolheader();
				setState(634);
				localprotocolinstance();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalprotocolheaderContext extends ParserRuleContext {
		public LocalprotocolheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localprotocolheader; }
	 
		public LocalprotocolheaderContext() { }
		public void copyFrom(LocalprotocolheaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StndLocalProtocolHeaderContext extends LocalprotocolheaderContext {
		public TerminalNode LOCALKW() { return getToken(ScribbleParser.LOCALKW, 0); }
		public TerminalNode PROTOCOLKW() { return getToken(ScribbleParser.PROTOCOLKW, 0); }
		public ProtocolnameContext protocolname() {
			return getRuleContext(ProtocolnameContext.class,0);
		}
		public RoledecllistContext roledecllist() {
			return getRuleContext(RoledecllistContext.class,0);
		}
		public TerminalNode ATKW() { return getToken(ScribbleParser.ATKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public StndLocalProtocolHeaderContext(LocalprotocolheaderContext ctx) { copyFrom(ctx); }
	}
	public static class ParamLocalProtocolHeaderContext extends LocalprotocolheaderContext {
		public TerminalNode LOCALKW() { return getToken(ScribbleParser.LOCALKW, 0); }
		public TerminalNode PROTOCOLKW() { return getToken(ScribbleParser.PROTOCOLKW, 0); }
		public ProtocolnameContext protocolname() {
			return getRuleContext(ProtocolnameContext.class,0);
		}
		public ParameterdecllistContext parameterdecllist() {
			return getRuleContext(ParameterdecllistContext.class,0);
		}
		public RoledecllistContext roledecllist() {
			return getRuleContext(RoledecllistContext.class,0);
		}
		public TerminalNode ATKW() { return getToken(ScribbleParser.ATKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public ParamLocalProtocolHeaderContext(LocalprotocolheaderContext ctx) { copyFrom(ctx); }
	}

	public final LocalprotocolheaderContext localprotocolheader() throws RecognitionException {
		LocalprotocolheaderContext _localctx = new LocalprotocolheaderContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_localprotocolheader);
		try {
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new StndLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(LOCALKW);
				setState(639);
				match(PROTOCOLKW);
				setState(640);
				protocolname();
				setState(641);
				roledecllist();
				}
				break;
			case 2:
				_localctx = new StndLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(LOCALKW);
				setState(644);
				match(PROTOCOLKW);
				setState(645);
				protocolname();
				setState(646);
				match(ATKW);
				setState(647);
				rolename();
				setState(648);
				roledecllist();
				}
				break;
			case 3:
				_localctx = new ParamLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(LOCALKW);
				setState(651);
				match(PROTOCOLKW);
				setState(652);
				protocolname();
				setState(653);
				parameterdecllist();
				setState(654);
				roledecllist();
				}
				break;
			case 4:
				_localctx = new ParamLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				match(LOCALKW);
				setState(657);
				match(PROTOCOLKW);
				setState(658);
				protocolname();
				setState(659);
				match(ATKW);
				setState(660);
				rolename();
				setState(661);
				parameterdecllist();
				setState(662);
				roledecllist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalprotocoldefinitionContext extends ParserRuleContext {
		public LocalprotocolblockContext localprotocolblock() {
			return getRuleContext(LocalprotocolblockContext.class,0);
		}
		public LocalprotocoldefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localprotocoldefinition; }
	}

	public final LocalprotocoldefinitionContext localprotocoldefinition() throws RecognitionException {
		LocalprotocoldefinitionContext _localctx = new LocalprotocoldefinitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_localprotocoldefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			localprotocolblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalprotocolinstanceContext extends ParserRuleContext {
		public TerminalNode INSTANTIATESKW() { return getToken(ScribbleParser.INSTANTIATESKW, 0); }
		public MembernameContext membername() {
			return getRuleContext(MembernameContext.class,0);
		}
		public RoleinstantiationlistContext roleinstantiationlist() {
			return getRuleContext(RoleinstantiationlistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public LocalprotocolinstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localprotocolinstance; }
	}

	public final LocalprotocolinstanceContext localprotocolinstance() throws RecognitionException {
		LocalprotocolinstanceContext _localctx = new LocalprotocolinstanceContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_localprotocolinstance);
		try {
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(INSTANTIATESKW);
				setState(669);
				membername();
				setState(670);
				roleinstantiationlist();
				setState(671);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(INSTANTIATESKW);
				setState(674);
				membername();
				setState(675);
				argumentlist();
				setState(676);
				roleinstantiationlist();
				setState(677);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalprotocolblockContext extends ParserRuleContext {
		public TerminalNode CURLYLEFT() { return getToken(ScribbleParser.CURLYLEFT, 0); }
		public TerminalNode CURLYRIGHT() { return getToken(ScribbleParser.CURLYRIGHT, 0); }
		public List<LocalinteractionContext> localinteraction() {
			return getRuleContexts(LocalinteractionContext.class);
		}
		public LocalinteractionContext localinteraction(int i) {
			return getRuleContext(LocalinteractionContext.class,i);
		}
		public LocalprotocolblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localprotocolblock; }
	}

	public final LocalprotocolblockContext localprotocolblock() throws RecognitionException {
		LocalprotocolblockContext _localctx = new LocalprotocolblockContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_localprotocolblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(CURLYLEFT);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CHOICEKW) | (1L << RECKW) | (1L << CONTINUEKW) | (1L << PARKW) | (1L << INTERRUPTIBLEKW) | (1L << DOKW) | (1L << DISCONNECTKW) | (1L << WRAPKW) | (1L << LINE_COMMENT) | (1L << IDENTIFIER) | (1L << ROUNDLEFT))) != 0)) {
				{
				{
				setState(682);
				localinteraction();
				}
				}
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(688);
			match(CURLYRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalinteractionContext extends ParserRuleContext {
		public LocalsendContext localsend() {
			return getRuleContext(LocalsendContext.class,0);
		}
		public LocalreceiveContext localreceive() {
			return getRuleContext(LocalreceiveContext.class,0);
		}
		public LocalchoiceContext localchoice() {
			return getRuleContext(LocalchoiceContext.class,0);
		}
		public LocalparallelContext localparallel() {
			return getRuleContext(LocalparallelContext.class,0);
		}
		public LocalrecursionContext localrecursion() {
			return getRuleContext(LocalrecursionContext.class,0);
		}
		public LocalcontinueContext localcontinue() {
			return getRuleContext(LocalcontinueContext.class,0);
		}
		public LocalinterruptibleContext localinterruptible() {
			return getRuleContext(LocalinterruptibleContext.class,0);
		}
		public LocaldoContext localdo() {
			return getRuleContext(LocaldoContext.class,0);
		}
		public LocalsendwrapContext localsendwrap() {
			return getRuleContext(LocalsendwrapContext.class,0);
		}
		public LocalreceivewrapContext localreceivewrap() {
			return getRuleContext(LocalreceivewrapContext.class,0);
		}
		public LocalconnectContext localconnect() {
			return getRuleContext(LocalconnectContext.class,0);
		}
		public LocalacceptContext localaccept() {
			return getRuleContext(LocalacceptContext.class,0);
		}
		public LocaldisconnectContext localdisconnect() {
			return getRuleContext(LocaldisconnectContext.class,0);
		}
		public LocalinteractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localinteraction; }
	}

	public final LocalinteractionContext localinteraction() throws RecognitionException {
		LocalinteractionContext _localctx = new LocalinteractionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_localinteraction);
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				localsend();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				localreceive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				localchoice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				localparallel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(694);
				localrecursion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				localcontinue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(696);
				localinterruptible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(697);
				localdo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(698);
				localsendwrap();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(699);
				localreceivewrap();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(700);
				localconnect();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(701);
				localaccept();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(702);
				localdisconnect();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalsendContext extends ParserRuleContext {
		public TimeconstraintContext timeconstraint() {
			return getRuleContext(TimeconstraintContext.class,0);
		}
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public TerminalNode TOKW() { return getToken(ScribbleParser.TOKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public LocalsendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsend; }
	}

	public final LocalsendContext localsend() throws RecognitionException {
		LocalsendContext _localctx = new LocalsendContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_localsend);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(T__1);
				setState(706);
				timeconstraint();
				setState(707);
				match(T__2);
				setState(708);
				messagesignature();
				setState(709);
				match(TOKW);
				setState(710);
				rolename();
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(711);
					match(COMMA);
					setState(712);
					rolename();
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
			case ROUNDLEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				messagesignature();
				setState(721);
				match(TOKW);
				setState(722);
				rolename();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(723);
					match(COMMA);
					setState(724);
					rolename();
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalreceiveContext extends ParserRuleContext {
		public TimeconstraintContext timeconstraint() {
			return getRuleContext(TimeconstraintContext.class,0);
		}
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocalreceiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localreceive; }
	}

	public final LocalreceiveContext localreceive() throws RecognitionException {
		LocalreceiveContext _localctx = new LocalreceiveContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_localreceive);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(T__1);
				setState(735);
				timeconstraint();
				setState(736);
				match(T__2);
				setState(737);
				messagesignature();
				setState(738);
				match(FROMKW);
				setState(739);
				match(IDENTIFIER);
				setState(740);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
			case ROUNDLEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				messagesignature();
				setState(743);
				match(FROMKW);
				setState(744);
				match(IDENTIFIER);
				setState(745);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalsendwrapContext extends ParserRuleContext {
		public TerminalNode WRAPKW() { return getToken(ScribbleParser.WRAPKW, 0); }
		public TerminalNode TOKW() { return getToken(ScribbleParser.TOKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocalsendwrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsendwrap; }
	}

	public final LocalsendwrapContext localsendwrap() throws RecognitionException {
		LocalsendwrapContext _localctx = new LocalsendwrapContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_localsendwrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(WRAPKW);
			setState(750);
			match(TOKW);
			setState(751);
			rolename();
			setState(752);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalreceivewrapContext extends ParserRuleContext {
		public TerminalNode WRAPKW() { return getToken(ScribbleParser.WRAPKW, 0); }
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocalreceivewrapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localreceivewrap; }
	}

	public final LocalreceivewrapContext localreceivewrap() throws RecognitionException {
		LocalreceivewrapContext _localctx = new LocalreceivewrapContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localreceivewrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(WRAPKW);
			setState(755);
			match(FROMKW);
			setState(756);
			rolename();
			setState(757);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalconnectContext extends ParserRuleContext {
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public TerminalNode CONNECTKW() { return getToken(ScribbleParser.CONNECTKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocalconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localconnect; }
	}

	public final LocalconnectContext localconnect() throws RecognitionException {
		LocalconnectContext _localctx = new LocalconnectContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			messagesignature();
			setState(760);
			match(CONNECTKW);
			setState(761);
			rolename();
			setState(762);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalacceptContext extends ParserRuleContext {
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public TerminalNode ACCEPTKW() { return getToken(ScribbleParser.ACCEPTKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocalacceptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localaccept; }
	}

	public final LocalacceptContext localaccept() throws RecognitionException {
		LocalacceptContext _localctx = new LocalacceptContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localaccept);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			messagesignature();
			setState(765);
			match(ACCEPTKW);
			setState(766);
			rolename();
			setState(767);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocaldisconnectContext extends ParserRuleContext {
		public TerminalNode DISCONNECTKW() { return getToken(ScribbleParser.DISCONNECTKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocaldisconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localdisconnect; }
	}

	public final LocaldisconnectContext localdisconnect() throws RecognitionException {
		LocaldisconnectContext _localctx = new LocaldisconnectContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localdisconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(DISCONNECTKW);
			setState(770);
			rolename();
			setState(771);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalchoiceContext extends ParserRuleContext {
		public TerminalNode CHOICEKW() { return getToken(ScribbleParser.CHOICEKW, 0); }
		public TerminalNode ATKW() { return getToken(ScribbleParser.ATKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public List<LocalprotocolblockContext> localprotocolblock() {
			return getRuleContexts(LocalprotocolblockContext.class);
		}
		public LocalprotocolblockContext localprotocolblock(int i) {
			return getRuleContext(LocalprotocolblockContext.class,i);
		}
		public ChoiceannotContext choiceannot() {
			return getRuleContext(ChoiceannotContext.class,0);
		}
		public List<TerminalNode> ORKW() { return getTokens(ScribbleParser.ORKW); }
		public TerminalNode ORKW(int i) {
			return getToken(ScribbleParser.ORKW, i);
		}
		public LocalchoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localchoice; }
	}

	public final LocalchoiceContext localchoice() throws RecognitionException {
		LocalchoiceContext _localctx = new LocalchoiceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(773);
				choiceannot();
				}
			}

			setState(776);
			match(CHOICEKW);
			setState(777);
			match(ATKW);
			setState(778);
			rolename();
			setState(779);
			localprotocolblock();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORKW) {
				{
				{
				setState(780);
				match(ORKW);
				setState(781);
				localprotocolblock();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalrecursionContext extends ParserRuleContext {
		public TerminalNode RECKW() { return getToken(ScribbleParser.RECKW, 0); }
		public RecursionlabelnameContext recursionlabelname() {
			return getRuleContext(RecursionlabelnameContext.class,0);
		}
		public LocalprotocolblockContext localprotocolblock() {
			return getRuleContext(LocalprotocolblockContext.class,0);
		}
		public LocalrecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localrecursion; }
	}

	public final LocalrecursionContext localrecursion() throws RecognitionException {
		LocalrecursionContext _localctx = new LocalrecursionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localrecursion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(RECKW);
			setState(788);
			recursionlabelname();
			setState(789);
			localprotocolblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalcontinueContext extends ParserRuleContext {
		public TerminalNode CONTINUEKW() { return getToken(ScribbleParser.CONTINUEKW, 0); }
		public RecursionlabelnameContext recursionlabelname() {
			return getRuleContext(RecursionlabelnameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public LocalcontinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcontinue; }
	}

	public final LocalcontinueContext localcontinue() throws RecognitionException {
		LocalcontinueContext _localctx = new LocalcontinueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_localcontinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(CONTINUEKW);
			setState(792);
			recursionlabelname();
			setState(793);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalparallelContext extends ParserRuleContext {
		public TerminalNode PARKW() { return getToken(ScribbleParser.PARKW, 0); }
		public List<LocalprotocolblockContext> localprotocolblock() {
			return getRuleContexts(LocalprotocolblockContext.class);
		}
		public LocalprotocolblockContext localprotocolblock(int i) {
			return getRuleContext(LocalprotocolblockContext.class,i);
		}
		public List<TerminalNode> ANDKW() { return getTokens(ScribbleParser.ANDKW); }
		public TerminalNode ANDKW(int i) {
			return getToken(ScribbleParser.ANDKW, i);
		}
		public LocalparallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localparallel; }
	}

	public final LocalparallelContext localparallel() throws RecognitionException {
		LocalparallelContext _localctx = new LocalparallelContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_localparallel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(PARKW);
			setState(796);
			localprotocolblock();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDKW) {
				{
				{
				setState(797);
				match(ANDKW);
				setState(798);
				localprotocolblock();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalinterruptibleContext extends ParserRuleContext {
		public TerminalNode INTERRUPTIBLEKW() { return getToken(ScribbleParser.INTERRUPTIBLEKW, 0); }
		public ScopenameContext scopename() {
			return getRuleContext(ScopenameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public LocalprotocolblockContext localprotocolblock() {
			return getRuleContext(LocalprotocolblockContext.class,0);
		}
		public TerminalNode WITHKW() { return getToken(ScribbleParser.WITHKW, 0); }
		public TerminalNode CURLYLEFT() { return getToken(ScribbleParser.CURLYLEFT, 0); }
		public TerminalNode CURLYRIGHT() { return getToken(ScribbleParser.CURLYRIGHT, 0); }
		public List<LocalcatchContext> localcatch() {
			return getRuleContexts(LocalcatchContext.class);
		}
		public LocalcatchContext localcatch(int i) {
			return getRuleContext(LocalcatchContext.class,i);
		}
		public LocalthrowContext localthrow() {
			return getRuleContext(LocalthrowContext.class,0);
		}
		public LocalinterruptibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localinterruptible; }
	}

	public final LocalinterruptibleContext localinterruptible() throws RecognitionException {
		LocalinterruptibleContext _localctx = new LocalinterruptibleContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_localinterruptible);
		int _la;
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(INTERRUPTIBLEKW);
				setState(805);
				scopename();
				setState(806);
				match(COLON);
				setState(807);
				localprotocolblock();
				setState(808);
				match(WITHKW);
				setState(809);
				match(CURLYLEFT);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCHESKW) {
					{
					{
					setState(810);
					localcatch();
					}
					}
					setState(815);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(816);
				match(CURLYRIGHT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(INTERRUPTIBLEKW);
				setState(819);
				scopename();
				setState(820);
				match(COLON);
				setState(821);
				localprotocolblock();
				setState(822);
				match(WITHKW);
				setState(823);
				match(CURLYLEFT);
				setState(824);
				localthrow();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCHESKW) {
					{
					{
					setState(825);
					localcatch();
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(831);
				match(CURLYRIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalthrowContext extends ParserRuleContext {
		public TerminalNode THROWSKW() { return getToken(ScribbleParser.THROWSKW, 0); }
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public TerminalNode TOKW() { return getToken(ScribbleParser.TOKW, 0); }
		public List<RolenameContext> rolename() {
			return getRuleContexts(RolenameContext.class);
		}
		public RolenameContext rolename(int i) {
			return getRuleContext(RolenameContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public LocalthrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localthrow; }
	}

	public final LocalthrowContext localthrow() throws RecognitionException {
		LocalthrowContext _localctx = new LocalthrowContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_localthrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(THROWSKW);
			setState(836);
			message();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(837);
				match(COMMA);
				setState(838);
				message();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(TOKW);
			setState(845);
			rolename();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(846);
				match(COMMA);
				setState(847);
				rolename();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(853);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalcatchContext extends ParserRuleContext {
		public TerminalNode CATCHESKW() { return getToken(ScribbleParser.CATCHESKW, 0); }
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public LocalcatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localcatch; }
	}

	public final LocalcatchContext localcatch() throws RecognitionException {
		LocalcatchContext _localctx = new LocalcatchContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_localcatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(CATCHESKW);
			setState(856);
			message();
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(857);
				match(COMMA);
				setState(858);
				message();
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(864);
			match(FROMKW);
			setState(865);
			rolename();
			setState(866);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocaldoContext extends ParserRuleContext {
		public TerminalNode DOKW() { return getToken(ScribbleParser.DOKW, 0); }
		public MembernameContext membername() {
			return getRuleContext(MembernameContext.class,0);
		}
		public RoleinstantiationlistContext roleinstantiationlist() {
			return getRuleContext(RoleinstantiationlistContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ScopenameContext scopename() {
			return getRuleContext(ScopenameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public LocaldoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localdo; }
	}

	public final LocaldoContext localdo() throws RecognitionException {
		LocaldoContext _localctx = new LocaldoContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_localdo);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(DOKW);
				setState(869);
				membername();
				setState(870);
				roleinstantiationlist();
				setState(871);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(DOKW);
				setState(874);
				membername();
				setState(875);
				argumentlist();
				setState(876);
				roleinstantiationlist();
				setState(877);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				match(DOKW);
				setState(880);
				scopename();
				setState(881);
				match(COLON);
				setState(882);
				membername();
				setState(883);
				roleinstantiationlist();
				setState(884);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(886);
				match(DOKW);
				setState(887);
				scopename();
				setState(888);
				match(COLON);
				setState(889);
				membername();
				setState(890);
				argumentlist();
				setState(891);
				roleinstantiationlist();
				setState(892);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeconstraintContext extends ParserRuleContext {
		public ConstraintspecContext constraintspec() {
			return getRuleContext(ConstraintspecContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ScribbleParser.COMMA, 0); }
		public ResetpredicateContext resetpredicate() {
			return getRuleContext(ResetpredicateContext.class,0);
		}
		public TimeconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeconstraint; }
	}

	public final TimeconstraintContext timeconstraint() throws RecognitionException {
		TimeconstraintContext _localctx = new TimeconstraintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_timeconstraint);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				constraintspec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				constraintspec();
				setState(898);
				match(COMMA);
				setState(899);
				resetpredicate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintspecContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ScribbleParser.AT, 0); }
		public RolenameContext rolename() {
			return getRuleContext(RolenameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ScribbleParser.COLON, 0); }
		public ClockconstraintContext clockconstraint() {
			return getRuleContext(ClockconstraintContext.class,0);
		}
		public ConstraintspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintspec; }
	}

	public final ConstraintspecContext constraintspec() throws RecognitionException {
		ConstraintspecContext _localctx = new ConstraintspecContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constraintspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(AT);
			setState(904);
			rolename();
			setState(905);
			match(COLON);
			setState(906);
			clockconstraint(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClockconstraintContext extends ParserRuleContext {
		public ClockconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockconstraint; }
	 
		public ClockconstraintContext() { }
		public void copyFrom(ClockconstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ClockconstraintContext {
		public ClockconstraintContext clockconstraint() {
			return getRuleContext(ClockconstraintContext.class,0);
		}
		public NotContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends ClockconstraintContext {
		public List<ClockconstraintContext> clockconstraint() {
			return getRuleContexts(ClockconstraintContext.class);
		}
		public ClockconstraintContext clockconstraint(int i) {
			return getRuleContext(ClockconstraintContext.class,i);
		}
		public OrContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class BoolContext extends ClockconstraintContext {
		public TerminalNode BOOL() { return getToken(ScribbleParser.BOOL, 0); }
		public BoolContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class OrderingContext extends ClockconstraintContext {
		public TerminalNode ROUNDLEFT() { return getToken(ScribbleParser.ROUNDLEFT, 0); }
		public ClockconstraintContext clockconstraint() {
			return getRuleContext(ClockconstraintContext.class,0);
		}
		public TerminalNode ROUNDRIGHT() { return getToken(ScribbleParser.ROUNDRIGHT, 0); }
		public OrderingContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class LteqContext extends ClockconstraintContext {
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public ClockconstContext clockconst() {
			return getRuleContext(ClockconstContext.class,0);
		}
		public LteqContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ClockconstraintContext {
		public List<ClockconstraintContext> clockconstraint() {
			return getRuleContexts(ClockconstraintContext.class);
		}
		public ClockconstraintContext clockconstraint(int i) {
			return getRuleContext(ClockconstraintContext.class,i);
		}
		public AndContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class LtContext extends ClockconstraintContext {
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public TerminalNode ANGLELEFT() { return getToken(ScribbleParser.ANGLELEFT, 0); }
		public ClockconstContext clockconst() {
			return getRuleContext(ClockconstContext.class,0);
		}
		public LtContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class GteqContext extends ClockconstraintContext {
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public ClockconstContext clockconst() {
			return getRuleContext(ClockconstContext.class,0);
		}
		public GteqContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class EqContext extends ClockconstraintContext {
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public ClockconstContext clockconst() {
			return getRuleContext(ClockconstContext.class,0);
		}
		public EqContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}
	public static class GtContext extends ClockconstraintContext {
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public TerminalNode ANGLERIGHT() { return getToken(ScribbleParser.ANGLERIGHT, 0); }
		public ClockconstContext clockconst() {
			return getRuleContext(ClockconstContext.class,0);
		}
		public GtContext(ClockconstraintContext ctx) { copyFrom(ctx); }
	}

	public final ClockconstraintContext clockconstraint() throws RecognitionException {
		return clockconstraint(0);
	}

	private ClockconstraintContext clockconstraint(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClockconstraintContext _localctx = new ClockconstraintContext(_ctx, _parentState);
		ClockconstraintContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_clockconstraint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				_localctx = new OrderingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(909);
				match(ROUNDLEFT);
				setState(910);
				clockconstraint(0);
				setState(911);
				match(ROUNDRIGHT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(913);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(914);
				clockid();
				setState(915);
				match(ANGLERIGHT);
				setState(916);
				clockconst();
				}
				break;
			case 4:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(918);
				clockid();
				setState(919);
				match(ANGLELEFT);
				setState(920);
				clockconst();
				}
				break;
			case 5:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(922);
				clockid();
				setState(923);
				match(T__3);
				setState(924);
				clockconst();
				}
				break;
			case 6:
				{
				_localctx = new LteqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(926);
				clockid();
				setState(927);
				match(T__4);
				setState(928);
				clockconst();
				}
				break;
			case 7:
				{
				_localctx = new GteqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(930);
				clockid();
				setState(931);
				match(T__5);
				setState(932);
				clockconst();
				}
				break;
			case 8:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(934);
				match(T__6);
				setState(935);
				clockconstraint(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(944);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ClockconstraintContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_clockconstraint);
						setState(938);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(939);
						match(T__7);
						setState(940);
						clockconstraint(3);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ClockconstraintContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_clockconstraint);
						setState(941);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(942);
						match(T__8);
						setState(943);
						clockconstraint(2);
						}
						break;
					}
					} 
				}
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ResetpredicateContext extends ParserRuleContext {
		public TerminalNode ROUNDLEFT() { return getToken(ScribbleParser.ROUNDLEFT, 0); }
		public ResetpredlistContext resetpredlist() {
			return getRuleContext(ResetpredlistContext.class,0);
		}
		public TerminalNode ROUNDRIGHT() { return getToken(ScribbleParser.ROUNDRIGHT, 0); }
		public ResetpredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetpredicate; }
	}

	public final ResetpredicateContext resetpredicate() throws RecognitionException {
		ResetpredicateContext _localctx = new ResetpredicateContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_resetpredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(T__9);
			setState(950);
			match(ROUNDLEFT);
			setState(951);
			resetpredlist();
			setState(952);
			match(ROUNDRIGHT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResetpredlistContext extends ParserRuleContext {
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ScribbleParser.COMMA, 0); }
		public ResetpredlistContext resetpredlist() {
			return getRuleContext(ResetpredlistContext.class,0);
		}
		public ResetpredlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetpredlist; }
	}

	public final ResetpredlistContext resetpredlist() throws RecognitionException {
		ResetpredlistContext _localctx = new ResetpredlistContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_resetpredlist);
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				clockid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				clockid();
				setState(956);
				match(COMMA);
				setState(957);
				resetpredlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 79:
			return clockconstraint_sempred((ClockconstraintContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean clockconstraint_sempred(ClockconstraintContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u03c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u00c2\n\16\f\16\16\16\u00c5"+
		"\13\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\5\17\u00ce\n\17\3\20\3"+
		"\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00da\n\22\f\22"+
		"\16\22\u00dd\13\22\3\22\7\22\u00e0\n\22\f\22\16\22\u00e3\13\22\3\22\7"+
		"\22\u00e6\n\22\f\22\16\22\u00e9\13\22\3\23\3\23\5\23\u00ed\n\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\5\25\u00f5\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0101\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0111\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0134\n\32\3\32\3\32\3\32\5\32\u0139\n\32\3\33\3\33\3\33\7"+
		"\33\u013e\n\33\f\33\16\33\u0141\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u014d\n\34\3\35\3\35\5\35\u0151\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0160\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u016d\n \3!\3!\3!\3!\7!\u0173\n!"+
		"\f!\16!\u0176\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0183"+
		"\n\"\3#\3#\3#\3#\7#\u0189\n#\f#\16#\u018c\13#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\5$\u019e\n$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\5&\u01ad\n&\3\'\3\'\3\'\3\'\7\'\u01b3\n\'\f\'\16\'\u01b6\13\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\5(\u01bf\n(\3)\3)\3)\3)\7)\u01c5\n)\f)\16)\u01c8"+
		"\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01db\n*\3"+
		"+\3+\3+\3+\3,\7,\u01e2\n,\f,\16,\u01e5\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u01f1\n-\3.\3.\3.\3.\3.\3.\3.\7.\u01fa\n.\f.\16.\u01fd\13.\3.\3"+
		".\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\5\63\u0217\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\7\63\u021f\n\63\f\63\16\63\u0222\13\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0230\n\66\f\66\16"+
		"\66\u0233\13\66\3\67\3\67\3\67\3\67\3\67\7\67\u023a\n\67\f\67\16\67\u023d"+
		"\13\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0248\n\67\f"+
		"\67\16\67\u024b\13\67\3\67\3\67\5\67\u024f\n\67\38\38\38\78\u0254\n8\f"+
		"8\168\u0257\138\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\59\u0277\n9\3:\3:\3:\3:\3:\3:\5:"+
		"\u027f\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\5;\u029b\n;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\5=\u02aa\n=\3>\3>\7>\u02ae\n>\f>\16>\u02b1\13>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\5?\u02c2\n?\3@\3@\3@\3@\3@\3@\3@\3@\7@\u02cc\n"+
		"@\f@\16@\u02cf\13@\3@\3@\3@\3@\3@\3@\3@\7@\u02d8\n@\f@\16@\u02db\13@\3"+
		"@\3@\5@\u02df\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u02ee\nA\3"+
		"B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3"+
		"F\3G\5G\u0309\nG\3G\3G\3G\3G\3G\3G\7G\u0311\nG\fG\16G\u0314\13G\3H\3H"+
		"\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\7J\u0322\nJ\fJ\16J\u0325\13J\3K\3K\3K\3"+
		"K\3K\3K\3K\7K\u032e\nK\fK\16K\u0331\13K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\7K\u033d\nK\fK\16K\u0340\13K\3K\3K\5K\u0344\nK\3L\3L\3L\3L\7L\u034a\n"+
		"L\fL\16L\u034d\13L\3L\3L\3L\3L\7L\u0353\nL\fL\16L\u0356\13L\3L\3L\3M\3"+
		"M\3M\3M\7M\u035e\nM\fM\16M\u0361\13M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u0381\nN"+
		"\3O\3O\3O\3O\3O\5O\u0388\nO\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u03ab\nQ"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u03b3\nQ\fQ\16Q\u03b6\13Q\3R\3R\3R\3R\3R\3S\3S\3"+
		"S\3S\3S\5S\u03c2\nS\3S\2\3\u00a0T\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\2\3\3\2\62\63\2\u03d9\2\u00a6\3\2\2\2\4"+
		"\u00a8\3\2\2\2\6\u00aa\3\2\2\2\b\u00ac\3\2\2\2\n\u00ae\3\2\2\2\f\u00b0"+
		"\3\2\2\2\16\u00b2\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3"+
		"\2\2\2\26\u00ba\3\2\2\2\30\u00bc\3\2\2\2\32\u00c9\3\2\2\2\34\u00cd\3\2"+
		"\2\2\36\u00d1\3\2\2\2 \u00d3\3\2\2\2\"\u00d7\3\2\2\2$\u00ec\3\2\2\2&\u00ee"+
		"\3\2\2\2(\u00f4\3\2\2\2*\u0100\3\2\2\2,\u0110\3\2\2\2.\u0112\3\2\2\2\60"+
		"\u011d\3\2\2\2\62\u0138\3\2\2\2\64\u013a\3\2\2\2\66\u014c\3\2\2\28\u0150"+
		"\3\2\2\2:\u0152\3\2\2\2<\u015f\3\2\2\2>\u016c\3\2\2\2@\u016e\3\2\2\2B"+
		"\u0182\3\2\2\2D\u0184\3\2\2\2F\u019d\3\2\2\2H\u019f\3\2\2\2J\u01ac\3\2"+
		"\2\2L\u01ae\3\2\2\2N\u01be\3\2\2\2P\u01c0\3\2\2\2R\u01da\3\2\2\2T\u01dc"+
		"\3\2\2\2V\u01e3\3\2\2\2X\u01f0\3\2\2\2Z\u01f2\3\2\2\2\\\u0200\3\2\2\2"+
		"^\u0202\3\2\2\2`\u0209\3\2\2\2b\u020f\3\2\2\2d\u0216\3\2\2\2f\u0223\3"+
		"\2\2\2h\u0227\3\2\2\2j\u022b\3\2\2\2l\u024e\3\2\2\2n\u0250\3\2\2\2p\u0276"+
		"\3\2\2\2r\u027e\3\2\2\2t\u029a\3\2\2\2v\u029c\3\2\2\2x\u02a9\3\2\2\2z"+
		"\u02ab\3\2\2\2|\u02c1\3\2\2\2~\u02de\3\2\2\2\u0080\u02ed\3\2\2\2\u0082"+
		"\u02ef\3\2\2\2\u0084\u02f4\3\2\2\2\u0086\u02f9\3\2\2\2\u0088\u02fe\3\2"+
		"\2\2\u008a\u0303\3\2\2\2\u008c\u0308\3\2\2\2\u008e\u0315\3\2\2\2\u0090"+
		"\u0319\3\2\2\2\u0092\u031d\3\2\2\2\u0094\u0343\3\2\2\2\u0096\u0345\3\2"+
		"\2\2\u0098\u0359\3\2\2\2\u009a\u0380\3\2\2\2\u009c\u0387\3\2\2\2\u009e"+
		"\u0389\3\2\2\2\u00a0\u03aa\3\2\2\2\u00a2\u03b7\3\2\2\2\u00a4\u03c1\3\2"+
		"\2\2\u00a6\u00a7\t\2\2\2\u00a7\3\3\2\2\2\u00a8\u00a9\7\65\2\2\u00a9\5"+
		"\3\2\2\2\u00aa\u00ab\7\65\2\2\u00ab\7\3\2\2\2\u00ac\u00ad\7\65\2\2\u00ad"+
		"\t\3\2\2\2\u00ae\u00af\7\65\2\2\u00af\13\3\2\2\2\u00b0\u00b1\7\65\2\2"+
		"\u00b1\r\3\2\2\2\u00b2\u00b3\7\65\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\65"+
		"\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\7\65\2\2\u00b7\23\3\2\2\2\u00b8\u00b9"+
		"\7\65\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\7\65\2\2\u00bb\27\3\2\2\2\u00bc"+
		"\u00bd\7\65\2\2\u00bd\31\3\2\2\2\u00be\u00c3\7\65\2\2\u00bf\u00c0\7\3"+
		"\2\2\u00c0\u00c2\7\65\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00ca\7\65\2\2\u00c8\u00ca\7\65\2\2\u00c9"+
		"\u00be\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00ce\5\36\20"+
		"\2\u00cc\u00ce\5 \21\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\35"+
		"\3\2\2\2\u00cf\u00d2\5\b\5\2\u00d0\u00d2\5\n\6\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\5\32\16\2\u00d4\u00d5\7\3"+
		"\2\2\u00d5\u00d6\5\36\20\2\u00d6!\3\2\2\2\u00d7\u00db\5&\24\2\u00d8\u00da"+
		"\5(\25\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00e1\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5$"+
		"\23\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e7\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\58"+
		"\35\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\5.\30\2"+
		"\u00eb\u00ed\5\60\31\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed%"+
		"\3\2\2\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\78\2\2"+
		"\u00f1\'\3\2\2\2\u00f2\u00f5\5*\26\2\u00f3\u00f5\5,\27\2\u00f4\u00f2\3"+
		"\2\2\2\u00f4\u00f3\3\2\2\2\u00f5)\3\2\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00f8"+
		"\5\32\16\2\u00f8\u00f9\78\2\2\u00f9\u0101\3\2\2\2\u00fa\u00fb\7\16\2\2"+
		"\u00fb\u00fc\5\32\16\2\u00fc\u00fd\7\31\2\2\u00fd\u00fe\7\65\2\2\u00fe"+
		"\u00ff\78\2\2\u00ff\u0101\3\2\2\2\u0100\u00f6\3\2\2\2\u0100\u00fa\3\2"+
		"\2\2\u0101+\3\2\2\2\u0102\u0103\7\32\2\2\u0103\u0104\5\32\16\2\u0104\u0105"+
		"\7\16\2\2\u0105\u0106\5\36\20\2\u0106\u0107\78\2\2\u0107\u0111\3\2\2\2"+
		"\u0108\u0109\7\32\2\2\u0109\u010a\5\32\16\2\u010a\u010b\7\16\2\2\u010b"+
		"\u010c\5\36\20\2\u010c\u010d\7\31\2\2\u010d\u010e\7\65\2\2\u010e\u010f"+
		"\78\2\2\u010f\u0111\3\2\2\2\u0110\u0102\3\2\2\2\u0110\u0108\3\2\2\2\u0111"+
		"-\3\2\2\2\u0112\u0113\7\17\2\2\u0113\u0114\7=\2\2\u0114\u0115\7\65\2\2"+
		"\u0115\u0116\7>\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7\32\2\2\u0118\u0119"+
		"\7\61\2\2\u0119\u011a\7\31\2\2\u011a\u011b\5\b\5\2\u011b\u011c\78\2\2"+
		"\u011c/\3\2\2\2\u011d\u011e\7\27\2\2\u011e\u011f\7=\2\2\u011f\u0120\7"+
		"\65\2\2\u0120\u0121\7>\2\2\u0121\u0122\7\61\2\2\u0122\u0123\7\32\2\2\u0123"+
		"\u0124\7\61\2\2\u0124\u0125\7\31\2\2\u0125\u0126\5\26\f\2\u0126\u0127"+
		"\78\2\2\u0127\61\3\2\2\2\u0128\u0129\7;\2\2\u0129\u0139\7<\2\2\u012a\u012b"+
		"\7;\2\2\u012b\u012c\5\64\33\2\u012c\u012d\7<\2\2\u012d\u0139\3\2\2\2\u012e"+
		"\u0133\7\65\2\2\u012f\u0130\7;\2\2\u0130\u0131\5\64\33\2\u0131\u0132\7"+
		"<\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0139\3\2\2\2\u0135\u0136\7\65\2\2\u0136\u0137\7;\2\2\u0137\u0139\7<"+
		"\2\2\u0138\u0128\3\2\2\2\u0138\u012a\3\2\2\2\u0138\u012e\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0139\63\3\2\2\2\u013a\u013f\5\66\34\2\u013b\u013c\7\66"+
		"\2\2\u013c\u013e\5\66\34\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\65\3\2\2\2\u0141\u013f\3\2\2"+
		"\2\u0142\u014d\5\b\5\2\u0143\u014d\5\f\7\2\u0144\u0145\5\16\b\2\u0145"+
		"\u0146\7\67\2\2\u0146\u0147\5\b\5\2\u0147\u014d\3\2\2\2\u0148\u0149\5"+
		"\16\b\2\u0149\u014a\7\67\2\2\u014a\u014b\5\f\7\2\u014b\u014d\3\2\2\2\u014c"+
		"\u0142\3\2\2\2\u014c\u0143\3\2\2\2\u014c\u0144\3\2\2\2\u014c\u0148\3\2"+
		"\2\2\u014d\67\3\2\2\2\u014e\u0151\5<\37\2\u014f\u0151\5r:\2\u0150\u014e"+
		"\3\2\2\2\u0150\u014f\3\2\2\2\u01519\3\2\2\2\u0152\u0153\7\60\2\2\u0153"+
		"\u0154\7?\2\2\u0154\u0155\7)\2\2\u0155\u0156\7;\2\2\u0156\u0157\5\30\r"+
		"\2\u0157\u0158\7<\2\2\u0158;\3\2\2\2\u0159\u015a\5> \2\u015a\u015b\5H"+
		"%\2\u015b\u0160\3\2\2\2\u015c\u015d\5> \2\u015d\u015e\5J&\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015c\3\2\2\2\u0160=\3\2\2\2\u0161"+
		"\u0162\7\21\2\2\u0162\u0163\7\20\2\2\u0163\u0164\5\n\6\2\u0164\u0165\5"+
		"@!\2\u0165\u016d\3\2\2\2\u0166\u0167\7\21\2\2\u0167\u0168\7\20\2\2\u0168"+
		"\u0169\5\n\6\2\u0169\u016a\5D#\2\u016a\u016b\5@!\2\u016b\u016d\3\2\2\2"+
		"\u016c\u0161\3\2\2\2\u016c\u0166\3\2\2\2\u016d?\3\2\2\2\u016e\u016f\7"+
		";\2\2\u016f\u0174\5B\"\2\u0170\u0171\7\66\2\2\u0171\u0173\5B\"\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7<\2\2\u0178"+
		"A\3\2\2\2\u0179\u017a\7\25\2\2\u017a\u0183\5\6\4\2\u017b\u017c\7\25\2"+
		"\2\u017c\u017d\5\6\4\2\u017d\u017e\7\31\2\2\u017e\u017f\5\6\4\2\u017f"+
		"\u0183\3\2\2\2\u0180\u0181\7\26\2\2\u0181\u0183\5\6\4\2\u0182\u0179\3"+
		"\2\2\2\u0182\u017b\3\2\2\2\u0182\u0180\3\2\2\2\u0183C\3\2\2\2\u0184\u0185"+
		"\7=\2\2\u0185\u018a\5F$\2\u0186\u0187\7\66\2\2\u0187\u0189\5F$\2\u0188"+
		"\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7>\2\2\u018e"+
		"E\3\2\2\2\u018f\u0190\7\17\2\2\u0190\u019e\5\f\7\2\u0191\u0192\7\17\2"+
		"\2\u0192\u0193\5\f\7\2\u0193\u0194\7\31\2\2\u0194\u0195\5\f\7\2\u0195"+
		"\u019e\3\2\2\2\u0196\u0197\7\27\2\2\u0197\u019e\5\f\7\2\u0198\u0199\7"+
		"\27\2\2\u0199\u019a\5\f\7\2\u019a\u019b\7\31\2\2\u019b\u019c\5\f\7\2\u019c"+
		"\u019e\3\2\2\2\u019d\u018f\3\2\2\2\u019d\u0191\3\2\2\2\u019d\u0196\3\2"+
		"\2\2\u019d\u0198\3\2\2\2\u019eG\3\2\2\2\u019f\u01a0\5T+\2\u01a0I\3\2\2"+
		"\2\u01a1\u01a2\7\30\2\2\u01a2\u01a3\5\34\17\2\u01a3\u01a4\5L\'\2\u01a4"+
		"\u01a5\78\2\2\u01a5\u01ad\3\2\2\2\u01a6\u01a7\7\30\2\2\u01a7\u01a8\5\34"+
		"\17\2\u01a8\u01a9\5P)\2\u01a9\u01aa\5L\'\2\u01aa\u01ab\78\2\2\u01ab\u01ad"+
		"\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01a6\3\2\2\2\u01adK\3\2\2\2\u01ae"+
		"\u01af\7;\2\2\u01af\u01b4\5N(\2\u01b0\u01b1\7\66\2\2\u01b1\u01b3\5N(\2"+
		"\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b8\7<\2\2\u01b8"+
		"M\3\2\2\2\u01b9\u01bf\5\6\4\2\u01ba\u01bb\5\6\4\2\u01bb\u01bc\7\31\2\2"+
		"\u01bc\u01bd\5\6\4\2\u01bd\u01bf\3\2\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba"+
		"\3\2\2\2\u01bfO\3\2\2\2\u01c0\u01c1\7=\2\2\u01c1\u01c6\5R*\2\u01c2\u01c3"+
		"\7\66\2\2\u01c3\u01c5\5R*\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01ca\7>\2\2\u01caQ\3\2\2\2\u01cb\u01db\5\62\32\2\u01cc\u01cd"+
		"\5\62\32\2\u01cd\u01ce\7\31\2\2\u01ce\u01cf\5\f\7\2\u01cf\u01db\3\2\2"+
		"\2\u01d0\u01db\5\b\5\2\u01d1\u01d2\5\b\5\2\u01d2\u01d3\7\31\2\2\u01d3"+
		"\u01d4\5\f\7\2\u01d4\u01db\3\2\2\2\u01d5\u01db\5\f\7\2\u01d6\u01d7\5\f"+
		"\7\2\u01d7\u01d8\7\31\2\2\u01d8\u01d9\5\f\7\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01cb\3\2\2\2\u01da\u01cc\3\2\2\2\u01da\u01d0\3\2\2\2\u01da\u01d1\3\2"+
		"\2\2\u01da\u01d5\3\2\2\2\u01da\u01d6\3\2\2\2\u01dbS\3\2\2\2\u01dc\u01dd"+
		"\79\2\2\u01dd\u01de\5V,\2\u01de\u01df\7:\2\2\u01dfU\3\2\2\2\u01e0\u01e2"+
		"\5X-\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4W\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01f1\5Z.\2\u01e7"+
		"\u01f1\5d\63\2\u01e8\u01f1\5f\64\2\u01e9\u01f1\5h\65\2\u01ea\u01f1\5j"+
		"\66\2\u01eb\u01f1\5l\67\2\u01ec\u01f1\5p9\2\u01ed\u01f1\5^\60\2\u01ee"+
		"\u01f1\5`\61\2\u01ef\u01f1\5b\62\2\u01f0\u01e6\3\2\2\2\u01f0\u01e7\3\2"+
		"\2\2\u01f0\u01e8\3\2\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01ea\3\2\2\2\u01f0"+
		"\u01eb\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01ef\3\2\2\2\u01f1Y\3\2\2\2\u01f2\u01f3\5\\/\2\u01f3\u01f4"+
		"\7\32\2\2\u01f4\u01f5\5\6\4\2\u01f5\u01f6\7\33\2\2\u01f6\u01fb\5\6\4\2"+
		"\u01f7\u01f8\7\66\2\2\u01f8\u01fa\5\6\4\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\78\2\2\u01ff[\3\2\2\2\u0200\u0201\5\62\32\2"+
		"\u0201]\3\2\2\2\u0202\u0203\5\\/\2\u0203\u0204\7*\2\2\u0204\u0205\5\6"+
		"\4\2\u0205\u0206\7\33\2\2\u0206\u0207\5\6\4\2\u0207\u0208\78\2\2\u0208"+
		"_\3\2\2\2\u0209\u020a\7+\2\2\u020a\u020b\5\6\4\2\u020b\u020c\7\"\2\2\u020c"+
		"\u020d\5\6\4\2\u020d\u020e\78\2\2\u020ea\3\2\2\2\u020f\u0210\7-\2\2\u0210"+
		"\u0211\5\6\4\2\u0211\u0212\7\33\2\2\u0212\u0213\5\6\4\2\u0213\u0214\7"+
		"8\2\2\u0214c\3\2\2\2\u0215\u0217\5:\36\2\u0216\u0215\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\7\34\2\2\u0219\u021a\7\35\2\2"+
		"\u021a\u021b\5\6\4\2\u021b\u0220\5T+\2\u021c\u021d\7\36\2\2\u021d\u021f"+
		"\5T+\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221e\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\37\2\2"+
		"\u0224\u0225\5\20\t\2\u0225\u0226\5T+\2\u0226g\3\2\2\2\u0227\u0228\7 "+
		"\2\2\u0228\u0229\5\20\t\2\u0229\u022a\78\2\2\u022ai\3\2\2\2\u022b\u022c"+
		"\7!\2\2\u022c\u0231\5T+\2\u022d\u022e\7\"\2\2\u022e\u0230\5T+\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232k\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0235\7#\2\2\u0235\u0236"+
		"\5T+\2\u0236\u0237\7$\2\2\u0237\u023b\79\2\2\u0238\u023a\5n8\2\u0239\u0238"+
		"\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7:\2\2\u023f\u024f\3\2"+
		"\2\2\u0240\u0241\7#\2\2\u0241\u0242\5\24\13\2\u0242\u0243\7\67\2\2\u0243"+
		"\u0244\5T+\2\u0244\u0245\7$\2\2\u0245\u0249\79\2\2\u0246\u0248\5n8\2\u0247"+
		"\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\7:\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u0234\3\2\2\2\u024e\u0240\3\2\2\2\u024fm\3\2\2\2"+
		"\u0250\u0255\5\\/\2\u0251\u0252\7\66\2\2\u0252\u0254\5\\/\2\u0253\u0251"+
		"\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7%\2\2\u0259\u025a\5\6"+
		"\4\2\u025a\u025b\78\2\2\u025bo\3\2\2\2\u025c\u025d\7(\2\2\u025d\u025e"+
		"\5\34\17\2\u025e\u025f\5L\'\2\u025f\u0260\78\2\2\u0260\u0277\3\2\2\2\u0261"+
		"\u0262\7(\2\2\u0262\u0263\5\34\17\2\u0263\u0264\5P)\2\u0264\u0265\5L\'"+
		"\2\u0265\u0266\78\2\2\u0266\u0277\3\2\2\2\u0267\u0268\7(\2\2\u0268\u0269"+
		"\5\24\13\2\u0269\u026a\7\67\2\2\u026a\u026b\5\34\17\2\u026b\u026c\5L\'"+
		"\2\u026c\u026d\78\2\2\u026d\u0277\3\2\2\2\u026e\u026f\7(\2\2\u026f\u0270"+
		"\5\24\13\2\u0270\u0271\7\67\2\2\u0271\u0272\5\34\17\2\u0272\u0273\5P)"+
		"\2\u0273\u0274\5L\'\2\u0274\u0275\78\2\2\u0275\u0277\3\2\2\2\u0276\u025c"+
		"\3\2\2\2\u0276\u0261\3\2\2\2\u0276\u0267\3\2\2\2\u0276\u026e\3\2\2\2\u0277"+
		"q\3\2\2\2\u0278\u0279\5t;\2\u0279\u027a\5v<\2\u027a\u027f\3\2\2\2\u027b"+
		"\u027c\5t;\2\u027c\u027d\5x=\2\u027d\u027f\3\2\2\2\u027e\u0278\3\2\2\2"+
		"\u027e\u027b\3\2\2\2\u027fs\3\2\2\2\u0280\u0281\7\24\2\2\u0281\u0282\7"+
		"\20\2\2\u0282\u0283\5\n\6\2\u0283\u0284\5@!\2\u0284\u029b\3\2\2\2\u0285"+
		"\u0286\7\24\2\2\u0286\u0287\7\20\2\2\u0287\u0288\5\n\6\2\u0288\u0289\7"+
		"\35\2\2\u0289\u028a\5\6\4\2\u028a\u028b\5@!\2\u028b\u029b\3\2\2\2\u028c"+
		"\u028d\7\24\2\2\u028d\u028e\7\20\2\2\u028e\u028f\5\n\6\2\u028f\u0290\5"+
		"D#\2\u0290\u0291\5@!\2\u0291\u029b\3\2\2\2\u0292\u0293\7\24\2\2\u0293"+
		"\u0294\7\20\2\2\u0294\u0295\5\n\6\2\u0295\u0296\7\35\2\2\u0296\u0297\5"+
		"\6\4\2\u0297\u0298\5D#\2\u0298\u0299\5@!\2\u0299\u029b\3\2\2\2\u029a\u0280"+
		"\3\2\2\2\u029a\u0285\3\2\2\2\u029a\u028c\3\2\2\2\u029a\u0292\3\2\2\2\u029b"+
		"u\3\2\2\2\u029c\u029d\5z>\2\u029dw\3\2\2\2\u029e\u029f\7\30\2\2\u029f"+
		"\u02a0\5\34\17\2\u02a0\u02a1\5L\'\2\u02a1\u02a2\78\2\2\u02a2\u02aa\3\2"+
		"\2\2\u02a3\u02a4\7\30\2\2\u02a4\u02a5\5\34\17\2\u02a5\u02a6\5P)\2\u02a6"+
		"\u02a7\5L\'\2\u02a7\u02a8\78\2\2\u02a8\u02aa\3\2\2\2\u02a9\u029e\3\2\2"+
		"\2\u02a9\u02a3\3\2\2\2\u02aay\3\2\2\2\u02ab\u02af\79\2\2\u02ac\u02ae\5"+
		"|?\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\7:"+
		"\2\2\u02b3{\3\2\2\2\u02b4\u02c2\5~@\2\u02b5\u02c2\5\u0080A\2\u02b6\u02c2"+
		"\5\u008cG\2\u02b7\u02c2\5\u0092J\2\u02b8\u02c2\5\u008eH\2\u02b9\u02c2"+
		"\5\u0090I\2\u02ba\u02c2\5\u0094K\2\u02bb\u02c2\5\u009aN\2\u02bc\u02c2"+
		"\5\u0082B\2\u02bd\u02c2\5\u0084C\2\u02be\u02c2\5\u0086D\2\u02bf\u02c2"+
		"\5\u0088E\2\u02c0\u02c2\5\u008aF\2\u02c1\u02b4\3\2\2\2\u02c1\u02b5\3\2"+
		"\2\2\u02c1\u02b6\3\2\2\2\u02c1\u02b7\3\2\2\2\u02c1\u02b8\3\2\2\2\u02c1"+
		"\u02b9\3\2\2\2\u02c1\u02ba\3\2\2\2\u02c1\u02bb\3\2\2\2\u02c1\u02bc\3\2"+
		"\2\2\u02c1\u02bd\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c0\3\2\2\2\u02c2}\3\2\2\2\u02c3\u02c4\7\4\2\2\u02c4\u02c5\5\u009c"+
		"O\2\u02c5\u02c6\7\5\2\2\u02c6\u02c7\5\62\32\2\u02c7\u02c8\7\33\2\2\u02c8"+
		"\u02cd\5\6\4\2\u02c9\u02ca\7\66\2\2\u02ca\u02cc\5\6\4\2\u02cb\u02c9\3"+
		"\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\78\2\2\u02d1\u02df\3\2"+
		"\2\2\u02d2\u02d3\5\62\32\2\u02d3\u02d4\7\33\2\2\u02d4\u02d9\5\6\4\2\u02d5"+
		"\u02d6\7\66\2\2\u02d6\u02d8\5\6\4\2\u02d7\u02d5\3\2\2\2\u02d8\u02db\3"+
		"\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02dc\u02dd\78\2\2\u02dd\u02df\3\2\2\2\u02de\u02c3\3\2"+
		"\2\2\u02de\u02d2\3\2\2\2\u02df\177\3\2\2\2\u02e0\u02e1\7\4\2\2\u02e1\u02e2"+
		"\5\u009cO\2\u02e2\u02e3\7\5\2\2\u02e3\u02e4\5\62\32\2\u02e4\u02e5\7\32"+
		"\2\2\u02e5\u02e6\7\65\2\2\u02e6\u02e7\78\2\2\u02e7\u02ee\3\2\2\2\u02e8"+
		"\u02e9\5\62\32\2\u02e9\u02ea\7\32\2\2\u02ea\u02eb\7\65\2\2\u02eb\u02ec"+
		"\78\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02e0\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ee"+
		"\u0081\3\2\2\2\u02ef\u02f0\7-\2\2\u02f0\u02f1\7\33\2\2\u02f1\u02f2\5\6"+
		"\4\2\u02f2\u02f3\78\2\2\u02f3\u0083\3\2\2\2\u02f4\u02f5\7-\2\2\u02f5\u02f6"+
		"\7\32\2\2\u02f6\u02f7\5\6\4\2\u02f7\u02f8\78\2\2\u02f8\u0085\3\2\2\2\u02f9"+
		"\u02fa\5\62\32\2\u02fa\u02fb\7*\2\2\u02fb\u02fc\5\6\4\2\u02fc\u02fd\7"+
		"8\2\2\u02fd\u0087\3\2\2\2\u02fe\u02ff\5\62\32\2\u02ff\u0300\7,\2\2\u0300"+
		"\u0301\5\6\4\2\u0301\u0302\78\2\2\u0302\u0089\3\2\2\2\u0303\u0304\7+\2"+
		"\2\u0304\u0305\5\6\4\2\u0305\u0306\78\2\2\u0306\u008b\3\2\2\2\u0307\u0309"+
		"\5:\36\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\7\34\2\2\u030b\u030c\7\35\2\2\u030c\u030d\5\6\4\2\u030d\u0312\5"+
		"z>\2\u030e\u030f\7\36\2\2\u030f\u0311\5z>\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u008d\3\2"+
		"\2\2\u0314\u0312\3\2\2\2\u0315\u0316\7\37\2\2\u0316\u0317\5\20\t\2\u0317"+
		"\u0318\5z>\2\u0318\u008f\3\2\2\2\u0319\u031a\7 \2\2\u031a\u031b\5\20\t"+
		"\2\u031b\u031c\78\2\2\u031c\u0091\3\2\2\2\u031d\u031e\7!\2\2\u031e\u0323"+
		"\5z>\2\u031f\u0320\7\"\2\2\u0320\u0322\5z>\2\u0321\u031f\3\2\2\2\u0322"+
		"\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0093\3\2"+
		"\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7#\2\2\u0327\u0328\5\24\13\2\u0328"+
		"\u0329\7\67\2\2\u0329\u032a\5z>\2\u032a\u032b\7$\2\2\u032b\u032f\79\2"+
		"\2\u032c\u032e\5\u0098M\2\u032d\u032c\3\2\2\2\u032e\u0331\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u032f\3\2"+
		"\2\2\u0332\u0333\7:\2\2\u0333\u0344\3\2\2\2\u0334\u0335\7#\2\2\u0335\u0336"+
		"\5\24\13\2\u0336\u0337\7\67\2\2\u0337\u0338\5z>\2\u0338\u0339\7$\2\2\u0339"+
		"\u033a\79\2\2\u033a\u033e\5\u0096L\2\u033b\u033d\5\u0098M\2\u033c\u033b"+
		"\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0341\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0342\7:\2\2\u0342\u0344\3\2"+
		"\2\2\u0343\u0326\3\2\2\2\u0343\u0334\3\2\2\2\u0344\u0095\3\2\2\2\u0345"+
		"\u0346\7&\2\2\u0346\u034b\5\\/\2\u0347\u0348\7\66\2\2\u0348\u034a\5\\"+
		"/\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7\33"+
		"\2\2\u034f\u0354\5\6\4\2\u0350\u0351\7\66\2\2\u0351\u0353\5\6\4\2\u0352"+
		"\u0350\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2"+
		"\2\2\u0355\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0358\78\2\2\u0358"+
		"\u0097\3\2\2\2\u0359\u035a\7\'\2\2\u035a\u035f\5\\/\2\u035b\u035c\7\66"+
		"\2\2\u035c\u035e\5\\/\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f"+
		"\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2"+
		"\2\2\u0362\u0363\7\32\2\2\u0363\u0364\5\6\4\2\u0364\u0365\78\2\2\u0365"+
		"\u0099\3\2\2\2\u0366\u0367\7(\2\2\u0367\u0368\5\34\17\2\u0368\u0369\5"+
		"L\'\2\u0369\u036a\78\2\2\u036a\u0381\3\2\2\2\u036b\u036c\7(\2\2\u036c"+
		"\u036d\5\34\17\2\u036d\u036e\5P)\2\u036e\u036f\5L\'\2\u036f\u0370\78\2"+
		"\2\u0370\u0381\3\2\2\2\u0371\u0372\7(\2\2\u0372\u0373\5\24\13\2\u0373"+
		"\u0374\7\67\2\2\u0374\u0375\5\34\17\2\u0375\u0376\5L\'\2\u0376\u0377\7"+
		"8\2\2\u0377\u0381\3\2\2\2\u0378\u0379\7(\2\2\u0379\u037a\5\24\13\2\u037a"+
		"\u037b\7\67\2\2\u037b\u037c\5\34\17\2\u037c\u037d\5P)\2\u037d\u037e\5"+
		"L\'\2\u037e\u037f\78\2\2\u037f\u0381\3\2\2\2\u0380\u0366\3\2\2\2\u0380"+
		"\u036b\3\2\2\2\u0380\u0371\3\2\2\2\u0380\u0378\3\2\2\2\u0381\u009b\3\2"+
		"\2\2\u0382\u0388\5\u009eP\2\u0383\u0384\5\u009eP\2\u0384\u0385\7\66\2"+
		"\2\u0385\u0386\5\u00a2R\2\u0386\u0388\3\2\2\2\u0387\u0382\3\2\2\2\u0387"+
		"\u0383\3\2\2\2\u0388\u009d\3\2\2\2\u0389\u038a\7?\2\2\u038a\u038b\5\6"+
		"\4\2\u038b\u038c\7\67\2\2\u038c\u038d\5\u00a0Q\2\u038d\u009f\3\2\2\2\u038e"+
		"\u038f\bQ\1\2\u038f\u0390\7;\2\2\u0390\u0391\5\u00a0Q\2\u0391\u0392\7"+
		"<\2\2\u0392\u03ab\3\2\2\2\u0393\u03ab\7\64\2\2\u0394\u0395\5\4\3\2\u0395"+
		"\u0396\7>\2\2\u0396\u0397\5\2\2\2\u0397\u03ab\3\2\2\2\u0398\u0399\5\4"+
		"\3\2\u0399\u039a\7=\2\2\u039a\u039b\5\2\2\2\u039b\u03ab\3\2\2\2\u039c"+
		"\u039d\5\4\3\2\u039d\u039e\7\6\2\2\u039e\u039f\5\2\2\2\u039f\u03ab\3\2"+
		"\2\2\u03a0\u03a1\5\4\3\2\u03a1\u03a2\7\7\2\2\u03a2\u03a3\5\2\2\2\u03a3"+
		"\u03ab\3\2\2\2\u03a4\u03a5\5\4\3\2\u03a5\u03a6\7\b\2\2\u03a6\u03a7\5\2"+
		"\2\2\u03a7\u03ab\3\2\2\2\u03a8\u03a9\7\t\2\2\u03a9\u03ab\5\u00a0Q\5\u03aa"+
		"\u038e\3\2\2\2\u03aa\u0393\3\2\2\2\u03aa\u0394\3\2\2\2\u03aa\u0398\3\2"+
		"\2\2\u03aa\u039c\3\2\2\2\u03aa\u03a0\3\2\2\2\u03aa\u03a4\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03ab\u03b4\3\2\2\2\u03ac\u03ad\f\4\2\2\u03ad\u03ae\7\n"+
		"\2\2\u03ae\u03b3\5\u00a0Q\5\u03af\u03b0\f\3\2\2\u03b0\u03b1\7\13\2\2\u03b1"+
		"\u03b3\5\u00a0Q\4\u03b2\u03ac\3\2\2\2\u03b2\u03af\3\2\2\2\u03b3\u03b6"+
		"\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u00a1\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b7\u03b8\7\f\2\2\u03b8\u03b9\7;\2\2\u03b9\u03ba\5\u00a4"+
		"S\2\u03ba\u03bb\7<\2\2\u03bb\u00a3\3\2\2\2\u03bc\u03c2\5\4\3\2\u03bd\u03be"+
		"\5\4\3\2\u03be\u03bf\7\66\2\2\u03bf\u03c0\5\u00a4S\2\u03c0\u03c2\3\2\2"+
		"\2\u03c1\u03bc\3\2\2\2\u03c1\u03bd\3\2\2\2\u03c2\u00a5\3\2\2\2@\u00c3"+
		"\u00c9\u00cd\u00d1\u00db\u00e1\u00e7\u00ec\u00f4\u0100\u0110\u0133\u0138"+
		"\u013f\u014c\u0150\u015f\u016c\u0174\u0182\u018a\u019d\u01ac\u01b4\u01be"+
		"\u01c6\u01da\u01e3\u01f0\u01fb\u0216\u0220\u0231\u023b\u0249\u024e\u0255"+
		"\u0276\u027e\u029a\u02a9\u02af\u02c1\u02cd\u02d9\u02de\u02ed\u0308\u0312"+
		"\u0323\u032f\u033e\u0343\u034b\u0354\u035f\u0380\u0387\u03aa\u03b2\u03b4"+
		"\u03c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}