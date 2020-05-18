package com.mahdi20.creational.builder.example2;

public class Sony extends Company {

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }

}