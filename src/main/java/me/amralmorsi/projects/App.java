package me.amralmorsi.projects;

 import org.antlr.v4.runtime.*;
 import org.antlr.v4.runtime.tree.*;
 import java.io.*;
 import java.util.Scanner;

/**
 * Hello world!
 *
 */
// public class App 
// {
//     public static void main( String[] args )
//     {
//         System.out.println( "Hello World!" );
//     }
// }



public class App {
    public static void main(String[] args) throws IOException {
        // 1. Read input from standard input, creating a character stream.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner istream = new Scanner(System.in);

        CharStream inputStream = CharStreams.fromString(istream.nextLine());
        // 2. Perform lexical analysis on the character stream. The purpose
        // of the error listener is to throw an exception whenever the lexer
        // encounters a syntax error.
        SimpleArithmeticLexer lexer = new SimpleArithmeticLexer(inputStream);
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(org.antlr.v4.runtime.Recognizer<?, ?> r, Object o, int l, int c,
                    String msg, RecognitionException e) {
                throw new RuntimeException(e);
            }
        });
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        // 3. Parse the stream of tokens generated by the lexer by calling
        // the expression() method, which corresponds to SimpleArith’s expression rule.
        SimpleArithmeticParser parser = new SimpleArithmeticParser(commonTokenStream);
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.expression();
        // 4. Given the resulting parse tree, evaluate it.
        SimpleArithmeticEvaluator evaluator = new SimpleArithmeticEvaluator();
        Double result = evaluator.visit(tree);
        // 5. Print result
        System.out.println(result);
    }
}