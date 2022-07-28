package esp.structural.decorator;

// Example1
public class App {

  void dumbUsageExample() {
    DataSource source = new FileDataSource("somefile.dat");
    source.writeData("Salary records");

    source = new CompressionDataSourceDecorator(source);
    source.writeData("Salary records");

    source = new EncryptionDataSourceDecorator(source);
    source.writeData("Salary records");
  }
}
