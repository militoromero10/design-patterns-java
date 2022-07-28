package esp.structural.proxy;

public class Application {

  public void init(){
    var aYouTubeService = new ThirdPartyYouTubeClass();
    var aYouTubeProxy = new CachedYouTubeClass(aYouTubeService);
    var manager = new YouTubeManager(aYouTubeProxy);
    manager.reactOnUserInput();
  }

}
