package esp.behavioral.mediator;

public class Checkbox extends Component {

  private boolean checked;

  public Checkbox(Mediator dialog) {
    super(dialog);
  }

  public void check(){
    dialog.notify(this, "check");
  }


  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
  }
}
