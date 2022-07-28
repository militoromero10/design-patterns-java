package esp.creational.factoryMethod;

public class ConcreteCreatorB extends Creator {

  @Override
  public Product createProduct() {
    return new ProductB();
  }
}
