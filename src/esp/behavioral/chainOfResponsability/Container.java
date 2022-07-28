package esp.behavioral.chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Component {

  protected List<Component> children = new ArrayList<>();

  public void add(Component child){
    children.add(child);
    child.container = this;
  }
}
