package com.mahdi20.creational.factory.abstractFactory;


public class MainApplication {

    public static void main(String[] args) {

        // abstract factory daghighan mese factory method ast faghat ba shey haye bishtar // tanavvo :)

        TransportFactoryA transportA = new TransportFactoryA();
        TransportFactoryB transportB = new TransportFactoryB();

        // transport 1
        Transport truck1 = transportA.createRoadTransport();
        truck1.deliver("Tehran");


        // transport 2
        Transport truck2 = transportA.createRoadTransport();
        truck2.deliver("Ardebil");


        // transport 3
        Transport ship1 = transportB.createSeaTransport();
        ship1.deliver("America");


    }

}
