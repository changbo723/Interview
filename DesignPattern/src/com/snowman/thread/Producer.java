package com.snowman.thread;

/**
 * summary producer and consumer
 * Producer
 * @author snowman
 * time 2018.07.20
 */
public class Producer implements Runnable {

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("create product --------");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Product product = new Product("product " + i);
            clerk.receivePoroduct(product);
        }

    }
}
