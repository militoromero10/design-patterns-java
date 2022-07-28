package esp.behavioral.observer;

import java.io.File;

public class Editor {

  private EventManager eventManager;
  private String file;

  public Editor() {
    eventManager = new EventManager();
  }

  public void openFile(String path) {
    System.out.println(path);
    eventManager.notify(EventType.OPEN, "file.getName()");
  }

  public void saveFile() {
//    file.write();
    eventManager.notify(EventType.SAVE, "file.getName()");
  }

  public EventManager getEventManager() {
    return eventManager;
  }

  public void setEventManager(EventManager eventManager) {
    this.eventManager = eventManager;
  }

  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }
}
