package esp.structural.decorator;

//Example2
public class SalaryManager {
  private DataSource dataSource;

  public SalaryManager(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public String load(){
    return dataSource.readData();
  }

  public void save(){
    dataSource.writeData("Salary records");
  }
}
