package com.mahdi20.adapter;


public class MainApplication {

    public static void main(String[] args) {


        /// for example this is for Europe users
        IStatusUpdate fb = new Facebook();
        String tokenFb = fb.getUserToken("mahdi json");
        fb.postUpdate(tokenFb, "hiiiii");


        // for example this is for Asia users :)
        IStatusUpdate tw = new TwitterAdapter(new Twitter());
        String tokenTw = tw.getUserToken("haj mahdi");
        tw.postUpdate(tokenTw, "salaaaaaam");


    }

}
