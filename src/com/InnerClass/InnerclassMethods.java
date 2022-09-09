package com.InnerClass;

class  outer {
    class inner {
        public void m1() {
            System.out.println("inner class Object");
        }
    }

    public static void main(String[] args) {


        outer o = new outer();
        outer.inner i = o.new inner();// we can use it by shortcut
        // outer.inner i = new outer().newinner();
        i.m1();

    }
}
