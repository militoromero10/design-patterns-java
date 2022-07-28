package esp.structural.adapter;

public class SquarePegAdapter extends RoundPeg {

  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    super(squarePeg.getWidth());
    this.squarePeg = squarePeg;
  }

  @Override
  public double getRadius() {
    return squarePeg.getWidth() * Math.sqrt(2) / 2;
  }
}
