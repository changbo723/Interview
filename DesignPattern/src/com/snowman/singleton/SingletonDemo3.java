package com.snowman.singleton;

/**
 * summary singleton pattern
 * double check lock (Thread Unsafe)
 * @author snowman
 * time 2018.07.03
 * description
   1 线程 1 进入 getInstance() 方法。

   2 由于 instance 为 null，线程 1 在 //1 处进入 synchronized 块。

   3 线程 1 被线程 2 预占。

   4 线程 2 进入 getInstance() 方法。

   5 由于 instance 仍旧为 null，线程 2 试图获取 //1 处的锁。然而，由于线程 1 持有该锁，线程 2 在 //1 处阻塞。

   6 线程 2 被线程 1 预占。

   7 线程 1 执行，由于在 //2 处实例仍旧为 null，线程 1 还创建一个 Singleton 对象并将其引用赋值给 instance。

   8 线程 1 退出 synchronized 块并从 getInstance() 方法返回实例。

   9 线程 1 被线程 2 预占。

   10 线程 2 获取 //1 处的锁并检查 instance 是否为 null。

   11 由于 instance 是非 null 的，并没有创建第二个 Singleton 对象，由线程 1 创建的对象被返回。
 */
public class SingletonDemo3 {

    private SingletonDemo3() {}

    private static SingletonDemo3 singletonDemo3 = null;

    public static SingletonDemo3 getInstance(){
        if(singletonDemo3 == null){
            synchronized (SingletonDemo3.class){
                if(singletonDemo3 == null){
                    singletonDemo3 = new SingletonDemo3();
                }
            }
        }
        return singletonDemo3;
    }

}
