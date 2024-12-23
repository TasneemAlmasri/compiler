// Generated from C:/Users/USER/IdeaProjects/third/src/MyParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(MyParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#defparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefparameter(MyParser.DefparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#defun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefun(MyParser.DefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MyParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#lambda_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_definition(MyParser.Lambda_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MyParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MyParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(MyParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MyParser.BodyContext ctx);
}