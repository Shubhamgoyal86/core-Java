package com.InnerClass;

class outer4{
    int x = 4; //instance variable
    static int y= 78; // static variable n
    class inner4{
        public  void b1(){

            System.out.println(x);

            System.out.println(y);

        }
    }

    public static void main(String[] args) {
        new outer4().new inner4().b1();//shortcut methods
    }
}