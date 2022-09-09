package com.oops.Abstraction;

abstract class customer{
    abstract  void bill();
}

class shubham extends customer{
    void bill() {
        System.out.println("bill is of 2000");
    }
}
class chintu extends customer{
    void bill(){
        System.out.println("bill is of 3000rs");
    }
}






public class AbstractionExample {

    public static void main(String[] args) {
        customer c= new chintu();
        customer d= new shubham();
        c.bill();
        d.bill();
    }
}
