package creational.abstractFactory.dos;

public abstract class AbstractFactory {

  public Expression prototype;

  public Expression makePhase() {
    return prototype.clone();
  }

  public abstract Expression makeCompromise();

  public abstract Expression makeGrade();
}
