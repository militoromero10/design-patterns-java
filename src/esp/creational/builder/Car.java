package esp.creational.builder;

public class Car {
  private Long seats;
  private String engine;
  private Boolean tripComputer;
  private Boolean gps;

  public Long getSeats() {
    return seats;
  }

  public void setSeats(Long seats) {
    this.seats = seats;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public Boolean getTripComputer() {
    return tripComputer;
  }

  public void setTripComputer(Boolean tripComputer) {
    this.tripComputer = tripComputer;
  }

  public Boolean getGps() {
    return gps;
  }

  public void setGps(Boolean gps) {
    this.gps = gps;
  }
}
