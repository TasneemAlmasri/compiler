// Generated from C:/Users/USER/IdeaProjects/third/src/MyLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyLexerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(MyLexerParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#defparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefparameter(MyLexerParser.DefparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#defun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefun(MyLexerParser.DefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MyLexerParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#lambda_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_definition(MyLexerParser.Lambda_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MyLexerParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyLexerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(MyLexerParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(MyLexerParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLexerParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MyLexerParser.BodyContext ctx);
}