package com.InnerClass;

class outer5{
    int x =10; // to print 10 in method we call outer5.this.x;
    class inner5{
        int x =100; // to print 100 in method we call this.x
        public void v1(){
            int x =1000;
            System.out.println(x);
            System.out.println(inner5.this.x);// or we can use  this.x
            System.out.println(outer5.this.x);
        }
    }

    public static void main(String[] args) {
        new outer5().new inner5().v1();
    }
}
