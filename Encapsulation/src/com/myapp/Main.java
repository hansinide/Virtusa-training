package com.myapp;

public class Main {

    public static void main(String[] args) {

        //Students class
        Students student1=new Students();
        student1.setName("Kasun");
        student1.setAddress("Colonbo-4");

        //Age can be accessed
        student1.age=29;
        // Address cannot be accessed
        //student1.address="Colombo";
        //Finally Printing values from the encapsulated class
        student1.getPrint();

        System.out.println("------------------------------------------");
        //Staff class
        Staff staff1=new Staff();
        staff1.name="Ruwan";
        staff1.address="Colonbo-6";
        staff1.age=34;
        staff1.getPrint();
        staff1.setBankAccount("192888384D",20000);
        staff1.getOuterBankPrint();


        System.out.println("------------------------------------------");
        //Lecturer class
        Lecturers lecturer1=new Lecturers();
        lecturer1.name="Chamara";
        lecturer1.address="Colonbo-10";
        lecturer1.age=35;
        lecturer1.getPrint();
        lecturer1.setBankAccount("344556667E",4000);
        lecturer1.getOuterBankPrint();



    }
}
