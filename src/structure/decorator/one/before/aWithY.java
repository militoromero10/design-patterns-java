package structure.decorator.one.before;

public class aWithY extends A {

  public void doIt() {
    super.doIt();
    doY();
  }

  public void doY() {
    System.out.print('Y');
  }
}