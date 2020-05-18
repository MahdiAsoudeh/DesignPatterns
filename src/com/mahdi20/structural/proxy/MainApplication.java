package com.mahdi20.structural.proxy;

public class MainApplication {

    public static void main(String[] args) {

        Image image = new ProxyImage("mahdi.jpg");

        //image will be loaded from disk
        image.lazyDisplay();
        System.out.println("runned lazyDisplay first time");

        //image will not be loaded from disk
        image.lazyDisplay();
        System.out.println("runned lazyDisplay second time");


    }

}
