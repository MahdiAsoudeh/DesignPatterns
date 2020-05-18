package com.mahdi20.structural.adapter;

interface IStatusUpdate {

    String getUserToken(String userData);

    void postUpdate(String token, String message);

}