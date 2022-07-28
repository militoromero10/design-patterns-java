package structure.bridge.two;

public class StackFIFO extends Stack {

  private final StackImpl stackImpl = new StackList();

  public StackFIFO() {
    super("array");
  }

  public StackFIFO(String s) {
    super(s);
  }

  public int pop() {
    while (!isEmpty()) {
      stackImpl.push(super.pop());
    }
    int ret = stackImpl.pop();
    while (!stackImpl.isEmpty()) {
      push(stackImpl.pop());
    }
    return ret;
  }
}