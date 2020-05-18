package com.mahdi20.creational.factory.abstractFactory;

class ShipB implements Transport {

    @Override
    public void deliver(String place) {
        System.out.println("delivered to: " + place + " in ShipB");
    }

}