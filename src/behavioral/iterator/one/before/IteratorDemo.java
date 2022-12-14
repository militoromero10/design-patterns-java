package behavioral.iterator.one.before;

import java.util.Collection;

public class IteratorDemo {

  public static void main(String[] args) {
    IntegerBox box = new IntegerBox();
    for (int i = 9; i > 0; --i) {
      box.add(i);
    }
    Collection integerList = box.getData();
    for (Object anIntegerList : integerList) {
      System.out.print(anIntegerList + "  ");
    }
    System.out.println();
    integerList.clear();
    integerList = box.getData();
    System.out.println("size of data is: " + integerList.size());
  }
}
