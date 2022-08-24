package appDB.beforeImplementation.db;

public class MySQLDB {
    public void query(String sql) {
        System.out.println("Querying " + sql + " in MySQL database");
    }

    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in SQL database");
    }
}
