package esp.behavioral.iterator;

public class SocialSpammer {

  public void send(ProfileIterator iterator, String message){
    while (iterator.hasMore()){
      Sys.sendEmail(iterator.getNext().getEmail(), message);
    }
  }

}
