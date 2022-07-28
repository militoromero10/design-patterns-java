package structure.flyweight.four;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ColorBox extends Canvas {
  private Color curColor = getColor();
  private static Color[]  colors = { Color.black, Color.blue, Color.cyan,
      Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.red,
      Color.magenta, Color.orange, Color.pink, Color.white, Color.yellow };

  public ColorBox(ThreadPool tp) {
    tp.register(this);
  }

  private static Color getColor() {
    return colors[(int)(Math.random() * 1000) % colors.length];
  }

  public void changeColor() {
    curColor = getColor();
    repaint();
  }

  public void paint(Graphics g) {
    g.setColor(curColor);
    g.fillRect( 0, 0, getWidth(), getHeight() );
  }
}
