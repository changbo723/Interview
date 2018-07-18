package com.snowman.silent.proxy;

/**
 * summary dynamic proxy
 * real object
 * @author snowman
 * time 2018.07.18
 */
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("do someting");
    }
}
