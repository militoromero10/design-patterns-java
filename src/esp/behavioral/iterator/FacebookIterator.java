package esp.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {

  private Facebook facebook;
  private String profileId;
  private String type;

  private int currentPosition;
  private Profile[] cache;

  public FacebookIterator(Facebook facebook, String profileId, String type) {
    this.facebook = facebook;
    this.profileId = profileId;
    this.type = type;
  }

  private void lazyInit(){
    if(cache == null){
      cache = facebook.socialGraphRequest(profileId, type);
    }
  }

  @Override
  public Profile getNext() {
    if(hasMore()){
      currentPosition++;
      return cache[currentPosition];
    }
    return cache[currentPosition];
  }

  @Override
  public boolean hasMore() {
    lazyInit();
    return currentPosition < cache.length;
  }
}
