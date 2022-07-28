package esp.behavioral.memento;

public class Snapshot {

  private Editor editor;
  private String text, curX, curY, selectionWidth;

  public Snapshot(Editor editor, String text, String curX, String curY,
      String selectionWidth) {
    this.editor = editor;
    this.text = text;
    this.curX = curX;
    this.curY = curY;
    this.selectionWidth = selectionWidth;
  }

  public void restore(){
    editor.setText(this.text);
    editor.setCursor(this.curX, this.curY);
    editor.setSelectionWidth(this.selectionWidth);
  }

  class Command {

    private Snapshot backup;

    public void makeBackup(){
      backup = editor.createSnapshot();
    }

    public void undo(){
      if(backup!=null){
        backup.restore();
      }
    }

  }

}
