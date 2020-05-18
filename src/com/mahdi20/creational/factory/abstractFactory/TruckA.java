package com.mahdi20.creational.factory.abstractFactory;

class TruckA implements Transport {

    @Override
    public void deliver(String place) {
        System.out.println("delivered to: " + place + " in TruckA");

    }

    public String someMethodA1() {
        return "someThing";
    }

    public String someMethodA2() {
        return "someThing";
    }


}