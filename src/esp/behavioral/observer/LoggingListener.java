package esp.behavioral.observer;

public class LoggingListener implements EventListener {

  private final String log;
  private final String message;

  public LoggingListener(String log, String message) {
    this.log = log;
    this.message = message;
  }

  @Override
  public void update(String filename) {
//    log.write("File name : "+filename);
    System.out.println("File name : " + filename);
  }
}
