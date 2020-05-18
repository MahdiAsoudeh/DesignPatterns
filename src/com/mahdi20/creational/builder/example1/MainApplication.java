package com.mahdi20.creational.builder.example1;




public class MainApplication {

    public static void main(String[] args) {


        Task task = new TaskBuilder()
                .setDescription("Hello")
                .setSummary("Test").build();

        System.out.println(task);


    }
}
