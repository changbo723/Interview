package com.snowman.thread;

/**
 * summary producer and consumer
 * client
 * @author snowman
 * time 2018.07.20
 */
public class Client {

    public static void main(String[] args) {

        Clerk clerk = new Clerk();

        Thread thread1 = new Thread(new Producer(clerk));
        Thread thread2 = new Thread(new Consumer(clerk));

        thread1.start();
        thread2.start();

    }

}
