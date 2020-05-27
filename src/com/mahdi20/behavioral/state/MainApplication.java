package com.mahdi20.behavioral.state;

import java.util.Random;

public class MainApplication {

    public static void main(String[] args) {


        Context context = new Context();
        context.State = new NormalState();

        Random r = new Random(37);

        for (int i = 5; i <= 25; i++) {
            int command = r.nextInt(3);
            System.out.print(context.Request(command) + " ");
        }

    }


}
