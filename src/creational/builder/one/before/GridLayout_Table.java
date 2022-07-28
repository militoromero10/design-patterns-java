package creational.builder.one.before;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JPanel;

public class GridLayout_Table {

  private JPanel m_table = new JPanel();

  public GridLayout_Table(String[][] matrix) {
    m_table = new JPanel();
    m_table.setLayout(new GridLayout(matrix[0].length, matrix.length));
    m_table.setBackground(Color.white);

    for (int i = 0; i < matrix[i].length; ++i) {
      for (int j = 0; j < matrix.length; ++j) {
        m_table.add(new Label(matrix[j][i]));
      }
    }
  }

  public Component get_table() {
    return m_table;
  }
}
