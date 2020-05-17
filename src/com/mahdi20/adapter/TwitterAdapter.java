package com.mahdi20.adapter;

class TwitterAdapter implements IStatusUpdate {

    protected Twitter twitter;


    public TwitterAdapter(Twitter twitter) {
        this.twitter = twitter;
    }


    public String getUserToken(String userData) {
        return this.twitter.checkUserToken(userData);
    }

    public void postUpdate(String token, String messagee) {
         this.twitter.setStatusUpdate(token, messagee);
    }
}