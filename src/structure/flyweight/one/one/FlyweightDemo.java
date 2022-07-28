package structure.flyweight.one.one;

public class FlyweightDemo {

  public static final int ROWS = 6, COLS = 10;

  public static void main(String[] args) {
    Gazillion[][] matrix = new Gazillion[ROWS][COLS];
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        matrix[i][j] = new Gazillion(COLS);
      }
    }
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        matrix[i][j].report();
      }
      System.out.println();
    }
  }
}
