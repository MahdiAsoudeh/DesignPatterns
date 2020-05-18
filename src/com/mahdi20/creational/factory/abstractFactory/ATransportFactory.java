package com.mahdi20.creational.factory.abstractFactory;


abstract class ATransportFactory {

    abstract public Transport createRoadTransport();

    abstract public Transport createSeaTransport();

}