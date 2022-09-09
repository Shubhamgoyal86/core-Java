package com.oops.Inheritence;

import java.util.Scanner;

class A{

    }


class  B extends A{

    int a =45;
    void  test(){
        System.out.println(a);

    }

        }

public class intheritence {
    public static void main(String[] args) {
         B b = new B();
         b.test();
        System.out.println(b.a);

        b.a = 69;
        System.out.println(b.a);

    }
}
