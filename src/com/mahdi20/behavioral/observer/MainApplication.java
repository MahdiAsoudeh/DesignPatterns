package com.mahdi20.behavioral.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

public class MainApplication implements Observer {

    private WeatherObservable weatherUpdate;

    @Override
    public void update(Observable observable, Object arg) {

        // get updated data
        weatherUpdate = (WeatherObservable) observable;
        System.out.println("The Weather is: " + weatherUpdate.getWeather() + " now");

    }

    public static void main(String[] args) {

        WeatherObservable observable = new WeatherObservable(null);
        MainApplication observer = new MainApplication();

        // register in weather observable
        observable.addObserver(observer);
        // set new data
        observable.setWeather("sunny");


        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                // set new data
                observable.setWeather("Rainy");

                // unregister in weather observable
                observable.deleteObserver(observer);

                System.out.println("timer is running...");

            }
        }, 5000, 5000);


    }


}
