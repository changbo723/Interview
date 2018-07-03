package com.snowman.singleton;

import java.io.Serializable;

/**
 * summary singleton pattern
 * remark lazy (Thread Unsafe)
 * @author snowman
 * time 2018.07.03
 */
public class SingletonDemo2 implements Serializable {

    private SingletonDemo2(){
        if(singletonDemo2 != null){
            throw new RuntimeException();
        }
    }

    private static SingletonDemo2 singletonDemo2 = null;

    public static synchronized SingletonDemo2 getInstance(){
        if(singletonDemo2 == null){
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }

//    private Object readResolve() throws ObjectStreamException{
//        return singletonDemo2;
//    }

}
