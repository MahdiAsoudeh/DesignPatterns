package com.mahdi20.behavioral.command;

class SendEmail implements IMessageSender {


    protected String title;
    protected String message;
    protected String emailAdress;


    public SendEmail(String title, String message, String emailAdress) {
        this.title = title;
        this.message = message;
        this.emailAdress = emailAdress;
    }

    public boolean sendMessage() {
//      $status = Mail::send();
//        return $status;
        return true;
    }
}