package behavioral.state.six;

public class B extends State {
  public void on(FSM fsm) {
    System.out.println("B + on  = A");
    fsm.changeState(0);
  }

  public void off(FSM fsm) {
    System.out.println("B + off = C");
    fsm.changeState(2);
  }
}