package esp.structural.strategy;

public class Context {

  private Strategy strategy;

  public void executeStrategy(double a, double b){
    var r = strategy.execute(a,b);
    System.out.println(String.format("a operate b = %s", r));
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
