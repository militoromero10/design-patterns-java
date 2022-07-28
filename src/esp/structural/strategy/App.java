package esp.structural.strategy;

public class App {


  public static void main(String[] args) {
    var ctx = new Context();
    double a = 10;
    double b = 20;
    var operation = "*";

    switch (operation) {
      case "+":
        ctx.setStrategy(new ConcreteStrategyAdd());
        break;
      case "-":
        ctx.setStrategy(new ConcreteStrategySubtract());
        break;
      case "*":
        ctx.setStrategy(new ConcreteStrategyMultiply());
        break;
      default:
        System.out.println("error ... ");
    }
    ctx.executeStrategy(a, b);
  }
}
