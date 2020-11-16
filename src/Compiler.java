import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler
{
    public Compiler() 
    { 
        // You followed the rules.
            System.out.println("Accepted");
    } 

    public static void main(String args[])
    {
        try
        {
            folLexer lexer = new
               folLexer(CharStreams.fromFileName(args[0]));

            folParser parser = new 
               folParser(new CommonTokenStream(lexer));

            parser.setErrorHandler(new ErrorStrategy());

            ParseTree pt = parser.program();

            Compiler compiler = new Compiler();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
            System.exit(1);
        }
    }

    static private class ErrorStrategy extends
        DefaultErrorStrategy
    {

        @Override public void reportError(Parser recognizer,
                                          RecognitionException e)
        {
            System.out.println("Not Accepted");
            System.exit(1);
        }

        @Override public Token recoverInline(Parser recognizer) throws
        RecognitionException { System.out.println("Not Accepted");
            System.exit(1);
            return null;
        }
    }
}
