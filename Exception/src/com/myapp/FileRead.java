package com.myapp;
// throw example
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {


    public void FileRead() throws IOException {
        FileReader filereader = new FileReader("c\\reader\\read.txt");
        BufferedReader bufferedreader=new BufferedReader(filereader);

       String st;
        while((st=bufferedreader.readLine())!=null)
        {
            System.out.println(st);
        }
        bufferedreader.close();

    }


}
