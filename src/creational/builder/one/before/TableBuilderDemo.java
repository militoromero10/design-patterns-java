package creational.builder.one.before;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;

public class TableBuilderDemo {

  public static void main(String[] args) {
    (new TableBuilderDemo()).demo(args);
  }

  /**
   * Client code perspective.
   */
  public void demo(String[] args) {
    // Name of the GUI table class can be passed to the app parameters.
    String class_name = args.length > 0 ?  args[0] : "JTable_Table";

    // Then we read the tabular data from file...
    String file_name = getClass().getResource("../BuilderDemo.dat").getFile();
    String[][] matrix = read_data_file(file_name);

    // ..and pass it to specific GUI creator, which knows what GUI
    // component to create and how to initialize it.
    Component comp;
    if (class_name.equals("GridLayout_Table")) {
      comp = new GridLayout_Table(matrix).get_table();
    } else if (class_name.equals("GridBagLayout_Table")) {
      comp = new GridBagLayout_Table(matrix).get_table();
    } else {
      comp = new JTable_Table(matrix).get_table();
    }

    // Finally, create a GUI window and put there our table component.
    JFrame frame = new JFrame("BuilderDemo - " + class_name);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(comp);
    frame.pack();
    frame.setVisible(true);
  }

  public static String[][] read_data_file(String file_name) {
    String[][] matrix = null;
    try {
      BufferedReader br = new BufferedReader(new FileReader(file_name));
      String line;
      String[] cells;

      if ((line = br.readLine()) != null) {
        cells = line.split("\\t");
        int width = Integer.parseInt(cells[0]);
        int height = Integer.parseInt(cells[1]);
        matrix = new String[width][height];
      }

      int row = 0;
      while ((line = br.readLine()) != null) {
        cells = line.split("\\t");
        for (int i = 0; i < cells.length; ++i) {
          matrix[i][row] = cells[i];
        }
        row++;//France
      }
      br.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return matrix;
  }
}
