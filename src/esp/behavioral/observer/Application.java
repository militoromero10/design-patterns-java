package esp.behavioral.observer;

public class Application {

  private Editor editor;

  public static void main(String[] args) {
    Application application = new Application();
    application.config();
    application.getEditor().openFile(">>> Open file <<<");
    application.getEditor().getEventManager().unsubscribe(EventType.OPEN);
    application.getEditor().openFile(">>> Open file <<<");

  }

  public void config() {
    editor = new Editor();
    var logger = new LoggingListener("/path/to/log.txt", "Someone has opened the file: %s");
    editor.getEventManager().subscribe(EventType.OPEN, logger);

    var emailAlerts = new EmailAlertsListener("admin@example.com",
        "Someone has changed the file: %s");
    editor.getEventManager().subscribe(EventType.SAVE, emailAlerts);

  }

  public Editor getEditor() {
    return editor;
  }

  public void setEditor(Editor editor) {
    this.editor = editor;
  }

}
