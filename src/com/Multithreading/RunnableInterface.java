package com.Multithreading;
class a {
    void test(){
        System.out.println("Shubham is the best");
    }
}
class B {
    void sanju(){
        System.out.println("shubham");
    }
}

public class RunnableInterface {

    public static void main(String[] args) {
        B b = new B();
        b.sanju();
        a A = new a();
        A.test();
    }
}
