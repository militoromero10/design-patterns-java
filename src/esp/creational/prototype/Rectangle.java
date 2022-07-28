package esp.creational.prototype;

public class Rectangle extends Shape {

  private int width;
  private int height;

  public Rectangle() {
  }

  private Rectangle(Rectangle rectangle) {
    super(rectangle);
    this.width = rectangle.width;
    this.height = rectangle.height;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
