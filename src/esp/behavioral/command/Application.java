package esp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Application {

  private String clipboard;
  private List<Editor> editors = new ArrayList<>();
  private Editor activeEditor;
  private HistoryCommand historyCommand;

  public void createUI(){
    var copy = executeCommand(new CopyCommand(this, activeEditor));
    var buttonCopy = new Button(copy);
    var shortcutCopy = new Shortcut();
    shortcutCopy.onKeyPress("Ctrl+C", copy);

    var cut = executeCommand(new CutCommand(this, activeEditor));
    var buttonCut = new Button(cut);
    var shortcutCut = new Shortcut();
    shortcutCut.onKeyPress("Ctrl+X", cut);

    var paste = executeCommand(new PasteCommand(this, activeEditor));
    var buttonPaste = new Button(paste);
    var shortcutPaste = new Shortcut();
    shortcutPaste.onKeyPress("Ctrl+V", paste);

    var undo = executeCommand(new UndoCommand(this, activeEditor));
    var buttonUndo = new Button(undo);
    var shortcutUndo = new Shortcut();
    shortcutUndo.onKeyPress("Ctrl+Z", undo);

  }

  public Command executeCommand(Command command){
    if(command.execute()){
      historyCommand.push(command);
    }
    return command;
  }

  public void undo(){
    var command = historyCommand.pop();
    if(command!= null){
      command.undo();
    }
  }

  public String getClipboard() {
    return clipboard;
  }

  public void setClipboard(String clipboard) {
    this.clipboard = clipboard;
  }
}
