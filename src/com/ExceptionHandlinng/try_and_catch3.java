package com.ExceptionHandlinng;

import java.util.Scanner;

public class try_and_catch3 {

    public static void main(String[] args) {
        float i = 10;
        Scanner sc = new Scanner(System.in);



        try {
            float j = sc.nextInt();


            float k = i / j;
            System.out.println(k);


}catch (Exception e) {
    System.out.println("write the correct numbers");
}
        finally {
            System.out.println("Finally bye");
        }


    }
}
