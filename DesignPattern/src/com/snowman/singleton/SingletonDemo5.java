package com.snowman.singleton;

/**
 * summary singleton pattern
 * double check lock (Thread Unsafe)
 * @author snowman
 * time 2018.07.03
 * description
   枚举天生就是单例
 */
public enum SingletonDemo5 {

    INSTANCE;

    public SingletonDemo5 singletonOperation(){
        return INSTANCE;
    }

}
