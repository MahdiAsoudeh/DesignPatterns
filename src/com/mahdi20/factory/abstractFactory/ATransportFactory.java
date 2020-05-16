package com.mahdi20.factory.abstractFactory;


abstract class ATransportFactory {

    abstract public Transport createRoadTransport();

    abstract public Transport createSeaTransport();

}