package antlr4;// Generated from C:/Users/Azer/Desktop/Java Projects/Main Projects/MathExpressionParser-antlr/src/main/antlr4\MathExpression.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathExpressionParser}.
 */
public interface MathExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtomExp(MathExpressionParser.NumericAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtomExp(MathExpressionParser.NumericAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExp(MathExpressionParser.PowerExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExp(MathExpressionParser.PowerExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(MathExpressionParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(MathExpressionParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(MathExpressionParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(MathExpressionParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(MathExpressionParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(MathExpressionParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdAtomExp(MathExpressionParser.IdAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdAtomExp(MathExpressionParser.IdAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(MathExpressionParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link MathExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(MathExpressionParser.AddSubExpContext ctx);
}