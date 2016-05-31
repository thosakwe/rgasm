package thosakwe.rgasm;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.*;
import org.apache.commons.cli.CommandLine;
import thosakwe.rgasm.antlr.ASMLexer;
import thosakwe.rgasm.antlr.ASMParser;
import thosakwe.rgasm.compiler.RyCompiler;
import thosakwe.rgasm.compiler.VariableCollector;

import java.io.*;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println("RinGy 2.0 Assembler - Tobe O.");
        System.out.println("-----------------------------");
        CommandLineParser commandLineParser = new DefaultParser();
        Options options = new Options();
        options.addOption("d", "debug", false, "Print debug output.");
        options.addOption("o", "out", true, "The output file to write to.");
        options.addOption("x", "run", false, "RUn the generated RinGy code on compilation.");

        if (args.length == 0 || args[0].equals("-h") || args[0].equals("--help")) {
            new HelpFormatter().printHelp("rgasm [options...] <file>", options);
            return;
        }

        CommandLine cli = commandLineParser.parse(options, args);
        String[] cliArgs = cli.getArgs();

        PrintStream output;
        if (cli.getOptionValue('o') != null) {
            File file = new File(cli.getOptionValue('o'));
            if (!file.exists()) {
                //noinspection ResultOfMethodCallIgnored
                file.createNewFile();
            } else {
                //noinspection ResultOfMethodCallIgnored
                file.delete();
                //noinspection ResultOfMethodCallIgnored
                file.createNewFile();
            }

            output = new PrintStream(file);
        } else output = System.out;

        if (cli.getOptionValue('o') == null) {
            System.err.println("fatal error: no input file");
            System.exit(1);
        }

        ANTLRFileStream fileStream = new ANTLRFileStream(cliArgs[0]);
        ASMLexer lexer = new ASMLexer(fileStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ASMParser parser = new ASMParser(tokens);
        parser.setBuildParseTree(true);

        ASMParser.CompilationUnitContext program = parser.compilationUnit();

        VariableCollector variableCollector = new VariableCollector();
        ParseTreeWalker.DEFAULT.walk(variableCollector, program);

        RyCompiler ryCompiler = new RyCompiler(output);
        ParseTreeWalker.DEFAULT.walk(ryCompiler, program);

        if (cli.hasOption("run") && cli.getOptionValue('o') != null) {
            System.out.println();
            System.out.println("VM Output:");
            System.out.println();

            Process ry = Runtime.getRuntime().exec(new String[]{
                    "ry",
                    cli.getOptionValue('o')
            });

            String line;

            BufferedReader input =
                    new BufferedReader
                            (new InputStreamReader(ry.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            input.close();

            input =
                    new BufferedReader
                            (new InputStreamReader(ry.getErrorStream()));
            while ((line = input.readLine()) != null) {
                System.err.println(line);
            }

            input.close();
        }
    }
}
