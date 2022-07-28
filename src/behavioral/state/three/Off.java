package behavioral.state.three;

public class Off extends State {
  public void pull(Chain wrapper) {
    wrapper.setState(new Low());
    System.out.println( "   low speed" );
  }
}