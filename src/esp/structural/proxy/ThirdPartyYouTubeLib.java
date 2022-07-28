package esp.structural.proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib {

  List listVideos();

  Object getVideoInfo(long id);

  void downloadVideo(long id);
}
