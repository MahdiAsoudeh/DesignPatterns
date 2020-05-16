package com.mahdi20.factory.factoryMethod;

class SeaLogistic extends Logistic {

    public Transport createTransport() {
        return new Ship();
    }
}