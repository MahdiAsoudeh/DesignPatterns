package com.mahdi20.decorator;


public class MainApplication {


    public static void main(String[] args) {

        Car car = new Pride();
        car = new DualFuel(car);
        car = new AirBag(car);

        System.out.println("Total Cost: " + car.cost() + " MT");
        System.out.println("Descriptions: " + car.description());


    }
}
