package thosakwe.rgasm.compiler;

import thosakwe.rgasm.antlr.ASMBaseListener;
import thosakwe.rgasm.antlr.ASMParser;

public class VariableCollector extends ASMBaseListener {
    private ASMParser.CompilationUnitContext program;

    @Override
    public void enterCompilationUnit(ASMParser.CompilationUnitContext ctx) {
        program = ctx;
        super.enterCompilationUnit(ctx);
    }

    @Override
    public void enterVarDeclStmt(ASMParser.VarDeclStmtContext ctx) {
        program.symbols.put(ctx.ID().getText(), ctx.expr());
        super.enterVarDeclStmt(ctx);
    }
}
