package esp.structural.state;

public class LockedState extends State {

  public LockedState(AudioPlayer audioPlayer) {
    super(audioPlayer);
  }

  @Override
  void clickLock() {
    if(audioPlayer.isPlaying()){
      audioPlayer.changeState(new PlayingState(audioPlayer));
    }else{
      audioPlayer.changeState(new ReadyState(audioPlayer));

    }
  }

  @Override
  void clickPlay() {

  }

  @Override
  void clickNext() {

  }

  @Override
  void clickPrevious() {

  }
}
