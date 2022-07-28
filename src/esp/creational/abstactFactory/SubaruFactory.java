package esp.creational.abstactFactory;

import esp.creational.abstactFactory.subaru.SubaruElectric;
import esp.creational.abstactFactory.subaru.SubaruGas;
import esp.creational.abstactFactory.subaru.SubaruOil;

public class SubaruFactory implements AbstractFactory {

  @Override
  public Gas createGasCar() {
    return new SubaruGas();
  }

  @Override
  public Electric createElectricCar() {
    return new SubaruElectric();
  }

  @Override
  public Oil createOilCar() {
    return new SubaruOil();
  }
}
