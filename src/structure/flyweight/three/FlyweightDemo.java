package structure.flyweight.three;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlyweightDemo {

  //18 50
  public static void main(String[] args) {
    args = new String[]{"18","50"};
    int size = 8;
    int pause = 100;
    if (args.length > 0) {
      size = Integer.parseInt(args[0]);
    }
    if (args.length > 1) {
      pause = Integer.parseInt(args[1]);
    }
    Frame frame = new Frame("ColorBoxes - 1 thread per ColorBox");
    frame.setLayout(new GridLayout(size, size));
    for (int i = 0; i < size * size; i++) {
      frame.add(new ColorBox(pause));
    }
    frame.setSize(500, 400);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}