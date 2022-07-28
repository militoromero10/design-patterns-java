package esp.structural.decorator;

public class CompressionDataSourceDecorator extends DataSourceDecorator {

  public CompressionDataSourceDecorator(DataSource dataSource) {
    super(dataSource);
  }

  @Override
  public void writeData(String data) {
    data = "Comprimiendo data";
    dataSource.writeData(data);
  }

  @Override
  public String readData() {
    var data = dataSource.readData();
    data = "Descomprimir data";
    return dataSource.readData();
  }
}
