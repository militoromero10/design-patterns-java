package esp.behavioral.memento;

public class Editor {

  private String text, curX, curY, selectionWidth;

  public void setText(String text) {
    this.text = text;
  }

  public void setCursor(String curX, String curY) {
    this.curX = curX;
    this.curY = curY;
  }

  public void setSelectionWidth(String selectionWidth) {
    this.selectionWidth = selectionWidth;
  }

  public Snapshot createSnapshot(){
    return new Snapshot(this, text, curX, curY, selectionWidth);
  }

}
