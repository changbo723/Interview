package com.snowman.thread;

/**
 * Thread
 * @author snowman
 * time 2018.07.19
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}
