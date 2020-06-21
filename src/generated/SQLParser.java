// Generated from C:/Users/SCC/Desktop/antlrTest/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SCOL=12, DOT=13, OPEN_PAR=14, CLOSE_PAR=15, COMMA=16, 
		ASSIGN=17, STAR=18, PLUS=19, MINUS=20, TILDE=21, PIPE2=22, DIV=23, MOD=24, 
		LT2=25, GT2=26, AMP=27, AMP2=28, PIPE=29, LT=30, LT_EQ=31, GT=32, GT_EQ=33, 
		EQ=34, NOT_EQ1=35, NOT_EQ2=36, SMALL_LP=37, SMALL_RP=38, ARRAY_BRACKET=39, 
		ELEMENT_OF_ARRAY=40, ARRAY_BRACKET_WITH_INDEX=41, K_ABORT=42, K_ACTION=43, 
		K_ADD=44, K_AFTER=45, K_ALL=46, K_ALTER=47, K_ANALYZE=48, K_AND=49, K_AS=50, 
		K_ASC=51, K_ATTACH=52, K_AUTOINCREMENT=53, K_BEFORE=54, K_BEGIN=55, K_BETWEEN=56, 
		K_BY=57, K_CASCADE=58, K_CASE=59, K_CAST=60, K_CHECK=61, K_COLLATE=62, 
		K_COLUMN=63, K_COMMIT=64, K_CONFLICT=65, K_CONSTRAINT=66, K_CREATE=67, 
		K_CROSS=68, K_CURRENT_DATE=69, K_CURRENT_TIME=70, K_CURRENT_TIMESTAMP=71, 
		K_DATABASE=72, K_DEFAULT=73, K_DEFERRABLE=74, K_DEFERRED=75, K_DELETE=76, 
		K_DESC=77, K_DETACH=78, K_DISTINCT=79, K_DROP=80, K_EACH=81, K_ELSE=82, 
		K_END=83, K_ENABLE=84, K_ESCAPE=85, K_EXCEPT=86, K_EXCLUSIVE=87, K_EXISTS=88, 
		K_EXPLAIN=89, K_FAIL=90, K_FOR=91, K_FOREIGN=92, K_FROM=93, K_FULL=94, 
		K_GLOB=95, K_GROUP=96, K_HAVING=97, K_IF=98, K_IGNORE=99, K_IMMEDIATE=100, 
		K_IN=101, K_INDEX=102, K_INDEXED=103, K_INITIALLY=104, K_INNER=105, K_INSERT=106, 
		K_INSTEAD=107, K_INTERSECT=108, K_INTO=109, K_IS=110, K_ISNULL=111, K_JOIN=112, 
		K_KEY=113, K_LEFT=114, K_LIKE=115, K_LIMIT=116, K_MATCH=117, K_NATURAL=118, 
		K_NEXTVAL=119, K_NO=120, K_NOT=121, K_NOTNULL=122, K_NULL=123, K_OF=124, 
		K_OFFSET=125, K_ON=126, K_ONLY=127, K_OR=128, K_ORDER=129, K_OUTER=130, 
		K_PLAN=131, K_PRAGMA=132, K_PRIMARY=133, K_QUERY=134, K_RAISE=135, K_RECURSIVE=136, 
		K_REFERENCES=137, K_REGEXP=138, K_REINDEX=139, K_RELEASE=140, K_RENAME=141, 
		K_REPLACE=142, K_RESTRICT=143, K_RIGHT=144, K_ROLLBACK=145, K_ROW=146, 
		K_SAVEPOINT=147, K_SELECT=148, K_SET=149, K_TABLE=150, K_TEMP=151, K_TEMPORARY=152, 
		K_THEN=153, K_TO=154, K_TRANSACTION=155, K_TRIGGER=156, K_UNION=157, K_UNIQUE=158, 
		K_UPDATE=159, K_USING=160, K_VACUUM=161, K_VALUES=162, K_VIEW=163, K_VIRTUAL=164, 
		K_WHEN=165, K_WHERE=166, K_WITH=167, K_WITHOUT=168, K_VAR=169, K_MYIF=170, 
		K_MYELSE=171, K_WHILE=172, K_RETURN=173, K_TRY=174, K_CATCH=175, K_FINALLY=176, 
		K_SWITCH=177, K_BREAK=178, K_DO=179, K_CONTINUE=180, K_PRINT=181, K_FUNCTION=182, 
		K_FALSE=183, K_TRUE=184, IDENTIFIER=185, NUMERIC_LITERAL=186, BIND_PARAMETER=187, 
		STRING_LITERAL=188, BLOB_LITERAL=189, MULTILINE_COMMENT=190, SPACES=191, 
		UNEXPECTED_CHAR=192;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_alter_table_add_constraint = 5, RULE_alter_table_add = 6, 
		RULE_create_table_stmt = 7, RULE_delete_stmt = 8, RULE_drop_table_stmt = 9, 
		RULE_factored_select_stmt = 10, RULE_insert_stmt = 11, RULE_select_stmt = 12, 
		RULE_select_or_values = 13, RULE_update_stmt = 14, RULE_assignment_query_to_var = 15, 
		RULE_func_statment_list = 16, RULE_func_statment = 17, RULE_prototype_func = 18, 
		RULE_parameter_list_without_values = 19, RULE_parameter_list_with_values = 20, 
		RULE_parameter_list_mix = 21, RULE_block_of_stms = 22, RULE_all_stm = 23, 
		RULE_if_stm = 24, RULE_compare_element_array = 25, RULE_else_if = 26, 
		RULE_else_stm = 27, RULE_while_stm = 28, RULE_do_while_stm = 29, RULE_for_stm = 30, 
		RULE_first_sec = 31, RULE_second_sec = 32, RULE_third_sec = 33, RULE_for_each_stm = 34, 
		RULE_try_catch_stm = 35, RULE_one_line_cond = 36, RULE_array_one_dimension = 37, 
		RULE_contents_of_array = 38, RULE_initialize_array_element = 39, RULE_switch_stm = 40, 
		RULE_case_part = 41, RULE_default_part = 42, RULE_break_stm = 43, RULE_continue_stm = 44, 
		RULE_func_call = 45, RULE_argument = 46, RULE_print_stm = 47, RULE_higher_order_func = 48, 
		RULE_json_stmt = 49, RULE_json_body = 50, RULE_value_of_property = 51, 
		RULE_increment = 52, RULE_decrement = 53, RULE_read_property_json = 54, 
		RULE_assignment_value_to_property_json = 55, RULE_declare_variable = 56, 
		RULE_initialize_variable = 57, RULE_return_stm = 58, RULE_column_def = 59, 
		RULE_type_name = 60, RULE_column_constraint = 61, RULE_column_constraint_primary_key = 62, 
		RULE_column_constraint_foreign_key = 63, RULE_column_constraint_not_null = 64, 
		RULE_column_constraint_null = 65, RULE_column_default = 66, RULE_column_default_value = 67, 
		RULE_next_val = 68, RULE_any_name_colon = 69, RULE_expr = 70, RULE_bd_table_column_name = 71, 
		RULE_unary_expr = 72, RULE_call_function_in_expr = 73, RULE_expr_enclose_with_brackets = 74, 
		RULE_select_enclose_with_brackets = 75, RULE_foreign_key_clause = 76, 
		RULE_on_sectin_or_matchName = 77, RULE_on_sectin = 78, RULE_match_name = 79, 
		RULE_fk_target_column_name = 80, RULE_indexed_column = 81, RULE_table_constraint = 82, 
		RULE_table_constraint_primary_key = 83, RULE_table_constraint_foreign_key = 84, 
		RULE_table_constraint_unique = 85, RULE_table_constraint_key = 86, RULE_fk_origin_column_name = 87, 
		RULE_qualified_table_name = 88, RULE_ordering_term = 89, RULE_pragma_value = 90, 
		RULE_common_table_expression = 91, RULE_result_column = 92, RULE_table_or_subquery = 93, 
		RULE_join_clause = 94, RULE_join_operator = 95, RULE_join_constraint = 96, 
		RULE_select_core = 97, RULE_from_clause = 98, RULE_where_clause = 99, 
		RULE_groupBy_clause = 100, RULE_having_clause = 101, RULE_signed_number = 102, 
		RULE_literal_value = 103, RULE_error_message = 104, RULE_module_argument = 105, 
		RULE_column_alias = 106, RULE_keyword = 107, RULE_name = 108, RULE_function_name = 109, 
		RULE_database_name = 110, RULE_source_table_name = 111, RULE_table_name = 112, 
		RULE_new_table_name = 113, RULE_column_name = 114, RULE_collation_name = 115, 
		RULE_foreign_table = 116, RULE_index_name = 117, RULE_table_alias = 118, 
		RULE_any_name = 119, RULE_tname = 120;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "delete_stmt", "drop_table_stmt", 
			"factored_select_stmt", "insert_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "assignment_query_to_var", "func_statment_list", "func_statment", 
			"prototype_func", "parameter_list_without_values", "parameter_list_with_values", 
			"parameter_list_mix", "block_of_stms", "all_stm", "if_stm", "compare_element_array", 
			"else_if", "else_stm", "while_stm", "do_while_stm", "for_stm", "first_sec", 
			"second_sec", "third_sec", "for_each_stm", "try_catch_stm", "one_line_cond", 
			"array_one_dimension", "contents_of_array", "initialize_array_element", 
			"switch_stm", "case_part", "default_part", "break_stm", "continue_stm", 
			"func_call", "argument", "print_stm", "higher_order_func", "json_stmt", 
			"json_body", "value_of_property", "increment", "decrement", "read_property_json", 
			"assignment_value_to_property_json", "declare_variable", "initialize_variable", 
			"return_stm", "column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "next_val", "any_name_colon", 
			"expr", "bd_table_column_name", "unary_expr", "call_function_in_expr", 
			"expr_enclose_with_brackets", "select_enclose_with_brackets", "foreign_key_clause", 
			"on_sectin_or_matchName", "on_sectin", "match_name", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "from_clause", "where_clause", 
			"groupBy_clause", "having_clause", "signed_number", "literal_value", 
			"error_message", "module_argument", "column_alias", "keyword", "name", 
			"function_name", "database_name", "source_table_name", "table_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"table_alias", "any_name", "tname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'?'", "'-='", "'+='", "'*='", "'/='", "'++'", 
			"'--'", "'::'", "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", 
			"'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&&'", "'|'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", "PLUS", 
			"MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", "AMP2", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "SMALL_LP", 
			"SMALL_RP", "ARRAY_BRACKET", "ELEMENT_OF_ARRAY", "ARRAY_BRACKET_WITH_INDEX", 
			"K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", 
			"K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", 
			"K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", 
			"K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", 
			"K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
			"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", 
			"K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", 
			"K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", 
			"K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", 
			"K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", 
			"K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", 
			"K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"K_VAR", "K_MYIF", "K_MYELSE", "K_WHILE", "K_RETURN", "K_TRY", "K_CATCH", 
			"K_FINALLY", "K_SWITCH", "K_BREAK", "K_DO", "K_CONTINUE", "K_PRINT", 
			"K_FUNCTION", "K_FALSE", "K_TRUE", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
			"STRING_LITERAL", "BLOB_LITERAL", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public Func_statment_listContext func_statment_list() {
			return getRuleContext(Func_statment_listContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
				{
				setState(242);
				sql_stmt_list();
				}
				break;
			case K_VAR:
			case IDENTIFIER:
				{
				setState(243);
				func_statment_list();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(244);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
			match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			sql_stmt();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(253);
				match(SCOL);
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (K_ALTER - 47)) | (1L << (K_CREATE - 47)) | (1L << (K_DELETE - 47)) | (1L << (K_DROP - 47)) | (1L << (K_INSERT - 47)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (K_SELECT - 148)) | (1L << (K_UPDATE - 148)) | (1L << (K_VALUES - 148)))) != 0)) {
				{
				{
				setState(256);
				sql_stmt();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(257);
					match(SCOL);
					}
				}

				}
				}
				setState(264);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(265);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(266);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(267);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(268);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(269);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(270);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(271);
				update_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(K_ALTER);
			setState(275);
			match(K_TABLE);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(276);
				database_name();
				setState(277);
				match(DOT);
				}
				break;
			}
			setState(281);
			source_table_name();
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(282);
				match(K_RENAME);
				setState(283);
				match(K_TO);
				setState(284);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(285);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(286);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(287);
				match(K_ADD);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(288);
					match(K_COLUMN);
					}
					break;
				}
				setState(291);
				column_def();
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

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(K_ADD);
			setState(295);
			match(K_CONSTRAINT);
			setState(296);
			any_name();
			setState(297);
			table_constraint();
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

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(K_ADD);
			setState(300);
			table_constraint();
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(K_CREATE);
			setState(303);
			match(K_TABLE);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(304);
				match(K_IF);
				setState(305);
				match(K_NOT);
				setState(306);
				match(K_EXISTS);
				}
				break;
			}
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(309);
				database_name();
				setState(310);
				match(DOT);
				}
				break;
			}
			setState(314);
			table_name();
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(315);
				match(OPEN_PAR);
				setState(316);
				column_def();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(317);
						match(COMMA);
						setState(318);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(319);
						match(COMMA);
						setState(320);
						column_def();
						}
						break;
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(328);
				match(K_AS);
				setState(329);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(K_DELETE);
			setState(333);
			match(K_FROM);
			setState(334);
			qualified_table_name();
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(335);
				match(K_WHERE);
				setState(336);
				expr(0);
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(K_DROP);
			setState(340);
			match(K_TABLE);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(341);
				match(K_IF);
				setState(342);
				match(K_EXISTS);
				}
				break;
			}
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(345);
				database_name();
				setState(346);
				match(DOT);
				}
				break;
			}
			setState(350);
			table_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			select_core();
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(353);
				match(K_ORDER);
				setState(354);
				match(K_BY);
				setState(355);
				ordering_term();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(356);
					match(COMMA);
					setState(357);
					ordering_term();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(365);
				match(K_LIMIT);
				setState(366);
				expr(0);
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(367);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(368);
					expr(0);
					}
					break;
				}
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(K_INSERT);
			setState(374);
			match(K_INTO);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(375);
				database_name();
				setState(376);
				match(DOT);
				}
				break;
			}
			setState(380);
			table_name();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(381);
				match(OPEN_PAR);
				setState(382);
				column_name();
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(383);
					match(COMMA);
					setState(384);
					column_name();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(CLOSE_PAR);
				}
			}

			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(394);
				match(K_VALUES);
				setState(395);
				match(OPEN_PAR);
				setState(396);
				expr(0);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397);
					match(COMMA);
					setState(398);
					expr(0);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				match(CLOSE_PAR);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
					match(OPEN_PAR);
					setState(407);
					expr(0);
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(408);
						match(COMMA);
						setState(409);
						expr(0);
						}
						}
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(415);
					match(CLOSE_PAR);
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(422);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(423);
				match(K_DEFAULT);
				setState(424);
				match(K_VALUES);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			select_or_values();
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(428);
				match(K_ORDER);
				setState(429);
				match(K_BY);
				setState(430);
				ordering_term();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(431);
					match(COMMA);
					setState(432);
					ordering_term();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(440);
				match(K_LIMIT);
				setState(441);
				expr(0);
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(442);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(443);
					expr(0);
					}
					break;
				}
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public GroupBy_clauseContext groupBy_clause() {
			return getRuleContext(GroupBy_clauseContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_select_or_values);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(K_SELECT);
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(449);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(452);
				result_column();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(453);
					match(COMMA);
					setState(454);
					result_column();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(460);
					from_clause();
					}
					break;
				}
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(463);
					where_clause();
					}
					break;
				}
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(466);
					groupBy_clause();
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(K_VALUES);
				setState(470);
				match(OPEN_PAR);
				setState(471);
				expr(0);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(472);
					match(COMMA);
					setState(473);
					expr(0);
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				match(CLOSE_PAR);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(480);
					match(COMMA);
					setState(481);
					match(OPEN_PAR);
					setState(482);
					expr(0);
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(483);
						match(COMMA);
						setState(484);
						expr(0);
						}
						}
						setState(489);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(490);
					match(CLOSE_PAR);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(K_UPDATE);
			setState(500);
			qualified_table_name();
			setState(501);
			match(K_SET);
			setState(502);
			column_name();
			setState(503);
			match(ASSIGN);
			setState(504);
			expr(0);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(505);
				match(COMMA);
				setState(506);
				column_name();
				setState(507);
				match(ASSIGN);
				setState(508);
				expr(0);
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(515);
				where_clause();
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

	public static class Assignment_query_to_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Assignment_query_to_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_query_to_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssignment_query_to_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssignment_query_to_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssignment_query_to_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_query_to_varContext assignment_query_to_var() throws RecognitionException {
		Assignment_query_to_varContext _localctx = new Assignment_query_to_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_query_to_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(518);
				match(K_VAR);
				}
			}

			setState(521);
			match(IDENTIFIER);
			setState(522);
			match(ASSIGN);
			setState(523);
			sql_stmt();
			setState(524);
			match(SCOL);
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

	public static class Func_statment_listContext extends ParserRuleContext {
		public List<Func_statmentContext> func_statment() {
			return getRuleContexts(Func_statmentContext.class);
		}
		public Func_statmentContext func_statment(int i) {
			return getRuleContext(Func_statmentContext.class,i);
		}
		public Func_statment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_statment_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunc_statment_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunc_statment_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunc_statment_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_statment_listContext func_statment_list() throws RecognitionException {
		Func_statment_listContext _localctx = new Func_statment_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_statment_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(526);
				func_statment();
				}
				}
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_VAR || _la==IDENTIFIER );
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

	public static class Func_statmentContext extends ParserRuleContext {
		public Prototype_funcContext prototype_func() {
			return getRuleContext(Prototype_funcContext.class,0);
		}
		public Block_of_stmsContext block_of_stms() {
			return getRuleContext(Block_of_stmsContext.class,0);
		}
		public Func_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunc_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunc_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunc_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_statmentContext func_statment() throws RecognitionException {
		Func_statmentContext _localctx = new Func_statmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_statment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			prototype_func();
			setState(532);
			block_of_stms();
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

	public static class Prototype_funcContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Parameter_list_with_valuesContext parameter_list_with_values() {
			return getRuleContext(Parameter_list_with_valuesContext.class,0);
		}
		public Parameter_list_mixContext parameter_list_mix() {
			return getRuleContext(Parameter_list_mixContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Parameter_list_without_valuesContext parameter_list_without_values() {
			return getRuleContext(Parameter_list_without_valuesContext.class,0);
		}
		public Prototype_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrototype_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrototype_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrototype_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prototype_funcContext prototype_func() throws RecognitionException {
		Prototype_funcContext _localctx = new Prototype_funcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prototype_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(534);
				match(K_VAR);
				}
			}

			setState(537);
			match(IDENTIFIER);
			setState(538);
			match(OPEN_PAR);
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(539);
					parameter_list_without_values();
					}
				}

				}
				break;
			case 2:
				{
				setState(542);
				parameter_list_with_values();
				}
				break;
			case 3:
				{
				setState(543);
				parameter_list_mix();
				}
				break;
			}
			setState(546);
			match(CLOSE_PAR);
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

	public static class Parameter_list_without_valuesContext extends ParserRuleContext {
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Parameter_list_without_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list_without_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameter_list_without_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameter_list_without_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameter_list_without_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_list_without_valuesContext parameter_list_without_values() throws RecognitionException {
		Parameter_list_without_valuesContext _localctx = new Parameter_list_without_valuesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter_list_without_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(K_VAR);
			setState(549);
			match(IDENTIFIER);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(550);
				match(COMMA);
				setState(551);
				match(K_VAR);
				setState(552);
				match(IDENTIFIER);
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

	public static class Parameter_list_with_valuesContext extends ParserRuleContext {
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Parameter_list_with_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list_with_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameter_list_with_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameter_list_with_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameter_list_with_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_list_with_valuesContext parameter_list_with_values() throws RecognitionException {
		Parameter_list_with_valuesContext _localctx = new Parameter_list_with_valuesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter_list_with_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(K_VAR);
			setState(559);
			match(IDENTIFIER);
			setState(560);
			match(ASSIGN);
			setState(561);
			expr(0);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(562);
				match(COMMA);
				setState(563);
				match(K_VAR);
				setState(564);
				match(IDENTIFIER);
				setState(565);
				match(ASSIGN);
				setState(566);
				expr(0);
				}
				}
				setState(571);
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

	public static class Parameter_list_mixContext extends ParserRuleContext {
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Parameter_list_mixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list_mix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameter_list_mix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameter_list_mix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameter_list_mix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_list_mixContext parameter_list_mix() throws RecognitionException {
		Parameter_list_mixContext _localctx = new Parameter_list_mixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter_list_mix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(K_VAR);
			setState(573);
			match(IDENTIFIER);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					match(COMMA);
					setState(575);
					match(K_VAR);
					setState(576);
					match(IDENTIFIER);
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(587); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(582);
				match(COMMA);
				setState(583);
				match(K_VAR);
				setState(584);
				match(IDENTIFIER);
				setState(585);
				match(ASSIGN);
				setState(586);
				expr(0);
				}
				}
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
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

	public static class Block_of_stmsContext extends ParserRuleContext {
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public Block_of_stmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_of_stms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBlock_of_stms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBlock_of_stms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBlock_of_stms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_of_stmsContext block_of_stms() throws RecognitionException {
		Block_of_stmsContext _localctx = new Block_of_stmsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block_of_stms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(T__0);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				{
				setState(592);
				all_stm();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(T__1);
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

	public static class All_stmContext extends ParserRuleContext {
		public If_stmContext if_stm() {
			return getRuleContext(If_stmContext.class,0);
		}
		public While_stmContext while_stm() {
			return getRuleContext(While_stmContext.class,0);
		}
		public Do_while_stmContext do_while_stm() {
			return getRuleContext(Do_while_stmContext.class,0);
		}
		public For_stmContext for_stm() {
			return getRuleContext(For_stmContext.class,0);
		}
		public For_each_stmContext for_each_stm() {
			return getRuleContext(For_each_stmContext.class,0);
		}
		public Try_catch_stmContext try_catch_stm() {
			return getRuleContext(Try_catch_stmContext.class,0);
		}
		public One_line_condContext one_line_cond() {
			return getRuleContext(One_line_condContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Switch_stmContext switch_stm() {
			return getRuleContext(Switch_stmContext.class,0);
		}
		public Break_stmContext break_stm() {
			return getRuleContext(Break_stmContext.class,0);
		}
		public Continue_stmContext continue_stm() {
			return getRuleContext(Continue_stmContext.class,0);
		}
		public Array_one_dimensionContext array_one_dimension() {
			return getRuleContext(Array_one_dimensionContext.class,0);
		}
		public Initialize_array_elementContext initialize_array_element() {
			return getRuleContext(Initialize_array_elementContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Print_stmContext print_stm() {
			return getRuleContext(Print_stmContext.class,0);
		}
		public Higher_order_funcContext higher_order_func() {
			return getRuleContext(Higher_order_funcContext.class,0);
		}
		public Assignment_query_to_varContext assignment_query_to_var() {
			return getRuleContext(Assignment_query_to_varContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public Read_property_jsonContext read_property_json() {
			return getRuleContext(Read_property_jsonContext.class,0);
		}
		public Assignment_value_to_property_jsonContext assignment_value_to_property_json() {
			return getRuleContext(Assignment_value_to_property_jsonContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public Initialize_variableContext initialize_variable() {
			return getRuleContext(Initialize_variableContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public Return_stmContext return_stm() {
			return getRuleContext(Return_stmContext.class,0);
		}
		public Block_of_stmsContext block_of_stms() {
			return getRuleContext(Block_of_stmsContext.class,0);
		}
		public All_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAll_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAll_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAll_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_stmContext all_stm() throws RecognitionException {
		All_stmContext _localctx = new All_stmContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_all_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(600);
				if_stm();
				}
				break;
			case 2:
				{
				setState(601);
				while_stm();
				}
				break;
			case 3:
				{
				setState(602);
				do_while_stm();
				}
				break;
			case 4:
				{
				setState(603);
				for_stm();
				}
				break;
			case 5:
				{
				setState(604);
				for_each_stm();
				}
				break;
			case 6:
				{
				setState(605);
				try_catch_stm();
				}
				break;
			case 7:
				{
				setState(606);
				one_line_cond();
				setState(607);
				match(SCOL);
				}
				break;
			case 8:
				{
				setState(609);
				switch_stm();
				}
				break;
			case 9:
				{
				setState(610);
				break_stm();
				}
				break;
			case 10:
				{
				setState(611);
				continue_stm();
				}
				break;
			case 11:
				{
				setState(612);
				array_one_dimension();
				}
				break;
			case 12:
				{
				setState(613);
				initialize_array_element();
				}
				break;
			case 13:
				{
				setState(614);
				func_call();
				setState(615);
				match(SCOL);
				}
				break;
			case 14:
				{
				setState(617);
				print_stm();
				}
				break;
			case 15:
				{
				setState(618);
				higher_order_func();
				}
				break;
			case 16:
				{
				setState(619);
				assignment_query_to_var();
				}
				break;
			case 17:
				{
				setState(620);
				sql_stmt();
				}
				break;
			case 18:
				{
				setState(621);
				read_property_json();
				}
				break;
			case 19:
				{
				setState(622);
				assignment_value_to_property_json();
				}
				break;
			case 20:
				{
				setState(623);
				declare_variable();
				}
				break;
			case 21:
				{
				setState(624);
				initialize_variable();
				}
				break;
			case 22:
				{
				setState(625);
				increment();
				setState(626);
				match(SCOL);
				}
				break;
			case 23:
				{
				setState(628);
				decrement();
				setState(629);
				match(SCOL);
				}
				break;
			case 24:
				{
				setState(631);
				return_stm();
				}
				break;
			case 25:
				{
				setState(632);
				block_of_stms();
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

	public static class If_stmContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_stmContext else_stm() {
			return getRuleContext(Else_stmContext.class,0);
		}
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public If_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmContext if_stm() throws RecognitionException {
		If_stmContext _localctx = new If_stmContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_stm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(K_IF);
			setState(636);
			match(OPEN_PAR);
			setState(637);
			expr(0);
			setState(638);
			match(CLOSE_PAR);
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(639);
				match(T__0);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(640);
					all_stm();
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(646);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(647);
					all_stm();
					}
					break;
				}
				}
				break;
			}
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(652);
					else_if();
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(658);
				else_stm();
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

	public static class Compare_element_arrayContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ARRAY_BRACKET_WITH_INDEX() { return getTokens(SQLParser.ARRAY_BRACKET_WITH_INDEX); }
		public TerminalNode ARRAY_BRACKET_WITH_INDEX(int i) {
			return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode AMP2() { return getToken(SQLParser.AMP2, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Compare_element_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_element_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCompare_element_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCompare_element_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCompare_element_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_element_arrayContext compare_element_array() throws RecognitionException {
		Compare_element_arrayContext _localctx = new Compare_element_arrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compare_element_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(IDENTIFIER);
			setState(662);
			match(ARRAY_BRACKET_WITH_INDEX);
			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(663);
				match(STAR);
				}
				break;
			case DIV:
				{
				setState(664);
				match(DIV);
				}
				break;
			case MOD:
				{
				setState(665);
				match(MOD);
				}
				break;
			case PLUS:
				{
				setState(666);
				match(PLUS);
				}
				break;
			case MINUS:
				{
				setState(667);
				match(MINUS);
				}
				break;
			case PIPE2:
				{
				setState(668);
				match(PIPE2);
				}
				break;
			case AMP2:
				{
				setState(669);
				match(AMP2);
				}
				break;
			case LT:
				{
				setState(670);
				match(LT);
				}
				break;
			case LT_EQ:
				{
				setState(671);
				match(LT_EQ);
				}
				break;
			case GT:
				{
				setState(672);
				match(GT);
				}
				break;
			case GT_EQ:
				{
				setState(673);
				match(GT_EQ);
				}
				break;
			case ASSIGN:
				{
				setState(674);
				match(ASSIGN);
				}
				break;
			case EQ:
				{
				setState(675);
				match(EQ);
				}
				break;
			case NOT_EQ1:
				{
				setState(676);
				match(NOT_EQ1);
				}
				break;
			case NOT_EQ2:
				{
				setState(677);
				match(NOT_EQ2);
				}
				break;
			case LT2:
				{
				setState(678);
				match(LT2);
				}
				break;
			case GT2:
				{
				setState(679);
				match(GT2);
				}
				break;
			case AMP:
				{
				setState(680);
				match(AMP);
				}
				break;
			case PIPE:
				{
				setState(681);
				match(PIPE);
				}
				break;
			case K_IS:
				{
				setState(682);
				match(K_IS);
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(683);
					match(K_NOT);
					}
					break;
				}
				}
				break;
			case K_IN:
				{
				setState(686);
				match(K_IN);
				}
				break;
			case K_LIKE:
				{
				setState(687);
				match(K_LIKE);
				}
				break;
			case K_GLOB:
				{
				setState(688);
				match(K_GLOB);
				}
				break;
			case K_MATCH:
				{
				setState(689);
				match(K_MATCH);
				}
				break;
			case K_REGEXP:
				{
				setState(690);
				match(K_REGEXP);
				}
				break;
			case K_AND:
				{
				setState(691);
				match(K_AND);
				}
				break;
			case K_OR:
				{
				setState(692);
				match(K_OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(695);
				expr(0);
				}
				break;
			case 2:
				{
				setState(696);
				match(IDENTIFIER);
				setState(697);
				match(ARRAY_BRACKET_WITH_INDEX);
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

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(K_ELSE);
			setState(701);
			match(K_IF);
			setState(702);
			match(OPEN_PAR);
			setState(703);
			expr(0);
			setState(704);
			match(CLOSE_PAR);
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(705);
				match(T__0);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(706);
					all_stm();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(713);
					all_stm();
					}
					break;
				}
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

	public static class Else_stmContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public Else_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmContext else_stm() throws RecognitionException {
		Else_stmContext _localctx = new Else_stmContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(K_ELSE);
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(719);
				match(T__0);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(720);
					all_stm();
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(726);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(727);
					all_stm();
					}
					break;
				}
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

	public static class While_stmContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public While_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmContext while_stm() throws RecognitionException {
		While_stmContext _localctx = new While_stmContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(K_WHILE);
			setState(733);
			match(OPEN_PAR);
			setState(734);
			expr(0);
			setState(735);
			match(CLOSE_PAR);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(736);
				match(T__0);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(737);
					all_stm();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(744);
					all_stm();
					}
					break;
				}
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

	public static class Do_while_stmContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public Do_while_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDo_while_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDo_while_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDo_while_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stmContext do_while_stm() throws RecognitionException {
		Do_while_stmContext _localctx = new Do_while_stmContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_while_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(K_DO);
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(750);
				match(T__0);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(751);
					all_stm();
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(758);
					all_stm();
					}
					break;
				}
				}
				break;
			}
			setState(763);
			match(K_WHILE);
			setState(764);
			match(OPEN_PAR);
			setState(765);
			expr(0);
			setState(766);
			match(CLOSE_PAR);
			setState(767);
			match(SCOL);
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

	public static class For_stmContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public First_secContext first_sec() {
			return getRuleContext(First_secContext.class,0);
		}
		public Second_secContext second_sec() {
			return getRuleContext(Second_secContext.class,0);
		}
		public Third_secContext third_sec() {
			return getRuleContext(Third_secContext.class,0);
		}
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public For_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmContext for_stm() throws RecognitionException {
		For_stmContext _localctx = new For_stmContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_for_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(K_FOR);
			setState(770);
			match(OPEN_PAR);
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(771);
				first_sec();
				}
			}

			setState(774);
			match(SCOL);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(775);
				second_sec();
				}
			}

			setState(778);
			match(SCOL);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9 || _la==IDENTIFIER) {
				{
				setState(779);
				third_sec();
				}
			}

			setState(782);
			match(CLOSE_PAR);
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(783);
				match(T__0);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(784);
					all_stm();
					}
					}
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(791);
					all_stm();
					}
					break;
				}
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

	public static class First_secContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public One_line_condContext one_line_cond() {
			return getRuleContext(One_line_condContext.class,0);
		}
		public First_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFirst_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFirst_sec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFirst_sec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_secContext first_sec() throws RecognitionException {
		First_secContext _localctx = new First_secContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_first_sec);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(796);
					match(K_VAR);
					}
					break;
				}
				setState(799);
				expr(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				one_line_cond();
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

	public static class Second_secContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode ARRAY_BRACKET_WITH_INDEX() { return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, 0); }
		public Second_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSecond_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSecond_sec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSecond_sec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_secContext second_sec() throws RecognitionException {
		Second_secContext _localctx = new Second_secContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_second_sec);
		int _la;
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(IDENTIFIER);
				setState(805);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(806);
				match(IDENTIFIER);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_BRACKET_WITH_INDEX) {
					{
					setState(807);
					match(ARRAY_BRACKET_WITH_INDEX);
					}
				}

				}
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					{
					setState(810);
					match(DOT);
					setState(811);
					func_call();
					}
					}
					break;
				case 2:
					{
					setState(814); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(812);
						match(DOT);
						setState(813);
						match(IDENTIFIER);
						}
						}
						setState(816); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DOT );
					}
					break;
				}
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

	public static class Third_secContext extends ParserRuleContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public Third_secContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_third_sec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterThird_sec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitThird_sec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitThird_sec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Third_secContext third_sec() throws RecognitionException {
		Third_secContext _localctx = new Third_secContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_third_sec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(822);
				increment();
				}
				break;
			case 2:
				{
				setState(823);
				decrement();
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

	public static class For_each_stmContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public For_each_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_each_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_each_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_each_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_each_stmContext for_each_stm() throws RecognitionException {
		For_each_stmContext _localctx = new For_each_stmContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_each_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(K_FOR);
			setState(827);
			match(OPEN_PAR);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(828);
				match(K_VAR);
				}
			}

			setState(831);
			match(IDENTIFIER);
			setState(832);
			match(T__2);
			setState(833);
			match(IDENTIFIER);
			setState(834);
			match(CLOSE_PAR);
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(835);
				match(T__0);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(836);
					all_stm();
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(842);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(843);
					all_stm();
					}
					break;
				}
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

	public static class Try_catch_stmContext extends ParserRuleContext {
		public TerminalNode K_TRY() { return getToken(SQLParser.K_TRY, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public List<TerminalNode> K_CATCH() { return getTokens(SQLParser.K_CATCH); }
		public TerminalNode K_CATCH(int i) {
			return getToken(SQLParser.K_CATCH, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public TerminalNode K_FINALLY() { return getToken(SQLParser.K_FINALLY, 0); }
		public Try_catch_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_catch_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTry_catch_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTry_catch_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTry_catch_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_catch_stmContext try_catch_stm() throws RecognitionException {
		Try_catch_stmContext _localctx = new Try_catch_stmContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_try_catch_stm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(K_TRY);
			setState(849);
			match(T__0);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				{
				setState(850);
				all_stm();
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(856);
			match(T__1);
			setState(869); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(857);
					match(K_CATCH);
					setState(858);
					match(OPEN_PAR);
					setState(859);
					match(IDENTIFIER);
					setState(860);
					match(CLOSE_PAR);
					setState(861);
					match(T__0);
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
						{
						{
						setState(862);
						all_stm();
						}
						}
						setState(867);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(868);
					match(T__1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(871); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(873);
				match(K_FINALLY);
				setState(874);
				match(T__0);
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(875);
					all_stm();
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(881);
				match(T__1);
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

	public static class One_line_condContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<One_line_condContext> one_line_cond() {
			return getRuleContexts(One_line_condContext.class);
		}
		public One_line_condContext one_line_cond(int i) {
			return getRuleContext(One_line_condContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public One_line_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_line_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOne_line_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOne_line_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOne_line_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_line_condContext one_line_cond() throws RecognitionException {
		One_line_condContext _localctx = new One_line_condContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_one_line_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(884);
					match(K_VAR);
					}
				}

				setState(887);
				match(IDENTIFIER);
				setState(888);
				match(ASSIGN);
				}
				break;
			}
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(891);
				match(OPEN_PAR);
				setState(892);
				expr(0);
				setState(893);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(895);
				expr(0);
				}
				break;
			}
			setState(898);
			match(T__3);
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(899);
				expr(0);
				}
				break;
			case 2:
				{
				setState(900);
				match(OPEN_PAR);
				setState(901);
				one_line_cond();
				setState(902);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(906);
			match(T__2);
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(907);
				expr(0);
				}
				break;
			case 2:
				{
				setState(908);
				match(OPEN_PAR);
				setState(909);
				one_line_cond();
				setState(910);
				match(CLOSE_PAR);
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

	public static class Array_one_dimensionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ARRAY_BRACKET() { return getTokens(SQLParser.ARRAY_BRACKET); }
		public TerminalNode ARRAY_BRACKET(int i) {
			return getToken(SQLParser.ARRAY_BRACKET, i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Contents_of_arrayContext contents_of_array() {
			return getRuleContext(Contents_of_arrayContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_one_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_one_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_one_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_one_dimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_one_dimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_one_dimensionContext array_one_dimension() throws RecognitionException {
		Array_one_dimensionContext _localctx = new Array_one_dimensionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_array_one_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(914);
				match(K_VAR);
				}
			}

			setState(917);
			match(IDENTIFIER);
			setState(918);
			match(ARRAY_BRACKET);
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(919);
				match(ASSIGN);
				setState(920);
				contents_of_array();
				}
				}
				break;
			case SCOL:
			case COMMA:
				{
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(921);
					match(COMMA);
					setState(922);
					match(IDENTIFIER);
					setState(923);
					match(ARRAY_BRACKET);
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(931);
			match(SCOL);
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

	public static class Contents_of_arrayContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode SMALL_LP() { return getToken(SQLParser.SMALL_LP, 0); }
		public TerminalNode SMALL_RP() { return getToken(SQLParser.SMALL_RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Json_bodyContext> json_body() {
			return getRuleContexts(Json_bodyContext.class);
		}
		public Json_bodyContext json_body(int i) {
			return getRuleContext(Json_bodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Contents_of_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contents_of_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterContents_of_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitContents_of_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitContents_of_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contents_of_arrayContext contents_of_array() throws RecognitionException {
		Contents_of_arrayContext _localctx = new Contents_of_arrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_contents_of_array);
		int _la;
		try {
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				func_call();
				}
				break;
			case SMALL_LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(SMALL_LP);
				setState(951);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_VAR:
				case K_WHILE:
				case K_RETURN:
				case K_TRY:
				case K_CATCH:
				case K_FINALLY:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_CONTINUE:
				case K_PRINT:
				case K_FUNCTION:
				case K_FALSE:
				case K_TRUE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(935);
					expr(0);
					setState(940);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(936);
						match(COMMA);
						setState(937);
						expr(0);
						}
						}
						setState(942);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__0:
					{
					setState(943);
					json_body();
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(944);
						match(COMMA);
						setState(945);
						json_body();
						}
						}
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(953);
				match(SMALL_RP);
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

	public static class Initialize_array_elementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ARRAY_BRACKET_WITH_INDEX() { return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Initialize_array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize_array_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInitialize_array_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInitialize_array_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInitialize_array_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialize_array_elementContext initialize_array_element() throws RecognitionException {
		Initialize_array_elementContext _localctx = new Initialize_array_elementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_initialize_array_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(IDENTIFIER);
			setState(958);
			match(ARRAY_BRACKET_WITH_INDEX);
			setState(959);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(960);
			expr(0);
			setState(961);
			match(SCOL);
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

	public static class Switch_stmContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Case_partContext> case_part() {
			return getRuleContexts(Case_partContext.class);
		}
		public Case_partContext case_part(int i) {
			return getRuleContext(Case_partContext.class,i);
		}
		public Default_partContext default_part() {
			return getRuleContext(Default_partContext.class,0);
		}
		public Switch_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_stmContext switch_stm() throws RecognitionException {
		Switch_stmContext _localctx = new Switch_stmContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switch_stm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(K_SWITCH);
			setState(964);
			match(OPEN_PAR);
			setState(965);
			match(IDENTIFIER);
			setState(966);
			match(CLOSE_PAR);
			setState(967);
			match(T__0);
			setState(969); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(968);
				case_part();
				}
				}
				setState(971); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CASE );
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(973);
				default_part();
				}
			}

			setState(976);
			match(T__1);
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

	public static class Case_partContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public Case_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCase_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCase_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCase_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_partContext case_part() throws RecognitionException {
		Case_partContext _localctx = new Case_partContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_case_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(K_CASE);
			setState(979);
			expr(0);
			setState(980);
			match(T__2);
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(981);
					all_stm();
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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

	public static class Default_partContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public List<All_stmContext> all_stm() {
			return getRuleContexts(All_stmContext.class);
		}
		public All_stmContext all_stm(int i) {
			return getRuleContext(All_stmContext.class,i);
		}
		public Default_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefault_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefault_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDefault_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_partContext default_part() throws RecognitionException {
		Default_partContext _localctx = new Default_partContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_default_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(K_DEFAULT);
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(988);
				match(T__0);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					{
					setState(989);
					all_stm();
					}
					}
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(995);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
					{
					setState(996);
					all_stm();
					}
				}

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

	public static class Break_stmContext extends ParserRuleContext {
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Break_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBreak_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBreak_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBreak_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmContext break_stm() throws RecognitionException {
		Break_stmContext _localctx = new Break_stmContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_break_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(K_BREAK);
			setState(1002);
			match(SCOL);
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

	public static class Continue_stmContext extends ParserRuleContext {
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Continue_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterContinue_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitContinue_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitContinue_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmContext continue_stm() throws RecognitionException {
		Continue_stmContext _localctx = new Continue_stmContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_continue_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(K_CONTINUE);
			setState(1005);
			match(SCOL);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(IDENTIFIER);
			setState(1008);
			match(OPEN_PAR);
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0)) {
				{
				setState(1009);
				argument();
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1010);
					match(COMMA);
					setState(1011);
					argument();
					}
					}
					setState(1016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1019);
			match(CLOSE_PAR);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ARRAY_BRACKET_WITH_INDEX() { return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_argument);
		try {
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(IDENTIFIER);
				setState(1023);
				match(ARRAY_BRACKET_WITH_INDEX);
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

	public static class Print_stmContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ARRAY_BRACKET_WITH_INDEX() { return getTokens(SQLParser.ARRAY_BRACKET_WITH_INDEX); }
		public TerminalNode ARRAY_BRACKET_WITH_INDEX(int i) {
			return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public Print_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmContext print_stm() throws RecognitionException {
		Print_stmContext _localctx = new Print_stmContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_print_stm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(K_PRINT);
			setState(1027);
			match(OPEN_PAR);
			setState(1046);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1041);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(1028);
						match(IDENTIFIER);
						}
						break;
					case 2:
						{
						setState(1029);
						match(IDENTIFIER);
						setState(1030);
						match(ARRAY_BRACKET_WITH_INDEX);
						}
						break;
					case 3:
						{
						setState(1031);
						match(IDENTIFIER);
						setState(1032);
						match(DOT);
						setState(1033);
						match(IDENTIFIER);
						setState(1038);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT) {
							{
							{
							setState(1034);
							match(DOT);
							setState(1035);
							match(IDENTIFIER);
							}
							}
							setState(1040);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					setState(1043);
					match(PLUS);
					}
					} 
				}
				setState(1048);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1049);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(1050);
				match(IDENTIFIER);
				setState(1051);
				match(ARRAY_BRACKET_WITH_INDEX);
				}
				break;
			case 3:
				{
				setState(1052);
				match(IDENTIFIER);
				setState(1053);
				match(DOT);
				setState(1054);
				match(IDENTIFIER);
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1055);
					match(DOT);
					setState(1056);
					match(IDENTIFIER);
					}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1064);
			match(CLOSE_PAR);
			setState(1065);
			match(SCOL);
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

	public static class Higher_order_funcContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Block_of_stmsContext block_of_stms() {
			return getRuleContext(Block_of_stmsContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Higher_order_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_order_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHigher_order_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHigher_order_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHigher_order_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_order_funcContext higher_order_func() throws RecognitionException {
		Higher_order_funcContext _localctx = new Higher_order_funcContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_higher_order_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1067);
				match(K_VAR);
				}
			}

			setState(1070);
			match(IDENTIFIER);
			setState(1071);
			match(ASSIGN);
			setState(1072);
			match(IDENTIFIER);
			setState(1073);
			match(OPEN_PAR);
			setState(1076); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1074);
				match(IDENTIFIER);
				setState(1075);
				match(COMMA);
				}
				}
				setState(1078); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1080);
			match(K_FUNCTION);
			setState(1081);
			match(OPEN_PAR);
			setState(1082);
			match(IDENTIFIER);
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083);
				match(COMMA);
				setState(1084);
				match(IDENTIFIER);
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1090);
			match(CLOSE_PAR);
			setState(1091);
			block_of_stms();
			setState(1092);
			match(CLOSE_PAR);
			setState(1093);
			match(SCOL);
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

	public static class Json_stmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Json_bodyContext json_body() {
			return getRuleContext(Json_bodyContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Json_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_stmtContext json_stmt() throws RecognitionException {
		Json_stmtContext _localctx = new Json_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_json_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1095);
				match(K_VAR);
				}
			}

			setState(1098);
			match(IDENTIFIER);
			setState(1099);
			match(ASSIGN);
			setState(1100);
			json_body();
			setState(1101);
			match(SCOL);
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

	public static class Json_bodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<Value_of_propertyContext> value_of_property() {
			return getRuleContexts(Value_of_propertyContext.class);
		}
		public Value_of_propertyContext value_of_property(int i) {
			return getRuleContext(Value_of_propertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Json_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_bodyContext json_body() throws RecognitionException {
		Json_bodyContext _localctx = new Json_bodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_json_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(T__0);
			setState(1104);
			match(IDENTIFIER);
			setState(1105);
			match(T__2);
			setState(1106);
			value_of_property();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1107);
				match(COMMA);
				setState(1108);
				match(IDENTIFIER);
				setState(1109);
				match(T__2);
				setState(1110);
				value_of_property();
				}
				}
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1116);
			match(T__1);
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

	public static class Value_of_propertyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Json_bodyContext json_body() {
			return getRuleContext(Json_bodyContext.class,0);
		}
		public Contents_of_arrayContext contents_of_array() {
			return getRuleContext(Contents_of_arrayContext.class,0);
		}
		public Value_of_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_of_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValue_of_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValue_of_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValue_of_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_of_propertyContext value_of_property() throws RecognitionException {
		Value_of_propertyContext _localctx = new Value_of_propertyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value_of_property);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				json_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				contents_of_array();
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_increment);
		int _la;
		try {
			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				match(IDENTIFIER);
				setState(1127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(1124);
					match(T__8);
					}
					break;
				case T__5:
				case T__6:
					{
					setState(1125);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1126);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				match(T__8);
				setState(1130);
				match(IDENTIFIER);
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

	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_decrement);
		int _la;
		try {
			setState(1141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				match(IDENTIFIER);
				setState(1137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(1134);
					match(T__9);
					}
					break;
				case T__4:
				case T__7:
					{
					setState(1135);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__7) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1136);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				match(T__9);
				setState(1140);
				match(IDENTIFIER);
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

	public static class Read_property_jsonContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Read_property_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_property_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRead_property_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRead_property_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRead_property_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_property_jsonContext read_property_json() throws RecognitionException {
		Read_property_jsonContext _localctx = new Read_property_jsonContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_read_property_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1143);
				match(K_VAR);
				}
			}

			setState(1146);
			match(IDENTIFIER);
			setState(1147);
			match(ASSIGN);
			setState(1148);
			match(IDENTIFIER);
			setState(1149);
			match(DOT);
			setState(1150);
			match(IDENTIFIER);
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1151);
				match(DOT);
				setState(1152);
				match(IDENTIFIER);
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1158);
			match(SCOL);
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

	public static class Assignment_value_to_property_jsonContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Assignment_value_to_property_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_value_to_property_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAssignment_value_to_property_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAssignment_value_to_property_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAssignment_value_to_property_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_value_to_property_jsonContext assignment_value_to_property_json() throws RecognitionException {
		Assignment_value_to_property_jsonContext _localctx = new Assignment_value_to_property_jsonContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignment_value_to_property_json);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(IDENTIFIER);
			setState(1161);
			match(DOT);
			setState(1162);
			match(IDENTIFIER);
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1163);
				match(DOT);
				setState(1164);
				match(IDENTIFIER);
				}
				}
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1170);
			match(ASSIGN);
			setState(1171);
			expr(0);
			setState(1172);
			match(SCOL);
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

	public static class Declare_variableContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Declare_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDeclare_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDeclare_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDeclare_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_declare_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(K_VAR);
			setState(1175);
			match(IDENTIFIER);
			setState(1185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
			case COMMA:
				{
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1176);
					match(COMMA);
					setState(1177);
					match(IDENTIFIER);
					}
					}
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASSIGN:
				{
				setState(1183);
				match(ASSIGN);
				setState(1184);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1187);
			match(SCOL);
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

	public static class Initialize_variableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode ARRAY_BRACKET_WITH_INDEX() { return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, 0); }
		public Json_bodyContext json_body() {
			return getRuleContext(Json_bodyContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Initialize_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInitialize_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInitialize_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInitialize_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialize_variableContext initialize_variable() throws RecognitionException {
		Initialize_variableContext _localctx = new Initialize_variableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_initialize_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1189);
				match(K_VAR);
				}
			}

			setState(1192);
			match(IDENTIFIER);
			setState(1193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1194);
				match(IDENTIFIER);
				setState(1195);
				match(ARRAY_BRACKET_WITH_INDEX);
				}
				break;
			case 2:
				{
				setState(1196);
				json_body();
				}
				break;
			case 3:
				{
				setState(1197);
				func_call();
				}
				break;
			case 4:
				{
				setState(1198);
				expr(0);
				}
				break;
			}
			setState(1201);
			match(SCOL);
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

	public static class Return_stmContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public One_line_condContext one_line_cond() {
			return getRuleContext(One_line_condContext.class,0);
		}
		public Return_stmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_stm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_stm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_stm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmContext return_stm() throws RecognitionException {
		Return_stmContext _localctx = new Return_stmContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_return_stm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(K_RETURN);
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1204);
				expr(0);
				}
				break;
			case 2:
				{
				setState(1205);
				increment();
				}
				break;
			case 3:
				{
				setState(1206);
				decrement();
				}
				break;
			case 4:
				{
				setState(1207);
				one_line_cond();
				}
				break;
			}
			setState(1210);
			match(SCOL);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			column_name();
			setState(1217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(1213);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(1214);
						type_name();
						}
						break;
					}
					} 
				}
				setState(1219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			name();
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1221);
				match(OPEN_PAR);
				setState(1222);
				signed_number();
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1223);
					any_name();
					}
				}

				setState(1226);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1228);
				match(OPEN_PAR);
				setState(1229);
				signed_number();
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1230);
					any_name();
					}
				}

				setState(1233);
				match(COMMA);
				setState(1234);
				signed_number();
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (STRING_LITERAL - 128)))) != 0)) {
					{
					setState(1235);
					any_name();
					}
				}

				setState(1238);
				match(CLOSE_PAR);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1242);
				match(K_CONSTRAINT);
				setState(1243);
				name();
				}
			}

			setState(1258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1246);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1247);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1248);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1249);
				column_constraint_null();
				}
				break;
			case K_CHECK:
				{
				setState(1250);
				match(K_CHECK);
				setState(1251);
				match(OPEN_PAR);
				setState(1252);
				expr(0);
				setState(1253);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1255);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1256);
				match(K_COLLATE);
				setState(1257);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(K_PRIMARY);
			setState(1261);
			match(K_KEY);
			setState(1263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1262);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1265);
				match(K_AUTOINCREMENT);
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

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			foreign_key_clause();
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

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(K_NOT);
			setState(1271);
			match(K_NULL);
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

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(K_NULL);
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

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Next_valContext next_val() {
			return getRuleContext(Next_valContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_name_colonContext any_name_colon() {
			return getRuleContext(Any_name_colonContext.class,0);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_column_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(K_DEFAULT);
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1276);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1277);
				match(OPEN_PAR);
				setState(1278);
				expr(0);
				setState(1279);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1281);
				next_val();
				}
				break;
			case 4:
				{
				setState(1282);
				any_name();
				}
				break;
			}
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(1285);
				any_name_colon();
				}
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

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1288);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1289);
				literal_value();
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

	public static class Next_valContext extends ParserRuleContext {
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Next_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNext_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNext_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNext_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_valContext next_val() throws RecognitionException {
		Next_valContext _localctx = new Next_valContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_next_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(K_NEXTVAL);
			setState(1293);
			match(OPEN_PAR);
			setState(1294);
			expr(0);
			setState(1295);
			match(CLOSE_PAR);
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

	public static class Any_name_colonContext extends ParserRuleContext {
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Any_name_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name_colon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_name_colonContext any_name_colon() throws RecognitionException {
		Any_name_colonContext _localctx = new Any_name_colonContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_any_name_colon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(T__10);
			setState(1299); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1298);
					any_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1301); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Bd_table_column_nameContext bd_table_column_name() {
			return getRuleContext(Bd_table_column_nameContext.class,0);
		}
		public Call_function_in_exprContext call_function_in_expr() {
			return getRuleContext(Call_function_in_exprContext.class,0);
		}
		public Expr_enclose_with_bracketsContext expr_enclose_with_brackets() {
			return getRuleContext(Expr_enclose_with_bracketsContext.class,0);
		}
		public Select_enclose_with_bracketsContext select_enclose_with_brackets() {
			return getRuleContext(Select_enclose_with_bracketsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode AMP2() { return getToken(SQLParser.AMP2, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode ARRAY_BRACKET_WITH_INDEX() { return getToken(SQLParser.ARRAY_BRACKET_WITH_INDEX, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1304);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1305);
				unary_expr();
				}
				break;
			case 3:
				{
				setState(1306);
				bd_table_column_name();
				}
				break;
			case 4:
				{
				setState(1307);
				call_function_in_expr();
				}
				break;
			case 5:
				{
				setState(1308);
				expr_enclose_with_brackets();
				}
				break;
			case 6:
				{
				setState(1309);
				select_enclose_with_brackets();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(1312);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(1314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ARRAY_BRACKET_WITH_INDEX) {
						{
						setState(1313);
						match(ARRAY_BRACKET_WITH_INDEX);
						}
					}

					setState(1346);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(1316);
						match(STAR);
						}
						break;
					case DIV:
						{
						setState(1317);
						match(DIV);
						}
						break;
					case MOD:
						{
						setState(1318);
						match(MOD);
						}
						break;
					case PLUS:
						{
						setState(1319);
						match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(1320);
						match(MINUS);
						}
						break;
					case PIPE2:
						{
						setState(1321);
						match(PIPE2);
						}
						break;
					case AMP2:
						{
						setState(1322);
						match(AMP2);
						}
						break;
					case LT:
						{
						setState(1323);
						match(LT);
						}
						break;
					case LT_EQ:
						{
						setState(1324);
						match(LT_EQ);
						}
						break;
					case GT:
						{
						setState(1325);
						match(GT);
						}
						break;
					case GT_EQ:
						{
						setState(1326);
						match(GT_EQ);
						}
						break;
					case ASSIGN:
						{
						setState(1327);
						match(ASSIGN);
						}
						break;
					case EQ:
						{
						setState(1328);
						match(EQ);
						}
						break;
					case NOT_EQ1:
						{
						setState(1329);
						match(NOT_EQ1);
						}
						break;
					case NOT_EQ2:
						{
						setState(1330);
						match(NOT_EQ2);
						}
						break;
					case LT2:
						{
						setState(1331);
						match(LT2);
						}
						break;
					case GT2:
						{
						setState(1332);
						match(GT2);
						}
						break;
					case AMP:
						{
						setState(1333);
						match(AMP);
						}
						break;
					case PIPE:
						{
						setState(1334);
						match(PIPE);
						}
						break;
					case K_IS:
						{
						setState(1335);
						match(K_IS);
						setState(1337);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
						case 1:
							{
							setState(1336);
							match(K_NOT);
							}
							break;
						}
						}
						break;
					case K_IN:
						{
						setState(1339);
						match(K_IN);
						}
						break;
					case K_LIKE:
						{
						setState(1340);
						match(K_LIKE);
						}
						break;
					case K_GLOB:
						{
						setState(1341);
						match(K_GLOB);
						}
						break;
					case K_MATCH:
						{
						setState(1342);
						match(K_MATCH);
						}
						break;
					case K_REGEXP:
						{
						setState(1343);
						match(K_REGEXP);
						}
						break;
					case K_AND:
						{
						setState(1344);
						match(K_AND);
						}
						break;
					case K_OR:
						{
						setState(1345);
						match(K_OR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1348);
					expr(6);
					}
					} 
				}
				setState(1353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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

	public static class Bd_table_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Bd_table_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bd_table_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBd_table_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBd_table_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBd_table_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bd_table_column_nameContext bd_table_column_name() throws RecognitionException {
		Bd_table_column_nameContext _localctx = new Bd_table_column_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_bd_table_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1354);
					database_name();
					setState(1355);
					match(DOT);
					}
					break;
				}
				setState(1359);
				table_name();
				setState(1360);
				match(DOT);
				}
				break;
			}
			setState(1364);
			column_name();
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

	public static class Unary_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_unary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1367);
			expr(0);
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

	public static class Call_function_in_exprContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Call_function_in_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function_in_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCall_function_in_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCall_function_in_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCall_function_in_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_function_in_exprContext call_function_in_expr() throws RecognitionException {
		Call_function_in_exprContext _localctx = new Call_function_in_exprContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_call_function_in_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			function_name();
			setState(1370);
			match(OPEN_PAR);
			setState(1383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_VAR:
			case K_WHILE:
			case K_RETURN:
			case K_TRY:
			case K_CATCH:
			case K_FINALLY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_CONTINUE:
			case K_PRINT:
			case K_FUNCTION:
			case K_FALSE:
			case K_TRUE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1371);
					match(K_DISTINCT);
					}
					break;
				}
				setState(1374);
				expr(0);
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1375);
					match(COMMA);
					setState(1376);
					expr(0);
					}
					}
					setState(1381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1382);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1385);
			match(CLOSE_PAR);
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

	public static class Expr_enclose_with_bracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Expr_enclose_with_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_enclose_with_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_enclose_with_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_enclose_with_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_enclose_with_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_enclose_with_bracketsContext expr_enclose_with_brackets() throws RecognitionException {
		Expr_enclose_with_bracketsContext _localctx = new Expr_enclose_with_bracketsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expr_enclose_with_brackets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(OPEN_PAR);
			setState(1388);
			expr(0);
			setState(1389);
			match(CLOSE_PAR);
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

	public static class Select_enclose_with_bracketsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Select_enclose_with_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_enclose_with_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_enclose_with_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_enclose_with_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_enclose_with_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_enclose_with_bracketsContext select_enclose_with_brackets() throws RecognitionException {
		Select_enclose_with_bracketsContext _localctx = new Select_enclose_with_bracketsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_select_enclose_with_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXISTS || _la==K_NOT) {
				{
				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1391);
					match(K_NOT);
					}
				}

				setState(1394);
				match(K_EXISTS);
				}
			}

			setState(1397);
			match(OPEN_PAR);
			setState(1398);
			factored_select_stmt();
			setState(1399);
			match(CLOSE_PAR);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<On_sectin_or_matchNameContext> on_sectin_or_matchName() {
			return getRuleContexts(On_sectin_or_matchNameContext.class);
		}
		public On_sectin_or_matchNameContext on_sectin_or_matchName(int i) {
			return getRuleContext(On_sectin_or_matchNameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(K_REFERENCES);
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1402);
				database_name();
				setState(1403);
				match(DOT);
				}
				break;
			}
			setState(1407);
			foreign_table();
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1408);
				match(OPEN_PAR);
				setState(1409);
				fk_target_column_name();
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1410);
					match(COMMA);
					setState(1411);
					fk_target_column_name();
					}
					}
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1417);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1421);
					on_sectin_or_matchName();
					}
					} 
				}
				setState(1426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1427);
					match(K_NOT);
					}
				}

				setState(1430);
				match(K_DEFERRABLE);
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1431);
					match(K_INITIALLY);
					setState(1432);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1433);
					match(K_INITIALLY);
					setState(1434);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1437);
					match(K_ENABLE);
					}
					break;
				}
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

	public static class On_sectin_or_matchNameContext extends ParserRuleContext {
		public On_sectinContext on_sectin() {
			return getRuleContext(On_sectinContext.class,0);
		}
		public Match_nameContext match_name() {
			return getRuleContext(Match_nameContext.class,0);
		}
		public On_sectin_or_matchNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_sectin_or_matchName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOn_sectin_or_matchName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOn_sectin_or_matchName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOn_sectin_or_matchName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_sectin_or_matchNameContext on_sectin_or_matchName() throws RecognitionException {
		On_sectin_or_matchNameContext _localctx = new On_sectin_or_matchNameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_on_sectin_or_matchName);
		try {
			setState(1444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				on_sectin();
				}
				break;
			case K_MATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match_name();
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

	public static class On_sectinContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public On_sectinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_sectin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOn_sectin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOn_sectin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOn_sectin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_sectinContext on_sectin() throws RecognitionException {
		On_sectinContext _localctx = new On_sectinContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_on_sectin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(K_ON);
			setState(1447);
			_la = _input.LA(1);
			if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1448);
				match(K_SET);
				setState(1449);
				match(K_NULL);
				}
				break;
			case 2:
				{
				setState(1450);
				match(K_SET);
				setState(1451);
				match(K_DEFAULT);
				}
				break;
			case 3:
				{
				setState(1452);
				match(K_CASCADE);
				}
				break;
			case 4:
				{
				setState(1453);
				match(K_RESTRICT);
				}
				break;
			case 5:
				{
				setState(1454);
				match(K_NO);
				setState(1455);
				match(K_ACTION);
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

	public static class Match_nameContext extends ParserRuleContext {
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Match_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMatch_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMatch_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitMatch_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_nameContext match_name() throws RecognitionException {
		Match_nameContext _localctx = new Match_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_match_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(K_MATCH);
			setState(1459);
			name();
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

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			name();
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			column_name();
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1464);
				match(K_COLLATE);
				setState(1465);
				collation_name();
				}
			}

			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1468);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1471);
				match(K_CONSTRAINT);
				setState(1472);
				name();
				}
			}

			setState(1484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1475);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1476);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1477);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1478);
				match(K_CHECK);
				setState(1479);
				match(OPEN_PAR);
				setState(1480);
				expr(0);
				setState(1481);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1483);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(K_PRIMARY);
			setState(1487);
			match(K_KEY);
			setState(1488);
			match(OPEN_PAR);
			setState(1489);
			indexed_column();
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1490);
				match(COMMA);
				setState(1491);
				indexed_column();
				}
				}
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1497);
			match(CLOSE_PAR);
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

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(K_FOREIGN);
			setState(1500);
			match(K_KEY);
			setState(1501);
			match(OPEN_PAR);
			setState(1502);
			fk_origin_column_name();
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1503);
				match(COMMA);
				setState(1504);
				fk_origin_column_name();
				}
				}
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1510);
			match(CLOSE_PAR);
			setState(1511);
			foreign_key_clause();
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

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(K_UNIQUE);
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1514);
				match(K_KEY);
				}
				break;
			}
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1517);
				name();
				}
				break;
			}
			setState(1520);
			match(OPEN_PAR);
			setState(1521);
			indexed_column();
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1522);
				match(COMMA);
				setState(1523);
				indexed_column();
				}
				}
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1529);
			match(CLOSE_PAR);
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

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(K_KEY);
			setState(1533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1532);
				name();
				}
				break;
			}
			setState(1535);
			match(OPEN_PAR);
			setState(1536);
			indexed_column();
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1537);
				match(COMMA);
				setState(1538);
				indexed_column();
				}
				}
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1544);
			match(CLOSE_PAR);
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

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			column_name();
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1548);
				database_name();
				setState(1549);
				match(DOT);
				}
				break;
			}
			setState(1553);
			table_name();
			setState(1559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1554);
				match(K_INDEXED);
				setState(1555);
				match(K_BY);
				setState(1556);
				index_name();
				}
				break;
			case 2:
				{
				setState(1557);
				match(K_NOT);
				setState(1558);
				match(K_INDEXED);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			expr(0);
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1562);
				match(K_COLLATE);
				setState(1563);
				collation_name();
				}
				break;
			}
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1566);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_pragma_value);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			table_name();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1575);
				match(OPEN_PAR);
				setState(1576);
				column_name();
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1577);
					match(COMMA);
					setState(1578);
					column_name();
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1584);
				match(CLOSE_PAR);
				}
			}

			setState(1588);
			match(K_AS);
			setState(1589);
			match(OPEN_PAR);
			setState(1590);
			select_stmt();
			setState(1591);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_result_column);
		int _la;
		try {
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				table_name();
				setState(1595);
				match(DOT);
				setState(1596);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1598);
				expr(0);
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1599);
						match(K_AS);
						}
					}

					setState(1602);
					column_alias();
					}
					break;
				}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_table_or_subquery);
		int _la;
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1607);
					database_name();
					setState(1608);
					match(DOT);
					}
					break;
				}
				setState(1612);
				table_name();
				setState(1617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
					case 1:
						{
						setState(1613);
						match(K_AS);
						}
						break;
					}
					setState(1616);
					table_alias();
					}
					break;
				}
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1619);
					match(K_INDEXED);
					setState(1620);
					match(K_BY);
					setState(1621);
					index_name();
					}
					break;
				case 2:
					{
					setState(1622);
					match(K_NOT);
					setState(1623);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
				match(OPEN_PAR);
				setState(1636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1627);
					table_or_subquery();
					setState(1632);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1628);
						match(COMMA);
						setState(1629);
						table_or_subquery();
						}
						}
						setState(1634);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1635);
					join_clause();
					}
					break;
				}
				setState(1638);
				match(CLOSE_PAR);
				setState(1643);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1640);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
					case 1:
						{
						setState(1639);
						match(K_AS);
						}
						break;
					}
					setState(1642);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(OPEN_PAR);
				setState(1646);
				select_core();
				setState(1647);
				match(CLOSE_PAR);
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						setState(1648);
						match(K_AS);
						}
						break;
					}
					setState(1651);
					table_alias();
					}
					break;
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_join_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			table_or_subquery();
			setState(1663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1657);
					join_operator();
					setState(1658);
					table_or_subquery();
					setState(1659);
					join_constraint();
					}
					} 
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_join_operator);
		int _la;
		try {
			setState(1675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1666);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1667);
					match(K_LEFT);
					setState(1669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1668);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1671);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1674);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_join_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(K_ON);
			setState(1678);
			expr(0);
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public GroupBy_clauseContext groupBy_clause() {
			return getRuleContext(GroupBy_clauseContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_select_core);
		int _la;
		try {
			setState(1729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				match(K_SELECT);
				setState(1682);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1681);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1684);
				result_column();
				setState(1689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1685);
					match(COMMA);
					setState(1686);
					result_column();
					}
					}
					setState(1691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1692);
					from_clause();
					}
					break;
				}
				setState(1696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1695);
					where_clause();
					}
					break;
				}
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1698);
					groupBy_clause();
					}
					break;
				}
				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				match(K_VALUES);
				setState(1702);
				match(OPEN_PAR);
				setState(1703);
				expr(0);
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1704);
					match(COMMA);
					setState(1705);
					expr(0);
					}
					}
					setState(1710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1711);
				match(CLOSE_PAR);
				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1712);
					match(COMMA);
					setState(1713);
					match(OPEN_PAR);
					setState(1714);
					expr(0);
					setState(1719);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1715);
						match(COMMA);
						setState(1716);
						expr(0);
						}
						}
						setState(1721);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1722);
					match(CLOSE_PAR);
					}
					}
					setState(1728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(K_FROM);
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1732);
				table_or_subquery();
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1733);
					match(COMMA);
					setState(1734);
					table_or_subquery();
					}
					}
					setState(1739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1740);
				join_clause();
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

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(K_WHERE);
			setState(1744);
			expr(0);
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

	public static class GroupBy_clauseContext extends ParserRuleContext {
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public GroupBy_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGroupBy_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGroupBy_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGroupBy_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupBy_clauseContext groupBy_clause() throws RecognitionException {
		GroupBy_clauseContext _localctx = new GroupBy_clauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_groupBy_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(K_GROUP);
			setState(1747);
			match(K_BY);
			setState(1748);
			expr(0);
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1749);
				match(COMMA);
				setState(1750);
				expr(0);
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1756);
				having_clause();
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

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(K_HAVING);
			setState(1760);
			expr(0);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1762);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1765);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1766);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (K_CURRENT_DATE - 69)) | (1L << (K_CURRENT_TIME - 69)) | (1L << (K_CURRENT_TIMESTAMP - 69)) | (1L << (K_NULL - 69)))) != 0) || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (NUMERIC_LITERAL - 186)) | (1L << (STRING_LITERAL - 186)) | (1L << (BLOB_LITERAL - 186)))) != 0)) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_module_argument);
		try {
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode K_TRY() { return getToken(SQLParser.K_TRY, 0); }
		public TerminalNode K_CATCH() { return getToken(SQLParser.K_CATCH, 0); }
		public TerminalNode K_FINALLY() { return getToken(SQLParser.K_FINALLY, 0); }
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_TRY - 128)) | (1L << (K_CATCH - 128)) | (1L << (K_FINALLY - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TRUE - 128)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			any_name();
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

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public TnameContext tname() {
			return getRuleContext(TnameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			tname();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1793);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_any_name);
		try {
			setState(1810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1803);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_VAR:
			case K_WHILE:
			case K_RETURN:
			case K_TRY:
			case K_CATCH:
			case K_FINALLY:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_CONTINUE:
			case K_PRINT:
			case K_FUNCTION:
			case K_FALSE:
			case K_TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1804);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1805);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1806);
				match(OPEN_PAR);
				setState(1807);
				any_name();
				setState(1808);
				match(CLOSE_PAR);
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

	public static class TnameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TnameContext tname() {
			return getRuleContext(TnameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TnameContext tname() throws RecognitionException {
		TnameContext _localctx = new TnameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_tname);
		try {
			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1814);
				match(OPEN_PAR);
				setState(1815);
				tname();
				setState(1816);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 70:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c2\u071f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\3\2\3\2\3\2\5\2\u00f8\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\5\4\u0101\n\4\3\4\3\4\5\4\u0105\n\4\7\4\u0107\n\4\f\4\16\4\u010a"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0113\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u011a\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0124\n\6\3\6\5\6\u0127"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0136\n\t"+
		"\3\t\3\t\3\t\5\t\u013b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0144\n\t\f"+
		"\t\16\t\u0147\13\t\3\t\3\t\3\t\3\t\5\t\u014d\n\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0154\n\n\3\13\3\13\3\13\3\13\5\13\u015a\n\13\3\13\3\13\3\13\5\13\u015f"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0169\n\f\f\f\16\f\u016c\13"+
		"\f\5\f\u016e\n\f\3\f\3\f\3\f\3\f\5\f\u0174\n\f\5\f\u0176\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u017d\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0184\n\r\f\r\16\r\u0187"+
		"\13\r\3\r\3\r\5\r\u018b\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0192\n\r\f\r\16\r"+
		"\u0195\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u019d\n\r\f\r\16\r\u01a0\13\r"+
		"\3\r\3\r\7\r\u01a4\n\r\f\r\16\r\u01a7\13\r\3\r\3\r\3\r\5\r\u01ac\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u01b4\n\16\f\16\16\16\u01b7\13\16\5"+
		"\16\u01b9\n\16\3\16\3\16\3\16\3\16\5\16\u01bf\n\16\5\16\u01c1\n\16\3\17"+
		"\3\17\5\17\u01c5\n\17\3\17\3\17\3\17\7\17\u01ca\n\17\f\17\16\17\u01cd"+
		"\13\17\3\17\5\17\u01d0\n\17\3\17\5\17\u01d3\n\17\3\17\5\17\u01d6\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u01dd\n\17\f\17\16\17\u01e0\13\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u01e8\n\17\f\17\16\17\u01eb\13\17\3\17"+
		"\3\17\7\17\u01ef\n\17\f\17\16\17\u01f2\13\17\5\17\u01f4\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0201\n\20\f\20\16"+
		"\20\u0204\13\20\3\20\5\20\u0207\n\20\3\21\5\21\u020a\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\6\22\u0212\n\22\r\22\16\22\u0213\3\23\3\23\3\23\3\24"+
		"\5\24\u021a\n\24\3\24\3\24\3\24\5\24\u021f\n\24\3\24\3\24\5\24\u0223\n"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u022c\n\25\f\25\16\25\u022f"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u023a\n\26\f"+
		"\26\16\26\u023d\13\26\3\27\3\27\3\27\3\27\3\27\7\27\u0244\n\27\f\27\16"+
		"\27\u0247\13\27\3\27\3\27\3\27\3\27\3\27\6\27\u024e\n\27\r\27\16\27\u024f"+
		"\3\30\3\30\7\30\u0254\n\30\f\30\16\30\u0257\13\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u027c\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0284"+
		"\n\32\f\32\16\32\u0287\13\32\3\32\3\32\5\32\u028b\n\32\5\32\u028d\n\32"+
		"\3\32\7\32\u0290\n\32\f\32\16\32\u0293\13\32\3\32\5\32\u0296\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02af\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u02b8\n\33\3\33\3\33\3\33\5\33\u02bd\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02c6\n\34\f\34\16\34\u02c9\13"+
		"\34\3\34\3\34\5\34\u02cd\n\34\5\34\u02cf\n\34\3\35\3\35\3\35\7\35\u02d4"+
		"\n\35\f\35\16\35\u02d7\13\35\3\35\3\35\5\35\u02db\n\35\5\35\u02dd\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02e5\n\36\f\36\16\36\u02e8\13\36"+
		"\3\36\3\36\5\36\u02ec\n\36\5\36\u02ee\n\36\3\37\3\37\3\37\7\37\u02f3\n"+
		"\37\f\37\16\37\u02f6\13\37\3\37\3\37\5\37\u02fa\n\37\5\37\u02fc\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0307\n \3 \3 \5 \u030b\n \3"+
		" \3 \5 \u030f\n \3 \3 \3 \7 \u0314\n \f \16 \u0317\13 \3 \3 \5 \u031b"+
		"\n \5 \u031d\n \3!\5!\u0320\n!\3!\3!\5!\u0324\n!\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u032b\n\"\3\"\3\"\3\"\3\"\6\"\u0331\n\"\r\"\16\"\u0332\5\"\u0335\n"+
		"\"\5\"\u0337\n\"\3#\3#\5#\u033b\n#\3$\3$\3$\5$\u0340\n$\3$\3$\3$\3$\3"+
		"$\3$\7$\u0348\n$\f$\16$\u034b\13$\3$\3$\5$\u034f\n$\5$\u0351\n$\3%\3%"+
		"\3%\7%\u0356\n%\f%\16%\u0359\13%\3%\3%\3%\3%\3%\3%\3%\7%\u0362\n%\f%\16"+
		"%\u0365\13%\3%\6%\u0368\n%\r%\16%\u0369\3%\3%\3%\7%\u036f\n%\f%\16%\u0372"+
		"\13%\3%\5%\u0375\n%\3&\5&\u0378\n&\3&\3&\5&\u037c\n&\3&\3&\3&\3&\3&\5"+
		"&\u0383\n&\3&\3&\3&\3&\3&\3&\5&\u038b\n&\3&\3&\3&\3&\3&\3&\5&\u0393\n"+
		"&\3\'\5\'\u0396\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u039f\n\'\f\'\16\'"+
		"\u03a2\13\'\5\'\u03a4\n\'\3\'\3\'\3(\3(\3(\3(\3(\7(\u03ad\n(\f(\16(\u03b0"+
		"\13(\3(\3(\3(\7(\u03b5\n(\f(\16(\u03b8\13(\5(\u03ba\n(\3(\3(\5(\u03be"+
		"\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\6*\u03cc\n*\r*\16*\u03cd\3*\5"+
		"*\u03d1\n*\3*\3*\3+\3+\3+\3+\7+\u03d9\n+\f+\16+\u03dc\13+\3,\3,\3,\7,"+
		"\u03e1\n,\f,\16,\u03e4\13,\3,\3,\5,\u03e8\n,\5,\u03ea\n,\3-\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3/\3/\7/\u03f7\n/\f/\16/\u03fa\13/\5/\u03fc\n/\3/\3/\3\60"+
		"\3\60\3\60\5\60\u0403\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\7\61\u040f\n\61\f\61\16\61\u0412\13\61\5\61\u0414\n\61\3\61\7\61"+
		"\u0417\n\61\f\61\16\61\u041a\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\7\61\u0424\n\61\f\61\16\61\u0427\13\61\5\61\u0429\n\61\3\61\3\61"+
		"\3\61\3\62\5\62\u042f\n\62\3\62\3\62\3\62\3\62\3\62\3\62\6\62\u0437\n"+
		"\62\r\62\16\62\u0438\3\62\3\62\3\62\3\62\3\62\7\62\u0440\n\62\f\62\16"+
		"\62\u0443\13\62\3\62\3\62\3\62\3\62\3\62\3\63\5\63\u044b\n\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u045a\n\64"+
		"\f\64\16\64\u045d\13\64\3\64\3\64\3\65\3\65\3\65\5\65\u0464\n\65\3\66"+
		"\3\66\3\66\3\66\5\66\u046a\n\66\3\66\3\66\5\66\u046e\n\66\3\67\3\67\3"+
		"\67\3\67\5\67\u0474\n\67\3\67\3\67\5\67\u0478\n\67\38\58\u047b\n8\38\3"+
		"8\38\38\38\38\38\78\u0484\n8\f8\168\u0487\138\38\38\39\39\39\39\39\79"+
		"\u0490\n9\f9\169\u0493\139\39\39\39\39\3:\3:\3:\3:\7:\u049d\n:\f:\16:"+
		"\u04a0\13:\3:\3:\5:\u04a4\n:\3:\3:\3;\5;\u04a9\n;\3;\3;\3;\3;\3;\3;\3"+
		";\5;\u04b2\n;\3;\3;\3<\3<\3<\3<\3<\5<\u04bb\n<\3<\3<\3=\3=\3=\7=\u04c2"+
		"\n=\f=\16=\u04c5\13=\3>\3>\3>\3>\5>\u04cb\n>\3>\3>\3>\3>\3>\5>\u04d2\n"+
		">\3>\3>\3>\5>\u04d7\n>\3>\3>\5>\u04db\n>\3?\3?\5?\u04df\n?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u04ed\n?\3@\3@\3@\5@\u04f2\n@\3@\5@\u04f5"+
		"\n@\3A\3A\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0506\nD\3D\5D\u0509"+
		"\nD\3E\3E\5E\u050d\nE\3F\3F\3F\3F\3F\3G\3G\6G\u0516\nG\rG\16G\u0517\3"+
		"H\3H\3H\3H\3H\3H\3H\5H\u0521\nH\3H\3H\5H\u0525\nH\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u053c\nH\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u0545\nH\3H\7H\u0548\nH\fH\16H\u054b\13H\3I\3I\3I\5I\u0550"+
		"\nI\3I\3I\3I\5I\u0555\nI\3I\3I\3J\3J\3J\3K\3K\3K\5K\u055f\nK\3K\3K\3K"+
		"\7K\u0564\nK\fK\16K\u0567\13K\3K\5K\u056a\nK\3K\3K\3L\3L\3L\3L\3M\5M\u0573"+
		"\nM\3M\5M\u0576\nM\3M\3M\3M\3M\3N\3N\3N\3N\5N\u0580\nN\3N\3N\3N\3N\3N"+
		"\7N\u0587\nN\fN\16N\u058a\13N\3N\3N\5N\u058e\nN\3N\7N\u0591\nN\fN\16N"+
		"\u0594\13N\3N\5N\u0597\nN\3N\3N\3N\3N\3N\5N\u059e\nN\3N\5N\u05a1\nN\5"+
		"N\u05a3\nN\3O\3O\5O\u05a7\nO\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u05b3\n"+
		"P\3Q\3Q\3Q\3R\3R\3S\3S\3S\5S\u05bd\nS\3S\5S\u05c0\nS\3T\3T\5T\u05c4\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u05cf\nT\3U\3U\3U\3U\3U\3U\7U\u05d7\n"+
		"U\fU\16U\u05da\13U\3U\3U\3V\3V\3V\3V\3V\3V\7V\u05e4\nV\fV\16V\u05e7\13"+
		"V\3V\3V\3V\3W\3W\5W\u05ee\nW\3W\5W\u05f1\nW\3W\3W\3W\3W\7W\u05f7\nW\f"+
		"W\16W\u05fa\13W\3W\3W\3X\3X\5X\u0600\nX\3X\3X\3X\3X\7X\u0606\nX\fX\16"+
		"X\u0609\13X\3X\3X\3Y\3Y\3Z\3Z\3Z\5Z\u0612\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u061a"+
		"\nZ\3[\3[\3[\5[\u061f\n[\3[\5[\u0622\n[\3\\\3\\\3\\\5\\\u0627\n\\\3]\3"+
		"]\3]\3]\3]\7]\u062e\n]\f]\16]\u0631\13]\3]\3]\5]\u0635\n]\3]\3]\3]\3]"+
		"\3]\3^\3^\3^\3^\3^\3^\3^\5^\u0643\n^\3^\5^\u0646\n^\5^\u0648\n^\3_\3_"+
		"\3_\5_\u064d\n_\3_\3_\5_\u0651\n_\3_\5_\u0654\n_\3_\3_\3_\3_\3_\5_\u065b"+
		"\n_\3_\3_\3_\3_\7_\u0661\n_\f_\16_\u0664\13_\3_\5_\u0667\n_\3_\3_\5_\u066b"+
		"\n_\3_\5_\u066e\n_\3_\3_\3_\3_\5_\u0674\n_\3_\5_\u0677\n_\5_\u0679\n_"+
		"\3`\3`\3`\3`\3`\7`\u0680\n`\f`\16`\u0683\13`\3a\3a\3a\5a\u0688\na\3a\5"+
		"a\u068b\na\3a\5a\u068e\na\3b\3b\3b\3c\3c\5c\u0695\nc\3c\3c\3c\7c\u069a"+
		"\nc\fc\16c\u069d\13c\3c\5c\u06a0\nc\3c\5c\u06a3\nc\3c\5c\u06a6\nc\3c\3"+
		"c\3c\3c\3c\7c\u06ad\nc\fc\16c\u06b0\13c\3c\3c\3c\3c\3c\3c\7c\u06b8\nc"+
		"\fc\16c\u06bb\13c\3c\3c\7c\u06bf\nc\fc\16c\u06c2\13c\5c\u06c4\nc\3d\3"+
		"d\3d\3d\7d\u06ca\nd\fd\16d\u06cd\13d\3d\5d\u06d0\nd\3e\3e\3e\3f\3f\3f"+
		"\3f\3f\7f\u06da\nf\ff\16f\u06dd\13f\3f\5f\u06e0\nf\3g\3g\3g\3h\5h\u06e6"+
		"\nh\3h\3h\5h\u06ea\nh\3i\3i\3j\3j\3k\3k\5k\u06f2\nk\3l\3l\3m\3m\3n\3n"+
		"\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3y"+
		"\3y\3y\3y\3y\5y\u0715\ny\3z\3z\3z\3z\3z\3z\5z\u071d\nz\3z\2\3\u008e{\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\2\17\4\2\22\22\177\177\4\2\60\60QQ\3\2 $\4\2\7\n\23\23\3"+
		"\2\b\t\4\2\7\7\n\n\4\2\65\65OO\4\2\25\27{{\4\2NN\u00a1\u00a1\3\2\25\26"+
		"\6\2GI}}\u00bc\u00bc\u00be\u00bf\4\2\u00bb\u00bb\u00be\u00be\5\2,\u0080"+
		"\u0082\u00ab\u00ae\u00ba\2\u0801\2\u00f7\3\2\2\2\4\u00fb\3\2\2\2\6\u00fe"+
		"\3\2\2\2\b\u0112\3\2\2\2\n\u0114\3\2\2\2\f\u0128\3\2\2\2\16\u012d\3\2"+
		"\2\2\20\u0130\3\2\2\2\22\u014e\3\2\2\2\24\u0155\3\2\2\2\26\u0162\3\2\2"+
		"\2\30\u0177\3\2\2\2\32\u01ad\3\2\2\2\34\u01f3\3\2\2\2\36\u01f5\3\2\2\2"+
		" \u0209\3\2\2\2\"\u0211\3\2\2\2$\u0215\3\2\2\2&\u0219\3\2\2\2(\u0226\3"+
		"\2\2\2*\u0230\3\2\2\2,\u023e\3\2\2\2.\u0251\3\2\2\2\60\u027b\3\2\2\2\62"+
		"\u027d\3\2\2\2\64\u0297\3\2\2\2\66\u02be\3\2\2\28\u02d0\3\2\2\2:\u02de"+
		"\3\2\2\2<\u02ef\3\2\2\2>\u0303\3\2\2\2@\u0323\3\2\2\2B\u0336\3\2\2\2D"+
		"\u033a\3\2\2\2F\u033c\3\2\2\2H\u0352\3\2\2\2J\u037b\3\2\2\2L\u0395\3\2"+
		"\2\2N\u03bd\3\2\2\2P\u03bf\3\2\2\2R\u03c5\3\2\2\2T\u03d4\3\2\2\2V\u03dd"+
		"\3\2\2\2X\u03eb\3\2\2\2Z\u03ee\3\2\2\2\\\u03f1\3\2\2\2^\u0402\3\2\2\2"+
		"`\u0404\3\2\2\2b\u042e\3\2\2\2d\u044a\3\2\2\2f\u0451\3\2\2\2h\u0463\3"+
		"\2\2\2j\u046d\3\2\2\2l\u0477\3\2\2\2n\u047a\3\2\2\2p\u048a\3\2\2\2r\u0498"+
		"\3\2\2\2t\u04a8\3\2\2\2v\u04b5\3\2\2\2x\u04be\3\2\2\2z\u04c6\3\2\2\2|"+
		"\u04de\3\2\2\2~\u04ee\3\2\2\2\u0080\u04f6\3\2\2\2\u0082\u04f8\3\2\2\2"+
		"\u0084\u04fb\3\2\2\2\u0086\u04fd\3\2\2\2\u0088\u050c\3\2\2\2\u008a\u050e"+
		"\3\2\2\2\u008c\u0513\3\2\2\2\u008e\u0520\3\2\2\2\u0090\u0554\3\2\2\2\u0092"+
		"\u0558\3\2\2\2\u0094\u055b\3\2\2\2\u0096\u056d\3\2\2\2\u0098\u0575\3\2"+
		"\2\2\u009a\u057b\3\2\2\2\u009c\u05a6\3\2\2\2\u009e\u05a8\3\2\2\2\u00a0"+
		"\u05b4\3\2\2\2\u00a2\u05b7\3\2\2\2\u00a4\u05b9\3\2\2\2\u00a6\u05c3\3\2"+
		"\2\2\u00a8\u05d0\3\2\2\2\u00aa\u05dd\3\2\2\2\u00ac\u05eb\3\2\2\2\u00ae"+
		"\u05fd\3\2\2\2\u00b0\u060c\3\2\2\2\u00b2\u0611\3\2\2\2\u00b4\u061b\3\2"+
		"\2\2\u00b6\u0626\3\2\2\2\u00b8\u0628\3\2\2\2\u00ba\u0647\3\2\2\2\u00bc"+
		"\u0678\3\2\2\2\u00be\u067a\3\2\2\2\u00c0\u068d\3\2\2\2\u00c2\u068f\3\2"+
		"\2\2\u00c4\u06c3\3\2\2\2\u00c6\u06c5\3\2\2\2\u00c8\u06d1\3\2\2\2\u00ca"+
		"\u06d4\3\2\2\2\u00cc\u06e1\3\2\2\2\u00ce\u06e9\3\2\2\2\u00d0\u06eb\3\2"+
		"\2\2\u00d2\u06ed\3\2\2\2\u00d4\u06f1\3\2\2\2\u00d6\u06f3\3\2\2\2\u00d8"+
		"\u06f5\3\2\2\2\u00da\u06f7\3\2\2\2\u00dc\u06f9\3\2\2\2\u00de\u06fb\3\2"+
		"\2\2\u00e0\u06fd\3\2\2\2\u00e2\u06ff\3\2\2\2\u00e4\u0701\3\2\2\2\u00e6"+
		"\u0703\3\2\2\2\u00e8\u0705\3\2\2\2\u00ea\u0707\3\2\2\2\u00ec\u0709\3\2"+
		"\2\2\u00ee\u070b\3\2\2\2\u00f0\u0714\3\2\2\2\u00f2\u071c\3\2\2\2\u00f4"+
		"\u00f8\5\6\4\2\u00f5\u00f8\5\"\22\2\u00f6\u00f8\5\4\3\2\u00f7\u00f4\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7\2\2\3\u00fa\3\3\2\2\2\u00fb\u00fc\7\u00c2\2\2\u00fc\u00fd\b\3"+
		"\1\2\u00fd\5\3\2\2\2\u00fe\u0100\5\b\5\2\u00ff\u0101\7\16\2\2\u0100\u00ff"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0108\3\2\2\2\u0102\u0104\5\b\5\2\u0103"+
		"\u0105\7\16\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3"+
		"\2\2\2\u0106\u0102\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\7\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0113\5\n\6\2"+
		"\u010c\u0113\5\20\t\2\u010d\u0113\5\22\n\2\u010e\u0113\5\24\13\2\u010f"+
		"\u0113\5\26\f\2\u0110\u0113\5\30\r\2\u0111\u0113\5\36\20\2\u0112\u010b"+
		"\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\t\3\2\2\2"+
		"\u0114\u0115\7\61\2\2\u0115\u0119\7\u0098\2\2\u0116\u0117\5\u00dep\2\u0117"+
		"\u0118\7\17\2\2\u0118\u011a\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u0126\5\u00e0q\2\u011c\u011d\7\u008f"+
		"\2\2\u011d\u011e\7\u009c\2\2\u011e\u0127\5\u00e4s\2\u011f\u0127\5\16\b"+
		"\2\u0120\u0127\5\f\7\2\u0121\u0123\7.\2\2\u0122\u0124\7A\2\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\5x=\2\u0126"+
		"\u011c\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2"+
		"\2\2\u0127\13\3\2\2\2\u0128\u0129\7.\2\2\u0129\u012a\7D\2\2\u012a\u012b"+
		"\5\u00f0y\2\u012b\u012c\5\u00a6T\2\u012c\r\3\2\2\2\u012d\u012e\7.\2\2"+
		"\u012e\u012f\5\u00a6T\2\u012f\17\3\2\2\2\u0130\u0131\7E\2\2\u0131\u0135"+
		"\7\u0098\2\2\u0132\u0133\7d\2\2\u0133\u0134\7{\2\2\u0134\u0136\7Z\2\2"+
		"\u0135\u0132\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013a\3\2\2\2\u0137\u0138"+
		"\5\u00dep\2\u0138\u0139\7\17\2\2\u0139\u013b\3\2\2\2\u013a\u0137\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u014c\5\u00e2r\2\u013d"+
		"\u013e\7\20\2\2\u013e\u0145\5x=\2\u013f\u0140\7\22\2\2\u0140\u0144\5\u00a6"+
		"T\2\u0141\u0142\7\22\2\2\u0142\u0144\5x=\2\u0143\u013f\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\21\2\2\u0149\u014d\3"+
		"\2\2\2\u014a\u014b\7\64\2\2\u014b\u014d\5\32\16\2\u014c\u013d\3\2\2\2"+
		"\u014c\u014a\3\2\2\2\u014d\21\3\2\2\2\u014e\u014f\7N\2\2\u014f\u0150\7"+
		"_\2\2\u0150\u0153\5\u00b2Z\2\u0151\u0152\7\u00a8\2\2\u0152\u0154\5\u008e"+
		"H\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\23\3\2\2\2\u0155\u0156"+
		"\7R\2\2\u0156\u0159\7\u0098\2\2\u0157\u0158\7d\2\2\u0158\u015a\7Z\2\2"+
		"\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015e\3\2\2\2\u015b\u015c"+
		"\5\u00dep\2\u015c\u015d\7\17\2\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2"+
		"\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\5\u00e2r\2\u0161"+
		"\25\3\2\2\2\u0162\u016d\5\u00c4c\2\u0163\u0164\7\u0083\2\2\u0164\u0165"+
		"\7;\2\2\u0165\u016a\5\u00b4[\2\u0166\u0167\7\22\2\2\u0167\u0169\5\u00b4"+
		"[\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0163\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0175\3\2\2\2\u016f\u0170\7v\2\2\u0170"+
		"\u0173\5\u008eH\2\u0171\u0172\t\2\2\2\u0172\u0174\5\u008eH\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u016f\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\27\3\2\2\2\u0177\u0178\7l\2\2\u0178\u017c\7o\2\2"+
		"\u0179\u017a\5\u00dep\2\u017a\u017b\7\17\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u018a\5\u00e2"+
		"r\2\u017f\u0180\7\20\2\2\u0180\u0185\5\u00e6t\2\u0181\u0182\7\22\2\2\u0182"+
		"\u0184\5\u00e6t\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u0189\7\21\2\2\u0189\u018b\3\2\2\2\u018a\u017f\3\2\2\2\u018a\u018b\3"+
		"\2\2\2\u018b\u01ab\3\2\2\2\u018c\u018d\7\u00a4\2\2\u018d\u018e\7\20\2"+
		"\2\u018e\u0193\5\u008eH\2\u018f\u0190\7\22\2\2\u0190\u0192\5\u008eH\2"+
		"\u0191\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u01a5\7\21\2\2"+
		"\u0197\u0198\7\22\2\2\u0198\u0199\7\20\2\2\u0199\u019e\5\u008eH\2\u019a"+
		"\u019b\7\22\2\2\u019b\u019d\5\u008eH\2\u019c\u019a\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a2\7\21\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0197\3"+
		"\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01ac\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ac\5\32\16\2\u01a9\u01aa\7"+
		"K\2\2\u01aa\u01ac\7\u00a4\2\2\u01ab\u018c\3\2\2\2\u01ab\u01a8\3\2\2\2"+
		"\u01ab\u01a9\3\2\2\2\u01ac\31\3\2\2\2\u01ad\u01b8\5\34\17\2\u01ae\u01af"+
		"\7\u0083\2\2\u01af\u01b0\7;\2\2\u01b0\u01b5\5\u00b4[\2\u01b1\u01b2\7\22"+
		"\2\2\u01b2\u01b4\5\u00b4[\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c0\3\2\2\2\u01ba"+
		"\u01bb\7v\2\2\u01bb\u01be\5\u008eH\2\u01bc\u01bd\t\2\2\2\u01bd\u01bf\5"+
		"\u008eH\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2"+
		"\u01c0\u01ba\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\33\3\2\2\2\u01c2\u01c4"+
		"\7\u0096\2\2\u01c3\u01c5\t\3\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01cb\5\u00ba^\2\u01c7\u01c8\7\22\2\2\u01c8"+
		"\u01ca\5\u00ba^\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01d0\5\u00c6d\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01d3\5\u00c8e\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2"+
		"\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5\u00caf\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01f4\3\2\2\2\u01d7\u01d8\7\u00a4\2\2\u01d8\u01d9"+
		"\7\20\2\2\u01d9\u01de\5\u008eH\2\u01da\u01db\7\22\2\2\u01db\u01dd\5\u008e"+
		"H\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01f0\7\21"+
		"\2\2\u01e2\u01e3\7\22\2\2\u01e3\u01e4\7\20\2\2\u01e4\u01e9\5\u008eH\2"+
		"\u01e5\u01e6\7\22\2\2\u01e6\u01e8\5\u008eH\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\21\2\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01e2\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01c2\3\2\2\2\u01f3"+
		"\u01d7\3\2\2\2\u01f4\35\3\2\2\2\u01f5\u01f6\7\u00a1\2\2\u01f6\u01f7\5"+
		"\u00b2Z\2\u01f7\u01f8\7\u0097\2\2\u01f8\u01f9\5\u00e6t\2\u01f9\u01fa\7"+
		"\23\2\2\u01fa\u0202\5\u008eH\2\u01fb\u01fc\7\22\2\2\u01fc\u01fd\5\u00e6"+
		"t\2\u01fd\u01fe\7\23\2\2\u01fe\u01ff\5\u008eH\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fb\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0207\5\u00c8e\2\u0206"+
		"\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\37\3\2\2\2\u0208\u020a\7\u00ab"+
		"\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\7\u00bb\2\2\u020c\u020d\7\23\2\2\u020d\u020e\5\b\5\2\u020e\u020f"+
		"\7\16\2\2\u020f!\3\2\2\2\u0210\u0212\5$\23\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214#\3\2\2\2"+
		"\u0215\u0216\5&\24\2\u0216\u0217\5.\30\2\u0217%\3\2\2\2\u0218\u021a\7"+
		"\u00ab\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2"+
		"\u021b\u021c\7\u00bb\2\2\u021c\u0222\7\20\2\2\u021d\u021f\5(\25\2\u021e"+
		"\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0223\3\2\2\2\u0220\u0223\5*"+
		"\26\2\u0221\u0223\5,\27\2\u0222\u021e\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7\21\2\2\u0225\'\3\2\2"+
		"\2\u0226\u0227\7\u00ab\2\2\u0227\u022d\7\u00bb\2\2\u0228\u0229\7\22\2"+
		"\2\u0229\u022a\7\u00ab\2\2\u022a\u022c\7\u00bb\2\2\u022b\u0228\3\2\2\2"+
		"\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e)\3"+
		"\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7\u00ab\2\2\u0231\u0232\7\u00bb"+
		"\2\2\u0232\u0233\7\23\2\2\u0233\u023b\5\u008eH\2\u0234\u0235\7\22\2\2"+
		"\u0235\u0236\7\u00ab\2\2\u0236\u0237\7\u00bb\2\2\u0237\u0238\7\23\2\2"+
		"\u0238\u023a\5\u008eH\2\u0239\u0234\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c+\3\2\2\2\u023d\u023b\3\2\2\2"+
		"\u023e\u023f\7\u00ab\2\2\u023f\u0245\7\u00bb\2\2\u0240\u0241\7\22\2\2"+
		"\u0241\u0242\7\u00ab\2\2\u0242\u0244\7\u00bb\2\2\u0243\u0240\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u024d\3\2"+
		"\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7\22\2\2\u0249\u024a\7\u00ab\2\2"+
		"\u024a\u024b\7\u00bb\2\2\u024b\u024c\7\23\2\2\u024c\u024e\5\u008eH\2\u024d"+
		"\u0248\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250-\3\2\2\2\u0251\u0255\7\3\2\2\u0252\u0254\5\60\31\2\u0253\u0252"+
		"\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7\4\2\2\u0259/\3\2\2\2"+
		"\u025a\u027c\5\62\32\2\u025b\u027c\5:\36\2\u025c\u027c\5<\37\2\u025d\u027c"+
		"\5> \2\u025e\u027c\5F$\2\u025f\u027c\5H%\2\u0260\u0261\5J&\2\u0261\u0262"+
		"\7\16\2\2\u0262\u027c\3\2\2\2\u0263\u027c\5R*\2\u0264\u027c\5X-\2\u0265"+
		"\u027c\5Z.\2\u0266\u027c\5L\'\2\u0267\u027c\5P)\2\u0268\u0269\5\\/\2\u0269"+
		"\u026a\7\16\2\2\u026a\u027c\3\2\2\2\u026b\u027c\5`\61\2\u026c\u027c\5"+
		"b\62\2\u026d\u027c\5 \21\2\u026e\u027c\5\b\5\2\u026f\u027c\5n8\2\u0270"+
		"\u027c\5p9\2\u0271\u027c\5r:\2\u0272\u027c\5t;\2\u0273\u0274\5j\66\2\u0274"+
		"\u0275\7\16\2\2\u0275\u027c\3\2\2\2\u0276\u0277\5l\67\2\u0277\u0278\7"+
		"\16\2\2\u0278\u027c\3\2\2\2\u0279\u027c\5v<\2\u027a\u027c\5.\30\2\u027b"+
		"\u025a\3\2\2\2\u027b\u025b\3\2\2\2\u027b\u025c\3\2\2\2\u027b\u025d\3\2"+
		"\2\2\u027b\u025e\3\2\2\2\u027b\u025f\3\2\2\2\u027b\u0260\3\2\2\2\u027b"+
		"\u0263\3\2\2\2\u027b\u0264\3\2\2\2\u027b\u0265\3\2\2\2\u027b\u0266\3\2"+
		"\2\2\u027b\u0267\3\2\2\2\u027b\u0268\3\2\2\2\u027b\u026b\3\2\2\2\u027b"+
		"\u026c\3\2\2\2\u027b\u026d\3\2\2\2\u027b\u026e\3\2\2\2\u027b\u026f\3\2"+
		"\2\2\u027b\u0270\3\2\2\2\u027b\u0271\3\2\2\2\u027b\u0272\3\2\2\2\u027b"+
		"\u0273\3\2\2\2\u027b\u0276\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2"+
		"\2\2\u027c\61\3\2\2\2\u027d\u027e\7d\2\2\u027e\u027f\7\20\2\2\u027f\u0280"+
		"\5\u008eH\2\u0280\u028c\7\21\2\2\u0281\u0285\7\3\2\2\u0282\u0284\5\60"+
		"\31\2\u0283\u0282\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028d\7\4"+
		"\2\2\u0289\u028b\5\60\31\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028d\3\2\2\2\u028c\u0281\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u0291\3\2"+
		"\2\2\u028e\u0290\5\66\34\2\u028f\u028e\3\2\2\2\u0290\u0293\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0294\u0296\58\35\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\63\3\2\2\2\u0297\u0298\7\u00bb\2\2\u0298\u02b7\7+\2\2\u0299\u02b8\7\24"+
		"\2\2\u029a\u02b8\7\31\2\2\u029b\u02b8\7\32\2\2\u029c\u02b8\7\25\2\2\u029d"+
		"\u02b8\7\26\2\2\u029e\u02b8\7\30\2\2\u029f\u02b8\7\36\2\2\u02a0\u02b8"+
		"\7 \2\2\u02a1\u02b8\7!\2\2\u02a2\u02b8\7\"\2\2\u02a3\u02b8\7#\2\2\u02a4"+
		"\u02b8\7\23\2\2\u02a5\u02b8\7$\2\2\u02a6\u02b8\7%\2\2\u02a7\u02b8\7&\2"+
		"\2\u02a8\u02b8\7\33\2\2\u02a9\u02b8\7\34\2\2\u02aa\u02b8\7\35\2\2\u02ab"+
		"\u02b8\7\37\2\2\u02ac\u02ae\7p\2\2\u02ad\u02af\7{\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b8\3\2\2\2\u02b0\u02b8\7g\2\2\u02b1"+
		"\u02b8\7u\2\2\u02b2\u02b8\7a\2\2\u02b3\u02b8\7w\2\2\u02b4\u02b8\7\u008c"+
		"\2\2\u02b5\u02b8\7\63\2\2\u02b6\u02b8\7\u0082\2\2\u02b7\u0299\3\2\2\2"+
		"\u02b7\u029a\3\2\2\2\u02b7\u029b\3\2\2\2\u02b7\u029c\3\2\2\2\u02b7\u029d"+
		"\3\2\2\2\u02b7\u029e\3\2\2\2\u02b7\u029f\3\2\2\2\u02b7\u02a0\3\2\2\2\u02b7"+
		"\u02a1\3\2\2\2\u02b7\u02a2\3\2\2\2\u02b7\u02a3\3\2\2\2\u02b7\u02a4\3\2"+
		"\2\2\u02b7\u02a5\3\2\2\2\u02b7\u02a6\3\2\2\2\u02b7\u02a7\3\2\2\2\u02b7"+
		"\u02a8\3\2\2\2\u02b7\u02a9\3\2\2\2\u02b7\u02aa\3\2\2\2\u02b7\u02ab\3\2"+
		"\2\2\u02b7\u02ac\3\2\2\2\u02b7\u02b0\3\2\2\2\u02b7\u02b1\3\2\2\2\u02b7"+
		"\u02b2\3\2\2\2\u02b7\u02b3\3\2\2\2\u02b7\u02b4\3\2\2\2\u02b7\u02b5\3\2"+
		"\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bc\3\2\2\2\u02b9\u02bd\5\u008eH\2\u02ba"+
		"\u02bb\7\u00bb\2\2\u02bb\u02bd\7+\2\2\u02bc\u02b9\3\2\2\2\u02bc\u02ba"+
		"\3\2\2\2\u02bd\65\3\2\2\2\u02be\u02bf\7T\2\2\u02bf\u02c0\7d\2\2\u02c0"+
		"\u02c1\7\20\2\2\u02c1\u02c2\5\u008eH\2\u02c2\u02ce\7\21\2\2\u02c3\u02c7"+
		"\7\3\2\2\u02c4\u02c6\5\60\31\2\u02c5\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2"+
		"\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7"+
		"\3\2\2\2\u02ca\u02cf\7\4\2\2\u02cb\u02cd\5\60\31\2\u02cc\u02cb\3\2\2\2"+
		"\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c3\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02cf\67\3\2\2\2\u02d0\u02dc\7T\2\2\u02d1\u02d5\7\3\2\2\u02d2"+
		"\u02d4\5\60\31\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3"+
		"\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8"+
		"\u02dd\7\4\2\2\u02d9\u02db\5\60\31\2\u02da\u02d9\3\2\2\2\u02da\u02db\3"+
		"\2\2\2\u02db\u02dd\3\2\2\2\u02dc\u02d1\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"9\3\2\2\2\u02de\u02df\7\u00ae\2\2\u02df\u02e0\7\20\2\2\u02e0\u02e1\5\u008e"+
		"H\2\u02e1\u02ed\7\21\2\2\u02e2\u02e6\7\3\2\2\u02e3\u02e5\5\60\31\2\u02e4"+
		"\u02e3\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2"+
		"\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ee\7\4\2\2\u02ea"+
		"\u02ec\5\60\31\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3"+
		"\2\2\2\u02ed\u02e2\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee;\3\2\2\2\u02ef\u02fb"+
		"\7\u00b5\2\2\u02f0\u02f4\7\3\2\2\u02f1\u02f3\5\60\31\2\u02f2\u02f1\3\2"+
		"\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fc\7\4\2\2\u02f8\u02fa\5\60"+
		"\31\2\u02f9\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2\2\2\u02fb"+
		"\u02f0\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7\u00ae"+
		"\2\2\u02fe\u02ff\7\20\2\2\u02ff\u0300\5\u008eH\2\u0300\u0301\7\21\2\2"+
		"\u0301\u0302\7\16\2\2\u0302=\3\2\2\2\u0303\u0304\7]\2\2\u0304\u0306\7"+
		"\20\2\2\u0305\u0307\5@!\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u030a\7\16\2\2\u0309\u030b\5B\"\2\u030a\u0309\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\7\16\2\2\u030d"+
		"\u030f\5D#\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2"+
		"\2\u0310\u031c\7\21\2\2\u0311\u0315\7\3\2\2\u0312\u0314\5\60\31\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031d\7\4\2\2\u0319"+
		"\u031b\5\60\31\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3"+
		"\2\2\2\u031c\u0311\3\2\2\2\u031c\u031a\3\2\2\2\u031d?\3\2\2\2\u031e\u0320"+
		"\7\u00ab\2\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2"+
		"\2\u0321\u0324\5\u008eH\2\u0322\u0324\5J&\2\u0323\u031f\3\2\2\2\u0323"+
		"\u0322\3\2\2\2\u0324A\3\2\2\2\u0325\u0337\5\u008eH\2\u0326\u0327\7\u00bb"+
		"\2\2\u0327\u0328\t\4\2\2\u0328\u032a\7\u00bb\2\2\u0329\u032b\7+\2\2\u032a"+
		"\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u0334\3\2\2\2\u032c\u032d\7\17"+
		"\2\2\u032d\u0335\5\\/\2\u032e\u032f\7\17\2\2\u032f\u0331\7\u00bb\2\2\u0330"+
		"\u032e\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0335\3\2\2\2\u0334\u032c\3\2\2\2\u0334\u0330\3\2\2\2\u0335"+
		"\u0337\3\2\2\2\u0336\u0325\3\2\2\2\u0336\u0326\3\2\2\2\u0337C\3\2\2\2"+
		"\u0338\u033b\5j\66\2\u0339\u033b\5l\67\2\u033a\u0338\3\2\2\2\u033a\u0339"+
		"\3\2\2\2\u033bE\3\2\2\2\u033c\u033d\7]\2\2\u033d\u033f\7\20\2\2\u033e"+
		"\u0340\7\u00ab\2\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0342\7\u00bb\2\2\u0342\u0343\7\5\2\2\u0343\u0344\7\u00bb"+
		"\2\2\u0344\u0350\7\21\2\2\u0345\u0349\7\3\2\2\u0346\u0348\5\60\31\2\u0347"+
		"\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2"+
		"\2\2\u034a\u034c\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u0351\7\4\2\2\u034d"+
		"\u034f\5\60\31\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3"+
		"\2\2\2\u0350\u0345\3\2\2\2\u0350\u034e\3\2\2\2\u0351G\3\2\2\2\u0352\u0353"+
		"\7\u00b0\2\2\u0353\u0357\7\3\2\2\u0354\u0356\5\60\31\2\u0355\u0354\3\2"+
		"\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u035a\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u0367\7\4\2\2\u035b\u035c\7\u00b1"+
		"\2\2\u035c\u035d\7\20\2\2\u035d\u035e\7\u00bb\2\2\u035e\u035f\7\21\2\2"+
		"\u035f\u0363\7\3\2\2\u0360\u0362\5\60\31\2\u0361\u0360\3\2\2\2\u0362\u0365"+
		"\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0366\u0368\7\4\2\2\u0367\u035b\3\2\2\2\u0368\u0369\3\2"+
		"\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0374\3\2\2\2\u036b"+
		"\u036c\7\u00b2\2\2\u036c\u0370\7\3\2\2\u036d\u036f\5\60\31\2\u036e\u036d"+
		"\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0373\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\7\4\2\2\u0374\u036b\3\2"+
		"\2\2\u0374\u0375\3\2\2\2\u0375I\3\2\2\2\u0376\u0378\7\u00ab\2\2\u0377"+
		"\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7\u00bb"+
		"\2\2\u037a\u037c\7\23\2\2\u037b\u0377\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u0382\3\2\2\2\u037d\u037e\7\20\2\2\u037e\u037f\5\u008eH\2\u037f\u0380"+
		"\7\21\2\2\u0380\u0383\3\2\2\2\u0381\u0383\5\u008eH\2\u0382\u037d\3\2\2"+
		"\2\u0382\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u038a\7\6\2\2\u0385\u038b"+
		"\5\u008eH\2\u0386\u0387\7\20\2\2\u0387\u0388\5J&\2\u0388\u0389\7\21\2"+
		"\2\u0389\u038b\3\2\2\2\u038a\u0385\3\2\2\2\u038a\u0386\3\2\2\2\u038b\u038c"+
		"\3\2\2\2\u038c\u0392\7\5\2\2\u038d\u0393\5\u008eH\2\u038e\u038f\7\20\2"+
		"\2\u038f\u0390\5J&\2\u0390\u0391\7\21\2\2\u0391\u0393\3\2\2\2\u0392\u038d"+
		"\3\2\2\2\u0392\u038e\3\2\2\2\u0393K\3\2\2\2\u0394\u0396\7\u00ab\2\2\u0395"+
		"\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\7\u00bb"+
		"\2\2\u0398\u03a3\7)\2\2\u0399\u039a\7\23\2\2\u039a\u03a4\5N(\2\u039b\u039c"+
		"\7\22\2\2\u039c\u039d\7\u00bb\2\2\u039d\u039f\7)\2\2\u039e\u039b\3\2\2"+
		"\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a4"+
		"\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u0399\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a6\7\16\2\2\u03a6M\3\2\2\2\u03a7\u03be\5\\/\2"+
		"\u03a8\u03b9\7\'\2\2\u03a9\u03ae\5\u008eH\2\u03aa\u03ab\7\22\2\2\u03ab"+
		"\u03ad\5\u008eH\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03ba\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b6\5f\64\2\u03b2\u03b3\7\22\2\2\u03b3\u03b5\5f\64\2\u03b4\u03b2\3"+
		"\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03a9\3\2\2\2\u03b9\u03b1\3\2"+
		"\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7(\2\2\u03bc\u03be\3\2\2\2\u03bd"+
		"\u03a7\3\2\2\2\u03bd\u03a8\3\2\2\2\u03beO\3\2\2\2\u03bf\u03c0\7\u00bb"+
		"\2\2\u03c0\u03c1\7+\2\2\u03c1\u03c2\t\5\2\2\u03c2\u03c3\5\u008eH\2\u03c3"+
		"\u03c4\7\16\2\2\u03c4Q\3\2\2\2\u03c5\u03c6\7\u00b3\2\2\u03c6\u03c7\7\20"+
		"\2\2\u03c7\u03c8\7\u00bb\2\2\u03c8\u03c9\7\21\2\2\u03c9\u03cb\7\3\2\2"+
		"\u03ca\u03cc\5T+\2\u03cb\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cb"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03d1\5V,\2\u03d0"+
		"\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\7\4"+
		"\2\2\u03d3S\3\2\2\2\u03d4\u03d5\7=\2\2\u03d5\u03d6\5\u008eH\2\u03d6\u03da"+
		"\7\5\2\2\u03d7\u03d9\5\60\31\2\u03d8\u03d7\3\2\2\2\u03d9\u03dc\3\2\2\2"+
		"\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03dbU\3\2\2\2\u03dc\u03da\3"+
		"\2\2\2\u03dd\u03e9\7K\2\2\u03de\u03e2\7\3\2\2\u03df\u03e1\5\60\31\2\u03e0"+
		"\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2"+
		"\2\2\u03e3\u03e5\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03ea\7\4\2\2\u03e6"+
		"\u03e8\5\60\31\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\3"+
		"\2\2\2\u03e9\u03de\3\2\2\2\u03e9\u03e7\3\2\2\2\u03eaW\3\2\2\2\u03eb\u03ec"+
		"\7\u00b4\2\2\u03ec\u03ed\7\16\2\2\u03edY\3\2\2\2\u03ee\u03ef\7\u00b6\2"+
		"\2\u03ef\u03f0\7\16\2\2\u03f0[\3\2\2\2\u03f1\u03f2\7\u00bb\2\2\u03f2\u03fb"+
		"\7\20\2\2\u03f3\u03f8\5^\60\2\u03f4\u03f5\7\22\2\2\u03f5\u03f7\5^\60\2"+
		"\u03f6\u03f4\3\2\2\2\u03f7\u03fa\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9"+
		"\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u03f3\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\7\21\2\2\u03fe]\3\2\2\2"+
		"\u03ff\u0403\5\u008eH\2\u0400\u0401\7\u00bb\2\2\u0401\u0403\7+\2\2\u0402"+
		"\u03ff\3\2\2\2\u0402\u0400\3\2\2\2\u0403_\3\2\2\2\u0404\u0405\7\u00b7"+
		"\2\2\u0405\u0418\7\20\2\2\u0406\u0414\7\u00bb\2\2\u0407\u0408\7\u00bb"+
		"\2\2\u0408\u0414\7+\2\2\u0409\u040a\7\u00bb\2\2\u040a\u040b\7\17\2\2\u040b"+
		"\u0410\7\u00bb\2\2\u040c\u040d\7\17\2\2\u040d\u040f\7\u00bb\2\2\u040e"+
		"\u040c\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2"+
		"\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0406\3\2\2\2\u0413"+
		"\u0407\3\2\2\2\u0413\u0409\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\7\25"+
		"\2\2\u0416\u0413\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0418"+
		"\u0419\3\2\2\2\u0419\u0428\3\2\2\2\u041a\u0418\3\2\2\2\u041b\u0429\7\u00bb"+
		"\2\2\u041c\u041d\7\u00bb\2\2\u041d\u0429\7+\2\2\u041e\u041f\7\u00bb\2"+
		"\2\u041f\u0420\7\17\2\2\u0420\u0425\7\u00bb\2\2\u0421\u0422\7\17\2\2\u0422"+
		"\u0424\7\u00bb\2\2\u0423\u0421\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0428"+
		"\u041b\3\2\2\2\u0428\u041c\3\2\2\2\u0428\u041e\3\2\2\2\u0429\u042a\3\2"+
		"\2\2\u042a\u042b\7\21\2\2\u042b\u042c\7\16\2\2\u042ca\3\2\2\2\u042d\u042f"+
		"\7\u00ab\2\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2"+
		"\2\u0430\u0431\7\u00bb\2\2\u0431\u0432\7\23\2\2\u0432\u0433\7\u00bb\2"+
		"\2\u0433\u0436\7\20\2\2\u0434\u0435\7\u00bb\2\2\u0435\u0437\7\22\2\2\u0436"+
		"\u0434\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2"+
		"\2\2\u0439\u043a\3\2\2\2\u043a\u043b\7\u00b8\2\2\u043b\u043c\7\20\2\2"+
		"\u043c\u0441\7\u00bb\2\2\u043d\u043e\7\22\2\2\u043e\u0440\7\u00bb\2\2"+
		"\u043f\u043d\3\2\2\2\u0440\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442"+
		"\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0441\3\2\2\2\u0444\u0445\7\21\2\2"+
		"\u0445\u0446\5.\30\2\u0446\u0447\7\21\2\2\u0447\u0448\7\16\2\2\u0448c"+
		"\3\2\2\2\u0449\u044b\7\u00ab\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2"+
		"\2\u044b\u044c\3\2\2\2\u044c\u044d\7\u00bb\2\2\u044d\u044e\7\23\2\2\u044e"+
		"\u044f\5f\64\2\u044f\u0450\7\16\2\2\u0450e\3\2\2\2\u0451\u0452\7\3\2\2"+
		"\u0452\u0453\7\u00bb\2\2\u0453\u0454\7\5\2\2\u0454\u045b\5h\65\2\u0455"+
		"\u0456\7\22\2\2\u0456\u0457\7\u00bb\2\2\u0457\u0458\7\5\2\2\u0458\u045a"+
		"\5h\65\2\u0459\u0455\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\7\4"+
		"\2\2\u045fg\3\2\2\2\u0460\u0464\5\u008eH\2\u0461\u0464\5f\64\2\u0462\u0464"+
		"\5N(\2\u0463\u0460\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0462\3\2\2\2\u0464"+
		"i\3\2\2\2\u0465\u0469\7\u00bb\2\2\u0466\u046a\7\13\2\2\u0467\u0468\t\6"+
		"\2\2\u0468\u046a\5\u008eH\2\u0469\u0466\3\2\2\2\u0469\u0467\3\2\2\2\u046a"+
		"\u046e\3\2\2\2\u046b\u046c\7\13\2\2\u046c\u046e\7\u00bb\2\2\u046d\u0465"+
		"\3\2\2\2\u046d\u046b\3\2\2\2\u046ek\3\2\2\2\u046f\u0473\7\u00bb\2\2\u0470"+
		"\u0474\7\f\2\2\u0471\u0472\t\7\2\2\u0472\u0474\5\u008eH\2\u0473\u0470"+
		"\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0478\3\2\2\2\u0475\u0476\7\f\2\2\u0476"+
		"\u0478\7\u00bb\2\2\u0477\u046f\3\2\2\2\u0477\u0475\3\2\2\2\u0478m\3\2"+
		"\2\2\u0479\u047b\7\u00ab\2\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u047d\7\u00bb\2\2\u047d\u047e\7\23\2\2\u047e\u047f"+
		"\7\u00bb\2\2\u047f\u0480\7\17\2\2\u0480\u0485\7\u00bb\2\2\u0481\u0482"+
		"\7\17\2\2\u0482\u0484\7\u00bb\2\2\u0483\u0481\3\2\2\2\u0484\u0487\3\2"+
		"\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487"+
		"\u0485\3\2\2\2\u0488\u0489\7\16\2\2\u0489o\3\2\2\2\u048a\u048b\7\u00bb"+
		"\2\2\u048b\u048c\7\17\2\2\u048c\u0491\7\u00bb\2\2\u048d\u048e\7\17\2\2"+
		"\u048e\u0490\7\u00bb\2\2\u048f\u048d\3\2\2\2\u0490\u0493\3\2\2\2\u0491"+
		"\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u0491\3\2"+
		"\2\2\u0494\u0495\7\23\2\2\u0495\u0496\5\u008eH\2\u0496\u0497\7\16\2\2"+
		"\u0497q\3\2\2\2\u0498\u0499\7\u00ab\2\2\u0499\u04a3\7\u00bb\2\2\u049a"+
		"\u049b\7\22\2\2\u049b\u049d\7\u00bb\2\2\u049c\u049a\3\2\2\2\u049d\u04a0"+
		"\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a4\3\2\2\2\u04a0"+
		"\u049e\3\2\2\2\u04a1\u04a2\7\23\2\2\u04a2\u04a4\5\u008eH\2\u04a3\u049e"+
		"\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7\16\2\2"+
		"\u04a6s\3\2\2\2\u04a7\u04a9\7\u00ab\2\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9"+
		"\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\7\u00bb\2\2\u04ab\u04b1\t\5\2"+
		"\2\u04ac\u04ad\7\u00bb\2\2\u04ad\u04b2\7+\2\2\u04ae\u04b2\5f\64\2\u04af"+
		"\u04b2\5\\/\2\u04b0\u04b2\5\u008eH\2\u04b1\u04ac\3\2\2\2\u04b1\u04ae\3"+
		"\2\2\2\u04b1\u04af\3\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b4\7\16\2\2\u04b4u\3\2\2\2\u04b5\u04ba\7\u00af\2\2\u04b6\u04bb\5\u008e"+
		"H\2\u04b7\u04bb\5j\66\2\u04b8\u04bb\5l\67\2\u04b9\u04bb\5J&\2\u04ba\u04b6"+
		"\3\2\2\2\u04ba\u04b7\3\2\2\2\u04ba\u04b8\3\2\2\2\u04ba\u04b9\3\2\2\2\u04bb"+
		"\u04bc\3\2\2\2\u04bc\u04bd\7\16\2\2\u04bdw\3\2\2\2\u04be\u04c3\5\u00e6"+
		"t\2\u04bf\u04c2\5|?\2\u04c0\u04c2\5z>\2\u04c1\u04bf\3\2\2\2\u04c1\u04c0"+
		"\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4"+
		"y\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c6\u04da\5\u00dan\2\u04c7\u04c8\7\20"+
		"\2\2\u04c8\u04ca\5\u00ceh\2\u04c9\u04cb\5\u00f0y\2\u04ca\u04c9\3\2\2\2"+
		"\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\7\21\2\2\u04cd\u04db"+
		"\3\2\2\2\u04ce\u04cf\7\20\2\2\u04cf\u04d1\5\u00ceh\2\u04d0\u04d2\5\u00f0"+
		"y\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u04d4\7\22\2\2\u04d4\u04d6\5\u00ceh\2\u04d5\u04d7\5\u00f0y\2\u04d6\u04d5"+
		"\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\7\21\2\2"+
		"\u04d9\u04db\3\2\2\2\u04da\u04c7\3\2\2\2\u04da\u04ce\3\2\2\2\u04da\u04db"+
		"\3\2\2\2\u04db{\3\2\2\2\u04dc\u04dd\7D\2\2\u04dd\u04df\5\u00dan\2\u04de"+
		"\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04ec\3\2\2\2\u04e0\u04ed\5~"+
		"@\2\u04e1\u04ed\5\u0080A\2\u04e2\u04ed\5\u0082B\2\u04e3\u04ed\5\u0084"+
		"C\2\u04e4\u04e5\7?\2\2\u04e5\u04e6\7\20\2\2\u04e6\u04e7\5\u008eH\2\u04e7"+
		"\u04e8\7\21\2\2\u04e8\u04ed\3\2\2\2\u04e9\u04ed\5\u0086D\2\u04ea\u04eb"+
		"\7@\2\2\u04eb\u04ed\5\u00e8u\2\u04ec\u04e0\3\2\2\2\u04ec\u04e1\3\2\2\2"+
		"\u04ec\u04e2\3\2\2\2\u04ec\u04e3\3\2\2\2\u04ec\u04e4\3\2\2\2\u04ec\u04e9"+
		"\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ed}\3\2\2\2\u04ee\u04ef\7\u0087\2\2\u04ef"+
		"\u04f1\7s\2\2\u04f0\u04f2\t\b\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2"+
		"\2\2\u04f2\u04f4\3\2\2\2\u04f3\u04f5\7\67\2\2\u04f4\u04f3\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\177\3\2\2\2\u04f6\u04f7\5\u009aN\2\u04f7\u0081\3"+
		"\2\2\2\u04f8\u04f9\7{\2\2\u04f9\u04fa\7}\2\2\u04fa\u0083\3\2\2\2\u04fb"+
		"\u04fc\7}\2\2\u04fc\u0085\3\2\2\2\u04fd\u0505\7K\2\2\u04fe\u0506\5\u0088"+
		"E\2\u04ff\u0500\7\20\2\2\u0500\u0501\5\u008eH\2\u0501\u0502\7\21\2\2\u0502"+
		"\u0506\3\2\2\2\u0503\u0506\5\u008aF\2\u0504\u0506\5\u00f0y\2\u0505\u04fe"+
		"\3\2\2\2\u0505\u04ff\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0504\3\2\2\2\u0506"+
		"\u0508\3\2\2\2\u0507\u0509\5\u008cG\2\u0508\u0507\3\2\2\2\u0508\u0509"+
		"\3\2\2\2\u0509\u0087\3\2\2\2\u050a\u050d\5\u00ceh\2\u050b\u050d\5\u00d0"+
		"i\2\u050c\u050a\3\2\2\2\u050c\u050b\3\2\2\2\u050d\u0089\3\2\2\2\u050e"+
		"\u050f\7y\2\2\u050f\u0510\7\20\2\2\u0510\u0511\5\u008eH\2\u0511\u0512"+
		"\7\21\2\2\u0512\u008b\3\2\2\2\u0513\u0515\7\r\2\2\u0514\u0516\5\u00f0"+
		"y\2\u0515\u0514\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0515\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u008d\3\2\2\2\u0519\u051a\bH\1\2\u051a\u0521\5\u00d0"+
		"i\2\u051b\u0521\5\u0092J\2\u051c\u0521\5\u0090I\2\u051d\u0521\5\u0094"+
		"K\2\u051e\u0521\5\u0096L\2\u051f\u0521\5\u0098M\2\u0520\u0519\3\2\2\2"+
		"\u0520\u051b\3\2\2\2\u0520\u051c\3\2\2\2\u0520\u051d\3\2\2\2\u0520\u051e"+
		"\3\2\2\2\u0520\u051f\3\2\2\2\u0521\u0549\3\2\2\2\u0522\u0524\f\7\2\2\u0523"+
		"\u0525\7+\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0544\3\2"+
		"\2\2\u0526\u0545\7\24\2\2\u0527\u0545\7\31\2\2\u0528\u0545\7\32\2\2\u0529"+
		"\u0545\7\25\2\2\u052a\u0545\7\26\2\2\u052b\u0545\7\30\2\2\u052c\u0545"+
		"\7\36\2\2\u052d\u0545\7 \2\2\u052e\u0545\7!\2\2\u052f\u0545\7\"\2\2\u0530"+
		"\u0545\7#\2\2\u0531\u0545\7\23\2\2\u0532\u0545\7$\2\2\u0533\u0545\7%\2"+
		"\2\u0534\u0545\7&\2\2\u0535\u0545\7\33\2\2\u0536\u0545\7\34\2\2\u0537"+
		"\u0545\7\35\2\2\u0538\u0545\7\37\2\2\u0539\u053b\7p\2\2\u053a\u053c\7"+
		"{\2\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u0545\3\2\2\2\u053d"+
		"\u0545\7g\2\2\u053e\u0545\7u\2\2\u053f\u0545\7a\2\2\u0540\u0545\7w\2\2"+
		"\u0541\u0545\7\u008c\2\2\u0542\u0545\7\63\2\2\u0543\u0545\7\u0082\2\2"+
		"\u0544\u0526\3\2\2\2\u0544\u0527\3\2\2\2\u0544\u0528\3\2\2\2\u0544\u0529"+
		"\3\2\2\2\u0544\u052a\3\2\2\2\u0544\u052b\3\2\2\2\u0544\u052c\3\2\2\2\u0544"+
		"\u052d\3\2\2\2\u0544\u052e\3\2\2\2\u0544\u052f\3\2\2\2\u0544\u0530\3\2"+
		"\2\2\u0544\u0531\3\2\2\2\u0544\u0532\3\2\2\2\u0544\u0533\3\2\2\2\u0544"+
		"\u0534\3\2\2\2\u0544\u0535\3\2\2\2\u0544\u0536\3\2\2\2\u0544\u0537\3\2"+
		"\2\2\u0544\u0538\3\2\2\2\u0544\u0539\3\2\2\2\u0544\u053d\3\2\2\2\u0544"+
		"\u053e\3\2\2\2\u0544\u053f\3\2\2\2\u0544\u0540\3\2\2\2\u0544\u0541\3\2"+
		"\2\2\u0544\u0542\3\2\2\2\u0544\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546"+
		"\u0548\5\u008eH\b\u0547\u0522\3\2\2\2\u0548\u054b\3\2\2\2\u0549\u0547"+
		"\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u008f\3\2\2\2\u054b\u0549\3\2\2\2\u054c"+
		"\u054d\5\u00dep\2\u054d\u054e\7\17\2\2\u054e\u0550\3\2\2\2\u054f\u054c"+
		"\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\5\u00e2r"+
		"\2\u0552\u0553\7\17\2\2\u0553\u0555\3\2\2\2\u0554\u054f\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557\5\u00e6t\2\u0557\u0091"+
		"\3\2\2\2\u0558\u0559\t\t\2\2\u0559\u055a\5\u008eH\2\u055a\u0093\3\2\2"+
		"\2\u055b\u055c\5\u00dco\2\u055c\u0569\7\20\2\2\u055d\u055f\7Q\2\2\u055e"+
		"\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0565\5\u008e"+
		"H\2\u0561\u0562\7\22\2\2\u0562\u0564\5\u008eH\2\u0563\u0561\3\2\2\2\u0564"+
		"\u0567\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u056a\3\2"+
		"\2\2\u0567\u0565\3\2\2\2\u0568\u056a\7\24\2\2\u0569\u055e\3\2\2\2\u0569"+
		"\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056c\7\21"+
		"\2\2\u056c\u0095\3\2\2\2\u056d\u056e\7\20\2\2\u056e\u056f\5\u008eH\2\u056f"+
		"\u0570\7\21\2\2\u0570\u0097\3\2\2\2\u0571\u0573\7{\2\2\u0572\u0571\3\2"+
		"\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\7Z\2\2\u0575"+
		"\u0572\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\7\20"+
		"\2\2\u0578\u0579\5\26\f\2\u0579\u057a\7\21\2\2\u057a\u0099\3\2\2\2\u057b"+
		"\u057f\7\u008b\2\2\u057c\u057d\5\u00dep\2\u057d\u057e\7\17\2\2\u057e\u0580"+
		"\3\2\2\2\u057f\u057c\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\3\2\2\2\u0581"+
		"\u058d\5\u00eav\2\u0582\u0583\7\20\2\2\u0583\u0588\5\u00a2R\2\u0584\u0585"+
		"\7\22\2\2\u0585\u0587\5\u00a2R\2\u0586\u0584\3\2\2\2\u0587\u058a\3\2\2"+
		"\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a\u0588"+
		"\3\2\2\2\u058b\u058c\7\21\2\2\u058c\u058e\3\2\2\2\u058d\u0582\3\2\2\2"+
		"\u058d\u058e\3\2\2\2\u058e\u0592\3\2\2\2\u058f\u0591\5\u009cO\2\u0590"+
		"\u058f\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u05a2\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0597\7{\2\2\u0596"+
		"\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059d\7L"+
		"\2\2\u0599\u059a\7j\2\2\u059a\u059e\7M\2\2\u059b\u059c\7j\2\2\u059c\u059e"+
		"\7f\2\2\u059d\u0599\3\2\2\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2\2\u059e"+
		"\u05a0\3\2\2\2\u059f\u05a1\7V\2\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2"+
		"\2\2\u05a1\u05a3\3\2\2\2\u05a2\u0596\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3"+
		"\u009b\3\2\2\2\u05a4\u05a7\5\u009eP\2\u05a5\u05a7\5\u00a0Q\2\u05a6\u05a4"+
		"\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7\u009d\3\2\2\2\u05a8\u05a9\7\u0080\2"+
		"\2\u05a9\u05b2\t\n\2\2\u05aa\u05ab\7\u0097\2\2\u05ab\u05b3\7}\2\2\u05ac"+
		"\u05ad\7\u0097\2\2\u05ad\u05b3\7K\2\2\u05ae\u05b3\7<\2\2\u05af\u05b3\7"+
		"\u0091\2\2\u05b0\u05b1\7z\2\2\u05b1\u05b3\7-\2\2\u05b2\u05aa\3\2\2\2\u05b2"+
		"\u05ac\3\2\2\2\u05b2\u05ae\3\2\2\2\u05b2\u05af\3\2\2\2\u05b2\u05b0\3\2"+
		"\2\2\u05b3\u009f\3\2\2\2\u05b4\u05b5\7w\2\2\u05b5\u05b6\5\u00dan\2\u05b6"+
		"\u00a1\3\2\2\2\u05b7\u05b8\5\u00dan\2\u05b8\u00a3\3\2\2\2\u05b9\u05bc"+
		"\5\u00e6t\2\u05ba\u05bb\7@\2\2\u05bb\u05bd\5\u00e8u\2\u05bc\u05ba\3\2"+
		"\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be\u05c0\t\b\2\2\u05bf"+
		"\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u00a5\3\2\2\2\u05c1\u05c2\7D"+
		"\2\2\u05c2\u05c4\5\u00dan\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05ce\3\2\2\2\u05c5\u05cf\5\u00a8U\2\u05c6\u05cf\5\u00aeX\2\u05c7\u05cf"+
		"\5\u00acW\2\u05c8\u05c9\7?\2\2\u05c9\u05ca\7\20\2\2\u05ca\u05cb\5\u008e"+
		"H\2\u05cb\u05cc\7\21\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cf\5\u00aaV\2\u05ce"+
		"\u05c5\3\2\2\2\u05ce\u05c6\3\2\2\2\u05ce\u05c7\3\2\2\2\u05ce\u05c8\3\2"+
		"\2\2\u05ce\u05cd\3\2\2\2\u05cf\u00a7\3\2\2\2\u05d0\u05d1\7\u0087\2\2\u05d1"+
		"\u05d2\7s\2\2\u05d2\u05d3\7\20\2\2\u05d3\u05d8\5\u00a4S\2\u05d4\u05d5"+
		"\7\22\2\2\u05d5\u05d7\5\u00a4S\2\u05d6\u05d4\3\2\2\2\u05d7\u05da\3\2\2"+
		"\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05d8"+
		"\3\2\2\2\u05db\u05dc\7\21\2\2\u05dc\u00a9\3\2\2\2\u05dd\u05de\7^\2\2\u05de"+
		"\u05df\7s\2\2\u05df\u05e0\7\20\2\2\u05e0\u05e5\5\u00b0Y\2\u05e1\u05e2"+
		"\7\22\2\2\u05e2\u05e4\5\u00b0Y\2\u05e3\u05e1\3\2\2\2\u05e4\u05e7\3\2\2"+
		"\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05e5"+
		"\3\2\2\2\u05e8\u05e9\7\21\2\2\u05e9\u05ea\5\u009aN\2\u05ea\u00ab\3\2\2"+
		"\2\u05eb\u05ed\7\u00a0\2\2\u05ec\u05ee\7s\2\2\u05ed\u05ec\3\2\2\2\u05ed"+
		"\u05ee\3\2\2\2\u05ee\u05f0\3\2\2\2\u05ef\u05f1\5\u00dan\2\u05f0\u05ef"+
		"\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\7\20\2\2"+
		"\u05f3\u05f8\5\u00a4S\2\u05f4\u05f5\7\22\2\2\u05f5\u05f7\5\u00a4S\2\u05f6"+
		"\u05f4\3\2\2\2\u05f7\u05fa\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2"+
		"\2\2\u05f9\u05fb\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fb\u05fc\7\21\2\2\u05fc"+
		"\u00ad\3\2\2\2\u05fd\u05ff\7s\2\2\u05fe\u0600\5\u00dan\2\u05ff\u05fe\3"+
		"\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\7\20\2\2\u0602"+
		"\u0607\5\u00a4S\2\u0603\u0604\7\22\2\2\u0604\u0606\5\u00a4S\2\u0605\u0603"+
		"\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u060a\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u060b\7\21\2\2\u060b\u00af\3"+
		"\2\2\2\u060c\u060d\5\u00e6t\2\u060d\u00b1\3\2\2\2\u060e\u060f\5\u00de"+
		"p\2\u060f\u0610\7\17\2\2\u0610\u0612\3\2\2\2\u0611\u060e\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0619\5\u00e2r\2\u0614\u0615"+
		"\7i\2\2\u0615\u0616\7;\2\2\u0616\u061a\5\u00ecw\2\u0617\u0618\7{\2\2\u0618"+
		"\u061a\7i\2\2\u0619\u0614\3\2\2\2\u0619\u0617\3\2\2\2\u0619\u061a\3\2"+
		"\2\2\u061a\u00b3\3\2\2\2\u061b\u061e\5\u008eH\2\u061c\u061d\7@\2\2\u061d"+
		"\u061f\5\u00e8u\2\u061e\u061c\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621"+
		"\3\2\2\2\u0620\u0622\t\b\2\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622"+
		"\u00b5\3\2\2\2\u0623\u0627\5\u00ceh\2\u0624\u0627\5\u00dan\2\u0625\u0627"+
		"\7\u00be\2\2\u0626\u0623\3\2\2\2\u0626\u0624\3\2\2\2\u0626\u0625\3\2\2"+
		"\2\u0627\u00b7\3\2\2\2\u0628\u0634\5\u00e2r\2\u0629\u062a\7\20\2\2\u062a"+
		"\u062f\5\u00e6t\2\u062b\u062c\7\22\2\2\u062c\u062e\5\u00e6t\2\u062d\u062b"+
		"\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630"+
		"\u0632\3\2\2\2\u0631\u062f\3\2\2\2\u0632\u0633\7\21\2\2\u0633\u0635\3"+
		"\2\2\2\u0634\u0629\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2\2\u0636"+
		"\u0637\7\64\2\2\u0637\u0638\7\20\2\2\u0638\u0639\5\32\16\2\u0639\u063a"+
		"\7\21\2\2\u063a\u00b9\3\2\2\2\u063b\u0648\7\24\2\2\u063c\u063d\5\u00e2"+
		"r\2\u063d\u063e\7\17\2\2\u063e\u063f\7\24\2\2\u063f\u0648\3\2\2\2\u0640"+
		"\u0645\5\u008eH\2\u0641\u0643\7\64\2\2\u0642\u0641\3\2\2\2\u0642\u0643"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0646\5\u00d6l\2\u0645\u0642\3\2\2"+
		"\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u063b\3\2\2\2\u0647\u063c"+
		"\3\2\2\2\u0647\u0640\3\2\2\2\u0648\u00bb\3\2\2\2\u0649\u064a\5\u00dep"+
		"\2\u064a\u064b\7\17\2\2\u064b\u064d\3\2\2\2\u064c\u0649\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0653\5\u00e2r\2\u064f\u0651"+
		"\7\64\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2"+
		"\u0652\u0654\5\u00eex\2\u0653\u0650\3\2\2\2\u0653\u0654\3\2\2\2\u0654"+
		"\u065a\3\2\2\2\u0655\u0656\7i\2\2\u0656\u0657\7;\2\2\u0657\u065b\5\u00ec"+
		"w\2\u0658\u0659\7{\2\2\u0659\u065b\7i\2\2\u065a\u0655\3\2\2\2\u065a\u0658"+
		"\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u0679\3\2\2\2\u065c\u0666\7\20\2\2"+
		"\u065d\u0662\5\u00bc_\2\u065e\u065f\7\22\2\2\u065f\u0661\5\u00bc_\2\u0660"+
		"\u065e\3\2\2\2\u0661\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2"+
		"\2\2\u0663\u0667\3\2\2\2\u0664\u0662\3\2\2\2\u0665\u0667\5\u00be`\2\u0666"+
		"\u065d\3\2\2\2\u0666\u0665\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u066d\7\21"+
		"\2\2\u0669\u066b\7\64\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066e\5\u00eex\2\u066d\u066a\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u0679\3\2\2\2\u066f\u0670\7\20\2\2\u0670\u0671\5\u00c4"+
		"c\2\u0671\u0676\7\21\2\2\u0672\u0674\7\64\2\2\u0673\u0672\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\5\u00eex\2\u0676\u0673"+
		"\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u064c\3\2\2\2\u0678"+
		"\u065c\3\2\2\2\u0678\u066f\3\2\2\2\u0679\u00bd\3\2\2\2\u067a\u0681\5\u00bc"+
		"_\2\u067b\u067c\5\u00c0a\2\u067c\u067d\5\u00bc_\2\u067d\u067e\5\u00c2"+
		"b\2\u067e\u0680\3\2\2\2\u067f\u067b\3\2\2\2\u0680\u0683\3\2\2\2\u0681"+
		"\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u00bf\3\2\2\2\u0683\u0681\3\2"+
		"\2\2\u0684\u068e\7\22\2\2\u0685\u0687\7t\2\2\u0686\u0688\7\u0084\2\2\u0687"+
		"\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068b\3\2\2\2\u0689\u068b\7k"+
		"\2\2\u068a\u0685\3\2\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u068e\7r\2\2\u068d\u0684\3\2\2\2\u068d\u068a\3\2"+
		"\2\2\u068e\u00c1\3\2\2\2\u068f\u0690\7\u0080\2\2\u0690\u0691\5\u008eH"+
		"\2\u0691\u00c3\3\2\2\2\u0692\u0694\7\u0096\2\2\u0693\u0695\t\3\2\2\u0694"+
		"\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u069b\5\u00ba"+
		"^\2\u0697\u0698\7\22\2\2\u0698\u069a\5\u00ba^\2\u0699\u0697\3\2\2\2\u069a"+
		"\u069d\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069f\3\2"+
		"\2\2\u069d\u069b\3\2\2\2\u069e\u06a0\5\u00c6d\2\u069f\u069e\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a2\3\2\2\2\u06a1\u06a3\5\u00c8e\2\u06a2\u06a1"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a6\5\u00caf"+
		"\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06c4\3\2\2\2\u06a7\u06a8"+
		"\7\u00a4\2\2\u06a8\u06a9\7\20\2\2\u06a9\u06ae\5\u008eH\2\u06aa\u06ab\7"+
		"\22\2\2\u06ab\u06ad\5\u008eH\2\u06ac\u06aa\3\2\2\2\u06ad\u06b0\3\2\2\2"+
		"\u06ae\u06ac\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06ae"+
		"\3\2\2\2\u06b1\u06c0\7\21\2\2\u06b2\u06b3\7\22\2\2\u06b3\u06b4\7\20\2"+
		"\2\u06b4\u06b9\5\u008eH\2\u06b5\u06b6\7\22\2\2\u06b6\u06b8\5\u008eH\2"+
		"\u06b7\u06b5\3\2\2\2\u06b8\u06bb\3\2\2\2\u06b9\u06b7\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06bc\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bc\u06bd\7\21\2\2"+
		"\u06bd\u06bf\3\2\2\2\u06be\u06b2\3\2\2\2\u06bf\u06c2\3\2\2\2\u06c0\u06be"+
		"\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c3"+
		"\u0692\3\2\2\2\u06c3\u06a7\3\2\2\2\u06c4\u00c5\3\2\2\2\u06c5\u06cf\7_"+
		"\2\2\u06c6\u06cb\5\u00bc_\2\u06c7\u06c8\7\22\2\2\u06c8\u06ca\5\u00bc_"+
		"\2\u06c9\u06c7\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cb\u06cc"+
		"\3\2\2\2\u06cc\u06d0\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\u06d0\5\u00be`"+
		"\2\u06cf\u06c6\3\2\2\2\u06cf\u06ce\3\2\2\2\u06d0\u00c7\3\2\2\2\u06d1\u06d2"+
		"\7\u00a8\2\2\u06d2\u06d3\5\u008eH\2\u06d3\u00c9\3\2\2\2\u06d4\u06d5\7"+
		"b\2\2\u06d5\u06d6\7;\2\2\u06d6\u06db\5\u008eH\2\u06d7\u06d8\7\22\2\2\u06d8"+
		"\u06da\5\u008eH\2\u06d9\u06d7\3\2\2\2\u06da\u06dd\3\2\2\2\u06db\u06d9"+
		"\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06de"+
		"\u06e0\5\u00ccg\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u00cb"+
		"\3\2\2\2\u06e1\u06e2\7c\2\2\u06e2\u06e3\5\u008eH\2\u06e3\u00cd\3\2\2\2"+
		"\u06e4\u06e6\t\13\2\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e7"+
		"\3\2\2\2\u06e7\u06ea\7\u00bc\2\2\u06e8\u06ea\7\24\2\2\u06e9\u06e5\3\2"+
		"\2\2\u06e9\u06e8\3\2\2\2\u06ea\u00cf\3\2\2\2\u06eb\u06ec\t\f\2\2\u06ec"+
		"\u00d1\3\2\2\2\u06ed\u06ee\7\u00be\2\2\u06ee\u00d3\3\2\2\2\u06ef\u06f2"+
		"\5\u008eH\2\u06f0\u06f2\5x=\2\u06f1\u06ef\3\2\2\2\u06f1\u06f0\3\2\2\2"+
		"\u06f2\u00d5\3\2\2\2\u06f3\u06f4\t\r\2\2\u06f4\u00d7\3\2\2\2\u06f5\u06f6"+
		"\t\16\2\2\u06f6\u00d9\3\2\2\2\u06f7\u06f8\5\u00f0y\2\u06f8\u00db\3\2\2"+
		"\2\u06f9\u06fa\5\u00f0y\2\u06fa\u00dd\3\2\2\2\u06fb\u06fc\5\u00f0y\2\u06fc"+
		"\u00df\3\2\2\2\u06fd\u06fe\5\u00f0y\2\u06fe\u00e1\3\2\2\2\u06ff\u0700"+
		"\5\u00f2z\2\u0700\u00e3\3\2\2\2\u0701\u0702\5\u00f0y\2\u0702\u00e5\3\2"+
		"\2\2\u0703\u0704\5\u00f0y\2\u0704\u00e7\3\2\2\2\u0705\u0706\5\u00f0y\2"+
		"\u0706\u00e9\3\2\2\2\u0707\u0708\5\u00f0y\2\u0708\u00eb\3\2\2\2\u0709"+
		"\u070a\5\u00f0y\2\u070a\u00ed\3\2\2\2\u070b\u070c\5\u00f0y\2\u070c\u00ef"+
		"\3\2\2\2\u070d\u0715\7\u00bb\2\2\u070e\u0715\5\u00d8m\2\u070f\u0715\7"+
		"\u00be\2\2\u0710\u0711\7\20\2\2\u0711\u0712\5\u00f0y\2\u0712\u0713\7\21"+
		"\2\2\u0713\u0715\3\2\2\2\u0714\u070d\3\2\2\2\u0714\u070e\3\2\2\2\u0714"+
		"\u070f\3\2\2\2\u0714\u0710\3\2\2\2\u0715\u00f1\3\2\2\2\u0716\u071d\7\u00bb"+
		"\2\2\u0717\u071d\7\u00be\2\2\u0718\u0719\7\20\2\2\u0719\u071a\5\u00f2"+
		"z\2\u071a\u071b\7\21\2\2\u071b\u071d\3\2\2\2\u071c\u0716\3\2\2\2\u071c"+
		"\u0717\3\2\2\2\u071c\u0718\3\2\2\2\u071d\u00f3\3\2\2\2\u00e7\u00f7\u0100"+
		"\u0104\u0108\u0112\u0119\u0123\u0126\u0135\u013a\u0143\u0145\u014c\u0153"+
		"\u0159\u015e\u016a\u016d\u0173\u0175\u017c\u0185\u018a\u0193\u019e\u01a5"+
		"\u01ab\u01b5\u01b8\u01be\u01c0\u01c4\u01cb\u01cf\u01d2\u01d5\u01de\u01e9"+
		"\u01f0\u01f3\u0202\u0206\u0209\u0213\u0219\u021e\u0222\u022d\u023b\u0245"+
		"\u024f\u0255\u027b\u0285\u028a\u028c\u0291\u0295\u02ae\u02b7\u02bc\u02c7"+
		"\u02cc\u02ce\u02d5\u02da\u02dc\u02e6\u02eb\u02ed\u02f4\u02f9\u02fb\u0306"+
		"\u030a\u030e\u0315\u031a\u031c\u031f\u0323\u032a\u0332\u0334\u0336\u033a"+
		"\u033f\u0349\u034e\u0350\u0357\u0363\u0369\u0370\u0374\u0377\u037b\u0382"+
		"\u038a\u0392\u0395\u03a0\u03a3\u03ae\u03b6\u03b9\u03bd\u03cd\u03d0\u03da"+
		"\u03e2\u03e7\u03e9\u03f8\u03fb\u0402\u0410\u0413\u0418\u0425\u0428\u042e"+
		"\u0438\u0441\u044a\u045b\u0463\u0469\u046d\u0473\u0477\u047a\u0485\u0491"+
		"\u049e\u04a3\u04a8\u04b1\u04ba\u04c1\u04c3\u04ca\u04d1\u04d6\u04da\u04de"+
		"\u04ec\u04f1\u04f4\u0505\u0508\u050c\u0517\u0520\u0524\u053b\u0544\u0549"+
		"\u054f\u0554\u055e\u0565\u0569\u0572\u0575\u057f\u0588\u058d\u0592\u0596"+
		"\u059d\u05a0\u05a2\u05a6\u05b2\u05bc\u05bf\u05c3\u05ce\u05d8\u05e5\u05ed"+
		"\u05f0\u05f8\u05ff\u0607\u0611\u0619\u061e\u0621\u0626\u062f\u0634\u0642"+
		"\u0645\u0647\u064c\u0650\u0653\u065a\u0662\u0666\u066a\u066d\u0673\u0676"+
		"\u0678\u0681\u0687\u068a\u068d\u0694\u069b\u069f\u06a2\u06a5\u06ae\u06b9"+
		"\u06c0\u06c3\u06cb\u06cf\u06db\u06df\u06e5\u06e9\u06f1\u0714\u071c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}