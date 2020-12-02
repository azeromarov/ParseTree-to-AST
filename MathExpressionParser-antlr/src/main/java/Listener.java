import antlr4.MathExpressionListener;
import antlr4.MathExpressionParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

class Node{
    Node first;
    Node second;

    public void add(Node node){
        if(this.first == null){
            this.first = node;
        }else{
            this.second = node;
        }
    }
}

public class Listener implements MathExpressionListener {

    Stack<Node> stack = new Stack();
    //Node root = null;

    /*public void append(Node node){
        this.stack.push(node);
        if (this.root == null)
            this.root = node;
    }*/

    public void enterNumericAtomExp(MathExpressionParser.NumericAtomExpContext ctx){
    }

    public void exitNumericAtomExp(MathExpressionParser.NumericAtomExpContext ctx){
        Value node = new Value(Float.parseFloat(ctx.getText()));
        this.stack.add(node);
    }

    public void enterPowerExp(MathExpressionParser.PowerExpContext ctx){
    }

    public void exitPowerExp(MathExpressionParser.PowerExpContext ctx){
        Expression first = (Expression) this.stack.pop();
        Expression second = (Expression) this.stack.pop();
        Power node = new Power(second, first);
        this.stack.add(node);
    }

    public void enterMulDivExp(MathExpressionParser.MulDivExpContext ctx){
    }

    public void exitMulDivExp(MathExpressionParser.MulDivExpContext ctx){
        TerminalNode multiply = ctx.ASTERISK();
        TerminalNode divide = ctx.SLASH();
        if(multiply != null && multiply.getText().equals("*")){
            Expression first = (Expression) this.stack.pop();
            Expression second = (Expression) this.stack.pop();
            Multiply node = new Multiply(second, first);
            this.stack.add(node);
        }
        else if(divide != null && divide.getText().equals("/")){
            Expression first = (Expression) this.stack.pop();
            Expression second = (Expression) this.stack.pop();
            Divide node = new Divide(second, first);
            this.stack.add(node);
        }
    }

    public void enterParenthesisExp(MathExpressionParser.ParenthesisExpContext ctx){
    }

    public void exitParenthesisExp(MathExpressionParser.ParenthesisExpContext ctx){
        Expression value = (Expression) this.stack.pop();
        Paranthesis node = new Paranthesis(value);
        this.stack.add(node);
    }

    public void enterFunExp(MathExpressionParser.FunExpContext ctx){
    }

    public void exitFunExp(MathExpressionParser.FunExpContext ctx){
        TerminalNode func = ctx.ID();
        Expression value = (Expression) this.stack.pop();
        if(func.getText().equals("sin")) {
            Sin node = new Sin(value);
            this.stack.add(node);
        } else if(func.getText().equals("cos")) {
            Cos node = new Cos(value);
            this.stack.add(node);
        } else if(func.getText().equals("log")) {
            Log node = new Log(value);
            this.stack.add(node);
        } else if(func.getText().equals("tan")) {
            Tan node = new Tan(value);
            this.stack.add(node);
        } else if(func.getText().equals("cot")) {
            Cot node = new Cot(value);
            this.stack.add(node);
        } else if(func.getText().equals("sqrt")) {
            Sqrt node = new Sqrt(value);
            this.stack.add(node);
        }
    }

    public void enterIdAtomExp(MathExpressionParser.IdAtomExpContext ctx){

    }

    public void exitIdAtomExp(MathExpressionParser.IdAtomExpContext ctx){
        Variable node = new Variable(ctx.getText());
        this.stack.add(node);
    }

    public void enterAddSubExp(MathExpressionParser.AddSubExpContext ctx){
    }

