package com.mahdi20.command;


public class MainApplication {

    public static void main(String[] args) {


        Message messageQueue = new Message();

        messageQueue.addMessage(new SendEmail("wlc", "hi mahdi welcome to my site", "asoodeh.dev@gmail.com"));
        messageQueue.addMessage(new SendSms("wlc", "hi mahdi welcome to my site", "0936ATA7111"));

        messageQueue.executeQueue();

    }

}
