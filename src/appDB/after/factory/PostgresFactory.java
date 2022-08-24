package appDB.after.factory;

import appDB.after.db.DB;
import appDB.after.db.PostgresDB;

public class PostgresFactory implements DBFactory{

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
