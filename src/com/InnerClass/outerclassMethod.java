package com.InnerClass;


class outer1 {
    class inner1 {
        public void s1() {
            System.out.println("from inner class");
        }


    }

    public void s2() {
        inner1 i = new inner1();
        i.s1();
        System.out.println("from outer class");
    }

    public static void main(String[] args) {


        outer1 o = new outer1();
        o.s2();

    }
}
