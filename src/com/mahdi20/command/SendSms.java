package com.mahdi20.command;

class SendSms implements IMessageSender {

    protected String title;
    protected String message;
    protected String phoneNumber;


    public SendSms(String title, String message, String phoneNumber) {
        this.title = title;
        this.message = message;
        this.phoneNumber = phoneNumber;
    }


    public boolean sendMessage() {
//      $status = api send sms
//        return $status;
        return true;
    }
}