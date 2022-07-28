package esp.structural.adapter;

public class RoundHole {

  private double radius;

  public RoundHole(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public boolean fits(RoundPeg peg){
    return this.radius >= peg.getRadius();
  }

}
