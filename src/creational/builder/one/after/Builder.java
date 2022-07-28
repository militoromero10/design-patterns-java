package creational.builder.one.after;

import java.awt.Component;

public interface Builder {
  void setWidthAndHeight(int width, int height);

  void startRow();

  void buildCell(String value);

  Component getResult();
}