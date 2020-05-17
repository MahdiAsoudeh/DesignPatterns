package com.mahdi20.bridge.example2;


/// The ConcreteImplementor class
public class WebServiceEmailSender implements IEmailSender {

    @Override
    public void SendEmail(String subject, String body) {
        System.out.println("Sending Email using WebServiceEmailSender");
    }

}