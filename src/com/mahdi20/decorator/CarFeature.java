package com.mahdi20.decorator;

abstract class CarFeature implements Car {

    protected Car car;

    public CarFeature(Car car) {

        this.car = car;

    }

    abstract public int cost();

    abstract public String description();


}