package com.snowman.thread;

public class ThreadTest3 {
    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        thread3.start();
        thread4.start();
        System.out.println(thread3.getName() + ";" + thread4.getName());
    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}

class Thread4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("j = " + i);
        }
    }
}
