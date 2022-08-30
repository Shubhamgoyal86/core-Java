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
        B shubham = new B();
        shubham.sanju();
    }
}
