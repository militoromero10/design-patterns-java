package behavioral.state.three;

import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo {
  public static void main( String[] args ) throws IOException {
    InputStreamReader is = new InputStreamReader( System.in );
    Chain chain = new Chain();
    while (true) {
      System.out.print( "Press 'Enter'" );
      is.read();
      chain.pull();
    }
  }
}