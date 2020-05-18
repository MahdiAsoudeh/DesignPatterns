package com.mahdi20.behavioral.nullObject;

class Client {

    public Request getRequest(String command) {

        if (command.equals("A"))
            return new ARequest();

        if (command.equals("B"))
            return new BRequest();

        if (command.equals("C"))
            return new CRequest();

        return new NullRequest();

    }

}