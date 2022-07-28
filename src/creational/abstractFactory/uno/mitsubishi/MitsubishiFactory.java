package creational.abstractFactory.uno.mitsubishi;

import creational.abstractFactory.uno.AbstractFactory;
import creational.abstractFactory.uno.products.Electric;
import creational.abstractFactory.uno.products.Gas;
import creational.abstractFactory.uno.products.Oil;

public class MitsubishiFactory extends AbstractFactory {

  @Override
  public Oil createOilCar() {
    return new MitsubishiOil();
  }

  @Override
  public Gas createGasCar() {
    return new MitsubishiGas();
  }

  @Override
  public Electric createElectricCar() {
    return new MitsubishiElectric();
  }
}
