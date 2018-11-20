package com.snowman.thread;

/**
 * summary producer and consumer
 * Consumer
 * @author snowman
 * time 2018.07.20
 */
public class Consumer implements Runnable{

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("use product --------");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.buyProduct();
        }
    }
}
