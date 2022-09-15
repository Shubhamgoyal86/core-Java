package com.Executor_Framework;

public class MynewTask implements  Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My Task 3");
    }
}
