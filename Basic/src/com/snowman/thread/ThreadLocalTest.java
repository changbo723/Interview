package com.snowman.thread;

import java.util.Random;

public class ThreadLocalTest {

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int data = new Random().nextInt();
                    threadLocal.set(data);
                    System.out.println(Thread.currentThread().getName() + " has put data :" + data);
                    System.out.println(Thread.currentThread().getName() + " module A has get data :" + new A().get());
                    System.out.println(Thread.currentThread().getName() + " module B has get data :" + new B().get());
                }
            }).start();
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class A {
        public int get() {
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return threadLocal.get();
        }
    }

        static class B {
            public int get() {
                try {
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return threadLocal.get();
            }
        }
    }
