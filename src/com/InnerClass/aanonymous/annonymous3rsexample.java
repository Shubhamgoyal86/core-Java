package com.InnerClass.aanonymous;

class A1{
    public void show(){
        System.out.println("in A show");
    }
}

public class annonymous3rsexample {
    public static void main(String[] args) {



        A1 a = new A1(){
            public void show(){
                System.out.println("In B show");

            }
        };
        a.show();

    }


}
