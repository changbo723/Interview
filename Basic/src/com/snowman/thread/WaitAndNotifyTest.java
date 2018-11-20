package com.snowman.thread;

public class WaitAndNotifyTest {

    public static void main(String[] args) {
        Simaple simaple = new Simaple();

        Thread thread1 = new Thread(new IncreaseThread(simaple));
        Thread thread2 = new Thread(new DecreaseThread(simaple));
        Thread thread3 = new Thread(new IncreaseThread(simaple));
        Thread thread4 = new Thread(new DecreaseThread(simaple));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}

class IncreaseThread implements Runnable{

    private Simaple simaple;

    public IncreaseThread(Simaple simaple) {
        this.simaple = simaple;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            this.simaple.increase();
        }
    }
}

class DecreaseThread implements Runnable{

    private Simaple simaple;

    public DecreaseThread(Simaple simaple) {
        this.simaple = simaple;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            this.simaple.decrease();
        }
    }
}

class Simaple{

    private int num;

    public synchronized void increase(){
        while (num != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        num++;
        System.out.println("num = " + num);
        notifyAll();
    }

    public synchronized void decrease(){
        while (num == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("num = " + num);
        notifyAll();
    }

}
