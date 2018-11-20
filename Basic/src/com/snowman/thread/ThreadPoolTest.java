package com.snowman.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            final int taskId = i;
            executors.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName() + " is execute task " + taskId + ", loop of " + j);
                    }
                }
            });
        }
        System.out.println("tasks have been committed!");
//        executors.shutdown();
        executors.shutdownNow();
    }

}
