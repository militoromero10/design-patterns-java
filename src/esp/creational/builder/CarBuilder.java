package esp.creational.builder;

public class CarBuilder implements Builder{

  private Car car;

  public CarBuilder(){
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(Long num) {
    this.car.setSeats(num);
  }

  @Override
  public void setEngine(String engine) {
    this.car.setEngine(engine);
  }

  @Override
  public void setTripComputer(Boolean computer) {
    this.car.setTripComputer(computer);
  }

  @Override
  public void setGPS(Boolean gps) {
    this.car.setGps(gps);

  }

  public Car getProduct(){
    var product = this.car;
    this.reset();
    return product;
  }
}
