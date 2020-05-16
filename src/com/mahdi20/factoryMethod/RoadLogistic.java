package com.mahdi20.factoryMethod;

class RoadLogistic extends Logistic {

    public Transport createTransport() {
        return new Truck();
    }
}