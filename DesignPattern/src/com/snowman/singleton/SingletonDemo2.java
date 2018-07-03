package com.snowman.singleton;

/**
 * summary singleton pattern
 * remark lazy (Thread Unsafe)
 * @author snowman
 * time 2018.07.03
 */
public class SingletonDemo2 {

    private SingletonDemo2(){}

    private static SingletonDemo2 singletonDemo2 = null;

    public static synchronized SingletonDemo2 getInstance(){
        if(singletonDemo2 == null){
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }

}
