package esp.behavioral.memento;

public class Command {

  private Editor editor;

  public void makeBackup(){
    var snapshot = editor.createSnapshot();
  }

}
