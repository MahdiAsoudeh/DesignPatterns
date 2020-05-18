package com.mahdi20.structural.facade;

class Mail {

    public String to(Data data) {
        data.getMail();
        return "emailAddress";
    }

    public String subject(String subject) {
        return "subject";
    }

    public boolean send() {
        System.out.println("sent mail is success!");
        return true;
    }
}