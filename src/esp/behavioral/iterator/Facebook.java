package esp.behavioral.iterator;

public class Facebook implements SocialNetwork {

  @Override
  public ProfileIterator createFriendsIterator(String id) {
    return new FacebookIterator(this, id, "friends");
  }

  @Override
  public ProfileIterator createCoworkersIterator(String id) {
    return new FacebookIterator(this, id, "coworkers");
  }

  public Profile[] socialGraphRequest(String profileId, String type){
    if(profileId!= null && type!= null){
      return new Profile[]{new Profile(),new Profile(),new Profile()};
    }
    return new Profile[]{};
  }
}
