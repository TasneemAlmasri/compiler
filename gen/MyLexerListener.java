// Generated from C:/Users/USER/IdeaProjects/third/src/MyLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLexerParser}.
 */
public interface MyLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLexerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLexerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(MyLexerParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(MyLexerParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#defparameter}.
	 * @param ctx the parse tree
	 */
	void enterDefparameter(MyLexerParser.DefparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#defparameter}.
	 * @param ctx the parse tree
	 */
	void exitDefparameter(MyLexerParser.DefparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#defun}.
	 * @param ctx the parse tree
	 */
	void enterDefun(MyLexerParser.DefunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#defun}.
	 * @param ctx the parse tree
	 */
	void exitDefun(MyLexerParser.DefunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MyLexerParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MyLexerParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#lambda_definition}.
	 * @param ctx the parse tree
	 */
	void enterLambda_definition(MyLexerParser.Lambda_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#lambda_definition}.
	 * @param ctx the parse tree
	 */
	void exitLambda_definition(MyLexerParser.Lambda_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MyLexerParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MyLexerParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyLexerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyLexerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MyLexerParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MyLexerParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(MyLexerParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(MyLexerParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLexerParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MyLexerParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLexerParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MyLexerParser.BodyContext ctx);
}