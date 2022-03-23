package util;

import java.io.PrintWriter;

/**
 * Created by ornela on 10/03/15.
 */
public class PrettyPrinter {
    int indent = 0;
    PrintWriter currentPrinter;
    boolean inCase = false;
    boolean outCase = false;
    int nestedCase = 0;

    public PrettyPrinter(PrintWriter out) {
        this.currentPrinter = out;

    }

    public void prettyPrint(String format, Object... params) {
        // First we want to generate the output string
        String[] formatted = String.format(format, params).split("\n", 2);

        for (int i = 0; i < formatted.length; i++) {
            String line = formatted[i];

            // Get the last character of the line
            if (!line.isEmpty()) {
                String trimmedString = line.trim();
                char endChar = trimmedString.charAt(trimmedString.length() - 1);

                outCase = (trimmedString.contains("break") || trimmedString.contains("return")
                        || trimmedString.contains("continue")) && inCase;
                inCase = inCase || trimmedString.contains("case ") || trimmedString.contains("default:");

                if (trimmedString.contains("case "))
                    nestedCase++;
                // Closing brace reduces the indent on the current line
                if (trimmedString.contains("}") || trimmedString.contains("default:")) {
                    indent--;
                }

                // Print the current indentation level
                for (int j = 0; j < indent; j++)
                    this.currentPrinter.print("    ");

                this.currentPrinter.println(line);

                if (outCase) {
                    indent--;
                    nestedCase--;
                    inCase = nestedCase > 0;
                }

                // Opening brace increases the indent on the next line
                if (trimmedString.contains("{") || trimmedString.contains("case ")
                        || trimmedString.contains("default:")) {
                    indent++;
                }

            } else {
                this.currentPrinter.println();
            }
        }
    }

    public void prettyPrintln() {
        this.currentPrinter.println();
    }

}
