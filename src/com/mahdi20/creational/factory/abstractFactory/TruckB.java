package com.mahdi20.creational.factory.abstractFactory;

class TruckB implements Transport {

    @Override
    public void deliver(String place) {
        System.out.println("delivered to: " + place + " in TruckB");
    }

    public String someMethodB1() {
        return "someThing";
    }

    public String someMethodB2() {
        return "someThing";
    }

}