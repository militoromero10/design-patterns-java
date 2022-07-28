package esp.structural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Application {

  List<Shape> shapes = new ArrayList<>();

  void export(){
    var exportVisitor = new XmlExportVisitor();

    for(Shape s : shapes){
      s.accept(exportVisitor);
    }
  }
}
