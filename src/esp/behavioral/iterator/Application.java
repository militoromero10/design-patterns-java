package esp.behavioral.iterator;

public class Application {

  private SocialNetwork socialNetwork;
  private SocialSpammer socialSpammer;

  public void config() {
//    if( working with Facebook)
      this.socialNetwork = new Facebook();
//    if( working with LinkedIn)
//      this.socialNetwork = new LinkedIn();
    this.socialSpammer = new SocialSpammer();
  }

  public void sendSpamToFriends(Profile profile){
    var iterator = socialNetwork.createFriendsIterator(profile.getId());
    socialSpammer.send(iterator,"Very important message");
  }

  public void  sendSpamToCoworkers(Profile profile){
    var iterator = socialNetwork.createCoworkersIterator(profile.getId());
    socialSpammer.send(iterator,"Very important message");
  }

}
