package com.mahdi20.behavioral.nullObject;

class NullRequest implements Request {

    public void execute() {
        // log error
        System.out.println("request is null");
    }
}