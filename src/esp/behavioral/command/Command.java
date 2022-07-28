package esp.behavioral.command;

public abstract class Command {

  protected Application application;
  protected Editor editor;
  private String text;
  private String backUp;

  public Command(Application application, Editor editor) {
    this.application = application;
    this.editor = editor;
  }

  public void saveBackup(){
    backUp = editor.getSelection();
  }

  public void undo(){
    editor.replaceSelection(backUp);
  }

  public abstract boolean execute();
}
