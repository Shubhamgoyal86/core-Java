package com.Multithreading;
class  ThreadA1{
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();//if we do here b.wait() than it throw an exception........
         System.out.println(b.total);

    }

}

class ThreadB extends Thread{
    int total= 0;
    public void run(){
        for (int i=0;i<=100;i++){
            total=total+i;
        }

    }
}

