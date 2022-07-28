package esp.creational.singleton;

public class Database {

  private static Database database;

  private Database() {

  }

  public static Database getInstance() {
    if (database == null) {
      return new Database();
    }
    return database;
  }

  public void query(String sql){
    System.out.println(sql);
  }

  public static void main(String[] args) {
    var db = Database.getInstance();
    db.query("SELECT * FROM users");
  }

}
