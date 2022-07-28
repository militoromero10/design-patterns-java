package esp.creational.builder;

public class App {

  public static void main(String[] args) {
    var director = new Director();

    var carBuilder = new CarBuilder();
    director.constructSportCar(carBuilder);
    Car car = carBuilder.getProduct();

    var manualBuilder = new CarManualBuilder();
    director.constructSportCar(manualBuilder);
    var manual = manualBuilder.getProduct();

  }
}
