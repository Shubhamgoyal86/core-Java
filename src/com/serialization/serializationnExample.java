package com.serialization;

import java.io.*;

class Demo implements Serializable{
    public int a;
    public  String b;
    public Demo(int a, String b ){
        this.a = a ;
        this.b = b;
    }
}
public class serializationnExample {

    public static void main(String[] args) throws IOException {
        Demo d = new Demo(23,"Shubham");
        FileOutputStream fout = new FileOutputStream("files.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);

        oos.writeObject(d);
        oos.close();
        fout.close();


    }
}
