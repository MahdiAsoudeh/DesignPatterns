package com.mahdi20.structural.composite;


public class MainApplication {

    public static void main(String[] args) {


        // raees
        Employee CEO = new Employee("mehdi", "CEO", 30000);

        // dev
        Employee headSales = new Employee("naser", "Developer", 20000);

        // tabligh
        Employee headMarketing = new Employee("reza", "Marketing", 20000);
        Employee clerk1 = new Employee("sasi", "Marketing", 10000);
        Employee clerk2 = new Employee("iman khan", "Marketing", 10000);

        // forosh
        Employee salesExecutive1 = new Employee("zahra", "Sales", 10000);
        Employee salesExecutive2 = new Employee("elnaz", "Sales", 10000);

        // add in list
        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {

            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }


    }

}
