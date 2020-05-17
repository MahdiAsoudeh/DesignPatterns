package com.mahdi20.bridge.example2;///


/// The RefinedAbstraction class
public class SystemEmail extends Email {


    @Override
    public void Send() {

        String emailSubject = String.format("Subject: {0} from System", Subject);
        String emailBody = String.format("Email Body:\n{0}", Body);
        MessageSender.SendEmail(emailSubject, emailBody);

    }
}
 