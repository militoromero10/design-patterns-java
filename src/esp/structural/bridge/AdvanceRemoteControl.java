package esp.structural.bridge;

public class AdvanceRemoteControl extends RemoteControl {

  public AdvanceRemoteControl(Device device) {
    super(device);
  }

  public void mute(){
    device.setVolume(0);
  }
}
