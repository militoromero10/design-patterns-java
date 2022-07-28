package esp.structural.flyweight;

// estado extrinseco
public class Tree {

  private int x;
  private int y;
  private TreeType treeType;

  public Tree(int x, int y, TreeType treeType) {
    this.x = x;
    this.y = y;
    this.treeType = treeType;
  }

  public void draw(String canvas){
    treeType.draw(canvas,this.x, this.y);
  }
}
