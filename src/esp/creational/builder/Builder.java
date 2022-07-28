package esp.creational.builder;

public interface Builder {

  void reset();
  void setSeats(Long num);
  void setEngine(String engine);
  void setTripComputer(Boolean computer);
  void setGPS(Boolean gps);
}
