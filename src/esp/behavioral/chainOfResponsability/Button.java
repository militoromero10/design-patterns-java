package esp.behavioral.chainOfResponsability;

public class Button extends Component {

  private String modalHelpText;
  private int x;
  private int y;
  private double width;
  private double height;

  public Button(int x, int y, double width, double height, String modalHelpText) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.modalHelpText = modalHelpText;
  }
}
