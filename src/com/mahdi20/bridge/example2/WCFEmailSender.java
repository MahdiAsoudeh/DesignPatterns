package com.mahdi20.bridge.example2;

public class WCFEmailSender implements IEmailSender {


    @Override
    public void SendEmail(String subject, String body) {
        System.out.println("Sending Email using WCFEmailSender");
    }
}