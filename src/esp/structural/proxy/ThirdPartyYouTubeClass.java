package esp.structural.proxy;

import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

  @Override
  public List listVideos() {
    return null;
  }

  @Override
  public Object getVideoInfo(long id) {
    return null;
  }

  @Override
  public void downloadVideo(long id) {

  }
}
