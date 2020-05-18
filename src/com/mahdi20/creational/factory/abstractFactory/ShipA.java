package com.mahdi20.creational.factory.abstractFactory;

class ShipA implements Transport {

    @Override
    public void deliver(String place) {
        System.out.println("delivered to: " + place + " in ShipA");
    }

}