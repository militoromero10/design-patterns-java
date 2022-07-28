package esp.structural.state;

public class AudioPlayer {

  private State state;
  private boolean playing;

  private UserInterface UI;
  private Component volume, playlist, currentSong;

  public AudioPlayer() {
    this.state = new ReadyState(this);
    this.UI = new UserInterface();
    this.UI.getLockButton().onClick(this.clickLock());
    this.UI.getPlayButton().onClick(this.clickPlay());
    this.UI.getNextButton().onClick(this.clickNext());
    this.UI.getPrevButton().onClick(this.clickPrevious());

  }

  public void startPlayback(){}
  public void stopPlayback(){}
  public void nextSong(){}
  public void previousSong(){}
  public void fastForward(int seg){}
  public void rewind(int seg){}


  public void changeState(State state){
    this.state = state;
  }


  public Object clickLock(){
    state.clickLock();
    return null;
  }

  public Object clickPlay(){
    state.clickPlay();
    return null;
  }

  public Object clickNext(){
    state.clickNext();
    return null;
  }

  public Object clickPrevious(){
    state.clickPrevious();
    return null;
  }

  public UserInterface getUI() {
    return UI;
  }

  public void setUI(UserInterface UI) {
    this.UI = UI;
  }

  public boolean isPlaying() {
    return playing;
  }

  public void setPlaying(boolean playing) {
    this.playing = playing;
  }
}
