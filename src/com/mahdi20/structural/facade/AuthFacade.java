package com.mahdi20.structural.facade;


class AuthFacade {

    private Validate validate;
    private User user;
    private Auth auth;
    private Mail mail;


    public AuthFacade() {
    }

    public AuthFacade(Validate validate, User user, Auth auth, Mail mail) {
        this.validate = validate;
        this.user = user;
        this.auth = auth;
        this.mail = mail;
    }


    public void singUpUser(String name, String mail, String password) {

        Data data = new Data(name, mail, password);

        if (this.validate.isValid(data)) {
            this.user.create(data);
            this.auth.login(data);
            this.mail.to(data);
        }

    }

    public boolean singInUser(String mail, String password) {
        Data data = new Data("name", mail, password);
        return this.auth.login(data);
    }


}