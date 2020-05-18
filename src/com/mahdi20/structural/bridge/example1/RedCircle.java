package com.mahdi20.structural.bridge.example1;

public class RedCircle implements DrawAPI {
    
    @Override
    public void drawCircle(int radius, int x, int y) {

        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");

    }


}