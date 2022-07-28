package esp.behavioral.observer;

import java.util.HashMap;

public class EventManager {
  private HashMap<EventType, EventListener> listeners = new HashMap<>();

  public void subscribe(EventType typeEvent, EventListener listener){
    listeners.put(typeEvent, listener);
  }

  public void unsubscribe(EventType typeEvent){
    listeners.remove(typeEvent);
    listeners.remove(typeEvent);
  }

  public void notify(EventType eventType, String data){
      var listener = listeners.get(eventType);
      if(listener!=null){
        listener.update(String.format("event fired was %s with data{%s}", eventType, data));
      }else{
        System.out.println(String.format("Unable to connect with %s event", eventType.name()));
      }
  }
}
