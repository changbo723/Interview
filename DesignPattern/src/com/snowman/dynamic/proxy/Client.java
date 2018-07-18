package com.snowman.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * summary dynamic proxy
 * client
 * @author snowman
 * time 2018.07.18
 */
public class Client {

    public static void main(String[] args) {

        //create real subject
        Subject realSubject = new RealSubject();

        //将真实对象和代理对象进行关联
        InvocationHandler handler = new DynamicSubject(realSubject);

        Class<?> classType = handler.getClass();
        /**
         * 每个动态代理都包含一个与之关联的handler，用来建立关联
         * loader 创建具体实例的时候，由哪一个类装载器装载的
         * interface 代理到底要实现那些接口
         * handler 真实对象
         * newProxyInstance方法用于返回代理类的一个实例，返回后的代理类可以当做被代理类使用
         * 可以使用被代理类在subject接口中声明的方法
         * 通过这种方式，被代理的对象可以在运行时动态改变，需要控制的接口可以在运行时改变
         */
        Subject subject = (Subject) Proxy.newProxyInstance(classType.getClassLoader(),
                realSubject.getClass().getInterfaces(),handler);
        subject.request();
        System.out.println(subject.getClass());
    }

}
