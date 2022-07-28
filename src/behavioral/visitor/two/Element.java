package behavioral.visitor.two;

// The "element" hierarchy
public interface Element {
  void accept(ReflectiveVisitor v);
}