    public void exitAddSubExp(MathExpressionParser.AddSubExpContext ctx){
        TerminalNode plus = ctx.PLUS();
        TerminalNode minus = ctx.MINUS();
        if(plus != null && plus.getText().equals("+")){
            Expression first = (Expression) this.stack.pop();
            Expression second = (Expression) this.stack.pop();
            Sum node = new Sum(second, first);
            this.stack.add(node);
        }
        else if(minus != null && minus.getText().equals("-")){
            Expression first = (Expression) this.stack.pop();
            Expression second = (Expression) this.stack.pop();
            Subtract node = new Subtract(second, first);
            this.stack.add(node);
        }
    }

    public void visitTerminal(TerminalNode terminalNode) {

    }

    public void visitErrorNode(ErrorNode errorNode) {

    }

    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

class Sum extends Node implements Expression{
    final Expression first;
    final Expression second;

    Sum(Expression first, Expression second){
        this.first = first;
        this.second = second;
    }

    public void dump(){
        this.first.dump();
        System.out.print(" + ");
        this.second.dump();
    }
}

class Subtract extends Node implements Expression{
    final Expression first;
    final Expression second;
    Subtract(Expression first, Expression second){
        this.first = first;
        this.second = second;
    }

    public void dump(){
        this.first.dump();
        System.out.print(" - ");
        this.second.dump();
    }
}

class Multiply extends Node implements Expression{
    final Expression first;
    final Expression second;
    Multiply(Expression first, Expression second){
        this.first = first;
        this.second = second;
    }

    public void dump(){
        this.first.dump();
        System.out.print(" * ");
        this.second.dump();
    }
}

class Divide extends Node implements Expression{
    final Expression first;
    final Expression second;
    Divide(Expression first, Expression second){
        this.first = first;
        this.second = second;
    }

    public void dump(){
        this.first.dump();
        System.out.print(" / ");
        this.second.dump();
    }
}

class Power extends Node implements Expression{
    final Expression value;
    final Expression power;
    Power(Expression value, Expression power){
        this.value = value;
        this.power = power;
    }

    public void dump(){
        this.value.dump();
        System.out.print(" ^ ");
        this.power.dump();
    }
}

class Paranthesis extends Node implements Expression{
    final Expression exp;
    Paranthesis(Expression exp){
        this.exp = exp;
    }

    public void dump() {
        System.out.print("( ");
        this.exp.dump();
        System.out.print(" )");
    }
}

class Sin extends Node implements Expression{
    final Expression value;
    Sin(Expression value){
        this.value = value;
    }

    public void dump(){
        System.out.print("sin( ");
        this.value.dump();
        System.out.print(" )");
    }
}

class Cos extends Node implements Expression{
    final Expression value;
    Cos(Expression value){
        this.value = value;
    }

    public void dump(){
        System.out.print("cos( ");
        this.value.dump();
        System.out.print(" )");
    }
}

class Tan extends Node implements Expression{
    final Expression value;
    Tan(Expression value){
        this.value = value;
    }

    public void dump(){
        System.out.print("tan( ");
        this.value.dump();
        System.out.print(" )");
    }
}

class Cot extends Node implements Expression{
    final Expression value;
    Cot(Expression value){
        this.value = value;
    }

    public void dump(){
        System.out.print("cot( ");
        this.value.dump();
        System.out.print(" )");
    }
}

class Log extends Node implements Expression{
    final Expression value;
    Log(Expression value){
        this.value = value;
    }

    public void dump(){
        System.out.print("log( ");
        this.value.dump();
        System.out.print(" )");
    }
}

class Sqrt extends Node implements Expression{
    final Expression value;
    Sqrt(Expression value){
        this.value = value;
    }

    public void dump(){
        System.out.print("sqrt( ");
        this.value.dump();
        System.out.print(" )");
    }
}

class Value extends Node implements Expression{
    float value;
    Value(float value){
        this.value = value;
    }
    public void dump(){
        if(this.value < 0){
            System.out.print("( ");
            System.out.print(this.value);
            System.out.print(" )");
        } else
            System.out.print(this.value);
    }
}

class Variable extends Node implements Expression {
    String variable;

    Variable(String variable) {
        this.variable = variable;
    }

    public void dump() {
        System.out.print(this.variable);
    }
}