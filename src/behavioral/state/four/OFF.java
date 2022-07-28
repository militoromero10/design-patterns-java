package behavioral.state.four;

public class OFF extends State {
  private static OFF instance = new OFF();
  private OFF() { }

  public static State instance() {
    return instance;
  }
  // 6. Override only the necessary methods
  public void push(Button b) {
    // 7. The "wrapper" may callback to the "wrapper"
    b.setCurrent(ON.instance());
    System.out.println("   turning ON");
  }
}