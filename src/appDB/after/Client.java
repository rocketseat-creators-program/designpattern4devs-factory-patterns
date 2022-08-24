package appDB.after;

import appDB.after.db.DB;
import appDB.after.db.MySQLDB;
import appDB.after.factory.MySQLFactory;

public class Client {

    public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
        DB db = new MySQLFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }

}
