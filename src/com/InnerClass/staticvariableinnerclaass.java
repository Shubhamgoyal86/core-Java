package com.InnerClass;

class test2 {
    int x =56;
   static int y=44;

    public    void m1(){/// if we declare static void than instantaneous  value will accept.......
       final int z = 45;
        class inner{

            public void m2(){
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);

            }
        }
        inner i = new inner();
        i.m2();

    }

    public static void main(String[] args) {


        test2 t = new test2();
        t.m1();
    }
}
