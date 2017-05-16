package ath.haitham;// Generated from temp_compilers/Micro.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		KEYWORD=32, IDENTIFIER=33, INTLITERAL=34, FLOATLITERAL=35, STRINGLITERAL=36, 
		COMMENT=37, OPERATOR=38, WS=39;
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl = 4, 
		RULE_str = 5, RULE_var_decl = 6, RULE_var_type = 7, RULE_any_type = 8, 
		RULE_id_list = 9, RULE_id_tail = 10, RULE_param_decl_list = 11, RULE_param_decl = 12, 
		RULE_param_decl_tail = 13, RULE_func_declarations = 14, RULE_func_decl = 15, 
		RULE_func_body = 16, RULE_stmt_list = 17, RULE_stmt = 18, RULE_basic_stmt = 19, 
		RULE_assign_stmt = 20, RULE_assign_expr = 21, RULE_read_stmt = 22, RULE_write_stmt = 23, 
		RULE_return_stmt = 24, RULE_if_stmt = 25, RULE_else_part = 26, RULE_cond = 27, 
		RULE_compare = 28, RULE_for_stmt = 29, RULE_init_expr = 30, RULE_incr_expr = 31, 
		RULE_expr = 32, RULE_expr_prefix = 33, RULE_term = 34, RULE_factor_prefix = 35, 
		RULE_factor = 36, RULE_primary = 37, RULE_call_expr = 38, RULE_expr_list = 39, 
		RULE_expr_list_tail = 40, RULE_addop = 41, RULE_mulop = 42;
	public static final String[] ruleNames = {
		"program", "id", "pgm_body", "decl", "string_decl", "str", "var_decl", 
		"var_type", "any_type", "id_list", "id_tail", "param_decl_list", "param_decl", 
		"param_decl_tail", "func_declarations", "func_decl", "func_body", "stmt_list", 
		"stmt", "basic_stmt", "assign_stmt", "assign_expr", "read_stmt", "write_stmt", 
		"return_stmt", "if_stmt", "else_part", "cond", "compare", "for_stmt", 
		"init_expr", "incr_expr", "expr", "expr_prefix", "term", "factor_prefix", 
		"factor", "primary", "call_expr", "expr_list", "expr_list_tail", "addop", 
		"mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "';'", "'FLOAT'", 
		"'INT'", "'VOID'", "','", "'FUNCTION'", "'('", "')'", "'READ'", "'WRITE'", 
		"'RETURN'", "'IF'", "'ENDIF'", "'ELSE'", "'='", "'!='", "'<='", "'>='", 
		"'<'", "'>'", "'FOR'", "'ENDFOR'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "KEYWORD", "IDENTIFIER", 
		"INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "OPERATOR", 
		"WS"
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
	public String getGrammarFileName() { return "Micro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(87);
			id();
			setState(88);
			match(T__1);
			setState(89);
			pgm_body();
			setState(90);
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

	public static class IdContext extends ParserRuleContext {
		public Token var_name;
		public TerminalNode IDENTIFIER() { return getToken(MicroParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((IdContext)_localctx).var_name = match(IDENTIFIER);
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

	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitPgm_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			decl();
			setState(95);
			func_declarations();
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

	public static class DeclContext extends ParserRuleContext {
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				string_decl();
				setState(98);
				decl();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				var_decl();
				setState(101);
				decl();
				}
				break;
			case T__2:
			case T__10:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__25:
			case T__26:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class String_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitString_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__3);
			setState(107);
			id();
			setState(108);
			match(T__4);
			setState(109);
			str();
			setState(110);
			match(T__5);
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

	public static class StrContext extends ParserRuleContext {
		public Token str_val;
		public TerminalNode STRINGLITERAL() { return getToken(MicroParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((StrContext)_localctx).str_val = match(STRINGLITERAL);
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			var_type();
			setState(115);
			id_list();
			setState(116);
			match(T__5);
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

	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	 
		public Var_typeContext() { }
		public void copyFrom(Var_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDeclarationContext extends Var_typeContext {
		public IntDeclarationContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatDeclarationContext extends Var_typeContext {
		public FloatDeclarationContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFloatDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_type);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new FloatDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__7);
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

	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAny_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_any_type);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__8);
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				var_type();
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

	public static class Id_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			id();
			setState(127);
			id_tail();
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

	public static class Id_tailContext extends ParserRuleContext {
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
	 
		public Id_tailContext() { }
		public void copyFrom(Id_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExistId_tailContext extends Id_tailContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public ExistId_tailContext(Id_tailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExistId_tail(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoId_tailContext extends Id_tailContext {
		public NoId_tailContext(Id_tailContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitNoId_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_tail);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new ExistId_tailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__9);
				setState(130);
				id();
				setState(131);
				id_tail();
				}
				break;
			case T__5:
			case T__12:
				_localctx = new NoId_tailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitParam_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param_decl_list);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				param_decl();
				setState(137);
				param_decl_tail();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			var_type();
			setState(143);
			id();
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

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitParam_decl_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_tail);
		try {
			setState(150);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__9);
				setState(146);
				param_decl();
				setState(147);
				param_decl_tail();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunc_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_declarations);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				func_decl();
				setState(153);
				func_declarations();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declContext extends ParserRuleContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__10);
			setState(159);
			any_type();
			setState(160);
			id();
			setState(161);
			match(T__11);
			setState(162);
			param_decl_list();
			setState(163);
			match(T__12);
			setState(164);
			match(T__1);
			setState(165);
			func_body();
			setState(166);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			decl();
			setState(169);
			stmt_list();
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

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt_list);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__25:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				stmt();
				setState(172);
				stmt_list();
				}
				break;
			case T__2:
			case T__17:
			case T__18:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StmtContext extends ParserRuleContext {
		public Basic_stmtContext basic_stmt() {
			return getRuleContext(Basic_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				basic_stmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				if_stmt();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				for_stmt();
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

	public static class Basic_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Basic_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitBasic_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_stmtContext basic_stmt() throws RecognitionException {
		Basic_stmtContext _localctx = new Basic_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_basic_stmt);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				assign_stmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				read_stmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				write_stmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				return_stmt();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			assign_expr();
			setState(189);
			match(T__5);
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

	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			id();
			setState(192);
			match(T__4);
			setState(193);
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

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__13);
			setState(196);
			match(T__11);
			setState(197);
			id_list();
			setState(198);
			match(T__12);
			setState(199);
			match(T__5);
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

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__14);
			setState(202);
			match(T__11);
			setState(203);
			id_list();
			setState(204);
			match(T__12);
			setState(205);
			match(T__5);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__15);
			setState(208);
			expr();
			setState(209);
			match(T__5);
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

	public static class If_stmtContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__16);
			setState(212);
			match(T__11);
			setState(213);
			cond();
			setState(214);
			match(T__12);
			setState(215);
			decl();
			setState(216);
			stmt_list();
			setState(217);
			else_part();
			setState(218);
			match(T__17);
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

	public static class Else_partContext extends ParserRuleContext {
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
	 
		public Else_partContext() { }
		public void copyFrom(Else_partContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoElseContext extends Else_partContext {
		public NoElseContext(Else_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitNoElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistElseContext extends Else_partContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public ExistElseContext(Else_partContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExistElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_part);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new ExistElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__18);
				setState(221);
				decl();
				setState(222);
				stmt_list();
				}
				break;
			case T__17:
				_localctx = new NoElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expr();
			setState(228);
			compare();
			setState(229);
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

	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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

	public static class For_stmtContext extends ParserRuleContext {
		public Init_exprContext init_expr() {
			return getRuleContext(Init_exprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Incr_exprContext incr_expr() {
			return getRuleContext(Incr_exprContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__25);
			setState(234);
			match(T__11);
			setState(235);
			init_expr();
			setState(236);
			match(T__5);
			setState(237);
			cond();
			setState(238);
			match(T__5);
			setState(239);
			incr_expr();
			setState(240);
			match(T__12);
			setState(241);
			decl();
			setState(242);
			stmt_list();
			setState(243);
			match(T__26);
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

	public static class Init_exprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Init_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitInit_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_exprContext init_expr() throws RecognitionException {
		Init_exprContext _localctx = new Init_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_init_expr);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				assign_expr();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Incr_exprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Incr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incr_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitIncr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Incr_exprContext incr_expr() throws RecognitionException {
		Incr_exprContext _localctx = new Incr_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_incr_expr);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				assign_expr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExprContext extends ParserRuleContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			expr_prefix(0);
			setState(254);
			term();
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

	public static class Expr_prefixContext extends ParserRuleContext {
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prefix; }
	 
		public Expr_prefixContext() { }
		public void copyFrom(Expr_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPrefixContext extends Expr_prefixContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public ExprPrefixContext(Expr_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExprPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyExprPrefixContext extends Expr_prefixContext {
		public EmptyExprPrefixContext(Expr_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitEmptyExprPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		return expr_prefix(0);
	}

	private Expr_prefixContext expr_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, _parentState);
		Expr_prefixContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EmptyExprPrefixContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprPrefixContext(new Expr_prefixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr_prefix);
					setState(257);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(258);
					term();
					setState(259);
					addop();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			factor_prefix(0);
			setState(267);
			factor();
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

	public static class Factor_prefixContext extends ParserRuleContext {
		public Factor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_prefix; }
	 
		public Factor_prefixContext() { }
		public void copyFrom(Factor_prefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoFPrefixContext extends Factor_prefixContext {
		public NoFPrefixContext(Factor_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitNoFPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FPrefixContext extends Factor_prefixContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public FPrefixContext(Factor_prefixContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_prefixContext factor_prefix() throws RecognitionException {
		return factor_prefix(0);
	}

	private Factor_prefixContext factor_prefix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Factor_prefixContext _localctx = new Factor_prefixContext(_ctx, _parentState);
		Factor_prefixContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_factor_prefix, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NoFPrefixContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FPrefixContext(new Factor_prefixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_factor_prefix);
					setState(270);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(271);
					factor();
					setState(272);
					mulop();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorCallContext extends FactorContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public FactorCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFactorCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorPrimaryContext extends FactorContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FactorPrimaryContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitFactorPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FactorPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				primary();
				}
				break;
			case 2:
				_localctx = new FactorCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				call_expr();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExprContext extends PrimaryContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrimaryExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryFloatContext extends PrimaryContext {
		public Token operand;
		public TerminalNode FLOATLITERAL() { return getToken(MicroParser.FLOATLITERAL, 0); }
		public PrimaryFloatContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitPrimaryFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryIdContext extends PrimaryContext {
		public IdContext operand;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PrimaryIdContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitPrimaryId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryIntContext extends PrimaryContext {
		public Token operand;
		public TerminalNode INTLITERAL() { return getToken(MicroParser.INTLITERAL, 0); }
		public PrimaryIntContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitPrimaryInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primary);
		try {
			setState(290);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new PrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__11);
				setState(284);
				expr();
				setState(285);
				match(T__12);
				}
				break;
			case IDENTIFIER:
				_localctx = new PrimaryIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((PrimaryIdContext)_localctx).operand = id();
				}
				break;
			case INTLITERAL:
				_localctx = new PrimaryIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((PrimaryIntContext)_localctx).operand = match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				_localctx = new PrimaryFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				((PrimaryFloatContext)_localctx).operand = match(FLOATLITERAL);
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

	public static class Call_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_call_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			id();
			setState(293);
			match(T__11);
			setState(294);
			expr_list();
			setState(295);
			match(T__12);
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

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr_list);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				expr();
				setState(298);
				expr_list_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitExpr_list_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_list_tail);
		try {
			setState(308);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__9);
				setState(304);
				expr();
				setState(305);
				expr_list_tail();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroVisitor ) return ((MicroVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expr_prefix_sempred((Expr_prefixContext)_localctx, predIndex);
		case 35:
			return factor_prefix_sempred((Factor_prefixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_prefix_sempred(Expr_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean factor_prefix_sempred(Factor_prefixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\5\t{\n\t\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0089\n\f\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0099\n\17\3\20\3\20\3\20\3\20\5\20\u009f\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\24\5\24\u00b7\n\24\3\25\3\25\3\25"+
		"\3\25\5\25\u00bd\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00e4\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \5 \u00fa\n \3!\3!\5!\u00fe\n!\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\7#\u0108\n#\f#\16#\u010b\13#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\7%\u0115\n%\f%\16%\u0118\13%\3&\3&\5&\u011c\n&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u0125\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\5)\u0130\n)\3*\3"+
		"*\3*\3*\3*\5*\u0137\n*\3+\3+\3,\3,\3,\2\4DH-\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5\3\2\26\33\3\2\36"+
		"\37\3\2 !\u012a\2X\3\2\2\2\4^\3\2\2\2\6`\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2"+
		"\fr\3\2\2\2\16t\3\2\2\2\20z\3\2\2\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u0088"+
		"\3\2\2\2\30\u008e\3\2\2\2\32\u0090\3\2\2\2\34\u0098\3\2\2\2\36\u009e\3"+
		"\2\2\2 \u00a0\3\2\2\2\"\u00aa\3\2\2\2$\u00b1\3\2\2\2&\u00b6\3\2\2\2(\u00bc"+
		"\3\2\2\2*\u00be\3\2\2\2,\u00c1\3\2\2\2.\u00c5\3\2\2\2\60\u00cb\3\2\2\2"+
		"\62\u00d1\3\2\2\2\64\u00d5\3\2\2\2\66\u00e3\3\2\2\28\u00e5\3\2\2\2:\u00e9"+
		"\3\2\2\2<\u00eb\3\2\2\2>\u00f9\3\2\2\2@\u00fd\3\2\2\2B\u00ff\3\2\2\2D"+
		"\u0102\3\2\2\2F\u010c\3\2\2\2H\u010f\3\2\2\2J\u011b\3\2\2\2L\u0124\3\2"+
		"\2\2N\u0126\3\2\2\2P\u012f\3\2\2\2R\u0136\3\2\2\2T\u0138\3\2\2\2V\u013a"+
		"\3\2\2\2XY\7\3\2\2YZ\5\4\3\2Z[\7\4\2\2[\\\5\6\4\2\\]\7\5\2\2]\3\3\2\2"+
		"\2^_\7#\2\2_\5\3\2\2\2`a\5\b\5\2ab\5\36\20\2b\7\3\2\2\2cd\5\n\6\2de\5"+
		"\b\5\2ek\3\2\2\2fg\5\16\b\2gh\5\b\5\2hk\3\2\2\2ik\3\2\2\2jc\3\2\2\2jf"+
		"\3\2\2\2ji\3\2\2\2k\t\3\2\2\2lm\7\6\2\2mn\5\4\3\2no\7\7\2\2op\5\f\7\2"+
		"pq\7\b\2\2q\13\3\2\2\2rs\7&\2\2s\r\3\2\2\2tu\5\20\t\2uv\5\24\13\2vw\7"+
		"\b\2\2w\17\3\2\2\2x{\7\t\2\2y{\7\n\2\2zx\3\2\2\2zy\3\2\2\2{\21\3\2\2\2"+
		"|\177\7\13\2\2}\177\5\20\t\2~|\3\2\2\2~}\3\2\2\2\177\23\3\2\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\u0082\5\26\f\2\u0082\25\3\2\2\2\u0083\u0084\7\f\2"+
		"\2\u0084\u0085\5\4\3\2\u0085\u0086\5\26\f\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2\2\u0089\27\3\2\2"+
		"\2\u008a\u008b\5\32\16\2\u008b\u008c\5\34\17\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2\2\2\u008f\31\3\2\2"+
		"\2\u0090\u0091\5\20\t\2\u0091\u0092\5\4\3\2\u0092\33\3\2\2\2\u0093\u0094"+
		"\7\f\2\2\u0094\u0095\5\32\16\2\u0095\u0096\5\34\17\2\u0096\u0099\3\2\2"+
		"\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099\35"+
		"\3\2\2\2\u009a\u009b\5 \21\2\u009b\u009c\5\36\20\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009f\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009d\3\2\2\2\u009f\37"+
		"\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\5\4\3\2"+
		"\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7\17\2\2\u00a6"+
		"\u00a7\7\4\2\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\7\5\2\2\u00a9!\3\2\2\2"+
		"\u00aa\u00ab\5\b\5\2\u00ab\u00ac\5$\23\2\u00ac#\3\2\2\2\u00ad\u00ae\5"+
		"&\24\2\u00ae\u00af\5$\23\2\u00af\u00b2\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2%\3\2\2\2\u00b3\u00b7\5(\25\2"+
		"\u00b4\u00b7\5\64\33\2\u00b5\u00b7\5<\37\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\'\3\2\2\2\u00b8\u00bd\5*\26\2\u00b9"+
		"\u00bd\5.\30\2\u00ba\u00bd\5\60\31\2\u00bb\u00bd\5\62\32\2\u00bc\u00b8"+
		"\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		")\3\2\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0\7\b\2\2\u00c0+\3\2\2\2\u00c1"+
		"\u00c2\5\4\3\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\5B\"\2\u00c4-\3\2\2\2\u00c5"+
		"\u00c6\7\20\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9"+
		"\7\17\2\2\u00c9\u00ca\7\b\2\2\u00ca/\3\2\2\2\u00cb\u00cc\7\21\2\2\u00cc"+
		"\u00cd\7\16\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0"+
		"\7\b\2\2\u00d0\61\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5B\"\2\u00d3"+
		"\u00d4\7\b\2\2\u00d4\63\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7\7\16"+
		"\2\2\u00d7\u00d8\58\35\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\5\b\5\2\u00da"+
		"\u00db\5$\23\2\u00db\u00dc\5\66\34\2\u00dc\u00dd\7\24\2\2\u00dd\65\3\2"+
		"\2\2\u00de\u00df\7\25\2\2\u00df\u00e0\5\b\5\2\u00e0\u00e1\5$\23\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e4\67\3\2\2\2\u00e5\u00e6\5B\"\2\u00e6\u00e7\5:\36\2\u00e7\u00e8"+
		"\5B\"\2\u00e89\3\2\2\2\u00e9\u00ea\t\2\2\2\u00ea;\3\2\2\2\u00eb\u00ec"+
		"\7\34\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5> \2\u00ee\u00ef\7\b\2\2\u00ef"+
		"\u00f0\58\35\2\u00f0\u00f1\7\b\2\2\u00f1\u00f2\5@!\2\u00f2\u00f3\7\17"+
		"\2\2\u00f3\u00f4\5\b\5\2\u00f4\u00f5\5$\23\2\u00f5\u00f6\7\35\2\2\u00f6"+
		"=\3\2\2\2\u00f7\u00fa\5,\27\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa?\3\2\2\2\u00fb\u00fe\5,\27\2\u00fc\u00fe\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00feA\3\2\2\2\u00ff\u0100"+
		"\5D#\2\u0100\u0101\5F$\2\u0101C\3\2\2\2\u0102\u0109\b#\1\2\u0103\u0104"+
		"\f\4\2\2\u0104\u0105\5F$\2\u0105\u0106\5T+\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0103\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010aE\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\5H%\2\u010d\u010e"+
		"\5J&\2\u010eG\3\2\2\2\u010f\u0116\b%\1\2\u0110\u0111\f\4\2\2\u0111\u0112"+
		"\5J&\2\u0112\u0113\5V,\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117I\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0119\u011c\5L\'\2\u011a\u011c\5N(\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011cK\3\2\2\2\u011d\u011e\7\16\2\2\u011e"+
		"\u011f\5B\"\2\u011f\u0120\7\17\2\2\u0120\u0125\3\2\2\2\u0121\u0125\5\4"+
		"\3\2\u0122\u0125\7$\2\2\u0123\u0125\7%\2\2\u0124\u011d\3\2\2\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125M\3\2\2\2\u0126"+
		"\u0127\5\4\3\2\u0127\u0128\7\16\2\2\u0128\u0129\5P)\2\u0129\u012a\7\17"+
		"\2\2\u012aO\3\2\2\2\u012b\u012c\5B\"\2\u012c\u012d\5R*\2\u012d\u0130\3"+
		"\2\2\2\u012e\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"Q\3\2\2\2\u0131\u0132\7\f\2\2\u0132\u0133\5B\"\2\u0133\u0134\5R*\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0135\3\2"+
		"\2\2\u0137S\3\2\2\2\u0138\u0139\t\3\2\2\u0139U\3\2\2\2\u013a\u013b\t\4"+
		"\2\2\u013bW\3\2\2\2\25jz~\u0088\u008e\u0098\u009e\u00b1\u00b6\u00bc\u00e3"+
		"\u00f9\u00fd\u0109\u0116\u011b\u0124\u012f\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}