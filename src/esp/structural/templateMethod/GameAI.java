package esp.structural.templateMethod;


import java.util.List;

public abstract class GameAI {


  void turn() {
    collectResources();
    buildStructures();
    buildUnits();
    attack();
  }

  void collectResources() {
    var structures = this.buildStructures();
    for (Structure s : structures) {
      s.collect();
    }
  }

  void attack() {
    var enemy = closestEnemy();
    int x = getX();
    int y = getY();
    if (enemy != null) {
      sendScouts(x, y);
    } else {
      sendWarriors(enemy.getPosition());
    }
  }

  public Enemy closestEnemy() {
    return new Enemy();
  }

  public int getX() {
    return -1;
  }

  public int getY() {
    return -1;
  }


  abstract List<Structure> buildStructures();

  abstract void buildUnits();

  abstract void sendScouts(int positionX, int positionY);

  abstract void sendWarriors(int position);
}
