package structure.decorator.one.before;

public class AwithXYZ extends AwithX {

  private aWithY obj1 = new aWithY();
  private aWithZ obj2 = new aWithZ();

  public void doIt() {
    super.doIt();
    obj1.doY();
    obj2.doZ();
  }
}