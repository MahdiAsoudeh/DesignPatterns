package com.mahdi20.structural.bridge.example2;


/// The RefinedAbstraction class
public class UserEmail extends Email {

    @Override
    public void Send() {

        String emailSubject = String.format("Subject: {0} from User", Subject);
        String emailBody = String.format("Email Body:\n{0}", Body);
        MessageSender.SendEmail(emailSubject, emailBody);

    }

}