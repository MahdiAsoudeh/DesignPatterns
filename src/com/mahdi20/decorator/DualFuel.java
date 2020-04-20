package com.mahdi20.decorator;

class DualFuel extends CarFeature {

    public DualFuel(Car car) {
        super(car);
    }

    public int cost() {

        return this.car.cost() + 3;

    }

    public String description() {

        return this.car.description() + "-DualFuel";

    }
}