package com.myapp;

import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class Student {
    public void printer() {
try {


    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Numbers");
    int num = Integer.parseInt(scan.nextLine());

    int average=num/0;

}
catch(ArithmeticException ee) {

    System.out.println(ee.toString());
}

    }

}
