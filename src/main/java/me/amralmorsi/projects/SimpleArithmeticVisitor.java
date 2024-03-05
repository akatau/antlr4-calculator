package me.amralmorsi.projects;// Generated from SimpleArithmetic.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleArithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleArithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleArithmeticParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(SimpleArithmeticParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParanthesisExpression}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParanthesisExpression(SimpleArithmeticParser.ParanthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentiationOp}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationOp(SimpleArithmeticParser.ExponentiationOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionOp}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionOp(SimpleArithmeticParser.SubtractionOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationOp}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOp(SimpleArithmeticParser.MultiplicationOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionOp}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionOp(SimpleArithmeticParser.DivisionOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorialOp}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorialOp(SimpleArithmeticParser.FactorialOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signedValue}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedValue(SimpleArithmeticParser.SignedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOp}
	 * labeled alternative in {@link SimpleArithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOp(SimpleArithmeticParser.AdditionOpContext ctx);
}