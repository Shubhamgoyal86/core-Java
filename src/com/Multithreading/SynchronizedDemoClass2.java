package com.Multithreading;


 class  dispose {

     // without static synchronized we get irregular output because in this case we will have 2 objects so syncgghroniztion is not
     //requiring
     public void desire (String Name) {


         synchronized (dispose.class){
         for (int i = 0; i <= 10; i++) {
             System.out.print("Good Morning : ");


             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
             }
             System.out.println(Name);
         }
         }
     }

}

class  Mythread2 extends Thread{
     dispose d ;
     String Name;
     Mythread2(dispose d ,String Name){
         this.d =d ;
         this.Name= Name;
     }
     public void run(){
         d.desire(Name);
     }
}

class Synchronizeddemoclass2{
    public static void main(String[] args) {
        dispose d1 = new dispose();
        dispose d2 = new dispose();
        Mythread2 t1 = new Mythread2(d1,"Dhoni");
        Mythread2 t2 = new Mythread2(d2,"Yuvi");
        t1.start();
        t2.start();
    }
}