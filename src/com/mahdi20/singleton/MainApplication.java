package com.mahdi20.singleton;

public class MainApplication {

    public static void main(String[] args) {

        // use from singleton class
        DBConnector.getInstance().connect();

        DBConnector.getInstance().connect();

    }
}
