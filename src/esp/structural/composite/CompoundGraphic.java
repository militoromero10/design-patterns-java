package esp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

  private final List<Graphic> children = new ArrayList<>();


  public void add(Graphic child) {
    this.children.add(child);
  }

  public void remove(Graphic child) {
    this.children.remove(child);
  }

  @Override
  public void move(int x, int y) {
    for (Graphic g : children) {
      g.move(x, y);
    }
  }

  @Override
  public void draw() {
    System.out.println("draw graphic component");
  }
}
