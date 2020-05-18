package com.mahdi20.creational.factory.factoryMethod;

class SeaLogistic extends Logistic {

    public Transport createTransport() {
        return new Ship();
    }
}