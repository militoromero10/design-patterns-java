package esp.creational.abstactFactory;

public interface AbstractFactory {

  Gas createGasCar();
  Electric createElectricCar();
  Oil createOilCar();

}
