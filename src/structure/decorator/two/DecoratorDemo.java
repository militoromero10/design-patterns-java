package structure.decorator.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorDemo extends Decorator {

  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

  public DecoratorDemo(LCD inner) {
    super(inner);
  }

  /**
   PASSWORD: secret
   INPUT:    the quick brown fox
   encrypt:
   main:     oc`xlpd^fe]mjrizajs
   PASSWORD: secret
   decrypt:
   Output:   the quick brown fox
   */
  public static void main(String[] args) {
    LCD stream = new DecoratorDemo(new Scramble(new Core()));
    String[] str = {""};
    stream.write(str);
    System.out.println("main:     " + str[0]);
    stream.read(str);
  }

  public void write(String[] s) {
    System.out.print("PASSWORD: ");
    try {
      in.readLine();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    super.write(s);
  }

  public void read(String[] s) {
    System.out.print("PASSWORD: ");
    try {
      in.readLine();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    super.read(s);
  }
}
