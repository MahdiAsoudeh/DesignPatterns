package com.mahdi20.adapter;

class Facebook implements IStatusUpdate {

    public String getUserToken(String userData) {
        return "token";
    }

    public void postUpdate(String token, String message) {
        System.out.println("sent post from facebook");
    }
}