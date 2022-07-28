package creational.abstractFactory.uno;

import creational.abstractFactory.uno.products.Electric;
import creational.abstractFactory.uno.products.Gas;
import creational.abstractFactory.uno.products.Oil;

public class EntryPoint {

  public static void main(String[] args) {

    AbstractFactory mitsubishiFactory = AbstractFactory.getFactory(Company.MITSUBISHI);
    AbstractFactory subaruFactory = AbstractFactory.getFactory(Company.SUBARU);

    // Mitsubishi types
    Oil mitsubishiOil = mitsubishiFactory.createOilCar();
    Gas mitsubishiGas = mitsubishiFactory.createGasCar();
    Electric mitsubishiElectric = mitsubishiFactory.createElectricCar();

    // Subaru types
    Oil subaruOil = subaruFactory.createOilCar();
    Gas subaruGas = subaruFactory.createGasCar();
    Electric subaruElectric = subaruFactory.createElectricCar();

  }
}
