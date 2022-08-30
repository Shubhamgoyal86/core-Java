package com.Multithreading;

class Display {

    public  void wish(String Name) {

        for (int i = 0 ; i<=10;i++){
            System.out.print("good morning : ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(Name);


        }

    }
}

class Mythread extends Thread{
    Display d;
    String Name;
    Mythread (Display d,String Name){
        this.d =d;
        this.Name=Name;
    }
    public  void  run(){
        d.wish(Name);
    }
}

class  SynchrozinationDemo{
    public static void main(String[] args) {
        Display d = new Display();
        Mythread t1= new Mythread(d,"Dhoni");
        t1.start();
    }
}