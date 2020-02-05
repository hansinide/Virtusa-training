package com.myapp;

public class Students {

    private String name;
    private String address;
    public int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




    public void getPrint() {
        System.out.println("Your Name is\t"+name+"\nYour Address is\t"+address+"\nYour Age is\t"+age);

    }





}
