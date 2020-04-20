package com.mahdi20.decorator;

class AirBag extends CarFeature {

    public AirBag(Car car) {

        super(car);

    }

    public int cost() {

        return this.car.cost() + 5;

    }

    public String description() {

        return this.car.description() + "-AirBag";

    }
}