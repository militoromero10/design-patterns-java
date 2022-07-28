package creational.abstractFactory.uno.subaru;

import creational.abstractFactory.uno.AbstractFactory;
import creational.abstractFactory.uno.products.Electric;
import creational.abstractFactory.uno.products.Gas;
import creational.abstractFactory.uno.products.Oil;

public class SubaruFactory extends AbstractFactory {

  @Override
  public Oil createOilCar() {
    return new SubaruOil();
  }

  @Override
  public Gas createGasCar() {
    return new SubaruGas();
  }

  @Override
  public Electric createElectricCar() {
    return new SubaruElectric();
  }
}
