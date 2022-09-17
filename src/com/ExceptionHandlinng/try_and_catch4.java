package com.ExceptionHandlinng;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class B{
    public void b() throws FileNotFoundException {
        FileOutputStream f = new FileOutputStream("test.ser");
    }

}
class A{
    public void a() throws FileNotFoundException {
        B b = new B();
        b.b();
    }

}
public class try_and_catch4 {
    public static void main(String[] args)  {
        A a  =new A();
        try {
            a.a();
        } catch (FileNotFoundException e) {

        }
        finally {
            System.err.println("got it");
        }
    }
}
