package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("files.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo d  = (Demo)ois.readObject();
        System.out.println(d.b);
        System.out.println(d.a);
        ois.close();
        fis.close();
    }
}
class Book {

}
class  Student{

}
