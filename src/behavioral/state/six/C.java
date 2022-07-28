package behavioral.state.six;

public class C extends State {

  // 8. "call back to" the wrapper class
  public void on(FSM fsm) {
    System.out.println("C + on  = B");
    fsm.changeState(1);
  }
}