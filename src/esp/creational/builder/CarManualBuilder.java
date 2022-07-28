package esp.creational.builder;

public class CarManualBuilder implements Builder{

  private Manual manual;

  @Override
  public void reset() {
    this.manual = new Manual();
  }

  @Override
  public void setSeats(Long num) {
    System.out.println(String.format("Documentar numero de sillas {%s}", num));
  }

  @Override
  public void setEngine(String engine) {
    System.out.println(String.format("Documentar motor {%s}", engine));
  }

  @Override
  public void setTripComputer(Boolean computer) {
    System.out.println(String.format("Documentar computador {%s}", computer));
  }

  @Override
  public void setGPS(Boolean gps) {
    System.out.println(String.format("Documentar gps {%s}", gps));
  }

  public Manual getProduct(){
    var product = this.manual;
    this.reset();
    return product;
  }
}
