package com.mahdi20.creational.prototype;

public class MainApplication {

    public static void main(String[] args) {

        int eid = 123;
        String ename = "mehdi";
        String edesignation = "software engineer";
        String eaddress = "Ardabil Iran";
        double esalary = 1;

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
        e1.showRecord();

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();

    }
}
