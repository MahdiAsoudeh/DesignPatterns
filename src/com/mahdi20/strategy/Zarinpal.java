package com.mahdi20.strategy;

public class Zarinpal implements Getway {

    protected String info;

    @Override
    public void setInfo(String info) {

        this.info = info;

    }

    @Override
    public String pay() {

        return info;

    }
}
