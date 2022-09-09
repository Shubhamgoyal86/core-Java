package com.InnerClass;

 class outer6{
     public void m1(){

         class inner6 {
             public  void sum(int x,int y){
                 System.out.println("sum is equals to " + (x+y));
             }


         }
         inner6 i =  new inner6();
         i.sum(10,50);

         i.sum(10,60);

         i.sum(10,70);

     }

     public static void main(String[] args) {
         outer6 n = new outer6();
         n.m1();
     }
     }



