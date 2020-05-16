package com.mahdi20.factoryMethod;

abstract class Logistic {

    abstract public Transport createTransport();

    public Transport planDelivery(String place) {
        Transport transport = createTransport();
        transport.deliver(place);
        return transport;
    }

}