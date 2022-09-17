package com.ExceptionHandlinng;

import java.util.Scanner;

public class try_and_catch5 {
    public static void main(String[] args) throws Exception{
        int i = 5;
        try {


            Scanner sc = new Scanner(System.in);
            int j = sc.nextInt();


            int k = i + j;
            if (k < 10) {
                throw new ArithmeticException();
            }
            System.out.println(k);
        }catch (ArithmeticException e){
            System.out.println("value of k   is less than 10");
        }

    }
}
