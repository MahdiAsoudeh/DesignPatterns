package com.mahdi20.singleton;


public class DBConnector {

    private static DBConnector instance = new DBConnector();


    private DBConnector() {

    }

    public static DBConnector getInstance() {

        return instance;

    }


    public void connect() {

        System.out.println("connected");

    }


}
