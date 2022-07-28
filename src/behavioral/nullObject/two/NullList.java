package behavioral.nullObject.two;

public class NullList extends List {
  private static final NullList instance = new NullList();

  private NullList() {}

  public static NullList singleton() {
    return instance;
  }

  public List getTail() {
    return this;
  }

  public Object accept(ListVisitor visitor, Object param) {
    return visitor.whenNullList(this, param);
  }
}