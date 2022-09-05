package com.Multithreading;

public class wait_And_notify {
    public static void main(String[] args) throws InterruptedException {
        ThreadC c = new ThreadC();
        c.start();
        synchronized (c)
        {
            System.out.println("Main thread calling Wait()");
            c.wait();
            System.out.println("Main Thread got notification call");
            System.out.println(c.total);

        }
    }
}

class ThreadC extends  Thread{
    int total=0;
    public void run(){

            synchronized (this){
                System.out.println("Child thread start calculations");

                for (int i = 0 ; i<= 100; i++) {
                    total = total+i;
                }
                System.out.println("child giving nnotification call");
                this.notify();
            }
        }
    }
