package com.snowman.singleton;

/**
 * summary singleton pattern
 * double check lock (Thread Unsafe)
 * @author snowman
 * time 2018.07.03
 * description
   外部类没有static属性，则不会像饿汗式那样立即加载对象
   只有真正调用getInstance方法，才会加载静态内部类。加载类时是线程安全的。instance是static final类型
   保证内存中只有一个实例存在，而且只能被赋值一次，从而保证了线程的安全性
 */
public class SingletonDemo4 {

    private SingletonDemo4(){}

    //静态内部类在外部类加载的时候不会被初始化
    private static class SingletonClassInstance{
        private static final SingletonDemo4 singletonDemo4 = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.singletonDemo4;
    }

}
