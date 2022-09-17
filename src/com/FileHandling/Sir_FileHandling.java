package com.FileHandling;

import java.io.*;

public class Sir_FileHandling {
    public static void main(String[] args) throws Exception {
        File file = new File("C://softwares//file Handling//shubham.txt");
        if ((file.createNewFile())){
            System.out.println("File Successfully created");

        }else {
            System.out.println("File is Already Existed");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("Shubham goyal is the best name of the world");
        writer.close();



    }
}
