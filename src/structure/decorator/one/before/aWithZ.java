package structure.decorator.one.before;

public class aWithZ extends A {

  public void doIt() {
    super.doIt();
    doZ();
  }

  public void doZ() {
    System.out.print('Z');
  }
}