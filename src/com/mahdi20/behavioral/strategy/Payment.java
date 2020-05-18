package com.mahdi20.behavioral.strategy;

public class Payment {

    protected Getway getway;

    public void setGetway(Getway getway) {

        this.getway = getway;

    }

    public void addInfo(String info) {

        this.getway.setInfo(info);

    }

    public String pay() {

        return this.getway.pay();

    }

}
