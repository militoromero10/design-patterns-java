package esp.creational.prototype;

public class Circle extends Shape {

  private double r;

  public Circle() {

  }

  private Circle(Circle circle) {
    super(circle);
    this.r = circle.r;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }
}
