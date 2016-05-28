// Generated from /home/tobe/IdeaProjects/rgasm/src/main/antlr4/thosakwe/rgasm/antlr/ASM.g4 by ANTLR 4.5.1
package thosakwe.rgasm.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WS=18, COMMENT=19, COLON=20, COMMA=21, DOT=22, CELL=23, DATA=24, DB=25, 
		END=26, SECTION=27, TEXT=28, INT=29, HEX=30, CHAR=31, STRING=32, ID=33;
	public static final int
		RULE_compilationUnit = 0, RULE_include = 1, RULE_dataSection = 2, RULE_varDeclStmt = 3, 
		RULE_textSection = 4, RULE_stmt = 5, RULE_labelDecl = 6, RULE_callStmt = 7, 
		RULE_clmStmt = 8, RULE_clrStmt = 9, RULE_cmpStmt = 10, RULE_decStmt = 11, 
		RULE_hltStmt = 12, RULE_incStmt = 13, RULE_inputStmt = 14, RULE_jmpStmt = 15, 
		RULE_jnzStmt = 16, RULE_jzStmt = 17, RULE_popStmt = 18, RULE_printStmt = 19, 
		RULE_pushStmt = 20, RULE_rdmemStmt = 21, RULE_retStmt = 22, RULE_expr = 23;
	public static final String[] ruleNames = {
		"compilationUnit", "include", "dataSection", "varDeclStmt", "textSection", 
		"stmt", "labelDecl", "callStmt", "clmStmt", "clrStmt", "cmpStmt", "decStmt", 
		"hltStmt", "incStmt", "inputStmt", "jmpStmt", "jnzStmt", "jzStmt", "popStmt", 
		"printStmt", "pushStmt", "rdmemStmt", "retStmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "'call'", "'clm'", "'clr'", "'cmp'", "'dec'", "'hlt'", 
		"'inc'", "'input'", "'jmp'", "'jnz'", "'jz'", "'pop'", "'print'", "'push'", 
		"'rdmem'", "'ret'", null, null, "':'", "','", "'.'", "'!'", "'.data'", 
		"'db'", "'end'", "'section'", "'.text'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WS", "COMMENT", "COLON", "COMMA", 
		"DOT", "CELL", "DATA", "DB", "END", "SECTION", "TEXT", "INT", "HEX", "CHAR", 
		"STRING", "ID"
	};
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
	public String getGrammarFileName() { return "ASM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public java.util.Map<String, ExprContext> symbols =  new java.util.HashMap();;
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<DataSectionContext> dataSection() {
			return getRuleContexts(DataSectionContext.class);
		}
		public DataSectionContext dataSection(int i) {
			return getRuleContext(DataSectionContext.class,i);
		}
		public List<TextSectionContext> textSection() {
			return getRuleContexts(TextSectionContext.class);
		}
		public TextSectionContext textSection(int i) {
			return getRuleContext(TextSectionContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(48);
				include();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SECTION) {
				{
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(54);
					dataSection();
					}
					break;
				case 2:
					{
					setState(55);
					textSection();
					}
					break;
				}
				}
				setState(60);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ASMParser.STRING, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(STRING);
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

	public static class DataSectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(ASMParser.SECTION, 0); }
		public TerminalNode DATA() { return getToken(ASMParser.DATA, 0); }
		public List<VarDeclStmtContext> varDeclStmt() {
			return getRuleContexts(VarDeclStmtContext.class);
		}
		public VarDeclStmtContext varDeclStmt(int i) {
			return getRuleContext(VarDeclStmtContext.class,i);
		}
		public DataSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterDataSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitDataSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitDataSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSectionContext dataSection() throws RecognitionException {
		DataSectionContext _localctx = new DataSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SECTION);
			setState(65);
			match(DATA);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(66);
				varDeclStmt();
				}
				}
				setState(71);
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

	public static class VarDeclStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASMParser.ID, 0); }
		public TerminalNode DB() { return getToken(ASMParser.DB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterVarDeclStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitVarDeclStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclStmtContext varDeclStmt() throws RecognitionException {
		VarDeclStmtContext _localctx = new VarDeclStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ID);
			setState(73);
			match(DB);
			setState(74);
			expr();
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

	public static class TextSectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(ASMParser.SECTION, 0); }
		public TerminalNode TEXT() { return getToken(ASMParser.TEXT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<LabelDeclContext> labelDecl() {
			return getRuleContexts(LabelDeclContext.class);
		}
		public LabelDeclContext labelDecl(int i) {
			return getRuleContext(LabelDeclContext.class,i);
		}
		public TextSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterTextSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitTextSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitTextSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextSectionContext textSection() throws RecognitionException {
		TextSectionContext _localctx = new TextSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SECTION);
			setState(77);
			match(TEXT);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(80);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
					{
					setState(78);
					stmt();
					}
					break;
				case ID:
					{
					setState(79);
					labelDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
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

	public static class StmtContext extends ParserRuleContext {
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public ClmStmtContext clmStmt() {
			return getRuleContext(ClmStmtContext.class,0);
		}
		public ClrStmtContext clrStmt() {
			return getRuleContext(ClrStmtContext.class,0);
		}
		public CmpStmtContext cmpStmt() {
			return getRuleContext(CmpStmtContext.class,0);
		}
		public DecStmtContext decStmt() {
			return getRuleContext(DecStmtContext.class,0);
		}
		public HltStmtContext hltStmt() {
			return getRuleContext(HltStmtContext.class,0);
		}
		public IncStmtContext incStmt() {
			return getRuleContext(IncStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public JmpStmtContext jmpStmt() {
			return getRuleContext(JmpStmtContext.class,0);
		}
		public JnzStmtContext jnzStmt() {
			return getRuleContext(JnzStmtContext.class,0);
		}
		public JzStmtContext jzStmt() {
			return getRuleContext(JzStmtContext.class,0);
		}
		public PopStmtContext popStmt() {
			return getRuleContext(PopStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public PushStmtContext pushStmt() {
			return getRuleContext(PushStmtContext.class,0);
		}
		public RdmemStmtContext rdmemStmt() {
			return getRuleContext(RdmemStmtContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				callStmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				clmStmt();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				clrStmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				cmpStmt();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				decStmt();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				hltStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				incStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				inputStmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				jmpStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				jnzStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 11);
				{
				setState(95);
				jzStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 12);
				{
				setState(96);
				popStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 13);
				{
				setState(97);
				printStmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 14);
				{
				setState(98);
				pushStmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 15);
				{
				setState(99);
				rdmemStmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 16);
				{
				setState(100);
				retStmt();
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

	public static class LabelDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASMParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ASMParser.COLON, 0); }
		public TerminalNode END() { return getToken(ASMParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public LabelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterLabelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitLabelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitLabelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDeclContext labelDecl() throws RecognitionException {
		LabelDeclContext _localctx = new LabelDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_labelDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(COLON);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				stmt();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) );
			setState(110);
			match(END);
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

	public static class CallStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASMParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASMParser.COMMA, i);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(113);
			match(ID);
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						expr();
						setState(115);
						match(COMMA);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(122);
				expr();
				}
				break;
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

	public static class ClmStmtContext extends ParserRuleContext {
		public ClmStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clmStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterClmStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitClmStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitClmStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClmStmtContext clmStmt() throws RecognitionException {
		ClmStmtContext _localctx = new ClmStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_clmStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__2);
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

	public static class ClrStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClrStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clrStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterClrStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitClrStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitClrStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClrStmtContext clrStmt() throws RecognitionException {
		ClrStmtContext _localctx = new ClrStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clrStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__3);
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(128);
				expr();
				}
				break;
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

	public static class CmpStmtContext extends ParserRuleContext {
		public ExprContext first;
		public ExprContext second;
		public TerminalNode COMMA() { return getToken(ASMParser.COMMA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CmpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterCmpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitCmpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitCmpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpStmtContext cmpStmt() throws RecognitionException {
		CmpStmtContext _localctx = new CmpStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmpStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__4);
			setState(132);
			((CmpStmtContext)_localctx).first = expr();
			setState(133);
			match(COMMA);
			setState(134);
			((CmpStmtContext)_localctx).second = expr();
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

	public static class DecStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecStmtContext decStmt() throws RecognitionException {
		DecStmtContext _localctx = new DecStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__5);
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(137);
				expr();
				}
				break;
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

	public static class HltStmtContext extends ParserRuleContext {
		public HltStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hltStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterHltStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitHltStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitHltStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HltStmtContext hltStmt() throws RecognitionException {
		HltStmtContext _localctx = new HltStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hltStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__6);
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

	public static class IncStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterIncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitIncStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitIncStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncStmtContext incStmt() throws RecognitionException {
		IncStmtContext _localctx = new IncStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_incStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__7);
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(143);
				expr();
				}
				break;
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

	public static class InputStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__8);
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(147);
				expr();
				}
				break;
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

	public static class JmpStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JmpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jmpStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterJmpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitJmpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitJmpStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JmpStmtContext jmpStmt() throws RecognitionException {
		JmpStmtContext _localctx = new JmpStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jmpStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__9);
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(151);
				expr();
				}
				break;
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

	public static class JnzStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JnzStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jnzStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterJnzStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitJnzStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitJnzStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JnzStmtContext jnzStmt() throws RecognitionException {
		JnzStmtContext _localctx = new JnzStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jnzStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__10);
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(155);
				expr();
				}
				break;
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

	public static class JzStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public JzStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jzStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterJzStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitJzStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitJzStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JzStmtContext jzStmt() throws RecognitionException {
		JzStmtContext _localctx = new JzStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jzStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__11);
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(159);
				expr();
				}
				break;
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

	public static class PopStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_popStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterPopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitPopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitPopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopStmtContext popStmt() throws RecognitionException {
		PopStmtContext _localctx = new PopStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_popStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__12);
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(163);
				expr();
				}
				break;
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

	public static class PrintStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__13);
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(167);
				expr();
				}
				break;
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

	public static class PushStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PushStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterPushStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitPushStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitPushStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushStmtContext pushStmt() throws RecognitionException {
		PushStmtContext _localctx = new PushStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pushStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__14);
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(171);
				expr();
				}
				break;
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

	public static class RdmemStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RdmemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rdmemStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterRdmemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitRdmemStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitRdmemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdmemStmtContext rdmemStmt() throws RecognitionException {
		RdmemStmtContext _localctx = new RdmemStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rdmemStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__15);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(175);
				expr();
				}
				break;
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

	public static class RetStmtContext extends ParserRuleContext {
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitRetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_retStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__16);
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

	public static class ExprContext extends ParserRuleContext {
		public Boolean isStatic =  true;;
		public TerminalNode CELL() { return getToken(ASMParser.CELL, 0); }
		public TerminalNode ID() { return getToken(ASMParser.ID, 0); }
		public TerminalNode INT() { return getToken(ASMParser.INT, 0); }
		public TerminalNode HEX() { return getToken(ASMParser.HEX, 0); }
		public TerminalNode CHAR() { return getToken(ASMParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ASMParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASMListener ) ((ASMListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ASMVisitor ) return ((ASMVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CELL) | (1L << INT) | (1L << HEX) | (1L << CHAR) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\7\6S\n\6\f\6\16\6V\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\6\bm\n\b\r\b\16\bn\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\5\t~\n\t\3\n\3\n\3\13"+
		"\3\13\5\13\u0084\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u008d\n\r\3\16\3"+
		"\16\3\17\3\17\5\17\u0093\n\17\3\20\3\20\5\20\u0097\n\20\3\21\3\21\5\21"+
		"\u009b\n\21\3\22\3\22\5\22\u009f\n\22\3\23\3\23\5\23\u00a3\n\23\3\24\3"+
		"\24\5\24\u00a7\n\24\3\25\3\25\5\25\u00ab\n\25\3\26\3\26\5\26\u00af\n\26"+
		"\3\27\3\27\5\27\u00b3\n\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\4\2\31\31\37#\u00c3\2\65\3"+
		"\2\2\2\4?\3\2\2\2\6B\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\fg\3\2\2\2\16i\3\2"+
		"\2\2\20r\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2\26\u0085\3\2\2\2\30\u008a"+
		"\3\2\2\2\32\u008e\3\2\2\2\34\u0090\3\2\2\2\36\u0094\3\2\2\2 \u0098\3\2"+
		"\2\2\"\u009c\3\2\2\2$\u00a0\3\2\2\2&\u00a4\3\2\2\2(\u00a8\3\2\2\2*\u00ac"+
		"\3\2\2\2,\u00b0\3\2\2\2.\u00b4\3\2\2\2\60\u00b6\3\2\2\2\62\64\5\4\3\2"+
		"\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66<\3\2\2\2\67"+
		"\65\3\2\2\28;\5\6\4\29;\5\n\6\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?@\7\3\2\2@A\7\"\2\2A\5\3\2\2\2BC\7\35"+
		"\2\2CG\7\32\2\2DF\5\b\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3"+
		"\2\2\2IG\3\2\2\2JK\7#\2\2KL\7\33\2\2LM\5\60\31\2M\t\3\2\2\2NO\7\35\2\2"+
		"OT\7\36\2\2PS\5\f\7\2QS\5\16\b\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2U\13\3\2\2\2VT\3\2\2\2Wh\5\20\t\2Xh\5\22\n\2Yh\5\24\13\2Z"+
		"h\5\26\f\2[h\5\30\r\2\\h\5\32\16\2]h\5\34\17\2^h\5\36\20\2_h\5 \21\2`"+
		"h\5\"\22\2ah\5$\23\2bh\5&\24\2ch\5(\25\2dh\5*\26\2eh\5,\27\2fh\5.\30\2"+
		"gW\3\2\2\2gX\3\2\2\2gY\3\2\2\2gZ\3\2\2\2g[\3\2\2\2g\\\3\2\2\2g]\3\2\2"+
		"\2g^\3\2\2\2g_\3\2\2\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2"+
		"\2ge\3\2\2\2gf\3\2\2\2h\r\3\2\2\2ij\7#\2\2jl\7\26\2\2km\5\f\7\2lk\3\2"+
		"\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\34\2\2q\17\3\2\2\2rs"+
		"\7\4\2\2s}\7#\2\2tu\5\60\31\2uv\7\27\2\2vx\3\2\2\2wt\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|~\5\60\31\2}y\3\2\2\2}~\3\2\2"+
		"\2~\21\3\2\2\2\177\u0080\7\5\2\2\u0080\23\3\2\2\2\u0081\u0083\7\6\2\2"+
		"\u0082\u0084\5\60\31\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25"+
		"\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0087\5\60\31\2\u0087\u0088\7\27\2"+
		"\2\u0088\u0089\5\60\31\2\u0089\27\3\2\2\2\u008a\u008c\7\b\2\2\u008b\u008d"+
		"\5\60\31\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\31\3\2\2\2\u008e"+
		"\u008f\7\t\2\2\u008f\33\3\2\2\2\u0090\u0092\7\n\2\2\u0091\u0093\5\60\31"+
		"\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\35\3\2\2\2\u0094\u0096"+
		"\7\13\2\2\u0095\u0097\5\60\31\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\37\3\2\2\2\u0098\u009a\7\f\2\2\u0099\u009b\5\60\31\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b!\3\2\2\2\u009c\u009e\7\r\2\2\u009d"+
		"\u009f\5\60\31\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f#\3\2\2"+
		"\2\u00a0\u00a2\7\16\2\2\u00a1\u00a3\5\60\31\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3%\3\2\2\2\u00a4\u00a6\7\17\2\2\u00a5\u00a7\5\60\31"+
		"\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\'\3\2\2\2\u00a8\u00aa"+
		"\7\20\2\2\u00a9\u00ab\5\60\31\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2"+
		"\2\u00ab)\3\2\2\2\u00ac\u00ae\7\21\2\2\u00ad\u00af\5\60\31\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af+\3\2\2\2\u00b0\u00b2\7\22\2\2\u00b1"+
		"\u00b3\5\60\31\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3-\3\2\2"+
		"\2\u00b4\u00b5\7\23\2\2\u00b5/\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\61\3"+
		"\2\2\2\27\65:<GRTgny}\u0083\u008c\u0092\u0096\u009a\u009e\u00a2\u00a6"+
		"\u00aa\u00ae\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}