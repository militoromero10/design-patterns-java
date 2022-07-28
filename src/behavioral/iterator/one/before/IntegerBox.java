package behavioral.iterator.one.before;

import java.util.ArrayList;
import java.util.List;

public class IntegerBox {

  private final List<Integer> list = new ArrayList<>();

  public void add(int in) {
    list.add(in);
  }

  public List getData() {
    return list;
  }
}
