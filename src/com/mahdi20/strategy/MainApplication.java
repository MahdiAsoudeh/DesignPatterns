package com.mahdi20.strategy;

public class MainApplication {

    public static void main(String[] args) {


        Payment payment = new Payment();
        payment.setGetway(new Zarinpal());
        payment.addInfo("Alma 15000 toman");
        String pay = payment.pay();

        System.out.printf("pay: " + pay);


    }
}
