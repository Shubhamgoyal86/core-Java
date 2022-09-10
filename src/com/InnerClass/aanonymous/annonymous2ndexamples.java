package com.InnerClass.aanonymous;

public class annonymous2ndexamples {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                for (int i = 0 ; i<=10;i++){
                    System.out.println("children Thread");
                }
            }
        };
        t.start();
        for (int i=0;i<=10;i++){
            System.out.println("Main Thread");
        }
    }
}
