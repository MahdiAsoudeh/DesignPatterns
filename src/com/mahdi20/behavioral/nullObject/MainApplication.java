package com.mahdi20.behavioral.nullObject;


public class MainApplication {

    public static void main(String[] args) {

        Client client = new Client();
        Request request = client.getRequest("D");
        request.execute();


    }

}
