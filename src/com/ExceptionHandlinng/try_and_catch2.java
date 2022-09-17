package com.ExceptionHandlinng;

public class try_and_catch2 {
    public static void main(String[] args) {
        int a[] = new int[4];

        try {
            for (int c = 0; c <=4; c++) {
                a[c] = c + 1;
            }
            for (int value : a) {
                System.out.println(value);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Remove the = sign in the for loop");
            System.out.println();
        }
    }
}
