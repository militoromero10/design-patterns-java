package esp.creational.prototype;

import java.util.HashMap;

public class App {

  public static void main(String[] args) {

    HashMap<String, Shape> shapes = new HashMap<>();

    Circle circle = new Circle();
    circle.setX(10);
    circle.setY(10);
    circle.setR(20);

    shapes.put("circle", circle);

    Circle anotherCircle = (Circle) circle.clone();

    shapes.put("proto-circle", circle);

    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(10);
    rectangle.setWidth(20);


  }
}
