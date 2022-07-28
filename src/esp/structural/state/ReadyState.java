package esp.structural.state;

public class ReadyState extends State {

  public ReadyState(AudioPlayer audioPlayer) {
    super(audioPlayer);
  }

  @Override
  public void clickLock() {
    audioPlayer.changeState(new LockedState(audioPlayer));
  }

  @Override
  public void clickPlay() {
    audioPlayer.startPlayback();
    audioPlayer.changeState(new PlayingState(audioPlayer));
  }

  @Override
  public void clickNext() {
    audioPlayer.nextSong();
  }

  @Override
  public void clickPrevious() {
    audioPlayer.previousSong();
  }
}
