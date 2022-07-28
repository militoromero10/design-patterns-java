package esp.behavioral.command;

public class Editor {

  private String text;


  public String getSelection(){
    return text;
  }

  public void deleteSelection(){
    this.text ="";
  }

  public void replaceSelection(String text){
    this.text = text;
  }

}
