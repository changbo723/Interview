package com.snowman.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * summary dynamic proxy
 * proxy object
 * @author snowman
 * time 2018.07.18
 */
public class DynamicSubject implements InvocationHandler {


    /**
     * 每一个代理的实例都有一个与之关联的handler
     * 该代理类内部属性是object类型，实际使用的时候通过该类的构造方法传递进来一个对象
     * 此外，该类还实现了invoke方法，该方法中的method.invoke其实就是被调用代理对象将要执行的方法
     * 方法参数是object，通过代理类，我们可以在执行真实对象的方法前后，加入自己的一些额外方法
     */

    private Object object;

    public DynamicSubject(Object object) {
        this.object = object;
    }

    /**
     *
     * @param proxy 代理的哪一个对象
     * @param method 代理实例的那个方法
     * @param args 代理实例对应的方法所对应的参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling " + method);
        //real call method
        method.invoke(object,args);
        System.out.println("after calling " + method);
        return null;
    }
}
