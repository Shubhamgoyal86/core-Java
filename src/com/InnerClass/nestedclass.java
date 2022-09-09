package com.InnerClass;

class A1{
    class B1{
        class C1{
            public  void q1(){
                System.out.println("intermediate method from class");
            }
        }
    }

    public static void main(String[] args) {
        A1 a = new A1();
        A1.B1 b = a.new B1();
        A1.B1.C1 c = b.new C1();
        c.q1();
    }
}