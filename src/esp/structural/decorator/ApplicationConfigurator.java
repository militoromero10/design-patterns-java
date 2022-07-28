package esp.structural.decorator;

public class ApplicationConfigurator {

  public static void main(String[] args) {
    DataSource ds = new FileDataSource("salary.dat");

    boolean enabledEncryption = ((int)Math.random() *6)%2==0 ;
    if(enabledEncryption){
      ds = new EncryptionDataSourceDecorator(ds);
    }else{
      //enabledCompression
      ds = new CompressionDataSourceDecorator(ds);
    }

    var logger = new SalaryManager(ds);
    var salary = logger.load();
  }
}
