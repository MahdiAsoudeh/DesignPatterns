package com.mahdi20.structural.facade;


public class MainApplication {

    public static void main(String[] args) {

        // use auth without complexity

        AuthFacade authFacade = new AuthFacade();

        // this is for signUp
        authFacade.singUpUser("mahdi", "asoodeh.dev@gmail.com", "12345678");

        // this is for signIn
        authFacade.singInUser("asoodeh.dev@gmail.com", "12345678");

    }

}
