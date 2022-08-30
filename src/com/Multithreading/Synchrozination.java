package com.Multithreading;

class Table{
    void printtable(int n ){
        for (int i =1; i<=10;i++){
            System.out.println(n*i);
        }
    }


}

class  MultiRunnable1  implements Runnable{

    Table table;

    public MultiRunnable1(Table table){
        this.table=table;

    }



    @Override
    public void run() {
        table.printtable(6);

    }
}

public class Synchrozination {

    public static void main(String[] args) {

        Table table = new Table();
        table.printtable(8);

        MultiRunnable1 runnable1 = new MultiRunnable1(table);
        Thread t1 = new Thread(runnable1);
        t1.start();

    }
}
