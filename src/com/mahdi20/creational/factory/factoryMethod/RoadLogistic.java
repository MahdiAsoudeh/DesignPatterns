package com.mahdi20.creational.factory.factoryMethod;

class RoadLogistic extends Logistic {

    public Transport createTransport() {
        return new Truck();
    }
}