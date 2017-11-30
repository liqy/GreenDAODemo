package com.bwie.greendaodemo.db;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

/**
 * Created by liqy on 2017/11/30.
 */

public class DBUtils {
    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */
    public static final boolean ENCRYPTED = true;

    private static DaoSession daoSession;

    public static void initDB(Context context){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, ENCRYPTED ? "notes-db-encrypted" : "notes-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public static DaoSession getSession() {
        return daoSession;
    }
}
