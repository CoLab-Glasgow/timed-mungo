package translator;

import genantlr.ScribbleLexer;
import genantlr.ScribbleParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.IOException;

public class Translate {
    public static final String FILE_EXTENSION = ".scr";

    protected static void printUsage() {
        System.out.println(
                "Usage: java -jar stmungo.jar <options> <source file.scr>\n" +
                        "  -v                        verbose\n" +
                        "  -path <path>              specify where to generate class files\n" +
                        "  -h                        help\n"
        );
        System.exit(1);
    }


    public static void main(String[] args) throws Exception {
        if (args.length < 1 || args.length > 3)
            printUsage();

        boolean verbose = false;
        String filename = "";
        String path = "";

        for(int i = 0; i < args.length; i++){
            if(args[i].startsWith("-"))
                if(args[i].equals("-v"))
                    verbose = true;
                else
                    if(args[i].equals("-path"))
                        path = args[++i];
                    else
                        if(args[i].equals("-h"))
                            printUsage();
                        else
                            printUsage();
            else
                if(args[i].contains(".scr"))
                    filename = args[i];
                else
                    printUsage();
        }

        try {
            FileReader reader = new FileReader(filename);
            // create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(reader);

            // create a lexer that feeds off of input CharStream
            ScribbleLexer lexer = new ScribbleLexer(input);

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            ScribbleParser parser = new ScribbleParser(tokens);

            ParseTree tree = parser.module();		// begin parsing at init rule

            // Create a generic parse tree walker that can trigger callbacks.
            ParseTreeWalker walker = new ParseTreeWalker();

            // Walk the tree created during the parse, trigger callbacks.
            walker.walk(new ScribbleToTypestateListener(verbose, path), tree);
            System.out.println();		// print a \n after translation
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
