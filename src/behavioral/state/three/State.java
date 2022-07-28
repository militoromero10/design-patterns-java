package behavioral.state.three;

public abstract class State {
  public void pull(Chain wrapper) {
    wrapper.setState(new Off());
    System.out.println("   turning off");
  }
}
