package structure.bridge.two;

public class StackArray implements StackImpl {

  private final int[] items;
  private int total = -1;

  public StackArray() {
    this.items = new int[12];
  }

  public StackArray(int cells) {
    this.items = new int[cells];
  }

  public void push(int i) {
    if (!isFull()) {
      items[++total] = i;
    }
  }

  public boolean isEmpty() {
    return total == -1;
  }

  public boolean isFull() {
    return total == items.length - 1;
  }

  public int top() {
    if (isEmpty()) {
      return -1;
    }
    return items[total];
  }

  public int pop() {
    if (isEmpty()) {
      return -1;
    }
    return items[total--];
  }
}
