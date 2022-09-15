package com.Executor_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable aTask1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("My Task 1");
            }
        };
        Runnable aTask2= ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("My Task 2");

        };
        MynewTask atask3 = new MynewTask();
        executorService.submit(atask3);

        executorService.submit(aTask1);

        executorService.submit(aTask2);

        executorService.shutdown();
    }
}
