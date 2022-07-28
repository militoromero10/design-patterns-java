package creational.builder.one.after;

import java.io.BufferedReader;
import java.io.FileReader;

public class TableDirector {

  private final Builder m_builder;

  public TableDirector(Builder b) {
    m_builder = b;
  }

  public void construct(String file_name) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(file_name));
      String line;
      String[] cells;

      if ((line = br.readLine()) != null) {
        cells = line.split("\\t");
        int width = Integer.parseInt(cells[0]);
        int height = Integer.parseInt(cells[1]);
        m_builder.setWidthAndHeight(width, height);
      }

      while ((line = br.readLine()) != null) {
        cells = line.split("\\t");
        for (int col = 0; col < cells.length; ++col) {
          m_builder.buildCell(cells[col]);
        }
        m_builder.startRow();
      }

      br.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}