package esp.structural.state;

public class PlayingState extends State{

  public PlayingState(AudioPlayer audioPlayer) {
    super(audioPlayer);
  }

  @Override
  void clickLock() {
    audioPlayer.changeState(new LockedState(audioPlayer));
  }

  @Override
  void clickPlay() {
    audioPlayer.stopPlayback();
    audioPlayer.changeState(new ReadyState(audioPlayer));
  }

  @Override
  void clickNext() {
    if(audioPlayer.isPlaying()){
      audioPlayer.nextSong();
    }else{
      audioPlayer.fastForward(5);
    }
  }

  @Override
  void clickPrevious() {
    if(audioPlayer.isPlaying()){
      audioPlayer.previousSong();
    }else{
      audioPlayer.rewind(5);
    }
  }
}
