package behavioral.interpreter.two;

public class InterpreterDemo {
  public static behavioral.interpreter.one.before.InterpreterDemo interpreter
      = new behavioral.interpreter.one.before.InterpreterDemo();

  public static String convertToPostfix(String in) {
    StkChar operationsStack  = new StkChar();
    StringBuilder out = new StringBuilder();
    String operations  = "+-*/()";
    char topSymbol = '+';
    boolean empty;
    for (int i = 0; i < in.length(); i++) {
      if (operations.indexOf(in.charAt(i)) == -1)
        out.append(in.charAt(i));
      else {
        while (!(empty = operationsStack.isEmpty())
            && interpreter.precedence(topSymbol = operationsStack.pop(), in.charAt(i)))
          out.append(topSymbol);
        if (!empty) {
          operationsStack.push(topSymbol);
        }
        if (empty || in.charAt(i) != ')') {
          operationsStack.push(in.charAt(i));
        }
        else topSymbol = operationsStack.pop();
      }
    }
    while (!operationsStack.isEmpty()) {
      out.append( operationsStack.pop() );
    }
    return out.toString();
  }

  public static int evaluate( String in ) {
    StkInt stkInt = new StkInt();
    String operations = "+-*/";
    for (int a, b, i=0; i < in.length(); i++) {
      if (operations.indexOf(in.charAt(i)) == -1) {
        stkInt.push(in.charAt(i) - 48);
      } else {
        b = stkInt.pop();
        a = stkInt.pop();
        if (in.charAt(i) == '+') {
          a = a + b;
        }
        if (in.charAt(i) == '-') {
          a = a - b;
        }
        if (in.charAt(i) == '*') {
          a = a * b;
        }
        if (in.charAt(i) == '/') {
          a = a / b;
        }
        stkInt.push(a);
      }
    }
    return stkInt.pop();
  }

  public static void main( String[] args ) {
    System.out.print(args[0]);
    String postfix = convertToPostfix(args[0]);
    System.out.print( " -- " + postfix );
    System.out.println( " -- " + evaluate( postfix ) );
  }
}
/*
  2+3*4-5+6 -- 234*+5-6+ -- 15
  (2+3)*4-5+6 -- 23+4*5-6+ -- 21
  2+3*(4-5)+6 -- 2345-*+6+ -- 5
  2+3*((4-5)+6) -- 2345-6+*+ -- 17
  (3-(4*(5+6))/(7-8))*9/4 -- 3456+*78-/-9*4/ -- 105
 */