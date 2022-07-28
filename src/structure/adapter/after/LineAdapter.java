package structure.adapter.after;

public class LineAdapter implements Shape {

  private final Line adapter;

  public LineAdapter(Line line) {
    this.adapter = line;
  }

  @Override
  public void draw(int x1, int y1, int x2, int y2) {
    adapter.draw(x1, y1, x2, y2);
  }
}