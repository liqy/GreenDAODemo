package com.bwie.greendaodemo.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by liqy on 2017/11/30.
 */

@Entity
public class Cart {

    @Id(autoincrement = true)
    public long id;

    @NotNull
    public long pid;

    @NotNull
    public String pname;

    public Cart(long pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    @Generated(hash = 1126886607)
    public Cart(long id, long pid, @NotNull String pname) {
        this.id = id;
        this.pid = pid;
        this.pname = pname;
    }

    @Generated(hash = 1029823171)
    public Cart() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPid() {
        return this.pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return this.pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


}
