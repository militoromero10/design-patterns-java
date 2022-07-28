package esp.creational.factoryMethod;

public class ConcreteCreatorA extends Creator {

  @Override
  public Product createProduct() {
    return new ProductA();
  }
}
