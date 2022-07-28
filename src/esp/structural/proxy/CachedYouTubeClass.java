package esp.structural.proxy;

import java.util.List;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {

  private ThirdPartyYouTubeClass thirdPartyYouTubeClass;

  private List listCache;
  private Object video;
  private boolean needReset;

  public CachedYouTubeClass(ThirdPartyYouTubeClass thirdPartyYouTubeClass) {
    this.thirdPartyYouTubeClass = thirdPartyYouTubeClass;
  }

  @Override
  public List listVideos() {
    if(listCache.isEmpty() || needReset){
      listCache = thirdPartyYouTubeClass.listVideos();
    }
    return listCache;
  }

  @Override
  public Object getVideoInfo(long id) {
    if(video==null || needReset){
      video = thirdPartyYouTubeClass.getVideoInfo(id);
    }
    return video;
  }

  @Override
  public void downloadVideo(long id) {
    if(!downloadExists(id) || needReset){
      thirdPartyYouTubeClass.downloadVideo(id);
    }
  }

  public boolean downloadExists(long id){
    return (Math.random()* id) % 2 ==0;
  }
}
