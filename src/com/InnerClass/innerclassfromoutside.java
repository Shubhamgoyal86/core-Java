package com.InnerClass;

class outer2{
    class inner3{
        public void a1(){
            System.out.println("inner class ");
        }


    }
}
class test{
    public static void main(String[] args) {
        outer2 o = new outer2();
        outer2.inner3 i = o.new inner3();
        i.a1();
        //shortcut method
//        new outer2().new inner2().m1();
    }
}