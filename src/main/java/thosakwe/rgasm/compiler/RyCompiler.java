package thosakwe.rgasm.compiler;

import thosakwe.rgasm.antlr.ASMBaseListener;
import thosakwe.rgasm.antlr.ASMParser;

import java.io.PrintStream;

public class RyCompiler extends ASMBaseListener {
    private PrintStream output;
    private ASMParser.CompilationUnitContext program;

    public RyCompiler(PrintStream output) {
        this.output = output;
    }

    @Override
    public void enterCompilationUnit(ASMParser.CompilationUnitContext ctx) {
        program = ctx;
        super.enterCompilationUnit(ctx);
    }

    @Override
    public void exitCompilationUnit(ASMParser.CompilationUnitContext ctx) {
        output.print('q');
        super.exitCompilationUnit(ctx);
    }

    @Override
    public void enterPrintStmt(ASMParser.PrintStmtContext ctx) {
        if (ctx.expr() == null) {
            output.print(".");
        }
        else if (ctx.expr().ID() != null) {
            ASMParser.ExprContext target = program.symbols.get(ctx.expr().ID().getText());

            if (target.isStatic) {
                if (target.CELL() != null) {
                    output.print(".");
                } else if (target.CHAR() != null) {
                    output.print("'" + target.CHAR().getText().replaceAll("'", "") + '.');
                }
                else if (target.STRING() != null) {
                    String targetString = target.STRING().getText().replaceFirst("\"", "").replaceAll("\"$", "");
                    for (char ch: targetString.toCharArray()) {
                        output.print("'" + ch + ".");
                    }
                }
            }
        }

        super.enterPrintStmt(ctx);
    }
}
