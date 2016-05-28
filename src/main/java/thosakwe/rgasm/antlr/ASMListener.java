// Generated from /home/tobe/IdeaProjects/rgasm/src/main/antlr4/thosakwe/rgasm/antlr/ASM.g4 by ANTLR 4.5.1
package thosakwe.rgasm.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASMParser}.
 */
public interface ASMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ASMParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ASMParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(ASMParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(ASMParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#dataSection}.
	 * @param ctx the parse tree
	 */
	void enterDataSection(ASMParser.DataSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#dataSection}.
	 * @param ctx the parse tree
	 */
	void exitDataSection(ASMParser.DataSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#varDeclStmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(ASMParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#varDeclStmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(ASMParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#textSection}.
	 * @param ctx the parse tree
	 */
	void enterTextSection(ASMParser.TextSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#textSection}.
	 * @param ctx the parse tree
	 */
	void exitTextSection(ASMParser.TextSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ASMParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ASMParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#labelDecl}.
	 * @param ctx the parse tree
	 */
	void enterLabelDecl(ASMParser.LabelDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#labelDecl}.
	 * @param ctx the parse tree
	 */
	void exitLabelDecl(ASMParser.LabelDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(ASMParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(ASMParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#clmStmt}.
	 * @param ctx the parse tree
	 */
	void enterClmStmt(ASMParser.ClmStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#clmStmt}.
	 * @param ctx the parse tree
	 */
	void exitClmStmt(ASMParser.ClmStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#clrStmt}.
	 * @param ctx the parse tree
	 */
	void enterClrStmt(ASMParser.ClrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#clrStmt}.
	 * @param ctx the parse tree
	 */
	void exitClrStmt(ASMParser.ClrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#cmpStmt}.
	 * @param ctx the parse tree
	 */
	void enterCmpStmt(ASMParser.CmpStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#cmpStmt}.
	 * @param ctx the parse tree
	 */
	void exitCmpStmt(ASMParser.CmpStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#decStmt}.
	 * @param ctx the parse tree
	 */
	void enterDecStmt(ASMParser.DecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#decStmt}.
	 * @param ctx the parse tree
	 */
	void exitDecStmt(ASMParser.DecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#hltStmt}.
	 * @param ctx the parse tree
	 */
	void enterHltStmt(ASMParser.HltStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#hltStmt}.
	 * @param ctx the parse tree
	 */
	void exitHltStmt(ASMParser.HltStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#incStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncStmt(ASMParser.IncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#incStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncStmt(ASMParser.IncStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(ASMParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(ASMParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#jmpStmt}.
	 * @param ctx the parse tree
	 */
	void enterJmpStmt(ASMParser.JmpStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#jmpStmt}.
	 * @param ctx the parse tree
	 */
	void exitJmpStmt(ASMParser.JmpStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#jnzStmt}.
	 * @param ctx the parse tree
	 */
	void enterJnzStmt(ASMParser.JnzStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#jnzStmt}.
	 * @param ctx the parse tree
	 */
	void exitJnzStmt(ASMParser.JnzStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#jzStmt}.
	 * @param ctx the parse tree
	 */
	void enterJzStmt(ASMParser.JzStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#jzStmt}.
	 * @param ctx the parse tree
	 */
	void exitJzStmt(ASMParser.JzStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#popStmt}.
	 * @param ctx the parse tree
	 */
	void enterPopStmt(ASMParser.PopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#popStmt}.
	 * @param ctx the parse tree
	 */
	void exitPopStmt(ASMParser.PopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(ASMParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(ASMParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#pushStmt}.
	 * @param ctx the parse tree
	 */
	void enterPushStmt(ASMParser.PushStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#pushStmt}.
	 * @param ctx the parse tree
	 */
	void exitPushStmt(ASMParser.PushStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#rdmemStmt}.
	 * @param ctx the parse tree
	 */
	void enterRdmemStmt(ASMParser.RdmemStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#rdmemStmt}.
	 * @param ctx the parse tree
	 */
	void exitRdmemStmt(ASMParser.RdmemStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(ASMParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(ASMParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ASMParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ASMParser.ExprContext ctx);
}