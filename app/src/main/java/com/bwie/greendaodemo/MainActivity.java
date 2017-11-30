package com.bwie.greendaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bwie.greendaodemo.db.Cart;
import com.bwie.greendaodemo.db.DBUtils;
import com.bwie.greendaodemo.db.DaoSession;

public class MainActivity extends AppCompatActivity {

    DaoSession session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = DBUtils.getSession();

        Cart cart=new Cart(1,"vivo");

        session.insert(cart);

//        session.queryBuilder()//方法化的SQL语句
//        session.queryRaw()//和平时写SQL语句一致


    }
}
