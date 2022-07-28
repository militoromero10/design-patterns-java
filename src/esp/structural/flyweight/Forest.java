package esp.structural.flyweight;

import java.util.List;

public class Forest {

  private List<Tree> trees;

  public void plantTree(int x, int y, String name, String color, String texture){
    var type = TreeFactory.getTreeType(name, color, texture);
    var tree = new Tree(x,y,type);
    trees.add(tree);
  }

  public void draw(String canvas){
    for(Tree tree: trees){
      tree.draw(canvas);
    }
  }

}
