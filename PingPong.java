import java.io.Console;

public class PingPong {
  public static void main(String[] args) {

    Console c = System.console();
    System.out.println("Ping Pong until what number?");
    String limitString = c.readLine();
    Integer limit = Integer.parseInt(limitString);
    pingPong(limit);

  }

  public static void pingPong(Integer limit) {
    for (Integer i = 1; i <= limit; ++i) {
      if (i % 15 == 0) {
        System.out.println("ping-pong");
      } else if (i % 5 == 0) {
        System.out.println("pong");
      } else if (i % 3 == 0) {
        System.out.println("ping");
      } else {
        System.out.println(i);
      }
    }
  }
}
