package behavioral.observer.one;

import java.util.Scanner;

public class ObserverDemo {
  /*
  55
  12
  -10
  112
  5
   */
  public static void main( String[] args ) {
    Subject sub = new Subject();
    // Client configures the number and type of Observers
    new HexObserver(sub);
    new OctObserver(sub);
    new BinObserver(sub);
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("\nEnter a number: ");
      sub.setState(scan.nextInt());
    }
  }
}
