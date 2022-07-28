package esp.structural.strategy;

public class ConcreteStrategyMultiply implements Strategy {

  @Override
  public double execute(double a, double b) {
    return a * b;
  }
}
