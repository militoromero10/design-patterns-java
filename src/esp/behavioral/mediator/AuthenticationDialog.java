package esp.behavioral.mediator;

public class AuthenticationDialog implements Mediator {

  private String title;
  private Checkbox loginOrRegisterChkBx;
  private TextBox loginUsername;
  private TextBox loginPassword;
  private TextBox registrationUsername;
  private TextBox registrationPassword;
  private TextBox registrationEmail;
  private Button okBtn;
  private Button cancelBtn;
  private boolean found;

  public AuthenticationDialog() {
  }

  @Override
  public void notify(Component sender, String event) {
    if(sender == loginOrRegisterChkBx && event =="check"){
      if(loginOrRegisterChkBx.isChecked()){
        title = "Log in";
      }else{
        title = "Register";
      }
    }

    if(sender == okBtn && event == "click"){
      if(loginOrRegisterChkBx.isChecked()){
        if(!found){

        }
      }else{

      }
    }
  }
}
