package creational.builder.one.after;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TableBuilderDemo {

  public static void main(String[] args) {
    (new TableBuilderDemo()).demo(args);
  }

  /**
   * Client code perspective.
   */
  public void demo(String[] args) {
    // Name of the GUI table class can be passed to the app parameters.
    String class_name = args.length > 0 ? args[0] : "JTable_Builder";

    Builder target = null;
    try {
      target = (Builder) Class.forName(getClass().getName() + "$" + class_name)
          .getDeclaredConstructor().newInstance();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    String file_name = getClass().getResource("../BuilderDemo.dat").getFile();
    TableDirector director = new TableDirector(target);
    director.construct(file_name);
    Component comp = target.getResult();

    JFrame frame = new JFrame("BuilderDemo - " + class_name);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(comp);
    frame.pack();
    frame.setVisible(true);
  }

  public static class JTable_Builder implements Builder {

    private JTable m_table;
    private TableModel m_model;
    private int x = 0, y = 0;

    public void setWidthAndHeight(int width, int height) {
      m_table = new JTable(height, width);
      m_model = m_table.getModel();
    }

    public void startRow() {
      x = 0;
      ++y;
    }

    public void buildCell(String value) {
      m_model.setValueAt(value, y, x++);
    }

    public Component getResult() {
      return m_table;
    }
  }

  public static class GridLayout_Builder implements Builder {

    private final JPanel m_panel = new JPanel();

    public void setWidthAndHeight(int width, int height) {
      m_panel.setLayout(new GridLayout(height, width));
      m_panel.setBackground(Color.white);
    }

    public void startRow() {
    }

    public void buildCell(String value) {
      m_panel.add(new Label(value));
    }

    public Component getResult() {
      return m_panel;
    }
  }

  public static class GridBagLayout_Builder implements Builder {

    private final JPanel m_panel = new JPanel();
    private final GridBagConstraints c = new GridBagConstraints();
    private int x = 0, y = 0;

    public void setWidthAndHeight(int width, int height) {
      m_panel.setLayout(new GridBagLayout());
      m_panel.setBackground(Color.white);
    }

    public void startRow() {
      x = 0;
      ++y;
    }

    public void buildCell(String value) {
      c.gridx = x++;
      c.gridy = y;
      m_panel.add(new Label(value), c);
    }

    public Component getResult() {
      return m_panel;
    }
  }


}
