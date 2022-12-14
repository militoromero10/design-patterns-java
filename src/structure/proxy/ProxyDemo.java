package structure.proxy;

import java.util.Scanner;

public class ProxyDemo {
  public static void main( String[] args ) {
    args = new String[]{"firsst"};
    // 3. The client deals with the wrapper
    SocketInterface socket = new SocketProxy( "127.0.0.1", 8080, args[0].equals("first") ? true : false );
    String  str;
    boolean skip = true;
    while (true) {
      if (args[0].equals("second") && skip) {
        skip = !skip;
      } else {
        str = socket.readLine();
        System.out.println("Receive - " + str);
        if (str.equals(null)) {
          break;
        }
      }
      System.out.print( "Send ---- " );
      str = new Scanner(System.in).nextLine();
      socket.writeLine( str );
      if (str.equals("quit")) {
        break;
      }
    }
    socket.dispose();
  }
}
//Receive - GET / HTTP/1.1
//Send ----
//Receive - Host: localhost:8080
//Send ----
//Receive - Connection: keep-alive
//Send ----
//Receive - Cache-Control: max-age=0
//Send ----
//Receive - Upgrade-Insecure-Requests: 1
//Send ----
//Receive - User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.110 Safari/537.36
//Send ----
//Receive - Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
//Send ----
//Receive - DNT: 1
//Send ----
//Receive - Accept-Encoding: gzip, deflate, sdch, br
//Send ----
//Receive - Accept-Language: ru,en-US;q=0.8,en;q=0.6,uk;q=0.4
//Send ----
//Receive - Cookie: JSESSIONID=32E01EAB6C4F723716A8E4A80BC5A381
//Send ---- quit