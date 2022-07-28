package esp.structural.bridge;

public class Radio implements Device {

  private double percent;
  private int channel;

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public void enable() {
    System.out.println("turn on");
  }

  @Override
  public void disable() {
    System.out.println("turn off");
  }

  @Override
  public double getVolume() {
    return this.percent;
  }

  @Override
  public void setVolume(double percent) {
    this.percent = percent;
  }

  @Override
  public int getChannel() {
    return this.channel;
  }

  @Override
  public void setChannel(int channel) {
    this.channel = channel;
  }
}