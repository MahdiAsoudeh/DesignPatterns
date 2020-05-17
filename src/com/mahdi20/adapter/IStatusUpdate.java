package com.mahdi20.adapter;

interface IStatusUpdate {

    String getUserToken(String userData);

    void postUpdate(String token, String message);

}