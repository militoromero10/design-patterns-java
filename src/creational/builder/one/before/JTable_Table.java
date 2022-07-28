package creational.builder.one.before;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTable_Table {
  private JTable m_table;

  public JTable_Table(String[][] matrix) {
    m_table = new JTable(matrix[0].length, matrix.length);

    TableModel model = m_table.getModel();
    for (int i = 0; i < matrix.length; ++i)
      for (int j = 0; j < matrix[i].length; ++j)
        model.setValueAt(matrix[i][j], j, i);
  }

  public Component get_table() {
    return m_table;
  }
}