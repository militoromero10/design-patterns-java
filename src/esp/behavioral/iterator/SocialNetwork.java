package esp.behavioral.iterator;

public interface SocialNetwork {

  ProfileIterator createFriendsIterator(String id);

  ProfileIterator createCoworkersIterator(String id);

}
