// Generated from /home/luke/Level-5-Project/Mungo/mungo-tools/stmungo/src/main/antlr/Scribble.g4 by ANTLR 4.9.2

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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		IDENTIFIER=48, COMMA=49, COLON=50, SEMICOLON=51, CURLYLEFT=52, CURLYRIGHT=53, 
		ROUNDLEFT=54, ROUNDRIGHT=55, ANGLELEFT=56, ANGLERIGHT=57, AT=58, BOOL=59, 
		LETTER=60, DIGIT=61;
	public static final int
		RULE_rolename = 0, RULE_payloadtypename = 1, RULE_protocolname = 2, RULE_parametername = 3, 
		RULE_annotationname = 4, RULE_recursionlabelname = 5, RULE_recursionvarname = 6, 
		RULE_scopename = 7, RULE_simplemessagesignaturename = 8, RULE_choiceannotationname = 9, 
		RULE_modulename = 10, RULE_membername = 11, RULE_simplemembername = 12, 
		RULE_fullmembername = 13, RULE_module = 14, RULE_datatypedecl = 15, RULE_moduledecl = 16, 
		RULE_importdecl = 17, RULE_importmodule = 18, RULE_importmember = 19, 
		RULE_payloadtypedecl = 20, RULE_messagesignaturedecl = 21, RULE_messagesignature = 22, 
		RULE_payload = 23, RULE_payloadelement = 24, RULE_protocoldecl = 25, RULE_choiceannot = 26, 
		RULE_globalprotocoldecl = 27, RULE_globalprotocolheader = 28, RULE_roledecllist = 29, 
		RULE_roledecl = 30, RULE_parameterdecllist = 31, RULE_parameterdecl = 32, 
		RULE_globalprotocoldefinition = 33, RULE_globalprotocolinstance = 34, 
		RULE_roleinstantiationlist = 35, RULE_roleinstantiation = 36, RULE_argumentlist = 37, 
		RULE_argument = 38, RULE_globalprotocolblock = 39, RULE_globalinteractionsequence = 40, 
		RULE_globalinteraction = 41, RULE_globalmessagetransfer = 42, RULE_message = 43, 
		RULE_globalconnect = 44, RULE_globaldisconnect = 45, RULE_globalwrap = 46, 
		RULE_globalchoice = 47, RULE_globalrecursion = 48, RULE_globalcontinue = 49, 
		RULE_globalparallel = 50, RULE_globalinterruptible = 51, RULE_globalinterrupt = 52, 
		RULE_globaldo = 53, RULE_localprotocoldecl = 54, RULE_localprotocolheader = 55, 
		RULE_localprotocoldefinition = 56, RULE_localprotocolinstance = 57, RULE_localprotocolblock = 58, 
		RULE_localinteraction = 59, RULE_localsend = 60, RULE_localreceive = 61, 
		RULE_localsendwrap = 62, RULE_localreceivewrap = 63, RULE_localconnect = 64, 
		RULE_localaccept = 65, RULE_localdisconnect = 66, RULE_localchoice = 67, 
		RULE_localrecursion = 68, RULE_localcontinue = 69, RULE_localparallel = 70, 
		RULE_localinterruptible = 71, RULE_localthrow = 72, RULE_localcatch = 73, 
		RULE_localdo = 74, RULE_clockid = 75, RULE_intconst = 76, RULE_timeconstraint = 77, 
		RULE_constraintspec = 78, RULE_clockconstraint = 79, RULE_resetpredicate = 80, 
		RULE_resetpredlist = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"rolename", "payloadtypename", "protocolname", "parametername", "annotationname", 
			"recursionlabelname", "recursionvarname", "scopename", "simplemessagesignaturename", 
			"choiceannotationname", "modulename", "membername", "simplemembername", 
			"fullmembername", "module", "datatypedecl", "moduledecl", "importdecl", 
			"importmodule", "importmember", "payloadtypedecl", "messagesignaturedecl", 
			"messagesignature", "payload", "payloadelement", "protocoldecl", "choiceannot", 
			"globalprotocoldecl", "globalprotocolheader", "roledecllist", "roledecl", 
			"parameterdecllist", "parameterdecl", "globalprotocoldefinition", "globalprotocolinstance", 
			"roleinstantiationlist", "roleinstantiation", "argumentlist", "argument", 
			"globalprotocolblock", "globalinteractionsequence", "globalinteraction", 
			"globalmessagetransfer", "message", "globalconnect", "globaldisconnect", 
			"globalwrap", "globalchoice", "globalrecursion", "globalcontinue", "globalparallel", 
			"globalinterruptible", "globalinterrupt", "globaldo", "localprotocoldecl", 
			"localprotocolheader", "localprotocoldefinition", "localprotocolinstance", 
			"localprotocolblock", "localinteraction", "localsend", "localreceive", 
			"localsendwrap", "localreceivewrap", "localconnect", "localaccept", "localdisconnect", 
			"localchoice", "localrecursion", "localcontinue", "localparallel", "localinterruptible", 
			"localthrow", "localcatch", "localdo", "clockid", "intconst", "timeconstraint", 
			"constraintspec", "clockconstraint", "resetpredicate", "resetpredlist"
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
			null, null, null, null, null, "','", "':'", "';'", "'{'", "'}'", "'('", 
			"')'", "'<'", "'>'", "'@'"
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
			"COMMENT", "LINE_COMMENT", "EXTIDENTIFIER", "IDENTIFIER", "COMMA", "COLON", 
			"SEMICOLON", "CURLYLEFT", "CURLYRIGHT", "ROUNDLEFT", "ROUNDRIGHT", "ANGLELEFT", 
			"ANGLERIGHT", "AT", "BOOL", "LETTER", "DIGIT"
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

	public static class RolenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public RolenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRolename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRolename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRolename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolenameContext rolename() throws RecognitionException {
		RolenameContext _localctx = new RolenameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rolename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterPayloadtypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitPayloadtypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitPayloadtypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadtypenameContext payloadtypename() throws RecognitionException {
		PayloadtypenameContext _localctx = new PayloadtypenameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_payloadtypename);
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

	public static class ProtocolnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ProtocolnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterProtocolname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitProtocolname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitProtocolname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocolnameContext protocolname() throws RecognitionException {
		ProtocolnameContext _localctx = new ProtocolnameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_protocolname);
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

	public static class ParameternameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ParameternameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametername; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterParametername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitParametername(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitParametername(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameternameContext parametername() throws RecognitionException {
		ParameternameContext _localctx = new ParameternameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametername);
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

	public static class AnnotationnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public AnnotationnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterAnnotationname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitAnnotationname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitAnnotationname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationnameContext annotationname() throws RecognitionException {
		AnnotationnameContext _localctx = new AnnotationnameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_annotationname);
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

	public static class RecursionlabelnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public RecursionlabelnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursionlabelname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRecursionlabelname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRecursionlabelname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRecursionlabelname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursionlabelnameContext recursionlabelname() throws RecognitionException {
		RecursionlabelnameContext _localctx = new RecursionlabelnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_recursionlabelname);
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

	public static class RecursionvarnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public RecursionvarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursionvarname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRecursionvarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRecursionvarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRecursionvarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursionvarnameContext recursionvarname() throws RecognitionException {
		RecursionvarnameContext _localctx = new RecursionvarnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recursionvarname);
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

	public static class ScopenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ScopenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterScopename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitScopename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitScopename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopenameContext scopename() throws RecognitionException {
		ScopenameContext _localctx = new ScopenameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scopename);
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

	public static class SimplemessagesignaturenameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public SimplemessagesignaturenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplemessagesignaturename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterSimplemessagesignaturename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitSimplemessagesignaturename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitSimplemessagesignaturename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplemessagesignaturenameContext simplemessagesignaturename() throws RecognitionException {
		SimplemessagesignaturenameContext _localctx = new SimplemessagesignaturenameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simplemessagesignaturename);
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

	public static class ChoiceannotationnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public ChoiceannotationnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceannotationname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterChoiceannotationname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitChoiceannotationname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitChoiceannotationname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceannotationnameContext choiceannotationname() throws RecognitionException {
		ChoiceannotationnameContext _localctx = new ChoiceannotationnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choiceannotationname);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterStndModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitStndModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitStndModuleName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongModuleNameContext extends ModulenameContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ScribbleParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ScribbleParser.IDENTIFIER, i);
		}
		public LongModuleNameContext(ModulenameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLongModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLongModuleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLongModuleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModulenameContext modulename() throws RecognitionException {
		ModulenameContext _localctx = new ModulenameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modulename);
		try {
			int _alt;
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new LongModuleNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(IDENTIFIER);
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						match(T__0);
						setState(186);
						match(IDENTIFIER);
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(192);
				match(T__0);
				setState(193);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new StndModuleNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterSimpleMemName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitSimpleMemName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitSimpleMemName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullMemNameContext extends MembernameContext {
		public FullmembernameContext fullmembername() {
			return getRuleContext(FullmembernameContext.class,0);
		}
		public FullMemNameContext(MembernameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterFullMemName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitFullMemName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitFullMemName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembernameContext membername() throws RecognitionException {
		MembernameContext _localctx = new MembernameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_membername);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SimpleMemNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				simplemembername();
				}
				break;
			case 2:
				_localctx = new FullMemNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterProtName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitProtName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitProtName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StndPayloadTypeNameContext extends SimplemembernameContext {
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public StndPayloadTypeNameContext(SimplemembernameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterStndPayloadTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitStndPayloadTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitStndPayloadTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplemembernameContext simplemembername() throws RecognitionException {
		SimplemembernameContext _localctx = new SimplemembernameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplemembername);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StndPayloadTypeNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				payloadtypename();
				}
				break;
			case 2:
				_localctx = new ProtNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterFullmembername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitFullmembername(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitFullmembername(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullmembernameContext fullmembername() throws RecognitionException {
		FullmembernameContext _localctx = new FullmembernameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fullmembername);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			modulename();
			setState(206);
			match(T__0);
			setState(207);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			moduledecl();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORTKW || _la==FROMKW) {
				{
				{
				setState(210);
				importdecl();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEKW || _la==SIGKW) {
				{
				{
				setState(216);
				datatypedecl();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBALKW || _la==LOCALKW) {
				{
				{
				setState(222);
				protocoldecl();
				}
				}
				setState(227);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterDatatypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitDatatypedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitDatatypedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypedeclContext datatypedecl() throws RecognitionException {
		DatatypedeclContext _localctx = new DatatypedeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_datatypedecl);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				payloadtypedecl();
				}
				break;
			case SIGKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterModuledecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitModuledecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitModuledecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuledeclContext moduledecl() throws RecognitionException {
		ModuledeclContext _localctx = new ModuledeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_moduledecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(MODULEKW);
			setState(233);
			modulename();
			setState(234);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterImportdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitImportdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitImportdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportdeclContext importdecl() throws RecognitionException {
		ImportdeclContext _localctx = new ImportdeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_importdecl);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				importmodule();
				}
				break;
			case FROMKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterImportmodule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitImportmodule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitImportmodule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportmoduleContext importmodule() throws RecognitionException {
		ImportmoduleContext _localctx = new ImportmoduleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_importmodule);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(IMPORTKW);
				setState(241);
				modulename();
				setState(242);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(IMPORTKW);
				setState(245);
				modulename();
				setState(246);
				match(ASKW);
				setState(247);
				match(IDENTIFIER);
				setState(248);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterImportmember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitImportmember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitImportmember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportmemberContext importmember() throws RecognitionException {
		ImportmemberContext _localctx = new ImportmemberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_importmember);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(FROMKW);
				setState(253);
				modulename();
				setState(254);
				match(IMPORTKW);
				setState(255);
				simplemembername();
				setState(256);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(FROMKW);
				setState(259);
				modulename();
				setState(260);
				match(IMPORTKW);
				setState(261);
				simplemembername();
				setState(262);
				match(ASKW);
				setState(263);
				match(IDENTIFIER);
				setState(264);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterPayloadtypedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitPayloadtypedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitPayloadtypedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadtypedeclContext payloadtypedecl() throws RecognitionException {
		PayloadtypedeclContext _localctx = new PayloadtypedeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_payloadtypedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(TYPEKW);
			setState(269);
			match(ANGLELEFT);
			setState(270);
			match(IDENTIFIER);
			setState(271);
			match(ANGLERIGHT);
			setState(272);
			match(EXTIDENTIFIER);
			setState(273);
			match(FROMKW);
			setState(274);
			match(EXTIDENTIFIER);
			setState(275);
			match(ASKW);
			setState(276);
			payloadtypename();
			setState(277);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterMessagesignaturedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitMessagesignaturedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitMessagesignaturedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessagesignaturedeclContext messagesignaturedecl() throws RecognitionException {
		MessagesignaturedeclContext _localctx = new MessagesignaturedeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_messagesignaturedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(SIGKW);
			setState(280);
			match(ANGLELEFT);
			setState(281);
			match(IDENTIFIER);
			setState(282);
			match(ANGLERIGHT);
			setState(283);
			match(EXTIDENTIFIER);
			setState(284);
			match(FROMKW);
			setState(285);
			match(EXTIDENTIFIER);
			setState(286);
			match(ASKW);
			setState(287);
			simplemessagesignaturename();
			setState(288);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterIdPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitIdPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitIdPayload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessagesignatureContext messagesignature() throws RecognitionException {
		MessagesignatureContext _localctx = new MessagesignatureContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_messagesignature);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(ROUNDLEFT);
				setState(291);
				match(ROUNDRIGHT);
				}
				break;
			case 2:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(ROUNDLEFT);
				setState(293);
				payload();
				setState(294);
				match(ROUNDRIGHT);
				}
				break;
			case 3:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(IDENTIFIER);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROUNDLEFT) {
					{
					setState(297);
					match(ROUNDLEFT);
					setState(298);
					payload();
					setState(299);
					match(ROUNDRIGHT);
					}
				}

				}
				break;
			case 4:
				_localctx = new IdPayloadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(IDENTIFIER);
				setState(304);
				match(ROUNDLEFT);
				setState(305);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterPayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitPayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitPayload(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadContext payload() throws RecognitionException {
		PayloadContext _localctx = new PayloadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_payload);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			payloadelement();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(310);
				payloadelement();
				}
				}
				setState(315);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterAnnotParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitAnnotParamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitAnnotParamName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplePayloadContext extends PayloadelementContext {
		public PayloadtypenameContext payloadtypename() {
			return getRuleContext(PayloadtypenameContext.class,0);
		}
		public ParameternameContext parametername() {
			return getRuleContext(ParameternameContext.class,0);
		}
		public SimplePayloadContext(PayloadelementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterSimplePayload(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitSimplePayload(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitSimplePayload(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterAnnotPayloadTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitAnnotPayloadTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitAnnotPayloadTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadelementContext payloadelement() throws RecognitionException {
		PayloadelementContext _localctx = new PayloadelementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_payloadelement);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SimplePayloadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				payloadtypename();
				}
				break;
			case 2:
				_localctx = new SimplePayloadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				parametername();
				}
				break;
			case 3:
				_localctx = new AnnotPayloadTypeNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				annotationname();
				setState(319);
				match(COLON);
				setState(320);
				payloadtypename();
				}
				break;
			case 4:
				_localctx = new AnnotParamNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				annotationname();
				setState(323);
				match(COLON);
				setState(324);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLcProtocolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLcProtocolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLcProtocolDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlProtocolDeclContext extends ProtocoldeclContext {
		public GlobalprotocoldeclContext globalprotocoldecl() {
			return getRuleContext(GlobalprotocoldeclContext.class,0);
		}
		public GlProtocolDeclContext(ProtocoldeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlProtocolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlProtocolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlProtocolDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtocoldeclContext protocoldecl() throws RecognitionException {
		ProtocoldeclContext _localctx = new ProtocoldeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_protocoldecl);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBALKW:
				_localctx = new GlProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				globalprotocoldecl();
				}
				break;
			case LOCALKW:
				_localctx = new LcProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterChoiceannot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitChoiceannot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitChoiceannot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceannotContext choiceannot() throws RecognitionException {
		ChoiceannotContext _localctx = new ChoiceannotContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_choiceannot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LINE_COMMENT);
			setState(333);
			match(AT);
			setState(334);
			match(CHOICENAMEKW);
			setState(335);
			match(ROUNDLEFT);
			setState(336);
			choiceannotationname();
			setState(337);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalprotocoldecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalprotocoldecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalprotocoldecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalprotocoldeclContext globalprotocoldecl() throws RecognitionException {
		GlobalprotocoldeclContext _localctx = new GlobalprotocoldeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_globalprotocoldecl);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				globalprotocolheader();
				setState(340);
				globalprotocoldefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				globalprotocolheader();
				setState(343);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalprotocolheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalprotocolheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalprotocolheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalprotocolheaderContext globalprotocolheader() throws RecognitionException {
		GlobalprotocolheaderContext _localctx = new GlobalprotocolheaderContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_globalprotocolheader);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(GLOBALKW);
				setState(348);
				match(PROTOCOLKW);
				setState(349);
				protocolname();
				setState(350);
				roledecllist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(GLOBALKW);
				setState(353);
				match(PROTOCOLKW);
				setState(354);
				protocolname();
				setState(355);
				parameterdecllist();
				setState(356);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRoledecllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRoledecllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRoledecllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoledecllistContext roledecllist() throws RecognitionException {
		RoledecllistContext _localctx = new RoledecllistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_roledecllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ROUNDLEFT);
			setState(361);
			roledecl();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(362);
				match(COMMA);
				setState(363);
				roledecl();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRoledecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRoledecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRoledecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoledeclContext roledecl() throws RecognitionException {
		RoledeclContext _localctx = new RoledeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_roledecl);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(ROLEKW);
				setState(372);
				rolename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(ROLEKW);
				setState(374);
				rolename();
				setState(375);
				match(ASKW);
				setState(376);
				rolename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(SELFKW);
				setState(379);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterParameterdecllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitParameterdecllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitParameterdecllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdecllistContext parameterdecllist() throws RecognitionException {
		ParameterdecllistContext _localctx = new ParameterdecllistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterdecllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(ANGLELEFT);
			setState(383);
			parameterdecl();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(385);
				parameterdecl();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterParameterdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitParameterdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitParameterdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclContext parameterdecl() throws RecognitionException {
		ParameterdeclContext _localctx = new ParameterdeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameterdecl);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(TYPEKW);
				setState(394);
				parametername();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(TYPEKW);
				setState(396);
				parametername();
				setState(397);
				match(ASKW);
				setState(398);
				parametername();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(SIGKW);
				setState(401);
				parametername();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(SIGKW);
				setState(403);
				parametername();
				setState(404);
				match(ASKW);
				setState(405);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalprotocoldefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalprotocoldefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalprotocoldefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalprotocoldefinitionContext globalprotocoldefinition() throws RecognitionException {
		GlobalprotocoldefinitionContext _localctx = new GlobalprotocoldefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_globalprotocoldefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalprotocolinstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalprotocolinstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalprotocolinstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalprotocolinstanceContext globalprotocolinstance() throws RecognitionException {
		GlobalprotocolinstanceContext _localctx = new GlobalprotocolinstanceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_globalprotocolinstance);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(INSTANTIATESKW);
				setState(412);
				membername();
				setState(413);
				roleinstantiationlist();
				setState(414);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(INSTANTIATESKW);
				setState(417);
				membername();
				setState(418);
				argumentlist();
				setState(419);
				roleinstantiationlist();
				setState(420);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRoleinstantiationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRoleinstantiationlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRoleinstantiationlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleinstantiationlistContext roleinstantiationlist() throws RecognitionException {
		RoleinstantiationlistContext _localctx = new RoleinstantiationlistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_roleinstantiationlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(ROUNDLEFT);
			setState(425);
			roleinstantiation();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				match(COMMA);
				setState(427);
				roleinstantiation();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterRoleinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitRoleinstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitRoleinstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleinstantiationContext roleinstantiation() throws RecognitionException {
		RoleinstantiationContext _localctx = new RoleinstantiationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_roleinstantiation);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				rolename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				rolename();
				setState(437);
				match(ASKW);
				setState(438);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitArgumentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(ANGLELEFT);
			setState(443);
			argument();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(444);
				match(COMMA);
				setState(445);
				argument();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argument);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				messagesignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				messagesignature();
				setState(455);
				match(ASKW);
				setState(456);
				parametername();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				payloadtypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				payloadtypename();
				setState(460);
				match(ASKW);
				setState(461);
				parametername();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				parametername();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				parametername();
				setState(465);
				match(ASKW);
				setState(466);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalprotocolblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalprotocolblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalprotocolblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalprotocolblockContext globalprotocolblock() throws RecognitionException {
		GlobalprotocolblockContext _localctx = new GlobalprotocolblockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_globalprotocolblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(CURLYLEFT);
			setState(471);
			globalinteractionsequence();
			setState(472);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalinteractionsequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalinteractionsequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalinteractionsequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalinteractionsequenceContext globalinteractionsequence() throws RecognitionException {
		GlobalinteractionsequenceContext _localctx = new GlobalinteractionsequenceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_globalinteractionsequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHOICEKW) | (1L << RECKW) | (1L << CONTINUEKW) | (1L << PARKW) | (1L << INTERRUPTIBLEKW) | (1L << DOKW) | (1L << DISCONNECTKW) | (1L << WRAPKW) | (1L << LINE_COMMENT) | (1L << IDENTIFIER) | (1L << ROUNDLEFT))) != 0)) {
				{
				{
				setState(474);
				globalinteraction();
				}
				}
				setState(479);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalinteraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalinteraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalinteraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalinteractionContext globalinteraction() throws RecognitionException {
		GlobalinteractionContext _localctx = new GlobalinteractionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_globalinteraction);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				globalmessagetransfer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				globalchoice();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				globalrecursion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				globalcontinue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				globalparallel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				globalinterruptible();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(486);
				globaldo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(487);
				globalconnect();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(488);
				globaldisconnect();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(489);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalmessagetransfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalmessagetransfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalmessagetransfer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalmessagetransferContext globalmessagetransfer() throws RecognitionException {
		GlobalmessagetransferContext _localctx = new GlobalmessagetransferContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_globalmessagetransfer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			message();
			setState(493);
			match(FROMKW);
			setState(494);
			rolename();
			setState(495);
			match(TOKW);
			setState(496);
			rolename();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(497);
				match(COMMA);
				setState(498);
				rolename();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalconnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalconnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalconnectContext globalconnect() throws RecognitionException {
		GlobalconnectContext _localctx = new GlobalconnectContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_globalconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			message();
			setState(509);
			match(CONNECTKW);
			setState(510);
			rolename();
			setState(511);
			match(TOKW);
			setState(512);
			rolename();
			setState(513);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobaldisconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobaldisconnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobaldisconnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobaldisconnectContext globaldisconnect() throws RecognitionException {
		GlobaldisconnectContext _localctx = new GlobaldisconnectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_globaldisconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(DISCONNECTKW);
			setState(516);
			rolename();
			setState(517);
			match(ANDKW);
			setState(518);
			rolename();
			setState(519);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalwrap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalwrap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalwrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalwrapContext globalwrap() throws RecognitionException {
		GlobalwrapContext _localctx = new GlobalwrapContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_globalwrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(WRAPKW);
			setState(522);
			rolename();
			setState(523);
			match(TOKW);
			setState(524);
			rolename();
			setState(525);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalchoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalchoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalchoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalchoiceContext globalchoice() throws RecognitionException {
		GlobalchoiceContext _localctx = new GlobalchoiceContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_globalchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(527);
				choiceannot();
				}
			}

			setState(530);
			match(CHOICEKW);
			setState(531);
			match(ATKW);
			setState(532);
			rolename();
			setState(533);
			globalprotocolblock();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORKW) {
				{
				{
				setState(534);
				match(ORKW);
				setState(535);
				globalprotocolblock();
				}
				}
				setState(540);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalrecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalrecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalrecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalrecursionContext globalrecursion() throws RecognitionException {
		GlobalrecursionContext _localctx = new GlobalrecursionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_globalrecursion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(RECKW);
			setState(542);
			recursionlabelname();
			setState(543);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalcontinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalcontinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalcontinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalcontinueContext globalcontinue() throws RecognitionException {
		GlobalcontinueContext _localctx = new GlobalcontinueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_globalcontinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(CONTINUEKW);
			setState(546);
			recursionlabelname();
			setState(547);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalparallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalparallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalparallel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalparallelContext globalparallel() throws RecognitionException {
		GlobalparallelContext _localctx = new GlobalparallelContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_globalparallel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(PARKW);
			setState(550);
			globalprotocolblock();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDKW) {
				{
				{
				setState(551);
				match(ANDKW);
				setState(552);
				globalprotocolblock();
				}
				}
				setState(557);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalinterruptible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalinterruptible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalinterruptible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalinterruptibleContext globalinterruptible() throws RecognitionException {
		GlobalinterruptibleContext _localctx = new GlobalinterruptibleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_globalinterruptible);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(INTERRUPTIBLEKW);
				setState(559);
				globalprotocolblock();
				setState(560);
				match(WITHKW);
				setState(561);
				match(CURLYLEFT);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==ROUNDLEFT) {
					{
					{
					setState(562);
					globalinterrupt();
					}
					}
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(568);
				match(CURLYRIGHT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(INTERRUPTIBLEKW);
				setState(571);
				scopename();
				setState(572);
				match(COLON);
				setState(573);
				globalprotocolblock();
				setState(574);
				match(WITHKW);
				setState(575);
				match(CURLYLEFT);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==ROUNDLEFT) {
					{
					{
					setState(576);
					globalinterrupt();
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(582);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobalinterrupt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobalinterrupt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobalinterrupt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalinterruptContext globalinterrupt() throws RecognitionException {
		GlobalinterruptContext _localctx = new GlobalinterruptContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_globalinterrupt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			message();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(587);
				match(COMMA);
				setState(588);
				message();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			match(BYKW);
			setState(595);
			rolename();
			setState(596);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterGlobaldo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitGlobaldo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitGlobaldo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobaldoContext globaldo() throws RecognitionException {
		GlobaldoContext _localctx = new GlobaldoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_globaldo);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(DOKW);
				setState(599);
				membername();
				setState(600);
				roleinstantiationlist();
				setState(601);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(DOKW);
				setState(604);
				membername();
				setState(605);
				argumentlist();
				setState(606);
				roleinstantiationlist();
				setState(607);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(DOKW);
				setState(610);
				scopename();
				setState(611);
				match(COLON);
				setState(612);
				membername();
				setState(613);
				roleinstantiationlist();
				setState(614);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(616);
				match(DOKW);
				setState(617);
				scopename();
				setState(618);
				match(COLON);
				setState(619);
				membername();
				setState(620);
				argumentlist();
				setState(621);
				roleinstantiationlist();
				setState(622);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterStndLocalProtocolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitStndLocalProtocolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitStndLocalProtocolDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstLocalProtocolDeclContext extends LocalprotocoldeclContext {
		public LocalprotocolheaderContext localprotocolheader() {
			return getRuleContext(LocalprotocolheaderContext.class,0);
		}
		public LocalprotocolinstanceContext localprotocolinstance() {
			return getRuleContext(LocalprotocolinstanceContext.class,0);
		}
		public InstLocalProtocolDeclContext(LocalprotocoldeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterInstLocalProtocolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitInstLocalProtocolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitInstLocalProtocolDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalprotocoldeclContext localprotocoldecl() throws RecognitionException {
		LocalprotocoldeclContext _localctx = new LocalprotocoldeclContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_localprotocoldecl);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new StndLocalProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				localprotocolheader();
				setState(627);
				localprotocoldefinition();
				}
				break;
			case 2:
				_localctx = new InstLocalProtocolDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				localprotocolheader();
				setState(630);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterStndLocalProtocolHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitStndLocalProtocolHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitStndLocalProtocolHeader(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterParamLocalProtocolHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitParamLocalProtocolHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitParamLocalProtocolHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalprotocolheaderContext localprotocolheader() throws RecognitionException {
		LocalprotocolheaderContext _localctx = new LocalprotocolheaderContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_localprotocolheader);
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new StndLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(LOCALKW);
				setState(635);
				match(PROTOCOLKW);
				setState(636);
				protocolname();
				setState(637);
				roledecllist();
				}
				break;
			case 2:
				_localctx = new StndLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(LOCALKW);
				setState(640);
				match(PROTOCOLKW);
				setState(641);
				protocolname();
				setState(642);
				match(ATKW);
				setState(643);
				rolename();
				setState(644);
				roledecllist();
				}
				break;
			case 3:
				_localctx = new ParamLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(646);
				match(LOCALKW);
				setState(647);
				match(PROTOCOLKW);
				setState(648);
				protocolname();
				setState(649);
				parameterdecllist();
				setState(650);
				roledecllist();
				}
				break;
			case 4:
				_localctx = new ParamLocalProtocolHeaderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(652);
				match(LOCALKW);
				setState(653);
				match(PROTOCOLKW);
				setState(654);
				protocolname();
				setState(655);
				match(ATKW);
				setState(656);
				rolename();
				setState(657);
				parameterdecllist();
				setState(658);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalprotocoldefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalprotocoldefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalprotocoldefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalprotocoldefinitionContext localprotocoldefinition() throws RecognitionException {
		LocalprotocoldefinitionContext _localctx = new LocalprotocoldefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_localprotocoldefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalprotocolinstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalprotocolinstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalprotocolinstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalprotocolinstanceContext localprotocolinstance() throws RecognitionException {
		LocalprotocolinstanceContext _localctx = new LocalprotocolinstanceContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_localprotocolinstance);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(INSTANTIATESKW);
				setState(665);
				membername();
				setState(666);
				roleinstantiationlist();
				setState(667);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(INSTANTIATESKW);
				setState(670);
				membername();
				setState(671);
				argumentlist();
				setState(672);
				roleinstantiationlist();
				setState(673);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalprotocolblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalprotocolblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalprotocolblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalprotocolblockContext localprotocolblock() throws RecognitionException {
		LocalprotocolblockContext _localctx = new LocalprotocolblockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_localprotocolblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(CURLYLEFT);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CHOICEKW) | (1L << RECKW) | (1L << CONTINUEKW) | (1L << PARKW) | (1L << INTERRUPTIBLEKW) | (1L << DOKW) | (1L << DISCONNECTKW) | (1L << WRAPKW) | (1L << LINE_COMMENT) | (1L << IDENTIFIER) | (1L << ROUNDLEFT))) != 0)) {
				{
				{
				setState(678);
				localinteraction();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalinteraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalinteraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalinteraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalinteractionContext localinteraction() throws RecognitionException {
		LocalinteractionContext _localctx = new LocalinteractionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_localinteraction);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				localsend();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				localreceive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				localchoice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				localparallel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(690);
				localrecursion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(691);
				localcontinue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(692);
				localinterruptible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(693);
				localdo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(694);
				localsendwrap();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(695);
				localreceivewrap();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(696);
				localconnect();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(697);
				localaccept();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(698);
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
		public TimeconstraintContext timeconstraint() {
			return getRuleContext(TimeconstraintContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScribbleParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScribbleParser.COMMA, i);
		}
		public LocalsendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localsend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalsend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalsend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalsend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalsendContext localsend() throws RecognitionException {
		LocalsendContext _localctx = new LocalsendContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_localsend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(701);
				timeconstraint();
				}
			}

			setState(704);
			messagesignature();
			setState(705);
			match(TOKW);
			setState(706);
			rolename();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707);
				match(COMMA);
				setState(708);
				rolename();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
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

	public static class LocalreceiveContext extends ParserRuleContext {
		public MessagesignatureContext messagesignature() {
			return getRuleContext(MessagesignatureContext.class,0);
		}
		public TerminalNode FROMKW() { return getToken(ScribbleParser.FROMKW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ScribbleParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ScribbleParser.SEMICOLON, 0); }
		public TimeconstraintContext timeconstraint() {
			return getRuleContext(TimeconstraintContext.class,0);
		}
		public LocalreceiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localreceive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalreceive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalreceive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalreceive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalreceiveContext localreceive() throws RecognitionException {
		LocalreceiveContext _localctx = new LocalreceiveContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_localreceive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(716);
				timeconstraint();
				}
			}

			setState(719);
			messagesignature();
			setState(720);
			match(FROMKW);
			setState(721);
			match(IDENTIFIER);
			setState(722);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalsendwrap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalsendwrap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalsendwrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalsendwrapContext localsendwrap() throws RecognitionException {
		LocalsendwrapContext _localctx = new LocalsendwrapContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_localsendwrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(WRAPKW);
			setState(725);
			match(TOKW);
			setState(726);
			rolename();
			setState(727);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalreceivewrap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalreceivewrap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalreceivewrap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalreceivewrapContext localreceivewrap() throws RecognitionException {
		LocalreceivewrapContext _localctx = new LocalreceivewrapContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_localreceivewrap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(WRAPKW);
			setState(730);
			match(FROMKW);
			setState(731);
			rolename();
			setState(732);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalconnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalconnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalconnectContext localconnect() throws RecognitionException {
		LocalconnectContext _localctx = new LocalconnectContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_localconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			messagesignature();
			setState(735);
			match(CONNECTKW);
			setState(736);
			rolename();
			setState(737);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalaccept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalaccept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalaccept(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalacceptContext localaccept() throws RecognitionException {
		LocalacceptContext _localctx = new LocalacceptContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localaccept);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			messagesignature();
			setState(740);
			match(ACCEPTKW);
			setState(741);
			rolename();
			setState(742);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocaldisconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocaldisconnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocaldisconnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocaldisconnectContext localdisconnect() throws RecognitionException {
		LocaldisconnectContext _localctx = new LocaldisconnectContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localdisconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(DISCONNECTKW);
			setState(745);
			rolename();
			setState(746);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalchoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalchoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalchoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalchoiceContext localchoice() throws RecognitionException {
		LocalchoiceContext _localctx = new LocalchoiceContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localchoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(748);
				choiceannot();
				}
			}

			setState(751);
			match(CHOICEKW);
			setState(752);
			match(ATKW);
			setState(753);
			rolename();
			setState(754);
			localprotocolblock();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORKW) {
				{
				{
				setState(755);
				match(ORKW);
				setState(756);
				localprotocolblock();
				}
				}
				setState(761);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalrecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalrecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalrecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalrecursionContext localrecursion() throws RecognitionException {
		LocalrecursionContext _localctx = new LocalrecursionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_localrecursion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(RECKW);
			setState(763);
			recursionlabelname();
			setState(764);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalcontinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalcontinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalcontinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalcontinueContext localcontinue() throws RecognitionException {
		LocalcontinueContext _localctx = new LocalcontinueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localcontinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(CONTINUEKW);
			setState(767);
			recursionlabelname();
			setState(768);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalparallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalparallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalparallel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalparallelContext localparallel() throws RecognitionException {
		LocalparallelContext _localctx = new LocalparallelContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localparallel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(PARKW);
			setState(771);
			localprotocolblock();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDKW) {
				{
				{
				setState(772);
				match(ANDKW);
				setState(773);
				localprotocolblock();
				}
				}
				setState(778);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalinterruptible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalinterruptible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalinterruptible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalinterruptibleContext localinterruptible() throws RecognitionException {
		LocalinterruptibleContext _localctx = new LocalinterruptibleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_localinterruptible);
		int _la;
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(INTERRUPTIBLEKW);
				setState(780);
				scopename();
				setState(781);
				match(COLON);
				setState(782);
				localprotocolblock();
				setState(783);
				match(WITHKW);
				setState(784);
				match(CURLYLEFT);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCHESKW) {
					{
					{
					setState(785);
					localcatch();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(CURLYRIGHT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(INTERRUPTIBLEKW);
				setState(794);
				scopename();
				setState(795);
				match(COLON);
				setState(796);
				localprotocolblock();
				setState(797);
				match(WITHKW);
				setState(798);
				match(CURLYLEFT);
				setState(799);
				localthrow();
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCHESKW) {
					{
					{
					setState(800);
					localcatch();
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalthrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalthrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalthrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalthrowContext localthrow() throws RecognitionException {
		LocalthrowContext _localctx = new LocalthrowContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_localthrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(THROWSKW);
			setState(811);
			message();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(812);
				match(COMMA);
				setState(813);
				message();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			match(TOKW);
			setState(820);
			rolename();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				rolename();
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocalcatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocalcatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocalcatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalcatchContext localcatch() throws RecognitionException {
		LocalcatchContext _localctx = new LocalcatchContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_localcatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(CATCHESKW);
			setState(831);
			message();
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(832);
				match(COMMA);
				setState(833);
				message();
				}
				}
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(839);
			match(FROMKW);
			setState(840);
			rolename();
			setState(841);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterLocaldo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitLocaldo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitLocaldo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocaldoContext localdo() throws RecognitionException {
		LocaldoContext _localctx = new LocaldoContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_localdo);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				match(DOKW);
				setState(844);
				membername();
				setState(845);
				roleinstantiationlist();
				setState(846);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(DOKW);
				setState(849);
				membername();
				setState(850);
				argumentlist();
				setState(851);
				roleinstantiationlist();
				setState(852);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				match(DOKW);
				setState(855);
				scopename();
				setState(856);
				match(COLON);
				setState(857);
				membername();
				setState(858);
				roleinstantiationlist();
				setState(859);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(861);
				match(DOKW);
				setState(862);
				scopename();
				setState(863);
				match(COLON);
				setState(864);
				membername();
				setState(865);
				argumentlist();
				setState(866);
				roleinstantiationlist();
				setState(867);
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

	public static class ClockidContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(ScribbleParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ScribbleParser.LETTER, i);
		}
		public ClockidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterClockid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitClockid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitClockid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockidContext clockid() throws RecognitionException {
		ClockidContext _localctx = new ClockidContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_clockid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(872); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(871);
					match(LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(874); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IntconstContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ScribbleParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ScribbleParser.DIGIT, i);
		}
		public IntconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterIntconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitIntconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitIntconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntconstContext intconst() throws RecognitionException {
		IntconstContext _localctx = new IntconstContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_intconst);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(877); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(876);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(879); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterTimeconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitTimeconstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitTimeconstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeconstraintContext timeconstraint() throws RecognitionException {
		TimeconstraintContext _localctx = new TimeconstraintContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_timeconstraint);
		try {
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				match(T__1);
				setState(882);
				constraintspec();
				setState(883);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(T__1);
				setState(886);
				constraintspec();
				setState(887);
				match(COMMA);
				setState(888);
				resetpredicate();
				setState(889);
				match(T__2);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterConstraintspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitConstraintspec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitConstraintspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintspecContext constraintspec() throws RecognitionException {
		ConstraintspecContext _localctx = new ConstraintspecContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constraintspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(AT);
			setState(894);
			rolename();
			setState(895);
			match(COLON);
			setState(896);
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
		public TerminalNode BOOL() { return getToken(ScribbleParser.BOOL, 0); }
		public ClockidContext clockid() {
			return getRuleContext(ClockidContext.class,0);
		}
		public TerminalNode ANGLERIGHT() { return getToken(ScribbleParser.ANGLERIGHT, 0); }
		public IntconstContext intconst() {
			return getRuleContext(IntconstContext.class,0);
		}
		public TerminalNode ANGLELEFT() { return getToken(ScribbleParser.ANGLELEFT, 0); }
		public List<ClockconstraintContext> clockconstraint() {
			return getRuleContexts(ClockconstraintContext.class);
		}
		public ClockconstraintContext clockconstraint(int i) {
			return getRuleContext(ClockconstraintContext.class,i);
		}
		public ClockconstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockconstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterClockconstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitClockconstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitClockconstraint(this);
			else return visitor.visitChildren(this);
		}
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
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(899);
				match(BOOL);
				}
				break;
			case 2:
				{
				setState(900);
				clockid();
				setState(901);
				match(ANGLERIGHT);
				setState(902);
				intconst();
				}
				break;
			case 3:
				{
				setState(904);
				clockid();
				setState(905);
				match(ANGLELEFT);
				setState(906);
				intconst();
				}
				break;
			case 4:
				{
				setState(908);
				clockid();
				setState(909);
				match(T__3);
				setState(910);
				intconst();
				}
				break;
			case 5:
				{
				setState(912);
				clockid();
				setState(913);
				match(T__4);
				setState(914);
				intconst();
				}
				break;
			case 6:
				{
				setState(916);
				clockid();
				setState(917);
				match(T__5);
				setState(918);
				intconst();
				}
				break;
			case 7:
				{
				setState(920);
				match(T__6);
				setState(921);
				clockconstraint(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(930);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new ClockconstraintContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_clockconstraint);
						setState(924);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(925);
						match(T__7);
						setState(926);
						clockconstraint(3);
						}
						break;
					case 2:
						{
						_localctx = new ClockconstraintContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_clockconstraint);
						setState(927);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(928);
						match(T__8);
						setState(929);
						clockconstraint(2);
						}
						break;
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterResetpredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitResetpredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitResetpredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetpredicateContext resetpredicate() throws RecognitionException {
		ResetpredicateContext _localctx = new ResetpredicateContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_resetpredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(T__9);
			setState(936);
			match(ROUNDLEFT);
			setState(937);
			resetpredlist(0);
			setState(938);
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
		public ResetpredlistContext resetpredlist() {
			return getRuleContext(ResetpredlistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ScribbleParser.COMMA, 0); }
		public ResetpredlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetpredlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).enterResetpredlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScribbleListener ) ((ScribbleListener)listener).exitResetpredlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScribbleVisitor ) return ((ScribbleVisitor<? extends T>)visitor).visitResetpredlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResetpredlistContext resetpredlist() throws RecognitionException {
		return resetpredlist(0);
	}

	private ResetpredlistContext resetpredlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ResetpredlistContext _localctx = new ResetpredlistContext(_ctx, _parentState);
		ResetpredlistContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_resetpredlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(941);
			clockid();
			}
			_ctx.stop = _input.LT(-1);
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ResetpredlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_resetpredlist);
					setState(943);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(944);
					match(COMMA);
					setState(945);
					clockid();
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 79:
			return clockconstraint_sempred((ClockconstraintContext)_localctx, predIndex);
		case 81:
			return resetpredlist_sempred((ResetpredlistContext)_localctx, predIndex);
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
	private boolean resetpredlist_sempred(ResetpredlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u03ba\4\2\t\2\4"+
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
		"\3\13\3\f\3\f\3\f\7\f\u00be\n\f\f\f\16\f\u00c1\13\f\3\f\3\f\3\f\5\f\u00c6"+
		"\n\f\3\r\3\r\5\r\u00ca\n\r\3\16\3\16\5\16\u00ce\n\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3\20\7\20\u00dc\n"+
		"\20\f\20\16\20\u00df\13\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20"+
		"\3\21\3\21\5\21\u00e9\n\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00f1\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fd\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u010d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\30\3\30\3\30"+
		"\5\30\u0135\n\30\3\31\3\31\3\31\7\31\u013a\n\31\f\31\16\31\u013d\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0149\n\32\3\33"+
		"\3\33\5\33\u014d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u015c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0169\n\36\3\37\3\37\3\37\3\37\7\37\u016f\n\37\f"+
		"\37\16\37\u0172\13\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u017f\n"+
		" \3!\3!\3!\3!\7!\u0185\n!\f!\16!\u0188\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019a\n\"\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\5$\u01a9\n$\3%\3%\3%\3%\7%\u01af\n%\f%\16%\u01b2\13"+
		"%\3%\3%\3&\3&\3&\3&\3&\5&\u01bb\n&\3\'\3\'\3\'\3\'\7\'\u01c1\n\'\f\'\16"+
		"\'\u01c4\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u01d7\n(\3)\3)\3)\3)\3*\7*\u01de\n*\f*\16*\u01e1\13*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\5+\u01ed\n+\3,\3,\3,\3,\3,\3,\3,\7,\u01f6\n,\f,\16,\u01f9"+
		"\13,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\5\61\u0213\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u021b\n\61\f\61\16\61\u021e\13\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\7\64\u022c\n\64\f\64\16\64\u022f\13\64\3\65"+
		"\3\65\3\65\3\65\3\65\7\65\u0236\n\65\f\65\16\65\u0239\13\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0244\n\65\f\65\16\65\u0247\13"+
		"\65\3\65\3\65\5\65\u024b\n\65\3\66\3\66\3\66\7\66\u0250\n\66\f\66\16\66"+
		"\u0253\13\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u0273\n\67\38\38\38\38\38\38\58\u027b\n8"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\59\u0297\n9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02a6"+
		"\n;\3<\3<\7<\u02aa\n<\f<\16<\u02ad\13<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\5=\u02be\n=\3>\5>\u02c1\n>\3>\3>\3>\3>\3>\7>\u02c8\n>\f"+
		">\16>\u02cb\13>\3>\3>\3?\5?\u02d0\n?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\5E\u02f0\nE"+
		"\3E\3E\3E\3E\3E\3E\7E\u02f8\nE\fE\16E\u02fb\13E\3F\3F\3F\3F\3G\3G\3G\3"+
		"G\3H\3H\3H\3H\7H\u0309\nH\fH\16H\u030c\13H\3I\3I\3I\3I\3I\3I\3I\7I\u0315"+
		"\nI\fI\16I\u0318\13I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I\u0324\nI\fI\16I"+
		"\u0327\13I\3I\3I\5I\u032b\nI\3J\3J\3J\3J\7J\u0331\nJ\fJ\16J\u0334\13J"+
		"\3J\3J\3J\3J\7J\u033a\nJ\fJ\16J\u033d\13J\3J\3J\3K\3K\3K\3K\7K\u0345\n"+
		"K\fK\16K\u0348\13K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u0368\nL\3M\6M\u036b\nM\rM"+
		"\16M\u036c\3N\6N\u0370\nN\rN\16N\u0371\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5"+
		"O\u037e\nO\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u039d\nQ\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u03a5\n"+
		"Q\fQ\16Q\u03a8\13Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\7S\u03b5\nS\fS\16"+
		"S\u03b8\13S\3S\2\4\u00a0\u00a4T\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\2\2\2\u03cf\2\u00a6\3\2\2\2\4\u00a8\3\2"+
		"\2\2\6\u00aa\3\2\2\2\b\u00ac\3\2\2\2\n\u00ae\3\2\2\2\f\u00b0\3\2\2\2\16"+
		"\u00b2\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3\2\2\2\24\u00b8\3\2\2\2\26\u00c5"+
		"\3\2\2\2\30\u00c9\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36\u00d3\3"+
		"\2\2\2 \u00e8\3\2\2\2\"\u00ea\3\2\2\2$\u00f0\3\2\2\2&\u00fc\3\2\2\2(\u010c"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0119\3\2\2\2.\u0134\3\2\2\2\60\u0136\3\2\2\2"+
		"\62\u0148\3\2\2\2\64\u014c\3\2\2\2\66\u014e\3\2\2\28\u015b\3\2\2\2:\u0168"+
		"\3\2\2\2<\u016a\3\2\2\2>\u017e\3\2\2\2@\u0180\3\2\2\2B\u0199\3\2\2\2D"+
		"\u019b\3\2\2\2F\u01a8\3\2\2\2H\u01aa\3\2\2\2J\u01ba\3\2\2\2L\u01bc\3\2"+
		"\2\2N\u01d6\3\2\2\2P\u01d8\3\2\2\2R\u01df\3\2\2\2T\u01ec\3\2\2\2V\u01ee"+
		"\3\2\2\2X\u01fc\3\2\2\2Z\u01fe\3\2\2\2\\\u0205\3\2\2\2^\u020b\3\2\2\2"+
		"`\u0212\3\2\2\2b\u021f\3\2\2\2d\u0223\3\2\2\2f\u0227\3\2\2\2h\u024a\3"+
		"\2\2\2j\u024c\3\2\2\2l\u0272\3\2\2\2n\u027a\3\2\2\2p\u0296\3\2\2\2r\u0298"+
		"\3\2\2\2t\u02a5\3\2\2\2v\u02a7\3\2\2\2x\u02bd\3\2\2\2z\u02c0\3\2\2\2|"+
		"\u02cf\3\2\2\2~\u02d6\3\2\2\2\u0080\u02db\3\2\2\2\u0082\u02e0\3\2\2\2"+
		"\u0084\u02e5\3\2\2\2\u0086\u02ea\3\2\2\2\u0088\u02ef\3\2\2\2\u008a\u02fc"+
		"\3\2\2\2\u008c\u0300\3\2\2\2\u008e\u0304\3\2\2\2\u0090\u032a\3\2\2\2\u0092"+
		"\u032c\3\2\2\2\u0094\u0340\3\2\2\2\u0096\u0367\3\2\2\2\u0098\u036a\3\2"+
		"\2\2\u009a\u036f\3\2\2\2\u009c\u037d\3\2\2\2\u009e\u037f\3\2\2\2\u00a0"+
		"\u039c\3\2\2\2\u00a2\u03a9\3\2\2\2\u00a4\u03ae\3\2\2\2\u00a6\u00a7\7\62"+
		"\2\2\u00a7\3\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\5\3\2\2\2\u00aa\u00ab"+
		"\7\62\2\2\u00ab\7\3\2\2\2\u00ac\u00ad\7\62\2\2\u00ad\t\3\2\2\2\u00ae\u00af"+
		"\7\62\2\2\u00af\13\3\2\2\2\u00b0\u00b1\7\62\2\2\u00b1\r\3\2\2\2\u00b2"+
		"\u00b3\7\62\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\62\2\2\u00b5\21\3\2\2\2"+
		"\u00b6\u00b7\7\62\2\2\u00b7\23\3\2\2\2\u00b8\u00b9\7\62\2\2\u00b9\25\3"+
		"\2\2\2\u00ba\u00bf\7\62\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00be\7\62\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\3\2\2\u00c3"+
		"\u00c6\7\62\2\2\u00c4\u00c6\7\62\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\27\3\2\2\2\u00c7\u00ca\5\32\16\2\u00c8\u00ca\5\34\17\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\31\3\2\2\2\u00cb\u00ce\5\4\3"+
		"\2\u00cc\u00ce\5\6\4\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\33"+
		"\3\2\2\2\u00cf\u00d0\5\26\f\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\5\32\16"+
		"\2\u00d2\35\3\2\2\2\u00d3\u00d7\5\"\22\2\u00d4\u00d6\5$\23\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00dd\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\5 \21\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e3\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\5\64\33\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\37\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\5*\26\2\u00e7\u00e9\5,\27"+
		"\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00eb"+
		"\7\r\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7\65\2\2\u00ed#\3\2\2\2\u00ee"+
		"\u00f1\5&\24\2\u00ef\u00f1\5(\25\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1%\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f4\5\26\f\2\u00f4\u00f5"+
		"\7\65\2\2\u00f5\u00fd\3\2\2\2\u00f6\u00f7\7\16\2\2\u00f7\u00f8\5\26\f"+
		"\2\u00f8\u00f9\7\31\2\2\u00f9\u00fa\7\62\2\2\u00fa\u00fb\7\65\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fd\'\3\2\2\2"+
		"\u00fe\u00ff\7\32\2\2\u00ff\u0100\5\26\f\2\u0100\u0101\7\16\2\2\u0101"+
		"\u0102\5\32\16\2\u0102\u0103\7\65\2\2\u0103\u010d\3\2\2\2\u0104\u0105"+
		"\7\32\2\2\u0105\u0106\5\26\f\2\u0106\u0107\7\16\2\2\u0107\u0108\5\32\16"+
		"\2\u0108\u0109\7\31\2\2\u0109\u010a\7\62\2\2\u010a\u010b\7\65\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u00fe\3\2\2\2\u010c\u0104\3\2\2\2\u010d)\3\2\2\2"+
		"\u010e\u010f\7\17\2\2\u010f\u0110\7:\2\2\u0110\u0111\7\62\2\2\u0111\u0112"+
		"\7;\2\2\u0112\u0113\7\61\2\2\u0113\u0114\7\32\2\2\u0114\u0115\7\61\2\2"+
		"\u0115\u0116\7\31\2\2\u0116\u0117\5\4\3\2\u0117\u0118\7\65\2\2\u0118+"+
		"\3\2\2\2\u0119\u011a\7\27\2\2\u011a\u011b\7:\2\2\u011b\u011c\7\62\2\2"+
		"\u011c\u011d\7;\2\2\u011d\u011e\7\61\2\2\u011e\u011f\7\32\2\2\u011f\u0120"+
		"\7\61\2\2\u0120\u0121\7\31\2\2\u0121\u0122\5\22\n\2\u0122\u0123\7\65\2"+
		"\2\u0123-\3\2\2\2\u0124\u0125\78\2\2\u0125\u0135\79\2\2\u0126\u0127\7"+
		"8\2\2\u0127\u0128\5\60\31\2\u0128\u0129\79\2\2\u0129\u0135\3\2\2\2\u012a"+
		"\u012f\7\62\2\2\u012b\u012c\78\2\2\u012c\u012d\5\60\31\2\u012d\u012e\7"+
		"9\2\2\u012e\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0135\3\2\2\2\u0131\u0132\7\62\2\2\u0132\u0133\78\2\2\u0133\u0135\79"+
		"\2\2\u0134\u0124\3\2\2\2\u0134\u0126\3\2\2\2\u0134\u012a\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0135/\3\2\2\2\u0136\u013b\5\62\32\2\u0137\u0138\7\63\2"+
		"\2\u0138\u013a\5\62\32\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\61\3\2\2\2\u013d\u013b\3\2\2"+
		"\2\u013e\u0149\5\4\3\2\u013f\u0149\5\b\5\2\u0140\u0141\5\n\6\2\u0141\u0142"+
		"\7\64\2\2\u0142\u0143\5\4\3\2\u0143\u0149\3\2\2\2\u0144\u0145\5\n\6\2"+
		"\u0145\u0146\7\64\2\2\u0146\u0147\5\b\5\2\u0147\u0149\3\2\2\2\u0148\u013e"+
		"\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0140\3\2\2\2\u0148\u0144\3\2\2\2\u0149"+
		"\63\3\2\2\2\u014a\u014d\58\35\2\u014b\u014d\5n8\2\u014c\u014a\3\2\2\2"+
		"\u014c\u014b\3\2\2\2\u014d\65\3\2\2\2\u014e\u014f\7\60\2\2\u014f\u0150"+
		"\7<\2\2\u0150\u0151\7)\2\2\u0151\u0152\78\2\2\u0152\u0153\5\24\13\2\u0153"+
		"\u0154\79\2\2\u0154\67\3\2\2\2\u0155\u0156\5:\36\2\u0156\u0157\5D#\2\u0157"+
		"\u015c\3\2\2\2\u0158\u0159\5:\36\2\u0159\u015a\5F$\2\u015a\u015c\3\2\2"+
		"\2\u015b\u0155\3\2\2\2\u015b\u0158\3\2\2\2\u015c9\3\2\2\2\u015d\u015e"+
		"\7\21\2\2\u015e\u015f\7\20\2\2\u015f\u0160\5\6\4\2\u0160\u0161\5<\37\2"+
		"\u0161\u0169\3\2\2\2\u0162\u0163\7\21\2\2\u0163\u0164\7\20\2\2\u0164\u0165"+
		"\5\6\4\2\u0165\u0166\5@!\2\u0166\u0167\5<\37\2\u0167\u0169\3\2\2\2\u0168"+
		"\u015d\3\2\2\2\u0168\u0162\3\2\2\2\u0169;\3\2\2\2\u016a\u016b\78\2\2\u016b"+
		"\u0170\5> \2\u016c\u016d\7\63\2\2\u016d\u016f\5> \2\u016e\u016c\3\2\2"+
		"\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\79\2\2\u0174=\3\2\2\2\u0175\u0176"+
		"\7\25\2\2\u0176\u017f\5\2\2\2\u0177\u0178\7\25\2\2\u0178\u0179\5\2\2\2"+
		"\u0179\u017a\7\31\2\2\u017a\u017b\5\2\2\2\u017b\u017f\3\2\2\2\u017c\u017d"+
		"\7\26\2\2\u017d\u017f\5\2\2\2\u017e\u0175\3\2\2\2\u017e\u0177\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017f?\3\2\2\2\u0180\u0181\7:\2\2\u0181\u0186\5B"+
		"\"\2\u0182\u0183\7\63\2\2\u0183\u0185\5B\"\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7;\2\2\u018aA\3\2\2\2\u018b\u018c"+
		"\7\17\2\2\u018c\u019a\5\b\5\2\u018d\u018e\7\17\2\2\u018e\u018f\5\b\5\2"+
		"\u018f\u0190\7\31\2\2\u0190\u0191\5\b\5\2\u0191\u019a\3\2\2\2\u0192\u0193"+
		"\7\27\2\2\u0193\u019a\5\b\5\2\u0194\u0195\7\27\2\2\u0195\u0196\5\b\5\2"+
		"\u0196\u0197\7\31\2\2\u0197\u0198\5\b\5\2\u0198\u019a\3\2\2\2\u0199\u018b"+
		"\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u0192\3\2\2\2\u0199\u0194\3\2\2\2\u019a"+
		"C\3\2\2\2\u019b\u019c\5P)\2\u019cE\3\2\2\2\u019d\u019e\7\30\2\2\u019e"+
		"\u019f\5\30\r\2\u019f\u01a0\5H%\2\u01a0\u01a1\7\65\2\2\u01a1\u01a9\3\2"+
		"\2\2\u01a2\u01a3\7\30\2\2\u01a3\u01a4\5\30\r\2\u01a4\u01a5\5L\'\2\u01a5"+
		"\u01a6\5H%\2\u01a6\u01a7\7\65\2\2\u01a7\u01a9\3\2\2\2\u01a8\u019d\3\2"+
		"\2\2\u01a8\u01a2\3\2\2\2\u01a9G\3\2\2\2\u01aa\u01ab\78\2\2\u01ab\u01b0"+
		"\5J&\2\u01ac\u01ad\7\63\2\2\u01ad\u01af\5J&\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\79\2\2\u01b4I\3\2\2\2\u01b5\u01bb"+
		"\5\2\2\2\u01b6\u01b7\5\2\2\2\u01b7\u01b8\7\31\2\2\u01b8\u01b9\5\2\2\2"+
		"\u01b9\u01bb\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bbK\3"+
		"\2\2\2\u01bc\u01bd\7:\2\2\u01bd\u01c2\5N(\2\u01be\u01bf\7\63\2\2\u01bf"+
		"\u01c1\5N(\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2"+
		"\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6"+
		"\7;\2\2\u01c6M\3\2\2\2\u01c7\u01d7\5.\30\2\u01c8\u01c9\5.\30\2\u01c9\u01ca"+
		"\7\31\2\2\u01ca\u01cb\5\b\5\2\u01cb\u01d7\3\2\2\2\u01cc\u01d7\5\4\3\2"+
		"\u01cd\u01ce\5\4\3\2\u01ce\u01cf\7\31\2\2\u01cf\u01d0\5\b\5\2\u01d0\u01d7"+
		"\3\2\2\2\u01d1\u01d7\5\b\5\2\u01d2\u01d3\5\b\5\2\u01d3\u01d4\7\31\2\2"+
		"\u01d4\u01d5\5\b\5\2\u01d5\u01d7\3\2\2\2\u01d6\u01c7\3\2\2\2\u01d6\u01c8"+
		"\3\2\2\2\u01d6\u01cc\3\2\2\2\u01d6\u01cd\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d6"+
		"\u01d2\3\2\2\2\u01d7O\3\2\2\2\u01d8\u01d9\7\66\2\2\u01d9\u01da\5R*\2\u01da"+
		"\u01db\7\67\2\2\u01dbQ\3\2\2\2\u01dc\u01de\5T+\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0S\3\2\2\2"+
		"\u01e1\u01df\3\2\2\2\u01e2\u01ed\5V,\2\u01e3\u01ed\5`\61\2\u01e4\u01ed"+
		"\5b\62\2\u01e5\u01ed\5d\63\2\u01e6\u01ed\5f\64\2\u01e7\u01ed\5h\65\2\u01e8"+
		"\u01ed\5l\67\2\u01e9\u01ed\5Z.\2\u01ea\u01ed\5\\/\2\u01eb\u01ed\5^\60"+
		"\2\u01ec\u01e2\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ec\u01e5"+
		"\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec"+
		"\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01edU\3\2\2\2"+
		"\u01ee\u01ef\5X-\2\u01ef\u01f0\7\32\2\2\u01f0\u01f1\5\2\2\2\u01f1\u01f2"+
		"\7\33\2\2\u01f2\u01f7\5\2\2\2\u01f3\u01f4\7\63\2\2\u01f4\u01f6\5\2\2\2"+
		"\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7\65\2\2"+
		"\u01fbW\3\2\2\2\u01fc\u01fd\5.\30\2\u01fdY\3\2\2\2\u01fe\u01ff\5X-\2\u01ff"+
		"\u0200\7*\2\2\u0200\u0201\5\2\2\2\u0201\u0202\7\33\2\2\u0202\u0203\5\2"+
		"\2\2\u0203\u0204\7\65\2\2\u0204[\3\2\2\2\u0205\u0206\7+\2\2\u0206\u0207"+
		"\5\2\2\2\u0207\u0208\7\"\2\2\u0208\u0209\5\2\2\2\u0209\u020a\7\65\2\2"+
		"\u020a]\3\2\2\2\u020b\u020c\7-\2\2\u020c\u020d\5\2\2\2\u020d\u020e\7\33"+
		"\2\2\u020e\u020f\5\2\2\2\u020f\u0210\7\65\2\2\u0210_\3\2\2\2\u0211\u0213"+
		"\5\66\34\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2"+
		"\u0214\u0215\7\34\2\2\u0215\u0216\7\35\2\2\u0216\u0217\5\2\2\2\u0217\u021c"+
		"\5P)\2\u0218\u0219\7\36\2\2\u0219\u021b\5P)\2\u021a\u0218\3\2\2\2\u021b"+
		"\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021da\3\2\2\2"+
		"\u021e\u021c\3\2\2\2\u021f\u0220\7\37\2\2\u0220\u0221\5\f\7\2\u0221\u0222"+
		"\5P)\2\u0222c\3\2\2\2\u0223\u0224\7 \2\2\u0224\u0225\5\f\7\2\u0225\u0226"+
		"\7\65\2\2\u0226e\3\2\2\2\u0227\u0228\7!\2\2\u0228\u022d\5P)\2\u0229\u022a"+
		"\7\"\2\2\u022a\u022c\5P)\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022eg\3\2\2\2\u022f\u022d\3\2\2\2"+
		"\u0230\u0231\7#\2\2\u0231\u0232\5P)\2\u0232\u0233\7$\2\2\u0233\u0237\7"+
		"\66\2\2\u0234\u0236\5j\66\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2"+
		"\2\2\u023a\u023b\7\67\2\2\u023b\u024b\3\2\2\2\u023c\u023d\7#\2\2\u023d"+
		"\u023e\5\20\t\2\u023e\u023f\7\64\2\2\u023f\u0240\5P)\2\u0240\u0241\7$"+
		"\2\2\u0241\u0245\7\66\2\2\u0242\u0244\5j\66\2\u0243\u0242\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2"+
		"\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7\67\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0230\3\2\2\2\u024a\u023c\3\2\2\2\u024bi\3\2\2\2\u024c\u0251\5X-\2\u024d"+
		"\u024e\7\63\2\2\u024e\u0250\5X-\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\7%\2\2\u0255\u0256\5\2\2\2\u0256\u0257\7\65"+
		"\2\2\u0257k\3\2\2\2\u0258\u0259\7(\2\2\u0259\u025a\5\30\r\2\u025a\u025b"+
		"\5H%\2\u025b\u025c\7\65\2\2\u025c\u0273\3\2\2\2\u025d\u025e\7(\2\2\u025e"+
		"\u025f\5\30\r\2\u025f\u0260\5L\'\2\u0260\u0261\5H%\2\u0261\u0262\7\65"+
		"\2\2\u0262\u0273\3\2\2\2\u0263\u0264\7(\2\2\u0264\u0265\5\20\t\2\u0265"+
		"\u0266\7\64\2\2\u0266\u0267\5\30\r\2\u0267\u0268\5H%\2\u0268\u0269\7\65"+
		"\2\2\u0269\u0273\3\2\2\2\u026a\u026b\7(\2\2\u026b\u026c\5\20\t\2\u026c"+
		"\u026d\7\64\2\2\u026d\u026e\5\30\r\2\u026e\u026f\5L\'\2\u026f\u0270\5"+
		"H%\2\u0270\u0271\7\65\2\2\u0271\u0273\3\2\2\2\u0272\u0258\3\2\2\2\u0272"+
		"\u025d\3\2\2\2\u0272\u0263\3\2\2\2\u0272\u026a\3\2\2\2\u0273m\3\2\2\2"+
		"\u0274\u0275\5p9\2\u0275\u0276\5r:\2\u0276\u027b\3\2\2\2\u0277\u0278\5"+
		"p9\2\u0278\u0279\5t;\2\u0279\u027b\3\2\2\2\u027a\u0274\3\2\2\2\u027a\u0277"+
		"\3\2\2\2\u027bo\3\2\2\2\u027c\u027d\7\24\2\2\u027d\u027e\7\20\2\2\u027e"+
		"\u027f\5\6\4\2\u027f\u0280\5<\37\2\u0280\u0297\3\2\2\2\u0281\u0282\7\24"+
		"\2\2\u0282\u0283\7\20\2\2\u0283\u0284\5\6\4\2\u0284\u0285\7\35\2\2\u0285"+
		"\u0286\5\2\2\2\u0286\u0287\5<\37\2\u0287\u0297\3\2\2\2\u0288\u0289\7\24"+
		"\2\2\u0289\u028a\7\20\2\2\u028a\u028b\5\6\4\2\u028b\u028c\5@!\2\u028c"+
		"\u028d\5<\37\2\u028d\u0297\3\2\2\2\u028e\u028f\7\24\2\2\u028f\u0290\7"+
		"\20\2\2\u0290\u0291\5\6\4\2\u0291\u0292\7\35\2\2\u0292\u0293\5\2\2\2\u0293"+
		"\u0294\5@!\2\u0294\u0295\5<\37\2\u0295\u0297\3\2\2\2\u0296\u027c\3\2\2"+
		"\2\u0296\u0281\3\2\2\2\u0296\u0288\3\2\2\2\u0296\u028e\3\2\2\2\u0297q"+
		"\3\2\2\2\u0298\u0299\5v<\2\u0299s\3\2\2\2\u029a\u029b\7\30\2\2\u029b\u029c"+
		"\5\30\r\2\u029c\u029d\5H%\2\u029d\u029e\7\65\2\2\u029e\u02a6\3\2\2\2\u029f"+
		"\u02a0\7\30\2\2\u02a0\u02a1\5\30\r\2\u02a1\u02a2\5L\'\2\u02a2\u02a3\5"+
		"H%\2\u02a3\u02a4\7\65\2\2\u02a4\u02a6\3\2\2\2\u02a5\u029a\3\2\2\2\u02a5"+
		"\u029f\3\2\2\2\u02a6u\3\2\2\2\u02a7\u02ab\7\66\2\2\u02a8\u02aa\5x=\2\u02a9"+
		"\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02af\7\67\2\2\u02af"+
		"w\3\2\2\2\u02b0\u02be\5z>\2\u02b1\u02be\5|?\2\u02b2\u02be\5\u0088E\2\u02b3"+
		"\u02be\5\u008eH\2\u02b4\u02be\5\u008aF\2\u02b5\u02be\5\u008cG\2\u02b6"+
		"\u02be\5\u0090I\2\u02b7\u02be\5\u0096L\2\u02b8\u02be\5~@\2\u02b9\u02be"+
		"\5\u0080A\2\u02ba\u02be\5\u0082B\2\u02bb\u02be\5\u0084C\2\u02bc\u02be"+
		"\5\u0086D\2\u02bd\u02b0\3\2\2\2\u02bd\u02b1\3\2\2\2\u02bd\u02b2\3\2\2"+
		"\2\u02bd\u02b3\3\2\2\2\u02bd\u02b4\3\2\2\2\u02bd\u02b5\3\2\2\2\u02bd\u02b6"+
		"\3\2\2\2\u02bd\u02b7\3\2\2\2\u02bd\u02b8\3\2\2\2\u02bd\u02b9\3\2\2\2\u02bd"+
		"\u02ba\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02bey\3\2\2\2"+
		"\u02bf\u02c1\5\u009cO\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\5.\30\2\u02c3\u02c4\7\33\2\2\u02c4\u02c9\5"+
		"\2\2\2\u02c5\u02c6\7\63\2\2\u02c6\u02c8\5\2\2\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2"+
		"\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02cd\7\65\2\2\u02cd{\3\2\2\2\u02ce\u02d0"+
		"\5\u009cO\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2"+
		"\2\u02d1\u02d2\5.\30\2\u02d2\u02d3\7\32\2\2\u02d3\u02d4\7\62\2\2\u02d4"+
		"\u02d5\7\65\2\2\u02d5}\3\2\2\2\u02d6\u02d7\7-\2\2\u02d7\u02d8\7\33\2\2"+
		"\u02d8\u02d9\5\2\2\2\u02d9\u02da\7\65\2\2\u02da\177\3\2\2\2\u02db\u02dc"+
		"\7-\2\2\u02dc\u02dd\7\32\2\2\u02dd\u02de\5\2\2\2\u02de\u02df\7\65\2\2"+
		"\u02df\u0081\3\2\2\2\u02e0\u02e1\5.\30\2\u02e1\u02e2\7*\2\2\u02e2\u02e3"+
		"\5\2\2\2\u02e3\u02e4\7\65\2\2\u02e4\u0083\3\2\2\2\u02e5\u02e6\5.\30\2"+
		"\u02e6\u02e7\7,\2\2\u02e7\u02e8\5\2\2\2\u02e8\u02e9\7\65\2\2\u02e9\u0085"+
		"\3\2\2\2\u02ea\u02eb\7+\2\2\u02eb\u02ec\5\2\2\2\u02ec\u02ed\7\65\2\2\u02ed"+
		"\u0087\3\2\2\2\u02ee\u02f0\5\66\34\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3"+
		"\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\7\34\2\2\u02f2\u02f3\7\35\2\2\u02f3"+
		"\u02f4\5\2\2\2\u02f4\u02f9\5v<\2\u02f5\u02f6\7\36\2\2\u02f6\u02f8\5v<"+
		"\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fa\u0089\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fd\7\37\2\2"+
		"\u02fd\u02fe\5\f\7\2\u02fe\u02ff\5v<\2\u02ff\u008b\3\2\2\2\u0300\u0301"+
		"\7 \2\2\u0301\u0302\5\f\7\2\u0302\u0303\7\65\2\2\u0303\u008d\3\2\2\2\u0304"+
		"\u0305\7!\2\2\u0305\u030a\5v<\2\u0306\u0307\7\"\2\2\u0307\u0309\5v<\2"+
		"\u0308\u0306\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u008f\3\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\7#\2\2\u030e"+
		"\u030f\5\20\t\2\u030f\u0310\7\64\2\2\u0310\u0311\5v<\2\u0311\u0312\7$"+
		"\2\2\u0312\u0316\7\66\2\2\u0313\u0315\5\u0094K\2\u0314\u0313\3\2\2\2\u0315"+
		"\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2"+
		"\2\2\u0318\u0316\3\2\2\2\u0319\u031a\7\67\2\2\u031a\u032b\3\2\2\2\u031b"+
		"\u031c\7#\2\2\u031c\u031d\5\20\t\2\u031d\u031e\7\64\2\2\u031e\u031f\5"+
		"v<\2\u031f\u0320\7$\2\2\u0320\u0321\7\66\2\2\u0321\u0325\5\u0092J\2\u0322"+
		"\u0324\5\u0094K\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323"+
		"\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328"+
		"\u0329\7\67\2\2\u0329\u032b\3\2\2\2\u032a\u030d\3\2\2\2\u032a\u031b\3"+
		"\2\2\2\u032b\u0091\3\2\2\2\u032c\u032d\7&\2\2\u032d\u0332\5X-\2\u032e"+
		"\u032f\7\63\2\2\u032f\u0331\5X-\2\u0330\u032e\3\2\2\2\u0331\u0334\3\2"+
		"\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0335\u0336\7\33\2\2\u0336\u033b\5\2\2\2\u0337\u0338\7"+
		"\63\2\2\u0338\u033a\5\2\2\2\u0339\u0337\3\2\2\2\u033a\u033d\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033b\3\2"+
		"\2\2\u033e\u033f\7\65\2\2\u033f\u0093\3\2\2\2\u0340\u0341\7\'\2\2\u0341"+
		"\u0346\5X-\2\u0342\u0343\7\63\2\2\u0343\u0345\5X-\2\u0344\u0342\3\2\2"+
		"\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349"+
		"\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a\7\32\2\2\u034a\u034b\5\2\2\2"+
		"\u034b\u034c\7\65\2\2\u034c\u0095\3\2\2\2\u034d\u034e\7(\2\2\u034e\u034f"+
		"\5\30\r\2\u034f\u0350\5H%\2\u0350\u0351\7\65\2\2\u0351\u0368\3\2\2\2\u0352"+
		"\u0353\7(\2\2\u0353\u0354\5\30\r\2\u0354\u0355\5L\'\2\u0355\u0356\5H%"+
		"\2\u0356\u0357\7\65\2\2\u0357\u0368\3\2\2\2\u0358\u0359\7(\2\2\u0359\u035a"+
		"\5\20\t\2\u035a\u035b\7\64\2\2\u035b\u035c\5\30\r\2\u035c\u035d\5H%\2"+
		"\u035d\u035e\7\65\2\2\u035e\u0368\3\2\2\2\u035f\u0360\7(\2\2\u0360\u0361"+
		"\5\20\t\2\u0361\u0362\7\64\2\2\u0362\u0363\5\30\r\2\u0363\u0364\5L\'\2"+
		"\u0364\u0365\5H%\2\u0365\u0366\7\65\2\2\u0366\u0368\3\2\2\2\u0367\u034d"+
		"\3\2\2\2\u0367\u0352\3\2\2\2\u0367\u0358\3\2\2\2\u0367\u035f\3\2\2\2\u0368"+
		"\u0097\3\2\2\2\u0369\u036b\7>\2\2\u036a\u0369\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0099\3\2\2\2\u036e"+
		"\u0370\7?\2\2\u036f\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u036f\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u009b\3\2\2\2\u0373\u0374\7\4\2\2\u0374"+
		"\u0375\5\u009eP\2\u0375\u0376\7\5\2\2\u0376\u037e\3\2\2\2\u0377\u0378"+
		"\7\4\2\2\u0378\u0379\5\u009eP\2\u0379\u037a\7\63\2\2\u037a\u037b\5\u00a2"+
		"R\2\u037b\u037c\7\5\2\2\u037c\u037e\3\2\2\2\u037d\u0373\3\2\2\2\u037d"+
		"\u0377\3\2\2\2\u037e\u009d\3\2\2\2\u037f\u0380\7<\2\2\u0380\u0381\5\2"+
		"\2\2\u0381\u0382\7\64\2\2\u0382\u0383\5\u00a0Q\2\u0383\u009f\3\2\2\2\u0384"+
		"\u0385\bQ\1\2\u0385\u039d\7=\2\2\u0386\u0387\5\u0098M\2\u0387\u0388\7"+
		";\2\2\u0388\u0389\5\u009aN\2\u0389\u039d\3\2\2\2\u038a\u038b\5\u0098M"+
		"\2\u038b\u038c\7:\2\2\u038c\u038d\5\u009aN\2\u038d\u039d\3\2\2\2\u038e"+
		"\u038f\5\u0098M\2\u038f\u0390\7\6\2\2\u0390\u0391\5\u009aN\2\u0391\u039d"+
		"\3\2\2\2\u0392\u0393\5\u0098M\2\u0393\u0394\7\7\2\2\u0394\u0395\5\u009a"+
		"N\2\u0395\u039d\3\2\2\2\u0396\u0397\5\u0098M\2\u0397\u0398\7\b\2\2\u0398"+
		"\u0399\5\u009aN\2\u0399\u039d\3\2\2\2\u039a\u039b\7\t\2\2\u039b\u039d"+
		"\5\u00a0Q\5\u039c\u0384\3\2\2\2\u039c\u0386\3\2\2\2\u039c\u038a\3\2\2"+
		"\2\u039c\u038e\3\2\2\2\u039c\u0392\3\2\2\2\u039c\u0396\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039d\u03a6\3\2\2\2\u039e\u039f\f\4\2\2\u039f\u03a0\7\n\2\2\u03a0"+
		"\u03a5\5\u00a0Q\5\u03a1\u03a2\f\3\2\2\u03a2\u03a3\7\13\2\2\u03a3\u03a5"+
		"\5\u00a0Q\4\u03a4\u039e\3\2\2\2\u03a4\u03a1\3\2\2\2\u03a5\u03a8\3\2\2"+
		"\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u00a1\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a9\u03aa\7\f\2\2\u03aa\u03ab\78\2\2\u03ab\u03ac\5\u00a4S\2"+
		"\u03ac\u03ad\79\2\2\u03ad\u00a3\3\2\2\2\u03ae\u03af\bS\1\2\u03af\u03b0"+
		"\5\u0098M\2\u03b0\u03b6\3\2\2\2\u03b1\u03b2\f\3\2\2\u03b2\u03b3\7\63\2"+
		"\2\u03b3\u03b5\5\u0098M\2\u03b4\u03b1\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u00a5\3\2\2\2\u03b8\u03b6\3\2"+
		"\2\2A\u00bf\u00c5\u00c9\u00cd\u00d7\u00dd\u00e3\u00e8\u00f0\u00fc\u010c"+
		"\u012f\u0134\u013b\u0148\u014c\u015b\u0168\u0170\u017e\u0186\u0199\u01a8"+
		"\u01b0\u01ba\u01c2\u01d6\u01df\u01ec\u01f7\u0212\u021c\u022d\u0237\u0245"+
		"\u024a\u0251\u0272\u027a\u0296\u02a5\u02ab\u02bd\u02c0\u02c9\u02cf\u02ef"+
		"\u02f9\u030a\u0316\u0325\u032a\u0332\u033b\u0346\u0367\u036c\u0371\u037d"+
		"\u039c\u03a4\u03a6\u03b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}