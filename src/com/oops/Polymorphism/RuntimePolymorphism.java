package com.oops.Polymorphism;

class A{
    public void find(){
        System.out.println("I am in Class A");
    }
}
class B extends A{
    public void find(){
        System.out.println("I am in Class B");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        B b = new B();
            b.find();
    }

}
