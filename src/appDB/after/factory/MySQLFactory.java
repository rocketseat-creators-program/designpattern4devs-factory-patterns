package appDB.after.factory;

import appDB.after.db.DB;
import appDB.after.db.MySQLDB;

public class MySQLFactory implements DBFactory {
    @Override
    public DB getDatabase() {
        return new MySQLDB();
    }
}
