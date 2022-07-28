package esp.structural.decorator;

public class EncryptionDataSourceDecorator extends DataSourceDecorator {

  public EncryptionDataSourceDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public void writeData(String data) {
    data = "Encriptar y pasar el llamado al objeto envuelto";
    dataSource.writeData(data);
  }

  @Override
  public String readData() {
    var data = dataSource.readData();
    data = "Descifrar data";

    return dataSource.readData();
  }
}
