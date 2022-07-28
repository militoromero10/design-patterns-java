package esp.structural.bridge;

public class App {

  public static void main(String[] args) {
    var tv = new Tv();
    var remote = new RemoteControl(tv);

    remote.toggle();

    var radio = new Radio();
    var remoteAdv = new AdvanceRemoteControl(radio);
  }
}
