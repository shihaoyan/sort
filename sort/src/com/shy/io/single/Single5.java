package com.shy.io.single;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 石皓岩
 * @create 2020-04-11 13:01
 * 描述：
 */
public enum Single5 {

    DATASOURCE;
    private Connection connection = null;
    private Single5(){
        try {
            Class.forName("driverName");
            connection = DriverManager.getConnection("url", "username", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public Connection getConnection(){
        return connection;
    }


}
