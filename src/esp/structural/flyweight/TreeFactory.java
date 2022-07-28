package esp.structural.flyweight;

import java.util.List;

public class TreeFactory {

  public static List<TreeType> treeTypes;

  public static TreeType getTreeType(String name, String color, String texture){

    var type = find(name, color, texture);

    if(type == null){
      type = new TreeType(name, color, texture);
      treeTypes.add(type);
    }
    return type;
  }

  public static TreeType find(String name, String color, String texture){
    var type = new TreeType(name, color, texture);
    var index = treeTypes.indexOf(type);
    if(index != -1){
      return treeTypes.get(index);
    }else {
      return type;
    }
  }

}
