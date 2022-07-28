package esp.structural.adapter;

public class App {

  public static void main(String[] args) {
    var hole  = new RoundHole(5d);
    var rpeg = new RoundPeg(5d);
    var fit1 = hole.fits(rpeg);

    var small_sqpeg = new SquarePeg(5);
    var large_sqpeg = new SquarePeg(10);

//    hole.fits(small_sqpeg); no compila

    var small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
    var large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);

    hole.fits(small_sqpeg_adapter);
    hole.fits(large_sqpeg_adapter);
  }
}
