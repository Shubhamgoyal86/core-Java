package com.oops.Polymorphism;
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a , int b, int c){
        return  a+b+c;
    }

}

public class CompilrtimePolymorphicsm {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
       int res= calc.add(4,45,45);
        System.out.println(res);
    }
}
