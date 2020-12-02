import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import antlr4.MathExpressionLexer;
import antlr4.MathExpressionParser;
import java.util.Scanner;


public class Main {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            MathExpressionLexer lexer = new MathExpressionLexer(CharStreams.fromString(scan.nextLine()));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MathExpressionParser parser = new MathExpressionParser(tokenStream);
            parser.setBuildParseTree(true);
            MathExpressionParser.ExpressionContext expressionContext = parser.expression();
            Listener l = new Listener();
            ParseTreeWalker.DEFAULT.walk(l,expressionContext);

            if (l.stack.size() > 0)
                ((Expression)l.stack.peek()).dump();
            else
                System.out.println("unexpected stack size: "+l.stack.size());
            System.out.println();

        }
}