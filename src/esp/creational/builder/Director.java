package esp.creational.builder;

public class Director {

  private Builder builder;

  void setBuilder(Builder builder){
    this.builder = builder;
  }

  void constructSportCar(Builder builder){
    builder.reset();
    builder.setSeats(2l);
    builder.setEngine("Motor deportivo");
    builder.setTripComputer(true);
    builder.setGPS(true);
  }

  void constructTruck(Builder builder){
    builder.reset();
    builder.setSeats(2l);
    builder.setEngine("Motor tractomula");
    builder.setTripComputer(false);
    builder.setGPS(false);
  }

}
