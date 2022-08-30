package com.Multithreading;

class MultiRunnable implements Runnable  {

    @Override
    public void run() {
        for (int i = 0; i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }



        System.out.println("Executed From Thread");

    }
}

public class threadCreationClass {
    public static void main(String[] args) throws InterruptedException {


        MultiRunnable multirunnable = new MultiRunnable();
        Thread t1 = new Thread(multirunnable);
        t1.start();

        t1.join();

        Thread t2 = new Thread(multirunnable);
        t2.start();


    }
}
