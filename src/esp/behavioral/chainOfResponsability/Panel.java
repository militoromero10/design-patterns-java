package esp.behavioral.chainOfResponsability;

public class Panel extends Container {

  private String modalHelpText;
  private int x;
  private int y;
  private double width;
  private double height;

  public Panel(int x, int y, double width, double height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  @Override
  public void showHelp() {
    if(modalHelpText!=null){
      System.out.println(modalHelpText);
    }else {
      super.showHelp();
    }
  }

  public String getModalHelpText() {
    return modalHelpText;
  }

  public void setModalHelpText(String modalHelpText) {
    this.modalHelpText = modalHelpText;
  }
}
