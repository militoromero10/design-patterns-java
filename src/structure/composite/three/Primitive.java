package structure.composite.three;

// 2. "Isa" relationship
public class Primitive implements Component {
  private int value;

  public Primitive(int val) {
    value = val;
  }

  public void traverse() {
    System.out.print( value + "  " );
  }
}