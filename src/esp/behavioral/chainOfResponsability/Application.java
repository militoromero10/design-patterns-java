package esp.behavioral.chainOfResponsability;

public class Application {

  public void createUI(){
    var dialog = new Dialog("Budget reports");
    dialog.setWikiPageURL("http://...");
    var panel = new Panel(0,0,400,800);
    panel.setModalHelpText("This panel does ...");
    var ok = new Button(250,760,50,20,"OK");
    ok.setTooltipText("This is an OK button that...");
    var cancel = new Button(320, 760, 50, 20, "Cancel");

    panel.add(ok);
    panel.add(cancel);
    dialog.add(panel);
  }

  public void onF1KeyPress(){
    var component = this.getComponentAtMouseCoords();
    component.showHelp();
  }

  public Component getComponentAtMouseCoords(){
    return null;
  }
}
