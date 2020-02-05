package com.myapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lecturer {

    public void bookRead() throws MyException {
        try {
            FileReader filereader = new FileReader("c\\reader\\read.txt");
            BufferedReader bufferedreader = new BufferedReader(filereader);

            String st;
            while ((st = bufferedreader.readLine()) != null) {
                System.out.println(st);
            }
            bufferedreader.close();

            }
        catch(IOException ee) {
            throw new MyException("File not Found");
        }
    }

    static class MyException extends Exception {

        public MyException(String msg) {
            super(msg);
        }
    }

}
