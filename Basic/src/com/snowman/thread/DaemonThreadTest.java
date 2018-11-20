package com.snowman.thread;

public class DaemonThreadTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new StopRunnerThread());
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("---------over");
    }

}


class StopRunnerThread implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(!Thread.currentThread().isInterrupted()){
            i++;
            if(i % 1000 == 0){
                System.out.println("i = " + i);
            }
        }
    }
}

