package com.FileHandling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FileHandling_Output {
    public static void main(String[] args) throws  Exception{
        Properties p = new Properties();
        InputStream is = new FileInputStream("kaju katli.txt");
        p.load(is);

        System.out.println(p.getProperty("class"));

        p.list(System.out);
    }
}
