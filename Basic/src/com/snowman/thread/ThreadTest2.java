package com.snowman.thread;

/**
 * Runable
 * @author snowman
 * time 2018.07.19
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Runnable thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}