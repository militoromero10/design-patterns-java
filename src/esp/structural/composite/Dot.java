package esp.structural.composite;

public class Dot implements Graphic {

  protected int x;
  protected int y;

  public Dot(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void move(int x, int y) {
    this.x += x;
    this.y += y;
  }

  @Override
  public void draw() {
    System.out.println(String.format("draw dot (%s, xs)", this.x, this.y));
  }
}
