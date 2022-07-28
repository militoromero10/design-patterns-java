package esp.behavioral.command;

public class Button {

  private Command command;

  public Button(Command command) {
    this.command = command;
  }

  public Command getCommand() {
    return command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }
}
