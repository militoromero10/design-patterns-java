package esp.structural.flyweight;

// estado intrinseco
public class TreeType {
  private String name;
  private String color;
  private String texture;

  public TreeType(String name, String color, String texture) {
    this.name = name;
    this.color = color;
    this.texture = texture;
  }

  public void draw(String canvas, int x, int y){
    System.out.println(String.format("Drawing canvas={%s}, coordinate(%s,%s)", canvas, x,y));
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public String getTexture() {
    return texture;
  }
}
