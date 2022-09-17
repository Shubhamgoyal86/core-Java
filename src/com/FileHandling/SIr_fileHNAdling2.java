package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SIr_fileHNAdling2 {
    public static void main(String[] args) throws IOException {
        String data = "Hello world From FileOutput Stream";
        FileOutputStream fos = new FileOutputStream("C://softwares//file Handling//shubham.txt");

        fos.write(data.getBytes());
        fos.close();
    }
}
