package appDB.beforeImplementation;

import appDB.beforeImplementation.db.MySQLDB;

public class Client {

    public static void main(String[] args) {
        MySQLDB db = new MySQLDB();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");

        //What happen if you have to change for a postgres database?
    }
}
