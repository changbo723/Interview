package com.snowman.singleton;

/**
 * summary singleton pattern
 * remark hungry
 * @author snowman
 * time 2018.07.03
 */
public class SingletonDemo1 {

    private SingletonDemo1(){}

    private static final SingletonDemo1 singletonDemo1 = new SingletonDemo1();

    public static SingletonDemo1 getInstance(){
        return singletonDemo1;
    }

}
