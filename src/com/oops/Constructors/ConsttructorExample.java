package com.oops.Constructors;
class Friends{


    String name2;
    String name;
    public Friends(String s,String d){
        this.name=s;
        this.name2=d;

    }

}


public class ConsttructorExample {

    public static void main(String[] args) {


      Friends ss = new Friends("Shubham","SUrya");
        System.out.println(ss.name);
    }
}
