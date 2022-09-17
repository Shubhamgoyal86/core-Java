package com.ExceptionHandlinng;

public class try_and_catch {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try {
            int a = 5 / 0;
        }    catch (Exception e){
            System.out.println("cannot divide by zero");;
        }


        System.out.println(6);
        System.out.println(5);
        System.out.println(7);


    }
}
