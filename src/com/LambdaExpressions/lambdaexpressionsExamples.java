package com.LambdaExpressions;
interface A{
      void show(String  name);
}
//class Xyz implements A{
//    public  void show(){
//        System.out.println("Hello World");
//    }
//
//}

public class lambdaexpressionsExamples {
    public static void main(String[] args) {
        A obj;
        obj = (name)->
        {
            System.out.println("Shubham Goyal "+"and " + name );
        };
        obj.show("Suryaverr");
    }
}

