package esp.structural.proxy;

public class YouTubeManager {


  private ThirdPartyYouTubeLib service;

  public YouTubeManager(ThirdPartyYouTubeLib service) {
    this.service = service;
  }

  public void renderVideoPage(long id){
    var info = service.getVideoInfo(id);
  }

  public void renderListPanel(){
    var list = service.listVideos();
  }

  public void reactOnUserInput(){
    renderVideoPage(1);
    renderListPanel();
  }
}
