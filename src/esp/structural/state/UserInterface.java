package esp.structural.state;

public class UserInterface implements Component {

  private Button lockButton;
  private Button playButton;
  private Button nextButton;
  private Button prevButton;

  public Button getLockButton() {
    return lockButton;
  }

  public void setLockButton(Button lockButton) {
    this.lockButton = lockButton;
  }

  public Button getPlayButton() {
    return playButton;
  }

  public void setPlayButton(Button playButton) {
    this.playButton = playButton;
  }

  public Button getNextButton() {
    return nextButton;
  }

  public void setNextButton(Button nextButton) {
    this.nextButton = nextButton;
  }

  public Button getPrevButton() {
    return prevButton;
  }

  public void setPrevButton(Button prevButton) {
    this.prevButton = prevButton;
  }
}
