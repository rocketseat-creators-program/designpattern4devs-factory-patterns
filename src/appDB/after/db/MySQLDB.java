package appDB.after.db;

public class MySQLDB implements DB {

    public void query(String sql) {
        System.out.println("Querying " + sql + " in MySQL database");
    }

    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in MySQL database");
    }
}
