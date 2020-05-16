package com.mahdi20.factory.factoryMethod;

class RoadLogistic extends Logistic {

    public Transport createTransport() {
        return new Truck();
    }
}