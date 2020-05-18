package com.mahdi20.structural.bridge;


import com.mahdi20.structural.bridge.example2.*;

public class MainApplication {

    public static void main(String[] args) {

        // test example from 1
//        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
//        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
//        redCircle.draw();
//        greenCircle.draw();


        // test example from 2
        //
        IEmailSender IEmailSenderwebService = new WebServiceEmailSender();
        IEmailSender IEmailSenderwcf = new WCFEmailSender();
        IEmailSender IEmailSenderwebApi = new WebAPIEmailSender();


        //System Email
        Email email = new SystemEmail();
        email.Subject = "Test Message";
        email.Body = "Hi there, This is a Test Message from System";
        email.MessageSender = IEmailSenderwebService;
        email.Send();

        email.MessageSender = IEmailSenderwcf;
        email.Send();

        email.MessageSender = IEmailSenderwebApi;
        email.Send();


        //User Email
        email = new UserEmail();
        email.Subject = "Test Message";
        email.Body = "Hi there, This is a Test Message from Prakash";
        email.MessageSender = IEmailSenderwebApi;
        email.Send();

    }

}
