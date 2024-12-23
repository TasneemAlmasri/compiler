// Generated from C:/Users/USER/IdeaProjects/third/src/MyParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(MyParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(MyParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defparameter}.
	 * @param ctx the parse tree
	 */
	void enterDefparameter(MyParser.DefparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defparameter}.
	 * @param ctx the parse tree
	 */
	void exitDefparameter(MyParser.DefparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defun}.
	 * @param ctx the parse tree
	 */
	void enterDefun(MyParser.DefunContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defun}.
	 * @param ctx the parse tree
	 */
	void exitDefun(MyParser.DefunContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MyParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#lambda_definition}.
	 * @param ctx the parse tree
	 */
	void enterLambda_definition(MyParser.Lambda_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#lambda_definition}.
	 * @param ctx the parse tree
	 */
	void exitLambda_definition(MyParser.Lambda_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MyParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MyParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(MyParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(MyParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(MyParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(MyParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MyParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MyParser.BodyContext ctx);
}