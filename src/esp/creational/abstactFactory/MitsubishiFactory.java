package esp.creational.abstactFactory;

import esp.creational.abstactFactory.mitsubishi.MitsubishiElectric;
import esp.creational.abstactFactory.mitsubishi.MitsubishiGas;
import esp.creational.abstactFactory.mitsubishi.MitsubishiOil;

public class MitsubishiFactory implements AbstractFactory {

  @Override
  public Gas createGasCar() {
    return new MitsubishiGas();
  }

  @Override
  public Electric createElectricCar() {
    return new MitsubishiElectric();
  }

  @Override
  public Oil createOilCar() {
    return new MitsubishiOil();
  }
}
