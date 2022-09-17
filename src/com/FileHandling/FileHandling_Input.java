package com.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileHandling_Input {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("kaju katli.txt");
        p.setProperty("class" ,"kg");
        p.setProperty("School Name" ,"Nagnechyan academy");
        p.setProperty("Mother's Name " ,"Suman Chouhan");
        p.setProperty("Fathers Name" ,"Sunil ji Chouhan");
        p.store(os,null);


    }
}
