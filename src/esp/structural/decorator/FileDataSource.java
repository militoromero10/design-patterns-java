package esp.structural.decorator;

public class FileDataSource implements DataSource {

  private String file;

  public FileDataSource(String file) {
    this.file = file;
  }

  @Override
  public void writeData(String data) {
    System.out.println(String.format("Writing file {%s}", data));
  }

  @Override
  public String readData() {
    System.out.println(String.format("Reading file {%s}", file));
    return file;
  }
}
