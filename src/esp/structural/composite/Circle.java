package esp.structural.composite;

public class Circle extends Dot {

  private final double radius;

  public Circle(int x, int y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println(
        String.format("draw circle with center (%s, %s) and radius = %s", this.x, this.y,
            this.radius));
  }
}
