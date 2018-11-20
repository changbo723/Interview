package com.snowman.thread;

public class ThreadTest5 {


    private void init(){
        final Buiness buiness = new Buiness();
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    buiness.sub();
                }
            }
        }.start();

        for (int i = 1; i <= 50; i++) {
            buiness.main();
        }
    }


    public static void main(String[] args) {
        ThreadTest5 threadTest5 = new ThreadTest5();
        threadTest5.init();
    }

}

class Buiness{

    private boolean flag = true;

    public synchronized void sub(){
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("sub execute " + i);
        }
        flag = true;
        this.notify();
    }

    public synchronized void main(){
        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println("main execute " + i);
        }
        flag = false;
        this.notify();
    }

}

