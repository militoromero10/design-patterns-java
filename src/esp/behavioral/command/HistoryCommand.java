package esp.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class HistoryCommand {

  private List<Command> commands = new ArrayList<>();

  public void push(Command c){
    commands.add(c);
  }

  public Command pop(){
    return commands.get(0);
  }

}
