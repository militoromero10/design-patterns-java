package esp.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class ImageEditor {

  List<Graphic> all = new ArrayList<>();

  public void load() {
    all = new ArrayList<>();
    all.add(new Dot(1, 2));
    all.add(new Circle(5, 3, 10));
  }

  public void groupSelected(List<Graphic> componets){
    var group = new CompoundGraphic();
    for(Graphic g : componets){
      group.add(g);
      all.remove(g);
    }
    all.add(group);

    for(Graphic g : all){
      g.draw();
    }
  }
}
