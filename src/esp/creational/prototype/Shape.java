package esp.creational.prototype;

public abstract class Shape {

  private int X;
  private int Y;
  private String color;

  public Shape() {

  }

  protected Shape(Shape shape) {
    this();
    this.X = shape.X;
    this.Y = shape.Y;
    this.color = shape.color;
  }

  public abstract Shape clone();

  public int getX() {
    return X;
  }

  public void setX(int x) {
    X = x;
  }

  public int getY() {
    return Y;
  }

  public void setY(int y) {
    Y = y;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
