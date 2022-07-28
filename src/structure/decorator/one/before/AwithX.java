package structure.decorator.one.before;

public class AwithX extends A {

  public void doIt() {
    super.doIt();
    doX();
  }

  private void doX() {
    System.out.print('X');
  }
}