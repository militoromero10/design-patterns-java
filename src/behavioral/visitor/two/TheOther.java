package behavioral.visitor.two;

public class TheOther implements Element {
  public void accept(ReflectiveVisitor v) {
    v.visit(this);
  }

  public String theOther() {
    return "TheOther";
  }
}