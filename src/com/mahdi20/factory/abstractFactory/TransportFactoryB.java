package com.mahdi20.factory.abstractFactory;

class TransportFactoryB extends ATransportFactory {

    @Override
    public Transport createRoadTransport() {
        System.out.println("created Road Transport in TransportFactoryB");
        return new TruckB();
    }

    @Override
    public Transport createSeaTransport() {
        System.out.println("created Sea Transport in TransportFactoryB");
        return new ShipB();
    }

}