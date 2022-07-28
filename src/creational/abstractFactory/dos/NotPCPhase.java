package creational.abstractFactory.dos;

public class NotPCPhase extends Expression {

  private static final String[] list = {"\"pet\"", "\"short\"", "\"lie\"", "\"old\""};
  private static int next = 0;

  public NotPCPhase() {
    super(list[next]);
    next = (next + 1) % list.length;
  }

  @Override
  public Expression clone() {
    return new NotPCPhase();
  }
}
