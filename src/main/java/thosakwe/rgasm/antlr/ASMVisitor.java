// Generated from /home/tobe/IdeaProjects/rgasm/src/main/antlr4/thosakwe/rgasm/antlr/ASM.g4 by ANTLR 4.5.1
package thosakwe.rgasm.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ASMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ASMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ASMParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ASMParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(ASMParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#dataSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSection(ASMParser.DataSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#varDeclStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(ASMParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#textSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextSection(ASMParser.TextSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ASMParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#labelDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDecl(ASMParser.LabelDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(ASMParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#clmStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClmStmt(ASMParser.ClmStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#clrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClrStmt(ASMParser.ClrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#cmpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStmt(ASMParser.CmpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#decStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecStmt(ASMParser.DecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#hltStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHltStmt(ASMParser.HltStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#incStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncStmt(ASMParser.IncStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(ASMParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#jmpStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJmpStmt(ASMParser.JmpStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#jnzStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJnzStmt(ASMParser.JnzStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#jzStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJzStmt(ASMParser.JzStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#popStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopStmt(ASMParser.PopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ASMParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#pushStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPushStmt(ASMParser.PushStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#rdmemStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRdmemStmt(ASMParser.RdmemStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(ASMParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ASMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ASMParser.ExprContext ctx);
}