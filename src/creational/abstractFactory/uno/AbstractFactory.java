package creational.abstractFactory.uno;

import creational.abstractFactory.uno.mitsubishi.MitsubishiFactory;
import creational.abstractFactory.uno.products.Electric;
import creational.abstractFactory.uno.products.Gas;
import creational.abstractFactory.uno.products.Oil;
import creational.abstractFactory.uno.subaru.SubaruFactory;

public abstract class AbstractFactory {

  private static final MitsubishiFactory MITSUBISHI_FACTORY = new MitsubishiFactory();
  private static final SubaruFactory SUBARU_FACTORY = new SubaruFactory();

  public static AbstractFactory getFactory(Company company) {
    AbstractFactory factory = null;
    switch (company) {
      case MITSUBISHI:
        factory = MITSUBISHI_FACTORY;
        break;
      case SUBARU:
        factory = SUBARU_FACTORY;
        break;
    }
    return factory;
  }

  public abstract Oil createOilCar();

  public abstract Gas createGasCar();

  public abstract Electric createElectricCar();

}
