package com.mahdi20.factory.abstractFactory;

class TransportFactoryA extends ATransportFactory {

    @Override
    public Transport createRoadTransport() {
        System.out.println("created Road Transport in TransportFactoryA");
        return new TruckA();
    }

    @Override
    public Transport createSeaTransport() {
        System.out.println("created Sea Transport in TransportFactoryA");
        return new ShipA();
    }

}