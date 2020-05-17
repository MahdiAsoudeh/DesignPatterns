package com.mahdi20.bridge.example2;///


/// The Abstraction class
public abstract class Email {

    public IEmailSender MessageSender;
    public String Subject;
    public String Body;

    public abstract void Send();


    public IEmailSender getMessageSender() {
        return MessageSender;
    }

    public void setMessageSender(IEmailSender messageSender) {
        MessageSender = messageSender;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }
}