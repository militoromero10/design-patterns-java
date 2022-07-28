package esp.structural.state;

public abstract class State {

  protected AudioPlayer audioPlayer;

  public State(AudioPlayer audioPlayer) {
    this.audioPlayer = audioPlayer;
  }

  abstract void clickLock();
  abstract void clickPlay();
  abstract void clickNext();
  abstract void clickPrevious();


}
