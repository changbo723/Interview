package com.snowman.singleton;

/**
 * summary singleton pattern
 * remark double check safe
 * @author snowman
 * time 2018.07.25
 */
public class SingletonDemo7 {

    private volatile static SingletonDemo7 singletonDemo7;

    private SingletonDemo7() {
    }

    public static SingletonDemo7 getInstance(){
        if(singletonDemo7 == null){
            synchronized (SingletonDemo7.class){
                if(singletonDemo7 == null){
                    singletonDemo7 = new SingletonDemo7();
                }
            }
        }
        return singletonDemo7;
    }
}
