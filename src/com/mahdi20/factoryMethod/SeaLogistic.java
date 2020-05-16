package com.mahdi20.factoryMethod;

class SeaLogistic extends Logistic {

    public Transport createTransport() {
        return new Ship();
    }
}