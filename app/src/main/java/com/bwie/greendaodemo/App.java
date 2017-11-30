package com.bwie.greendaodemo;

import android.app.Application;

import com.bwie.greendaodemo.db.DBUtils;

/**
 * Created by liqy on 2017/11/30.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化数据库
         */
        DBUtils.initDB(this);
    }
}
