package com.mahdi20.factory.abstractFactory;

class ShipB implements Transport {

    @Override
    public void deliver(String place) {
        System.out.println("delivered to: " + place + " in ShipB");
    }

}