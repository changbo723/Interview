package com.snowman.thread;

public class ThreadTest4 {

    public static void main(String[] args) {
        Runnable thread5 = new Thread5();

        Thread thread1 = new Thread(thread5);
        Thread thread2 = new Thread(thread5);

        thread1.start();
        thread2.start();
    }

}

class Thread5 implements Runnable{

    private int i;

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("i = " + (i++));
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i == 50){
                break;
            }
        }
    }
}
