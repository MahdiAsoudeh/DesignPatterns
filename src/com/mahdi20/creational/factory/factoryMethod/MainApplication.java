package com.mahdi20.creational.factory.factoryMethod;

public class MainApplication {

    public static void main(String[] args) {

        RoadLogistic road = new RoadLogistic();
        SeaLogistic sea = new SeaLogistic();

        // transport 1
        Transport truck1 = road.planDelivery("Tehran");
        // transport 2
        Transport truck2 = road.planDelivery("Ardebil");

        // transport 3 // this is manual delivery
        Transport truck3 = road.createTransport();
        truck3.deliver("Fars");

        // transport 4
        Transport ship1 = sea.planDelivery("America");
        // transport 5
        Transport ship2 = sea.planDelivery("China");

    }

}
