package com.Multithreading;

class Displey{
    public  synchronized void displayn() {

        for (int i = 0;i<=10;i++){
            System.out.println(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }

    }
    public synchronized void displayc(){
        for (int i=50;i<=60;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }

    }

}
class Mythrad1 extends Thread{
    Displey d;
    Mythrad1(Displey d){
        this.d =d;
    }

    public void run(){
        d.displayn();
    }
}
class Mythrad2 extends Thread{
    Displey d;
    Mythrad2(Displey d){
        this.d = d;
    }
    public  void  run(){
        d.displayc();
    }
}


public class SynchroniztionDemoclass3 {
    public static void main(String[] args) {
        Displey d = new Displey();
        Mythrad1 t1 = new Mythrad1(d);
        Mythrad2 t2 = new Mythrad2(d);
        t1.start();
        t2.start();
    }
}
