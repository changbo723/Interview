package com.snowman.thread;

public class SynchronizedTest {

    public static void main(String[] args) {
        Example example = new Example();
        Thread thread6 = new Thread(new Thread6(example));
        example = new Example();
        Thread thread7 = new Thread(new Thread7(example));

        thread6.start();
        thread7.start();
    }

}

class Example{

    public static synchronized void execute(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" hello " + i);
        }
    }

    public static synchronized void execute2(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" world " + i);
        }
    }

}

class Thread6 implements Runnable{

    private Example example;

    public Thread6(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        this.example.execute();
    }
}

class Thread7 implements Runnable{

    private Example example;

    public Thread7(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        this.example.execute2();
    }
}
